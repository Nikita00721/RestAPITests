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
 * PopularBetBrandItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class PopularBetBrandItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LICENSE_NAME = "LicenseName";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_POP_BET_MODE = "PopBetMode";
  @SerializedName(SERIALIZED_NAME_POP_BET_MODE)
  private Integer popBetMode;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public PopularBetBrandItem() {
  }

  public PopularBetBrandItem name(String name) {
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


  public PopularBetBrandItem licenseName(String licenseName) {
    this.licenseName = licenseName;
    return this;
  }

   /**
   * Get licenseName
   * @return licenseName
  **/
  @javax.annotation.Nullable
  public String getLicenseName() {
    return licenseName;
  }

  public void setLicenseName(String licenseName) {
    this.licenseName = licenseName;
  }


  public PopularBetBrandItem popBetMode(Integer popBetMode) {
    this.popBetMode = popBetMode;
    return this;
  }

   /**
   * Get popBetMode
   * @return popBetMode
  **/
  @javax.annotation.Nullable
  public Integer getPopBetMode() {
    return popBetMode;
  }

  public void setPopBetMode(Integer popBetMode) {
    this.popBetMode = popBetMode;
  }


  public PopularBetBrandItem brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularBetBrandItem popularBetBrandItem = (PopularBetBrandItem) o;
    return Objects.equals(this.name, popularBetBrandItem.name) &&
        Objects.equals(this.licenseName, popularBetBrandItem.licenseName) &&
        Objects.equals(this.popBetMode, popularBetBrandItem.popBetMode) &&
        Objects.equals(this.brandId, popularBetBrandItem.brandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, licenseName, popBetMode, brandId);
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
    sb.append("class PopularBetBrandItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    popBetMode: ").append(toIndentedString(popBetMode)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("LicenseName");
    openapiFields.add("PopBetMode");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PopularBetBrandItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PopularBetBrandItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PopularBetBrandItem is not found in the empty JSON string", PopularBetBrandItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PopularBetBrandItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PopularBetBrandItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("LicenseName") != null && !jsonObj.get("LicenseName").isJsonNull()) && !jsonObj.get("LicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LicenseName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PopularBetBrandItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PopularBetBrandItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PopularBetBrandItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PopularBetBrandItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PopularBetBrandItem>() {
           @Override
           public void write(JsonWriter out, PopularBetBrandItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PopularBetBrandItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PopularBetBrandItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PopularBetBrandItem
  * @throws IOException if the JSON string is invalid with respect to PopularBetBrandItem
  */
  public static PopularBetBrandItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PopularBetBrandItem.class);
  }

 /**
  * Convert an instance of PopularBetBrandItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

