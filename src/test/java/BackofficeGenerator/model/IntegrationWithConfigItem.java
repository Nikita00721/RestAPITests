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
 * IntegrationWithConfigItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class IntegrationWithConfigItem {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_BRAND_NAME = "BrandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public static final String SERIALIZED_NAME_LICENSE_NAME = "LicenseName";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public static final String SERIALIZED_NAME_CONFIG_NAME = "ConfigName";
  @SerializedName(SERIALIZED_NAME_CONFIG_NAME)
  private String configName;

  public static final String SERIALIZED_NAME_CONFIG_ACCESS_TYPE = "ConfigAccessType";
  @SerializedName(SERIALIZED_NAME_CONFIG_ACCESS_TYPE)
  private AccessTypes configAccessType;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "IntegrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public IntegrationWithConfigItem() {
  }

  public IntegrationWithConfigItem brandId(Integer brandId) {
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


  public IntegrationWithConfigItem brandName(String brandName) {
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


  public IntegrationWithConfigItem licenseId(Integer licenseId) {
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


  public IntegrationWithConfigItem licenseName(String licenseName) {
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


  public IntegrationWithConfigItem configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }


  public IntegrationWithConfigItem configName(String configName) {
    this.configName = configName;
    return this;
  }

   /**
   * Get configName
   * @return configName
  **/
  @javax.annotation.Nullable
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }


  public IntegrationWithConfigItem configAccessType(AccessTypes configAccessType) {
    this.configAccessType = configAccessType;
    return this;
  }

   /**
   * Get configAccessType
   * @return configAccessType
  **/
  @javax.annotation.Nullable
  public AccessTypes getConfigAccessType() {
    return configAccessType;
  }

  public void setConfigAccessType(AccessTypes configAccessType) {
    this.configAccessType = configAccessType;
  }


  public IntegrationWithConfigItem integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Get integrationId
   * @return integrationId
  **/
  @javax.annotation.Nullable
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationWithConfigItem integrationWithConfigItem = (IntegrationWithConfigItem) o;
    return Objects.equals(this.brandId, integrationWithConfigItem.brandId) &&
        Objects.equals(this.brandName, integrationWithConfigItem.brandName) &&
        Objects.equals(this.licenseId, integrationWithConfigItem.licenseId) &&
        Objects.equals(this.licenseName, integrationWithConfigItem.licenseName) &&
        Objects.equals(this.configId, integrationWithConfigItem.configId) &&
        Objects.equals(this.configName, integrationWithConfigItem.configName) &&
        Objects.equals(this.configAccessType, integrationWithConfigItem.configAccessType) &&
        Objects.equals(this.integrationId, integrationWithConfigItem.integrationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, licenseId, licenseName, configId, configName, configAccessType, integrationId);
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
    sb.append("class IntegrationWithConfigItem {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configAccessType: ").append(toIndentedString(configAccessType)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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
    openapiFields.add("BrandId");
    openapiFields.add("BrandName");
    openapiFields.add("LicenseId");
    openapiFields.add("LicenseName");
    openapiFields.add("ConfigId");
    openapiFields.add("ConfigName");
    openapiFields.add("ConfigAccessType");
    openapiFields.add("IntegrationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntegrationWithConfigItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationWithConfigItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationWithConfigItem is not found in the empty JSON string", IntegrationWithConfigItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntegrationWithConfigItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntegrationWithConfigItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("BrandName") != null && !jsonObj.get("BrandName").isJsonNull()) && !jsonObj.get("BrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandName").toString()));
      }
      if ((jsonObj.get("LicenseName") != null && !jsonObj.get("LicenseName").isJsonNull()) && !jsonObj.get("LicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LicenseName").toString()));
      }
      if ((jsonObj.get("ConfigName") != null && !jsonObj.get("ConfigName").isJsonNull()) && !jsonObj.get("ConfigName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ConfigName").toString()));
      }
      // validate the optional field `ConfigAccessType`
      if (jsonObj.get("ConfigAccessType") != null && !jsonObj.get("ConfigAccessType").isJsonNull()) {
        AccessTypes.validateJsonElement(jsonObj.get("ConfigAccessType"));
      }
      if ((jsonObj.get("IntegrationId") != null && !jsonObj.get("IntegrationId").isJsonNull()) && !jsonObj.get("IntegrationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IntegrationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IntegrationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationWithConfigItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationWithConfigItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationWithConfigItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationWithConfigItem.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationWithConfigItem>() {
           @Override
           public void write(JsonWriter out, IntegrationWithConfigItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntegrationWithConfigItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntegrationWithConfigItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntegrationWithConfigItem
  * @throws IOException if the JSON string is invalid with respect to IntegrationWithConfigItem
  */
  public static IntegrationWithConfigItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationWithConfigItem.class);
  }

 /**
  * Convert an instance of IntegrationWithConfigItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

