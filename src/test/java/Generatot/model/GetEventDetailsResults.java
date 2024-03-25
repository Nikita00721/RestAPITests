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


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * GetEventDetailsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetEventDetailsResults {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "EventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private ClientEventTypes eventType;

  public static final String SERIALIZED_NAME_LIVE_TIME = "LiveTime";
  @SerializedName(SERIALIZED_NAME_LIVE_TIME)
  private String liveTime;

  public static final String SERIALIZED_NAME_SPORT = "Sport";
  @SerializedName(SERIALIZED_NAME_SPORT)
  private SportNode sport;

  public static final String SERIALIZED_NAME_CHAMP = "Champ";
  @SerializedName(SERIALIZED_NAME_CHAMP)
  private ChampionshipNode champ;

  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryNode category;

  public static final String SERIALIZED_NAME_COMPETITORS = "Competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private List<Competitor> competitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_MARKET_GROUPS = "MarketGroups";
  @SerializedName(SERIALIZED_NAME_MARKET_GROUPS)
  private List<MarketGroup> marketGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHILD_MARKET_GROUPS = "ChildMarketGroups";
  @SerializedName(SERIALIZED_NAME_CHILD_MARKET_GROUPS)
  private List<MarketGroup> childMarketGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_MARKETS = "Markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<EventDetailsMarket> markets = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHILD_MARKETS = "ChildMarkets";
  @SerializedName(SERIALIZED_NAME_CHILD_MARKETS)
  private List<EventDetailsMarket> childMarkets = new ArrayList<>();

  public static final String SERIALIZED_NAME_ODDS = "Odds";
  @SerializedName(SERIALIZED_NAME_ODDS)
  private List<Odd> odds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOOST_ODD_IDS = "BoostOddIds";
  @SerializedName(SERIALIZED_NAME_BOOST_ODD_IDS)
  private List<Long> boostOddIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_PARLAY = "IsParlay";
  @SerializedName(SERIALIZED_NAME_IS_PARLAY)
  private Boolean isParlay;

  public static final String SERIALIZED_NAME_EVENT_CODE = "EventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private Integer eventCode;

  public static final String SERIALIZED_NAME_RC = "rc";
  @SerializedName(SERIALIZED_NAME_RC)
  private Boolean rc;

  public static final String SERIALIZED_NAME_EXTRA_INFO = "ExtraInfo";
  @SerializedName(SERIALIZED_NAME_EXTRA_INFO)
  private String extraInfo;

  public static final String SERIALIZED_NAME_QUICK_PICK_ENABLED = "QuickPickEnabled";
  @SerializedName(SERIALIZED_NAME_QUICK_PICK_ENABLED)
  private Boolean quickPickEnabled;

  public static final String SERIALIZED_NAME_NUMBER_OF_MAIN_BALLS = "NumberOfMainBalls";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MAIN_BALLS)
  private Integer numberOfMainBalls;

  public static final String SERIALIZED_NAME_PITCHERS = "Pitchers";
  @SerializedName(SERIALIZED_NAME_PITCHERS)
  private List<Pitcher> pitchers;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public GetEventDetailsResults() {
  }

  public GetEventDetailsResults id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public GetEventDetailsResults feedEventId(Long feedEventId) {
    this.feedEventId = feedEventId;
    return this;
  }

   /**
   * Get feedEventId
   * @return feedEventId
  **/
  @javax.annotation.Nonnull
  public Long getFeedEventId() {
    return feedEventId;
  }

  public void setFeedEventId(Long feedEventId) {
    this.feedEventId = feedEventId;
  }


  public GetEventDetailsResults name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetEventDetailsResults eventType(ClientEventTypes eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull
  public ClientEventTypes getEventType() {
    return eventType;
  }

  public void setEventType(ClientEventTypes eventType) {
    this.eventType = eventType;
  }


  public GetEventDetailsResults liveTime(String liveTime) {
    this.liveTime = liveTime;
    return this;
  }

   /**
   * Get liveTime
   * @return liveTime
  **/
  @javax.annotation.Nonnull
  public String getLiveTime() {
    return liveTime;
  }

  public void setLiveTime(String liveTime) {
    this.liveTime = liveTime;
  }


  public GetEventDetailsResults sport(SportNode sport) {
    this.sport = sport;
    return this;
  }

   /**
   * Get sport
   * @return sport
  **/
  @javax.annotation.Nonnull
  public SportNode getSport() {
    return sport;
  }

  public void setSport(SportNode sport) {
    this.sport = sport;
  }


  public GetEventDetailsResults champ(ChampionshipNode champ) {
    this.champ = champ;
    return this;
  }

   /**
   * Get champ
   * @return champ
  **/
  @javax.annotation.Nonnull
  public ChampionshipNode getChamp() {
    return champ;
  }

  public void setChamp(ChampionshipNode champ) {
    this.champ = champ;
  }


  public GetEventDetailsResults category(CategoryNode category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  public CategoryNode getCategory() {
    return category;
  }

  public void setCategory(CategoryNode category) {
    this.category = category;
  }


  public GetEventDetailsResults competitors(List<Competitor> competitors) {
    this.competitors = competitors;
    return this;
  }

  public GetEventDetailsResults addCompetitorsItem(Competitor competitorsItem) {
    if (this.competitors == null) {
      this.competitors = new ArrayList<>();
    }
    this.competitors.add(competitorsItem);
    return this;
  }

   /**
   * Get competitors
   * @return competitors
  **/
  @javax.annotation.Nonnull
  public List<Competitor> getCompetitors() {
    return competitors;
  }

  public void setCompetitors(List<Competitor> competitors) {
    this.competitors = competitors;
  }


  public GetEventDetailsResults marketGroups(List<MarketGroup> marketGroups) {
    this.marketGroups = marketGroups;
    return this;
  }

  public GetEventDetailsResults addMarketGroupsItem(MarketGroup marketGroupsItem) {
    if (this.marketGroups == null) {
      this.marketGroups = new ArrayList<>();
    }
    this.marketGroups.add(marketGroupsItem);
    return this;
  }

   /**
   * Get marketGroups
   * @return marketGroups
  **/
  @javax.annotation.Nonnull
  public List<MarketGroup> getMarketGroups() {
    return marketGroups;
  }

  public void setMarketGroups(List<MarketGroup> marketGroups) {
    this.marketGroups = marketGroups;
  }


  public GetEventDetailsResults childMarketGroups(List<MarketGroup> childMarketGroups) {
    this.childMarketGroups = childMarketGroups;
    return this;
  }

  public GetEventDetailsResults addChildMarketGroupsItem(MarketGroup childMarketGroupsItem) {
    if (this.childMarketGroups == null) {
      this.childMarketGroups = new ArrayList<>();
    }
    this.childMarketGroups.add(childMarketGroupsItem);
    return this;
  }

   /**
   * Get childMarketGroups
   * @return childMarketGroups
  **/
  @javax.annotation.Nonnull
  public List<MarketGroup> getChildMarketGroups() {
    return childMarketGroups;
  }

  public void setChildMarketGroups(List<MarketGroup> childMarketGroups) {
    this.childMarketGroups = childMarketGroups;
  }


  public GetEventDetailsResults markets(List<EventDetailsMarket> markets) {
    this.markets = markets;
    return this;
  }

  public GetEventDetailsResults addMarketsItem(EventDetailsMarket marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @javax.annotation.Nonnull
  public List<EventDetailsMarket> getMarkets() {
    return markets;
  }

  public void setMarkets(List<EventDetailsMarket> markets) {
    this.markets = markets;
  }


  public GetEventDetailsResults childMarkets(List<EventDetailsMarket> childMarkets) {
    this.childMarkets = childMarkets;
    return this;
  }

  public GetEventDetailsResults addChildMarketsItem(EventDetailsMarket childMarketsItem) {
    if (this.childMarkets == null) {
      this.childMarkets = new ArrayList<>();
    }
    this.childMarkets.add(childMarketsItem);
    return this;
  }

   /**
   * Get childMarkets
   * @return childMarkets
  **/
  @javax.annotation.Nonnull
  public List<EventDetailsMarket> getChildMarkets() {
    return childMarkets;
  }

  public void setChildMarkets(List<EventDetailsMarket> childMarkets) {
    this.childMarkets = childMarkets;
  }


  public GetEventDetailsResults odds(List<Odd> odds) {
    this.odds = odds;
    return this;
  }

  public GetEventDetailsResults addOddsItem(Odd oddsItem) {
    if (this.odds == null) {
      this.odds = new ArrayList<>();
    }
    this.odds.add(oddsItem);
    return this;
  }

   /**
   * Get odds
   * @return odds
  **/
  @javax.annotation.Nonnull
  public List<Odd> getOdds() {
    return odds;
  }

  public void setOdds(List<Odd> odds) {
    this.odds = odds;
  }


  public GetEventDetailsResults boostOddIds(List<Long> boostOddIds) {
    this.boostOddIds = boostOddIds;
    return this;
  }

  public GetEventDetailsResults addBoostOddIdsItem(Long boostOddIdsItem) {
    if (this.boostOddIds == null) {
      this.boostOddIds = new ArrayList<>();
    }
    this.boostOddIds.add(boostOddIdsItem);
    return this;
  }

   /**
   * Get boostOddIds
   * @return boostOddIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getBoostOddIds() {
    return boostOddIds;
  }

  public void setBoostOddIds(List<Long> boostOddIds) {
    this.boostOddIds = boostOddIds;
  }


  public GetEventDetailsResults isParlay(Boolean isParlay) {
    this.isParlay = isParlay;
    return this;
  }

   /**
   * Get isParlay
   * @return isParlay
  **/
  @javax.annotation.Nonnull
  public Boolean getIsParlay() {
    return isParlay;
  }

  public void setIsParlay(Boolean isParlay) {
    this.isParlay = isParlay;
  }


  public GetEventDetailsResults eventCode(Integer eventCode) {
    this.eventCode = eventCode;
    return this;
  }

   /**
   * Get eventCode
   * @return eventCode
  **/
  @javax.annotation.Nullable
  public Integer getEventCode() {
    return eventCode;
  }

  public void setEventCode(Integer eventCode) {
    this.eventCode = eventCode;
  }


  public GetEventDetailsResults rc(Boolean rc) {
    this.rc = rc;
    return this;
  }

   /**
   * Get rc
   * @return rc
  **/
  @javax.annotation.Nullable
  public Boolean getRc() {
    return rc;
  }

  public void setRc(Boolean rc) {
    this.rc = rc;
  }


  public GetEventDetailsResults extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @javax.annotation.Nullable
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }


  public GetEventDetailsResults quickPickEnabled(Boolean quickPickEnabled) {
    this.quickPickEnabled = quickPickEnabled;
    return this;
  }

   /**
   * Get quickPickEnabled
   * @return quickPickEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getQuickPickEnabled() {
    return quickPickEnabled;
  }

  public void setQuickPickEnabled(Boolean quickPickEnabled) {
    this.quickPickEnabled = quickPickEnabled;
  }


  public GetEventDetailsResults numberOfMainBalls(Integer numberOfMainBalls) {
    this.numberOfMainBalls = numberOfMainBalls;
    return this;
  }

   /**
   * Get numberOfMainBalls
   * @return numberOfMainBalls
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfMainBalls() {
    return numberOfMainBalls;
  }

  public void setNumberOfMainBalls(Integer numberOfMainBalls) {
    this.numberOfMainBalls = numberOfMainBalls;
  }


  public GetEventDetailsResults pitchers(List<Pitcher> pitchers) {
    this.pitchers = pitchers;
    return this;
  }

  public GetEventDetailsResults addPitchersItem(Pitcher pitchersItem) {
    if (this.pitchers == null) {
      this.pitchers = new ArrayList<>();
    }
    this.pitchers.add(pitchersItem);
    return this;
  }

   /**
   * Get pitchers
   * @return pitchers
  **/
  @javax.annotation.Nullable
  public List<Pitcher> getPitchers() {
    return pitchers;
  }

  public void setPitchers(List<Pitcher> pitchers) {
    this.pitchers = pitchers;
  }


  public GetEventDetailsResults startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventDetailsResults getEventDetailsResults = (GetEventDetailsResults) o;
    return Objects.equals(this.id, getEventDetailsResults.id) &&
        Objects.equals(this.feedEventId, getEventDetailsResults.feedEventId) &&
        Objects.equals(this.name, getEventDetailsResults.name) &&
        Objects.equals(this.eventType, getEventDetailsResults.eventType) &&
        Objects.equals(this.liveTime, getEventDetailsResults.liveTime) &&
        Objects.equals(this.sport, getEventDetailsResults.sport) &&
        Objects.equals(this.champ, getEventDetailsResults.champ) &&
        Objects.equals(this.category, getEventDetailsResults.category) &&
        Objects.equals(this.competitors, getEventDetailsResults.competitors) &&
        Objects.equals(this.marketGroups, getEventDetailsResults.marketGroups) &&
        Objects.equals(this.childMarketGroups, getEventDetailsResults.childMarketGroups) &&
        Objects.equals(this.markets, getEventDetailsResults.markets) &&
        Objects.equals(this.childMarkets, getEventDetailsResults.childMarkets) &&
        Objects.equals(this.odds, getEventDetailsResults.odds) &&
        Objects.equals(this.boostOddIds, getEventDetailsResults.boostOddIds) &&
        Objects.equals(this.isParlay, getEventDetailsResults.isParlay) &&
        Objects.equals(this.eventCode, getEventDetailsResults.eventCode) &&
        Objects.equals(this.rc, getEventDetailsResults.rc) &&
        Objects.equals(this.extraInfo, getEventDetailsResults.extraInfo) &&
        Objects.equals(this.quickPickEnabled, getEventDetailsResults.quickPickEnabled) &&
        Objects.equals(this.numberOfMainBalls, getEventDetailsResults.numberOfMainBalls) &&
        Objects.equals(this.pitchers, getEventDetailsResults.pitchers) &&
        Objects.equals(this.startDate, getEventDetailsResults.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, feedEventId, name, eventType, liveTime, sport, champ, category, competitors, marketGroups, childMarketGroups, markets, childMarkets, odds, boostOddIds, isParlay, eventCode, rc, extraInfo, quickPickEnabled, numberOfMainBalls, pitchers, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEventDetailsResults {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feedEventId: ").append(toIndentedString(feedEventId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    liveTime: ").append(toIndentedString(liveTime)).append("\n");
    sb.append("    sport: ").append(toIndentedString(sport)).append("\n");
    sb.append("    champ: ").append(toIndentedString(champ)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
    sb.append("    marketGroups: ").append(toIndentedString(marketGroups)).append("\n");
    sb.append("    childMarketGroups: ").append(toIndentedString(childMarketGroups)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    childMarkets: ").append(toIndentedString(childMarkets)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
    sb.append("    boostOddIds: ").append(toIndentedString(boostOddIds)).append("\n");
    sb.append("    isParlay: ").append(toIndentedString(isParlay)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    rc: ").append(toIndentedString(rc)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    quickPickEnabled: ").append(toIndentedString(quickPickEnabled)).append("\n");
    sb.append("    numberOfMainBalls: ").append(toIndentedString(numberOfMainBalls)).append("\n");
    sb.append("    pitchers: ").append(toIndentedString(pitchers)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Id");
    openapiFields.add("FeedEventId");
    openapiFields.add("Name");
    openapiFields.add("EventType");
    openapiFields.add("LiveTime");
    openapiFields.add("Sport");
    openapiFields.add("Champ");
    openapiFields.add("Category");
    openapiFields.add("Competitors");
    openapiFields.add("MarketGroups");
    openapiFields.add("ChildMarketGroups");
    openapiFields.add("Markets");
    openapiFields.add("ChildMarkets");
    openapiFields.add("Odds");
    openapiFields.add("BoostOddIds");
    openapiFields.add("IsParlay");
    openapiFields.add("EventCode");
    openapiFields.add("rc");
    openapiFields.add("ExtraInfo");
    openapiFields.add("QuickPickEnabled");
    openapiFields.add("NumberOfMainBalls");
    openapiFields.add("Pitchers");
    openapiFields.add("StartDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("FeedEventId");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("EventType");
    openapiRequiredFields.add("LiveTime");
    openapiRequiredFields.add("Sport");
    openapiRequiredFields.add("Champ");
    openapiRequiredFields.add("Category");
    openapiRequiredFields.add("Competitors");
    openapiRequiredFields.add("MarketGroups");
    openapiRequiredFields.add("ChildMarketGroups");
    openapiRequiredFields.add("Markets");
    openapiRequiredFields.add("ChildMarkets");
    openapiRequiredFields.add("Odds");
    openapiRequiredFields.add("BoostOddIds");
    openapiRequiredFields.add("IsParlay");
    openapiRequiredFields.add("StartDate");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetEventDetailsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEventDetailsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEventDetailsResults is not found in the empty JSON string", GetEventDetailsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEventDetailsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEventDetailsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetEventDetailsResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the required field `EventType`
      ClientEventTypes.validateJsonElement(jsonObj.get("EventType"));
      if (!jsonObj.get("LiveTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LiveTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LiveTime").toString()));
      }
      // validate the required field `Sport`
      SportNode.validateJsonElement(jsonObj.get("Sport"));
      // validate the required field `Champ`
      ChampionshipNode.validateJsonElement(jsonObj.get("Champ"));
      // validate the required field `Category`
      CategoryNode.validateJsonElement(jsonObj.get("Category"));
      // ensure the json data is an array
      if (!jsonObj.get("Competitors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Competitors` to be an array in the JSON string but got `%s`", jsonObj.get("Competitors").toString()));
      }

      JsonArray jsonArraycompetitors = jsonObj.getAsJsonArray("Competitors");
      // validate the required field `Competitors` (array)
      for (int i = 0; i < jsonArraycompetitors.size(); i++) {
        Competitor.validateJsonElement(jsonArraycompetitors.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("MarketGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketGroups` to be an array in the JSON string but got `%s`", jsonObj.get("MarketGroups").toString()));
      }

      JsonArray jsonArraymarketGroups = jsonObj.getAsJsonArray("MarketGroups");
      // validate the required field `MarketGroups` (array)
      for (int i = 0; i < jsonArraymarketGroups.size(); i++) {
        MarketGroup.validateJsonElement(jsonArraymarketGroups.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("ChildMarketGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChildMarketGroups` to be an array in the JSON string but got `%s`", jsonObj.get("ChildMarketGroups").toString()));
      }

      JsonArray jsonArraychildMarketGroups = jsonObj.getAsJsonArray("ChildMarketGroups");
      // validate the required field `ChildMarketGroups` (array)
      for (int i = 0; i < jsonArraychildMarketGroups.size(); i++) {
        MarketGroup.validateJsonElement(jsonArraychildMarketGroups.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Markets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Markets` to be an array in the JSON string but got `%s`", jsonObj.get("Markets").toString()));
      }

      JsonArray jsonArraymarkets = jsonObj.getAsJsonArray("Markets");
      // validate the required field `Markets` (array)
      for (int i = 0; i < jsonArraymarkets.size(); i++) {
        EventDetailsMarket.validateJsonElement(jsonArraymarkets.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("ChildMarkets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChildMarkets` to be an array in the JSON string but got `%s`", jsonObj.get("ChildMarkets").toString()));
      }

      JsonArray jsonArraychildMarkets = jsonObj.getAsJsonArray("ChildMarkets");
      // validate the required field `ChildMarkets` (array)
      for (int i = 0; i < jsonArraychildMarkets.size(); i++) {
        EventDetailsMarket.validateJsonElement(jsonArraychildMarkets.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Odds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Odds` to be an array in the JSON string but got `%s`", jsonObj.get("Odds").toString()));
      }

      JsonArray jsonArrayodds = jsonObj.getAsJsonArray("Odds");
      // validate the required field `Odds` (array)
      for (int i = 0; i < jsonArrayodds.size(); i++) {
        Odd.validateJsonElement(jsonArrayodds.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("BoostOddIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("BoostOddIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoostOddIds` to be an array in the JSON string but got `%s`", jsonObj.get("BoostOddIds").toString()));
      }
      if ((jsonObj.get("ExtraInfo") != null && !jsonObj.get("ExtraInfo").isJsonNull()) && !jsonObj.get("ExtraInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtraInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtraInfo").toString()));
      }
      if (jsonObj.get("Pitchers") != null && !jsonObj.get("Pitchers").isJsonNull()) {
        JsonArray jsonArraypitchers = jsonObj.getAsJsonArray("Pitchers");
        if (jsonArraypitchers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Pitchers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Pitchers` to be an array in the JSON string but got `%s`", jsonObj.get("Pitchers").toString()));
          }

          // validate the optional field `Pitchers` (array)
          for (int i = 0; i < jsonArraypitchers.size(); i++) {
            Pitcher.validateJsonElement(jsonArraypitchers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEventDetailsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEventDetailsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEventDetailsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEventDetailsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEventDetailsResults>() {
           @Override
           public void write(JsonWriter out, GetEventDetailsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEventDetailsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEventDetailsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEventDetailsResults
  * @throws IOException if the JSON string is invalid with respect to GetEventDetailsResults
  */
  public static GetEventDetailsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEventDetailsResults.class);
  }

 /**
  * Convert an instance of GetEventDetailsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

