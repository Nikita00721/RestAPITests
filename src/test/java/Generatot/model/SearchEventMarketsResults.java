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
 * SearchEventMarketsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class SearchEventMarketsResults {
  public static final String SERIALIZED_NAME_MARKETS = "Markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<EventDetailsMarket> markets = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHILD_MARKETS = "ChildMarkets";
  @SerializedName(SERIALIZED_NAME_CHILD_MARKETS)
  private List<EventDetailsMarket> childMarkets = new ArrayList<>();

  public static final String SERIALIZED_NAME_ODDS = "Odds";
  @SerializedName(SERIALIZED_NAME_ODDS)
  private List<Odd> odds = new ArrayList<>();

  public SearchEventMarketsResults() {
  }

  public SearchEventMarketsResults markets(List<EventDetailsMarket> markets) {
    this.markets = markets;
    return this;
  }

  public SearchEventMarketsResults addMarketsItem(EventDetailsMarket marketsItem) {
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


  public SearchEventMarketsResults childMarkets(List<EventDetailsMarket> childMarkets) {
    this.childMarkets = childMarkets;
    return this;
  }

  public SearchEventMarketsResults addChildMarketsItem(EventDetailsMarket childMarketsItem) {
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


  public SearchEventMarketsResults odds(List<Odd> odds) {
    this.odds = odds;
    return this;
  }

  public SearchEventMarketsResults addOddsItem(Odd oddsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEventMarketsResults searchEventMarketsResults = (SearchEventMarketsResults) o;
    return Objects.equals(this.markets, searchEventMarketsResults.markets) &&
        Objects.equals(this.childMarkets, searchEventMarketsResults.childMarkets) &&
        Objects.equals(this.odds, searchEventMarketsResults.odds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, childMarkets, odds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEventMarketsResults {\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    childMarkets: ").append(toIndentedString(childMarkets)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
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
    openapiFields.add("Markets");
    openapiFields.add("ChildMarkets");
    openapiFields.add("Odds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Markets");
    openapiRequiredFields.add("ChildMarkets");
    openapiRequiredFields.add("Odds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchEventMarketsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchEventMarketsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchEventMarketsResults is not found in the empty JSON string", SearchEventMarketsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchEventMarketsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchEventMarketsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchEventMarketsResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchEventMarketsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchEventMarketsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchEventMarketsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchEventMarketsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchEventMarketsResults>() {
           @Override
           public void write(JsonWriter out, SearchEventMarketsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchEventMarketsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchEventMarketsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchEventMarketsResults
  * @throws IOException if the JSON string is invalid with respect to SearchEventMarketsResults
  */
  public static SearchEventMarketsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchEventMarketsResults.class);
  }

 /**
  * Convert an instance of SearchEventMarketsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

