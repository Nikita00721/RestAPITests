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
 * CreateConfigRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CreateConfigRequest {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_PLATFORM = "Platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_INTEGRATION = "Integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;

  public static final String SERIALIZED_NAME_SITE_ID = "SiteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "BundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CreateConfigRequest() {
  }

  public CreateConfigRequest brandId(Integer brandId) {
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


  public CreateConfigRequest platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public CreateConfigRequest integration(String integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  public String getIntegration() {
    return integration;
  }

  public void setIntegration(String integration) {
    this.integration = integration;
  }


  public CreateConfigRequest siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public CreateConfigRequest bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Get bundleId
   * @return bundleId
  **/
  @javax.annotation.Nullable
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public CreateConfigRequest name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfigRequest createConfigRequest = (CreateConfigRequest) o;
    return Objects.equals(this.brandId, createConfigRequest.brandId) &&
        Objects.equals(this.platform, createConfigRequest.platform) &&
        Objects.equals(this.integration, createConfigRequest.integration) &&
        Objects.equals(this.siteId, createConfigRequest.siteId) &&
        Objects.equals(this.bundleId, createConfigRequest.bundleId) &&
        Objects.equals(this.name, createConfigRequest.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, platform, integration, siteId, bundleId, name);
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
    sb.append("class CreateConfigRequest {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("Platform");
    openapiFields.add("Integration");
    openapiFields.add("SiteId");
    openapiFields.add("BundleId");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateConfigRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateConfigRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConfigRequest is not found in the empty JSON string", CreateConfigRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateConfigRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConfigRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Platform") != null && !jsonObj.get("Platform").isJsonNull()) && !jsonObj.get("Platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Platform").toString()));
      }
      if ((jsonObj.get("Integration") != null && !jsonObj.get("Integration").isJsonNull()) && !jsonObj.get("Integration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Integration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Integration").toString()));
      }
      if ((jsonObj.get("SiteId") != null && !jsonObj.get("SiteId").isJsonNull()) && !jsonObj.get("SiteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SiteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SiteId").toString()));
      }
      if ((jsonObj.get("BundleId") != null && !jsonObj.get("BundleId").isJsonNull()) && !jsonObj.get("BundleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BundleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BundleId").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConfigRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConfigRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConfigRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConfigRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConfigRequest>() {
           @Override
           public void write(JsonWriter out, CreateConfigRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConfigRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateConfigRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateConfigRequest
  * @throws IOException if the JSON string is invalid with respect to CreateConfigRequest
  */
  public static CreateConfigRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConfigRequest.class);
  }

 /**
  * Convert an instance of CreateConfigRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

