/*
 * Backoffice.Api
 * Backoffice.Api
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package BackofficeGenerator.model;

import BackofficeGenerator.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.*;

/**
 * StatisticsGroupChartItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class StatisticsGroupChartItem {
  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<StatisticsChartDataItem> category;

  public static final String SERIALIZED_NAME_MARKET = "Market";
  @SerializedName(SERIALIZED_NAME_MARKET)
  private List<StatisticsChartDataItem> market;

  public static final String SERIALIZED_NAME_SPORT = "Sport";
  @SerializedName(SERIALIZED_NAME_SPORT)
  private List<StatisticsChartDataItem> sport;

  public StatisticsGroupChartItem() {
  }

  public StatisticsGroupChartItem category(List<StatisticsChartDataItem> category) {
    this.category = category;
    return this;
  }

  public StatisticsGroupChartItem addCategoryItem(StatisticsChartDataItem categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public List<StatisticsChartDataItem> getCategory() {
    return category;
  }

  public void setCategory(List<StatisticsChartDataItem> category) {
    this.category = category;
  }


  public StatisticsGroupChartItem market(List<StatisticsChartDataItem> market) {
    this.market = market;
    return this;
  }

  public StatisticsGroupChartItem addMarketItem(StatisticsChartDataItem marketItem) {
    if (this.market == null) {
      this.market = new ArrayList<>();
    }
    this.market.add(marketItem);
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nullable
  public List<StatisticsChartDataItem> getMarket() {
    return market;
  }

  public void setMarket(List<StatisticsChartDataItem> market) {
    this.market = market;
  }


  public StatisticsGroupChartItem sport(List<StatisticsChartDataItem> sport) {
    this.sport = sport;
    return this;
  }

  public StatisticsGroupChartItem addSportItem(StatisticsChartDataItem sportItem) {
    if (this.sport == null) {
      this.sport = new ArrayList<>();
    }
    this.sport.add(sportItem);
    return this;
  }

   /**
   * Get sport
   * @return sport
  **/
  @javax.annotation.Nullable
  public List<StatisticsChartDataItem> getSport() {
    return sport;
  }

  public void setSport(List<StatisticsChartDataItem> sport) {
    this.sport = sport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsGroupChartItem statisticsGroupChartItem = (StatisticsGroupChartItem) o;
    return Objects.equals(this.category, statisticsGroupChartItem.category) &&
        Objects.equals(this.market, statisticsGroupChartItem.market) &&
        Objects.equals(this.sport, statisticsGroupChartItem.sport);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, market, sport);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsGroupChartItem {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    sport: ").append(toIndentedString(sport)).append("\n");
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
    openapiFields.add("Category");
    openapiFields.add("Market");
    openapiFields.add("Sport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StatisticsGroupChartItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatisticsGroupChartItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatisticsGroupChartItem is not found in the empty JSON string", StatisticsGroupChartItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatisticsGroupChartItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatisticsGroupChartItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull()) {
        JsonArray jsonArraycategory = jsonObj.getAsJsonArray("Category");
        if (jsonArraycategory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Category").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Category` to be an array in the JSON string but got `%s`", jsonObj.get("Category").toString()));
          }

          // validate the optional field `Category` (array)
          for (int i = 0; i < jsonArraycategory.size(); i++) {
            StatisticsChartDataItem.validateJsonElement(jsonArraycategory.get(i));
          };
        }
      }
      if (jsonObj.get("Market") != null && !jsonObj.get("Market").isJsonNull()) {
        JsonArray jsonArraymarket = jsonObj.getAsJsonArray("Market");
        if (jsonArraymarket != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Market").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Market` to be an array in the JSON string but got `%s`", jsonObj.get("Market").toString()));
          }

          // validate the optional field `Market` (array)
          for (int i = 0; i < jsonArraymarket.size(); i++) {
            StatisticsChartDataItem.validateJsonElement(jsonArraymarket.get(i));
          };
        }
      }
      if (jsonObj.get("Sport") != null && !jsonObj.get("Sport").isJsonNull()) {
        JsonArray jsonArraysport = jsonObj.getAsJsonArray("Sport");
        if (jsonArraysport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Sport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Sport` to be an array in the JSON string but got `%s`", jsonObj.get("Sport").toString()));
          }

          // validate the optional field `Sport` (array)
          for (int i = 0; i < jsonArraysport.size(); i++) {
            StatisticsChartDataItem.validateJsonElement(jsonArraysport.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatisticsGroupChartItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatisticsGroupChartItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatisticsGroupChartItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatisticsGroupChartItem.class));

       return (TypeAdapter<T>) new TypeAdapter<StatisticsGroupChartItem>() {
           @Override
           public void write(JsonWriter out, StatisticsGroupChartItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatisticsGroupChartItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatisticsGroupChartItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatisticsGroupChartItem
  * @throws IOException if the JSON string is invalid with respect to StatisticsGroupChartItem
  */
  public static StatisticsGroupChartItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatisticsGroupChartItem.class);
  }

 /**
  * Convert an instance of StatisticsGroupChartItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

