/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * TotoGroupOutListApiResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class TotoGroupOutListApiResult {
  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<TotoGroupOut> result = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public TotoGroupOutListApiResult() {
  }

  public TotoGroupOutListApiResult result(List<TotoGroupOut> result) {
    this.result = result;
    return this;
  }

  public TotoGroupOutListApiResult addResultItem(TotoGroupOut resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  public List<TotoGroupOut> getResult() {
    return result;
  }

  public void setResult(List<TotoGroupOut> result) {
    this.result = result;
  }


  public TotoGroupOutListApiResult error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotoGroupOutListApiResult totoGroupOutListApiResult = (TotoGroupOutListApiResult) o;
    return Objects.equals(this.result, totoGroupOutListApiResult.result) &&
        Objects.equals(this.error, totoGroupOutListApiResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotoGroupOutListApiResult {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("Error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Result");
    openapiRequiredFields.add("Error");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotoGroupOutListApiResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoGroupOutListApiResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoGroupOutListApiResult is not found in the empty JSON string", TotoGroupOutListApiResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoGroupOutListApiResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoGroupOutListApiResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotoGroupOutListApiResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Result").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Result` to be an array in the JSON string but got `%s`", jsonObj.get("Result").toString()));
      }

      JsonArray jsonArrayresult = jsonObj.getAsJsonArray("Result");
      // validate the required field `Result` (array)
      for (int i = 0; i < jsonArrayresult.size(); i++) {
        TotoGroupOut.validateJsonElement(jsonArrayresult.get(i));
      };
      // validate the required field `Error`
      Error.validateJsonElement(jsonObj.get("Error"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoGroupOutListApiResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoGroupOutListApiResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoGroupOutListApiResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoGroupOutListApiResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoGroupOutListApiResult>() {
           @Override
           public void write(JsonWriter out, TotoGroupOutListApiResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoGroupOutListApiResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoGroupOutListApiResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoGroupOutListApiResult
  * @throws IOException if the JSON string is invalid with respect to TotoGroupOutListApiResult
  */
  public static TotoGroupOutListApiResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoGroupOutListApiResult.class);
  }

 /**
  * Convert an instance of TotoGroupOutListApiResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

