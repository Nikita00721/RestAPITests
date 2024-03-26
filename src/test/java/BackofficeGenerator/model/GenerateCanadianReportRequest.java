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
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * GenerateCanadianReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GenerateCanadianReportRequest {
  public static final String SERIALIZED_NAME_DATE_RANGE_KEY = "DateRangeKey";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE_KEY)
  private OffsetDateTime dateRangeKey;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public GenerateCanadianReportRequest() {
  }

  public GenerateCanadianReportRequest dateRangeKey(OffsetDateTime dateRangeKey) {
    this.dateRangeKey = dateRangeKey;
    return this;
  }

   /**
   * Get dateRangeKey
   * @return dateRangeKey
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateRangeKey() {
    return dateRangeKey;
  }

  public void setDateRangeKey(OffsetDateTime dateRangeKey) {
    this.dateRangeKey = dateRangeKey;
  }


  public GenerateCanadianReportRequest brandId(Integer brandId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateCanadianReportRequest generateCanadianReportRequest = (GenerateCanadianReportRequest) o;
    return Objects.equals(this.dateRangeKey, generateCanadianReportRequest.dateRangeKey) &&
        Objects.equals(this.brandId, generateCanadianReportRequest.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRangeKey, brandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCanadianReportRequest {\n");
    sb.append("    dateRangeKey: ").append(toIndentedString(dateRangeKey)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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
    openapiFields.add("DateRangeKey");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenerateCanadianReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateCanadianReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateCanadianReportRequest is not found in the empty JSON string", GenerateCanadianReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateCanadianReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateCanadianReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateCanadianReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateCanadianReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateCanadianReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateCanadianReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateCanadianReportRequest>() {
           @Override
           public void write(JsonWriter out, GenerateCanadianReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateCanadianReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateCanadianReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateCanadianReportRequest
  * @throws IOException if the JSON string is invalid with respect to GenerateCanadianReportRequest
  */
  public static GenerateCanadianReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateCanadianReportRequest.class);
  }

 /**
  * Convert an instance of GenerateCanadianReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
