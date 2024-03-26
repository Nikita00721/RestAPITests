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
 * AsianSpecifiers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AsianSpecifiers {
  public static final String SERIALIZED_NAME_SPECIFIER_TYPE = "SpecifierType";
  @SerializedName(SERIALIZED_NAME_SPECIFIER_TYPE)
  private Integer specifierType;

  public static final String SERIALIZED_NAME_SPECIFIER = "Specifier";
  @SerializedName(SERIALIZED_NAME_SPECIFIER)
  private Integer specifier;

  public AsianSpecifiers() {
  }

  public AsianSpecifiers specifierType(Integer specifierType) {
    this.specifierType = specifierType;
    return this;
  }

   /**
   * Get specifierType
   * @return specifierType
  **/
  @javax.annotation.Nullable
  public Integer getSpecifierType() {
    return specifierType;
  }

  public void setSpecifierType(Integer specifierType) {
    this.specifierType = specifierType;
  }


  public AsianSpecifiers specifier(Integer specifier) {
    this.specifier = specifier;
    return this;
  }

   /**
   * Get specifier
   * @return specifier
  **/
  @javax.annotation.Nullable
  public Integer getSpecifier() {
    return specifier;
  }

  public void setSpecifier(Integer specifier) {
    this.specifier = specifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsianSpecifiers asianSpecifiers = (AsianSpecifiers) o;
    return Objects.equals(this.specifierType, asianSpecifiers.specifierType) &&
        Objects.equals(this.specifier, asianSpecifiers.specifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specifierType, specifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsianSpecifiers {\n");
    sb.append("    specifierType: ").append(toIndentedString(specifierType)).append("\n");
    sb.append("    specifier: ").append(toIndentedString(specifier)).append("\n");
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
    openapiFields.add("SpecifierType");
    openapiFields.add("Specifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AsianSpecifiers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsianSpecifiers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsianSpecifiers is not found in the empty JSON string", AsianSpecifiers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsianSpecifiers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsianSpecifiers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsianSpecifiers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsianSpecifiers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsianSpecifiers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsianSpecifiers.class));

       return (TypeAdapter<T>) new TypeAdapter<AsianSpecifiers>() {
           @Override
           public void write(JsonWriter out, AsianSpecifiers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsianSpecifiers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsianSpecifiers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsianSpecifiers
  * @throws IOException if the JSON string is invalid with respect to AsianSpecifiers
  */
  public static AsianSpecifiers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsianSpecifiers.class);
  }

 /**
  * Convert an instance of AsianSpecifiers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
