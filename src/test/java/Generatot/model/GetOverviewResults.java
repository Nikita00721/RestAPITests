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
import java.util.*;

/**
 * GetOverviewResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetOverviewResults {
  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<SportEvent> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPORTS = "Sports";
  @SerializedName(SERIALIZED_NAME_SPORTS)
  private List<SportNodeWithChildIds> sports = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryNodeWithChildIds> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHAMPS = "Champs";
  @SerializedName(SERIALIZED_NAME_CHAMPS)
  private List<ChampionshipNode> champs = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPETITORS = "Competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private List<Competitor> competitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_MARKETS = "Markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<Market> markets = new ArrayList<>();

  public static final String SERIALIZED_NAME_ODDS = "Odds";
  @SerializedName(SERIALIZED_NAME_ODDS)
  private List<Odd> odds = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADERS = "Headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<Header> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_SPORTS = "TopSports";
  @SerializedName(SERIALIZED_NAME_TOP_SPORTS)
  private List<TopSport> topSports = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATES = "Dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private List<EventsByDate> dates = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUPS = "Groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<OverviewMarketGroup> groups = new ArrayList<>();

  public GetOverviewResults() {
  }

  public GetOverviewResults events(List<SportEvent> events) {
    this.events = events;
    return this;
  }

  public GetOverviewResults addEventsItem(SportEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull
  public List<SportEvent> getEvents() {
    return events;
  }

  public void setEvents(List<SportEvent> events) {
    this.events = events;
  }


  public GetOverviewResults sports(List<SportNodeWithChildIds> sports) {
    this.sports = sports;
    return this;
  }

  public GetOverviewResults addSportsItem(SportNodeWithChildIds sportsItem) {
    if (this.sports == null) {
      this.sports = new ArrayList<>();
    }
    this.sports.add(sportsItem);
    return this;
  }

   /**
   * Get sports
   * @return sports
  **/
  @javax.annotation.Nonnull
  public List<SportNodeWithChildIds> getSports() {
    return sports;
  }

  public void setSports(List<SportNodeWithChildIds> sports) {
    this.sports = sports;
  }


  public GetOverviewResults categories(List<CategoryNodeWithChildIds> categories) {
    this.categories = categories;
    return this;
  }

  public GetOverviewResults addCategoriesItem(CategoryNodeWithChildIds categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nonnull
  public List<CategoryNodeWithChildIds> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoryNodeWithChildIds> categories) {
    this.categories = categories;
  }


  public GetOverviewResults champs(List<ChampionshipNode> champs) {
    this.champs = champs;
    return this;
  }

  public GetOverviewResults addChampsItem(ChampionshipNode champsItem) {
    if (this.champs == null) {
      this.champs = new ArrayList<>();
    }
    this.champs.add(champsItem);
    return this;
  }

   /**
   * Get champs
   * @return champs
  **/
  @javax.annotation.Nonnull
  public List<ChampionshipNode> getChamps() {
    return champs;
  }

  public void setChamps(List<ChampionshipNode> champs) {
    this.champs = champs;
  }


  public GetOverviewResults competitors(List<Competitor> competitors) {
    this.competitors = competitors;
    return this;
  }

  public GetOverviewResults addCompetitorsItem(Competitor competitorsItem) {
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


  public GetOverviewResults markets(List<Market> markets) {
    this.markets = markets;
    return this;
  }

  public GetOverviewResults addMarketsItem(Market marketsItem) {
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
  public List<Market> getMarkets() {
    return markets;
  }

  public void setMarkets(List<Market> markets) {
    this.markets = markets;
  }


  public GetOverviewResults odds(List<Odd> odds) {
    this.odds = odds;
    return this;
  }

  public GetOverviewResults addOddsItem(Odd oddsItem) {
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


  public GetOverviewResults headers(List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public GetOverviewResults addHeadersItem(Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nonnull
  public List<Header> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }


  public GetOverviewResults topSports(List<TopSport> topSports) {
    this.topSports = topSports;
    return this;
  }

  public GetOverviewResults addTopSportsItem(TopSport topSportsItem) {
    if (this.topSports == null) {
      this.topSports = new ArrayList<>();
    }
    this.topSports.add(topSportsItem);
    return this;
  }

   /**
   * Get topSports
   * @return topSports
  **/
  @javax.annotation.Nonnull
  public List<TopSport> getTopSports() {
    return topSports;
  }

  public void setTopSports(List<TopSport> topSports) {
    this.topSports = topSports;
  }


  public GetOverviewResults dates(List<EventsByDate> dates) {
    this.dates = dates;
    return this;
  }

  public GetOverviewResults addDatesItem(EventsByDate datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nonnull
  public List<EventsByDate> getDates() {
    return dates;
  }

  public void setDates(List<EventsByDate> dates) {
    this.dates = dates;
  }


  public GetOverviewResults groups(List<OverviewMarketGroup> groups) {
    this.groups = groups;
    return this;
  }

  public GetOverviewResults addGroupsItem(OverviewMarketGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nonnull
  public List<OverviewMarketGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<OverviewMarketGroup> groups) {
    this.groups = groups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOverviewResults getOverviewResults = (GetOverviewResults) o;
    return Objects.equals(this.events, getOverviewResults.events) &&
        Objects.equals(this.sports, getOverviewResults.sports) &&
        Objects.equals(this.categories, getOverviewResults.categories) &&
        Objects.equals(this.champs, getOverviewResults.champs) &&
        Objects.equals(this.competitors, getOverviewResults.competitors) &&
        Objects.equals(this.markets, getOverviewResults.markets) &&
        Objects.equals(this.odds, getOverviewResults.odds) &&
        Objects.equals(this.headers, getOverviewResults.headers) &&
        Objects.equals(this.topSports, getOverviewResults.topSports) &&
        Objects.equals(this.dates, getOverviewResults.dates) &&
        Objects.equals(this.groups, getOverviewResults.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, sports, categories, champs, competitors, markets, odds, headers, topSports, dates, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOverviewResults {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    sports: ").append(toIndentedString(sports)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    topSports: ").append(toIndentedString(topSports)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("Events");
    openapiFields.add("Sports");
    openapiFields.add("Categories");
    openapiFields.add("Champs");
    openapiFields.add("Competitors");
    openapiFields.add("Markets");
    openapiFields.add("Odds");
    openapiFields.add("Headers");
    openapiFields.add("TopSports");
    openapiFields.add("Dates");
    openapiFields.add("Groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Events");
    openapiRequiredFields.add("Sports");
    openapiRequiredFields.add("Categories");
    openapiRequiredFields.add("Champs");
    openapiRequiredFields.add("Competitors");
    openapiRequiredFields.add("Markets");
    openapiRequiredFields.add("Odds");
    openapiRequiredFields.add("Headers");
    openapiRequiredFields.add("TopSports");
    openapiRequiredFields.add("Dates");
    openapiRequiredFields.add("Groups");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetOverviewResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetOverviewResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOverviewResults is not found in the empty JSON string", GetOverviewResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetOverviewResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOverviewResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetOverviewResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Events` to be an array in the JSON string but got `%s`", jsonObj.get("Events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("Events");
      // validate the required field `Events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        SportEvent.validateJsonElement(jsonArrayevents.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Sports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sports` to be an array in the JSON string but got `%s`", jsonObj.get("Sports").toString()));
      }

      JsonArray jsonArraysports = jsonObj.getAsJsonArray("Sports");
      // validate the required field `Sports` (array)
      for (int i = 0; i < jsonArraysports.size(); i++) {
        SportNodeWithChildIds.validateJsonElement(jsonArraysports.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Categories` to be an array in the JSON string but got `%s`", jsonObj.get("Categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("Categories");
      // validate the required field `Categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        CategoryNodeWithChildIds.validateJsonElement(jsonArraycategories.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Champs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Champs` to be an array in the JSON string but got `%s`", jsonObj.get("Champs").toString()));
      }

      JsonArray jsonArraychamps = jsonObj.getAsJsonArray("Champs");
      // validate the required field `Champs` (array)
      for (int i = 0; i < jsonArraychamps.size(); i++) {
        ChampionshipNode.validateJsonElement(jsonArraychamps.get(i));
      };
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
      if (!jsonObj.get("Markets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Markets` to be an array in the JSON string but got `%s`", jsonObj.get("Markets").toString()));
      }

      JsonArray jsonArraymarkets = jsonObj.getAsJsonArray("Markets");
      // validate the required field `Markets` (array)
      for (int i = 0; i < jsonArraymarkets.size(); i++) {
        Market.validateJsonElement(jsonArraymarkets.get(i));
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
      // ensure the json data is an array
      if (!jsonObj.get("Headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Headers` to be an array in the JSON string but got `%s`", jsonObj.get("Headers").toString()));
      }

      JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("Headers");
      // validate the required field `Headers` (array)
      for (int i = 0; i < jsonArrayheaders.size(); i++) {
        Header.validateJsonElement(jsonArrayheaders.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("TopSports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TopSports` to be an array in the JSON string but got `%s`", jsonObj.get("TopSports").toString()));
      }

      JsonArray jsonArraytopSports = jsonObj.getAsJsonArray("TopSports");
      // validate the required field `TopSports` (array)
      for (int i = 0; i < jsonArraytopSports.size(); i++) {
        TopSport.validateJsonElement(jsonArraytopSports.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Dates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Dates` to be an array in the JSON string but got `%s`", jsonObj.get("Dates").toString()));
      }

      JsonArray jsonArraydates = jsonObj.getAsJsonArray("Dates");
      // validate the required field `Dates` (array)
      for (int i = 0; i < jsonArraydates.size(); i++) {
        EventsByDate.validateJsonElement(jsonArraydates.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Groups` to be an array in the JSON string but got `%s`", jsonObj.get("Groups").toString()));
      }

      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("Groups");
      // validate the required field `Groups` (array)
      for (int i = 0; i < jsonArraygroups.size(); i++) {
        OverviewMarketGroup.validateJsonElement(jsonArraygroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOverviewResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOverviewResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOverviewResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOverviewResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOverviewResults>() {
           @Override
           public void write(JsonWriter out, GetOverviewResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOverviewResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetOverviewResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOverviewResults
  * @throws IOException if the JSON string is invalid with respect to GetOverviewResults
  */
  public static GetOverviewResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOverviewResults.class);
  }

 /**
  * Convert an instance of GetOverviewResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

