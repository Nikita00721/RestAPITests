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
 * MarketTypesResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketTypesResult {
  public static final String SERIALIZED_NAME_TOTAL_TURNOVER = "TotalTurnover";
  @SerializedName(SERIALIZED_NAME_TOTAL_TURNOVER)
  private Double totalTurnover;

  public static final String SERIALIZED_NAME_MARKET_TYPES = "MarketTypes";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPES)
  private List<LiabilityMarketTypeItem> marketTypes;

  public MarketTypesResult() {
  }

  public MarketTypesResult totalTurnover(Double totalTurnover) {
    this.totalTurnover = totalTurnover;
    return this;
  }

   /**
   * Get totalTurnover
   * @return totalTurnover
  **/
  @javax.annotation.Nullable
  public Double getTotalTurnover() {
    return totalTurnover;
  }

  public void setTotalTurnover(Double totalTurnover) {
    this.totalTurnover = totalTurnover;
  }


  public MarketTypesResult marketTypes(List<LiabilityMarketTypeItem> marketTypes) {
    this.marketTypes = marketTypes;
    return this;
  }

  public MarketTypesResult addMarketTypesItem(LiabilityMarketTypeItem marketTypesItem) {
    if (this.marketTypes == null) {
      this.marketTypes = new ArrayList<>();
    }
    this.marketTypes.add(marketTypesItem);
    return this;
  }

   /**
   * Get marketTypes
   * @return marketTypes
  **/
  @javax.annotation.Nullable
  public List<LiabilityMarketTypeItem> getMarketTypes() {
    return marketTypes;
  }

  public void setMarketTypes(List<LiabilityMarketTypeItem> marketTypes) {
    this.marketTypes = marketTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketTypesResult marketTypesResult = (MarketTypesResult) o;
    return Objects.equals(this.totalTurnover, marketTypesResult.totalTurnover) &&
        Objects.equals(this.marketTypes, marketTypesResult.marketTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTurnover, marketTypes);
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
    sb.append("class MarketTypesResult {\n");
    sb.append("    totalTurnover: ").append(toIndentedString(totalTurnover)).append("\n");
    sb.append("    marketTypes: ").append(toIndentedString(marketTypes)).append("\n");
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
    openapiFields.add("TotalTurnover");
    openapiFields.add("MarketTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketTypesResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketTypesResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketTypesResult is not found in the empty JSON string", MarketTypesResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketTypesResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketTypesResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("MarketTypes") != null && !jsonObj.get("MarketTypes").isJsonNull()) {
        JsonArray jsonArraymarketTypes = jsonObj.getAsJsonArray("MarketTypes");
        if (jsonArraymarketTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MarketTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MarketTypes` to be an array in the JSON string but got `%s`", jsonObj.get("MarketTypes").toString()));
          }

          // validate the optional field `MarketTypes` (array)
          for (int i = 0; i < jsonArraymarketTypes.size(); i++) {
            LiabilityMarketTypeItem.validateJsonElement(jsonArraymarketTypes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketTypesResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketTypesResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketTypesResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketTypesResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketTypesResult>() {
           @Override
           public void write(JsonWriter out, MarketTypesResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketTypesResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketTypesResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketTypesResult
  * @throws IOException if the JSON string is invalid with respect to MarketTypesResult
  */
  public static MarketTypesResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketTypesResult.class);
  }

 /**
  * Convert an instance of MarketTypesResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

