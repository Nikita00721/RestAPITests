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
 * ExcludeSportTypesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ExcludeSportTypesRequest {
  public static final String SERIALIZED_NAME_SPORT_TYPES_IDS = "SportTypesIds";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPES_IDS)
  private List<Integer> sportTypesIds;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public ExcludeSportTypesRequest() {
  }

  public ExcludeSportTypesRequest sportTypesIds(List<Integer> sportTypesIds) {
    this.sportTypesIds = sportTypesIds;
    return this;
  }

  public ExcludeSportTypesRequest addSportTypesIdsItem(Integer sportTypesIdsItem) {
    if (this.sportTypesIds == null) {
      this.sportTypesIds = new ArrayList<>();
    }
    this.sportTypesIds.add(sportTypesIdsItem);
    return this;
  }

   /**
   * Get sportTypesIds
   * @return sportTypesIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getSportTypesIds() {
    return sportTypesIds;
  }

  public void setSportTypesIds(List<Integer> sportTypesIds) {
    this.sportTypesIds = sportTypesIds;
  }


  public ExcludeSportTypesRequest configId(Integer configId) {
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
    ExcludeSportTypesRequest excludeSportTypesRequest = (ExcludeSportTypesRequest) o;
    return Objects.equals(this.sportTypesIds, excludeSportTypesRequest.sportTypesIds) &&
        Objects.equals(this.configId, excludeSportTypesRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportTypesIds, configId);
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
    sb.append("class ExcludeSportTypesRequest {\n");
    sb.append("    sportTypesIds: ").append(toIndentedString(sportTypesIds)).append("\n");
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
    openapiFields.add("SportTypesIds");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExcludeSportTypesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExcludeSportTypesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExcludeSportTypesRequest is not found in the empty JSON string", ExcludeSportTypesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExcludeSportTypesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExcludeSportTypesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("SportTypesIds") != null && !jsonObj.get("SportTypesIds").isJsonNull() && !jsonObj.get("SportTypesIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportTypesIds` to be an array in the JSON string but got `%s`", jsonObj.get("SportTypesIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExcludeSportTypesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExcludeSportTypesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExcludeSportTypesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExcludeSportTypesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExcludeSportTypesRequest>() {
           @Override
           public void write(JsonWriter out, ExcludeSportTypesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExcludeSportTypesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExcludeSportTypesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExcludeSportTypesRequest
  * @throws IOException if the JSON string is invalid with respect to ExcludeSportTypesRequest
  */
  public static ExcludeSportTypesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExcludeSportTypesRequest.class);
  }

 /**
  * Convert an instance of ExcludeSportTypesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

