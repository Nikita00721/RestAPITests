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
 * BrandListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BrandListItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public static final String SERIALIZED_NAME_DEFAULT_MULTIPLE_BONUS_CONFIG_ID = "DefaultMultipleBonusConfigId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MULTIPLE_BONUS_CONFIG_ID)
  private Integer defaultMultipleBonusConfigId;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public BrandListItem() {
  }

  public BrandListItem name(String name) {
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


  public BrandListItem licenseId(Integer licenseId) {
    this.licenseId = licenseId;
    return this;
  }

   /**
   * Get licenseId
   * @return licenseId
  **/
  @javax.annotation.Nullable
  public Integer getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(Integer licenseId) {
    this.licenseId = licenseId;
  }


  public BrandListItem defaultMultipleBonusConfigId(Integer defaultMultipleBonusConfigId) {
    this.defaultMultipleBonusConfigId = defaultMultipleBonusConfigId;
    return this;
  }

   /**
   * Get defaultMultipleBonusConfigId
   * @return defaultMultipleBonusConfigId
  **/
  @javax.annotation.Nullable
  public Integer getDefaultMultipleBonusConfigId() {
    return defaultMultipleBonusConfigId;
  }

  public void setDefaultMultipleBonusConfigId(Integer defaultMultipleBonusConfigId) {
    this.defaultMultipleBonusConfigId = defaultMultipleBonusConfigId;
  }


  public BrandListItem brandId(Integer brandId) {
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
    BrandListItem brandListItem = (BrandListItem) o;
    return Objects.equals(this.name, brandListItem.name) &&
        Objects.equals(this.licenseId, brandListItem.licenseId) &&
        Objects.equals(this.defaultMultipleBonusConfigId, brandListItem.defaultMultipleBonusConfigId) &&
        Objects.equals(this.brandId, brandListItem.brandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, licenseId, defaultMultipleBonusConfigId, brandId);
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
    sb.append("class BrandListItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    defaultMultipleBonusConfigId: ").append(toIndentedString(defaultMultipleBonusConfigId)).append("\n");
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
    openapiFields.add("LicenseId");
    openapiFields.add("DefaultMultipleBonusConfigId");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BrandListItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandListItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandListItem is not found in the empty JSON string", BrandListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandListItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!BrandListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandListItem>() {
           @Override
           public void write(JsonWriter out, BrandListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandListItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandListItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandListItem
  * @throws IOException if the JSON string is invalid with respect to BrandListItem
  */
  public static BrandListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandListItem.class);
  }

 /**
  * Convert an instance of BrandListItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

