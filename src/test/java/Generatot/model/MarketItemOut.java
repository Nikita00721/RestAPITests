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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * MarketItemOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class MarketItemOut {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_MARKET_NAME = "MarketName";
  @SerializedName(SERIALIZED_NAME_MARKET_NAME)
  private String marketName;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_VALUE = "SpecialOddsValue";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_VALUE)
  private String specialOddsValue;

  public MarketItemOut() {
  }

  public MarketItemOut marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public MarketItemOut marketName(String marketName) {
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


  public MarketItemOut specialOddsValue(String specialOddsValue) {
    this.specialOddsValue = specialOddsValue;
    return this;
  }

   /**
   * Get specialOddsValue
   * @return specialOddsValue
  **/
  @javax.annotation.Nullable
  public String getSpecialOddsValue() {
    return specialOddsValue;
  }

  public void setSpecialOddsValue(String specialOddsValue) {
    this.specialOddsValue = specialOddsValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketItemOut marketItemOut = (MarketItemOut) o;
    return Objects.equals(this.marketTypeId, marketItemOut.marketTypeId) &&
        Objects.equals(this.marketName, marketItemOut.marketName) &&
        Objects.equals(this.specialOddsValue, marketItemOut.specialOddsValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, marketName, specialOddsValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketItemOut {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    marketName: ").append(toIndentedString(marketName)).append("\n");
    sb.append("    specialOddsValue: ").append(toIndentedString(specialOddsValue)).append("\n");
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
    openapiFields.add("MarketTypeId");
    openapiFields.add("MarketName");
    openapiFields.add("SpecialOddsValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MarketTypeId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketItemOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketItemOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketItemOut is not found in the empty JSON string", MarketItemOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketItemOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketItemOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MarketItemOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MarketName") != null && !jsonObj.get("MarketName").isJsonNull()) && !jsonObj.get("MarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketName").toString()));
      }
      if ((jsonObj.get("SpecialOddsValue") != null && !jsonObj.get("SpecialOddsValue").isJsonNull()) && !jsonObj.get("SpecialOddsValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SpecialOddsValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SpecialOddsValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketItemOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketItemOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketItemOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketItemOut.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketItemOut>() {
           @Override
           public void write(JsonWriter out, MarketItemOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketItemOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketItemOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketItemOut
  * @throws IOException if the JSON string is invalid with respect to MarketItemOut
  */
  public static MarketItemOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketItemOut.class);
  }

 /**
  * Convert an instance of MarketItemOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

