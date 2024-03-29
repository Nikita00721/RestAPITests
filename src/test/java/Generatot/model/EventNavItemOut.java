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
 * EventNavItemOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class EventNavItemOut {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE = "Node";
  @SerializedName(SERIALIZED_NAME_NODE)
  private String node;

  public static final String SERIALIZED_NAME_R_C = "RC";
  @SerializedName(SERIALIZED_NAME_R_C)
  private Boolean RC;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "EventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private ClientEventTypes eventType;

  public static final String SERIALIZED_NAME_COMPETITORS = "Competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private List<CompetitorNavItemOut> competitors;

  public EventNavItemOut() {
  }

  public EventNavItemOut id(Long id) {
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


  public EventNavItemOut name(String name) {
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


  public EventNavItemOut node(String node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @javax.annotation.Nullable
  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }


  public EventNavItemOut RC(Boolean RC) {
    this.RC = RC;
    return this;
  }

   /**
   * Get RC
   * @return RC
  **/
  @javax.annotation.Nullable
  public Boolean getRC() {
    return RC;
  }

  public void setRC(Boolean RC) {
    this.RC = RC;
  }


  public EventNavItemOut eventType(ClientEventTypes eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull
  public ClientEventTypes getEventType() {
    return eventType;
  }

  public void setEventType(ClientEventTypes eventType) {
    this.eventType = eventType;
  }


  public EventNavItemOut competitors(List<CompetitorNavItemOut> competitors) {
    this.competitors = competitors;
    return this;
  }

  public EventNavItemOut addCompetitorsItem(CompetitorNavItemOut competitorsItem) {
    if (this.competitors == null) {
      this.competitors = new ArrayList<>();
    }
    this.competitors.add(competitorsItem);
    return this;
  }

   /**
   * Get competitors
   * @return competitors
  **/
  @javax.annotation.Nullable
  public List<CompetitorNavItemOut> getCompetitors() {
    return competitors;
  }

  public void setCompetitors(List<CompetitorNavItemOut> competitors) {
    this.competitors = competitors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNavItemOut eventNavItemOut = (EventNavItemOut) o;
    return Objects.equals(this.id, eventNavItemOut.id) &&
        Objects.equals(this.name, eventNavItemOut.name) &&
        Objects.equals(this.node, eventNavItemOut.node) &&
        Objects.equals(this.RC, eventNavItemOut.RC) &&
        Objects.equals(this.eventType, eventNavItemOut.eventType) &&
        Objects.equals(this.competitors, eventNavItemOut.competitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, node, RC, eventType, competitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNavItemOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    RC: ").append(toIndentedString(RC)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Node");
    openapiFields.add("RC");
    openapiFields.add("EventType");
    openapiFields.add("Competitors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("EventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventNavItemOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventNavItemOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventNavItemOut is not found in the empty JSON string", EventNavItemOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventNavItemOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventNavItemOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventNavItemOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Node") != null && !jsonObj.get("Node").isJsonNull()) && !jsonObj.get("Node").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Node` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Node").toString()));
      }
      // validate the required field `EventType`
      ClientEventTypes.validateJsonElement(jsonObj.get("EventType"));
      if (jsonObj.get("Competitors") != null && !jsonObj.get("Competitors").isJsonNull()) {
        JsonArray jsonArraycompetitors = jsonObj.getAsJsonArray("Competitors");
        if (jsonArraycompetitors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Competitors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Competitors` to be an array in the JSON string but got `%s`", jsonObj.get("Competitors").toString()));
          }

          // validate the optional field `Competitors` (array)
          for (int i = 0; i < jsonArraycompetitors.size(); i++) {
            CompetitorNavItemOut.validateJsonElement(jsonArraycompetitors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventNavItemOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventNavItemOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventNavItemOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventNavItemOut.class));

       return (TypeAdapter<T>) new TypeAdapter<EventNavItemOut>() {
           @Override
           public void write(JsonWriter out, EventNavItemOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventNavItemOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventNavItemOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventNavItemOut
  * @throws IOException if the JSON string is invalid with respect to EventNavItemOut
  */
  public static EventNavItemOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventNavItemOut.class);
  }

 /**
  * Convert an instance of EventNavItemOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

