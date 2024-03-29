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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * GetSelectionGlobalTranslationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetSelectionGlobalTranslationsRequest {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_SELECTION_TYPE_ID = "SelectionTypeId";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE_ID)
  private Integer selectionTypeId;

  public static final String SERIALIZED_NAME_IS_UNTRANSLATED = "IsUntranslated";
  @SerializedName(SERIALIZED_NAME_IS_UNTRANSLATED)
  private Boolean isUntranslated;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public GetSelectionGlobalTranslationsRequest() {
  }

  public GetSelectionGlobalTranslationsRequest marketTypeId(Integer marketTypeId) {
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


  public GetSelectionGlobalTranslationsRequest selectionTypeId(Integer selectionTypeId) {
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


  public GetSelectionGlobalTranslationsRequest isUntranslated(Boolean isUntranslated) {
    this.isUntranslated = isUntranslated;
    return this;
  }

   /**
   * Get isUntranslated
   * @return isUntranslated
  **/
  @javax.annotation.Nullable
  public Boolean getIsUntranslated() {
    return isUntranslated;
  }

  public void setIsUntranslated(Boolean isUntranslated) {
    this.isUntranslated = isUntranslated;
  }


  public GetSelectionGlobalTranslationsRequest sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelectionGlobalTranslationsRequest getSelectionGlobalTranslationsRequest = (GetSelectionGlobalTranslationsRequest) o;
    return Objects.equals(this.marketTypeId, getSelectionGlobalTranslationsRequest.marketTypeId) &&
        Objects.equals(this.selectionTypeId, getSelectionGlobalTranslationsRequest.selectionTypeId) &&
        Objects.equals(this.isUntranslated, getSelectionGlobalTranslationsRequest.isUntranslated) &&
        Objects.equals(this.sportTypeId, getSelectionGlobalTranslationsRequest.sportTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, selectionTypeId, isUntranslated, sportTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelectionGlobalTranslationsRequest {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    selectionTypeId: ").append(toIndentedString(selectionTypeId)).append("\n");
    sb.append("    isUntranslated: ").append(toIndentedString(isUntranslated)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
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
    openapiFields.add("SelectionTypeId");
    openapiFields.add("IsUntranslated");
    openapiFields.add("SportTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSelectionGlobalTranslationsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSelectionGlobalTranslationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSelectionGlobalTranslationsRequest is not found in the empty JSON string", GetSelectionGlobalTranslationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSelectionGlobalTranslationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSelectionGlobalTranslationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSelectionGlobalTranslationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSelectionGlobalTranslationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSelectionGlobalTranslationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSelectionGlobalTranslationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSelectionGlobalTranslationsRequest>() {
           @Override
           public void write(JsonWriter out, GetSelectionGlobalTranslationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSelectionGlobalTranslationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSelectionGlobalTranslationsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSelectionGlobalTranslationsRequest
  * @throws IOException if the JSON string is invalid with respect to GetSelectionGlobalTranslationsRequest
  */
  public static GetSelectionGlobalTranslationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSelectionGlobalTranslationsRequest.class);
  }

 /**
  * Convert an instance of GetSelectionGlobalTranslationsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

