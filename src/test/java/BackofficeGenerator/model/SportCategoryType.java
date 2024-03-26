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
 * SportCategoryType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SportCategoryType {
  public static final String SERIALIZED_NAME_EXT_CATEGORY_ID = "ExtCategoryId";
  @SerializedName(SERIALIZED_NAME_EXT_CATEGORY_ID)
  private Integer extCategoryId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPORT_CATEGORY_ID = "SportCategoryId";
  @SerializedName(SERIALIZED_NAME_SPORT_CATEGORY_ID)
  private Integer sportCategoryId;

  public SportCategoryType() {
  }

  public SportCategoryType extCategoryId(Integer extCategoryId) {
    this.extCategoryId = extCategoryId;
    return this;
  }

   /**
   * Get extCategoryId
   * @return extCategoryId
  **/
  @javax.annotation.Nullable
  public Integer getExtCategoryId() {
    return extCategoryId;
  }

  public void setExtCategoryId(Integer extCategoryId) {
    this.extCategoryId = extCategoryId;
  }


  public SportCategoryType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SportCategoryType sportCategoryId(Integer sportCategoryId) {
    this.sportCategoryId = sportCategoryId;
    return this;
  }

   /**
   * Get sportCategoryId
   * @return sportCategoryId
  **/
  @javax.annotation.Nullable
  public Integer getSportCategoryId() {
    return sportCategoryId;
  }

  public void setSportCategoryId(Integer sportCategoryId) {
    this.sportCategoryId = sportCategoryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportCategoryType sportCategoryType = (SportCategoryType) o;
    return Objects.equals(this.extCategoryId, sportCategoryType.extCategoryId) &&
        Objects.equals(this.name, sportCategoryType.name) &&
        Objects.equals(this.sportCategoryId, sportCategoryType.sportCategoryId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(extCategoryId, name, sportCategoryId);
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
    sb.append("class SportCategoryType {\n");
    sb.append("    extCategoryId: ").append(toIndentedString(extCategoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sportCategoryId: ").append(toIndentedString(sportCategoryId)).append("\n");
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
    openapiFields.add("ExtCategoryId");
    openapiFields.add("Name");
    openapiFields.add("SportCategoryId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SportCategoryType
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SportCategoryType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SportCategoryType is not found in the empty JSON string", SportCategoryType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SportCategoryType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SportCategoryType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SportCategoryType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SportCategoryType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SportCategoryType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SportCategoryType.class));

       return (TypeAdapter<T>) new TypeAdapter<SportCategoryType>() {
           @Override
           public void write(JsonWriter out, SportCategoryType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SportCategoryType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SportCategoryType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SportCategoryType
  * @throws IOException if the JSON string is invalid with respect to SportCategoryType
  */
  public static SportCategoryType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SportCategoryType.class);
  }

 /**
  * Convert an instance of SportCategoryType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
