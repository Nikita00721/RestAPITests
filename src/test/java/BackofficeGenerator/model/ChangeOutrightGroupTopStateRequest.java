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
 * ChangeOutrightGroupTopStateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChangeOutrightGroupTopStateRequest {
  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Integer champId;

  public static final String SERIALIZED_NAME_IS_TOP = "IsTop";
  @SerializedName(SERIALIZED_NAME_IS_TOP)
  private Boolean isTop;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public ChangeOutrightGroupTopStateRequest() {
  }

  public ChangeOutrightGroupTopStateRequest champId(Integer champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nullable
  public Integer getChampId() {
    return champId;
  }

  public void setChampId(Integer champId) {
    this.champId = champId;
  }


  public ChangeOutrightGroupTopStateRequest isTop(Boolean isTop) {
    this.isTop = isTop;
    return this;
  }

   /**
   * Get isTop
   * @return isTop
  **/
  @javax.annotation.Nullable
  public Boolean getIsTop() {
    return isTop;
  }

  public void setIsTop(Boolean isTop) {
    this.isTop = isTop;
  }


  public ChangeOutrightGroupTopStateRequest groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeOutrightGroupTopStateRequest changeOutrightGroupTopStateRequest = (ChangeOutrightGroupTopStateRequest) o;
    return Objects.equals(this.champId, changeOutrightGroupTopStateRequest.champId) &&
        Objects.equals(this.isTop, changeOutrightGroupTopStateRequest.isTop) &&
        Objects.equals(this.groupId, changeOutrightGroupTopStateRequest.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(champId, isTop, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeOutrightGroupTopStateRequest {\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    isTop: ").append(toIndentedString(isTop)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
    openapiFields.add("ChampId");
    openapiFields.add("IsTop");
    openapiFields.add("GroupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeOutrightGroupTopStateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeOutrightGroupTopStateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeOutrightGroupTopStateRequest is not found in the empty JSON string", ChangeOutrightGroupTopStateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeOutrightGroupTopStateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeOutrightGroupTopStateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeOutrightGroupTopStateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeOutrightGroupTopStateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeOutrightGroupTopStateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeOutrightGroupTopStateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeOutrightGroupTopStateRequest>() {
           @Override
           public void write(JsonWriter out, ChangeOutrightGroupTopStateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeOutrightGroupTopStateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeOutrightGroupTopStateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeOutrightGroupTopStateRequest
  * @throws IOException if the JSON string is invalid with respect to ChangeOutrightGroupTopStateRequest
  */
  public static ChangeOutrightGroupTopStateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeOutrightGroupTopStateRequest.class);
  }

 /**
  * Convert an instance of ChangeOutrightGroupTopStateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

