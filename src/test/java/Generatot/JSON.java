/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot;

import Generatot.model.Error;
import Generatot.model.*;
import com.google.gson.*;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new AvailableRace.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BoostInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BoostOddInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BreadCrumbNavItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BreadCrumbNavItemOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BreadcrumbEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BreadcrumbEventInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CategoryNavItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CategoryNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CategoryNodeWithChildIds.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ChampInfoOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ChampInfoOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ChampNavItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ChampionshipNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Competitor.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CompetitorNavItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CompetitorOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Country.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Coupon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CouponMatchesCounterOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CouponMatchesCounterOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventDetailOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventDetailOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventDetailsMarket.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventExternalAndTrackerInfoOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventExternalAndTrackerInfoOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventExternalInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventExternalInfoApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventListOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventListOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventMenuItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventNavItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventOutIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventResultOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventResultOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventTrackerInfoOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventTrackerInfoOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventTypesOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventTypesOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EventsByDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FavChampOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FavChampOutIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FavoriteChampionship.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetAllSportsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetBoostOddsEventsResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetBreadcrumbEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetBreadcrumbsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetChampInfoResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetCouponsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEnhancedOddsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventByCodeResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventCardResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventDetailsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventTrackerInfoResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventsByChampResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventsByOddsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetFavouriteEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetFavouritesChampsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetGuidePricesParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetGuidePricesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetHighlightEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetHorseRaceDetailsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetHorseRaceOddsStatesParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetHorseRaceOddsStatesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetHorseRacesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetLiveEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetLiveNowEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetLiveOverviewResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetMarketNamesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetMarketTypesByGroupsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetMoreMarketsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetOddStateParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetOddStateResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetOutrightEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetOverviewByMarketTypesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetOverviewResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetPTopEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetPickNPricesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetPopularBetsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetRulesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetSportMenuResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetStreamingEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTopBoostOddsParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTopBoostOddsResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTopHorseRacesResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTopOutrightsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTopSportMenuResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTotoCampaignsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTotoEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTotoGameDetailsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetTotoListResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetUpcomingEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GuidePrice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Header.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HeaderOdd.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HeaderSpecialOdd.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HorceRaceOddState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HorseRaceMarket.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HorseRaceMarketGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HorseRaceOdd.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new HorseRaceOddStateParam.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new IPitcher.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new IPitcherInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ISelectionCode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ISelectionCodeIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ISpecOdd.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new IWidgetProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new InnerBMS.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Jockey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new LMTProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new LiveEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new LiveEventInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new LiveInfoOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new LiveInfoOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new LotteryPickNPriceOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Market.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketGroupOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketHeaderOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketItemOutIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketToPrint.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketTypeGroupOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketTypeGroupOutListApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MarketTypeOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Odd.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OddState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OddStateParam.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OfferEarlyPayout.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OfferTypeParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OutrightEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OutrightGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OutrightGroupOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OutrightGroupPerChamp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OutrightGroupPerChampOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OverviewMarketGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OverviewMarketGroupWithMarkets.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OverviewMarketType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new PeriodScore.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new PickNPrice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Pitcher.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new PlaceMarket.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new PopularBetsTotalOddsOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new PopularBetsTotalOddsOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Race.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new RaceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new RaceResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Rule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Runner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ScoreBoard.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ScoreBoardSubscriptionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ScoreNotification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ScoreSubscriptionParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchChampsResultItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchEventMarketsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchEventsResultItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchEventsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchItemsResultOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchItemsResultOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SearchResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Selection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SelectionTypeOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportEventInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportMenuItemHierarhicOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportMenuItemHierarhicOutIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportMenuItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportMenuItemOutIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportNavItemOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportNodeWithChildIds.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportNodeWithCount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportWithStreamingAndEventsOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportWithStreamingAndEventsOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SportsbookGetOddsStatesParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new StaticTranslationsResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new StreamingEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new StringObjectDictionaryApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new StringStringDictionaryApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TopOutright.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TopOutrightIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TopSport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TopSportFullModelOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TopSportFullModelOutIEnumerableApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Toto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoCampaignGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoEventsOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoEventsOutApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoGame.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoGroupOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoGroupOutListApiResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoMarketOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoOut.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TotoPayout.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Venue.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
