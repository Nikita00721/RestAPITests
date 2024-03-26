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
 * IncludeChampionshipsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class IncludeChampionshipsRequest {
  public static final String SERIALIZED_NAME_CHAMPIONSHIP_IDS = "ChampionshipIds";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_IDS)
  private List<Integer> championshipIds;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public IncludeChampionshipsRequest() {
  }

  public IncludeChampionshipsRequest championshipIds(List<Integer> championshipIds) {
    this.championshipIds = championshipIds;
    return this;
  }

  public IncludeChampionshipsRequest addChampionshipIdsItem(Integer championshipIdsItem) {
    if (this.championshipIds == null) {
      this.championshipIds = new ArrayList<>();
    }
    this.championshipIds.add(championshipIdsItem);
    return this;
  }

   /**
   * Get championshipIds
   * @return championshipIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getChampionshipIds() {
    return championshipIds;
  }

  public void setChampionshipIds(List<Integer> championshipIds) {
    this.championshipIds = championshipIds;
  }


  public IncludeChampionshipsRequest configId(Integer configId) {
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
    IncludeChampionshipsRequest includeChampionshipsRequest = (IncludeChampionshipsRequest) o;
    return Objects.equals(this.championshipIds, includeChampionshipsRequest.championshipIds) &&
        Objects.equals(this.configId, includeChampionshipsRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(championshipIds, configId);
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
    sb.append("class IncludeChampionshipsRequest {\n");
    sb.append("    championshipIds: ").append(toIndentedString(championshipIds)).append("\n");
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
    openapiFields.add("ChampionshipIds");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IncludeChampionshipsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IncludeChampionshipsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncludeChampionshipsRequest is not found in the empty JSON string", IncludeChampionshipsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IncludeChampionshipsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IncludeChampionshipsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ChampionshipIds") != null && !jsonObj.get("ChampionshipIds").isJsonNull() && !jsonObj.get("ChampionshipIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampionshipIds` to be an array in the JSON string but got `%s`", jsonObj.get("ChampionshipIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncludeChampionshipsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncludeChampionshipsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncludeChampionshipsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncludeChampionshipsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IncludeChampionshipsRequest>() {
           @Override
           public void write(JsonWriter out, IncludeChampionshipsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IncludeChampionshipsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IncludeChampionshipsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncludeChampionshipsRequest
  * @throws IOException if the JSON string is invalid with respect to IncludeChampionshipsRequest
  */
  public static IncludeChampionshipsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncludeChampionshipsRequest.class);
  }

 /**
  * Convert an instance of IncludeChampionshipsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

