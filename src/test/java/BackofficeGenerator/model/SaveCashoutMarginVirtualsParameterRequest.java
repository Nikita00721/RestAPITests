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
 * SaveCashoutMarginVirtualsParameterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SaveCashoutMarginVirtualsParameterRequest {
  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public SaveCashoutMarginVirtualsParameterRequest() {
  }

  public SaveCashoutMarginVirtualsParameterRequest value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveCashoutMarginVirtualsParameterRequest saveCashoutMarginVirtualsParameterRequest = (SaveCashoutMarginVirtualsParameterRequest) o;
    return Objects.equals(this.value, saveCashoutMarginVirtualsParameterRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveCashoutMarginVirtualsParameterRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SaveCashoutMarginVirtualsParameterRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaveCashoutMarginVirtualsParameterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaveCashoutMarginVirtualsParameterRequest is not found in the empty JSON string", SaveCashoutMarginVirtualsParameterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaveCashoutMarginVirtualsParameterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaveCashoutMarginVirtualsParameterRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaveCashoutMarginVirtualsParameterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaveCashoutMarginVirtualsParameterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaveCashoutMarginVirtualsParameterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaveCashoutMarginVirtualsParameterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SaveCashoutMarginVirtualsParameterRequest>() {
           @Override
           public void write(JsonWriter out, SaveCashoutMarginVirtualsParameterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaveCashoutMarginVirtualsParameterRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SaveCashoutMarginVirtualsParameterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SaveCashoutMarginVirtualsParameterRequest
  * @throws IOException if the JSON string is invalid with respect to SaveCashoutMarginVirtualsParameterRequest
  */
  public static SaveCashoutMarginVirtualsParameterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaveCashoutMarginVirtualsParameterRequest.class);
  }

 /**
  * Convert an instance of SaveCashoutMarginVirtualsParameterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

