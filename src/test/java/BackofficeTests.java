import BackofficeGenerator.model.BrandListItem;
import BackofficeGenerator.model.BrandListItemListApiResult;
import BackofficeGenerator.model.LicenseListItemListApiResult;
import com.github.viclovsky.swagger.coverage.SwaggerCoverageRestAssured;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.TestCase;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackofficeTests {
    private Map<String, String> cookies;

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://sb2admin-altenar2-stage.biahosted.com";
        Response response = given()
                .param("username", ConfigReader.getUsername())
                .param("password", ConfigReader.getPassword())
                .when()
                .post("/Account/Login")
                .then()
                .extract().response();

        cookies = response.getCookies();
    }
    @Test
    public void UserPermissionsTest() {
        String requestBody = "{ \"LicensesIds\": [] }";
        Response response = given()
                .filter(new SwaggerCoverageRestAssured())
                .contentType("application/json")
                .body(requestBody)
                .cookies(cookies)
                .when()
                .post("/Api/HighlightsManager/GetBrands")
                .then()
                .statusCode(200)
                .extract().response();

        Gson gson = new Gson();
        String jsonResponse = response.getBody().asString();
        BrandListItemListApiResult brandListItemListApiResult = gson.fromJson(jsonResponse, BrandListItemListApiResult.class);

        assertNotNull(brandListItemListApiResult.getData());
        TestCase.assertTrue(brandListItemListApiResult.getData() instanceof List);

        List<BrandListItem> data = brandListItemListApiResult.getData();
        for (BrandListItem datum : data) {
            assertTrue(datum.getBrandId() != null && datum.getName() != null && datum.getLicenseId() != null);
        }
    }

    @Test
    public void getLicensesTest(){
        Response response = given()
                .filter(new SwaggerCoverageRestAssured())
                .cookies(cookies)
                .when()
                .get("/Api/HighlightsManager/GetLicenses")
                .then()
                .assertThat().statusCode(200)
                .contentType("application/json")
                .extract().response();

        Gson gson = new Gson();
        String jsonResponse = response.getBody().asString();
        LicenseListItemListApiResult licenseListItemListApiResult = gson.fromJson(jsonResponse, LicenseListItemListApiResult.class);

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(licenseListItemListApiResult.getData()).as("Data is not null").isNotNull();
        softAssertions.assertThat(licenseListItemListApiResult.getSuccess()).as("Success is true").isTrue();
        softAssertions.assertThat(licenseListItemListApiResult.getError()).as("Error is null").isNull();

        softAssertions.assertAll();
    }

    @Test
    public void testUpdateConfig() {
        RestAssured.baseURI = "https://sb2admin-altenar2-stage.biahosted.com";
        String requestBody = "{" +
                "\"configId\": 126," +
                "\"highlightsEvents\": [{" +
                "\"EventId\": 7599441," +
                "\"Order\": 1," +
                "\"IsPromo\": false," +
                "\"IsSafe\": false" +
                "}]," +
                "\"languageTabs\": [" +
                "{\"languageId\": 2,\"highlightsEvents\": []}," +
                "{\"languageId\": 69,\"highlightsEvents\": []}," +
                "{\"languageId\": 75,\"highlightsEvents\": []}" +
                "]," +
                "\"sports\": [" +
                "{\"SportId\": 67,\"Name\": \"Basketball\",\"Count\": 30," +
                "\"Categories\": [{" +
                "\"CategoryId\": 556,\"Name\": \"Argentina\"," +
                "\"Champs\": [{" +
                "\"ChampId\": 3756,\"Name\": \"Liga Argentina\"" +
                "}]" +
                "}]," +
                "\"IsEnabled\": true,\"Order\": 1" +
                "}," +
                "{\"SportId\": 66,\"Name\": \"Soccer\",\"Count\": 62,\"Categories\": []," +
                "\"IsEnabled\": true,\"Order\": 2" +
                "}," +
                "{\"SportId\": 92,\"Name\": \"Alpine Skiing\",\"Count\": 0,\"Categories\": []," +
                "\"IsEnabled\": true,\"Order\": 3" +
                "}," +
                "{\"SportId\": 165,\"Name\": \"#KTOdds\",\"Count\": 0,\"Categories\": []," +
                "\"IsEnabled\": true,\"Order\": 4" +
                "}," +
                "{\"SportId\": 75,\"Name\": \"American Football\",\"Count\": 0,\"Categories\": []," +
                "\"IsEnabled\": true,\"Order\": 5" +
                "}" +
                "]" +
                "}";
        given()
                .filter(new SwaggerCoverageRestAssured())
                .contentType(ContentType.JSON)
                .cookies(cookies)
                .body(requestBody)
                .when()
                .post("/Api/HighlightsManager/UpdateConfig")
                .then()
                .statusCode(200)
                .body("Success", equalTo(true))
                .body("Error", nullValue());
    }
}
