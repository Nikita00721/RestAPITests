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
import java.time.OffsetDateTime;
import java.util.*;

/**
 * RecordDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class RecordDetails {
  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "IpAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_ACTION_TYPE = "ActionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_USER_AGENT = "UserAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_ACTION_STATUS = "ActionStatus";
  @SerializedName(SERIALIZED_NAME_ACTION_STATUS)
  private String actionStatus;

  public static final String SERIALIZED_NAME_ARGUMENTS = "Arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Object arguments = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_RECORD_ID = "RecordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private Long recordId;

  public RecordDetails() {
  }

  public RecordDetails userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public RecordDetails username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public RecordDetails ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public RecordDetails actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @javax.annotation.Nullable
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public RecordDetails date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public RecordDetails userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nullable
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public RecordDetails actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @javax.annotation.Nullable
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  public RecordDetails arguments(Object arguments) {
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  public Object getArguments() {
    return arguments;
  }

  public void setArguments(Object arguments) {
    this.arguments = arguments;
  }


  public RecordDetails errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public RecordDetails recordId(Long recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  public Long getRecordId() {
    return recordId;
  }

  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordDetails recordDetails = (RecordDetails) o;
    return Objects.equals(this.userId, recordDetails.userId) &&
        Objects.equals(this.username, recordDetails.username) &&
        Objects.equals(this.ipAddress, recordDetails.ipAddress) &&
        Objects.equals(this.actionType, recordDetails.actionType) &&
        Objects.equals(this.date, recordDetails.date) &&
        Objects.equals(this.userAgent, recordDetails.userAgent) &&
        Objects.equals(this.actionStatus, recordDetails.actionStatus) &&
        Objects.equals(this.arguments, recordDetails.arguments) &&
        Objects.equals(this.errorMessage, recordDetails.errorMessage) &&
        Objects.equals(this.recordId, recordDetails.recordId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, ipAddress, actionType, date, userAgent, actionStatus, arguments, errorMessage, recordId);
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
    sb.append("class RecordDetails {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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
    openapiFields.add("UserId");
    openapiFields.add("Username");
    openapiFields.add("IpAddress");
    openapiFields.add("ActionType");
    openapiFields.add("Date");
    openapiFields.add("UserAgent");
    openapiFields.add("ActionStatus");
    openapiFields.add("Arguments");
    openapiFields.add("ErrorMessage");
    openapiFields.add("RecordId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecordDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordDetails is not found in the empty JSON string", RecordDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Username") != null && !jsonObj.get("Username").isJsonNull()) && !jsonObj.get("Username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Username").toString()));
      }
      if ((jsonObj.get("IpAddress") != null && !jsonObj.get("IpAddress").isJsonNull()) && !jsonObj.get("IpAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IpAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IpAddress").toString()));
      }
      if ((jsonObj.get("ActionType") != null && !jsonObj.get("ActionType").isJsonNull()) && !jsonObj.get("ActionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActionType").toString()));
      }
      if ((jsonObj.get("UserAgent") != null && !jsonObj.get("UserAgent").isJsonNull()) && !jsonObj.get("UserAgent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserAgent").toString()));
      }
      if ((jsonObj.get("ActionStatus") != null && !jsonObj.get("ActionStatus").isJsonNull()) && !jsonObj.get("ActionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ActionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ActionStatus").toString()));
      }
      if ((jsonObj.get("ErrorMessage") != null && !jsonObj.get("ErrorMessage").isJsonNull()) && !jsonObj.get("ErrorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ErrorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ErrorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordDetails>() {
           @Override
           public void write(JsonWriter out, RecordDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecordDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecordDetails
  * @throws IOException if the JSON string is invalid with respect to RecordDetails
  */
  public static RecordDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordDetails.class);
  }

 /**
  * Convert an instance of RecordDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
