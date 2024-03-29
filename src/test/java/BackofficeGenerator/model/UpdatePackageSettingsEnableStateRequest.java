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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * UpdatePackageSettingsEnableStateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdatePackageSettingsEnableStateRequest {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_IS_ENABLE = "IsEnable";
  @SerializedName(SERIALIZED_NAME_IS_ENABLE)
  private Boolean isEnable;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Integer packageId;

  public UpdatePackageSettingsEnableStateRequest() {
  }

  public UpdatePackageSettingsEnableStateRequest brandId(Integer brandId) {
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


  public UpdatePackageSettingsEnableStateRequest isEnable(Boolean isEnable) {
    this.isEnable = isEnable;
    return this;
  }

   /**
   * Get isEnable
   * @return isEnable
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(Boolean isEnable) {
    this.isEnable = isEnable;
  }


  public UpdatePackageSettingsEnableStateRequest packageId(Integer packageId) {
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
    UpdatePackageSettingsEnableStateRequest updatePackageSettingsEnableStateRequest = (UpdatePackageSettingsEnableStateRequest) o;
    return Objects.equals(this.brandId, updatePackageSettingsEnableStateRequest.brandId) &&
        Objects.equals(this.isEnable, updatePackageSettingsEnableStateRequest.isEnable) &&
        Objects.equals(this.packageId, updatePackageSettingsEnableStateRequest.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, isEnable, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePackageSettingsEnableStateRequest {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
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
    openapiFields.add("BrandId");
    openapiFields.add("IsEnable");
    openapiFields.add("PackageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdatePackageSettingsEnableStateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePackageSettingsEnableStateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePackageSettingsEnableStateRequest is not found in the empty JSON string", UpdatePackageSettingsEnableStateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePackageSettingsEnableStateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePackageSettingsEnableStateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePackageSettingsEnableStateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePackageSettingsEnableStateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePackageSettingsEnableStateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePackageSettingsEnableStateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePackageSettingsEnableStateRequest>() {
           @Override
           public void write(JsonWriter out, UpdatePackageSettingsEnableStateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePackageSettingsEnableStateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePackageSettingsEnableStateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePackageSettingsEnableStateRequest
  * @throws IOException if the JSON string is invalid with respect to UpdatePackageSettingsEnableStateRequest
  */
  public static UpdatePackageSettingsEnableStateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePackageSettingsEnableStateRequest.class);
  }

 /**
  * Convert an instance of UpdatePackageSettingsEnableStateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

