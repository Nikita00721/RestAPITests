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
 * BulkUpdateFeedManagerGlobalChampsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BulkUpdateFeedManagerGlobalChampsRequest {
  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_ID = "LiveTemplateId";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_ID)
  private Integer liveTemplateId;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID = "PreLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID)
  private Integer preLiveTemplateId;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private GetFeedManagerGlobalChampsFilters filters;

  public static final String SERIALIZED_NAME_CHAMP_IDS = "ChampIds";
  @SerializedName(SERIALIZED_NAME_CHAMP_IDS)
  private List<Integer> champIds;

  public BulkUpdateFeedManagerGlobalChampsRequest() {
  }

  public BulkUpdateFeedManagerGlobalChampsRequest liveTemplateId(Integer liveTemplateId) {
    this.liveTemplateId = liveTemplateId;
    return this;
  }

   /**
   * Get liveTemplateId
   * @return liveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getLiveTemplateId() {
    return liveTemplateId;
  }

  public void setLiveTemplateId(Integer liveTemplateId) {
    this.liveTemplateId = liveTemplateId;
  }


  public BulkUpdateFeedManagerGlobalChampsRequest preLiveTemplateId(Integer preLiveTemplateId) {
    this.preLiveTemplateId = preLiveTemplateId;
    return this;
  }

   /**
   * Get preLiveTemplateId
   * @return preLiveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getPreLiveTemplateId() {
    return preLiveTemplateId;
  }

  public void setPreLiveTemplateId(Integer preLiveTemplateId) {
    this.preLiveTemplateId = preLiveTemplateId;
  }


  public BulkUpdateFeedManagerGlobalChampsRequest filters(GetFeedManagerGlobalChampsFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public GetFeedManagerGlobalChampsFilters getFilters() {
    return filters;
  }

  public void setFilters(GetFeedManagerGlobalChampsFilters filters) {
    this.filters = filters;
  }


  public BulkUpdateFeedManagerGlobalChampsRequest champIds(List<Integer> champIds) {
    this.champIds = champIds;
    return this;
  }

  public BulkUpdateFeedManagerGlobalChampsRequest addChampIdsItem(Integer champIdsItem) {
    if (this.champIds == null) {
      this.champIds = new ArrayList<>();
    }
    this.champIds.add(champIdsItem);
    return this;
  }

   /**
   * Get champIds
   * @return champIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getChampIds() {
    return champIds;
  }

  public void setChampIds(List<Integer> champIds) {
    this.champIds = champIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateFeedManagerGlobalChampsRequest bulkUpdateFeedManagerGlobalChampsRequest = (BulkUpdateFeedManagerGlobalChampsRequest) o;
    return Objects.equals(this.liveTemplateId, bulkUpdateFeedManagerGlobalChampsRequest.liveTemplateId) &&
        Objects.equals(this.preLiveTemplateId, bulkUpdateFeedManagerGlobalChampsRequest.preLiveTemplateId) &&
        Objects.equals(this.filters, bulkUpdateFeedManagerGlobalChampsRequest.filters) &&
        Objects.equals(this.champIds, bulkUpdateFeedManagerGlobalChampsRequest.champIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveTemplateId, preLiveTemplateId, filters, champIds);
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
    sb.append("class BulkUpdateFeedManagerGlobalChampsRequest {\n");
    sb.append("    liveTemplateId: ").append(toIndentedString(liveTemplateId)).append("\n");
    sb.append("    preLiveTemplateId: ").append(toIndentedString(preLiveTemplateId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    champIds: ").append(toIndentedString(champIds)).append("\n");
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
    openapiFields.add("LiveTemplateId");
    openapiFields.add("PreLiveTemplateId");
    openapiFields.add("Filters");
    openapiFields.add("ChampIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BulkUpdateFeedManagerGlobalChampsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkUpdateFeedManagerGlobalChampsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkUpdateFeedManagerGlobalChampsRequest is not found in the empty JSON string", BulkUpdateFeedManagerGlobalChampsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkUpdateFeedManagerGlobalChampsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkUpdateFeedManagerGlobalChampsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Filters`
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        GetFeedManagerGlobalChampsFilters.validateJsonElement(jsonObj.get("Filters"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ChampIds") != null && !jsonObj.get("ChampIds").isJsonNull() && !jsonObj.get("ChampIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampIds` to be an array in the JSON string but got `%s`", jsonObj.get("ChampIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkUpdateFeedManagerGlobalChampsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkUpdateFeedManagerGlobalChampsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkUpdateFeedManagerGlobalChampsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkUpdateFeedManagerGlobalChampsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkUpdateFeedManagerGlobalChampsRequest>() {
           @Override
           public void write(JsonWriter out, BulkUpdateFeedManagerGlobalChampsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkUpdateFeedManagerGlobalChampsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkUpdateFeedManagerGlobalChampsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkUpdateFeedManagerGlobalChampsRequest
  * @throws IOException if the JSON string is invalid with respect to BulkUpdateFeedManagerGlobalChampsRequest
  */
  public static BulkUpdateFeedManagerGlobalChampsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkUpdateFeedManagerGlobalChampsRequest.class);
  }

 /**
  * Convert an instance of BulkUpdateFeedManagerGlobalChampsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

