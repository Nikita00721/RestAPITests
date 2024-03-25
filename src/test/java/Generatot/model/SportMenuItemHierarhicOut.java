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
 * SportMenuItemHierarhicOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class SportMenuItemHierarhicOut {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NODE_TYPE = "NodeType";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  private String nodeType;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENT_COUNT = "EventCount";
  @SerializedName(SERIALIZED_NAME_EVENT_COUNT)
  private Integer eventCount;

  public static final String SERIALIZED_NAME_I_S_O = "ISO";
  @SerializedName(SERIALIZED_NAME_I_S_O)
  private String ISO;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Long sportId;

  public static final String SERIALIZED_NAME_HAS_LIVE_EVENTS = "HasLiveEvents";
  @SerializedName(SERIALIZED_NAME_HAS_LIVE_EVENTS)
  private Boolean hasLiveEvents;

  public static final String SERIALIZED_NAME_HAS_LIVE_STREAM = "HasLiveStream";
  @SerializedName(SERIALIZED_NAME_HAS_LIVE_STREAM)
  private Boolean hasLiveStream;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SportMenuItemHierarhicOut> items;

  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventOut> events;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_IDS = "ChampionshipIds";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_IDS)
  private String championshipIds;

  public static final String SERIALIZED_NAME_E_P = "EP";
  @SerializedName(SERIALIZED_NAME_E_P)
  private Boolean EP;

  public static final String SERIALIZED_NAME_B_D = "BD";
  @SerializedName(SERIALIZED_NAME_B_D)
  private Boolean BD;

  public SportMenuItemHierarhicOut() {
  }

  public SportMenuItemHierarhicOut(
     String championshipIds
  ) {
    this();
    this.championshipIds = championshipIds;
  }

  public SportMenuItemHierarhicOut id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public SportMenuItemHierarhicOut nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @javax.annotation.Nullable
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  public SportMenuItemHierarhicOut name(String name) {
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


  public SportMenuItemHierarhicOut eventCount(Integer eventCount) {
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


  public SportMenuItemHierarhicOut ISO(String ISO) {
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


  public SportMenuItemHierarhicOut sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }


  public SportMenuItemHierarhicOut sportId(Long sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nonnull
  public Long getSportId() {
    return sportId;
  }

  public void setSportId(Long sportId) {
    this.sportId = sportId;
  }


  public SportMenuItemHierarhicOut hasLiveEvents(Boolean hasLiveEvents) {
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


  public SportMenuItemHierarhicOut hasLiveStream(Boolean hasLiveStream) {
    this.hasLiveStream = hasLiveStream;
    return this;
  }

   /**
   * Get hasLiveStream
   * @return hasLiveStream
  **/
  @javax.annotation.Nonnull
  public Boolean getHasLiveStream() {
    return hasLiveStream;
  }

  public void setHasLiveStream(Boolean hasLiveStream) {
    this.hasLiveStream = hasLiveStream;
  }


  public SportMenuItemHierarhicOut sortOrder(Integer sortOrder) {
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


  public SportMenuItemHierarhicOut items(List<SportMenuItemHierarhicOut> items) {
    this.items = items;
    return this;
  }

  public SportMenuItemHierarhicOut addItemsItem(SportMenuItemHierarhicOut itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<SportMenuItemHierarhicOut> getItems() {
    return items;
  }

  public void setItems(List<SportMenuItemHierarhicOut> items) {
    this.items = items;
  }


  public SportMenuItemHierarhicOut events(List<EventOut> events) {
    this.events = events;
    return this;
  }

  public SportMenuItemHierarhicOut addEventsItem(EventOut eventsItem) {
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


   /**
   * Get championshipIds
   * @return championshipIds
  **/
  @javax.annotation.Nullable
  public String getChampionshipIds() {
    return championshipIds;
  }



  public SportMenuItemHierarhicOut EP(Boolean EP) {
    this.EP = EP;
    return this;
  }

   /**
   * Get EP
   * @return EP
  **/
  @javax.annotation.Nullable
  public Boolean getEP() {
    return EP;
  }

  public void setEP(Boolean EP) {
    this.EP = EP;
  }


  public SportMenuItemHierarhicOut BD(Boolean BD) {
    this.BD = BD;
    return this;
  }

   /**
   * Get BD
   * @return BD
  **/
  @javax.annotation.Nullable
  public Boolean getBD() {
    return BD;
  }

  public void setBD(Boolean BD) {
    this.BD = BD;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportMenuItemHierarhicOut sportMenuItemHierarhicOut = (SportMenuItemHierarhicOut) o;
    return Objects.equals(this.id, sportMenuItemHierarhicOut.id) &&
        Objects.equals(this.nodeType, sportMenuItemHierarhicOut.nodeType) &&
        Objects.equals(this.name, sportMenuItemHierarhicOut.name) &&
        Objects.equals(this.eventCount, sportMenuItemHierarhicOut.eventCount) &&
        Objects.equals(this.ISO, sportMenuItemHierarhicOut.ISO) &&
        Objects.equals(this.sportTypeId, sportMenuItemHierarhicOut.sportTypeId) &&
        Objects.equals(this.sportId, sportMenuItemHierarhicOut.sportId) &&
        Objects.equals(this.hasLiveEvents, sportMenuItemHierarhicOut.hasLiveEvents) &&
        Objects.equals(this.hasLiveStream, sportMenuItemHierarhicOut.hasLiveStream) &&
        Objects.equals(this.sortOrder, sportMenuItemHierarhicOut.sortOrder) &&
        Objects.equals(this.items, sportMenuItemHierarhicOut.items) &&
        Objects.equals(this.events, sportMenuItemHierarhicOut.events) &&
        Objects.equals(this.championshipIds, sportMenuItemHierarhicOut.championshipIds) &&
        Objects.equals(this.EP, sportMenuItemHierarhicOut.EP) &&
        Objects.equals(this.BD, sportMenuItemHierarhicOut.BD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeType, name, eventCount, ISO, sportTypeId, sportId, hasLiveEvents, hasLiveStream, sortOrder, items, events, championshipIds, EP, BD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SportMenuItemHierarhicOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    ISO: ").append(toIndentedString(ISO)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    hasLiveEvents: ").append(toIndentedString(hasLiveEvents)).append("\n");
    sb.append("    hasLiveStream: ").append(toIndentedString(hasLiveStream)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    championshipIds: ").append(toIndentedString(championshipIds)).append("\n");
    sb.append("    EP: ").append(toIndentedString(EP)).append("\n");
    sb.append("    BD: ").append(toIndentedString(BD)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("NodeType");
    openapiFields.add("Name");
    openapiFields.add("EventCount");
    openapiFields.add("ISO");
    openapiFields.add("SportTypeId");
    openapiFields.add("SportId");
    openapiFields.add("HasLiveEvents");
    openapiFields.add("HasLiveStream");
    openapiFields.add("SortOrder");
    openapiFields.add("Items");
    openapiFields.add("Events");
    openapiFields.add("ChampionshipIds");
    openapiFields.add("EP");
    openapiFields.add("BD");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("EventCount");
    openapiRequiredFields.add("SportId");
    openapiRequiredFields.add("HasLiveEvents");
    openapiRequiredFields.add("HasLiveStream");
    openapiRequiredFields.add("SortOrder");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SportMenuItemHierarhicOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SportMenuItemHierarhicOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SportMenuItemHierarhicOut is not found in the empty JSON string", SportMenuItemHierarhicOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SportMenuItemHierarhicOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SportMenuItemHierarhicOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SportMenuItemHierarhicOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("NodeType") != null && !jsonObj.get("NodeType").isJsonNull()) && !jsonObj.get("NodeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NodeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NodeType").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("ISO") != null && !jsonObj.get("ISO").isJsonNull()) && !jsonObj.get("ISO").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ISO` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ISO").toString()));
      }
      if (jsonObj.get("Items") != null && !jsonObj.get("Items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("Items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Items` to be an array in the JSON string but got `%s`", jsonObj.get("Items").toString()));
          }

          // validate the optional field `Items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            SportMenuItemHierarhicOut.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
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
      if ((jsonObj.get("ChampionshipIds") != null && !jsonObj.get("ChampionshipIds").isJsonNull()) && !jsonObj.get("ChampionshipIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampionshipIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampionshipIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SportMenuItemHierarhicOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SportMenuItemHierarhicOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SportMenuItemHierarhicOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SportMenuItemHierarhicOut.class));

       return (TypeAdapter<T>) new TypeAdapter<SportMenuItemHierarhicOut>() {
           @Override
           public void write(JsonWriter out, SportMenuItemHierarhicOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SportMenuItemHierarhicOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SportMenuItemHierarhicOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SportMenuItemHierarhicOut
  * @throws IOException if the JSON string is invalid with respect to SportMenuItemHierarhicOut
  */
  public static SportMenuItemHierarhicOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SportMenuItemHierarhicOut.class);
  }

 /**
  * Convert an instance of SportMenuItemHierarhicOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

