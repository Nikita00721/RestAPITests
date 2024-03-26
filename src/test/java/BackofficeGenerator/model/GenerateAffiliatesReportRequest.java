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
 * GenerateAffiliatesReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GenerateAffiliatesReportRequest {
  public static final String SERIALIZED_NAME_EXTERNAL_AFFILIATE_ID = "ExternalAffiliateId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_AFFILIATE_ID)
  private String externalAffiliateId;

  public static final String SERIALIZED_NAME_SEARCH_AFFILIATE_NAME = "SearchAffiliateName";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFFILIATE_NAME)
  private String searchAffiliateName;

  public static final String SERIALIZED_NAME_PLAYER_LIMIT_GROUP_ID = "PlayerLimitGroupId";
  @SerializedName(SERIALIZED_NAME_PLAYER_LIMIT_GROUP_ID)
  private Integer playerLimitGroupId;

  public static final String SERIALIZED_NAME_LICENSES_IDS = "LicensesIds";
  @SerializedName(SERIALIZED_NAME_LICENSES_IDS)
  private List<Integer> licensesIds;

  public static final String SERIALIZED_NAME_BRANDS_IDS = "BrandsIds";
  @SerializedName(SERIALIZED_NAME_BRANDS_IDS)
  private List<Integer> brandsIds;

  public static final String SERIALIZED_NAME_INTERNAL_AFFILIATE_ID = "InternalAffiliateId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_AFFILIATE_ID)
  private Integer internalAffiliateId;

  public GenerateAffiliatesReportRequest() {
  }

  public GenerateAffiliatesReportRequest externalAffiliateId(String externalAffiliateId) {
    this.externalAffiliateId = externalAffiliateId;
    return this;
  }

   /**
   * Get externalAffiliateId
   * @return externalAffiliateId
  **/
  @javax.annotation.Nullable
  public String getExternalAffiliateId() {
    return externalAffiliateId;
  }

  public void setExternalAffiliateId(String externalAffiliateId) {
    this.externalAffiliateId = externalAffiliateId;
  }


  public GenerateAffiliatesReportRequest searchAffiliateName(String searchAffiliateName) {
    this.searchAffiliateName = searchAffiliateName;
    return this;
  }

   /**
   * Get searchAffiliateName
   * @return searchAffiliateName
  **/
  @javax.annotation.Nullable
  public String getSearchAffiliateName() {
    return searchAffiliateName;
  }

  public void setSearchAffiliateName(String searchAffiliateName) {
    this.searchAffiliateName = searchAffiliateName;
  }


  public GenerateAffiliatesReportRequest playerLimitGroupId(Integer playerLimitGroupId) {
    this.playerLimitGroupId = playerLimitGroupId;
    return this;
  }

   /**
   * Get playerLimitGroupId
   * @return playerLimitGroupId
  **/
  @javax.annotation.Nullable
  public Integer getPlayerLimitGroupId() {
    return playerLimitGroupId;
  }

  public void setPlayerLimitGroupId(Integer playerLimitGroupId) {
    this.playerLimitGroupId = playerLimitGroupId;
  }


  public GenerateAffiliatesReportRequest licensesIds(List<Integer> licensesIds) {
    this.licensesIds = licensesIds;
    return this;
  }

  public GenerateAffiliatesReportRequest addLicensesIdsItem(Integer licensesIdsItem) {
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


  public GenerateAffiliatesReportRequest brandsIds(List<Integer> brandsIds) {
    this.brandsIds = brandsIds;
    return this;
  }

  public GenerateAffiliatesReportRequest addBrandsIdsItem(Integer brandsIdsItem) {
    if (this.brandsIds == null) {
      this.brandsIds = new ArrayList<>();
    }
    this.brandsIds.add(brandsIdsItem);
    return this;
  }

   /**
   * Get brandsIds
   * @return brandsIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getBrandsIds() {
    return brandsIds;
  }

  public void setBrandsIds(List<Integer> brandsIds) {
    this.brandsIds = brandsIds;
  }


  public GenerateAffiliatesReportRequest internalAffiliateId(Integer internalAffiliateId) {
    this.internalAffiliateId = internalAffiliateId;
    return this;
  }

   /**
   * Get internalAffiliateId
   * @return internalAffiliateId
  **/
  @javax.annotation.Nullable
  public Integer getInternalAffiliateId() {
    return internalAffiliateId;
  }

  public void setInternalAffiliateId(Integer internalAffiliateId) {
    this.internalAffiliateId = internalAffiliateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateAffiliatesReportRequest generateAffiliatesReportRequest = (GenerateAffiliatesReportRequest) o;
    return Objects.equals(this.externalAffiliateId, generateAffiliatesReportRequest.externalAffiliateId) &&
        Objects.equals(this.searchAffiliateName, generateAffiliatesReportRequest.searchAffiliateName) &&
        Objects.equals(this.playerLimitGroupId, generateAffiliatesReportRequest.playerLimitGroupId) &&
        Objects.equals(this.licensesIds, generateAffiliatesReportRequest.licensesIds) &&
        Objects.equals(this.brandsIds, generateAffiliatesReportRequest.brandsIds) &&
        Objects.equals(this.internalAffiliateId, generateAffiliatesReportRequest.internalAffiliateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalAffiliateId, searchAffiliateName, playerLimitGroupId, licensesIds, brandsIds, internalAffiliateId);
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
    sb.append("class GenerateAffiliatesReportRequest {\n");
    sb.append("    externalAffiliateId: ").append(toIndentedString(externalAffiliateId)).append("\n");
    sb.append("    searchAffiliateName: ").append(toIndentedString(searchAffiliateName)).append("\n");
    sb.append("    playerLimitGroupId: ").append(toIndentedString(playerLimitGroupId)).append("\n");
    sb.append("    licensesIds: ").append(toIndentedString(licensesIds)).append("\n");
    sb.append("    brandsIds: ").append(toIndentedString(brandsIds)).append("\n");
    sb.append("    internalAffiliateId: ").append(toIndentedString(internalAffiliateId)).append("\n");
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
    openapiFields.add("ExternalAffiliateId");
    openapiFields.add("SearchAffiliateName");
    openapiFields.add("PlayerLimitGroupId");
    openapiFields.add("LicensesIds");
    openapiFields.add("BrandsIds");
    openapiFields.add("InternalAffiliateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenerateAffiliatesReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateAffiliatesReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateAffiliatesReportRequest is not found in the empty JSON string", GenerateAffiliatesReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateAffiliatesReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateAffiliatesReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExternalAffiliateId") != null && !jsonObj.get("ExternalAffiliateId").isJsonNull()) && !jsonObj.get("ExternalAffiliateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExternalAffiliateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExternalAffiliateId").toString()));
      }
      if ((jsonObj.get("SearchAffiliateName") != null && !jsonObj.get("SearchAffiliateName").isJsonNull()) && !jsonObj.get("SearchAffiliateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SearchAffiliateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SearchAffiliateName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("LicensesIds") != null && !jsonObj.get("LicensesIds").isJsonNull() && !jsonObj.get("LicensesIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicensesIds` to be an array in the JSON string but got `%s`", jsonObj.get("LicensesIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BrandsIds") != null && !jsonObj.get("BrandsIds").isJsonNull() && !jsonObj.get("BrandsIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandsIds` to be an array in the JSON string but got `%s`", jsonObj.get("BrandsIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateAffiliatesReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateAffiliatesReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateAffiliatesReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateAffiliatesReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateAffiliatesReportRequest>() {
           @Override
           public void write(JsonWriter out, GenerateAffiliatesReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateAffiliatesReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateAffiliatesReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateAffiliatesReportRequest
  * @throws IOException if the JSON string is invalid with respect to GenerateAffiliatesReportRequest
  */
  public static GenerateAffiliatesReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateAffiliatesReportRequest.class);
  }

 /**
  * Convert an instance of GenerateAffiliatesReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
