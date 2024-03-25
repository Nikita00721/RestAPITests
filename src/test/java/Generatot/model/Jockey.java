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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Jockey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class Jockey {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SILK = "Silk";
  @SerializedName(SERIALIZED_NAME_SILK)
  private String silk;

  public Jockey() {
  }

  public Jockey(
     Long id, 
     String name
  ) {
    this();
    this.id = id;
    this.name = name;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



  public Jockey silk(String silk) {
    this.silk = silk;
    return this;
  }

   /**
   * Get silk
   * @return silk
  **/
  @javax.annotation.Nullable
  public String getSilk() {
    return silk;
  }

  public void setSilk(String silk) {
    this.silk = silk;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jockey jockey = (Jockey) o;
    return Objects.equals(this.id, jockey.id) &&
        Objects.equals(this.name, jockey.name) &&
        Objects.equals(this.silk, jockey.silk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, silk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jockey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    silk: ").append(toIndentedString(silk)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("Name");
    openapiFields.add("Silk");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jockey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jockey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jockey is not found in the empty JSON string", Jockey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jockey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jockey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Jockey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Silk") != null && !jsonObj.get("Silk").isJsonNull()) && !jsonObj.get("Silk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Silk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Silk").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jockey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jockey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jockey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jockey.class));

       return (TypeAdapter<T>) new TypeAdapter<Jockey>() {
           @Override
           public void write(JsonWriter out, Jockey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jockey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jockey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jockey
  * @throws IOException if the JSON string is invalid with respect to Jockey
  */
  public static Jockey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jockey.class);
  }

 /**
  * Convert an instance of Jockey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

