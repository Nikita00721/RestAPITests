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
 * AamsBetSelectionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AamsBetSelectionInfo {
  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public static final String SERIALIZED_NAME_EXT_EVENT_ID = "ExtEventId";
  @SerializedName(SERIALIZED_NAME_EXT_EVENT_ID)
  private String extEventId;

  public static final String SERIALIZED_NAME_EXT_OUTCOME_ID = "ExtOutcomeId";
  @SerializedName(SERIALIZED_NAME_EXT_OUTCOME_ID)
  private Integer extOutcomeId;

  public static final String SERIALIZED_NAME_EXT_OUTCOME_NAME = "ExtOutcomeName";
  @SerializedName(SERIALIZED_NAME_EXT_OUTCOME_NAME)
  private String extOutcomeName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_STATUS_NAME = "StatusName";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS = "ProcessedStatus";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS)
  private Integer processedStatus;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS_NAME = "ProcessedStatusName";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS_NAME)
  private String processedStatusName;

  public static final String SERIALIZED_NAME_FEED_MARKET_ID = "FeedMarketId";
  @SerializedName(SERIALIZED_NAME_FEED_MARKET_ID)
  private Long feedMarketId;

  public static final String SERIALIZED_NAME_FEED_MARKET_NAME = "FeedMarketName";
  @SerializedName(SERIALIZED_NAME_FEED_MARKET_NAME)
  private String feedMarketName;

  public static final String SERIALIZED_NAME_FEED_SELECTION = "FeedSelection";
  @SerializedName(SERIALIZED_NAME_FEED_SELECTION)
  private Long feedSelection;

  public static final String SERIALIZED_NAME_FEED_SELECTION_NAME = "FeedSelectionName";
  @SerializedName(SERIALIZED_NAME_FEED_SELECTION_NAME)
  private String feedSelectionName;

  public static final String SERIALIZED_NAME_INT_BET_ID = "IntBetId";
  @SerializedName(SERIALIZED_NAME_INT_BET_ID)
  private Long intBetId;

  public AamsBetSelectionInfo() {
  }

  public AamsBetSelectionInfo intEventId(Long intEventId) {
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


  public AamsBetSelectionInfo extEventId(String extEventId) {
    this.extEventId = extEventId;
    return this;
  }

   /**
   * Get extEventId
   * @return extEventId
  **/
  @javax.annotation.Nullable
  public String getExtEventId() {
    return extEventId;
  }

  public void setExtEventId(String extEventId) {
    this.extEventId = extEventId;
  }


  public AamsBetSelectionInfo extOutcomeId(Integer extOutcomeId) {
    this.extOutcomeId = extOutcomeId;
    return this;
  }

   /**
   * Get extOutcomeId
   * @return extOutcomeId
  **/
  @javax.annotation.Nullable
  public Integer getExtOutcomeId() {
    return extOutcomeId;
  }

  public void setExtOutcomeId(Integer extOutcomeId) {
    this.extOutcomeId = extOutcomeId;
  }


  public AamsBetSelectionInfo extOutcomeName(String extOutcomeName) {
    this.extOutcomeName = extOutcomeName;
    return this;
  }

   /**
   * Get extOutcomeName
   * @return extOutcomeName
  **/
  @javax.annotation.Nullable
  public String getExtOutcomeName() {
    return extOutcomeName;
  }

  public void setExtOutcomeName(String extOutcomeName) {
    this.extOutcomeName = extOutcomeName;
  }


  public AamsBetSelectionInfo status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public AamsBetSelectionInfo statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * Get statusName
   * @return statusName
  **/
  @javax.annotation.Nullable
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public AamsBetSelectionInfo processedStatus(Integer processedStatus) {
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


  public AamsBetSelectionInfo processedStatusName(String processedStatusName) {
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


  public AamsBetSelectionInfo feedMarketId(Long feedMarketId) {
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


  public AamsBetSelectionInfo feedMarketName(String feedMarketName) {
    this.feedMarketName = feedMarketName;
    return this;
  }

   /**
   * Get feedMarketName
   * @return feedMarketName
  **/
  @javax.annotation.Nullable
  public String getFeedMarketName() {
    return feedMarketName;
  }

  public void setFeedMarketName(String feedMarketName) {
    this.feedMarketName = feedMarketName;
  }


  public AamsBetSelectionInfo feedSelection(Long feedSelection) {
    this.feedSelection = feedSelection;
    return this;
  }

   /**
   * Get feedSelection
   * @return feedSelection
  **/
  @javax.annotation.Nullable
  public Long getFeedSelection() {
    return feedSelection;
  }

  public void setFeedSelection(Long feedSelection) {
    this.feedSelection = feedSelection;
  }


  public AamsBetSelectionInfo feedSelectionName(String feedSelectionName) {
    this.feedSelectionName = feedSelectionName;
    return this;
  }

   /**
   * Get feedSelectionName
   * @return feedSelectionName
  **/
  @javax.annotation.Nullable
  public String getFeedSelectionName() {
    return feedSelectionName;
  }

  public void setFeedSelectionName(String feedSelectionName) {
    this.feedSelectionName = feedSelectionName;
  }


  public AamsBetSelectionInfo intBetId(Long intBetId) {
    this.intBetId = intBetId;
    return this;
  }

   /**
   * Get intBetId
   * @return intBetId
  **/
  @javax.annotation.Nullable
  public Long getIntBetId() {
    return intBetId;
  }

  public void setIntBetId(Long intBetId) {
    this.intBetId = intBetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AamsBetSelectionInfo aamsBetSelectionInfo = (AamsBetSelectionInfo) o;
    return Objects.equals(this.intEventId, aamsBetSelectionInfo.intEventId) &&
        Objects.equals(this.extEventId, aamsBetSelectionInfo.extEventId) &&
        Objects.equals(this.extOutcomeId, aamsBetSelectionInfo.extOutcomeId) &&
        Objects.equals(this.extOutcomeName, aamsBetSelectionInfo.extOutcomeName) &&
        Objects.equals(this.status, aamsBetSelectionInfo.status) &&
        Objects.equals(this.statusName, aamsBetSelectionInfo.statusName) &&
        Objects.equals(this.processedStatus, aamsBetSelectionInfo.processedStatus) &&
        Objects.equals(this.processedStatusName, aamsBetSelectionInfo.processedStatusName) &&
        Objects.equals(this.feedMarketId, aamsBetSelectionInfo.feedMarketId) &&
        Objects.equals(this.feedMarketName, aamsBetSelectionInfo.feedMarketName) &&
        Objects.equals(this.feedSelection, aamsBetSelectionInfo.feedSelection) &&
        Objects.equals(this.feedSelectionName, aamsBetSelectionInfo.feedSelectionName) &&
        Objects.equals(this.intBetId, aamsBetSelectionInfo.intBetId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intEventId, extEventId, extOutcomeId, extOutcomeName, status, statusName, processedStatus, processedStatusName, feedMarketId, feedMarketName, feedSelection, feedSelectionName, intBetId);
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
    sb.append("class AamsBetSelectionInfo {\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
    sb.append("    extEventId: ").append(toIndentedString(extEventId)).append("\n");
    sb.append("    extOutcomeId: ").append(toIndentedString(extOutcomeId)).append("\n");
    sb.append("    extOutcomeName: ").append(toIndentedString(extOutcomeName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    processedStatus: ").append(toIndentedString(processedStatus)).append("\n");
    sb.append("    processedStatusName: ").append(toIndentedString(processedStatusName)).append("\n");
    sb.append("    feedMarketId: ").append(toIndentedString(feedMarketId)).append("\n");
    sb.append("    feedMarketName: ").append(toIndentedString(feedMarketName)).append("\n");
    sb.append("    feedSelection: ").append(toIndentedString(feedSelection)).append("\n");
    sb.append("    feedSelectionName: ").append(toIndentedString(feedSelectionName)).append("\n");
    sb.append("    intBetId: ").append(toIndentedString(intBetId)).append("\n");
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
    openapiFields.add("IntEventId");
    openapiFields.add("ExtEventId");
    openapiFields.add("ExtOutcomeId");
    openapiFields.add("ExtOutcomeName");
    openapiFields.add("Status");
    openapiFields.add("StatusName");
    openapiFields.add("ProcessedStatus");
    openapiFields.add("ProcessedStatusName");
    openapiFields.add("FeedMarketId");
    openapiFields.add("FeedMarketName");
    openapiFields.add("FeedSelection");
    openapiFields.add("FeedSelectionName");
    openapiFields.add("IntBetId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AamsBetSelectionInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AamsBetSelectionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AamsBetSelectionInfo is not found in the empty JSON string", AamsBetSelectionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AamsBetSelectionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AamsBetSelectionInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExtEventId") != null && !jsonObj.get("ExtEventId").isJsonNull()) && !jsonObj.get("ExtEventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtEventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtEventId").toString()));
      }
      if ((jsonObj.get("ExtOutcomeName") != null && !jsonObj.get("ExtOutcomeName").isJsonNull()) && !jsonObj.get("ExtOutcomeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtOutcomeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtOutcomeName").toString()));
      }
      if ((jsonObj.get("StatusName") != null && !jsonObj.get("StatusName").isJsonNull()) && !jsonObj.get("StatusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StatusName").toString()));
      }
      if ((jsonObj.get("ProcessedStatusName") != null && !jsonObj.get("ProcessedStatusName").isJsonNull()) && !jsonObj.get("ProcessedStatusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessedStatusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessedStatusName").toString()));
      }
      if ((jsonObj.get("FeedMarketName") != null && !jsonObj.get("FeedMarketName").isJsonNull()) && !jsonObj.get("FeedMarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeedMarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeedMarketName").toString()));
      }
      if ((jsonObj.get("FeedSelectionName") != null && !jsonObj.get("FeedSelectionName").isJsonNull()) && !jsonObj.get("FeedSelectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeedSelectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeedSelectionName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AamsBetSelectionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AamsBetSelectionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AamsBetSelectionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AamsBetSelectionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AamsBetSelectionInfo>() {
           @Override
           public void write(JsonWriter out, AamsBetSelectionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AamsBetSelectionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AamsBetSelectionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AamsBetSelectionInfo
  * @throws IOException if the JSON string is invalid with respect to AamsBetSelectionInfo
  */
  public static AamsBetSelectionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AamsBetSelectionInfo.class);
  }

 /**
  * Convert an instance of AamsBetSelectionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

