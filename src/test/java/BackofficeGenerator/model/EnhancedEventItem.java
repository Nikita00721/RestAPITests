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
 * EnhancedEventItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class EnhancedEventItem {
  public static final String SERIALIZED_NAME_EVENT_DATE = "EventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_EVENT_NAME = "EventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_NAME = "ChampionshipName";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_NAME)
  private String championshipName;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "CategoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public EnhancedEventItem() {
  }

  public EnhancedEventItem eventDate(OffsetDateTime eventDate) {
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


  public EnhancedEventItem eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public EnhancedEventItem championshipName(String championshipName) {
    this.championshipName = championshipName;
    return this;
  }

   /**
   * Get championshipName
   * @return championshipName
  **/
  @javax.annotation.Nullable
  public String getChampionshipName() {
    return championshipName;
  }

  public void setChampionshipName(String championshipName) {
    this.championshipName = championshipName;
  }


  public EnhancedEventItem categoryName(String categoryName) {
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


  public EnhancedEventItem sportName(String sportName) {
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


  public EnhancedEventItem eventId(Long eventId) {
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
    EnhancedEventItem enhancedEventItem = (EnhancedEventItem) o;
    return Objects.equals(this.eventDate, enhancedEventItem.eventDate) &&
        Objects.equals(this.eventName, enhancedEventItem.eventName) &&
        Objects.equals(this.championshipName, enhancedEventItem.championshipName) &&
        Objects.equals(this.categoryName, enhancedEventItem.categoryName) &&
        Objects.equals(this.sportName, enhancedEventItem.sportName) &&
        Objects.equals(this.eventId, enhancedEventItem.eventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventName, championshipName, categoryName, sportName, eventId);
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
    sb.append("class EnhancedEventItem {\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    championshipName: ").append(toIndentedString(championshipName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
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
    openapiFields.add("EventName");
    openapiFields.add("ChampionshipName");
    openapiFields.add("CategoryName");
    openapiFields.add("SportName");
    openapiFields.add("EventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnhancedEventItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnhancedEventItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnhancedEventItem is not found in the empty JSON string", EnhancedEventItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnhancedEventItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnhancedEventItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EventName") != null && !jsonObj.get("EventName").isJsonNull()) && !jsonObj.get("EventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EventName").toString()));
      }
      if ((jsonObj.get("ChampionshipName") != null && !jsonObj.get("ChampionshipName").isJsonNull()) && !jsonObj.get("ChampionshipName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampionshipName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampionshipName").toString()));
      }
      if ((jsonObj.get("CategoryName") != null && !jsonObj.get("CategoryName").isJsonNull()) && !jsonObj.get("CategoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CategoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CategoryName").toString()));
      }
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnhancedEventItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnhancedEventItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnhancedEventItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnhancedEventItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EnhancedEventItem>() {
           @Override
           public void write(JsonWriter out, EnhancedEventItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnhancedEventItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnhancedEventItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnhancedEventItem
  * @throws IOException if the JSON string is invalid with respect to EnhancedEventItem
  */
  public static EnhancedEventItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnhancedEventItem.class);
  }

 /**
  * Convert an instance of EnhancedEventItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
