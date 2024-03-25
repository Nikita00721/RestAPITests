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
 * ISelectionCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class ISelectionCode {
  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_MARKET_NAME = "MarketName";
  @SerializedName(SERIALIZED_NAME_MARKET_NAME)
  private String marketName;

  public static final String SERIALIZED_NAME_SELECTION_NAME = "SelectionName";
  @SerializedName(SERIALIZED_NAME_SELECTION_NAME)
  private String selectionName;

  public static final String SERIALIZED_NAME_FAST_CODE = "FastCode";
  @SerializedName(SERIALIZED_NAME_FAST_CODE)
  private String fastCode;

  public ISelectionCode() {
  }

  public ISelectionCode sportName(String sportName) {
    this.sportName = sportName;
    return this;
  }

   /**
   * Get sportName
   * @return sportName
  **/
  @javax.annotation.Nonnull
  public String getSportName() {
    return sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }


  public ISelectionCode marketName(String marketName) {
    this.marketName = marketName;
    return this;
  }

   /**
   * Get marketName
   * @return marketName
  **/
  @javax.annotation.Nonnull
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }


  public ISelectionCode selectionName(String selectionName) {
    this.selectionName = selectionName;
    return this;
  }

   /**
   * Get selectionName
   * @return selectionName
  **/
  @javax.annotation.Nonnull
  public String getSelectionName() {
    return selectionName;
  }

  public void setSelectionName(String selectionName) {
    this.selectionName = selectionName;
  }


  public ISelectionCode fastCode(String fastCode) {
    this.fastCode = fastCode;
    return this;
  }

   /**
   * Get fastCode
   * @return fastCode
  **/
  @javax.annotation.Nonnull
  public String getFastCode() {
    return fastCode;
  }

  public void setFastCode(String fastCode) {
    this.fastCode = fastCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ISelectionCode iselectionCode = (ISelectionCode) o;
    return Objects.equals(this.sportName, iselectionCode.sportName) &&
        Objects.equals(this.marketName, iselectionCode.marketName) &&
        Objects.equals(this.selectionName, iselectionCode.selectionName) &&
        Objects.equals(this.fastCode, iselectionCode.fastCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportName, marketName, selectionName, fastCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ISelectionCode {\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    marketName: ").append(toIndentedString(marketName)).append("\n");
    sb.append("    selectionName: ").append(toIndentedString(selectionName)).append("\n");
    sb.append("    fastCode: ").append(toIndentedString(fastCode)).append("\n");
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
    openapiFields.add("SportName");
    openapiFields.add("MarketName");
    openapiFields.add("SelectionName");
    openapiFields.add("FastCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SportName");
    openapiRequiredFields.add("MarketName");
    openapiRequiredFields.add("SelectionName");
    openapiRequiredFields.add("FastCode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ISelectionCode
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ISelectionCode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ISelectionCode is not found in the empty JSON string", ISelectionCode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ISelectionCode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ISelectionCode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ISelectionCode.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if (!jsonObj.get("MarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketName").toString()));
      }
      if (!jsonObj.get("SelectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SelectionName").toString()));
      }
      if (!jsonObj.get("FastCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FastCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FastCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ISelectionCode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ISelectionCode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ISelectionCode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ISelectionCode.class));

       return (TypeAdapter<T>) new TypeAdapter<ISelectionCode>() {
           @Override
           public void write(JsonWriter out, ISelectionCode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ISelectionCode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ISelectionCode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ISelectionCode
  * @throws IOException if the JSON string is invalid with respect to ISelectionCode
  */
  public static ISelectionCode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ISelectionCode.class);
  }

 /**
  * Convert an instance of ISelectionCode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
