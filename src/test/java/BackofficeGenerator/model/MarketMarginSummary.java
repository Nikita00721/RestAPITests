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
 * MarketMarginSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketMarginSummary {
  public static final String SERIALIZED_NAME_MARKET_TYPE_NAME = "MarketTypeName";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_NAME)
  private String marketTypeName;

  public static final String SERIALIZED_NAME_SELECTIONS_NUMBER = "SelectionsNumber";
  @SerializedName(SERIALIZED_NAME_SELECTIONS_NUMBER)
  private Integer selectionsNumber;

  public static final String SERIALIZED_NAME_HAS_LINES = "HasLines";
  @SerializedName(SERIALIZED_NAME_HAS_LINES)
  private Boolean hasLines;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public MarketMarginSummary() {
  }

  public MarketMarginSummary marketTypeName(String marketTypeName) {
    this.marketTypeName = marketTypeName;
    return this;
  }

   /**
   * Get marketTypeName
   * @return marketTypeName
  **/
  @javax.annotation.Nullable
  public String getMarketTypeName() {
    return marketTypeName;
  }

  public void setMarketTypeName(String marketTypeName) {
    this.marketTypeName = marketTypeName;
  }


  public MarketMarginSummary selectionsNumber(Integer selectionsNumber) {
    this.selectionsNumber = selectionsNumber;
    return this;
  }

   /**
   * Get selectionsNumber
   * @return selectionsNumber
  **/
  @javax.annotation.Nullable
  public Integer getSelectionsNumber() {
    return selectionsNumber;
  }

  public void setSelectionsNumber(Integer selectionsNumber) {
    this.selectionsNumber = selectionsNumber;
  }


  public MarketMarginSummary hasLines(Boolean hasLines) {
    this.hasLines = hasLines;
    return this;
  }

   /**
   * Get hasLines
   * @return hasLines
  **/
  @javax.annotation.Nullable
  public Boolean getHasLines() {
    return hasLines;
  }

  public void setHasLines(Boolean hasLines) {
    this.hasLines = hasLines;
  }


  public MarketMarginSummary value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  public MarketMarginSummary marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketMarginSummary marketMarginSummary = (MarketMarginSummary) o;
    return Objects.equals(this.marketTypeName, marketMarginSummary.marketTypeName) &&
        Objects.equals(this.selectionsNumber, marketMarginSummary.selectionsNumber) &&
        Objects.equals(this.hasLines, marketMarginSummary.hasLines) &&
        Objects.equals(this.value, marketMarginSummary.value) &&
        Objects.equals(this.marketTypeId, marketMarginSummary.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeName, selectionsNumber, hasLines, value, marketTypeId);
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
    sb.append("class MarketMarginSummary {\n");
    sb.append("    marketTypeName: ").append(toIndentedString(marketTypeName)).append("\n");
    sb.append("    selectionsNumber: ").append(toIndentedString(selectionsNumber)).append("\n");
    sb.append("    hasLines: ").append(toIndentedString(hasLines)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
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
    openapiFields.add("MarketTypeName");
    openapiFields.add("SelectionsNumber");
    openapiFields.add("HasLines");
    openapiFields.add("Value");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketMarginSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketMarginSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketMarginSummary is not found in the empty JSON string", MarketMarginSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketMarginSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketMarginSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MarketTypeName") != null && !jsonObj.get("MarketTypeName").isJsonNull()) && !jsonObj.get("MarketTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketTypeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketMarginSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketMarginSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketMarginSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketMarginSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketMarginSummary>() {
           @Override
           public void write(JsonWriter out, MarketMarginSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketMarginSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketMarginSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketMarginSummary
  * @throws IOException if the JSON string is invalid with respect to MarketMarginSummary
  */
  public static MarketMarginSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketMarginSummary.class);
  }

 /**
  * Convert an instance of MarketMarginSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
