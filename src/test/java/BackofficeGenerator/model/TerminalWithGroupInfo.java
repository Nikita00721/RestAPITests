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
 * TerminalWithGroupInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TerminalWithGroupInfo {
  public static final String SERIALIZED_NAME_TERMINAL_NAME = "TerminalName";
  @SerializedName(SERIALIZED_NAME_TERMINAL_NAME)
  private String terminalName;

  public static final String SERIALIZED_NAME_TERMINAL_STATUS = "TerminalStatus";
  @SerializedName(SERIALIZED_NAME_TERMINAL_STATUS)
  private TerminalStatuses terminalStatus;

  public static final String SERIALIZED_NAME_GROUP_ID = "GroupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "GroupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_IS_ADDED_TO_CURRENT_GROUP = "IsAddedToCurrentGroup";
  @SerializedName(SERIALIZED_NAME_IS_ADDED_TO_CURRENT_GROUP)
  private Boolean isAddedToCurrentGroup;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "TerminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public TerminalWithGroupInfo() {
  }

  public TerminalWithGroupInfo terminalName(String terminalName) {
    this.terminalName = terminalName;
    return this;
  }

   /**
   * Get terminalName
   * @return terminalName
  **/
  @javax.annotation.Nullable
  public String getTerminalName() {
    return terminalName;
  }

  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }


  public TerminalWithGroupInfo terminalStatus(TerminalStatuses terminalStatus) {
    this.terminalStatus = terminalStatus;
    return this;
  }

   /**
   * Get terminalStatus
   * @return terminalStatus
  **/
  @javax.annotation.Nullable
  public TerminalStatuses getTerminalStatus() {
    return terminalStatus;
  }

  public void setTerminalStatus(TerminalStatuses terminalStatus) {
    this.terminalStatus = terminalStatus;
  }


  public TerminalWithGroupInfo groupId(Integer groupId) {
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


  public TerminalWithGroupInfo groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public TerminalWithGroupInfo isAddedToCurrentGroup(Boolean isAddedToCurrentGroup) {
    this.isAddedToCurrentGroup = isAddedToCurrentGroup;
    return this;
  }

   /**
   * Get isAddedToCurrentGroup
   * @return isAddedToCurrentGroup
  **/
  @javax.annotation.Nullable
  public Boolean getIsAddedToCurrentGroup() {
    return isAddedToCurrentGroup;
  }

  public void setIsAddedToCurrentGroup(Boolean isAddedToCurrentGroup) {
    this.isAddedToCurrentGroup = isAddedToCurrentGroup;
  }


  public TerminalWithGroupInfo terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Get terminalId
   * @return terminalId
  **/
  @javax.annotation.Nullable
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalWithGroupInfo terminalWithGroupInfo = (TerminalWithGroupInfo) o;
    return Objects.equals(this.terminalName, terminalWithGroupInfo.terminalName) &&
        Objects.equals(this.terminalStatus, terminalWithGroupInfo.terminalStatus) &&
        Objects.equals(this.groupId, terminalWithGroupInfo.groupId) &&
        Objects.equals(this.groupName, terminalWithGroupInfo.groupName) &&
        Objects.equals(this.isAddedToCurrentGroup, terminalWithGroupInfo.isAddedToCurrentGroup) &&
        Objects.equals(this.terminalId, terminalWithGroupInfo.terminalId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalName, terminalStatus, groupId, groupName, isAddedToCurrentGroup, terminalId);
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
    sb.append("class TerminalWithGroupInfo {\n");
    sb.append("    terminalName: ").append(toIndentedString(terminalName)).append("\n");
    sb.append("    terminalStatus: ").append(toIndentedString(terminalStatus)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    isAddedToCurrentGroup: ").append(toIndentedString(isAddedToCurrentGroup)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
    openapiFields.add("TerminalName");
    openapiFields.add("TerminalStatus");
    openapiFields.add("GroupId");
    openapiFields.add("GroupName");
    openapiFields.add("IsAddedToCurrentGroup");
    openapiFields.add("TerminalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalWithGroupInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerminalWithGroupInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminalWithGroupInfo is not found in the empty JSON string", TerminalWithGroupInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerminalWithGroupInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerminalWithGroupInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TerminalName") != null && !jsonObj.get("TerminalName").isJsonNull()) && !jsonObj.get("TerminalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TerminalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TerminalName").toString()));
      }
      // validate the optional field `TerminalStatus`
      if (jsonObj.get("TerminalStatus") != null && !jsonObj.get("TerminalStatus").isJsonNull()) {
        TerminalStatuses.validateJsonElement(jsonObj.get("TerminalStatus"));
      }
      if ((jsonObj.get("GroupName") != null && !jsonObj.get("GroupName").isJsonNull()) && !jsonObj.get("GroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupName").toString()));
      }
      if ((jsonObj.get("TerminalId") != null && !jsonObj.get("TerminalId").isJsonNull()) && !jsonObj.get("TerminalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TerminalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TerminalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalWithGroupInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalWithGroupInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalWithGroupInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalWithGroupInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalWithGroupInfo>() {
           @Override
           public void write(JsonWriter out, TerminalWithGroupInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalWithGroupInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalWithGroupInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalWithGroupInfo
  * @throws IOException if the JSON string is invalid with respect to TerminalWithGroupInfo
  */
  public static TerminalWithGroupInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalWithGroupInfo.class);
  }

 /**
  * Convert an instance of TerminalWithGroupInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

