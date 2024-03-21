import CouponsData.Coupons;
import HighlightsData.*;
import HighlightsData.Event;
import HighlightsData.Item;
import LiveEventsData.*;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BetsonicApiTests {
    @Test
    @Description("Receiving information about an event in the Highlights block and partially checking it")
    public void testHighlightsEvent() {
        RestAssured.baseURI = "https://sb2frontend-altenar2-stage.biahosted.com";

        Response response = given().param("timezoneOffset", -180)
                .param("langId", 8)
                .param("skinName", "betsonic")
                .param("configId", 1)
                .param("culture", "en-GB")
                .param("countryCode", "RU")
                .param("deviceType", "Desktop")
                .param("numformat", "en")
                .param("integration", "skintest")
                .param("sportId", 66)
                .param("showAllEvents", false)
                .param("count", 10)
                .when()
                .get("/api/Sportsbook/GetHighlights")
                .then()
                .statusCode(200)
                .extract().response();

        Highlights highlights = response.as(Highlights.class);

        Item item = highlights.getResult().getItems().get(0);
        Event event = item.getEvents().get(0);

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(item.getId()).as("Incorrect item id").isEqualTo(66);
        softAssertions.assertThat(item.getName()).as("Incorrect item name").isEqualTo("Soccer");
        softAssertions.assertThat(item.getNode()).as("Incorrect item node").isEqualTo("SP");

        softAssertions.assertThat(event.getId()).as("Event id is null").isNotNull();
        softAssertions.assertThat(event.getSportId()).as("Sport id is null").isNotNull();
        softAssertions.assertThat(event.getSportTypeId()).as("Sport type id is null").isNotNull();
        softAssertions.assertThat(event.getSportName()).as("Sport name is null").isNotNull();
        softAssertions.assertThat(event.getSportIcon()).as("Sport icon is null").isNotNull();
        softAssertions.assertThat(event.getCategoryId()).as("Category id is null").isNotNull();
        softAssertions.assertThat(event.getCategoryName()).as("Category name is null").isNotNull();
        softAssertions.assertThat(event.getChampId()).as("Champ id is null").isNotNull();
        softAssertions.assertThat(event.getChampName()).as("Champ name is null").isNotNull();
        softAssertions.assertThat(event.getName()).as("Event name is null").isNotNull();
        softAssertions.assertThat(event.getEventDate()).as("Event date is null").isNotNull();
        softAssertions.assertThat(event.getStatus()).as("Event status is null").isNotNull();
        softAssertions.assertThat(event.getExtId()).as("Event extId is null").isNotNull();
        softAssertions.assertThat(event.getIsPromo()).as("Event isPromo is null").isNotNull();
        softAssertions.assertThat(event.getIsLiveStream()).as("Event isLiveStream is null").isNotNull();
        softAssertions.assertThat(event.getEventType()).as("Event eventType is null").isNotNull();

        softAssertions.assertAll();
    }

    @Test
    @Description("Checking getting a list of live events")
    public void getLiveEventsTest() {
        RestAssured.baseURI = "https://sb2frontend-altenar2-stage.biahosted.com";
        Response response = given()
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

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(response.getBody().asString()).as("Response is null").isNotNull();

        LiveEvents liveEvents = response.as(LiveEvents.class);
        softAssertions.assertThat(liveEvents.result.items).as("LiveEvents result items are null").isNotNull();
        softAssertions.assertThat(liveEvents.result.items.size()).as("LiveEvents result items size is not greater than 0").isGreaterThan(0);

        for (LiveEventsData.Item item : liveEvents.result.items) {
            softAssertions.assertThat(item.id).as("Item id is null").isNotNull();
            softAssertions.assertThat(item.name).as("Item name is null").isNotNull();
            softAssertions.assertThat(item.node).as("Item node is null").isNotNull();
            softAssertions.assertThat(item.items).as("Item items are null").isNotNull();
            softAssertions.assertThat(item.order).as("Item order is null").isNotNull();
            softAssertions.assertThat(item.sportTypeId).as("Item sportTypeId is null").isNotNull();
        }

        softAssertions.assertAll();
    }

    @Test
    @Description("Test for opening a website with the correct language settings")
    public void verifyLanguageAndCultureTest() {
        RestAssured.baseURI = "https://sb2frontend-altenar2-stage.biahosted.com";
        Response response = given()
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
                .assertThat().statusCode(200)
                .contentType("application/json")
                .extract().response();
        LanguageData.Response responseObject = response.as(LanguageData.Response.class);
        assert responseObject.getResult().getCulture().equals("en-GB");
    }

    @Test
    @Description("Checking coupon values for not null values and type matching")
    public void verifyCouponsFieldsTest() {
        RestAssured.baseURI = "https://sb2frontend-altenar2-stage.biahosted.com";
        Response response = given()
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

        Coupons coupons = response.as(Coupons.class);
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(coupons.getResult().getToday()).as("Today field is null").isNotNull();
        softAssertions.assertThat(coupons.getResult().getTomorrow()).as("Tomorrow field is null").isNotNull();
        softAssertions.assertThat(coupons.getResult().getUpcoming()).as("Upcoming field is null").isNotNull();
        softAssertions.assertThat(coupons.getResult().getMyLeagues()).as("MyLeagues field is null").isNotNull();
        softAssertions.assertThat(coupons.getResult().getWithMaxOdd()).as("WithMaxOdd field is null").isNotNull();
        softAssertions.assertThat(coupons.getResult().getTopLeagues()).as("TopLeagues field is null").isNotNull();

        softAssertions.assertThat(coupons.getResult().getToday()).as("Today field is not an instance of Integer").isInstanceOf(Integer.class);
        softAssertions.assertThat(coupons.getResult().getTomorrow()).as("Tomorrow field is not an instance of Integer").isInstanceOf(Integer.class);
        softAssertions.assertThat(coupons.getResult().getUpcoming()).as("Upcoming field is not an instance of Integer").isInstanceOf(Integer.class);
        softAssertions.assertThat(coupons.getResult().getMyLeagues()).as("MyLeagues field is not an instance of Integer").isInstanceOf(Integer.class);
        softAssertions.assertThat(coupons.getResult().getWithMaxOdd()).as("WithMaxOdd field is not an instance of Integer").isInstanceOf(Integer.class);
        softAssertions.assertThat(coupons.getResult().getTopLeagues()).as("TopLeagues field is not an instance of Integer").isInstanceOf(Integer.class);

        softAssertions.assertAll();
    }
}
