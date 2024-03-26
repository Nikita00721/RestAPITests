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
 * SettlementMarket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SettlementMarket {
  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPORT_MARKET_ID = "SportMarketId";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_ID)
  private Integer sportMarketId;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_VALUE = "SpecialOddsValue";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_VALUE)
  private String specialOddsValue;

  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS = "ProcessedStatus";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS)
  private Integer processedStatus;

  public static final String SERIALIZED_NAME_PROCESSED_MESSAGE = "ProcessedMessage";
  @SerializedName(SERIALIZED_NAME_PROCESSED_MESSAGE)
  private String processedMessage;

  public static final String SERIALIZED_NAME_FEED_SELECTION_ID = "FeedSelectionId";
  @SerializedName(SERIALIZED_NAME_FEED_SELECTION_ID)
  private Long feedSelectionId;

  public SettlementMarket() {
  }

  public SettlementMarket intEventId(Long intEventId) {
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


  public SettlementMarket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SettlementMarket sportMarketId(Integer sportMarketId) {
    this.sportMarketId = sportMarketId;
    return this;
  }

   /**
   * Get sportMarketId
   * @return sportMarketId
  **/
  @javax.annotation.Nullable
  public Integer getSportMarketId() {
    return sportMarketId;
  }

  public void setSportMarketId(Integer sportMarketId) {
    this.sportMarketId = sportMarketId;
  }


  public SettlementMarket specialOddsValue(String specialOddsValue) {
    this.specialOddsValue = specialOddsValue;
    return this;
  }

   /**
   * Get specialOddsValue
   * @return specialOddsValue
  **/
  @javax.annotation.Nullable
  public String getSpecialOddsValue() {
    return specialOddsValue;
  }

  public void setSpecialOddsValue(String specialOddsValue) {
    this.specialOddsValue = specialOddsValue;
  }


  public SettlementMarket result(Integer result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


  public SettlementMarket processedStatus(Integer processedStatus) {
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


  public SettlementMarket processedMessage(String processedMessage) {
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


  public SettlementMarket feedSelectionId(Long feedSelectionId) {
    this.feedSelectionId = feedSelectionId;
    return this;
  }

   /**
   * Get feedSelectionId
   * @return feedSelectionId
  **/
  @javax.annotation.Nullable
  public Long getFeedSelectionId() {
    return feedSelectionId;
  }

  public void setFeedSelectionId(Long feedSelectionId) {
    this.feedSelectionId = feedSelectionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementMarket settlementMarket = (SettlementMarket) o;
    return Objects.equals(this.intEventId, settlementMarket.intEventId) &&
        Objects.equals(this.name, settlementMarket.name) &&
        Objects.equals(this.sportMarketId, settlementMarket.sportMarketId) &&
        Objects.equals(this.specialOddsValue, settlementMarket.specialOddsValue) &&
        Objects.equals(this.result, settlementMarket.result) &&
        Objects.equals(this.processedStatus, settlementMarket.processedStatus) &&
        Objects.equals(this.processedMessage, settlementMarket.processedMessage) &&
        Objects.equals(this.feedSelectionId, settlementMarket.feedSelectionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intEventId, name, sportMarketId, specialOddsValue, result, processedStatus, processedMessage, feedSelectionId);
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
    sb.append("class SettlementMarket {\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sportMarketId: ").append(toIndentedString(sportMarketId)).append("\n");
    sb.append("    specialOddsValue: ").append(toIndentedString(specialOddsValue)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    processedStatus: ").append(toIndentedString(processedStatus)).append("\n");
    sb.append("    processedMessage: ").append(toIndentedString(processedMessage)).append("\n");
    sb.append("    feedSelectionId: ").append(toIndentedString(feedSelectionId)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("SportMarketId");
    openapiFields.add("SpecialOddsValue");
    openapiFields.add("Result");
    openapiFields.add("ProcessedStatus");
    openapiFields.add("ProcessedMessage");
    openapiFields.add("FeedSelectionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementMarket
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SettlementMarket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettlementMarket is not found in the empty JSON string", SettlementMarket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SettlementMarket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettlementMarket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("SpecialOddsValue") != null && !jsonObj.get("SpecialOddsValue").isJsonNull()) && !jsonObj.get("SpecialOddsValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SpecialOddsValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SpecialOddsValue").toString()));
      }
      if ((jsonObj.get("ProcessedMessage") != null && !jsonObj.get("ProcessedMessage").isJsonNull()) && !jsonObj.get("ProcessedMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessedMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessedMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementMarket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementMarket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementMarket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementMarket.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementMarket>() {
           @Override
           public void write(JsonWriter out, SettlementMarket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementMarket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementMarket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementMarket
  * @throws IOException if the JSON string is invalid with respect to SettlementMarket
  */
  public static SettlementMarket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementMarket.class);
  }

 /**
  * Convert an instance of SettlementMarket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

