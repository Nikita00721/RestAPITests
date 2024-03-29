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
 * TimezoneWithCitiesItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TimezoneWithCitiesItem {
  public static final String SERIALIZED_NAME_TIME_ZONE_VALUE = "TimeZoneValue";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_VALUE)
  private String timeZoneValue;

  public static final String SERIALIZED_NAME_TIME_ZONE_ID = "TimeZoneId";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_ID)
  private String timeZoneId;

  public TimezoneWithCitiesItem() {
  }

  public TimezoneWithCitiesItem timeZoneValue(String timeZoneValue) {
    this.timeZoneValue = timeZoneValue;
    return this;
  }

   /**
   * Get timeZoneValue
   * @return timeZoneValue
  **/
  @javax.annotation.Nullable
  public String getTimeZoneValue() {
    return timeZoneValue;
  }

  public void setTimeZoneValue(String timeZoneValue) {
    this.timeZoneValue = timeZoneValue;
  }


  public TimezoneWithCitiesItem timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

   /**
   * Get timeZoneId
   * @return timeZoneId
  **/
  @javax.annotation.Nullable
  public String getTimeZoneId() {
    return timeZoneId;
  }

  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneWithCitiesItem timezoneWithCitiesItem = (TimezoneWithCitiesItem) o;
    return Objects.equals(this.timeZoneValue, timezoneWithCitiesItem.timeZoneValue) &&
        Objects.equals(this.timeZoneId, timezoneWithCitiesItem.timeZoneId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZoneValue, timeZoneId);
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
    sb.append("class TimezoneWithCitiesItem {\n");
    sb.append("    timeZoneValue: ").append(toIndentedString(timeZoneValue)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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
    openapiFields.add("TimeZoneValue");
    openapiFields.add("TimeZoneId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TimezoneWithCitiesItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimezoneWithCitiesItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimezoneWithCitiesItem is not found in the empty JSON string", TimezoneWithCitiesItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimezoneWithCitiesItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimezoneWithCitiesItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TimeZoneValue") != null && !jsonObj.get("TimeZoneValue").isJsonNull()) && !jsonObj.get("TimeZoneValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TimeZoneValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TimeZoneValue").toString()));
      }
      if ((jsonObj.get("TimeZoneId") != null && !jsonObj.get("TimeZoneId").isJsonNull()) && !jsonObj.get("TimeZoneId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TimeZoneId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TimeZoneId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimezoneWithCitiesItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimezoneWithCitiesItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimezoneWithCitiesItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimezoneWithCitiesItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TimezoneWithCitiesItem>() {
           @Override
           public void write(JsonWriter out, TimezoneWithCitiesItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimezoneWithCitiesItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimezoneWithCitiesItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimezoneWithCitiesItem
  * @throws IOException if the JSON string is invalid with respect to TimezoneWithCitiesItem
  */
  public static TimezoneWithCitiesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimezoneWithCitiesItem.class);
  }

 /**
  * Convert an instance of TimezoneWithCitiesItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

