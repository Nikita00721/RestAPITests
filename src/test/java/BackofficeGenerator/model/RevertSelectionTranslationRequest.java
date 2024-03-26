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
 * RevertSelectionTranslationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class RevertSelectionTranslationRequest {
  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_SELECTION_TYPE_ID = "SelectionTypeId";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE_ID)
  private Integer selectionTypeId;

  public static final String SERIALIZED_NAME_LANGUAGE_ID = "LanguageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private Integer languageId;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public RevertSelectionTranslationRequest() {
  }

  public RevertSelectionTranslationRequest sportTypeId(Integer sportTypeId) {
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


  public RevertSelectionTranslationRequest marketTypeId(Integer marketTypeId) {
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


  public RevertSelectionTranslationRequest selectionTypeId(Integer selectionTypeId) {
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


  public RevertSelectionTranslationRequest languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @javax.annotation.Nullable
  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  public RevertSelectionTranslationRequest configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevertSelectionTranslationRequest revertSelectionTranslationRequest = (RevertSelectionTranslationRequest) o;
    return Objects.equals(this.sportTypeId, revertSelectionTranslationRequest.sportTypeId) &&
        Objects.equals(this.marketTypeId, revertSelectionTranslationRequest.marketTypeId) &&
        Objects.equals(this.selectionTypeId, revertSelectionTranslationRequest.selectionTypeId) &&
        Objects.equals(this.languageId, revertSelectionTranslationRequest.languageId) &&
        Objects.equals(this.configId, revertSelectionTranslationRequest.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportTypeId, marketTypeId, selectionTypeId, languageId, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevertSelectionTranslationRequest {\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    selectionTypeId: ").append(toIndentedString(selectionTypeId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
    openapiFields.add("SportTypeId");
    openapiFields.add("MarketTypeId");
    openapiFields.add("SelectionTypeId");
    openapiFields.add("LanguageId");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RevertSelectionTranslationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RevertSelectionTranslationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevertSelectionTranslationRequest is not found in the empty JSON string", RevertSelectionTranslationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RevertSelectionTranslationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevertSelectionTranslationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevertSelectionTranslationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevertSelectionTranslationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevertSelectionTranslationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevertSelectionTranslationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RevertSelectionTranslationRequest>() {
           @Override
           public void write(JsonWriter out, RevertSelectionTranslationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevertSelectionTranslationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevertSelectionTranslationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevertSelectionTranslationRequest
  * @throws IOException if the JSON string is invalid with respect to RevertSelectionTranslationRequest
  */
  public static RevertSelectionTranslationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevertSelectionTranslationRequest.class);
  }

 /**
  * Convert an instance of RevertSelectionTranslationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
