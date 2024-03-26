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
 * GetMarketsForMarketShortNamesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetMarketsForMarketShortNamesRequest {
  public static final String SERIALIZED_NAME_SEARCH_MARKET_QUERY = "SearchMarketQuery";
  @SerializedName(SERIALIZED_NAME_SEARCH_MARKET_QUERY)
  private String searchMarketQuery;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public GetMarketsForMarketShortNamesRequest() {
  }

  public GetMarketsForMarketShortNamesRequest searchMarketQuery(String searchMarketQuery) {
    this.searchMarketQuery = searchMarketQuery;
    return this;
  }

   /**
   * Get searchMarketQuery
   * @return searchMarketQuery
  **/
  @javax.annotation.Nullable
  public String getSearchMarketQuery() {
    return searchMarketQuery;
  }

  public void setSearchMarketQuery(String searchMarketQuery) {
    this.searchMarketQuery = searchMarketQuery;
  }


  public GetMarketsForMarketShortNamesRequest sportTypeId(Integer sportTypeId) {
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
    GetMarketsForMarketShortNamesRequest getMarketsForMarketShortNamesRequest = (GetMarketsForMarketShortNamesRequest) o;
    return Objects.equals(this.searchMarketQuery, getMarketsForMarketShortNamesRequest.searchMarketQuery) &&
        Objects.equals(this.sportTypeId, getMarketsForMarketShortNamesRequest.sportTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchMarketQuery, sportTypeId);
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
    sb.append("class GetMarketsForMarketShortNamesRequest {\n");
    sb.append("    searchMarketQuery: ").append(toIndentedString(searchMarketQuery)).append("\n");
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
    openapiFields.add("SearchMarketQuery");
    openapiFields.add("SportTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMarketsForMarketShortNamesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMarketsForMarketShortNamesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMarketsForMarketShortNamesRequest is not found in the empty JSON string", GetMarketsForMarketShortNamesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMarketsForMarketShortNamesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMarketsForMarketShortNamesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SearchMarketQuery") != null && !jsonObj.get("SearchMarketQuery").isJsonNull()) && !jsonObj.get("SearchMarketQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SearchMarketQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SearchMarketQuery").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMarketsForMarketShortNamesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMarketsForMarketShortNamesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMarketsForMarketShortNamesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMarketsForMarketShortNamesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMarketsForMarketShortNamesRequest>() {
           @Override
           public void write(JsonWriter out, GetMarketsForMarketShortNamesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMarketsForMarketShortNamesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMarketsForMarketShortNamesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMarketsForMarketShortNamesRequest
  * @throws IOException if the JSON string is invalid with respect to GetMarketsForMarketShortNamesRequest
  */
  public static GetMarketsForMarketShortNamesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMarketsForMarketShortNamesRequest.class);
  }

 /**
  * Convert an instance of GetMarketsForMarketShortNamesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
