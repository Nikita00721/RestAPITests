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
 * DisableLiveMGMarketsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class DisableLiveMGMarketsRequest {
  public static final String SERIALIZED_NAME_SPORT_MARKET_IDS = "SportMarketIds";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_IDS)
  private List<Integer> sportMarketIds;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_CONFIG_IDS = "ConfigIds";
  @SerializedName(SERIALIZED_NAME_CONFIG_IDS)
  private List<Integer> configIds;

  public DisableLiveMGMarketsRequest() {
  }

  public DisableLiveMGMarketsRequest sportMarketIds(List<Integer> sportMarketIds) {
    this.sportMarketIds = sportMarketIds;
    return this;
  }

  public DisableLiveMGMarketsRequest addSportMarketIdsItem(Integer sportMarketIdsItem) {
    if (this.sportMarketIds == null) {
      this.sportMarketIds = new ArrayList<>();
    }
    this.sportMarketIds.add(sportMarketIdsItem);
    return this;
  }

   /**
   * Get sportMarketIds
   * @return sportMarketIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getSportMarketIds() {
    return sportMarketIds;
  }

  public void setSportMarketIds(List<Integer> sportMarketIds) {
    this.sportMarketIds = sportMarketIds;
  }


  public DisableLiveMGMarketsRequest sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }


  public DisableLiveMGMarketsRequest configIds(List<Integer> configIds) {
    this.configIds = configIds;
    return this;
  }

  public DisableLiveMGMarketsRequest addConfigIdsItem(Integer configIdsItem) {
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
    DisableLiveMGMarketsRequest disableLiveMGMarketsRequest = (DisableLiveMGMarketsRequest) o;
    return Objects.equals(this.sportMarketIds, disableLiveMGMarketsRequest.sportMarketIds) &&
        Objects.equals(this.sportTypeId, disableLiveMGMarketsRequest.sportTypeId) &&
        Objects.equals(this.configIds, disableLiveMGMarketsRequest.configIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportMarketIds, sportTypeId, configIds);
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
    sb.append("class DisableLiveMGMarketsRequest {\n");
    sb.append("    sportMarketIds: ").append(toIndentedString(sportMarketIds)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
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
    openapiFields.add("SportMarketIds");
    openapiFields.add("SportTypeId");
    openapiFields.add("ConfigIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DisableLiveMGMarketsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DisableLiveMGMarketsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisableLiveMGMarketsRequest is not found in the empty JSON string", DisableLiveMGMarketsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DisableLiveMGMarketsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DisableLiveMGMarketsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("SportMarketIds") != null && !jsonObj.get("SportMarketIds").isJsonNull() && !jsonObj.get("SportMarketIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportMarketIds` to be an array in the JSON string but got `%s`", jsonObj.get("SportMarketIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ConfigIds") != null && !jsonObj.get("ConfigIds").isJsonNull() && !jsonObj.get("ConfigIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigIds` to be an array in the JSON string but got `%s`", jsonObj.get("ConfigIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisableLiveMGMarketsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisableLiveMGMarketsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisableLiveMGMarketsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisableLiveMGMarketsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DisableLiveMGMarketsRequest>() {
           @Override
           public void write(JsonWriter out, DisableLiveMGMarketsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisableLiveMGMarketsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DisableLiveMGMarketsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisableLiveMGMarketsRequest
  * @throws IOException if the JSON string is invalid with respect to DisableLiveMGMarketsRequest
  */
  public static DisableLiveMGMarketsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisableLiveMGMarketsRequest.class);
  }

 /**
  * Convert an instance of DisableLiveMGMarketsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

