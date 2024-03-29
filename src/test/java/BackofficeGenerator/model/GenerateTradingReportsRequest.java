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
 * GenerateTradingReportsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GenerateTradingReportsRequest {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_DATE_RANGE_ID = "DateRangeId";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE_ID)
  private Integer dateRangeId;

  public static final String SERIALIZED_NAME_REPORT_TYPE_ID = "ReportTypeId";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE_ID)
  private ReportsType reportTypeId;

  public GenerateTradingReportsRequest() {
  }

  public GenerateTradingReportsRequest brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }


  public GenerateTradingReportsRequest dateRangeId(Integer dateRangeId) {
    this.dateRangeId = dateRangeId;
    return this;
  }

   /**
   * Get dateRangeId
   * @return dateRangeId
  **/
  @javax.annotation.Nullable
  public Integer getDateRangeId() {
    return dateRangeId;
  }

  public void setDateRangeId(Integer dateRangeId) {
    this.dateRangeId = dateRangeId;
  }


  public GenerateTradingReportsRequest reportTypeId(ReportsType reportTypeId) {
    this.reportTypeId = reportTypeId;
    return this;
  }

   /**
   * Get reportTypeId
   * @return reportTypeId
  **/
  @javax.annotation.Nullable
  public ReportsType getReportTypeId() {
    return reportTypeId;
  }

  public void setReportTypeId(ReportsType reportTypeId) {
    this.reportTypeId = reportTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateTradingReportsRequest generateTradingReportsRequest = (GenerateTradingReportsRequest) o;
    return Objects.equals(this.brandId, generateTradingReportsRequest.brandId) &&
        Objects.equals(this.dateRangeId, generateTradingReportsRequest.dateRangeId) &&
        Objects.equals(this.reportTypeId, generateTradingReportsRequest.reportTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, dateRangeId, reportTypeId);
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
    sb.append("class GenerateTradingReportsRequest {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    dateRangeId: ").append(toIndentedString(dateRangeId)).append("\n");
    sb.append("    reportTypeId: ").append(toIndentedString(reportTypeId)).append("\n");
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
    openapiFields.add("BrandId");
    openapiFields.add("DateRangeId");
    openapiFields.add("ReportTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenerateTradingReportsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateTradingReportsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateTradingReportsRequest is not found in the empty JSON string", GenerateTradingReportsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateTradingReportsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateTradingReportsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReportTypeId`
      if (jsonObj.get("ReportTypeId") != null && !jsonObj.get("ReportTypeId").isJsonNull()) {
        ReportsType.validateJsonElement(jsonObj.get("ReportTypeId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateTradingReportsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateTradingReportsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateTradingReportsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateTradingReportsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateTradingReportsRequest>() {
           @Override
           public void write(JsonWriter out, GenerateTradingReportsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateTradingReportsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateTradingReportsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateTradingReportsRequest
  * @throws IOException if the JSON string is invalid with respect to GenerateTradingReportsRequest
  */
  public static GenerateTradingReportsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateTradingReportsRequest.class);
  }

 /**
  * Convert an instance of GenerateTradingReportsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

