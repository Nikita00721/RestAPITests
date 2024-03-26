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
 * SwitchCompetitorsConfigPrivacyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SwitchCompetitorsConfigPrivacyRequest {
  public static final String SERIALIZED_NAME_IS_PRIVATE = "IsPrivate";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE)
  private Boolean isPrivate;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "AccessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private AccessTypes accessType;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public SwitchCompetitorsConfigPrivacyRequest() {
  }

  public SwitchCompetitorsConfigPrivacyRequest isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }


  public SwitchCompetitorsConfigPrivacyRequest accessType(AccessTypes accessType) {
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


  public SwitchCompetitorsConfigPrivacyRequest configId(Integer configId) {
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
    SwitchCompetitorsConfigPrivacyRequest switchCompetitorsConfigPrivacyRequest = (SwitchCompetitorsConfigPrivacyRequest) o;
    return Objects.equals(this.isPrivate, switchCompetitorsConfigPrivacyRequest.isPrivate) &&
        Objects.equals(this.accessType, switchCompetitorsConfigPrivacyRequest.accessType) &&
        Objects.equals(this.configId, switchCompetitorsConfigPrivacyRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrivate, accessType, configId);
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
    sb.append("class SwitchCompetitorsConfigPrivacyRequest {\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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
    openapiFields.add("IsPrivate");
    openapiFields.add("AccessType");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SwitchCompetitorsConfigPrivacyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SwitchCompetitorsConfigPrivacyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SwitchCompetitorsConfigPrivacyRequest is not found in the empty JSON string", SwitchCompetitorsConfigPrivacyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SwitchCompetitorsConfigPrivacyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SwitchCompetitorsConfigPrivacyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!SwitchCompetitorsConfigPrivacyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SwitchCompetitorsConfigPrivacyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SwitchCompetitorsConfigPrivacyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SwitchCompetitorsConfigPrivacyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SwitchCompetitorsConfigPrivacyRequest>() {
           @Override
           public void write(JsonWriter out, SwitchCompetitorsConfigPrivacyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SwitchCompetitorsConfigPrivacyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SwitchCompetitorsConfigPrivacyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SwitchCompetitorsConfigPrivacyRequest
  * @throws IOException if the JSON string is invalid with respect to SwitchCompetitorsConfigPrivacyRequest
  */
  public static SwitchCompetitorsConfigPrivacyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SwitchCompetitorsConfigPrivacyRequest.class);
  }

 /**
  * Convert an instance of SwitchCompetitorsConfigPrivacyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
