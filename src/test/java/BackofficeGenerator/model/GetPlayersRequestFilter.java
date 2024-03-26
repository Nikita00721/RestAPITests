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
 * GetPlayersRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetPlayersRequestFilter {
  public static final String SERIALIZED_NAME_SEARCH_AFFILIATE_NAME = "SearchAffiliateName";
  @SerializedName(SERIALIZED_NAME_SEARCH_AFFILIATE_NAME)
  private String searchAffiliateName;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public static final String SERIALIZED_NAME_EXT_PLAYER_ID = "ExtPlayerId";
  @SerializedName(SERIALIZED_NAME_EXT_PLAYER_ID)
  private String extPlayerId;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_CONFIG_IDS = "ConfigIds";
  @SerializedName(SERIALIZED_NAME_CONFIG_IDS)
  private List<Integer> configIds;

  public static final String SERIALIZED_NAME_SEARCH_PLAYER_NAME = "SearchPlayerName";
  @SerializedName(SERIALIZED_NAME_SEARCH_PLAYER_NAME)
  private String searchPlayerName;

  public GetPlayersRequestFilter() {
  }

  public GetPlayersRequestFilter searchAffiliateName(String searchAffiliateName) {
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


  public GetPlayersRequestFilter playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @javax.annotation.Nullable
  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }


  public GetPlayersRequestFilter extPlayerId(String extPlayerId) {
    this.extPlayerId = extPlayerId;
    return this;
  }

   /**
   * Get extPlayerId
   * @return extPlayerId
  **/
  @javax.annotation.Nullable
  public String getExtPlayerId() {
    return extPlayerId;
  }

  public void setExtPlayerId(String extPlayerId) {
    this.extPlayerId = extPlayerId;
  }


  public GetPlayersRequestFilter licenseId(Integer licenseId) {
    this.licenseId = licenseId;
    return this;
  }

   /**
   * Get licenseId
   * @return licenseId
  **/
  @javax.annotation.Nullable
  public Integer getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(Integer licenseId) {
    this.licenseId = licenseId;
  }


  public GetPlayersRequestFilter brandId(Integer brandId) {
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


  public GetPlayersRequestFilter configIds(List<Integer> configIds) {
    this.configIds = configIds;
    return this;
  }

  public GetPlayersRequestFilter addConfigIdsItem(Integer configIdsItem) {
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


  public GetPlayersRequestFilter searchPlayerName(String searchPlayerName) {
    this.searchPlayerName = searchPlayerName;
    return this;
  }

   /**
   * Get searchPlayerName
   * @return searchPlayerName
  **/
  @javax.annotation.Nullable
  public String getSearchPlayerName() {
    return searchPlayerName;
  }

  public void setSearchPlayerName(String searchPlayerName) {
    this.searchPlayerName = searchPlayerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPlayersRequestFilter getPlayersRequestFilter = (GetPlayersRequestFilter) o;
    return Objects.equals(this.searchAffiliateName, getPlayersRequestFilter.searchAffiliateName) &&
        Objects.equals(this.playerId, getPlayersRequestFilter.playerId) &&
        Objects.equals(this.extPlayerId, getPlayersRequestFilter.extPlayerId) &&
        Objects.equals(this.licenseId, getPlayersRequestFilter.licenseId) &&
        Objects.equals(this.brandId, getPlayersRequestFilter.brandId) &&
        Objects.equals(this.configIds, getPlayersRequestFilter.configIds) &&
        Objects.equals(this.searchPlayerName, getPlayersRequestFilter.searchPlayerName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchAffiliateName, playerId, extPlayerId, licenseId, brandId, configIds, searchPlayerName);
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
    sb.append("class GetPlayersRequestFilter {\n");
    sb.append("    searchAffiliateName: ").append(toIndentedString(searchAffiliateName)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    extPlayerId: ").append(toIndentedString(extPlayerId)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    configIds: ").append(toIndentedString(configIds)).append("\n");
    sb.append("    searchPlayerName: ").append(toIndentedString(searchPlayerName)).append("\n");
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
    openapiFields.add("SearchAffiliateName");
    openapiFields.add("PlayerId");
    openapiFields.add("ExtPlayerId");
    openapiFields.add("LicenseId");
    openapiFields.add("BrandId");
    openapiFields.add("ConfigIds");
    openapiFields.add("SearchPlayerName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetPlayersRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPlayersRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPlayersRequestFilter is not found in the empty JSON string", GetPlayersRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPlayersRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPlayersRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SearchAffiliateName") != null && !jsonObj.get("SearchAffiliateName").isJsonNull()) && !jsonObj.get("SearchAffiliateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SearchAffiliateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SearchAffiliateName").toString()));
      }
      if ((jsonObj.get("ExtPlayerId") != null && !jsonObj.get("ExtPlayerId").isJsonNull()) && !jsonObj.get("ExtPlayerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtPlayerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtPlayerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ConfigIds") != null && !jsonObj.get("ConfigIds").isJsonNull() && !jsonObj.get("ConfigIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigIds` to be an array in the JSON string but got `%s`", jsonObj.get("ConfigIds").toString()));
      }
      if ((jsonObj.get("SearchPlayerName") != null && !jsonObj.get("SearchPlayerName").isJsonNull()) && !jsonObj.get("SearchPlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SearchPlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SearchPlayerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPlayersRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPlayersRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPlayersRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPlayersRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPlayersRequestFilter>() {
           @Override
           public void write(JsonWriter out, GetPlayersRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPlayersRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetPlayersRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPlayersRequestFilter
  * @throws IOException if the JSON string is invalid with respect to GetPlayersRequestFilter
  */
  public static GetPlayersRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPlayersRequestFilter.class);
  }

 /**
  * Convert an instance of GetPlayersRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
