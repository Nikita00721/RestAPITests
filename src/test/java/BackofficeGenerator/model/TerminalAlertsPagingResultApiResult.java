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
 * TerminalAlertsPagingResultApiResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TerminalAlertsPagingResultApiResult {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ApiError error;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private TerminalAlertsPagingResult data;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public TerminalAlertsPagingResultApiResult() {
  }

  public TerminalAlertsPagingResultApiResult(
     Boolean success
  ) {
    this();
    this.success = success;
  }

  public TerminalAlertsPagingResultApiResult error(ApiError error) {
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


  public TerminalAlertsPagingResultApiResult data(TerminalAlertsPagingResult data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public TerminalAlertsPagingResult getData() {
    return data;
  }

  public void setData(TerminalAlertsPagingResult data) {
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
    TerminalAlertsPagingResultApiResult terminalAlertsPagingResultApiResult = (TerminalAlertsPagingResultApiResult) o;
    return Objects.equals(this.error, terminalAlertsPagingResultApiResult.error) &&
        Objects.equals(this.data, terminalAlertsPagingResultApiResult.data) &&
        Objects.equals(this.success, terminalAlertsPagingResultApiResult.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, data, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalAlertsPagingResultApiResult {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to TerminalAlertsPagingResultApiResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerminalAlertsPagingResultApiResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminalAlertsPagingResultApiResult is not found in the empty JSON string", TerminalAlertsPagingResultApiResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerminalAlertsPagingResultApiResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerminalAlertsPagingResultApiResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Error`
      if (jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) {
        ApiError.validateJsonElement(jsonObj.get("Error"));
      }
      // validate the optional field `Data`
      if (jsonObj.get("Data") != null && !jsonObj.get("Data").isJsonNull()) {
        TerminalAlertsPagingResult.validateJsonElement(jsonObj.get("Data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalAlertsPagingResultApiResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalAlertsPagingResultApiResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalAlertsPagingResultApiResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalAlertsPagingResultApiResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalAlertsPagingResultApiResult>() {
           @Override
           public void write(JsonWriter out, TerminalAlertsPagingResultApiResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalAlertsPagingResultApiResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalAlertsPagingResultApiResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalAlertsPagingResultApiResult
  * @throws IOException if the JSON string is invalid with respect to TerminalAlertsPagingResultApiResult
  */
  public static TerminalAlertsPagingResultApiResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalAlertsPagingResultApiResult.class);
  }

 /**
  * Convert an instance of TerminalAlertsPagingResultApiResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

