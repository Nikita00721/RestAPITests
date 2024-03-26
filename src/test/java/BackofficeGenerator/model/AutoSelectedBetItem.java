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
 * AutoSelectedBetItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AutoSelectedBetItem {
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

  public static final String SERIALIZED_NAME_SELECTION = "Selection";
  @SerializedName(SERIALIZED_NAME_SELECTION)
  private String selection;

  public static final String SERIALIZED_NAME_CURRENT_ODDS = "CurrentOdds";
  @SerializedName(SERIALIZED_NAME_CURRENT_ODDS)
  private Double currentOdds;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public AutoSelectedBetItem() {
  }

  public AutoSelectedBetItem eventTime(OffsetDateTime eventTime) {
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


  public AutoSelectedBetItem sportName(String sportName) {
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


  public AutoSelectedBetItem categoryName(String categoryName) {
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


  public AutoSelectedBetItem championship(String championship) {
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


  public AutoSelectedBetItem event(String event) {
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


  public AutoSelectedBetItem selection(String selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @javax.annotation.Nullable
  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
  }


  public AutoSelectedBetItem currentOdds(Double currentOdds) {
    this.currentOdds = currentOdds;
    return this;
  }

   /**
   * Get currentOdds
   * @return currentOdds
  **/
  @javax.annotation.Nullable
  public Double getCurrentOdds() {
    return currentOdds;
  }

  public void setCurrentOdds(Double currentOdds) {
    this.currentOdds = currentOdds;
  }


  public AutoSelectedBetItem eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoSelectedBetItem autoSelectedBetItem = (AutoSelectedBetItem) o;
    return Objects.equals(this.eventTime, autoSelectedBetItem.eventTime) &&
        Objects.equals(this.sportName, autoSelectedBetItem.sportName) &&
        Objects.equals(this.categoryName, autoSelectedBetItem.categoryName) &&
        Objects.equals(this.championship, autoSelectedBetItem.championship) &&
        Objects.equals(this.event, autoSelectedBetItem.event) &&
        Objects.equals(this.selection, autoSelectedBetItem.selection) &&
        Objects.equals(this.currentOdds, autoSelectedBetItem.currentOdds) &&
        Objects.equals(this.eventId, autoSelectedBetItem.eventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, sportName, categoryName, championship, event, selection, currentOdds, eventId);
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
    sb.append("class AutoSelectedBetItem {\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    championship: ").append(toIndentedString(championship)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    currentOdds: ").append(toIndentedString(currentOdds)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
    openapiFields.add("EventTime");
    openapiFields.add("SportName");
    openapiFields.add("CategoryName");
    openapiFields.add("Championship");
    openapiFields.add("Event");
    openapiFields.add("Selection");
    openapiFields.add("CurrentOdds");
    openapiFields.add("EventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutoSelectedBetItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutoSelectedBetItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoSelectedBetItem is not found in the empty JSON string", AutoSelectedBetItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutoSelectedBetItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoSelectedBetItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("Selection") != null && !jsonObj.get("Selection").isJsonNull()) && !jsonObj.get("Selection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Selection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Selection").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoSelectedBetItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoSelectedBetItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoSelectedBetItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoSelectedBetItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoSelectedBetItem>() {
           @Override
           public void write(JsonWriter out, AutoSelectedBetItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoSelectedBetItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoSelectedBetItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoSelectedBetItem
  * @throws IOException if the JSON string is invalid with respect to AutoSelectedBetItem
  */
  public static AutoSelectedBetItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoSelectedBetItem.class);
  }

 /**
  * Convert an instance of AutoSelectedBetItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

