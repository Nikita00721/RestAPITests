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
 * SportWithStreamingAndEventsOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class SportWithStreamingAndEventsOut {
  public static final String SERIALIZED_NAME_TOP_SPORTS = "TopSports";
  @SerializedName(SERIALIZED_NAME_TOP_SPORTS)
  private List<SportMenuItemOut> topSports = new ArrayList<>();

  public static final String SERIALIZED_NAME_STREAMING_EVENTS = "StreamingEvents";
  @SerializedName(SERIALIZED_NAME_STREAMING_EVENTS)
  private EventResultOut streamingEvents;

  public SportWithStreamingAndEventsOut() {
  }

  public SportWithStreamingAndEventsOut topSports(List<SportMenuItemOut> topSports) {
    this.topSports = topSports;
    return this;
  }

  public SportWithStreamingAndEventsOut addTopSportsItem(SportMenuItemOut topSportsItem) {
    if (this.topSports == null) {
      this.topSports = new ArrayList<>();
    }
    this.topSports.add(topSportsItem);
    return this;
  }

   /**
   * Get topSports
   * @return topSports
  **/
  @javax.annotation.Nonnull
  public List<SportMenuItemOut> getTopSports() {
    return topSports;
  }

  public void setTopSports(List<SportMenuItemOut> topSports) {
    this.topSports = topSports;
  }


  public SportWithStreamingAndEventsOut streamingEvents(EventResultOut streamingEvents) {
    this.streamingEvents = streamingEvents;
    return this;
  }

   /**
   * Get streamingEvents
   * @return streamingEvents
  **/
  @javax.annotation.Nullable
  public EventResultOut getStreamingEvents() {
    return streamingEvents;
  }

  public void setStreamingEvents(EventResultOut streamingEvents) {
    this.streamingEvents = streamingEvents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportWithStreamingAndEventsOut sportWithStreamingAndEventsOut = (SportWithStreamingAndEventsOut) o;
    return Objects.equals(this.topSports, sportWithStreamingAndEventsOut.topSports) &&
        Objects.equals(this.streamingEvents, sportWithStreamingAndEventsOut.streamingEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topSports, streamingEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SportWithStreamingAndEventsOut {\n");
    sb.append("    topSports: ").append(toIndentedString(topSports)).append("\n");
    sb.append("    streamingEvents: ").append(toIndentedString(streamingEvents)).append("\n");
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
    openapiFields.add("TopSports");
    openapiFields.add("StreamingEvents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TopSports");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SportWithStreamingAndEventsOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SportWithStreamingAndEventsOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SportWithStreamingAndEventsOut is not found in the empty JSON string", SportWithStreamingAndEventsOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SportWithStreamingAndEventsOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SportWithStreamingAndEventsOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SportWithStreamingAndEventsOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("TopSports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TopSports` to be an array in the JSON string but got `%s`", jsonObj.get("TopSports").toString()));
      }

      JsonArray jsonArraytopSports = jsonObj.getAsJsonArray("TopSports");
      // validate the required field `TopSports` (array)
      for (int i = 0; i < jsonArraytopSports.size(); i++) {
        SportMenuItemOut.validateJsonElement(jsonArraytopSports.get(i));
      };
      // validate the optional field `StreamingEvents`
      if (jsonObj.get("StreamingEvents") != null && !jsonObj.get("StreamingEvents").isJsonNull()) {
        EventResultOut.validateJsonElement(jsonObj.get("StreamingEvents"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SportWithStreamingAndEventsOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SportWithStreamingAndEventsOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SportWithStreamingAndEventsOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SportWithStreamingAndEventsOut.class));

       return (TypeAdapter<T>) new TypeAdapter<SportWithStreamingAndEventsOut>() {
           @Override
           public void write(JsonWriter out, SportWithStreamingAndEventsOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SportWithStreamingAndEventsOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SportWithStreamingAndEventsOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SportWithStreamingAndEventsOut
  * @throws IOException if the JSON string is invalid with respect to SportWithStreamingAndEventsOut
  */
  public static SportWithStreamingAndEventsOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SportWithStreamingAndEventsOut.class);
  }

 /**
  * Convert an instance of SportWithStreamingAndEventsOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

