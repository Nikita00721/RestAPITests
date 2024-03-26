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
 * AamsUpdateDateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AamsUpdateDateInfo {
  public static final String SERIALIZED_NAME_OPERATOR_NAME = "OperatorName";
  @SerializedName(SERIALIZED_NAME_OPERATOR_NAME)
  private String operatorName;

  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public static final String SERIALIZED_NAME_EVENT_NAME = "EventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS_NAME = "ProcessedStatusName";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS_NAME)
  private String processedStatusName;

  public static final String SERIALIZED_NAME_PROCESSED_MESSAGE = "ProcessedMessage";
  @SerializedName(SERIALIZED_NAME_PROCESSED_MESSAGE)
  private String processedMessage;

  public static final String SERIALIZED_NAME_REGISTERED_EVENT_ID = "RegisteredEventId";
  @SerializedName(SERIALIZED_NAME_REGISTERED_EVENT_ID)
  private Long registeredEventId;

  public static final String SERIALIZED_NAME_AAMS_EVENT_DATE = "AamsEventDate";
  @SerializedName(SERIALIZED_NAME_AAMS_EVENT_DATE)
  private OffsetDateTime aamsEventDate;

  public static final String SERIALIZED_NAME_INT_EVENT_DATE = "IntEventDate";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_DATE)
  private OffsetDateTime intEventDate;

  public static final String SERIALIZED_NAME_BETS_COUNT = "BetsCount";
  @SerializedName(SERIALIZED_NAME_BETS_COUNT)
  private Integer betsCount;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public AamsUpdateDateInfo() {
  }

  public AamsUpdateDateInfo operatorName(String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @javax.annotation.Nullable
  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public AamsUpdateDateInfo intEventId(Long intEventId) {
    this.intEventId = intEventId;
    return this;
  }

   /**
   * Get intEventId
   * @return intEventId
  **/
  @javax.annotation.Nullable
  public Long getIntEventId() {
    return intEventId;
  }

  public void setIntEventId(Long intEventId) {
    this.intEventId = intEventId;
  }


  public AamsUpdateDateInfo eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public AamsUpdateDateInfo processedStatusName(String processedStatusName) {
    this.processedStatusName = processedStatusName;
    return this;
  }

   /**
   * Get processedStatusName
   * @return processedStatusName
  **/
  @javax.annotation.Nullable
  public String getProcessedStatusName() {
    return processedStatusName;
  }

  public void setProcessedStatusName(String processedStatusName) {
    this.processedStatusName = processedStatusName;
  }


  public AamsUpdateDateInfo processedMessage(String processedMessage) {
    this.processedMessage = processedMessage;
    return this;
  }

   /**
   * Get processedMessage
   * @return processedMessage
  **/
  @javax.annotation.Nullable
  public String getProcessedMessage() {
    return processedMessage;
  }

  public void setProcessedMessage(String processedMessage) {
    this.processedMessage = processedMessage;
  }


  public AamsUpdateDateInfo registeredEventId(Long registeredEventId) {
    this.registeredEventId = registeredEventId;
    return this;
  }

   /**
   * Get registeredEventId
   * @return registeredEventId
  **/
  @javax.annotation.Nullable
  public Long getRegisteredEventId() {
    return registeredEventId;
  }

  public void setRegisteredEventId(Long registeredEventId) {
    this.registeredEventId = registeredEventId;
  }


  public AamsUpdateDateInfo aamsEventDate(OffsetDateTime aamsEventDate) {
    this.aamsEventDate = aamsEventDate;
    return this;
  }

   /**
   * Get aamsEventDate
   * @return aamsEventDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getAamsEventDate() {
    return aamsEventDate;
  }

  public void setAamsEventDate(OffsetDateTime aamsEventDate) {
    this.aamsEventDate = aamsEventDate;
  }


  public AamsUpdateDateInfo intEventDate(OffsetDateTime intEventDate) {
    this.intEventDate = intEventDate;
    return this;
  }

   /**
   * Get intEventDate
   * @return intEventDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getIntEventDate() {
    return intEventDate;
  }

  public void setIntEventDate(OffsetDateTime intEventDate) {
    this.intEventDate = intEventDate;
  }


  public AamsUpdateDateInfo betsCount(Integer betsCount) {
    this.betsCount = betsCount;
    return this;
  }

   /**
   * Get betsCount
   * @return betsCount
  **/
  @javax.annotation.Nullable
  public Integer getBetsCount() {
    return betsCount;
  }

  public void setBetsCount(Integer betsCount) {
    this.betsCount = betsCount;
  }


  public AamsUpdateDateInfo operatorId(Integer operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @javax.annotation.Nullable
  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AamsUpdateDateInfo aamsUpdateDateInfo = (AamsUpdateDateInfo) o;
    return Objects.equals(this.operatorName, aamsUpdateDateInfo.operatorName) &&
        Objects.equals(this.intEventId, aamsUpdateDateInfo.intEventId) &&
        Objects.equals(this.eventName, aamsUpdateDateInfo.eventName) &&
        Objects.equals(this.processedStatusName, aamsUpdateDateInfo.processedStatusName) &&
        Objects.equals(this.processedMessage, aamsUpdateDateInfo.processedMessage) &&
        Objects.equals(this.registeredEventId, aamsUpdateDateInfo.registeredEventId) &&
        Objects.equals(this.aamsEventDate, aamsUpdateDateInfo.aamsEventDate) &&
        Objects.equals(this.intEventDate, aamsUpdateDateInfo.intEventDate) &&
        Objects.equals(this.betsCount, aamsUpdateDateInfo.betsCount) &&
        Objects.equals(this.operatorId, aamsUpdateDateInfo.operatorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorName, intEventId, eventName, processedStatusName, processedMessage, registeredEventId, aamsEventDate, intEventDate, betsCount, operatorId);
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
    sb.append("class AamsUpdateDateInfo {\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    processedStatusName: ").append(toIndentedString(processedStatusName)).append("\n");
    sb.append("    processedMessage: ").append(toIndentedString(processedMessage)).append("\n");
    sb.append("    registeredEventId: ").append(toIndentedString(registeredEventId)).append("\n");
    sb.append("    aamsEventDate: ").append(toIndentedString(aamsEventDate)).append("\n");
    sb.append("    intEventDate: ").append(toIndentedString(intEventDate)).append("\n");
    sb.append("    betsCount: ").append(toIndentedString(betsCount)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
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
    openapiFields.add("OperatorName");
    openapiFields.add("IntEventId");
    openapiFields.add("EventName");
    openapiFields.add("ProcessedStatusName");
    openapiFields.add("ProcessedMessage");
    openapiFields.add("RegisteredEventId");
    openapiFields.add("AamsEventDate");
    openapiFields.add("IntEventDate");
    openapiFields.add("BetsCount");
    openapiFields.add("OperatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AamsUpdateDateInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AamsUpdateDateInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AamsUpdateDateInfo is not found in the empty JSON string", AamsUpdateDateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AamsUpdateDateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AamsUpdateDateInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("OperatorName") != null && !jsonObj.get("OperatorName").isJsonNull()) && !jsonObj.get("OperatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperatorName").toString()));
      }
      if ((jsonObj.get("EventName") != null && !jsonObj.get("EventName").isJsonNull()) && !jsonObj.get("EventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EventName").toString()));
      }
      if ((jsonObj.get("ProcessedStatusName") != null && !jsonObj.get("ProcessedStatusName").isJsonNull()) && !jsonObj.get("ProcessedStatusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessedStatusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessedStatusName").toString()));
      }
      if ((jsonObj.get("ProcessedMessage") != null && !jsonObj.get("ProcessedMessage").isJsonNull()) && !jsonObj.get("ProcessedMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessedMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessedMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AamsUpdateDateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AamsUpdateDateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AamsUpdateDateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AamsUpdateDateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AamsUpdateDateInfo>() {
           @Override
           public void write(JsonWriter out, AamsUpdateDateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AamsUpdateDateInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AamsUpdateDateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AamsUpdateDateInfo
  * @throws IOException if the JSON string is invalid with respect to AamsUpdateDateInfo
  */
  public static AamsUpdateDateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AamsUpdateDateInfo.class);
  }

 /**
  * Convert an instance of AamsUpdateDateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

