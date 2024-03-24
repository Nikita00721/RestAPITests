import BrandsData.Brands;
import BrandsData.Datum;
import LicenseData.License;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
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
                .contentType("application/json")
                .body(requestBody)
                .cookies(cookies)
                .when()
                .post("/Api/HighlightsManager/GetBrands")
                .then()
                .statusCode(200)
                .extract().response();

        Brands brands = response.as(Brands.class);
        assertTrue(brands.getData() != null && !brands.getData().isEmpty()); // Что вообще содержит данные
        List<Datum> data = brands.getData();
        for (Datum datum : data) {
            assertTrue(datum.getBrandId() != null && datum.getName() != null && datum.getLicenseId() != null); // Что бренды есть в ответе
        }
    }

    @Test
    public void getLicensesTest(){
        Response response = given()
                .cookies(cookies)
                .when()
                .get("/Api/HighlightsManager/GetLicenses")
                .then()
                .assertThat().statusCode(200)
                .contentType("application/json")
                .extract().response();

        License license = response.as(License.class);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(license.getData()).as("Data is not null").isNotNull();
        softly.assertThat(license.getSuccess()).as("Success is true").isTrue();
        softly.assertThat(license.getError()).as("Error is null").isNull();

        softly.assertAll(); // Проверка всех ассертов, при которой не прерывается тест
    }
}
