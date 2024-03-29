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
 * DeleteSharedAttributeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class DeleteSharedAttributeRequest {
  public static final String SERIALIZED_NAME_SHARED_ATTRIBUTE_KEY = "SharedAttributeKey";
  @SerializedName(SERIALIZED_NAME_SHARED_ATTRIBUTE_KEY)
  private String sharedAttributeKey;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "TerminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public DeleteSharedAttributeRequest() {
  }

  public DeleteSharedAttributeRequest sharedAttributeKey(String sharedAttributeKey) {
    this.sharedAttributeKey = sharedAttributeKey;
    return this;
  }

   /**
   * Get sharedAttributeKey
   * @return sharedAttributeKey
  **/
  @javax.annotation.Nullable
  public String getSharedAttributeKey() {
    return sharedAttributeKey;
  }

  public void setSharedAttributeKey(String sharedAttributeKey) {
    this.sharedAttributeKey = sharedAttributeKey;
  }


  public DeleteSharedAttributeRequest terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Get terminalId
   * @return terminalId
  **/
  @javax.annotation.Nullable
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteSharedAttributeRequest deleteSharedAttributeRequest = (DeleteSharedAttributeRequest) o;
    return Objects.equals(this.sharedAttributeKey, deleteSharedAttributeRequest.sharedAttributeKey) &&
        Objects.equals(this.terminalId, deleteSharedAttributeRequest.terminalId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedAttributeKey, terminalId);
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
    sb.append("class DeleteSharedAttributeRequest {\n");
    sb.append("    sharedAttributeKey: ").append(toIndentedString(sharedAttributeKey)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
    openapiFields.add("SharedAttributeKey");
    openapiFields.add("TerminalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteSharedAttributeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteSharedAttributeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteSharedAttributeRequest is not found in the empty JSON string", DeleteSharedAttributeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteSharedAttributeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteSharedAttributeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SharedAttributeKey") != null && !jsonObj.get("SharedAttributeKey").isJsonNull()) && !jsonObj.get("SharedAttributeKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SharedAttributeKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SharedAttributeKey").toString()));
      }
      if ((jsonObj.get("TerminalId") != null && !jsonObj.get("TerminalId").isJsonNull()) && !jsonObj.get("TerminalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TerminalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TerminalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteSharedAttributeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteSharedAttributeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteSharedAttributeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteSharedAttributeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteSharedAttributeRequest>() {
           @Override
           public void write(JsonWriter out, DeleteSharedAttributeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteSharedAttributeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteSharedAttributeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteSharedAttributeRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteSharedAttributeRequest
  */
  public static DeleteSharedAttributeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteSharedAttributeRequest.class);
  }

 /**
  * Convert an instance of DeleteSharedAttributeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

