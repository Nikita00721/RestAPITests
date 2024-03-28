import Generatot.model.CouponMatchesCounterOutApiResult;
import Generatot.model.EventResultOutApiResult;
import Generatot.model.StringStringDictionaryApiResult;
import com.github.viclovsky.swagger.coverage.SwaggerCoverageRestAssured;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.*;
import java.time.OffsetDateTime;

public class BetsonicApiTests {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://sb2frontend-altenar2-stage.biahosted.com";
    }

    @Test
    @Description("Receiving information about an event in the Highlights block and partially checking it")
    public void testHighlightsEvent() throws IOException{
        Response response = given()
                .filter(new SwaggerCoverageRestAssured())
                .queryParam("timezoneOffset", "-180")
                .queryParam("langId", 8)
                .queryParam("skinName", "betsonic")
                .queryParam("configId", 1)
                .queryParam("culture", "en-GB")
                .queryParam("countryCode", "RU")
                .queryParam("deviceType", "Mobile")
                .queryParam("numformat", "en")
                .queryParam("integration", "skintest")
                .queryParam("sportId", 67)
                .queryParam("showAllEvents", false)
                .queryParam("count", 10)
                .when()
                .get("/api/Sportsbook/GetHighlights")
                .then()
                .assertThat().statusCode(200)
                .contentType("application/json")
                .extract().response();

        String jsonResponse = response.getBody().asString();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeAdapter())
                .create();
        EventResultOutApiResult eventResultOutApiResult = gson.fromJson(jsonResponse, EventResultOutApiResult.class);
//      Gson gson = new Gson(); ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
        assertNotNull(eventResultOutApiResult);
    }

    @Test
    @Description("Checking getting a list of live events")
    public void getLiveEventsTest() {
        Response response = given()
                .filter(new SwaggerCoverageRestAssured())
                .param("timezoneOffset", -180)
                .param("langId", 8)
                .param("skinName", "betsonic")
                .param("configId", 1)
                .param("culture", "en-GB")
                .param("countryCode", "RU")
                .param("deviceType", "Desktop")
                .param("numformat", "en")
                .param("integration", "skintest")
                .param("sportids", 66)
                .param("categoryids", 0)
                .param("champids", 0)
                .param("group", "Championship")
                .param("outrightsDisplay", "none")
                .param("couponType", 0)
                .param("marketGroupId", 0)
                .param("filterSingleNodes", 2)
                .param("hasLiveStream", false)
                .when().get("/api/Sportsbook/GetLiveEvents")
                .then()
                .assertThat().statusCode(200)
                .contentType("application/json")
                .extract().response();

        String jsonResponse = response.getBody().asString();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeAdapter())
                .create();
        EventResultOutApiResult eventResultOutApiResult = gson.fromJson(jsonResponse, EventResultOutApiResult.class);
        assertNotNull(eventResultOutApiResult);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(eventResultOutApiResult.getResult().getItems().get(0).getId())
                .as("Item id is incorrect")
                .isEqualTo(66L);

        softAssertions.assertAll();
    }

    @Test
    @Description("Test for opening a website with the correct language settings")
    public void verifyLanguageAndCultureTest() throws IOException{
        Response response = given()
                .filter(new SwaggerCoverageRestAssured())
                .queryParam("timezoneOffset", "-180")
                .queryParam("langId", "8")
                .queryParam("skinName", "betsonic")
                .queryParam("configId", "1")
                .queryParam("culture", "en-GB")
                .queryParam("deviceType", "Desktop")
                .queryParam("numformat", "en")
                .queryParam("integration", "skintest")
                .when()
                .get("/api/Translation/StaticTranslations")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response();

        Gson gson = new Gson();
        String jsonResponse = response.getBody().asString();
        StringStringDictionaryApiResult stringStringDictionaryApiResult = gson.fromJson(jsonResponse, StringStringDictionaryApiResult.class);

        assertNotNull(stringStringDictionaryApiResult.getResult());
        assertTrue(stringStringDictionaryApiResult.getResult() instanceof Map);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(stringStringDictionaryApiResult.getResult().get("Today"))
                .as("Value for 'Today' key is incorrect")
                .isEqualTo("Today");

        softAssertions.assertThat(stringStringDictionaryApiResult.getResult().get("Stake"))
                .as("Value for 'Stake' key is incorrect")
                .isEqualTo("Stake");

        softAssertions.assertAll();
    }

    @Test
    @Description("Checking coupon values for not null values and type matching")
    public void verifyCouponsFieldsTest() {
        Response response = given()
                .filter(new SwaggerCoverageRestAssured())
                .queryParam("timezoneOffset", "-180")
                .queryParam("langId", "8")
                .queryParam("skinName", "betsonic")
                .queryParam("configId", "1")
                .queryParam("culture", "en-GB")
                .queryParam("countryCode", "RU")
                .queryParam("deviceType", "Desktop")
                .queryParam("numformat", "en")
                .queryParam("integration", "skintest")
                .queryParam("sportId", "66")
                .queryParam("myLeagues", "")
                .queryParam("maxOdd", "1.5")
                .when()
                .get("/api/Sportsbook/GetCouponMatchesCount")
                .then()
                .assertThat().statusCode(200)
                .contentType("application/json")
                .extract().response();

        Gson gson = new Gson();
        String jsonResponse = response.getBody().asString();
        CouponMatchesCounterOutApiResult couponMatchesCounterOutApiResult = gson.fromJson(jsonResponse, CouponMatchesCounterOutApiResult.class);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getToday()).as("Today field is null").isNotNull();
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getTomorrow()).as("Tomorrow field is null").isNotNull();
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getUpcoming()).as("Upcoming field is null").isNotNull();
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getMyLeagues()).as("MyLeagues field is null").isNotNull();
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getWithMaxOdd()).as("WithMaxOdd field is null").isNotNull();
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getTopLeagues()).as("TopLeagues field is null").isNotNull();

        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getToday()).as("Today field is not an instance of Integer").isInstanceOf(Long.class);
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getTomorrow()).as("Tomorrow field is not an instance of Integer").isInstanceOf(Long.class);
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getUpcoming()).as("Upcoming field is not an instance of Integer").isInstanceOf(Long.class);
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getMyLeagues()).as("MyLeagues field is not an instance of Integer").isInstanceOf(Long.class);
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getWithMaxOdd()).as("WithMaxOdd field is not an instance of Integer").isInstanceOf(Long.class);
        softAssertions.assertThat(couponMatchesCounterOutApiResult.getResult().getTopLeagues()).as("TopLeagues field is not an instance of Integer").isInstanceOf(Long.class);

        softAssertions.assertAll();
    }
}
