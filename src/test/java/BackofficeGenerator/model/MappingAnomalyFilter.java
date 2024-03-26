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
 * MappingAnomalyFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MappingAnomalyFilter {
  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public static final String SERIALIZED_NAME_EVENT_NAME = "EventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_TYPE_ID = "TypeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public MappingAnomalyFilter() {
  }

  public MappingAnomalyFilter intEventId(Long intEventId) {
    this.intEventId = intEventId;
    return this;
  }

   /**
   * Get intEventId
   * @return intEventId
  **/
  @javax.annotation.Nullable
  public Long getIntEventId() {
    return intEventId;
  }

  public void setIntEventId(Long intEventId) {
    this.intEventId = intEventId;
  }


  public MappingAnomalyFilter eventName(String eventName) {
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


  public MappingAnomalyFilter typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nullable
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public MappingAnomalyFilter operatorId(Integer operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @javax.annotation.Nullable
  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingAnomalyFilter mappingAnomalyFilter = (MappingAnomalyFilter) o;
    return Objects.equals(this.intEventId, mappingAnomalyFilter.intEventId) &&
        Objects.equals(this.eventName, mappingAnomalyFilter.eventName) &&
        Objects.equals(this.typeId, mappingAnomalyFilter.typeId) &&
        Objects.equals(this.operatorId, mappingAnomalyFilter.operatorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intEventId, eventName, typeId, operatorId);
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
    sb.append("class MappingAnomalyFilter {\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
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
    openapiFields.add("IntEventId");
    openapiFields.add("EventName");
    openapiFields.add("TypeId");
    openapiFields.add("OperatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MappingAnomalyFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MappingAnomalyFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MappingAnomalyFilter is not found in the empty JSON string", MappingAnomalyFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MappingAnomalyFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MappingAnomalyFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EventName") != null && !jsonObj.get("EventName").isJsonNull()) && !jsonObj.get("EventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EventName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MappingAnomalyFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MappingAnomalyFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MappingAnomalyFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MappingAnomalyFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<MappingAnomalyFilter>() {
           @Override
           public void write(JsonWriter out, MappingAnomalyFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MappingAnomalyFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MappingAnomalyFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MappingAnomalyFilter
  * @throws IOException if the JSON string is invalid with respect to MappingAnomalyFilter
  */
  public static MappingAnomalyFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MappingAnomalyFilter.class);
  }

 /**
  * Convert an instance of MappingAnomalyFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

