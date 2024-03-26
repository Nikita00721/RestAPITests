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
 * CreateBrandRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CreateBrandRequest {
  public static final String SERIALIZED_NAME_EXT_WALLET_SETTINGS_ID = "ExtWalletSettingsId";
  @SerializedName(SERIALIZED_NAME_EXT_WALLET_SETTINGS_ID)
  private Integer extWalletSettingsId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXT_ID = "ExtId";
  @SerializedName(SERIALIZED_NAME_EXT_ID)
  private String extId;

  public static final String SERIALIZED_NAME_PRINT_SLIP = "PrintSlip";
  @SerializedName(SERIALIZED_NAME_PRINT_SLIP)
  private String printSlip;

  public static final String SERIALIZED_NAME_PRINT_SLIP_HEADER = "PrintSlipHeader";
  @SerializedName(SERIALIZED_NAME_PRINT_SLIP_HEADER)
  private String printSlipHeader;

  public static final String SERIALIZED_NAME_PRINT_SLIP_FOOTER = "PrintSlipFooter";
  @SerializedName(SERIALIZED_NAME_PRINT_SLIP_FOOTER)
  private String printSlipFooter;

  public static final String SERIALIZED_NAME_PLATFORM_QR_CODE = "PlatformQrCode";
  @SerializedName(SERIALIZED_NAME_PLATFORM_QR_CODE)
  private String platformQrCode;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public CreateBrandRequest() {
  }

  public CreateBrandRequest extWalletSettingsId(Integer extWalletSettingsId) {
    this.extWalletSettingsId = extWalletSettingsId;
    return this;
  }

   /**
   * Get extWalletSettingsId
   * @return extWalletSettingsId
  **/
  @javax.annotation.Nullable
  public Integer getExtWalletSettingsId() {
    return extWalletSettingsId;
  }

  public void setExtWalletSettingsId(Integer extWalletSettingsId) {
    this.extWalletSettingsId = extWalletSettingsId;
  }


  public CreateBrandRequest name(String name) {
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


  public CreateBrandRequest extId(String extId) {
    this.extId = extId;
    return this;
  }

   /**
   * Get extId
   * @return extId
  **/
  @javax.annotation.Nullable
  public String getExtId() {
    return extId;
  }

  public void setExtId(String extId) {
    this.extId = extId;
  }


  public CreateBrandRequest printSlip(String printSlip) {
    this.printSlip = printSlip;
    return this;
  }

   /**
   * Get printSlip
   * @return printSlip
  **/
  @javax.annotation.Nullable
  public String getPrintSlip() {
    return printSlip;
  }

  public void setPrintSlip(String printSlip) {
    this.printSlip = printSlip;
  }


  public CreateBrandRequest printSlipHeader(String printSlipHeader) {
    this.printSlipHeader = printSlipHeader;
    return this;
  }

   /**
   * Get printSlipHeader
   * @return printSlipHeader
  **/
  @javax.annotation.Nullable
  public String getPrintSlipHeader() {
    return printSlipHeader;
  }

  public void setPrintSlipHeader(String printSlipHeader) {
    this.printSlipHeader = printSlipHeader;
  }


  public CreateBrandRequest printSlipFooter(String printSlipFooter) {
    this.printSlipFooter = printSlipFooter;
    return this;
  }

   /**
   * Get printSlipFooter
   * @return printSlipFooter
  **/
  @javax.annotation.Nullable
  public String getPrintSlipFooter() {
    return printSlipFooter;
  }

  public void setPrintSlipFooter(String printSlipFooter) {
    this.printSlipFooter = printSlipFooter;
  }


  public CreateBrandRequest platformQrCode(String platformQrCode) {
    this.platformQrCode = platformQrCode;
    return this;
  }

   /**
   * Get platformQrCode
   * @return platformQrCode
  **/
  @javax.annotation.Nullable
  public String getPlatformQrCode() {
    return platformQrCode;
  }

  public void setPlatformQrCode(String platformQrCode) {
    this.platformQrCode = platformQrCode;
  }


  public CreateBrandRequest licenseId(Integer licenseId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBrandRequest createBrandRequest = (CreateBrandRequest) o;
    return Objects.equals(this.extWalletSettingsId, createBrandRequest.extWalletSettingsId) &&
        Objects.equals(this.name, createBrandRequest.name) &&
        Objects.equals(this.extId, createBrandRequest.extId) &&
        Objects.equals(this.printSlip, createBrandRequest.printSlip) &&
        Objects.equals(this.printSlipHeader, createBrandRequest.printSlipHeader) &&
        Objects.equals(this.printSlipFooter, createBrandRequest.printSlipFooter) &&
        Objects.equals(this.platformQrCode, createBrandRequest.platformQrCode) &&
        Objects.equals(this.licenseId, createBrandRequest.licenseId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(extWalletSettingsId, name, extId, printSlip, printSlipHeader, printSlipFooter, platformQrCode, licenseId);
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
    sb.append("class CreateBrandRequest {\n");
    sb.append("    extWalletSettingsId: ").append(toIndentedString(extWalletSettingsId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
    sb.append("    printSlip: ").append(toIndentedString(printSlip)).append("\n");
    sb.append("    printSlipHeader: ").append(toIndentedString(printSlipHeader)).append("\n");
    sb.append("    printSlipFooter: ").append(toIndentedString(printSlipFooter)).append("\n");
    sb.append("    platformQrCode: ").append(toIndentedString(platformQrCode)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
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
    openapiFields.add("ExtWalletSettingsId");
    openapiFields.add("Name");
    openapiFields.add("ExtId");
    openapiFields.add("PrintSlip");
    openapiFields.add("PrintSlipHeader");
    openapiFields.add("PrintSlipFooter");
    openapiFields.add("PlatformQrCode");
    openapiFields.add("LicenseId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBrandRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBrandRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBrandRequest is not found in the empty JSON string", CreateBrandRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBrandRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBrandRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("ExtId") != null && !jsonObj.get("ExtId").isJsonNull()) && !jsonObj.get("ExtId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtId").toString()));
      }
      if ((jsonObj.get("PrintSlip") != null && !jsonObj.get("PrintSlip").isJsonNull()) && !jsonObj.get("PrintSlip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrintSlip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrintSlip").toString()));
      }
      if ((jsonObj.get("PrintSlipHeader") != null && !jsonObj.get("PrintSlipHeader").isJsonNull()) && !jsonObj.get("PrintSlipHeader").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrintSlipHeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrintSlipHeader").toString()));
      }
      if ((jsonObj.get("PrintSlipFooter") != null && !jsonObj.get("PrintSlipFooter").isJsonNull()) && !jsonObj.get("PrintSlipFooter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrintSlipFooter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrintSlipFooter").toString()));
      }
      if ((jsonObj.get("PlatformQrCode") != null && !jsonObj.get("PlatformQrCode").isJsonNull()) && !jsonObj.get("PlatformQrCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlatformQrCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlatformQrCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBrandRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBrandRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBrandRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBrandRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBrandRequest>() {
           @Override
           public void write(JsonWriter out, CreateBrandRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBrandRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBrandRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBrandRequest
  * @throws IOException if the JSON string is invalid with respect to CreateBrandRequest
  */
  public static CreateBrandRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBrandRequest.class);
  }

 /**
  * Convert an instance of CreateBrandRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

