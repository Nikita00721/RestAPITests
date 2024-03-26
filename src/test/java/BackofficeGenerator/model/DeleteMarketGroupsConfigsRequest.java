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
 * DeleteMarketGroupsConfigsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class DeleteMarketGroupsConfigsRequest {
  public static final String SERIALIZED_NAME_CONFIG_IDS = "ConfigIds";
  @SerializedName(SERIALIZED_NAME_CONFIG_IDS)
  private List<Integer> configIds;

  public DeleteMarketGroupsConfigsRequest() {
  }

  public DeleteMarketGroupsConfigsRequest configIds(List<Integer> configIds) {
    this.configIds = configIds;
    return this;
  }

  public DeleteMarketGroupsConfigsRequest addConfigIdsItem(Integer configIdsItem) {
    if (this.configIds == null) {
      this.configIds = new ArrayList<>();
    }
    this.configIds.add(configIdsItem);
    return this;
  }

   /**
   * Get configIds
   * @return configIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getConfigIds() {
    return configIds;
  }

  public void setConfigIds(List<Integer> configIds) {
    this.configIds = configIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteMarketGroupsConfigsRequest deleteMarketGroupsConfigsRequest = (DeleteMarketGroupsConfigsRequest) o;
    return Objects.equals(this.configIds, deleteMarketGroupsConfigsRequest.configIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configIds);
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
    sb.append("class DeleteMarketGroupsConfigsRequest {\n");
    sb.append("    configIds: ").append(toIndentedString(configIds)).append("\n");
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
    openapiFields.add("ConfigIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteMarketGroupsConfigsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteMarketGroupsConfigsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteMarketGroupsConfigsRequest is not found in the empty JSON string", DeleteMarketGroupsConfigsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteMarketGroupsConfigsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteMarketGroupsConfigsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ConfigIds") != null && !jsonObj.get("ConfigIds").isJsonNull() && !jsonObj.get("ConfigIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigIds` to be an array in the JSON string but got `%s`", jsonObj.get("ConfigIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteMarketGroupsConfigsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteMarketGroupsConfigsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteMarketGroupsConfigsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteMarketGroupsConfigsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteMarketGroupsConfigsRequest>() {
           @Override
           public void write(JsonWriter out, DeleteMarketGroupsConfigsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteMarketGroupsConfigsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteMarketGroupsConfigsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteMarketGroupsConfigsRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteMarketGroupsConfigsRequest
  */
  public static DeleteMarketGroupsConfigsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteMarketGroupsConfigsRequest.class);
  }

 /**
  * Convert an instance of DeleteMarketGroupsConfigsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

