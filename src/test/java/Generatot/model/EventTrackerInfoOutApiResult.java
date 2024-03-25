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
 * EventTrackerInfoOutApiResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class EventTrackerInfoOutApiResult {
  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private EventTrackerInfoOut result;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public EventTrackerInfoOutApiResult() {
  }

  public EventTrackerInfoOutApiResult result(EventTrackerInfoOut result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  public EventTrackerInfoOut getResult() {
    return result;
  }

  public void setResult(EventTrackerInfoOut result) {
    this.result = result;
  }


  public EventTrackerInfoOutApiResult error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTrackerInfoOutApiResult eventTrackerInfoOutApiResult = (EventTrackerInfoOutApiResult) o;
    return Objects.equals(this.result, eventTrackerInfoOutApiResult.result) &&
        Objects.equals(this.error, eventTrackerInfoOutApiResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTrackerInfoOutApiResult {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("Error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Result");
    openapiRequiredFields.add("Error");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventTrackerInfoOutApiResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventTrackerInfoOutApiResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventTrackerInfoOutApiResult is not found in the empty JSON string", EventTrackerInfoOutApiResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventTrackerInfoOutApiResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventTrackerInfoOutApiResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventTrackerInfoOutApiResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Result`
      EventTrackerInfoOut.validateJsonElement(jsonObj.get("Result"));
      // validate the required field `Error`
      Error.validateJsonElement(jsonObj.get("Error"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventTrackerInfoOutApiResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventTrackerInfoOutApiResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventTrackerInfoOutApiResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventTrackerInfoOutApiResult.class));

       return (TypeAdapter<T>) new TypeAdapter<EventTrackerInfoOutApiResult>() {
           @Override
           public void write(JsonWriter out, EventTrackerInfoOutApiResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventTrackerInfoOutApiResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventTrackerInfoOutApiResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventTrackerInfoOutApiResult
  * @throws IOException if the JSON string is invalid with respect to EventTrackerInfoOutApiResult
  */
  public static EventTrackerInfoOutApiResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventTrackerInfoOutApiResult.class);
  }

 /**
  * Convert an instance of EventTrackerInfoOutApiResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

