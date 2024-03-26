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
 * MarketSelectionItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketSelectionItem {
  public static final String SERIALIZED_NAME_MARKET_NAME = "MarketName";
  @SerializedName(SERIALIZED_NAME_MARKET_NAME)
  private String marketName;

  public static final String SERIALIZED_NAME_SELECTION_TYPE_ID = "SelectionTypeId";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE_ID)
  private Integer selectionTypeId;

  public static final String SERIALIZED_NAME_SELECTION_NAME = "SelectionName";
  @SerializedName(SERIALIZED_NAME_SELECTION_NAME)
  private String selectionName;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public MarketSelectionItem() {
  }

  public MarketSelectionItem marketName(String marketName) {
    this.marketName = marketName;
    return this;
  }

   /**
   * Get marketName
   * @return marketName
  **/
  @javax.annotation.Nullable
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }


  public MarketSelectionItem selectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
    return this;
  }

   /**
   * Get selectionTypeId
   * @return selectionTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSelectionTypeId() {
    return selectionTypeId;
  }

  public void setSelectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
  }


  public MarketSelectionItem selectionName(String selectionName) {
    this.selectionName = selectionName;
    return this;
  }

   /**
   * Get selectionName
   * @return selectionName
  **/
  @javax.annotation.Nullable
  public String getSelectionName() {
    return selectionName;
  }

  public void setSelectionName(String selectionName) {
    this.selectionName = selectionName;
  }


  public MarketSelectionItem marketTypeId(Integer marketTypeId) {
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
    MarketSelectionItem marketSelectionItem = (MarketSelectionItem) o;
    return Objects.equals(this.marketName, marketSelectionItem.marketName) &&
        Objects.equals(this.selectionTypeId, marketSelectionItem.selectionTypeId) &&
        Objects.equals(this.selectionName, marketSelectionItem.selectionName) &&
        Objects.equals(this.marketTypeId, marketSelectionItem.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketName, selectionTypeId, selectionName, marketTypeId);
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
    sb.append("class MarketSelectionItem {\n");
    sb.append("    marketName: ").append(toIndentedString(marketName)).append("\n");
    sb.append("    selectionTypeId: ").append(toIndentedString(selectionTypeId)).append("\n");
    sb.append("    selectionName: ").append(toIndentedString(selectionName)).append("\n");
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
    openapiFields.add("MarketName");
    openapiFields.add("SelectionTypeId");
    openapiFields.add("SelectionName");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketSelectionItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketSelectionItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketSelectionItem is not found in the empty JSON string", MarketSelectionItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketSelectionItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketSelectionItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MarketName") != null && !jsonObj.get("MarketName").isJsonNull()) && !jsonObj.get("MarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketName").toString()));
      }
      if ((jsonObj.get("SelectionName") != null && !jsonObj.get("SelectionName").isJsonNull()) && !jsonObj.get("SelectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SelectionName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketSelectionItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketSelectionItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketSelectionItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketSelectionItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketSelectionItem>() {
           @Override
           public void write(JsonWriter out, MarketSelectionItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketSelectionItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketSelectionItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketSelectionItem
  * @throws IOException if the JSON string is invalid with respect to MarketSelectionItem
  */
  public static MarketSelectionItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketSelectionItem.class);
  }

 /**
  * Convert an instance of MarketSelectionItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
