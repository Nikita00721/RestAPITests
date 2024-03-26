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
 * AamsFlowRegisterEventRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AamsFlowRegisterEventRequest {
  public static final String SERIALIZED_NAME_OPERATOR_IDS = "OperatorIds";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<Integer> operatorIds;

  public static final String SERIALIZED_NAME_INT_EVENT_IDS = "IntEventIds";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_IDS)
  private List<Long> intEventIds;

  public AamsFlowRegisterEventRequest() {
  }

  public AamsFlowRegisterEventRequest operatorIds(List<Integer> operatorIds) {
    this.operatorIds = operatorIds;
    return this;
  }

  public AamsFlowRegisterEventRequest addOperatorIdsItem(Integer operatorIdsItem) {
    if (this.operatorIds == null) {
      this.operatorIds = new ArrayList<>();
    }
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Get operatorIds
   * @return operatorIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getOperatorIds() {
    return operatorIds;
  }

  public void setOperatorIds(List<Integer> operatorIds) {
    this.operatorIds = operatorIds;
  }


  public AamsFlowRegisterEventRequest intEventIds(List<Long> intEventIds) {
    this.intEventIds = intEventIds;
    return this;
  }

  public AamsFlowRegisterEventRequest addIntEventIdsItem(Long intEventIdsItem) {
    if (this.intEventIds == null) {
      this.intEventIds = new ArrayList<>();
    }
    this.intEventIds.add(intEventIdsItem);
    return this;
  }

   /**
   * Get intEventIds
   * @return intEventIds
  **/
  @javax.annotation.Nullable
  public List<Long> getIntEventIds() {
    return intEventIds;
  }

  public void setIntEventIds(List<Long> intEventIds) {
    this.intEventIds = intEventIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AamsFlowRegisterEventRequest aamsFlowRegisterEventRequest = (AamsFlowRegisterEventRequest) o;
    return Objects.equals(this.operatorIds, aamsFlowRegisterEventRequest.operatorIds) &&
        Objects.equals(this.intEventIds, aamsFlowRegisterEventRequest.intEventIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorIds, intEventIds);
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
    sb.append("class AamsFlowRegisterEventRequest {\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
    sb.append("    intEventIds: ").append(toIndentedString(intEventIds)).append("\n");
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
    openapiFields.add("OperatorIds");
    openapiFields.add("IntEventIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AamsFlowRegisterEventRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AamsFlowRegisterEventRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AamsFlowRegisterEventRequest is not found in the empty JSON string", AamsFlowRegisterEventRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AamsFlowRegisterEventRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AamsFlowRegisterEventRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("OperatorIds") != null && !jsonObj.get("OperatorIds").isJsonNull() && !jsonObj.get("OperatorIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorIds` to be an array in the JSON string but got `%s`", jsonObj.get("OperatorIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("IntEventIds") != null && !jsonObj.get("IntEventIds").isJsonNull() && !jsonObj.get("IntEventIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `IntEventIds` to be an array in the JSON string but got `%s`", jsonObj.get("IntEventIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AamsFlowRegisterEventRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AamsFlowRegisterEventRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AamsFlowRegisterEventRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AamsFlowRegisterEventRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AamsFlowRegisterEventRequest>() {
           @Override
           public void write(JsonWriter out, AamsFlowRegisterEventRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AamsFlowRegisterEventRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AamsFlowRegisterEventRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AamsFlowRegisterEventRequest
  * @throws IOException if the JSON string is invalid with respect to AamsFlowRegisterEventRequest
  */
  public static AamsFlowRegisterEventRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AamsFlowRegisterEventRequest.class);
  }

 /**
  * Convert an instance of AamsFlowRegisterEventRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
