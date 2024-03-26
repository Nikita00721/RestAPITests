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

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * GetBoostEventMarketTypesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetBoostEventMarketTypesRequest {
  public static final String SERIALIZED_NAME_EVENT_DATE = "EventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_FM_CONFIG_ID = "FMConfigId";
  @SerializedName(SERIALIZED_NAME_FM_CONFIG_ID)
  private Integer fmConfigId;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public GetBoostEventMarketTypesRequest() {
  }

  public GetBoostEventMarketTypesRequest eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public GetBoostEventMarketTypesRequest fmConfigId(Integer fmConfigId) {
    this.fmConfigId = fmConfigId;
    return this;
  }

   /**
   * Get fmConfigId
   * @return fmConfigId
  **/
  @javax.annotation.Nullable
  public Integer getFmConfigId() {
    return fmConfigId;
  }

  public void setFmConfigId(Integer fmConfigId) {
    this.fmConfigId = fmConfigId;
  }


  public GetBoostEventMarketTypesRequest eventId(Long eventId) {
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
    GetBoostEventMarketTypesRequest getBoostEventMarketTypesRequest = (GetBoostEventMarketTypesRequest) o;
    return Objects.equals(this.eventDate, getBoostEventMarketTypesRequest.eventDate) &&
        Objects.equals(this.fmConfigId, getBoostEventMarketTypesRequest.fmConfigId) &&
        Objects.equals(this.eventId, getBoostEventMarketTypesRequest.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, fmConfigId, eventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBoostEventMarketTypesRequest {\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    fmConfigId: ").append(toIndentedString(fmConfigId)).append("\n");
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
    openapiFields.add("EventDate");
    openapiFields.add("FMConfigId");
    openapiFields.add("EventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetBoostEventMarketTypesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBoostEventMarketTypesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBoostEventMarketTypesRequest is not found in the empty JSON string", GetBoostEventMarketTypesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBoostEventMarketTypesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBoostEventMarketTypesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBoostEventMarketTypesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBoostEventMarketTypesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBoostEventMarketTypesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBoostEventMarketTypesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBoostEventMarketTypesRequest>() {
           @Override
           public void write(JsonWriter out, GetBoostEventMarketTypesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBoostEventMarketTypesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBoostEventMarketTypesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBoostEventMarketTypesRequest
  * @throws IOException if the JSON string is invalid with respect to GetBoostEventMarketTypesRequest
  */
  public static GetBoostEventMarketTypesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBoostEventMarketTypesRequest.class);
  }

 /**
  * Convert an instance of GetBoostEventMarketTypesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
