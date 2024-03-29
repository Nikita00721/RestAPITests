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
 * OverrideSpecialOddsTypeTranslationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class OverrideSpecialOddsTypeTranslationRequest {
  public static final String SERIALIZED_NAME_SPECIAL_ODDS_TYPE_ID = "SpecialOddsTypeId";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_TYPE_ID)
  private Integer specialOddsTypeId;

  public static final String SERIALIZED_NAME_LANGUAGE_ID = "LanguageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private Integer languageId;

  public static final String SERIALIZED_NAME_CUSTOM_TRANSLATION = "CustomTranslation";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TRANSLATION)
  private String customTranslation;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public OverrideSpecialOddsTypeTranslationRequest() {
  }

  public OverrideSpecialOddsTypeTranslationRequest specialOddsTypeId(Integer specialOddsTypeId) {
    this.specialOddsTypeId = specialOddsTypeId;
    return this;
  }

   /**
   * Get specialOddsTypeId
   * @return specialOddsTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSpecialOddsTypeId() {
    return specialOddsTypeId;
  }

  public void setSpecialOddsTypeId(Integer specialOddsTypeId) {
    this.specialOddsTypeId = specialOddsTypeId;
  }


  public OverrideSpecialOddsTypeTranslationRequest languageId(Integer languageId) {
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


  public OverrideSpecialOddsTypeTranslationRequest customTranslation(String customTranslation) {
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


  public OverrideSpecialOddsTypeTranslationRequest configId(Integer configId) {
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
    OverrideSpecialOddsTypeTranslationRequest overrideSpecialOddsTypeTranslationRequest = (OverrideSpecialOddsTypeTranslationRequest) o;
    return Objects.equals(this.specialOddsTypeId, overrideSpecialOddsTypeTranslationRequest.specialOddsTypeId) &&
        Objects.equals(this.languageId, overrideSpecialOddsTypeTranslationRequest.languageId) &&
        Objects.equals(this.customTranslation, overrideSpecialOddsTypeTranslationRequest.customTranslation) &&
        Objects.equals(this.configId, overrideSpecialOddsTypeTranslationRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialOddsTypeId, languageId, customTranslation, configId);
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
    sb.append("class OverrideSpecialOddsTypeTranslationRequest {\n");
    sb.append("    specialOddsTypeId: ").append(toIndentedString(specialOddsTypeId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    customTranslation: ").append(toIndentedString(customTranslation)).append("\n");
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
    openapiFields.add("SpecialOddsTypeId");
    openapiFields.add("LanguageId");
    openapiFields.add("CustomTranslation");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OverrideSpecialOddsTypeTranslationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OverrideSpecialOddsTypeTranslationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverrideSpecialOddsTypeTranslationRequest is not found in the empty JSON string", OverrideSpecialOddsTypeTranslationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OverrideSpecialOddsTypeTranslationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OverrideSpecialOddsTypeTranslationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CustomTranslation") != null && !jsonObj.get("CustomTranslation").isJsonNull()) && !jsonObj.get("CustomTranslation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomTranslation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomTranslation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverrideSpecialOddsTypeTranslationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverrideSpecialOddsTypeTranslationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverrideSpecialOddsTypeTranslationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverrideSpecialOddsTypeTranslationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OverrideSpecialOddsTypeTranslationRequest>() {
           @Override
           public void write(JsonWriter out, OverrideSpecialOddsTypeTranslationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OverrideSpecialOddsTypeTranslationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OverrideSpecialOddsTypeTranslationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverrideSpecialOddsTypeTranslationRequest
  * @throws IOException if the JSON string is invalid with respect to OverrideSpecialOddsTypeTranslationRequest
  */
  public static OverrideSpecialOddsTypeTranslationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverrideSpecialOddsTypeTranslationRequest.class);
  }

 /**
  * Convert an instance of OverrideSpecialOddsTypeTranslationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

