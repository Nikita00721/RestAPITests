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
 * RegisteredEventList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class RegisteredEventList {
  public static final String SERIALIZED_NAME_REGISTERED_EVENT_LIST_ID = "RegisteredEventListId";
  @SerializedName(SERIALIZED_NAME_REGISTERED_EVENT_LIST_ID)
  private Long registeredEventListId;

  public static final String SERIALIZED_NAME_FEED_MARKET_ID = "FeedMarketId";
  @SerializedName(SERIALIZED_NAME_FEED_MARKET_ID)
  private Long feedMarketId;

  public static final String SERIALIZED_NAME_EXT_MARKET_ID = "ExtMarketId";
  @SerializedName(SERIALIZED_NAME_EXT_MARKET_ID)
  private Integer extMarketId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "EventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private Integer eventType;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS = "ProcessedStatus";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS)
  private Integer processedStatus;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS_NAME = "ProcessedStatusName";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS_NAME)
  private String processedStatusName;

  public static final String SERIALIZED_NAME_LIST_ID = "ListId";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public RegisteredEventList() {
  }

  public RegisteredEventList registeredEventListId(Long registeredEventListId) {
    this.registeredEventListId = registeredEventListId;
    return this;
  }

   /**
   * Get registeredEventListId
   * @return registeredEventListId
  **/
  @javax.annotation.Nullable
  public Long getRegisteredEventListId() {
    return registeredEventListId;
  }

  public void setRegisteredEventListId(Long registeredEventListId) {
    this.registeredEventListId = registeredEventListId;
  }


  public RegisteredEventList feedMarketId(Long feedMarketId) {
    this.feedMarketId = feedMarketId;
    return this;
  }

   /**
   * Get feedMarketId
   * @return feedMarketId
  **/
  @javax.annotation.Nullable
  public Long getFeedMarketId() {
    return feedMarketId;
  }

  public void setFeedMarketId(Long feedMarketId) {
    this.feedMarketId = feedMarketId;
  }


  public RegisteredEventList extMarketId(Integer extMarketId) {
    this.extMarketId = extMarketId;
    return this;
  }

   /**
   * Get extMarketId
   * @return extMarketId
  **/
  @javax.annotation.Nullable
  public Integer getExtMarketId() {
    return extMarketId;
  }

  public void setExtMarketId(Integer extMarketId) {
    this.extMarketId = extMarketId;
  }


  public RegisteredEventList eventType(Integer eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  public Integer getEventType() {
    return eventType;
  }

  public void setEventType(Integer eventType) {
    this.eventType = eventType;
  }


  public RegisteredEventList processedStatus(Integer processedStatus) {
    this.processedStatus = processedStatus;
    return this;
  }

   /**
   * Get processedStatus
   * @return processedStatus
  **/
  @javax.annotation.Nullable
  public Integer getProcessedStatus() {
    return processedStatus;
  }

  public void setProcessedStatus(Integer processedStatus) {
    this.processedStatus = processedStatus;
  }


  public RegisteredEventList processedStatusName(String processedStatusName) {
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


  public RegisteredEventList listId(Integer listId) {
    this.listId = listId;
    return this;
  }

   /**
   * Get listId
   * @return listId
  **/
  @javax.annotation.Nullable
  public Integer getListId() {
    return listId;
  }

  public void setListId(Integer listId) {
    this.listId = listId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredEventList registeredEventList = (RegisteredEventList) o;
    return Objects.equals(this.registeredEventListId, registeredEventList.registeredEventListId) &&
        Objects.equals(this.feedMarketId, registeredEventList.feedMarketId) &&
        Objects.equals(this.extMarketId, registeredEventList.extMarketId) &&
        Objects.equals(this.eventType, registeredEventList.eventType) &&
        Objects.equals(this.processedStatus, registeredEventList.processedStatus) &&
        Objects.equals(this.processedStatusName, registeredEventList.processedStatusName) &&
        Objects.equals(this.listId, registeredEventList.listId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredEventListId, feedMarketId, extMarketId, eventType, processedStatus, processedStatusName, listId);
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
    sb.append("class RegisteredEventList {\n");
    sb.append("    registeredEventListId: ").append(toIndentedString(registeredEventListId)).append("\n");
    sb.append("    feedMarketId: ").append(toIndentedString(feedMarketId)).append("\n");
    sb.append("    extMarketId: ").append(toIndentedString(extMarketId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    processedStatus: ").append(toIndentedString(processedStatus)).append("\n");
    sb.append("    processedStatusName: ").append(toIndentedString(processedStatusName)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
    openapiFields.add("RegisteredEventListId");
    openapiFields.add("FeedMarketId");
    openapiFields.add("ExtMarketId");
    openapiFields.add("EventType");
    openapiFields.add("ProcessedStatus");
    openapiFields.add("ProcessedStatusName");
    openapiFields.add("ListId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RegisteredEventList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RegisteredEventList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegisteredEventList is not found in the empty JSON string", RegisteredEventList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RegisteredEventList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RegisteredEventList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ProcessedStatusName") != null && !jsonObj.get("ProcessedStatusName").isJsonNull()) && !jsonObj.get("ProcessedStatusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessedStatusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessedStatusName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegisteredEventList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegisteredEventList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegisteredEventList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegisteredEventList.class));

       return (TypeAdapter<T>) new TypeAdapter<RegisteredEventList>() {
           @Override
           public void write(JsonWriter out, RegisteredEventList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RegisteredEventList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RegisteredEventList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RegisteredEventList
  * @throws IOException if the JSON string is invalid with respect to RegisteredEventList
  */
  public static RegisteredEventList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegisteredEventList.class);
  }

 /**
  * Convert an instance of RegisteredEventList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

