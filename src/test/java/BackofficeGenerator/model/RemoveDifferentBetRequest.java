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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * RemoveDifferentBetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class RemoveDifferentBetRequest {
  public static final String SERIALIZED_NAME_INT_BET_ID = "IntBetId";
  @SerializedName(SERIALIZED_NAME_INT_BET_ID)
  private Long intBetId;

  public RemoveDifferentBetRequest() {
  }

  public RemoveDifferentBetRequest intBetId(Long intBetId) {
    this.intBetId = intBetId;
    return this;
  }

   /**
   * Get intBetId
   * @return intBetId
  **/
  @javax.annotation.Nullable
  public Long getIntBetId() {
    return intBetId;
  }

  public void setIntBetId(Long intBetId) {
    this.intBetId = intBetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveDifferentBetRequest removeDifferentBetRequest = (RemoveDifferentBetRequest) o;
    return Objects.equals(this.intBetId, removeDifferentBetRequest.intBetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intBetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDifferentBetRequest {\n");
    sb.append("    intBetId: ").append(toIndentedString(intBetId)).append("\n");
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
    openapiFields.add("IntBetId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RemoveDifferentBetRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RemoveDifferentBetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoveDifferentBetRequest is not found in the empty JSON string", RemoveDifferentBetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RemoveDifferentBetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemoveDifferentBetRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoveDifferentBetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoveDifferentBetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoveDifferentBetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoveDifferentBetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoveDifferentBetRequest>() {
           @Override
           public void write(JsonWriter out, RemoveDifferentBetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemoveDifferentBetRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemoveDifferentBetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemoveDifferentBetRequest
  * @throws IOException if the JSON string is invalid with respect to RemoveDifferentBetRequest
  */
  public static RemoveDifferentBetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoveDifferentBetRequest.class);
  }

 /**
  * Convert an instance of RemoveDifferentBetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
