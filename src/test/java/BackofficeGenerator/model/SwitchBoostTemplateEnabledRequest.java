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
 * SwitchBoostTemplateEnabledRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SwitchBoostTemplateEnabledRequest {
  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_BOOST_TEMPLATE_ID = "BoostTemplateId";
  @SerializedName(SERIALIZED_NAME_BOOST_TEMPLATE_ID)
  private Integer boostTemplateId;

  public SwitchBoostTemplateEnabledRequest() {
  }

  public SwitchBoostTemplateEnabledRequest isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public SwitchBoostTemplateEnabledRequest boostTemplateId(Integer boostTemplateId) {
    this.boostTemplateId = boostTemplateId;
    return this;
  }

   /**
   * Get boostTemplateId
   * @return boostTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getBoostTemplateId() {
    return boostTemplateId;
  }

  public void setBoostTemplateId(Integer boostTemplateId) {
    this.boostTemplateId = boostTemplateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchBoostTemplateEnabledRequest switchBoostTemplateEnabledRequest = (SwitchBoostTemplateEnabledRequest) o;
    return Objects.equals(this.isEnabled, switchBoostTemplateEnabledRequest.isEnabled) &&
        Objects.equals(this.boostTemplateId, switchBoostTemplateEnabledRequest.boostTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, boostTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchBoostTemplateEnabledRequest {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    boostTemplateId: ").append(toIndentedString(boostTemplateId)).append("\n");
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
    openapiFields.add("IsEnabled");
    openapiFields.add("BoostTemplateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SwitchBoostTemplateEnabledRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SwitchBoostTemplateEnabledRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SwitchBoostTemplateEnabledRequest is not found in the empty JSON string", SwitchBoostTemplateEnabledRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SwitchBoostTemplateEnabledRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SwitchBoostTemplateEnabledRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SwitchBoostTemplateEnabledRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SwitchBoostTemplateEnabledRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SwitchBoostTemplateEnabledRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SwitchBoostTemplateEnabledRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SwitchBoostTemplateEnabledRequest>() {
           @Override
           public void write(JsonWriter out, SwitchBoostTemplateEnabledRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SwitchBoostTemplateEnabledRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SwitchBoostTemplateEnabledRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SwitchBoostTemplateEnabledRequest
  * @throws IOException if the JSON string is invalid with respect to SwitchBoostTemplateEnabledRequest
  */
  public static SwitchBoostTemplateEnabledRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SwitchBoostTemplateEnabledRequest.class);
  }

 /**
  * Convert an instance of SwitchBoostTemplateEnabledRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

