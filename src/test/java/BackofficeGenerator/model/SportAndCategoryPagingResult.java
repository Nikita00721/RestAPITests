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
 * SportAndCategoryPagingResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SportAndCategoryPagingResult {
  public static final String SERIALIZED_NAME_PAGING = "Paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private PagingInfo paging;

  public static final String SERIALIZED_NAME_ROWS = "Rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<SportAndCategory> rows;

  public SportAndCategoryPagingResult() {
  }

  public SportAndCategoryPagingResult paging(PagingInfo paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
  public PagingInfo getPaging() {
    return paging;
  }

  public void setPaging(PagingInfo paging) {
    this.paging = paging;
  }


  public SportAndCategoryPagingResult rows(List<SportAndCategory> rows) {
    this.rows = rows;
    return this;
  }

  public SportAndCategoryPagingResult addRowsItem(SportAndCategory rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<SportAndCategory> getRows() {
    return rows;
  }

  public void setRows(List<SportAndCategory> rows) {
    this.rows = rows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportAndCategoryPagingResult sportAndCategoryPagingResult = (SportAndCategoryPagingResult) o;
    return Objects.equals(this.paging, sportAndCategoryPagingResult.paging) &&
        Objects.equals(this.rows, sportAndCategoryPagingResult.rows);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, rows);
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
    sb.append("class SportAndCategoryPagingResult {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
    openapiFields.add("Rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SportAndCategoryPagingResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SportAndCategoryPagingResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SportAndCategoryPagingResult is not found in the empty JSON string", SportAndCategoryPagingResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SportAndCategoryPagingResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SportAndCategoryPagingResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Paging`
      if (jsonObj.get("Paging") != null && !jsonObj.get("Paging").isJsonNull()) {
        PagingInfo.validateJsonElement(jsonObj.get("Paging"));
      }
      if (jsonObj.get("Rows") != null && !jsonObj.get("Rows").isJsonNull()) {
        JsonArray jsonArrayrows = jsonObj.getAsJsonArray("Rows");
        if (jsonArrayrows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Rows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Rows` to be an array in the JSON string but got `%s`", jsonObj.get("Rows").toString()));
          }

          // validate the optional field `Rows` (array)
          for (int i = 0; i < jsonArrayrows.size(); i++) {
            SportAndCategory.validateJsonElement(jsonArrayrows.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SportAndCategoryPagingResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SportAndCategoryPagingResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SportAndCategoryPagingResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SportAndCategoryPagingResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SportAndCategoryPagingResult>() {
           @Override
           public void write(JsonWriter out, SportAndCategoryPagingResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SportAndCategoryPagingResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SportAndCategoryPagingResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SportAndCategoryPagingResult
  * @throws IOException if the JSON string is invalid with respect to SportAndCategoryPagingResult
  */
  public static SportAndCategoryPagingResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SportAndCategoryPagingResult.class);
  }

 /**
  * Convert an instance of SportAndCategoryPagingResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

