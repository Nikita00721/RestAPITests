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
 * BoostTemplateSummaryPagingResultApiResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostTemplateSummaryPagingResultApiResult {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ApiError error;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private BoostTemplateSummaryPagingResult data;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public BoostTemplateSummaryPagingResultApiResult() {
  }

  public BoostTemplateSummaryPagingResultApiResult(
     Boolean success
  ) {
    this();
    this.success = success;
  }

  public BoostTemplateSummaryPagingResultApiResult error(ApiError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public ApiError getError() {
    return error;
  }

  public void setError(ApiError error) {
    this.error = error;
  }


  public BoostTemplateSummaryPagingResultApiResult data(BoostTemplateSummaryPagingResult data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public BoostTemplateSummaryPagingResult getData() {
    return data;
  }

  public void setData(BoostTemplateSummaryPagingResult data) {
    this.data = data;
  }


   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostTemplateSummaryPagingResultApiResult boostTemplateSummaryPagingResultApiResult = (BoostTemplateSummaryPagingResultApiResult) o;
    return Objects.equals(this.error, boostTemplateSummaryPagingResultApiResult.error) &&
        Objects.equals(this.data, boostTemplateSummaryPagingResultApiResult.data) &&
        Objects.equals(this.success, boostTemplateSummaryPagingResultApiResult.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, data, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoostTemplateSummaryPagingResultApiResult {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("Error");
    openapiFields.add("Data");
    openapiFields.add("Success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostTemplateSummaryPagingResultApiResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostTemplateSummaryPagingResultApiResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostTemplateSummaryPagingResultApiResult is not found in the empty JSON string", BoostTemplateSummaryPagingResultApiResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostTemplateSummaryPagingResultApiResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostTemplateSummaryPagingResultApiResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Error`
      if (jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) {
        ApiError.validateJsonElement(jsonObj.get("Error"));
      }
      // validate the optional field `Data`
      if (jsonObj.get("Data") != null && !jsonObj.get("Data").isJsonNull()) {
        BoostTemplateSummaryPagingResult.validateJsonElement(jsonObj.get("Data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostTemplateSummaryPagingResultApiResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostTemplateSummaryPagingResultApiResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostTemplateSummaryPagingResultApiResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostTemplateSummaryPagingResultApiResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostTemplateSummaryPagingResultApiResult>() {
           @Override
           public void write(JsonWriter out, BoostTemplateSummaryPagingResultApiResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostTemplateSummaryPagingResultApiResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostTemplateSummaryPagingResultApiResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostTemplateSummaryPagingResultApiResult
  * @throws IOException if the JSON string is invalid with respect to BoostTemplateSummaryPagingResultApiResult
  */
  public static BoostTemplateSummaryPagingResultApiResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostTemplateSummaryPagingResultApiResult.class);
  }

 /**
  * Convert an instance of BoostTemplateSummaryPagingResultApiResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

