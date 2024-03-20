import CouponsData.Coupons;
import HighlightsData.*;
import HighlightsData.Event;
import HighlightsData.Item;
import LiveEventsData.*;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
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

        assertThat("Incorrect item id", item.getId(), equalTo(66));
        assertThat("Incorrect item name", item.getName(), equalTo("Soccer"));
        assertThat("Incorrect item node", item.getNode(), equalTo("SP"));

        assertThat("Event id is null", event.getId(), notNullValue());
        assertThat("Sport id is null", event.getSportId(), notNullValue());
        assertThat("Sport type id is null", event.getSportTypeId(), notNullValue());
        assertThat("Sport name is null", event.getSportName(), notNullValue());
        assertThat("Sport icon is null", event.getSportIcon(), notNullValue());
        assertThat("Category id is null", event.getCategoryId(), notNullValue());
        assertThat("Category name is null", event.getCategoryName(), notNullValue());
        assertThat("Champ id is null", event.getChampId(), notNullValue());
        assertThat("Champ name is null", event.getChampName(), notNullValue());
        assertThat("Event name is null", event.getName(), notNullValue());
        assertThat("Event date is null", event.getEventDate(), notNullValue());
        assertThat("Event status is null", event.getStatus(), notNullValue());
        assertThat("Event extId is null", event.getExtId(), notNullValue());
        assertThat("Event isPromo is null", event.getIsPromo(), notNullValue());
        assertThat("Event isLiveStream is null", event.getIsLiveStream(), notNullValue());
        assertThat("Event eventType is null", event.getEventType(), notNullValue());

    }

    @Test
    @Description("Checking getting a list of live events")
    public void getLiveEventsTest(){
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
                    .when()
                    .get("/api/Sportsbook/GetLiveEvents")
                    .then()
                    .assertThat()
                    .statusCode(200)
                    .contentType("application/json")
                    .extract()
                    .response();

            assertNotNull("Response is null", response.getBody().asString());
            LiveEvents liveEvents = response.as(LiveEvents.class);

        assertNotNull(liveEvents.result.items);
        assertTrue(liveEvents.result.items.size() > 0);
        for (LiveEventsData.Item item : liveEvents.result.items) {
            assertNotNull(item.id);
            assertNotNull(item.name);
            assertNotNull(item.node);
            assertNotNull(item.items);
            assertNotNull(item.order);
            assertNotNull(item.sportTypeId);
        }
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
                .assertThat()
                .statusCode(200)
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
                .assertThat()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

        Coupons coupons = response.as(Coupons.class);
        assert coupons.getResult().getToday() != null : "Today field is null";
        assert coupons.getResult().getTomorrow() != null : "Tomorrow field is null";
        assert coupons.getResult().getUpcoming() != null : "Upcoming field is null";
        assert coupons.getResult().getMyLeagues() != null : "MyLeagues field is null";
        assert coupons.getResult().getWithMaxOdd() != null : "WithMaxOdd field is null";
        assert coupons.getResult().getTopLeagues() != null : "TopLeagues field is null";

        assert coupons.getResult().getToday() instanceof Integer : "Today field is not an instance of Integer";
        assert coupons.getResult().getTomorrow() instanceof Integer : "Tomorrow field is not an instance of Integer";
        assert coupons.getResult().getUpcoming() instanceof Integer : "Upcoming field is not an instance of Integer";
        assert coupons.getResult().getMyLeagues() instanceof Integer : "MyLeagues field is not an instance of Integer";
        assert coupons.getResult().getWithMaxOdd() instanceof Integer : "WithMaxOdd field is not an instance of Integer";
        assert coupons.getResult().getTopLeagues() instanceof Integer : "TopLeagues field is not an instance of Integer";

    }
}
