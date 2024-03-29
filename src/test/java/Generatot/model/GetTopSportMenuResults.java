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
 * GetTopSportMenuResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetTopSportMenuResults {
  public static final String SERIALIZED_NAME_TOP_SPORTS = "TopSports";
  @SerializedName(SERIALIZED_NAME_TOP_SPORTS)
  private List<SportNode> topSports = new ArrayList<>();

  public GetTopSportMenuResults() {
  }

  public GetTopSportMenuResults topSports(List<SportNode> topSports) {
    this.topSports = topSports;
    return this;
  }

  public GetTopSportMenuResults addTopSportsItem(SportNode topSportsItem) {
    if (this.topSports == null) {
      this.topSports = new ArrayList<>();
    }
    this.topSports.add(topSportsItem);
    return this;
  }

   /**
   * Get topSports
   * @return topSports
  **/
  @javax.annotation.Nonnull
  public List<SportNode> getTopSports() {
    return topSports;
  }

  public void setTopSports(List<SportNode> topSports) {
    this.topSports = topSports;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTopSportMenuResults getTopSportMenuResults = (GetTopSportMenuResults) o;
    return Objects.equals(this.topSports, getTopSportMenuResults.topSports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topSports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTopSportMenuResults {\n");
    sb.append("    topSports: ").append(toIndentedString(topSports)).append("\n");
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
    openapiFields.add("TopSports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TopSports");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTopSportMenuResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTopSportMenuResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTopSportMenuResults is not found in the empty JSON string", GetTopSportMenuResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTopSportMenuResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTopSportMenuResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTopSportMenuResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("TopSports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TopSports` to be an array in the JSON string but got `%s`", jsonObj.get("TopSports").toString()));
      }

      JsonArray jsonArraytopSports = jsonObj.getAsJsonArray("TopSports");
      // validate the required field `TopSports` (array)
      for (int i = 0; i < jsonArraytopSports.size(); i++) {
        SportNode.validateJsonElement(jsonArraytopSports.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTopSportMenuResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTopSportMenuResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTopSportMenuResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTopSportMenuResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTopSportMenuResults>() {
           @Override
           public void write(JsonWriter out, GetTopSportMenuResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTopSportMenuResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTopSportMenuResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTopSportMenuResults
  * @throws IOException if the JSON string is invalid with respect to GetTopSportMenuResults
  */
  public static GetTopSportMenuResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTopSportMenuResults.class);
  }

 /**
  * Convert an instance of GetTopSportMenuResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

