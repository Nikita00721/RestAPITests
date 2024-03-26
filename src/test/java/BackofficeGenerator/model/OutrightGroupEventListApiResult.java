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
 * OutrightGroupEventListApiResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class OutrightGroupEventListApiResult {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ApiError error;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<OutrightGroupEvent> data;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public OutrightGroupEventListApiResult() {
  }

  public OutrightGroupEventListApiResult(
     List<OutrightGroupEvent> data,
     Boolean success
  ) {
    this();
    this.data = data;
    this.success = success;
  }

  public OutrightGroupEventListApiResult error(ApiError error) {
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


   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public List<OutrightGroupEvent> getData() {
    return data;
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
    OutrightGroupEventListApiResult outrightGroupEventListApiResult = (OutrightGroupEventListApiResult) o;
    return Objects.equals(this.error, outrightGroupEventListApiResult.error) &&
        Objects.equals(this.data, outrightGroupEventListApiResult.data) &&
        Objects.equals(this.success, outrightGroupEventListApiResult.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, data, success);
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
    sb.append("class OutrightGroupEventListApiResult {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to OutrightGroupEventListApiResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutrightGroupEventListApiResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutrightGroupEventListApiResult is not found in the empty JSON string", OutrightGroupEventListApiResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutrightGroupEventListApiResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutrightGroupEventListApiResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Error`
      if (jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) {
        ApiError.validateJsonElement(jsonObj.get("Error"));
      }
      if (jsonObj.get("Data") != null && !jsonObj.get("Data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("Data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Data` to be an array in the JSON string but got `%s`", jsonObj.get("Data").toString()));
          }

          // validate the optional field `Data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            OutrightGroupEvent.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutrightGroupEventListApiResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutrightGroupEventListApiResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutrightGroupEventListApiResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutrightGroupEventListApiResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OutrightGroupEventListApiResult>() {
           @Override
           public void write(JsonWriter out, OutrightGroupEventListApiResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutrightGroupEventListApiResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutrightGroupEventListApiResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutrightGroupEventListApiResult
  * @throws IOException if the JSON string is invalid with respect to OutrightGroupEventListApiResult
  */
  public static OutrightGroupEventListApiResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutrightGroupEventListApiResult.class);
  }

 /**
  * Convert an instance of OutrightGroupEventListApiResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

