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
import java.time.OffsetDateTime;
import java.util.*;

/**
 * BrandListRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BrandListRequestFilter {
  public static final String SERIALIZED_NAME_BRAND_NAME = "BrandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_LICENSE_NAME = "LicenseName";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public BrandListRequestFilter() {
  }

  public BrandListRequestFilter brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public BrandListRequestFilter brandId(Integer brandId) {
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


  public BrandListRequestFilter createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public BrandListRequestFilter licenseName(String licenseName) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandListRequestFilter brandListRequestFilter = (BrandListRequestFilter) o;
    return Objects.equals(this.brandName, brandListRequestFilter.brandName) &&
        Objects.equals(this.brandId, brandListRequestFilter.brandId) &&
        Objects.equals(this.createdDate, brandListRequestFilter.createdDate) &&
        Objects.equals(this.licenseName, brandListRequestFilter.licenseName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, brandId, createdDate, licenseName);
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
    sb.append("class BrandListRequestFilter {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
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
    openapiFields.add("BrandName");
    openapiFields.add("BrandId");
    openapiFields.add("CreatedDate");
    openapiFields.add("LicenseName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BrandListRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandListRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandListRequestFilter is not found in the empty JSON string", BrandListRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandListRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandListRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("BrandName") != null && !jsonObj.get("BrandName").isJsonNull()) && !jsonObj.get("BrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandName").toString()));
      }
      if ((jsonObj.get("LicenseName") != null && !jsonObj.get("LicenseName").isJsonNull()) && !jsonObj.get("LicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LicenseName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandListRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandListRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandListRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandListRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandListRequestFilter>() {
           @Override
           public void write(JsonWriter out, BrandListRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandListRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandListRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandListRequestFilter
  * @throws IOException if the JSON string is invalid with respect to BrandListRequestFilter
  */
  public static BrandListRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandListRequestFilter.class);
  }

 /**
  * Convert an instance of BrandListRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

