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
 * GetBoostLimitsRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetBoostLimitsRequestFilter {
  public static final String SERIALIZED_NAME_CURRENCY_IDS = "CurrencyIds";
  @SerializedName(SERIALIZED_NAME_CURRENCY_IDS)
  private List<Integer> currencyIds;

  public static final String SERIALIZED_NAME_SHOW_ONLY_EMPTY = "ShowOnlyEmpty";
  @SerializedName(SERIALIZED_NAME_SHOW_ONLY_EMPTY)
  private Boolean showOnlyEmpty;

  public static final String SERIALIZED_NAME_BOOST_LIMIT_IDS = "BoostLimitIds";
  @SerializedName(SERIALIZED_NAME_BOOST_LIMIT_IDS)
  private List<Integer> boostLimitIds;

  public GetBoostLimitsRequestFilter() {
  }

  public GetBoostLimitsRequestFilter currencyIds(List<Integer> currencyIds) {
    this.currencyIds = currencyIds;
    return this;
  }

  public GetBoostLimitsRequestFilter addCurrencyIdsItem(Integer currencyIdsItem) {
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


  public GetBoostLimitsRequestFilter showOnlyEmpty(Boolean showOnlyEmpty) {
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


  public GetBoostLimitsRequestFilter boostLimitIds(List<Integer> boostLimitIds) {
    this.boostLimitIds = boostLimitIds;
    return this;
  }

  public GetBoostLimitsRequestFilter addBoostLimitIdsItem(Integer boostLimitIdsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBoostLimitsRequestFilter getBoostLimitsRequestFilter = (GetBoostLimitsRequestFilter) o;
    return Objects.equals(this.currencyIds, getBoostLimitsRequestFilter.currencyIds) &&
        Objects.equals(this.showOnlyEmpty, getBoostLimitsRequestFilter.showOnlyEmpty) &&
        Objects.equals(this.boostLimitIds, getBoostLimitsRequestFilter.boostLimitIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyIds, showOnlyEmpty, boostLimitIds);
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
    sb.append("class GetBoostLimitsRequestFilter {\n");
    sb.append("    currencyIds: ").append(toIndentedString(currencyIds)).append("\n");
    sb.append("    showOnlyEmpty: ").append(toIndentedString(showOnlyEmpty)).append("\n");
    sb.append("    boostLimitIds: ").append(toIndentedString(boostLimitIds)).append("\n");
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
    openapiFields.add("CurrencyIds");
    openapiFields.add("ShowOnlyEmpty");
    openapiFields.add("BoostLimitIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetBoostLimitsRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBoostLimitsRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBoostLimitsRequestFilter is not found in the empty JSON string", GetBoostLimitsRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBoostLimitsRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBoostLimitsRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("CurrencyIds") != null && !jsonObj.get("CurrencyIds").isJsonNull() && !jsonObj.get("CurrencyIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `CurrencyIds` to be an array in the JSON string but got `%s`", jsonObj.get("CurrencyIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BoostLimitIds") != null && !jsonObj.get("BoostLimitIds").isJsonNull() && !jsonObj.get("BoostLimitIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoostLimitIds` to be an array in the JSON string but got `%s`", jsonObj.get("BoostLimitIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBoostLimitsRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBoostLimitsRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBoostLimitsRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBoostLimitsRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBoostLimitsRequestFilter>() {
           @Override
           public void write(JsonWriter out, GetBoostLimitsRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBoostLimitsRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBoostLimitsRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBoostLimitsRequestFilter
  * @throws IOException if the JSON string is invalid with respect to GetBoostLimitsRequestFilter
  */
  public static GetBoostLimitsRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBoostLimitsRequestFilter.class);
  }

 /**
  * Convert an instance of GetBoostLimitsRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

