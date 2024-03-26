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
 * ManualBetItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ManualBetItem {
  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public static final String SERIALIZED_NAME_EVENT_TIME = "EventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "CategoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP = "Championship";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP)
  private String championship;

  public static final String SERIALIZED_NAME_EVENT = "Event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_NAME = "MarketTypeName";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_NAME)
  private String marketTypeName;

  public static final String SERIALIZED_NAME_SELECTION_ID = "SelectionId";
  @SerializedName(SERIALIZED_NAME_SELECTION_ID)
  private Long selectionId;

  public static final String SERIALIZED_NAME_SELECTION_NAME = "SelectionName";
  @SerializedName(SERIALIZED_NAME_SELECTION_NAME)
  private String selectionName;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "ProviderName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public ManualBetItem() {
  }

  public ManualBetItem feedEventId(Long feedEventId) {
    this.feedEventId = feedEventId;
    return this;
  }

   /**
   * Get feedEventId
   * @return feedEventId
  **/
  @javax.annotation.Nullable
  public Long getFeedEventId() {
    return feedEventId;
  }

  public void setFeedEventId(Long feedEventId) {
    this.feedEventId = feedEventId;
  }


  public ManualBetItem eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Get eventTime
   * @return eventTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public ManualBetItem sportName(String sportName) {
    this.sportName = sportName;
    return this;
  }

   /**
   * Get sportName
   * @return sportName
  **/
  @javax.annotation.Nullable
  public String getSportName() {
    return sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }


  public ManualBetItem categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public ManualBetItem championship(String championship) {
    this.championship = championship;
    return this;
  }

   /**
   * Get championship
   * @return championship
  **/
  @javax.annotation.Nullable
  public String getChampionship() {
    return championship;
  }

  public void setChampionship(String championship) {
    this.championship = championship;
  }


  public ManualBetItem event(String event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }


  public ManualBetItem marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public ManualBetItem marketTypeName(String marketTypeName) {
    this.marketTypeName = marketTypeName;
    return this;
  }

   /**
   * Get marketTypeName
   * @return marketTypeName
  **/
  @javax.annotation.Nullable
  public String getMarketTypeName() {
    return marketTypeName;
  }

  public void setMarketTypeName(String marketTypeName) {
    this.marketTypeName = marketTypeName;
  }


  public ManualBetItem selectionId(Long selectionId) {
    this.selectionId = selectionId;
    return this;
  }

   /**
   * Get selectionId
   * @return selectionId
  **/
  @javax.annotation.Nullable
  public Long getSelectionId() {
    return selectionId;
  }

  public void setSelectionId(Long selectionId) {
    this.selectionId = selectionId;
  }


  public ManualBetItem selectionName(String selectionName) {
    this.selectionName = selectionName;
    return this;
  }

   /**
   * Get selectionName
   * @return selectionName
  **/
  @javax.annotation.Nullable
  public String getSelectionName() {
    return selectionName;
  }

  public void setSelectionName(String selectionName) {
    this.selectionName = selectionName;
  }


  public ManualBetItem providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ManualBetItem intEventId(Long intEventId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualBetItem manualBetItem = (ManualBetItem) o;
    return Objects.equals(this.feedEventId, manualBetItem.feedEventId) &&
        Objects.equals(this.eventTime, manualBetItem.eventTime) &&
        Objects.equals(this.sportName, manualBetItem.sportName) &&
        Objects.equals(this.categoryName, manualBetItem.categoryName) &&
        Objects.equals(this.championship, manualBetItem.championship) &&
        Objects.equals(this.event, manualBetItem.event) &&
        Objects.equals(this.marketTypeId, manualBetItem.marketTypeId) &&
        Objects.equals(this.marketTypeName, manualBetItem.marketTypeName) &&
        Objects.equals(this.selectionId, manualBetItem.selectionId) &&
        Objects.equals(this.selectionName, manualBetItem.selectionName) &&
        Objects.equals(this.providerName, manualBetItem.providerName) &&
        Objects.equals(this.intEventId, manualBetItem.intEventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedEventId, eventTime, sportName, categoryName, championship, event, marketTypeId, marketTypeName, selectionId, selectionName, providerName, intEventId);
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
    sb.append("class ManualBetItem {\n");
    sb.append("    feedEventId: ").append(toIndentedString(feedEventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    championship: ").append(toIndentedString(championship)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    marketTypeName: ").append(toIndentedString(marketTypeName)).append("\n");
    sb.append("    selectionId: ").append(toIndentedString(selectionId)).append("\n");
    sb.append("    selectionName: ").append(toIndentedString(selectionName)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
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
    openapiFields.add("FeedEventId");
    openapiFields.add("EventTime");
    openapiFields.add("SportName");
    openapiFields.add("CategoryName");
    openapiFields.add("Championship");
    openapiFields.add("Event");
    openapiFields.add("MarketTypeId");
    openapiFields.add("MarketTypeName");
    openapiFields.add("SelectionId");
    openapiFields.add("SelectionName");
    openapiFields.add("ProviderName");
    openapiFields.add("IntEventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManualBetItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ManualBetItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManualBetItem is not found in the empty JSON string", ManualBetItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ManualBetItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManualBetItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if ((jsonObj.get("CategoryName") != null && !jsonObj.get("CategoryName").isJsonNull()) && !jsonObj.get("CategoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CategoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CategoryName").toString()));
      }
      if ((jsonObj.get("Championship") != null && !jsonObj.get("Championship").isJsonNull()) && !jsonObj.get("Championship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Championship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Championship").toString()));
      }
      if ((jsonObj.get("Event") != null && !jsonObj.get("Event").isJsonNull()) && !jsonObj.get("Event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Event").toString()));
      }
      if ((jsonObj.get("MarketTypeName") != null && !jsonObj.get("MarketTypeName").isJsonNull()) && !jsonObj.get("MarketTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketTypeName").toString()));
      }
      if ((jsonObj.get("SelectionName") != null && !jsonObj.get("SelectionName").isJsonNull()) && !jsonObj.get("SelectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SelectionName").toString()));
      }
      if ((jsonObj.get("ProviderName") != null && !jsonObj.get("ProviderName").isJsonNull()) && !jsonObj.get("ProviderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProviderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProviderName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManualBetItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManualBetItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManualBetItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManualBetItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ManualBetItem>() {
           @Override
           public void write(JsonWriter out, ManualBetItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManualBetItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManualBetItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManualBetItem
  * @throws IOException if the JSON string is invalid with respect to ManualBetItem
  */
  public static ManualBetItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManualBetItem.class);
  }

 /**
  * Convert an instance of ManualBetItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

