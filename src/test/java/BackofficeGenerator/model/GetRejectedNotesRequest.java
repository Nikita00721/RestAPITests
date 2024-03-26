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
 * GetRejectedNotesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetRejectedNotesRequest {
  public static final String SERIALIZED_NAME_PAGING = "Paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private PagingRequestInfo paging;

  public static final String SERIALIZED_NAME_SORTING = "Sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private Map<String, SortingOrders> sorting;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private GetRejectedNotesRequestFilter filters;

  public GetRejectedNotesRequest() {
  }

  public GetRejectedNotesRequest paging(PagingRequestInfo paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
  public PagingRequestInfo getPaging() {
    return paging;
  }

  public void setPaging(PagingRequestInfo paging) {
    this.paging = paging;
  }


  public GetRejectedNotesRequest sorting(Map<String, SortingOrders> sorting) {
    this.sorting = sorting;
    return this;
  }

  public GetRejectedNotesRequest putSortingItem(String key, SortingOrders sortingItem) {
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


  public GetRejectedNotesRequest filters(GetRejectedNotesRequestFilter filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public GetRejectedNotesRequestFilter getFilters() {
    return filters;
  }

  public void setFilters(GetRejectedNotesRequestFilter filters) {
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
    GetRejectedNotesRequest getRejectedNotesRequest = (GetRejectedNotesRequest) o;
    return Objects.equals(this.paging, getRejectedNotesRequest.paging) &&
        Objects.equals(this.sorting, getRejectedNotesRequest.sorting) &&
        Objects.equals(this.filters, getRejectedNotesRequest.filters);
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
    sb.append("class GetRejectedNotesRequest {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to GetRejectedNotesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRejectedNotesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRejectedNotesRequest is not found in the empty JSON string", GetRejectedNotesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRejectedNotesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRejectedNotesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Paging`
      if (jsonObj.get("Paging") != null && !jsonObj.get("Paging").isJsonNull()) {
        PagingRequestInfo.validateJsonElement(jsonObj.get("Paging"));
      }
      // validate the optional field `Filters`
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        GetRejectedNotesRequestFilter.validateJsonElement(jsonObj.get("Filters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRejectedNotesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRejectedNotesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRejectedNotesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRejectedNotesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRejectedNotesRequest>() {
           @Override
           public void write(JsonWriter out, GetRejectedNotesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRejectedNotesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRejectedNotesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRejectedNotesRequest
  * @throws IOException if the JSON string is invalid with respect to GetRejectedNotesRequest
  */
  public static GetRejectedNotesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRejectedNotesRequest.class);
  }

 /**
  * Convert an instance of GetRejectedNotesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
