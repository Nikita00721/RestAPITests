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
 * AssignedBrandItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AssignedBrandItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_LICENSE_ID = "ParentLicenseId";
  @SerializedName(SERIALIZED_NAME_PARENT_LICENSE_ID)
  private Integer parentLicenseId;

  public static final String SERIALIZED_NAME_PARENT_LICENSE_NAME = "ParentLicenseName";
  @SerializedName(SERIALIZED_NAME_PARENT_LICENSE_NAME)
  private String parentLicenseName;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public AssignedBrandItem() {
  }

  public AssignedBrandItem name(String name) {
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


  public AssignedBrandItem parentLicenseId(Integer parentLicenseId) {
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


  public AssignedBrandItem parentLicenseName(String parentLicenseName) {
    this.parentLicenseName = parentLicenseName;
    return this;
  }

   /**
   * Get parentLicenseName
   * @return parentLicenseName
  **/
  @javax.annotation.Nullable
  public String getParentLicenseName() {
    return parentLicenseName;
  }

  public void setParentLicenseName(String parentLicenseName) {
    this.parentLicenseName = parentLicenseName;
  }


  public AssignedBrandItem brandId(Integer brandId) {
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
    AssignedBrandItem assignedBrandItem = (AssignedBrandItem) o;
    return Objects.equals(this.name, assignedBrandItem.name) &&
        Objects.equals(this.parentLicenseId, assignedBrandItem.parentLicenseId) &&
        Objects.equals(this.parentLicenseName, assignedBrandItem.parentLicenseName) &&
        Objects.equals(this.brandId, assignedBrandItem.brandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentLicenseId, parentLicenseName, brandId);
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
    sb.append("class AssignedBrandItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentLicenseId: ").append(toIndentedString(parentLicenseId)).append("\n");
    sb.append("    parentLicenseName: ").append(toIndentedString(parentLicenseName)).append("\n");
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
    openapiFields.add("ParentLicenseName");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssignedBrandItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssignedBrandItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssignedBrandItem is not found in the empty JSON string", AssignedBrandItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssignedBrandItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssignedBrandItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("ParentLicenseName") != null && !jsonObj.get("ParentLicenseName").isJsonNull()) && !jsonObj.get("ParentLicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ParentLicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ParentLicenseName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssignedBrandItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssignedBrandItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssignedBrandItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssignedBrandItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AssignedBrandItem>() {
           @Override
           public void write(JsonWriter out, AssignedBrandItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssignedBrandItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssignedBrandItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssignedBrandItem
  * @throws IOException if the JSON string is invalid with respect to AssignedBrandItem
  */
  public static AssignedBrandItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssignedBrandItem.class);
  }

 /**
  * Convert an instance of AssignedBrandItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
