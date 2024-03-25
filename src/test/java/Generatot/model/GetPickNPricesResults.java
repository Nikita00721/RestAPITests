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
 * GetPickNPricesResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetPickNPricesResults {
  public static final String SERIALIZED_NAME_PICK_N_PRICES = "PickNPrices";
  @SerializedName(SERIALIZED_NAME_PICK_N_PRICES)
  private List<PickNPrice> pickNPrices = new ArrayList<>();

  public GetPickNPricesResults() {
  }

  public GetPickNPricesResults pickNPrices(List<PickNPrice> pickNPrices) {
    this.pickNPrices = pickNPrices;
    return this;
  }

  public GetPickNPricesResults addPickNPricesItem(PickNPrice pickNPricesItem) {
    if (this.pickNPrices == null) {
      this.pickNPrices = new ArrayList<>();
    }
    this.pickNPrices.add(pickNPricesItem);
    return this;
  }

   /**
   * Get pickNPrices
   * @return pickNPrices
  **/
  @javax.annotation.Nonnull
  public List<PickNPrice> getPickNPrices() {
    return pickNPrices;
  }

  public void setPickNPrices(List<PickNPrice> pickNPrices) {
    this.pickNPrices = pickNPrices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPickNPricesResults getPickNPricesResults = (GetPickNPricesResults) o;
    return Objects.equals(this.pickNPrices, getPickNPricesResults.pickNPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickNPrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPickNPricesResults {\n");
    sb.append("    pickNPrices: ").append(toIndentedString(pickNPrices)).append("\n");
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
    openapiFields.add("PickNPrices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PickNPrices");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetPickNPricesResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPickNPricesResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPickNPricesResults is not found in the empty JSON string", GetPickNPricesResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPickNPricesResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPickNPricesResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPickNPricesResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("PickNPrices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PickNPrices` to be an array in the JSON string but got `%s`", jsonObj.get("PickNPrices").toString()));
      }

      JsonArray jsonArraypickNPrices = jsonObj.getAsJsonArray("PickNPrices");
      // validate the required field `PickNPrices` (array)
      for (int i = 0; i < jsonArraypickNPrices.size(); i++) {
        PickNPrice.validateJsonElement(jsonArraypickNPrices.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPickNPricesResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPickNPricesResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPickNPricesResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPickNPricesResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPickNPricesResults>() {
           @Override
           public void write(JsonWriter out, GetPickNPricesResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPickNPricesResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetPickNPricesResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetPickNPricesResults
  * @throws IOException if the JSON string is invalid with respect to GetPickNPricesResults
  */
  public static GetPickNPricesResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPickNPricesResults.class);
  }

 /**
  * Convert an instance of GetPickNPricesResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
