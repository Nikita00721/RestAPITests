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
 * EventTypesOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class EventTypesOut {
  public static final String SERIALIZED_NAME_MATCH = "Match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private Boolean match;

  public static final String SERIALIZED_NAME_OUTRIGHT = "Outright";
  @SerializedName(SERIALIZED_NAME_OUTRIGHT)
  private Boolean outright;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public EventTypesOut() {
  }

  public EventTypesOut match(Boolean match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @javax.annotation.Nonnull
  public Boolean getMatch() {
    return match;
  }

  public void setMatch(Boolean match) {
    this.match = match;
  }


  public EventTypesOut outright(Boolean outright) {
    this.outright = outright;
    return this;
  }

   /**
   * Get outright
   * @return outright
  **/
  @javax.annotation.Nonnull
  public Boolean getOutright() {
    return outright;
  }

  public void setOutright(Boolean outright) {
    this.outright = outright;
  }


  public EventTypesOut sportTypeId(Integer sportTypeId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypesOut eventTypesOut = (EventTypesOut) o;
    return Objects.equals(this.match, eventTypesOut.match) &&
        Objects.equals(this.outright, eventTypesOut.outright) &&
        Objects.equals(this.sportTypeId, eventTypesOut.sportTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, outright, sportTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypesOut {\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    outright: ").append(toIndentedString(outright)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
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
    openapiFields.add("Match");
    openapiFields.add("Outright");
    openapiFields.add("SportTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Match");
    openapiRequiredFields.add("Outright");
    openapiRequiredFields.add("SportTypeId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventTypesOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventTypesOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventTypesOut is not found in the empty JSON string", EventTypesOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventTypesOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventTypesOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventTypesOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventTypesOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventTypesOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventTypesOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventTypesOut.class));

       return (TypeAdapter<T>) new TypeAdapter<EventTypesOut>() {
           @Override
           public void write(JsonWriter out, EventTypesOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventTypesOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventTypesOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventTypesOut
  * @throws IOException if the JSON string is invalid with respect to EventTypesOut
  */
  public static EventTypesOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventTypesOut.class);
  }

 /**
  * Convert an instance of EventTypesOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

