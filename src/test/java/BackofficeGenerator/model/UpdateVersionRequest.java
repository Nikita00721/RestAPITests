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
 * UpdateVersionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateVersionRequest {
  public static final String SERIALIZED_NAME_TERMINAL_IDS = "TerminalIds";
  @SerializedName(SERIALIZED_NAME_TERMINAL_IDS)
  private List<String> terminalIds;

  public static final String SERIALIZED_NAME_VERSION_ID = "VersionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private Integer versionId;

  public static final String SERIALIZED_NAME_GROUP_IDS = "GroupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<Integer> groupIds;

  public UpdateVersionRequest() {
  }

  public UpdateVersionRequest terminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
    return this;
  }

  public UpdateVersionRequest addTerminalIdsItem(String terminalIdsItem) {
    if (this.terminalIds == null) {
      this.terminalIds = new ArrayList<>();
    }
    this.terminalIds.add(terminalIdsItem);
    return this;
  }

   /**
   * Get terminalIds
   * @return terminalIds
  **/
  @javax.annotation.Nullable
  public List<String> getTerminalIds() {
    return terminalIds;
  }

  public void setTerminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
  }


  public UpdateVersionRequest versionId(Integer versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @javax.annotation.Nullable
  public Integer getVersionId() {
    return versionId;
  }

  public void setVersionId(Integer versionId) {
    this.versionId = versionId;
  }


  public UpdateVersionRequest groupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public UpdateVersionRequest addGroupIdsItem(Integer groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Get groupIds
   * @return groupIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVersionRequest updateVersionRequest = (UpdateVersionRequest) o;
    return Objects.equals(this.terminalIds, updateVersionRequest.terminalIds) &&
        Objects.equals(this.versionId, updateVersionRequest.versionId) &&
        Objects.equals(this.groupIds, updateVersionRequest.groupIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalIds, versionId, groupIds);
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
    sb.append("class UpdateVersionRequest {\n");
    sb.append("    terminalIds: ").append(toIndentedString(terminalIds)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
    openapiFields.add("TerminalIds");
    openapiFields.add("VersionId");
    openapiFields.add("GroupIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateVersionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateVersionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVersionRequest is not found in the empty JSON string", UpdateVersionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateVersionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVersionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("TerminalIds") != null && !jsonObj.get("TerminalIds").isJsonNull() && !jsonObj.get("TerminalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TerminalIds` to be an array in the JSON string but got `%s`", jsonObj.get("TerminalIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("GroupIds") != null && !jsonObj.get("GroupIds").isJsonNull() && !jsonObj.get("GroupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupIds` to be an array in the JSON string but got `%s`", jsonObj.get("GroupIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVersionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVersionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVersionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVersionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVersionRequest>() {
           @Override
           public void write(JsonWriter out, UpdateVersionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVersionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVersionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVersionRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateVersionRequest
  */
  public static UpdateVersionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVersionRequest.class);
  }

 /**
  * Convert an instance of UpdateVersionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
