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
 * GetUserSpecificBrandsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetUserSpecificBrandsRequest {
  public static final String SERIALIZED_NAME_LICENSES_IDS = "LicensesIds";
  @SerializedName(SERIALIZED_NAME_LICENSES_IDS)
  private List<Integer> licensesIds;

  public GetUserSpecificBrandsRequest() {
  }

  public GetUserSpecificBrandsRequest licensesIds(List<Integer> licensesIds) {
    this.licensesIds = licensesIds;
    return this;
  }

  public GetUserSpecificBrandsRequest addLicensesIdsItem(Integer licensesIdsItem) {
    if (this.licensesIds == null) {
      this.licensesIds = new ArrayList<>();
    }
    this.licensesIds.add(licensesIdsItem);
    return this;
  }

   /**
   * Get licensesIds
   * @return licensesIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getLicensesIds() {
    return licensesIds;
  }

  public void setLicensesIds(List<Integer> licensesIds) {
    this.licensesIds = licensesIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserSpecificBrandsRequest getUserSpecificBrandsRequest = (GetUserSpecificBrandsRequest) o;
    return Objects.equals(this.licensesIds, getUserSpecificBrandsRequest.licensesIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(licensesIds);
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
    sb.append("class GetUserSpecificBrandsRequest {\n");
    sb.append("    licensesIds: ").append(toIndentedString(licensesIds)).append("\n");
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
    openapiFields.add("LicensesIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetUserSpecificBrandsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetUserSpecificBrandsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetUserSpecificBrandsRequest is not found in the empty JSON string", GetUserSpecificBrandsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetUserSpecificBrandsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetUserSpecificBrandsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("LicensesIds") != null && !jsonObj.get("LicensesIds").isJsonNull() && !jsonObj.get("LicensesIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicensesIds` to be an array in the JSON string but got `%s`", jsonObj.get("LicensesIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetUserSpecificBrandsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetUserSpecificBrandsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetUserSpecificBrandsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetUserSpecificBrandsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetUserSpecificBrandsRequest>() {
           @Override
           public void write(JsonWriter out, GetUserSpecificBrandsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetUserSpecificBrandsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetUserSpecificBrandsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetUserSpecificBrandsRequest
  * @throws IOException if the JSON string is invalid with respect to GetUserSpecificBrandsRequest
  */
  public static GetUserSpecificBrandsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUserSpecificBrandsRequest.class);
  }

 /**
  * Convert an instance of GetUserSpecificBrandsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

