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
 * GetTotoGameDetailsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetTotoGameDetailsResults {
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

  public static final String SERIALIZED_NAME_GAME = "Game";
  @SerializedName(SERIALIZED_NAME_GAME)
  private TotoGame game;

  public GetTotoGameDetailsResults() {
  }

  public GetTotoGameDetailsResults events(List<SportEvent> events) {
    this.events = events;
    return this;
  }

  public GetTotoGameDetailsResults addEventsItem(SportEvent eventsItem) {
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


  public GetTotoGameDetailsResults sports(List<SportNodeWithChildIds> sports) {
    this.sports = sports;
    return this;
  }

  public GetTotoGameDetailsResults addSportsItem(SportNodeWithChildIds sportsItem) {
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


  public GetTotoGameDetailsResults categories(List<CategoryNodeWithChildIds> categories) {
    this.categories = categories;
    return this;
  }

  public GetTotoGameDetailsResults addCategoriesItem(CategoryNodeWithChildIds categoriesItem) {
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


  public GetTotoGameDetailsResults champs(List<ChampionshipNode> champs) {
    this.champs = champs;
    return this;
  }

  public GetTotoGameDetailsResults addChampsItem(ChampionshipNode champsItem) {
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


  public GetTotoGameDetailsResults competitors(List<Competitor> competitors) {
    this.competitors = competitors;
    return this;
  }

  public GetTotoGameDetailsResults addCompetitorsItem(Competitor competitorsItem) {
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


  public GetTotoGameDetailsResults markets(List<Market> markets) {
    this.markets = markets;
    return this;
  }

  public GetTotoGameDetailsResults addMarketsItem(Market marketsItem) {
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


  public GetTotoGameDetailsResults odds(List<Odd> odds) {
    this.odds = odds;
    return this;
  }

  public GetTotoGameDetailsResults addOddsItem(Odd oddsItem) {
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


  public GetTotoGameDetailsResults headers(List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public GetTotoGameDetailsResults addHeadersItem(Header headersItem) {
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


  public GetTotoGameDetailsResults game(TotoGame game) {
    this.game = game;
    return this;
  }

   /**
   * Get game
   * @return game
  **/
  @javax.annotation.Nullable
  public TotoGame getGame() {
    return game;
  }

  public void setGame(TotoGame game) {
    this.game = game;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTotoGameDetailsResults getTotoGameDetailsResults = (GetTotoGameDetailsResults) o;
    return Objects.equals(this.events, getTotoGameDetailsResults.events) &&
        Objects.equals(this.sports, getTotoGameDetailsResults.sports) &&
        Objects.equals(this.categories, getTotoGameDetailsResults.categories) &&
        Objects.equals(this.champs, getTotoGameDetailsResults.champs) &&
        Objects.equals(this.competitors, getTotoGameDetailsResults.competitors) &&
        Objects.equals(this.markets, getTotoGameDetailsResults.markets) &&
        Objects.equals(this.odds, getTotoGameDetailsResults.odds) &&
        Objects.equals(this.headers, getTotoGameDetailsResults.headers) &&
        Objects.equals(this.game, getTotoGameDetailsResults.game);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, sports, categories, champs, competitors, markets, odds, headers, game);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTotoGameDetailsResults {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    sports: ").append(toIndentedString(sports)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
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
    openapiFields.add("Game");

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
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTotoGameDetailsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTotoGameDetailsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTotoGameDetailsResults is not found in the empty JSON string", GetTotoGameDetailsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTotoGameDetailsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTotoGameDetailsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTotoGameDetailsResults.openapiRequiredFields) {
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
      // validate the optional field `Game`
      if (jsonObj.get("Game") != null && !jsonObj.get("Game").isJsonNull()) {
        TotoGame.validateJsonElement(jsonObj.get("Game"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTotoGameDetailsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTotoGameDetailsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTotoGameDetailsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTotoGameDetailsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTotoGameDetailsResults>() {
           @Override
           public void write(JsonWriter out, GetTotoGameDetailsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTotoGameDetailsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTotoGameDetailsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTotoGameDetailsResults
  * @throws IOException if the JSON string is invalid with respect to GetTotoGameDetailsResults
  */
  public static GetTotoGameDetailsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTotoGameDetailsResults.class);
  }

 /**
  * Convert an instance of GetTotoGameDetailsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

