/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * EventResultOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class EventResultOut {
  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<EventMenuItemOut> items;

  public static final String SERIALIZED_NAME_EVENTS_COUNT = "EventsCount";
  @SerializedName(SERIALIZED_NAME_EVENTS_COUNT)
  private Integer eventsCount;

  public static final String SERIALIZED_NAME_SHOW_MORE_EVENTS_INT = "ShowMoreEventsInt";
  @SerializedName(SERIALIZED_NAME_SHOW_MORE_EVENTS_INT)
  private Boolean showMoreEventsInt;

  public static final String SERIALIZED_NAME_SHOW_MORE_EVENTS = "ShowMoreEvents";
  @SerializedName(SERIALIZED_NAME_SHOW_MORE_EVENTS)
  private Boolean showMoreEvents;

  public static final String SERIALIZED_NAME_IS_LIVE_STREAM = "IsLiveStream";
  @SerializedName(SERIALIZED_NAME_IS_LIVE_STREAM)
  private Boolean isLiveStream;

  public static final String SERIALIZED_NAME_OUTRIGHT_GROUPS = "OutrightGroups";
  @SerializedName(SERIALIZED_NAME_OUTRIGHT_GROUPS)
  private List<OutrightGroupPerChampOut> outrightGroups;

  public EventResultOut() {
  }

  public EventResultOut(
     Boolean showMoreEvents
  ) {
    this();
    this.showMoreEvents = showMoreEvents;
  }

  public EventResultOut items(List<EventMenuItemOut> items) {
    this.items = items;
    return this;
  }

  public EventResultOut addItemsItem(EventMenuItemOut itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<EventMenuItemOut> getItems() {
    return items;
  }

  public void setItems(List<EventMenuItemOut> items) {
    this.items = items;
  }


  public EventResultOut eventsCount(Integer eventsCount) {
    this.eventsCount = eventsCount;
    return this;
  }

   /**
   * Get eventsCount
   * @return eventsCount
  **/
  @javax.annotation.Nonnull
  public Integer getEventsCount() {
    return eventsCount;
  }

  public void setEventsCount(Integer eventsCount) {
    this.eventsCount = eventsCount;
  }


  public EventResultOut showMoreEventsInt(Boolean showMoreEventsInt) {
    this.showMoreEventsInt = showMoreEventsInt;
    return this;
  }

   /**
   * Get showMoreEventsInt
   * @return showMoreEventsInt
  **/
  @javax.annotation.Nonnull
  public Boolean getShowMoreEventsInt() {
    return showMoreEventsInt;
  }

  public void setShowMoreEventsInt(Boolean showMoreEventsInt) {
    this.showMoreEventsInt = showMoreEventsInt;
  }


   /**
   * Get showMoreEvents
   * @return showMoreEvents
  **/
  @javax.annotation.Nonnull
  public Boolean getShowMoreEvents() {
    return showMoreEvents;
  }



  public EventResultOut isLiveStream(Boolean isLiveStream) {
    this.isLiveStream = isLiveStream;
    return this;
  }

   /**
   * Get isLiveStream
   * @return isLiveStream
  **/
  @javax.annotation.Nonnull
  public Boolean getIsLiveStream() {
    return isLiveStream;
  }

  public void setIsLiveStream(Boolean isLiveStream) {
    this.isLiveStream = isLiveStream;
  }


  public EventResultOut outrightGroups(List<OutrightGroupPerChampOut> outrightGroups) {
    this.outrightGroups = outrightGroups;
    return this;
  }

  public EventResultOut addOutrightGroupsItem(OutrightGroupPerChampOut outrightGroupsItem) {
    if (this.outrightGroups == null) {
      this.outrightGroups = new ArrayList<>();
    }
    this.outrightGroups.add(outrightGroupsItem);
    return this;
  }

   /**
   * Get outrightGroups
   * @return outrightGroups
  **/
  @javax.annotation.Nullable
  public List<OutrightGroupPerChampOut> getOutrightGroups() {
    return outrightGroups;
  }

  public void setOutrightGroups(List<OutrightGroupPerChampOut> outrightGroups) {
    this.outrightGroups = outrightGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResultOut eventResultOut = (EventResultOut) o;
    return Objects.equals(this.items, eventResultOut.items) &&
        Objects.equals(this.eventsCount, eventResultOut.eventsCount) &&
        Objects.equals(this.showMoreEventsInt, eventResultOut.showMoreEventsInt) &&
        Objects.equals(this.showMoreEvents, eventResultOut.showMoreEvents) &&
        Objects.equals(this.isLiveStream, eventResultOut.isLiveStream) &&
        Objects.equals(this.outrightGroups, eventResultOut.outrightGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, eventsCount, showMoreEventsInt, showMoreEvents, isLiveStream, outrightGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResultOut {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    showMoreEventsInt: ").append(toIndentedString(showMoreEventsInt)).append("\n");
    sb.append("    showMoreEvents: ").append(toIndentedString(showMoreEvents)).append("\n");
    sb.append("    isLiveStream: ").append(toIndentedString(isLiveStream)).append("\n");
    sb.append("    outrightGroups: ").append(toIndentedString(outrightGroups)).append("\n");
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
    openapiFields.add("Items");
    openapiFields.add("EventsCount");
    openapiFields.add("ShowMoreEventsInt");
    openapiFields.add("ShowMoreEvents");
    openapiFields.add("IsLiveStream");
    openapiFields.add("OutrightGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("EventsCount");
    openapiRequiredFields.add("ShowMoreEventsInt");
    openapiRequiredFields.add("ShowMoreEvents");
    openapiRequiredFields.add("IsLiveStream");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventResultOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventResultOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventResultOut is not found in the empty JSON string", EventResultOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventResultOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventResultOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventResultOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Items") != null && !jsonObj.get("Items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("Items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Items` to be an array in the JSON string but got `%s`", jsonObj.get("Items").toString()));
          }

          // validate the optional field `Items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            EventMenuItemOut.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if (jsonObj.get("OutrightGroups") != null && !jsonObj.get("OutrightGroups").isJsonNull()) {
        JsonArray jsonArrayoutrightGroups = jsonObj.getAsJsonArray("OutrightGroups");
        if (jsonArrayoutrightGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OutrightGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OutrightGroups` to be an array in the JSON string but got `%s`", jsonObj.get("OutrightGroups").toString()));
          }

          // validate the optional field `OutrightGroups` (array)
          for (int i = 0; i < jsonArrayoutrightGroups.size(); i++) {
            OutrightGroupPerChampOut.validateJsonElement(jsonArrayoutrightGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventResultOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventResultOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventResultOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventResultOut.class));

       return (TypeAdapter<T>) new TypeAdapter<EventResultOut>() {
           @Override
           public void write(JsonWriter out, EventResultOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventResultOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventResultOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventResultOut
  * @throws IOException if the JSON string is invalid with respect to EventResultOut
  */
  public static EventResultOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventResultOut.class);
  }

 /**
  * Convert an instance of EventResultOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

