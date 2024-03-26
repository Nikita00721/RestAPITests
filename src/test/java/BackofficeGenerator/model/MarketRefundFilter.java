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
 * MarketRefundFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketRefundFilter {
  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public static final String SERIALIZED_NAME_FEED_MARKET_ID = "FeedMarketId";
  @SerializedName(SERIALIZED_NAME_FEED_MARKET_ID)
  private Long feedMarketId;

  public static final String SERIALIZED_NAME_EXT_MARKET_ID = "ExtMarketId";
  @SerializedName(SERIALIZED_NAME_EXT_MARKET_ID)
  private Integer extMarketId;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public MarketRefundFilter() {
  }

  public MarketRefundFilter intEventId(Long intEventId) {
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


  public MarketRefundFilter feedMarketId(Long feedMarketId) {
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


  public MarketRefundFilter extMarketId(Integer extMarketId) {
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


  public MarketRefundFilter startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public MarketRefundFilter endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public MarketRefundFilter operatorId(Integer operatorId) {
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
    MarketRefundFilter marketRefundFilter = (MarketRefundFilter) o;
    return Objects.equals(this.intEventId, marketRefundFilter.intEventId) &&
        Objects.equals(this.feedMarketId, marketRefundFilter.feedMarketId) &&
        Objects.equals(this.extMarketId, marketRefundFilter.extMarketId) &&
        Objects.equals(this.startDate, marketRefundFilter.startDate) &&
        Objects.equals(this.endDate, marketRefundFilter.endDate) &&
        Objects.equals(this.operatorId, marketRefundFilter.operatorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intEventId, feedMarketId, extMarketId, startDate, endDate, operatorId);
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
    sb.append("class MarketRefundFilter {\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
    sb.append("    feedMarketId: ").append(toIndentedString(feedMarketId)).append("\n");
    sb.append("    extMarketId: ").append(toIndentedString(extMarketId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("IntEventId");
    openapiFields.add("FeedMarketId");
    openapiFields.add("ExtMarketId");
    openapiFields.add("StartDate");
    openapiFields.add("EndDate");
    openapiFields.add("OperatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketRefundFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketRefundFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketRefundFilter is not found in the empty JSON string", MarketRefundFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketRefundFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketRefundFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketRefundFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketRefundFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketRefundFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketRefundFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketRefundFilter>() {
           @Override
           public void write(JsonWriter out, MarketRefundFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketRefundFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketRefundFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketRefundFilter
  * @throws IOException if the JSON string is invalid with respect to MarketRefundFilter
  */
  public static MarketRefundFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketRefundFilter.class);
  }

 /**
  * Convert an instance of MarketRefundFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

