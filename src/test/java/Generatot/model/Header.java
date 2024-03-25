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
 * Header
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class Header {
  public static final String SERIALIZED_NAME_TYPE_ID = "TypeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ODDS = "Odds";
  @SerializedName(SERIALIZED_NAME_ODDS)
  private List<HeaderOdd> odds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPECIAL_ODD = "SpecialOdd";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODD)
  private HeaderSpecialOdd specialOdd;

  public Header() {
  }

  public Header typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public Header name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Header odds(List<HeaderOdd> odds) {
    this.odds = odds;
    return this;
  }

  public Header addOddsItem(HeaderOdd oddsItem) {
    if (this.odds == null) {
      this.odds = new ArrayList<>();
    }
    this.odds.add(oddsItem);
    return this;
  }

   /**
   * Get odds
   * @return odds
  **/
  @javax.annotation.Nonnull
  public List<HeaderOdd> getOdds() {
    return odds;
  }

  public void setOdds(List<HeaderOdd> odds) {
    this.odds = odds;
  }


  public Header specialOdd(HeaderSpecialOdd specialOdd) {
    this.specialOdd = specialOdd;
    return this;
  }

   /**
   * Get specialOdd
   * @return specialOdd
  **/
  @javax.annotation.Nullable
  public HeaderSpecialOdd getSpecialOdd() {
    return specialOdd;
  }

  public void setSpecialOdd(HeaderSpecialOdd specialOdd) {
    this.specialOdd = specialOdd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Header header = (Header) o;
    return Objects.equals(this.typeId, header.typeId) &&
        Objects.equals(this.name, header.name) &&
        Objects.equals(this.odds, header.odds) &&
        Objects.equals(this.specialOdd, header.specialOdd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, name, odds, specialOdd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Header {\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
    sb.append("    specialOdd: ").append(toIndentedString(specialOdd)).append("\n");
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
    openapiFields.add("TypeId");
    openapiFields.add("Name");
    openapiFields.add("Odds");
    openapiFields.add("SpecialOdd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TypeId");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Odds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Header
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Header.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Header is not found in the empty JSON string", Header.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Header.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Header` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Header.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Odds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Odds` to be an array in the JSON string but got `%s`", jsonObj.get("Odds").toString()));
      }

      JsonArray jsonArrayodds = jsonObj.getAsJsonArray("Odds");
      // validate the required field `Odds` (array)
      for (int i = 0; i < jsonArrayodds.size(); i++) {
        HeaderOdd.validateJsonElement(jsonArrayodds.get(i));
      };
      // validate the optional field `SpecialOdd`
      if (jsonObj.get("SpecialOdd") != null && !jsonObj.get("SpecialOdd").isJsonNull()) {
        HeaderSpecialOdd.validateJsonElement(jsonObj.get("SpecialOdd"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Header.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Header' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Header> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Header.class));

       return (TypeAdapter<T>) new TypeAdapter<Header>() {
           @Override
           public void write(JsonWriter out, Header value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Header read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Header given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Header
  * @throws IOException if the JSON string is invalid with respect to Header
  */
  public static Header fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Header.class);
  }

 /**
  * Convert an instance of Header to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

