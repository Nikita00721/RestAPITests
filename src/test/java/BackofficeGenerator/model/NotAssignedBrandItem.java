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
 * NotAssignedBrandItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class NotAssignedBrandItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_LICENSE_ID = "ParentLicenseId";
  @SerializedName(SERIALIZED_NAME_PARENT_LICENSE_ID)
  private Integer parentLicenseId;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public NotAssignedBrandItem() {
  }

  public NotAssignedBrandItem name(String name) {
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


  public NotAssignedBrandItem parentLicenseId(Integer parentLicenseId) {
    this.parentLicenseId = parentLicenseId;
    return this;
  }

   /**
   * Get parentLicenseId
   * @return parentLicenseId
  **/
  @javax.annotation.Nullable
  public Integer getParentLicenseId() {
    return parentLicenseId;
  }

  public void setParentLicenseId(Integer parentLicenseId) {
    this.parentLicenseId = parentLicenseId;
  }


  public NotAssignedBrandItem brandId(Integer brandId) {
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
    NotAssignedBrandItem notAssignedBrandItem = (NotAssignedBrandItem) o;
    return Objects.equals(this.name, notAssignedBrandItem.name) &&
        Objects.equals(this.parentLicenseId, notAssignedBrandItem.parentLicenseId) &&
        Objects.equals(this.brandId, notAssignedBrandItem.brandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentLicenseId, brandId);
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
    sb.append("class NotAssignedBrandItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentLicenseId: ").append(toIndentedString(parentLicenseId)).append("\n");
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
    openapiFields.add("ParentLicenseId");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NotAssignedBrandItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotAssignedBrandItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotAssignedBrandItem is not found in the empty JSON string", NotAssignedBrandItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotAssignedBrandItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotAssignedBrandItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!NotAssignedBrandItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotAssignedBrandItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotAssignedBrandItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotAssignedBrandItem.class));

       return (TypeAdapter<T>) new TypeAdapter<NotAssignedBrandItem>() {
           @Override
           public void write(JsonWriter out, NotAssignedBrandItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotAssignedBrandItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotAssignedBrandItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotAssignedBrandItem
  * @throws IOException if the JSON string is invalid with respect to NotAssignedBrandItem
  */
  public static NotAssignedBrandItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotAssignedBrandItem.class);
  }

 /**
  * Convert an instance of NotAssignedBrandItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
