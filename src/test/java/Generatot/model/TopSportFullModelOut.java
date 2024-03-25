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
 * TopSportFullModelOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class TopSportFullModelOut {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_I_S_O = "ISO";
  @SerializedName(SERIALIZED_NAME_I_S_O)
  private String ISO;

  public static final String SERIALIZED_NAME_HAS_LIVE_EVENTS = "HasLiveEvents";
  @SerializedName(SERIALIZED_NAME_HAS_LIVE_EVENTS)
  private Boolean hasLiveEvents;

  public static final String SERIALIZED_NAME_EVENT_COUNT = "EventCount";
  @SerializedName(SERIALIZED_NAME_EVENT_COUNT)
  private Integer eventCount;

  public TopSportFullModelOut() {
  }

  public TopSportFullModelOut sportId(Integer sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nonnull
  public Integer getSportId() {
    return sportId;
  }

  public void setSportId(Integer sportId) {
    this.sportId = sportId;
  }


  public TopSportFullModelOut sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nonnull
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public TopSportFullModelOut sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }


  public TopSportFullModelOut name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TopSportFullModelOut ISO(String ISO) {
    this.ISO = ISO;
    return this;
  }

   /**
   * Get ISO
   * @return ISO
  **/
  @javax.annotation.Nullable
  public String getISO() {
    return ISO;
  }

  public void setISO(String ISO) {
    this.ISO = ISO;
  }


  public TopSportFullModelOut hasLiveEvents(Boolean hasLiveEvents) {
    this.hasLiveEvents = hasLiveEvents;
    return this;
  }

   /**
   * Get hasLiveEvents
   * @return hasLiveEvents
  **/
  @javax.annotation.Nonnull
  public Boolean getHasLiveEvents() {
    return hasLiveEvents;
  }

  public void setHasLiveEvents(Boolean hasLiveEvents) {
    this.hasLiveEvents = hasLiveEvents;
  }


  public TopSportFullModelOut eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * Get eventCount
   * @return eventCount
  **/
  @javax.annotation.Nonnull
  public Integer getEventCount() {
    return eventCount;
  }

  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopSportFullModelOut topSportFullModelOut = (TopSportFullModelOut) o;
    return Objects.equals(this.sportId, topSportFullModelOut.sportId) &&
        Objects.equals(this.sortOrder, topSportFullModelOut.sortOrder) &&
        Objects.equals(this.sportTypeId, topSportFullModelOut.sportTypeId) &&
        Objects.equals(this.name, topSportFullModelOut.name) &&
        Objects.equals(this.ISO, topSportFullModelOut.ISO) &&
        Objects.equals(this.hasLiveEvents, topSportFullModelOut.hasLiveEvents) &&
        Objects.equals(this.eventCount, topSportFullModelOut.eventCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, sortOrder, sportTypeId, name, ISO, hasLiveEvents, eventCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopSportFullModelOut {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ISO: ").append(toIndentedString(ISO)).append("\n");
    sb.append("    hasLiveEvents: ").append(toIndentedString(hasLiveEvents)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
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
    openapiFields.add("SportId");
    openapiFields.add("SortOrder");
    openapiFields.add("SportTypeId");
    openapiFields.add("Name");
    openapiFields.add("ISO");
    openapiFields.add("HasLiveEvents");
    openapiFields.add("EventCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SportId");
    openapiRequiredFields.add("SortOrder");
    openapiRequiredFields.add("SportTypeId");
    openapiRequiredFields.add("HasLiveEvents");
    openapiRequiredFields.add("EventCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TopSportFullModelOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopSportFullModelOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopSportFullModelOut is not found in the empty JSON string", TopSportFullModelOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopSportFullModelOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopSportFullModelOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TopSportFullModelOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("ISO") != null && !jsonObj.get("ISO").isJsonNull()) && !jsonObj.get("ISO").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ISO` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ISO").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopSportFullModelOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopSportFullModelOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopSportFullModelOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopSportFullModelOut.class));

       return (TypeAdapter<T>) new TypeAdapter<TopSportFullModelOut>() {
           @Override
           public void write(JsonWriter out, TopSportFullModelOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopSportFullModelOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TopSportFullModelOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TopSportFullModelOut
  * @throws IOException if the JSON string is invalid with respect to TopSportFullModelOut
  */
  public static TopSportFullModelOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopSportFullModelOut.class);
  }

 /**
  * Convert an instance of TopSportFullModelOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

