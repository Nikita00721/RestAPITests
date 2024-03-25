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
 * PopularBetsTotalOddsOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class PopularBetsTotalOddsOut {
  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventOut> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ODDS = "TotalOdds";
  @SerializedName(SERIALIZED_NAME_TOTAL_ODDS)
  private Double totalOdds;

  public PopularBetsTotalOddsOut() {
  }

  public PopularBetsTotalOddsOut events(List<EventOut> events) {
    this.events = events;
    return this;
  }

  public PopularBetsTotalOddsOut addEventsItem(EventOut eventsItem) {
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
  @javax.annotation.Nonnull
  public List<EventOut> getEvents() {
    return events;
  }

  public void setEvents(List<EventOut> events) {
    this.events = events;
  }


  public PopularBetsTotalOddsOut totalOdds(Double totalOdds) {
    this.totalOdds = totalOdds;
    return this;
  }

   /**
   * Get totalOdds
   * @return totalOdds
  **/
  @javax.annotation.Nonnull
  public Double getTotalOdds() {
    return totalOdds;
  }

  public void setTotalOdds(Double totalOdds) {
    this.totalOdds = totalOdds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularBetsTotalOddsOut popularBetsTotalOddsOut = (PopularBetsTotalOddsOut) o;
    return Objects.equals(this.events, popularBetsTotalOddsOut.events) &&
        Objects.equals(this.totalOdds, popularBetsTotalOddsOut.totalOdds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, totalOdds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularBetsTotalOddsOut {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    totalOdds: ").append(toIndentedString(totalOdds)).append("\n");
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
    openapiFields.add("Events");
    openapiFields.add("TotalOdds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Events");
    openapiRequiredFields.add("TotalOdds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PopularBetsTotalOddsOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PopularBetsTotalOddsOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PopularBetsTotalOddsOut is not found in the empty JSON string", PopularBetsTotalOddsOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PopularBetsTotalOddsOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PopularBetsTotalOddsOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PopularBetsTotalOddsOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Events` to be an array in the JSON string but got `%s`", jsonObj.get("Events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("Events");
      // validate the required field `Events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        EventOut.validateJsonElement(jsonArrayevents.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PopularBetsTotalOddsOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PopularBetsTotalOddsOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PopularBetsTotalOddsOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PopularBetsTotalOddsOut.class));

       return (TypeAdapter<T>) new TypeAdapter<PopularBetsTotalOddsOut>() {
           @Override
           public void write(JsonWriter out, PopularBetsTotalOddsOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PopularBetsTotalOddsOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PopularBetsTotalOddsOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PopularBetsTotalOddsOut
  * @throws IOException if the JSON string is invalid with respect to PopularBetsTotalOddsOut
  */
  public static PopularBetsTotalOddsOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PopularBetsTotalOddsOut.class);
  }

 /**
  * Convert an instance of PopularBetsTotalOddsOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
