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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * TotoEventsOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class TotoEventsOut {
  public static final String SERIALIZED_NAME_TOTO = "Toto";
  @SerializedName(SERIALIZED_NAME_TOTO)
  private TotoOut toto;

  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private EventResultOut events;

  public TotoEventsOut() {
  }

  public TotoEventsOut toto(TotoOut toto) {
    this.toto = toto;
    return this;
  }

   /**
   * Get toto
   * @return toto
  **/
  @javax.annotation.Nonnull
  public TotoOut getToto() {
    return toto;
  }

  public void setToto(TotoOut toto) {
    this.toto = toto;
  }


  public TotoEventsOut events(EventResultOut events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull
  public EventResultOut getEvents() {
    return events;
  }

  public void setEvents(EventResultOut events) {
    this.events = events;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotoEventsOut totoEventsOut = (TotoEventsOut) o;
    return Objects.equals(this.toto, totoEventsOut.toto) &&
        Objects.equals(this.events, totoEventsOut.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toto, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotoEventsOut {\n");
    sb.append("    toto: ").append(toIndentedString(toto)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    openapiFields.add("Toto");
    openapiFields.add("Events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Toto");
    openapiRequiredFields.add("Events");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotoEventsOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoEventsOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoEventsOut is not found in the empty JSON string", TotoEventsOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoEventsOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoEventsOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotoEventsOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Toto`
      TotoOut.validateJsonElement(jsonObj.get("Toto"));
      // validate the required field `Events`
      EventResultOut.validateJsonElement(jsonObj.get("Events"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoEventsOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoEventsOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoEventsOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoEventsOut.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoEventsOut>() {
           @Override
           public void write(JsonWriter out, TotoEventsOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoEventsOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoEventsOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoEventsOut
  * @throws IOException if the JSON string is invalid with respect to TotoEventsOut
  */
  public static TotoEventsOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoEventsOut.class);
  }

 /**
  * Convert an instance of TotoEventsOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

