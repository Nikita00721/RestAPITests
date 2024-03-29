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
 * UpdateSpecialOddsTypeGlobalTranslationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateSpecialOddsTypeGlobalTranslationRequest {
  public static final String SERIALIZED_NAME_LANGUAGE_ID = "LanguageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private Integer languageId;

  public static final String SERIALIZED_NAME_GLOBAL_TRANSLATION = "GlobalTranslation";
  @SerializedName(SERIALIZED_NAME_GLOBAL_TRANSLATION)
  private String globalTranslation;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_TYPE_ID = "SpecialOddsTypeId";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_TYPE_ID)
  private Integer specialOddsTypeId;

  public UpdateSpecialOddsTypeGlobalTranslationRequest() {
  }

  public UpdateSpecialOddsTypeGlobalTranslationRequest languageId(Integer languageId) {
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


  public UpdateSpecialOddsTypeGlobalTranslationRequest globalTranslation(String globalTranslation) {
    this.globalTranslation = globalTranslation;
    return this;
  }

   /**
   * Get globalTranslation
   * @return globalTranslation
  **/
  @javax.annotation.Nullable
  public String getGlobalTranslation() {
    return globalTranslation;
  }

  public void setGlobalTranslation(String globalTranslation) {
    this.globalTranslation = globalTranslation;
  }


  public UpdateSpecialOddsTypeGlobalTranslationRequest specialOddsTypeId(Integer specialOddsTypeId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSpecialOddsTypeGlobalTranslationRequest updateSpecialOddsTypeGlobalTranslationRequest = (UpdateSpecialOddsTypeGlobalTranslationRequest) o;
    return Objects.equals(this.languageId, updateSpecialOddsTypeGlobalTranslationRequest.languageId) &&
        Objects.equals(this.globalTranslation, updateSpecialOddsTypeGlobalTranslationRequest.globalTranslation) &&
        Objects.equals(this.specialOddsTypeId, updateSpecialOddsTypeGlobalTranslationRequest.specialOddsTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageId, globalTranslation, specialOddsTypeId);
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
    sb.append("class UpdateSpecialOddsTypeGlobalTranslationRequest {\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    globalTranslation: ").append(toIndentedString(globalTranslation)).append("\n");
    sb.append("    specialOddsTypeId: ").append(toIndentedString(specialOddsTypeId)).append("\n");
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
    openapiFields.add("LanguageId");
    openapiFields.add("GlobalTranslation");
    openapiFields.add("SpecialOddsTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateSpecialOddsTypeGlobalTranslationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateSpecialOddsTypeGlobalTranslationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSpecialOddsTypeGlobalTranslationRequest is not found in the empty JSON string", UpdateSpecialOddsTypeGlobalTranslationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateSpecialOddsTypeGlobalTranslationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSpecialOddsTypeGlobalTranslationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("GlobalTranslation") != null && !jsonObj.get("GlobalTranslation").isJsonNull()) && !jsonObj.get("GlobalTranslation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalTranslation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalTranslation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSpecialOddsTypeGlobalTranslationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSpecialOddsTypeGlobalTranslationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSpecialOddsTypeGlobalTranslationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSpecialOddsTypeGlobalTranslationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSpecialOddsTypeGlobalTranslationRequest>() {
           @Override
           public void write(JsonWriter out, UpdateSpecialOddsTypeGlobalTranslationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSpecialOddsTypeGlobalTranslationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSpecialOddsTypeGlobalTranslationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSpecialOddsTypeGlobalTranslationRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateSpecialOddsTypeGlobalTranslationRequest
  */
  public static UpdateSpecialOddsTypeGlobalTranslationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSpecialOddsTypeGlobalTranslationRequest.class);
  }

 /**
  * Convert an instance of UpdateSpecialOddsTypeGlobalTranslationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

