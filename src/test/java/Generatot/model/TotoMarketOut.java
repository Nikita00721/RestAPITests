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
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * TotoMarketOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class TotoMarketOut {
  public static final String SERIALIZED_NAME_PROMO_BET_MARKET_ID = "PromoBetMarketId";
  @SerializedName(SERIALIZED_NAME_PROMO_BET_MARKET_ID)
  private Integer promoBetMarketId;

  public static final String SERIALIZED_NAME_TOTO_ID = "TotoId";
  @SerializedName(SERIALIZED_NAME_TOTO_ID)
  private Integer totoId;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public static final String SERIALIZED_NAME_EVENT_NAME = "EventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_EVENT_DATE = "EventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_MARKET_ID = "MarketId";
  @SerializedName(SERIALIZED_NAME_MARKET_ID)
  private Long marketId;

  public static final String SERIALIZED_NAME_MARKET_NAME = "MarketName";
  @SerializedName(SERIALIZED_NAME_MARKET_NAME)
  private String marketName;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public TotoMarketOut() {
  }

  public TotoMarketOut(
     Integer promoBetMarketId, 
     Integer totoId, 
     Long eventId, 
     OffsetDateTime eventDate, 
     Long marketId, 
     String marketName, 
     Integer marketTypeId
  ) {
    this();
    this.promoBetMarketId = promoBetMarketId;
    this.totoId = totoId;
    this.eventId = eventId;
    this.eventDate = eventDate;
    this.marketId = marketId;
    this.marketName = marketName;
    this.marketTypeId = marketTypeId;
  }

   /**
   * Get promoBetMarketId
   * @return promoBetMarketId
  **/
  @javax.annotation.Nonnull
  public Integer getPromoBetMarketId() {
    return promoBetMarketId;
  }



   /**
   * Get totoId
   * @return totoId
  **/
  @javax.annotation.Nonnull
  public Integer getTotoId() {
    return totoId;
  }



   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nonnull
  public Long getEventId() {
    return eventId;
  }



  public TotoMarketOut eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nonnull
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


   /**
   * Get eventDate
   * @return eventDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getEventDate() {
    return eventDate;
  }



   /**
   * Get marketId
   * @return marketId
  **/
  @javax.annotation.Nonnull
  public Long getMarketId() {
    return marketId;
  }



   /**
   * Get marketName
   * @return marketName
  **/
  @javax.annotation.Nullable
  public String getMarketName() {
    return marketName;
  }



   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getMarketTypeId() {
    return marketTypeId;
  }



  public TotoMarketOut status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotoMarketOut totoMarketOut = (TotoMarketOut) o;
    return Objects.equals(this.promoBetMarketId, totoMarketOut.promoBetMarketId) &&
        Objects.equals(this.totoId, totoMarketOut.totoId) &&
        Objects.equals(this.eventId, totoMarketOut.eventId) &&
        Objects.equals(this.eventName, totoMarketOut.eventName) &&
        Objects.equals(this.eventDate, totoMarketOut.eventDate) &&
        Objects.equals(this.marketId, totoMarketOut.marketId) &&
        Objects.equals(this.marketName, totoMarketOut.marketName) &&
        Objects.equals(this.marketTypeId, totoMarketOut.marketTypeId) &&
        Objects.equals(this.status, totoMarketOut.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoBetMarketId, totoId, eventId, eventName, eventDate, marketId, marketName, marketTypeId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotoMarketOut {\n");
    sb.append("    promoBetMarketId: ").append(toIndentedString(promoBetMarketId)).append("\n");
    sb.append("    totoId: ").append(toIndentedString(totoId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    marketName: ").append(toIndentedString(marketName)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("PromoBetMarketId");
    openapiFields.add("TotoId");
    openapiFields.add("EventId");
    openapiFields.add("EventName");
    openapiFields.add("EventDate");
    openapiFields.add("MarketId");
    openapiFields.add("MarketName");
    openapiFields.add("MarketTypeId");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PromoBetMarketId");
    openapiRequiredFields.add("TotoId");
    openapiRequiredFields.add("EventId");
    openapiRequiredFields.add("EventName");
    openapiRequiredFields.add("EventDate");
    openapiRequiredFields.add("MarketId");
    openapiRequiredFields.add("MarketTypeId");
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotoMarketOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoMarketOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoMarketOut is not found in the empty JSON string", TotoMarketOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoMarketOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoMarketOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotoMarketOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("EventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EventName").toString()));
      }
      if ((jsonObj.get("MarketName") != null && !jsonObj.get("MarketName").isJsonNull()) && !jsonObj.get("MarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketName").toString()));
      }
      if (!jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoMarketOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoMarketOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoMarketOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoMarketOut.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoMarketOut>() {
           @Override
           public void write(JsonWriter out, TotoMarketOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoMarketOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoMarketOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoMarketOut
  * @throws IOException if the JSON string is invalid with respect to TotoMarketOut
  */
  public static TotoMarketOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoMarketOut.class);
  }

 /**
  * Convert an instance of TotoMarketOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

