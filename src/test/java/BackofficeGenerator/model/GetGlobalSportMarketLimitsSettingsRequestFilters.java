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
 * GetGlobalSportMarketLimitsSettingsRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetGlobalSportMarketLimitsSettingsRequestFilters {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_IS_WIN_LIMITS_PER_SELECTION = "IsWinLimitsPerSelection";
  @SerializedName(SERIALIZED_NAME_IS_WIN_LIMITS_PER_SELECTION)
  private Boolean isWinLimitsPerSelection;

  public static final String SERIALIZED_NAME_IS_STAKE_LIMITS_PER_SELECTION = "IsStakeLimitsPerSelection";
  @SerializedName(SERIALIZED_NAME_IS_STAKE_LIMITS_PER_SELECTION)
  private Boolean isStakeLimitsPerSelection;

  public static final String SERIALIZED_NAME_STAKE_LIMIT_FACTOR = "StakeLimitFactor";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT_FACTOR)
  private Double stakeLimitFactor;

  public static final String SERIALIZED_NAME_NET_WIN_FACTOR = "NetWinFactor";
  @SerializedName(SERIALIZED_NAME_NET_WIN_FACTOR)
  private Double netWinFactor;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public GetGlobalSportMarketLimitsSettingsRequestFilters() {
  }

  public GetGlobalSportMarketLimitsSettingsRequestFilters marketTypeId(Integer marketTypeId) {
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


  public GetGlobalSportMarketLimitsSettingsRequestFilters isWinLimitsPerSelection(Boolean isWinLimitsPerSelection) {
    this.isWinLimitsPerSelection = isWinLimitsPerSelection;
    return this;
  }

   /**
   * Get isWinLimitsPerSelection
   * @return isWinLimitsPerSelection
  **/
  @javax.annotation.Nullable
  public Boolean getIsWinLimitsPerSelection() {
    return isWinLimitsPerSelection;
  }

  public void setIsWinLimitsPerSelection(Boolean isWinLimitsPerSelection) {
    this.isWinLimitsPerSelection = isWinLimitsPerSelection;
  }


  public GetGlobalSportMarketLimitsSettingsRequestFilters isStakeLimitsPerSelection(Boolean isStakeLimitsPerSelection) {
    this.isStakeLimitsPerSelection = isStakeLimitsPerSelection;
    return this;
  }

   /**
   * Get isStakeLimitsPerSelection
   * @return isStakeLimitsPerSelection
  **/
  @javax.annotation.Nullable
  public Boolean getIsStakeLimitsPerSelection() {
    return isStakeLimitsPerSelection;
  }

  public void setIsStakeLimitsPerSelection(Boolean isStakeLimitsPerSelection) {
    this.isStakeLimitsPerSelection = isStakeLimitsPerSelection;
  }


  public GetGlobalSportMarketLimitsSettingsRequestFilters stakeLimitFactor(Double stakeLimitFactor) {
    this.stakeLimitFactor = stakeLimitFactor;
    return this;
  }

   /**
   * Get stakeLimitFactor
   * @return stakeLimitFactor
  **/
  @javax.annotation.Nullable
  public Double getStakeLimitFactor() {
    return stakeLimitFactor;
  }

  public void setStakeLimitFactor(Double stakeLimitFactor) {
    this.stakeLimitFactor = stakeLimitFactor;
  }


  public GetGlobalSportMarketLimitsSettingsRequestFilters netWinFactor(Double netWinFactor) {
    this.netWinFactor = netWinFactor;
    return this;
  }

   /**
   * Get netWinFactor
   * @return netWinFactor
  **/
  @javax.annotation.Nullable
  public Double getNetWinFactor() {
    return netWinFactor;
  }

  public void setNetWinFactor(Double netWinFactor) {
    this.netWinFactor = netWinFactor;
  }


  public GetGlobalSportMarketLimitsSettingsRequestFilters sportTypeId(Integer sportTypeId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGlobalSportMarketLimitsSettingsRequestFilters getGlobalSportMarketLimitsSettingsRequestFilters = (GetGlobalSportMarketLimitsSettingsRequestFilters) o;
    return Objects.equals(this.marketTypeId, getGlobalSportMarketLimitsSettingsRequestFilters.marketTypeId) &&
        Objects.equals(this.isWinLimitsPerSelection, getGlobalSportMarketLimitsSettingsRequestFilters.isWinLimitsPerSelection) &&
        Objects.equals(this.isStakeLimitsPerSelection, getGlobalSportMarketLimitsSettingsRequestFilters.isStakeLimitsPerSelection) &&
        Objects.equals(this.stakeLimitFactor, getGlobalSportMarketLimitsSettingsRequestFilters.stakeLimitFactor) &&
        Objects.equals(this.netWinFactor, getGlobalSportMarketLimitsSettingsRequestFilters.netWinFactor) &&
        Objects.equals(this.sportTypeId, getGlobalSportMarketLimitsSettingsRequestFilters.sportTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, isWinLimitsPerSelection, isStakeLimitsPerSelection, stakeLimitFactor, netWinFactor, sportTypeId);
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
    sb.append("class GetGlobalSportMarketLimitsSettingsRequestFilters {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    isWinLimitsPerSelection: ").append(toIndentedString(isWinLimitsPerSelection)).append("\n");
    sb.append("    isStakeLimitsPerSelection: ").append(toIndentedString(isStakeLimitsPerSelection)).append("\n");
    sb.append("    stakeLimitFactor: ").append(toIndentedString(stakeLimitFactor)).append("\n");
    sb.append("    netWinFactor: ").append(toIndentedString(netWinFactor)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
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
    openapiFields.add("MarketTypeId");
    openapiFields.add("IsWinLimitsPerSelection");
    openapiFields.add("IsStakeLimitsPerSelection");
    openapiFields.add("StakeLimitFactor");
    openapiFields.add("NetWinFactor");
    openapiFields.add("SportTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetGlobalSportMarketLimitsSettingsRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGlobalSportMarketLimitsSettingsRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGlobalSportMarketLimitsSettingsRequestFilters is not found in the empty JSON string", GetGlobalSportMarketLimitsSettingsRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGlobalSportMarketLimitsSettingsRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGlobalSportMarketLimitsSettingsRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGlobalSportMarketLimitsSettingsRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGlobalSportMarketLimitsSettingsRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGlobalSportMarketLimitsSettingsRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGlobalSportMarketLimitsSettingsRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGlobalSportMarketLimitsSettingsRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetGlobalSportMarketLimitsSettingsRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGlobalSportMarketLimitsSettingsRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGlobalSportMarketLimitsSettingsRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGlobalSportMarketLimitsSettingsRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetGlobalSportMarketLimitsSettingsRequestFilters
  */
  public static GetGlobalSportMarketLimitsSettingsRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGlobalSportMarketLimitsSettingsRequestFilters.class);
  }

 /**
  * Convert an instance of GetGlobalSportMarketLimitsSettingsRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
