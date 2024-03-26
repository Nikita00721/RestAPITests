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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * GetBetMentorMarketsRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetBetMentorMarketsRequestFilter {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_USE_MOST_BALANCED = "UseMostBalanced";
  @SerializedName(SERIALIZED_NAME_USE_MOST_BALANCED)
  private Boolean useMostBalanced;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public GetBetMentorMarketsRequestFilter() {
  }

  public GetBetMentorMarketsRequestFilter marketTypeId(Integer marketTypeId) {
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


  public GetBetMentorMarketsRequestFilter useMostBalanced(Boolean useMostBalanced) {
    this.useMostBalanced = useMostBalanced;
    return this;
  }

   /**
   * Get useMostBalanced
   * @return useMostBalanced
  **/
  @javax.annotation.Nullable
  public Boolean getUseMostBalanced() {
    return useMostBalanced;
  }

  public void setUseMostBalanced(Boolean useMostBalanced) {
    this.useMostBalanced = useMostBalanced;
  }


  public GetBetMentorMarketsRequestFilter configId(Integer configId) {
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
    GetBetMentorMarketsRequestFilter getBetMentorMarketsRequestFilter = (GetBetMentorMarketsRequestFilter) o;
    return Objects.equals(this.marketTypeId, getBetMentorMarketsRequestFilter.marketTypeId) &&
        Objects.equals(this.useMostBalanced, getBetMentorMarketsRequestFilter.useMostBalanced) &&
        Objects.equals(this.configId, getBetMentorMarketsRequestFilter.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, useMostBalanced, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBetMentorMarketsRequestFilter {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    useMostBalanced: ").append(toIndentedString(useMostBalanced)).append("\n");
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
    openapiFields.add("MarketTypeId");
    openapiFields.add("UseMostBalanced");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetBetMentorMarketsRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBetMentorMarketsRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBetMentorMarketsRequestFilter is not found in the empty JSON string", GetBetMentorMarketsRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBetMentorMarketsRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBetMentorMarketsRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBetMentorMarketsRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBetMentorMarketsRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBetMentorMarketsRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBetMentorMarketsRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBetMentorMarketsRequestFilter>() {
           @Override
           public void write(JsonWriter out, GetBetMentorMarketsRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBetMentorMarketsRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBetMentorMarketsRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBetMentorMarketsRequestFilter
  * @throws IOException if the JSON string is invalid with respect to GetBetMentorMarketsRequestFilter
  */
  public static GetBetMentorMarketsRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBetMentorMarketsRequestFilter.class);
  }

 /**
  * Convert an instance of GetBetMentorMarketsRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

