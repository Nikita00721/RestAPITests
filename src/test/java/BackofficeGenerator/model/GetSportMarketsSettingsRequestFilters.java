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
 * GetSportMarketsSettingsRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetSportMarketsSettingsRequestFilters {
  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_MARKET_NAME = "MarketName";
  @SerializedName(SERIALIZED_NAME_MARKET_NAME)
  private String marketName;

  public static final String SERIALIZED_NAME_IS_HEADER = "IsHeader";
  @SerializedName(SERIALIZED_NAME_IS_HEADER)
  private Boolean isHeader;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public GetSportMarketsSettingsRequestFilters() {
  }

  public GetSportMarketsSettingsRequestFilters sportTypeId(Integer sportTypeId) {
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


  public GetSportMarketsSettingsRequestFilters marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public GetSportMarketsSettingsRequestFilters marketName(String marketName) {
    this.marketName = marketName;
    return this;
  }

   /**
   * Get marketName
   * @return marketName
  **/
  @javax.annotation.Nullable
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }


  public GetSportMarketsSettingsRequestFilters isHeader(Boolean isHeader) {
    this.isHeader = isHeader;
    return this;
  }

   /**
   * Get isHeader
   * @return isHeader
  **/
  @javax.annotation.Nullable
  public Boolean getIsHeader() {
    return isHeader;
  }

  public void setIsHeader(Boolean isHeader) {
    this.isHeader = isHeader;
  }


  public GetSportMarketsSettingsRequestFilters configId(Integer configId) {
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
    GetSportMarketsSettingsRequestFilters getSportMarketsSettingsRequestFilters = (GetSportMarketsSettingsRequestFilters) o;
    return Objects.equals(this.sportTypeId, getSportMarketsSettingsRequestFilters.sportTypeId) &&
        Objects.equals(this.marketTypeId, getSportMarketsSettingsRequestFilters.marketTypeId) &&
        Objects.equals(this.marketName, getSportMarketsSettingsRequestFilters.marketName) &&
        Objects.equals(this.isHeader, getSportMarketsSettingsRequestFilters.isHeader) &&
        Objects.equals(this.configId, getSportMarketsSettingsRequestFilters.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportTypeId, marketTypeId, marketName, isHeader, configId);
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
    sb.append("class GetSportMarketsSettingsRequestFilters {\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    marketName: ").append(toIndentedString(marketName)).append("\n");
    sb.append("    isHeader: ").append(toIndentedString(isHeader)).append("\n");
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
    openapiFields.add("SportTypeId");
    openapiFields.add("MarketTypeId");
    openapiFields.add("MarketName");
    openapiFields.add("IsHeader");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSportMarketsSettingsRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSportMarketsSettingsRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSportMarketsSettingsRequestFilters is not found in the empty JSON string", GetSportMarketsSettingsRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSportMarketsSettingsRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSportMarketsSettingsRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MarketName") != null && !jsonObj.get("MarketName").isJsonNull()) && !jsonObj.get("MarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSportMarketsSettingsRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSportMarketsSettingsRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSportMarketsSettingsRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSportMarketsSettingsRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSportMarketsSettingsRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetSportMarketsSettingsRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSportMarketsSettingsRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSportMarketsSettingsRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSportMarketsSettingsRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetSportMarketsSettingsRequestFilters
  */
  public static GetSportMarketsSettingsRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSportMarketsSettingsRequestFilters.class);
  }

 /**
  * Convert an instance of GetSportMarketsSettingsRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
