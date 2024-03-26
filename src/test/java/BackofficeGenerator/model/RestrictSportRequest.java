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
 * RestrictSportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class RestrictSportRequest {
  public static final String SERIALIZED_NAME_SPORTS_IDS = "SportsIds";
  @SerializedName(SERIALIZED_NAME_SPORTS_IDS)
  private List<Integer> sportsIds;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public RestrictSportRequest() {
  }

  public RestrictSportRequest sportsIds(List<Integer> sportsIds) {
    this.sportsIds = sportsIds;
    return this;
  }

  public RestrictSportRequest addSportsIdsItem(Integer sportsIdsItem) {
    if (this.sportsIds == null) {
      this.sportsIds = new ArrayList<>();
    }
    this.sportsIds.add(sportsIdsItem);
    return this;
  }

   /**
   * Get sportsIds
   * @return sportsIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getSportsIds() {
    return sportsIds;
  }

  public void setSportsIds(List<Integer> sportsIds) {
    this.sportsIds = sportsIds;
  }


  public RestrictSportRequest brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictSportRequest restrictSportRequest = (RestrictSportRequest) o;
    return Objects.equals(this.sportsIds, restrictSportRequest.sportsIds) &&
        Objects.equals(this.brandId, restrictSportRequest.brandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportsIds, brandId);
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
    sb.append("class RestrictSportRequest {\n");
    sb.append("    sportsIds: ").append(toIndentedString(sportsIds)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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
    openapiFields.add("SportsIds");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RestrictSportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestrictSportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestrictSportRequest is not found in the empty JSON string", RestrictSportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RestrictSportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestrictSportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("SportsIds") != null && !jsonObj.get("SportsIds").isJsonNull() && !jsonObj.get("SportsIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportsIds` to be an array in the JSON string but got `%s`", jsonObj.get("SportsIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestrictSportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestrictSportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestrictSportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestrictSportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RestrictSportRequest>() {
           @Override
           public void write(JsonWriter out, RestrictSportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestrictSportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestrictSportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestrictSportRequest
  * @throws IOException if the JSON string is invalid with respect to RestrictSportRequest
  */
  public static RestrictSportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestrictSportRequest.class);
  }

 /**
  * Convert an instance of RestrictSportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
