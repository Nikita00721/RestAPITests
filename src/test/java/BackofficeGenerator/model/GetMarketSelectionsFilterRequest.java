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
 * GetMarketSelectionsFilterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetMarketSelectionsFilterRequest {
  public static final String SERIALIZED_NAME_MARKET_TYPES_IDS = "MarketTypesIds";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPES_IDS)
  private List<Integer> marketTypesIds;

  public GetMarketSelectionsFilterRequest() {
  }

  public GetMarketSelectionsFilterRequest marketTypesIds(List<Integer> marketTypesIds) {
    this.marketTypesIds = marketTypesIds;
    return this;
  }

  public GetMarketSelectionsFilterRequest addMarketTypesIdsItem(Integer marketTypesIdsItem) {
    if (this.marketTypesIds == null) {
      this.marketTypesIds = new ArrayList<>();
    }
    this.marketTypesIds.add(marketTypesIdsItem);
    return this;
  }

   /**
   * Get marketTypesIds
   * @return marketTypesIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getMarketTypesIds() {
    return marketTypesIds;
  }

  public void setMarketTypesIds(List<Integer> marketTypesIds) {
    this.marketTypesIds = marketTypesIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketSelectionsFilterRequest getMarketSelectionsFilterRequest = (GetMarketSelectionsFilterRequest) o;
    return Objects.equals(this.marketTypesIds, getMarketSelectionsFilterRequest.marketTypesIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypesIds);
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
    sb.append("class GetMarketSelectionsFilterRequest {\n");
    sb.append("    marketTypesIds: ").append(toIndentedString(marketTypesIds)).append("\n");
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
    openapiFields.add("MarketTypesIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMarketSelectionsFilterRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMarketSelectionsFilterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMarketSelectionsFilterRequest is not found in the empty JSON string", GetMarketSelectionsFilterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMarketSelectionsFilterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMarketSelectionsFilterRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("MarketTypesIds") != null && !jsonObj.get("MarketTypesIds").isJsonNull() && !jsonObj.get("MarketTypesIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketTypesIds` to be an array in the JSON string but got `%s`", jsonObj.get("MarketTypesIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMarketSelectionsFilterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMarketSelectionsFilterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMarketSelectionsFilterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMarketSelectionsFilterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMarketSelectionsFilterRequest>() {
           @Override
           public void write(JsonWriter out, GetMarketSelectionsFilterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMarketSelectionsFilterRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMarketSelectionsFilterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMarketSelectionsFilterRequest
  * @throws IOException if the JSON string is invalid with respect to GetMarketSelectionsFilterRequest
  */
  public static GetMarketSelectionsFilterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMarketSelectionsFilterRequest.class);
  }

 /**
  * Convert an instance of GetMarketSelectionsFilterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

