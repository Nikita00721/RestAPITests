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
 * GetBrandsForPopularBetsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetBrandsForPopularBetsRequest {
  public static final String SERIALIZED_NAME_PAGING = "Paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private UserSpecificPagingRequestInfo paging;

  public static final String SERIALIZED_NAME_SORTING = "Sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private Map<String, SortingOrders> sorting;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private GetBrandsForPopularBetsRequestFilter filters;

  public GetBrandsForPopularBetsRequest() {
  }

  public GetBrandsForPopularBetsRequest paging(UserSpecificPagingRequestInfo paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
  public UserSpecificPagingRequestInfo getPaging() {
    return paging;
  }

  public void setPaging(UserSpecificPagingRequestInfo paging) {
    this.paging = paging;
  }


  public GetBrandsForPopularBetsRequest sorting(Map<String, SortingOrders> sorting) {
    this.sorting = sorting;
    return this;
  }

  public GetBrandsForPopularBetsRequest putSortingItem(String key, SortingOrders sortingItem) {
    if (this.sorting == null) {
      this.sorting = new HashMap<>();
    }
    this.sorting.put(key, sortingItem);
    return this;
  }

   /**
   * Get sorting
   * @return sorting
  **/
  @javax.annotation.Nullable
  public Map<String, SortingOrders> getSorting() {
    return sorting;
  }

  public void setSorting(Map<String, SortingOrders> sorting) {
    this.sorting = sorting;
  }


  public GetBrandsForPopularBetsRequest filters(GetBrandsForPopularBetsRequestFilter filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public GetBrandsForPopularBetsRequestFilter getFilters() {
    return filters;
  }

  public void setFilters(GetBrandsForPopularBetsRequestFilter filters) {
    this.filters = filters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBrandsForPopularBetsRequest getBrandsForPopularBetsRequest = (GetBrandsForPopularBetsRequest) o;
    return Objects.equals(this.paging, getBrandsForPopularBetsRequest.paging) &&
        Objects.equals(this.sorting, getBrandsForPopularBetsRequest.sorting) &&
        Objects.equals(this.filters, getBrandsForPopularBetsRequest.filters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, sorting, filters);
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
    sb.append("class GetBrandsForPopularBetsRequest {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("Paging");
    openapiFields.add("Sorting");
    openapiFields.add("Filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetBrandsForPopularBetsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBrandsForPopularBetsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBrandsForPopularBetsRequest is not found in the empty JSON string", GetBrandsForPopularBetsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBrandsForPopularBetsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBrandsForPopularBetsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Paging`
      if (jsonObj.get("Paging") != null && !jsonObj.get("Paging").isJsonNull()) {
        UserSpecificPagingRequestInfo.validateJsonElement(jsonObj.get("Paging"));
      }
      // validate the optional field `Filters`
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        GetBrandsForPopularBetsRequestFilter.validateJsonElement(jsonObj.get("Filters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBrandsForPopularBetsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBrandsForPopularBetsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBrandsForPopularBetsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBrandsForPopularBetsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBrandsForPopularBetsRequest>() {
           @Override
           public void write(JsonWriter out, GetBrandsForPopularBetsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBrandsForPopularBetsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBrandsForPopularBetsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBrandsForPopularBetsRequest
  * @throws IOException if the JSON string is invalid with respect to GetBrandsForPopularBetsRequest
  */
  public static GetBrandsForPopularBetsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBrandsForPopularBetsRequest.class);
  }

 /**
  * Convert an instance of GetBrandsForPopularBetsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

