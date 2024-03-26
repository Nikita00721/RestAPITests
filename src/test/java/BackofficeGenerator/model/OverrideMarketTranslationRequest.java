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
 * OverrideMarketTranslationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class OverrideMarketTranslationRequest {
  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_LANGUAGE_ID = "LanguageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private Integer languageId;

  public static final String SERIALIZED_NAME_CUSTOM_TRANSLATION = "CustomTranslation";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TRANSLATION)
  private String customTranslation;

  public static final String SERIALIZED_NAME_CUSTOM_DESCRIPTION = "CustomDescription";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DESCRIPTION)
  private String customDescription;

  public static final String SERIALIZED_NAME_GENDER = "Gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Integer gender;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public OverrideMarketTranslationRequest() {
  }

  public OverrideMarketTranslationRequest sportTypeId(Integer sportTypeId) {
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


  public OverrideMarketTranslationRequest marketTypeId(Integer marketTypeId) {
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


  public OverrideMarketTranslationRequest languageId(Integer languageId) {
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


  public OverrideMarketTranslationRequest customTranslation(String customTranslation) {
    this.customTranslation = customTranslation;
    return this;
  }

   /**
   * Get customTranslation
   * @return customTranslation
  **/
  @javax.annotation.Nullable
  public String getCustomTranslation() {
    return customTranslation;
  }

  public void setCustomTranslation(String customTranslation) {
    this.customTranslation = customTranslation;
  }


  public OverrideMarketTranslationRequest customDescription(String customDescription) {
    this.customDescription = customDescription;
    return this;
  }

   /**
   * Get customDescription
   * @return customDescription
  **/
  @javax.annotation.Nullable
  public String getCustomDescription() {
    return customDescription;
  }

  public void setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
  }


  public OverrideMarketTranslationRequest gender(Integer gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public OverrideMarketTranslationRequest configId(Integer configId) {
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
    OverrideMarketTranslationRequest overrideMarketTranslationRequest = (OverrideMarketTranslationRequest) o;
    return Objects.equals(this.sportTypeId, overrideMarketTranslationRequest.sportTypeId) &&
        Objects.equals(this.marketTypeId, overrideMarketTranslationRequest.marketTypeId) &&
        Objects.equals(this.languageId, overrideMarketTranslationRequest.languageId) &&
        Objects.equals(this.customTranslation, overrideMarketTranslationRequest.customTranslation) &&
        Objects.equals(this.customDescription, overrideMarketTranslationRequest.customDescription) &&
        Objects.equals(this.gender, overrideMarketTranslationRequest.gender) &&
        Objects.equals(this.configId, overrideMarketTranslationRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportTypeId, marketTypeId, languageId, customTranslation, customDescription, gender, configId);
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
    sb.append("class OverrideMarketTranslationRequest {\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    customTranslation: ").append(toIndentedString(customTranslation)).append("\n");
    sb.append("    customDescription: ").append(toIndentedString(customDescription)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
    openapiFields.add("LanguageId");
    openapiFields.add("CustomTranslation");
    openapiFields.add("CustomDescription");
    openapiFields.add("Gender");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OverrideMarketTranslationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OverrideMarketTranslationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverrideMarketTranslationRequest is not found in the empty JSON string", OverrideMarketTranslationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OverrideMarketTranslationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OverrideMarketTranslationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CustomTranslation") != null && !jsonObj.get("CustomTranslation").isJsonNull()) && !jsonObj.get("CustomTranslation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomTranslation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomTranslation").toString()));
      }
      if ((jsonObj.get("CustomDescription") != null && !jsonObj.get("CustomDescription").isJsonNull()) && !jsonObj.get("CustomDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverrideMarketTranslationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverrideMarketTranslationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverrideMarketTranslationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverrideMarketTranslationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OverrideMarketTranslationRequest>() {
           @Override
           public void write(JsonWriter out, OverrideMarketTranslationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OverrideMarketTranslationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OverrideMarketTranslationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverrideMarketTranslationRequest
  * @throws IOException if the JSON string is invalid with respect to OverrideMarketTranslationRequest
  */
  public static OverrideMarketTranslationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverrideMarketTranslationRequest.class);
  }

 /**
  * Convert an instance of OverrideMarketTranslationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
