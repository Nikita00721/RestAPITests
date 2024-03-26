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
 * GetConfigBoostLimitsRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetConfigBoostLimitsRequestFilter {
  public static final String SERIALIZED_NAME_BOOST_LIMIT_IDS = "BoostLimitIds";
  @SerializedName(SERIALIZED_NAME_BOOST_LIMIT_IDS)
  private List<Integer> boostLimitIds;

  public static final String SERIALIZED_NAME_CURRENCY_IDS = "CurrencyIds";
  @SerializedName(SERIALIZED_NAME_CURRENCY_IDS)
  private List<Integer> currencyIds;

  public static final String SERIALIZED_NAME_SHOW_ONLY_EMPTY = "ShowOnlyEmpty";
  @SerializedName(SERIALIZED_NAME_SHOW_ONLY_EMPTY)
  private Boolean showOnlyEmpty;

  public static final String SERIALIZED_NAME_BOOST_CONFIG_ID = "BoostConfigId";
  @SerializedName(SERIALIZED_NAME_BOOST_CONFIG_ID)
  private Integer boostConfigId;

  public GetConfigBoostLimitsRequestFilter() {
  }

  public GetConfigBoostLimitsRequestFilter boostLimitIds(List<Integer> boostLimitIds) {
    this.boostLimitIds = boostLimitIds;
    return this;
  }

  public GetConfigBoostLimitsRequestFilter addBoostLimitIdsItem(Integer boostLimitIdsItem) {
    if (this.boostLimitIds == null) {
      this.boostLimitIds = new ArrayList<>();
    }
    this.boostLimitIds.add(boostLimitIdsItem);
    return this;
  }

   /**
   * Get boostLimitIds
   * @return boostLimitIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getBoostLimitIds() {
    return boostLimitIds;
  }

  public void setBoostLimitIds(List<Integer> boostLimitIds) {
    this.boostLimitIds = boostLimitIds;
  }


  public GetConfigBoostLimitsRequestFilter currencyIds(List<Integer> currencyIds) {
    this.currencyIds = currencyIds;
    return this;
  }

  public GetConfigBoostLimitsRequestFilter addCurrencyIdsItem(Integer currencyIdsItem) {
    if (this.currencyIds == null) {
      this.currencyIds = new ArrayList<>();
    }
    this.currencyIds.add(currencyIdsItem);
    return this;
  }

   /**
   * Get currencyIds
   * @return currencyIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getCurrencyIds() {
    return currencyIds;
  }

  public void setCurrencyIds(List<Integer> currencyIds) {
    this.currencyIds = currencyIds;
  }


  public GetConfigBoostLimitsRequestFilter showOnlyEmpty(Boolean showOnlyEmpty) {
    this.showOnlyEmpty = showOnlyEmpty;
    return this;
  }

   /**
   * Get showOnlyEmpty
   * @return showOnlyEmpty
  **/
  @javax.annotation.Nullable
  public Boolean getShowOnlyEmpty() {
    return showOnlyEmpty;
  }

  public void setShowOnlyEmpty(Boolean showOnlyEmpty) {
    this.showOnlyEmpty = showOnlyEmpty;
  }


  public GetConfigBoostLimitsRequestFilter boostConfigId(Integer boostConfigId) {
    this.boostConfigId = boostConfigId;
    return this;
  }

   /**
   * Get boostConfigId
   * @return boostConfigId
  **/
  @javax.annotation.Nullable
  public Integer getBoostConfigId() {
    return boostConfigId;
  }

  public void setBoostConfigId(Integer boostConfigId) {
    this.boostConfigId = boostConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConfigBoostLimitsRequestFilter getConfigBoostLimitsRequestFilter = (GetConfigBoostLimitsRequestFilter) o;
    return Objects.equals(this.boostLimitIds, getConfigBoostLimitsRequestFilter.boostLimitIds) &&
        Objects.equals(this.currencyIds, getConfigBoostLimitsRequestFilter.currencyIds) &&
        Objects.equals(this.showOnlyEmpty, getConfigBoostLimitsRequestFilter.showOnlyEmpty) &&
        Objects.equals(this.boostConfigId, getConfigBoostLimitsRequestFilter.boostConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostLimitIds, currencyIds, showOnlyEmpty, boostConfigId);
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
    sb.append("class GetConfigBoostLimitsRequestFilter {\n");
    sb.append("    boostLimitIds: ").append(toIndentedString(boostLimitIds)).append("\n");
    sb.append("    currencyIds: ").append(toIndentedString(currencyIds)).append("\n");
    sb.append("    showOnlyEmpty: ").append(toIndentedString(showOnlyEmpty)).append("\n");
    sb.append("    boostConfigId: ").append(toIndentedString(boostConfigId)).append("\n");
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
    openapiFields.add("BoostLimitIds");
    openapiFields.add("CurrencyIds");
    openapiFields.add("ShowOnlyEmpty");
    openapiFields.add("BoostConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetConfigBoostLimitsRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetConfigBoostLimitsRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetConfigBoostLimitsRequestFilter is not found in the empty JSON string", GetConfigBoostLimitsRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetConfigBoostLimitsRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetConfigBoostLimitsRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("BoostLimitIds") != null && !jsonObj.get("BoostLimitIds").isJsonNull() && !jsonObj.get("BoostLimitIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoostLimitIds` to be an array in the JSON string but got `%s`", jsonObj.get("BoostLimitIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("CurrencyIds") != null && !jsonObj.get("CurrencyIds").isJsonNull() && !jsonObj.get("CurrencyIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `CurrencyIds` to be an array in the JSON string but got `%s`", jsonObj.get("CurrencyIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetConfigBoostLimitsRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetConfigBoostLimitsRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetConfigBoostLimitsRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetConfigBoostLimitsRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetConfigBoostLimitsRequestFilter>() {
           @Override
           public void write(JsonWriter out, GetConfigBoostLimitsRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetConfigBoostLimitsRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetConfigBoostLimitsRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetConfigBoostLimitsRequestFilter
  * @throws IOException if the JSON string is invalid with respect to GetConfigBoostLimitsRequestFilter
  */
  public static GetConfigBoostLimitsRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetConfigBoostLimitsRequestFilter.class);
  }

 /**
  * Convert an instance of GetConfigBoostLimitsRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

