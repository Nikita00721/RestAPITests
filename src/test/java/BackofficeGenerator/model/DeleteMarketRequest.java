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
 * DeleteMarketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class DeleteMarketRequest {
  public static final String SERIALIZED_NAME_PARLAY_MARKET_ID = "ParlayMarketId";
  @SerializedName(SERIALIZED_NAME_PARLAY_MARKET_ID)
  private Integer parlayMarketId;

  public DeleteMarketRequest() {
  }

  public DeleteMarketRequest parlayMarketId(Integer parlayMarketId) {
    this.parlayMarketId = parlayMarketId;
    return this;
  }

   /**
   * Get parlayMarketId
   * @return parlayMarketId
  **/
  @javax.annotation.Nullable
  public Integer getParlayMarketId() {
    return parlayMarketId;
  }

  public void setParlayMarketId(Integer parlayMarketId) {
    this.parlayMarketId = parlayMarketId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteMarketRequest deleteMarketRequest = (DeleteMarketRequest) o;
    return Objects.equals(this.parlayMarketId, deleteMarketRequest.parlayMarketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parlayMarketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMarketRequest {\n");
    sb.append("    parlayMarketId: ").append(toIndentedString(parlayMarketId)).append("\n");
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
    openapiFields.add("ParlayMarketId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteMarketRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteMarketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteMarketRequest is not found in the empty JSON string", DeleteMarketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteMarketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteMarketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteMarketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteMarketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteMarketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteMarketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteMarketRequest>() {
           @Override
           public void write(JsonWriter out, DeleteMarketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteMarketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteMarketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteMarketRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteMarketRequest
  */
  public static DeleteMarketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteMarketRequest.class);
  }

 /**
  * Convert an instance of DeleteMarketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

