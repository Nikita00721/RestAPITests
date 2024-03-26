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
 * PendingMarketInfoPagingResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class PendingMarketInfoPagingResult {
  public static final String SERIALIZED_NAME_PAGING = "Paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private PagingInfo paging;

  public static final String SERIALIZED_NAME_ROWS = "Rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<PendingMarketInfo> rows;

  public PendingMarketInfoPagingResult() {
  }

  public PendingMarketInfoPagingResult paging(PagingInfo paging) {
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


  public PendingMarketInfoPagingResult rows(List<PendingMarketInfo> rows) {
    this.rows = rows;
    return this;
  }

  public PendingMarketInfoPagingResult addRowsItem(PendingMarketInfo rowsItem) {
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
  public List<PendingMarketInfo> getRows() {
    return rows;
  }

  public void setRows(List<PendingMarketInfo> rows) {
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
    PendingMarketInfoPagingResult pendingMarketInfoPagingResult = (PendingMarketInfoPagingResult) o;
    return Objects.equals(this.paging, pendingMarketInfoPagingResult.paging) &&
        Objects.equals(this.rows, pendingMarketInfoPagingResult.rows);
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
    sb.append("class PendingMarketInfoPagingResult {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to PendingMarketInfoPagingResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PendingMarketInfoPagingResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PendingMarketInfoPagingResult is not found in the empty JSON string", PendingMarketInfoPagingResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PendingMarketInfoPagingResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PendingMarketInfoPagingResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            PendingMarketInfo.validateJsonElement(jsonArrayrows.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PendingMarketInfoPagingResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PendingMarketInfoPagingResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PendingMarketInfoPagingResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PendingMarketInfoPagingResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PendingMarketInfoPagingResult>() {
           @Override
           public void write(JsonWriter out, PendingMarketInfoPagingResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PendingMarketInfoPagingResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PendingMarketInfoPagingResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PendingMarketInfoPagingResult
  * @throws IOException if the JSON string is invalid with respect to PendingMarketInfoPagingResult
  */
  public static PendingMarketInfoPagingResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PendingMarketInfoPagingResult.class);
  }

 /**
  * Convert an instance of PendingMarketInfoPagingResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

