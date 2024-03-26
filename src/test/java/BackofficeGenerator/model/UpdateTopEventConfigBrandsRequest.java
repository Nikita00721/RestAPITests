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
 * UpdateTopEventConfigBrandsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateTopEventConfigBrandsRequest {
  public static final String SERIALIZED_NAME_BRAND_IDS = "BrandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<Integer> brandIds;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public UpdateTopEventConfigBrandsRequest() {
  }

  public UpdateTopEventConfigBrandsRequest brandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
    return this;
  }

  public UpdateTopEventConfigBrandsRequest addBrandIdsItem(Integer brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * Get brandIds
   * @return brandIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getBrandIds() {
    return brandIds;
  }

  public void setBrandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
  }


  public UpdateTopEventConfigBrandsRequest configId(Integer configId) {
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
    UpdateTopEventConfigBrandsRequest updateTopEventConfigBrandsRequest = (UpdateTopEventConfigBrandsRequest) o;
    return Objects.equals(this.brandIds, updateTopEventConfigBrandsRequest.brandIds) &&
        Objects.equals(this.configId, updateTopEventConfigBrandsRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandIds, configId);
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
    sb.append("class UpdateTopEventConfigBrandsRequest {\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
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
    openapiFields.add("BrandIds");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTopEventConfigBrandsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTopEventConfigBrandsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTopEventConfigBrandsRequest is not found in the empty JSON string", UpdateTopEventConfigBrandsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTopEventConfigBrandsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTopEventConfigBrandsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("BrandIds") != null && !jsonObj.get("BrandIds").isJsonNull() && !jsonObj.get("BrandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandIds` to be an array in the JSON string but got `%s`", jsonObj.get("BrandIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTopEventConfigBrandsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTopEventConfigBrandsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTopEventConfigBrandsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTopEventConfigBrandsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTopEventConfigBrandsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTopEventConfigBrandsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTopEventConfigBrandsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTopEventConfigBrandsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTopEventConfigBrandsRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTopEventConfigBrandsRequest
  */
  public static UpdateTopEventConfigBrandsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTopEventConfigBrandsRequest.class);
  }

 /**
  * Convert an instance of UpdateTopEventConfigBrandsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

