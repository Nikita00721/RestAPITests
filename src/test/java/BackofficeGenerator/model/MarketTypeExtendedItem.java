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
 * MarketTypeExtendedItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketTypeExtendedItem {
  public static final String SERIALIZED_NAME_MARKET_TYPE_NAME = "MarketTypeName";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_NAME)
  private String marketTypeName;

  public static final String SERIALIZED_NAME_HIDE_IN_ACTIVE_SELECTIONS = "HideInActiveSelections";
  @SerializedName(SERIALIZED_NAME_HIDE_IN_ACTIVE_SELECTIONS)
  private Boolean hideInActiveSelections;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public MarketTypeExtendedItem() {
  }

  public MarketTypeExtendedItem marketTypeName(String marketTypeName) {
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


  public MarketTypeExtendedItem hideInActiveSelections(Boolean hideInActiveSelections) {
    this.hideInActiveSelections = hideInActiveSelections;
    return this;
  }

   /**
   * Get hideInActiveSelections
   * @return hideInActiveSelections
  **/
  @javax.annotation.Nullable
  public Boolean getHideInActiveSelections() {
    return hideInActiveSelections;
  }

  public void setHideInActiveSelections(Boolean hideInActiveSelections) {
    this.hideInActiveSelections = hideInActiveSelections;
  }


  public MarketTypeExtendedItem marketTypeId(Integer marketTypeId) {
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
    MarketTypeExtendedItem marketTypeExtendedItem = (MarketTypeExtendedItem) o;
    return Objects.equals(this.marketTypeName, marketTypeExtendedItem.marketTypeName) &&
        Objects.equals(this.hideInActiveSelections, marketTypeExtendedItem.hideInActiveSelections) &&
        Objects.equals(this.marketTypeId, marketTypeExtendedItem.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeName, hideInActiveSelections, marketTypeId);
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
    sb.append("class MarketTypeExtendedItem {\n");
    sb.append("    marketTypeName: ").append(toIndentedString(marketTypeName)).append("\n");
    sb.append("    hideInActiveSelections: ").append(toIndentedString(hideInActiveSelections)).append("\n");
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
    openapiFields.add("HideInActiveSelections");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketTypeExtendedItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketTypeExtendedItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketTypeExtendedItem is not found in the empty JSON string", MarketTypeExtendedItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketTypeExtendedItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketTypeExtendedItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!MarketTypeExtendedItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketTypeExtendedItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketTypeExtendedItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketTypeExtendedItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketTypeExtendedItem>() {
           @Override
           public void write(JsonWriter out, MarketTypeExtendedItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketTypeExtendedItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketTypeExtendedItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketTypeExtendedItem
  * @throws IOException if the JSON string is invalid with respect to MarketTypeExtendedItem
  */
  public static MarketTypeExtendedItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketTypeExtendedItem.class);
  }

 /**
  * Convert an instance of MarketTypeExtendedItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
