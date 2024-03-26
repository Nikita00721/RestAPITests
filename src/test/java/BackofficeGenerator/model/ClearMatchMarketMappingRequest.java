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
 * ClearMatchMarketMappingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ClearMatchMarketMappingRequest {
  public static final String SERIALIZED_NAME_INT_SPORT_ID = "IntSportId";
  @SerializedName(SERIALIZED_NAME_INT_SPORT_ID)
  private Integer intSportId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public ClearMatchMarketMappingRequest() {
  }

  public ClearMatchMarketMappingRequest intSportId(Integer intSportId) {
    this.intSportId = intSportId;
    return this;
  }

   /**
   * Get intSportId
   * @return intSportId
  **/
  @javax.annotation.Nullable
  public Integer getIntSportId() {
    return intSportId;
  }

  public void setIntSportId(Integer intSportId) {
    this.intSportId = intSportId;
  }


  public ClearMatchMarketMappingRequest marketTypeId(Integer marketTypeId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearMatchMarketMappingRequest clearMatchMarketMappingRequest = (ClearMatchMarketMappingRequest) o;
    return Objects.equals(this.intSportId, clearMatchMarketMappingRequest.intSportId) &&
        Objects.equals(this.marketTypeId, clearMatchMarketMappingRequest.marketTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intSportId, marketTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearMatchMarketMappingRequest {\n");
    sb.append("    intSportId: ").append(toIndentedString(intSportId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
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
    openapiFields.add("IntSportId");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClearMatchMarketMappingRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClearMatchMarketMappingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClearMatchMarketMappingRequest is not found in the empty JSON string", ClearMatchMarketMappingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClearMatchMarketMappingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClearMatchMarketMappingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClearMatchMarketMappingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClearMatchMarketMappingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClearMatchMarketMappingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClearMatchMarketMappingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ClearMatchMarketMappingRequest>() {
           @Override
           public void write(JsonWriter out, ClearMatchMarketMappingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClearMatchMarketMappingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClearMatchMarketMappingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClearMatchMarketMappingRequest
  * @throws IOException if the JSON string is invalid with respect to ClearMatchMarketMappingRequest
  */
  public static ClearMatchMarketMappingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClearMatchMarketMappingRequest.class);
  }

 /**
  * Convert an instance of ClearMatchMarketMappingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

