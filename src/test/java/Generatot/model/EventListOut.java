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
 * EventListOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class EventListOut {
  public static final String SERIALIZED_NAME_EVENTS_COUNT = "EventsCount";
  @SerializedName(SERIALIZED_NAME_EVENTS_COUNT)
  private Integer eventsCount;

  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventOut> events;

  public static final String SERIALIZED_NAME_EVENT_IDS = "EventIds";
  @SerializedName(SERIALIZED_NAME_EVENT_IDS)
  private List<Long> eventIds;

  public EventListOut() {
  }

  public EventListOut eventsCount(Integer eventsCount) {
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


  public EventListOut events(List<EventOut> events) {
    this.events = events;
    return this;
  }

  public EventListOut addEventsItem(EventOut eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<EventOut> getEvents() {
    return events;
  }

  public void setEvents(List<EventOut> events) {
    this.events = events;
  }


  public EventListOut eventIds(List<Long> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public EventListOut addEventIdsItem(Long eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

   /**
   * Get eventIds
   * @return eventIds
  **/
  @javax.annotation.Nullable
  public List<Long> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<Long> eventIds) {
    this.eventIds = eventIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventListOut eventListOut = (EventListOut) o;
    return Objects.equals(this.eventsCount, eventListOut.eventsCount) &&
        Objects.equals(this.events, eventListOut.events) &&
        Objects.equals(this.eventIds, eventListOut.eventIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventsCount, events, eventIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventListOut {\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
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
    openapiFields.add("EventsCount");
    openapiFields.add("Events");
    openapiFields.add("EventIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("EventsCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventListOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventListOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventListOut is not found in the empty JSON string", EventListOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventListOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventListOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventListOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Events") != null && !jsonObj.get("Events").isJsonNull()) {
        JsonArray jsonArrayevents = jsonObj.getAsJsonArray("Events");
        if (jsonArrayevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Events` to be an array in the JSON string but got `%s`", jsonObj.get("Events").toString()));
          }

          // validate the optional field `Events` (array)
          for (int i = 0; i < jsonArrayevents.size(); i++) {
            EventOut.validateJsonElement(jsonArrayevents.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("EventIds") != null && !jsonObj.get("EventIds").isJsonNull() && !jsonObj.get("EventIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventIds` to be an array in the JSON string but got `%s`", jsonObj.get("EventIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventListOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventListOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventListOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventListOut.class));

       return (TypeAdapter<T>) new TypeAdapter<EventListOut>() {
           @Override
           public void write(JsonWriter out, EventListOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventListOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventListOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventListOut
  * @throws IOException if the JSON string is invalid with respect to EventListOut
  */
  public static EventListOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventListOut.class);
  }

 /**
  * Convert an instance of EventListOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

