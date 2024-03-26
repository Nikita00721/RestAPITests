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
 * ChangeVSportGameEnableStateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChangeVSportGameEnableStateRequest {
  public static final String SERIALIZED_NAME_SKIN_CONFIG_ID = "SkinConfigId";
  @SerializedName(SERIALIZED_NAME_SKIN_CONFIG_ID)
  private Integer skinConfigId;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_VSPORT_GAME_ID = "VSportGameId";
  @SerializedName(SERIALIZED_NAME_VSPORT_GAME_ID)
  private Integer vsportGameId;

  public ChangeVSportGameEnableStateRequest() {
  }

  public ChangeVSportGameEnableStateRequest skinConfigId(Integer skinConfigId) {
    this.skinConfigId = skinConfigId;
    return this;
  }

   /**
   * Get skinConfigId
   * @return skinConfigId
  **/
  @javax.annotation.Nullable
  public Integer getSkinConfigId() {
    return skinConfigId;
  }

  public void setSkinConfigId(Integer skinConfigId) {
    this.skinConfigId = skinConfigId;
  }


  public ChangeVSportGameEnableStateRequest isEnabled(Boolean isEnabled) {
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


  public ChangeVSportGameEnableStateRequest vsportGameId(Integer vsportGameId) {
    this.vsportGameId = vsportGameId;
    return this;
  }

   /**
   * Get vsportGameId
   * @return vsportGameId
  **/
  @javax.annotation.Nullable
  public Integer getVsportGameId() {
    return vsportGameId;
  }

  public void setVsportGameId(Integer vsportGameId) {
    this.vsportGameId = vsportGameId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeVSportGameEnableStateRequest changeVSportGameEnableStateRequest = (ChangeVSportGameEnableStateRequest) o;
    return Objects.equals(this.skinConfigId, changeVSportGameEnableStateRequest.skinConfigId) &&
        Objects.equals(this.isEnabled, changeVSportGameEnableStateRequest.isEnabled) &&
        Objects.equals(this.vsportGameId, changeVSportGameEnableStateRequest.vsportGameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skinConfigId, isEnabled, vsportGameId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeVSportGameEnableStateRequest {\n");
    sb.append("    skinConfigId: ").append(toIndentedString(skinConfigId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    vsportGameId: ").append(toIndentedString(vsportGameId)).append("\n");
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
    openapiFields.add("SkinConfigId");
    openapiFields.add("IsEnabled");
    openapiFields.add("VSportGameId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeVSportGameEnableStateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeVSportGameEnableStateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeVSportGameEnableStateRequest is not found in the empty JSON string", ChangeVSportGameEnableStateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeVSportGameEnableStateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeVSportGameEnableStateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeVSportGameEnableStateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeVSportGameEnableStateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeVSportGameEnableStateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeVSportGameEnableStateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeVSportGameEnableStateRequest>() {
           @Override
           public void write(JsonWriter out, ChangeVSportGameEnableStateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeVSportGameEnableStateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeVSportGameEnableStateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeVSportGameEnableStateRequest
  * @throws IOException if the JSON string is invalid with respect to ChangeVSportGameEnableStateRequest
  */
  public static ChangeVSportGameEnableStateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeVSportGameEnableStateRequest.class);
  }

 /**
  * Convert an instance of ChangeVSportGameEnableStateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

