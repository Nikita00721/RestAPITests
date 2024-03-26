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
 * UpdateHighlightsConfigBrandsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateHighlightsConfigBrandsRequest {
  public static final String SERIALIZED_NAME_BRANDS_TO_ADD = "BrandsToAdd";
  @SerializedName(SERIALIZED_NAME_BRANDS_TO_ADD)
  private List<Integer> brandsToAdd;

  public static final String SERIALIZED_NAME_BRANDS_TO_DELETE = "BrandsToDelete";
  @SerializedName(SERIALIZED_NAME_BRANDS_TO_DELETE)
  private List<Integer> brandsToDelete;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public UpdateHighlightsConfigBrandsRequest() {
  }

  public UpdateHighlightsConfigBrandsRequest brandsToAdd(List<Integer> brandsToAdd) {
    this.brandsToAdd = brandsToAdd;
    return this;
  }

  public UpdateHighlightsConfigBrandsRequest addBrandsToAddItem(Integer brandsToAddItem) {
    if (this.brandsToAdd == null) {
      this.brandsToAdd = new ArrayList<>();
    }
    this.brandsToAdd.add(brandsToAddItem);
    return this;
  }

   /**
   * Get brandsToAdd
   * @return brandsToAdd
  **/
  @javax.annotation.Nullable
  public List<Integer> getBrandsToAdd() {
    return brandsToAdd;
  }

  public void setBrandsToAdd(List<Integer> brandsToAdd) {
    this.brandsToAdd = brandsToAdd;
  }


  public UpdateHighlightsConfigBrandsRequest brandsToDelete(List<Integer> brandsToDelete) {
    this.brandsToDelete = brandsToDelete;
    return this;
  }

  public UpdateHighlightsConfigBrandsRequest addBrandsToDeleteItem(Integer brandsToDeleteItem) {
    if (this.brandsToDelete == null) {
      this.brandsToDelete = new ArrayList<>();
    }
    this.brandsToDelete.add(brandsToDeleteItem);
    return this;
  }

   /**
   * Get brandsToDelete
   * @return brandsToDelete
  **/
  @javax.annotation.Nullable
  public List<Integer> getBrandsToDelete() {
    return brandsToDelete;
  }

  public void setBrandsToDelete(List<Integer> brandsToDelete) {
    this.brandsToDelete = brandsToDelete;
  }


  public UpdateHighlightsConfigBrandsRequest configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHighlightsConfigBrandsRequest updateHighlightsConfigBrandsRequest = (UpdateHighlightsConfigBrandsRequest) o;
    return Objects.equals(this.brandsToAdd, updateHighlightsConfigBrandsRequest.brandsToAdd) &&
        Objects.equals(this.brandsToDelete, updateHighlightsConfigBrandsRequest.brandsToDelete) &&
        Objects.equals(this.configId, updateHighlightsConfigBrandsRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandsToAdd, brandsToDelete, configId);
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
    sb.append("class UpdateHighlightsConfigBrandsRequest {\n");
    sb.append("    brandsToAdd: ").append(toIndentedString(brandsToAdd)).append("\n");
    sb.append("    brandsToDelete: ").append(toIndentedString(brandsToDelete)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
    openapiFields.add("BrandsToAdd");
    openapiFields.add("BrandsToDelete");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateHighlightsConfigBrandsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateHighlightsConfigBrandsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateHighlightsConfigBrandsRequest is not found in the empty JSON string", UpdateHighlightsConfigBrandsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateHighlightsConfigBrandsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateHighlightsConfigBrandsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("BrandsToAdd") != null && !jsonObj.get("BrandsToAdd").isJsonNull() && !jsonObj.get("BrandsToAdd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandsToAdd` to be an array in the JSON string but got `%s`", jsonObj.get("BrandsToAdd").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BrandsToDelete") != null && !jsonObj.get("BrandsToDelete").isJsonNull() && !jsonObj.get("BrandsToDelete").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandsToDelete` to be an array in the JSON string but got `%s`", jsonObj.get("BrandsToDelete").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateHighlightsConfigBrandsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateHighlightsConfigBrandsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateHighlightsConfigBrandsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateHighlightsConfigBrandsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateHighlightsConfigBrandsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateHighlightsConfigBrandsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateHighlightsConfigBrandsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateHighlightsConfigBrandsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateHighlightsConfigBrandsRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateHighlightsConfigBrandsRequest
  */
  public static UpdateHighlightsConfigBrandsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateHighlightsConfigBrandsRequest.class);
  }

 /**
  * Convert an instance of UpdateHighlightsConfigBrandsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

