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
 * ChangeOutrightGroupsConfigAccessTypeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChangeOutrightGroupsConfigAccessTypeRequest {
  public static final String SERIALIZED_NAME_ACCESS_TYPE = "AccessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private AccessTypes accessType;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public ChangeOutrightGroupsConfigAccessTypeRequest() {
  }

  public ChangeOutrightGroupsConfigAccessTypeRequest accessType(AccessTypes accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nullable
  public AccessTypes getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypes accessType) {
    this.accessType = accessType;
  }


  public ChangeOutrightGroupsConfigAccessTypeRequest configId(Integer configId) {
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
    ChangeOutrightGroupsConfigAccessTypeRequest changeOutrightGroupsConfigAccessTypeRequest = (ChangeOutrightGroupsConfigAccessTypeRequest) o;
    return Objects.equals(this.accessType, changeOutrightGroupsConfigAccessTypeRequest.accessType) &&
        Objects.equals(this.configId, changeOutrightGroupsConfigAccessTypeRequest.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeOutrightGroupsConfigAccessTypeRequest {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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
    openapiFields.add("AccessType");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeOutrightGroupsConfigAccessTypeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeOutrightGroupsConfigAccessTypeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeOutrightGroupsConfigAccessTypeRequest is not found in the empty JSON string", ChangeOutrightGroupsConfigAccessTypeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeOutrightGroupsConfigAccessTypeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeOutrightGroupsConfigAccessTypeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccessType`
      if (jsonObj.get("AccessType") != null && !jsonObj.get("AccessType").isJsonNull()) {
        AccessTypes.validateJsonElement(jsonObj.get("AccessType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeOutrightGroupsConfigAccessTypeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeOutrightGroupsConfigAccessTypeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeOutrightGroupsConfigAccessTypeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeOutrightGroupsConfigAccessTypeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeOutrightGroupsConfigAccessTypeRequest>() {
           @Override
           public void write(JsonWriter out, ChangeOutrightGroupsConfigAccessTypeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeOutrightGroupsConfigAccessTypeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeOutrightGroupsConfigAccessTypeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeOutrightGroupsConfigAccessTypeRequest
  * @throws IOException if the JSON string is invalid with respect to ChangeOutrightGroupsConfigAccessTypeRequest
  */
  public static ChangeOutrightGroupsConfigAccessTypeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeOutrightGroupsConfigAccessTypeRequest.class);
  }

 /**
  * Convert an instance of ChangeOutrightGroupsConfigAccessTypeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
