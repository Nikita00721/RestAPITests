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
 * IncludeSportMarketsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class IncludeSportMarketsRequest {
  public static final String SERIALIZED_NAME_SPORT_MARKETS_IDS = "SportMarketsIds";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKETS_IDS)
  private List<Integer> sportMarketsIds;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public IncludeSportMarketsRequest() {
  }

  public IncludeSportMarketsRequest sportMarketsIds(List<Integer> sportMarketsIds) {
    this.sportMarketsIds = sportMarketsIds;
    return this;
  }

  public IncludeSportMarketsRequest addSportMarketsIdsItem(Integer sportMarketsIdsItem) {
    if (this.sportMarketsIds == null) {
      this.sportMarketsIds = new ArrayList<>();
    }
    this.sportMarketsIds.add(sportMarketsIdsItem);
    return this;
  }

   /**
   * Get sportMarketsIds
   * @return sportMarketsIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getSportMarketsIds() {
    return sportMarketsIds;
  }

  public void setSportMarketsIds(List<Integer> sportMarketsIds) {
    this.sportMarketsIds = sportMarketsIds;
  }


  public IncludeSportMarketsRequest configId(Integer configId) {
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
    IncludeSportMarketsRequest includeSportMarketsRequest = (IncludeSportMarketsRequest) o;
    return Objects.equals(this.sportMarketsIds, includeSportMarketsRequest.sportMarketsIds) &&
        Objects.equals(this.configId, includeSportMarketsRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportMarketsIds, configId);
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
    sb.append("class IncludeSportMarketsRequest {\n");
    sb.append("    sportMarketsIds: ").append(toIndentedString(sportMarketsIds)).append("\n");
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
    openapiFields.add("SportMarketsIds");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IncludeSportMarketsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IncludeSportMarketsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncludeSportMarketsRequest is not found in the empty JSON string", IncludeSportMarketsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IncludeSportMarketsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IncludeSportMarketsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("SportMarketsIds") != null && !jsonObj.get("SportMarketsIds").isJsonNull() && !jsonObj.get("SportMarketsIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportMarketsIds` to be an array in the JSON string but got `%s`", jsonObj.get("SportMarketsIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncludeSportMarketsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncludeSportMarketsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncludeSportMarketsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncludeSportMarketsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IncludeSportMarketsRequest>() {
           @Override
           public void write(JsonWriter out, IncludeSportMarketsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IncludeSportMarketsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IncludeSportMarketsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncludeSportMarketsRequest
  * @throws IOException if the JSON string is invalid with respect to IncludeSportMarketsRequest
  */
  public static IncludeSportMarketsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncludeSportMarketsRequest.class);
  }

 /**
  * Convert an instance of IncludeSportMarketsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

