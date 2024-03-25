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
 * GetHorseRaceOddsStatesResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetHorseRaceOddsStatesResults {
  public static final String SERIALIZED_NAME_ODD_STATES = "OddStates";
  @SerializedName(SERIALIZED_NAME_ODD_STATES)
  private List<HorceRaceOddState> oddStates = new ArrayList<>();

  public GetHorseRaceOddsStatesResults() {
  }

  public GetHorseRaceOddsStatesResults oddStates(List<HorceRaceOddState> oddStates) {
    this.oddStates = oddStates;
    return this;
  }

  public GetHorseRaceOddsStatesResults addOddStatesItem(HorceRaceOddState oddStatesItem) {
    if (this.oddStates == null) {
      this.oddStates = new ArrayList<>();
    }
    this.oddStates.add(oddStatesItem);
    return this;
  }

   /**
   * Get oddStates
   * @return oddStates
  **/
  @javax.annotation.Nonnull
  public List<HorceRaceOddState> getOddStates() {
    return oddStates;
  }

  public void setOddStates(List<HorceRaceOddState> oddStates) {
    this.oddStates = oddStates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHorseRaceOddsStatesResults getHorseRaceOddsStatesResults = (GetHorseRaceOddsStatesResults) o;
    return Objects.equals(this.oddStates, getHorseRaceOddsStatesResults.oddStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oddStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHorseRaceOddsStatesResults {\n");
    sb.append("    oddStates: ").append(toIndentedString(oddStates)).append("\n");
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
    openapiFields.add("OddStates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("OddStates");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetHorseRaceOddsStatesResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetHorseRaceOddsStatesResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetHorseRaceOddsStatesResults is not found in the empty JSON string", GetHorseRaceOddsStatesResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetHorseRaceOddsStatesResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetHorseRaceOddsStatesResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetHorseRaceOddsStatesResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("OddStates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `OddStates` to be an array in the JSON string but got `%s`", jsonObj.get("OddStates").toString()));
      }

      JsonArray jsonArrayoddStates = jsonObj.getAsJsonArray("OddStates");
      // validate the required field `OddStates` (array)
      for (int i = 0; i < jsonArrayoddStates.size(); i++) {
        HorceRaceOddState.validateJsonElement(jsonArrayoddStates.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetHorseRaceOddsStatesResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetHorseRaceOddsStatesResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetHorseRaceOddsStatesResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetHorseRaceOddsStatesResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetHorseRaceOddsStatesResults>() {
           @Override
           public void write(JsonWriter out, GetHorseRaceOddsStatesResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetHorseRaceOddsStatesResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetHorseRaceOddsStatesResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetHorseRaceOddsStatesResults
  * @throws IOException if the JSON string is invalid with respect to GetHorseRaceOddsStatesResults
  */
  public static GetHorseRaceOddsStatesResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetHorseRaceOddsStatesResults.class);
  }

 /**
  * Convert an instance of GetHorseRaceOddsStatesResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

