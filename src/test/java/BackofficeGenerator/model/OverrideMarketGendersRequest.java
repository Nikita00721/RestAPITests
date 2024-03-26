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
 * OverrideMarketGendersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class OverrideMarketGendersRequest {
  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_GENDER = "Gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Integer gender;

  public static final String SERIALIZED_NAME_LANGUAGE_IDS = "LanguageIds";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_IDS)
  private List<Integer> languageIds;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public OverrideMarketGendersRequest() {
  }

  public OverrideMarketGendersRequest sportTypeId(Integer sportTypeId) {
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


  public OverrideMarketGendersRequest marketTypeId(Integer marketTypeId) {
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


  public OverrideMarketGendersRequest gender(Integer gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public OverrideMarketGendersRequest languageIds(List<Integer> languageIds) {
    this.languageIds = languageIds;
    return this;
  }

  public OverrideMarketGendersRequest addLanguageIdsItem(Integer languageIdsItem) {
    if (this.languageIds == null) {
      this.languageIds = new ArrayList<>();
    }
    this.languageIds.add(languageIdsItem);
    return this;
  }

   /**
   * Get languageIds
   * @return languageIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getLanguageIds() {
    return languageIds;
  }

  public void setLanguageIds(List<Integer> languageIds) {
    this.languageIds = languageIds;
  }


  public OverrideMarketGendersRequest configId(Integer configId) {
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
    OverrideMarketGendersRequest overrideMarketGendersRequest = (OverrideMarketGendersRequest) o;
    return Objects.equals(this.sportTypeId, overrideMarketGendersRequest.sportTypeId) &&
        Objects.equals(this.marketTypeId, overrideMarketGendersRequest.marketTypeId) &&
        Objects.equals(this.gender, overrideMarketGendersRequest.gender) &&
        Objects.equals(this.languageIds, overrideMarketGendersRequest.languageIds) &&
        Objects.equals(this.configId, overrideMarketGendersRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportTypeId, marketTypeId, gender, languageIds, configId);
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
    sb.append("class OverrideMarketGendersRequest {\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
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
    openapiFields.add("Gender");
    openapiFields.add("LanguageIds");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OverrideMarketGendersRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OverrideMarketGendersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverrideMarketGendersRequest is not found in the empty JSON string", OverrideMarketGendersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OverrideMarketGendersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OverrideMarketGendersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("LanguageIds") != null && !jsonObj.get("LanguageIds").isJsonNull() && !jsonObj.get("LanguageIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LanguageIds` to be an array in the JSON string but got `%s`", jsonObj.get("LanguageIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverrideMarketGendersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverrideMarketGendersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverrideMarketGendersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverrideMarketGendersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OverrideMarketGendersRequest>() {
           @Override
           public void write(JsonWriter out, OverrideMarketGendersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OverrideMarketGendersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OverrideMarketGendersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverrideMarketGendersRequest
  * @throws IOException if the JSON string is invalid with respect to OverrideMarketGendersRequest
  */
  public static OverrideMarketGendersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverrideMarketGendersRequest.class);
  }

 /**
  * Convert an instance of OverrideMarketGendersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

