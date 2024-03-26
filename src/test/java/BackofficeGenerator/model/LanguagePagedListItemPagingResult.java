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
 * LanguagePagedListItemPagingResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LanguagePagedListItemPagingResult {
  public static final String SERIALIZED_NAME_PAGING = "Paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private PagingInfo paging;

  public static final String SERIALIZED_NAME_ROWS = "Rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<LanguagePagedListItem> rows;

  public LanguagePagedListItemPagingResult() {
  }

  public LanguagePagedListItemPagingResult paging(PagingInfo paging) {
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


  public LanguagePagedListItemPagingResult rows(List<LanguagePagedListItem> rows) {
    this.rows = rows;
    return this;
  }

  public LanguagePagedListItemPagingResult addRowsItem(LanguagePagedListItem rowsItem) {
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
  public List<LanguagePagedListItem> getRows() {
    return rows;
  }

  public void setRows(List<LanguagePagedListItem> rows) {
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
    LanguagePagedListItemPagingResult languagePagedListItemPagingResult = (LanguagePagedListItemPagingResult) o;
    return Objects.equals(this.paging, languagePagedListItemPagingResult.paging) &&
        Objects.equals(this.rows, languagePagedListItemPagingResult.rows);
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
    sb.append("class LanguagePagedListItemPagingResult {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to LanguagePagedListItemPagingResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LanguagePagedListItemPagingResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LanguagePagedListItemPagingResult is not found in the empty JSON string", LanguagePagedListItemPagingResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LanguagePagedListItemPagingResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LanguagePagedListItemPagingResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            LanguagePagedListItem.validateJsonElement(jsonArrayrows.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LanguagePagedListItemPagingResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LanguagePagedListItemPagingResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LanguagePagedListItemPagingResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LanguagePagedListItemPagingResult.class));

       return (TypeAdapter<T>) new TypeAdapter<LanguagePagedListItemPagingResult>() {
           @Override
           public void write(JsonWriter out, LanguagePagedListItemPagingResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LanguagePagedListItemPagingResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LanguagePagedListItemPagingResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LanguagePagedListItemPagingResult
  * @throws IOException if the JSON string is invalid with respect to LanguagePagedListItemPagingResult
  */
  public static LanguagePagedListItemPagingResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LanguagePagedListItemPagingResult.class);
  }

 /**
  * Convert an instance of LanguagePagedListItemPagingResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

