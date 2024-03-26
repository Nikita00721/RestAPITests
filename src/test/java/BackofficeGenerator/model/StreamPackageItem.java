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
 * StreamPackageItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class StreamPackageItem {
  public static final String SERIALIZED_NAME_PROVIDER_ID = "ProviderId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private Integer providerId;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "ProviderName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_BRAND_NAME = "BrandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "IsPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Object settings = null;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Integer packageId;

  public StreamPackageItem() {
  }

  public StreamPackageItem providerId(Integer providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @javax.annotation.Nullable
  public Integer getProviderId() {
    return providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }


  public StreamPackageItem brandId(Integer brandId) {
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


  public StreamPackageItem providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public StreamPackageItem brandName(String brandName) {
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


  public StreamPackageItem isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @javax.annotation.Nullable
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public StreamPackageItem isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public StreamPackageItem createdDate(OffsetDateTime createdDate) {
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


  public StreamPackageItem settings(Object settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public Object getSettings() {
    return settings;
  }

  public void setSettings(Object settings) {
    this.settings = settings;
  }


  public StreamPackageItem comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public StreamPackageItem packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @javax.annotation.Nullable
  public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamPackageItem streamPackageItem = (StreamPackageItem) o;
    return Objects.equals(this.providerId, streamPackageItem.providerId) &&
        Objects.equals(this.brandId, streamPackageItem.brandId) &&
        Objects.equals(this.providerName, streamPackageItem.providerName) &&
        Objects.equals(this.brandName, streamPackageItem.brandName) &&
        Objects.equals(this.isPublic, streamPackageItem.isPublic) &&
        Objects.equals(this.isEnabled, streamPackageItem.isEnabled) &&
        Objects.equals(this.createdDate, streamPackageItem.createdDate) &&
        Objects.equals(this.settings, streamPackageItem.settings) &&
        Objects.equals(this.comment, streamPackageItem.comment) &&
        Objects.equals(this.packageId, streamPackageItem.packageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, brandId, providerName, brandName, isPublic, isEnabled, createdDate, settings, comment, packageId);
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
    sb.append("class StreamPackageItem {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
    openapiFields.add("ProviderId");
    openapiFields.add("BrandId");
    openapiFields.add("ProviderName");
    openapiFields.add("BrandName");
    openapiFields.add("IsPublic");
    openapiFields.add("IsEnabled");
    openapiFields.add("CreatedDate");
    openapiFields.add("Settings");
    openapiFields.add("Comment");
    openapiFields.add("PackageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamPackageItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamPackageItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamPackageItem is not found in the empty JSON string", StreamPackageItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamPackageItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamPackageItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ProviderName") != null && !jsonObj.get("ProviderName").isJsonNull()) && !jsonObj.get("ProviderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProviderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProviderName").toString()));
      }
      if ((jsonObj.get("BrandName") != null && !jsonObj.get("BrandName").isJsonNull()) && !jsonObj.get("BrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandName").toString()));
      }
      if ((jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) && !jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamPackageItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamPackageItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamPackageItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamPackageItem.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamPackageItem>() {
           @Override
           public void write(JsonWriter out, StreamPackageItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamPackageItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamPackageItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamPackageItem
  * @throws IOException if the JSON string is invalid with respect to StreamPackageItem
  */
  public static StreamPackageItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamPackageItem.class);
  }

 /**
  * Convert an instance of StreamPackageItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
