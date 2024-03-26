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
 * AffiliateWithHierarchyItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AffiliateWithHierarchyItem {
  public static final String SERIALIZED_NAME_AFFILIATE_NAME = "AffiliateName";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_NAME)
  private String affiliateName;

  public static final String SERIALIZED_NAME_LOGIN_EXT_ID = "LoginExtId";
  @SerializedName(SERIALIZED_NAME_LOGIN_EXT_ID)
  private String loginExtId;

  public static final String SERIALIZED_NAME_PARENT_AFFILIATE_ID = "ParentAffiliateId";
  @SerializedName(SERIALIZED_NAME_PARENT_AFFILIATE_ID)
  private Integer parentAffiliateId;

  public static final String SERIALIZED_NAME_CREATE_DATE = "CreateDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public static final String SERIALIZED_NAME_LICENSE_NAME = "LicenseName";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_BRAND_NAME = "BrandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_PRINT_IMG = "PrintImg";
  @SerializedName(SERIALIZED_NAME_PRINT_IMG)
  private String printImg;

  public static final String SERIALIZED_NAME_PRINT_SLIP_HEADER = "PrintSlipHeader";
  @SerializedName(SERIALIZED_NAME_PRINT_SLIP_HEADER)
  private String printSlipHeader;

  public static final String SERIALIZED_NAME_PRINT_SLIP_FOOTER = "PrintSlipFooter";
  @SerializedName(SERIALIZED_NAME_PRINT_SLIP_FOOTER)
  private String printSlipFooter;

  public static final String SERIALIZED_NAME_PLATFORM_QR_CODE = "PlatformQrCode";
  @SerializedName(SERIALIZED_NAME_PLATFORM_QR_CODE)
  private String platformQrCode;

  public static final String SERIALIZED_NAME_PLAYER_LIMIT_GROUP_ID = "PlayerLimitGroupId";
  @SerializedName(SERIALIZED_NAME_PLAYER_LIMIT_GROUP_ID)
  private Integer playerLimitGroupId;

  public static final String SERIALIZED_NAME_PLAYER_LIMIT_GROUP_NAME = "PlayerLimitGroupName";
  @SerializedName(SERIALIZED_NAME_PLAYER_LIMIT_GROUP_NAME)
  private String playerLimitGroupName;

  public static final String SERIALIZED_NAME_AFFILIATE_ID = "AffiliateId";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_ID)
  private Integer affiliateId;

  public AffiliateWithHierarchyItem() {
  }

  public AffiliateWithHierarchyItem affiliateName(String affiliateName) {
    this.affiliateName = affiliateName;
    return this;
  }

   /**
   * Get affiliateName
   * @return affiliateName
  **/
  @javax.annotation.Nullable
  public String getAffiliateName() {
    return affiliateName;
  }

  public void setAffiliateName(String affiliateName) {
    this.affiliateName = affiliateName;
  }


  public AffiliateWithHierarchyItem loginExtId(String loginExtId) {
    this.loginExtId = loginExtId;
    return this;
  }

   /**
   * Get loginExtId
   * @return loginExtId
  **/
  @javax.annotation.Nullable
  public String getLoginExtId() {
    return loginExtId;
  }

  public void setLoginExtId(String loginExtId) {
    this.loginExtId = loginExtId;
  }


  public AffiliateWithHierarchyItem parentAffiliateId(Integer parentAffiliateId) {
    this.parentAffiliateId = parentAffiliateId;
    return this;
  }

   /**
   * Get parentAffiliateId
   * @return parentAffiliateId
  **/
  @javax.annotation.Nullable
  public Integer getParentAffiliateId() {
    return parentAffiliateId;
  }

  public void setParentAffiliateId(Integer parentAffiliateId) {
    this.parentAffiliateId = parentAffiliateId;
  }


  public AffiliateWithHierarchyItem createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public AffiliateWithHierarchyItem licenseId(Integer licenseId) {
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


  public AffiliateWithHierarchyItem licenseName(String licenseName) {
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


  public AffiliateWithHierarchyItem brandId(Integer brandId) {
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


  public AffiliateWithHierarchyItem brandName(String brandName) {
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


  public AffiliateWithHierarchyItem printImg(String printImg) {
    this.printImg = printImg;
    return this;
  }

   /**
   * Get printImg
   * @return printImg
  **/
  @javax.annotation.Nullable
  public String getPrintImg() {
    return printImg;
  }

  public void setPrintImg(String printImg) {
    this.printImg = printImg;
  }


  public AffiliateWithHierarchyItem printSlipHeader(String printSlipHeader) {
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


  public AffiliateWithHierarchyItem printSlipFooter(String printSlipFooter) {
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


  public AffiliateWithHierarchyItem platformQrCode(String platformQrCode) {
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


  public AffiliateWithHierarchyItem playerLimitGroupId(Integer playerLimitGroupId) {
    this.playerLimitGroupId = playerLimitGroupId;
    return this;
  }

   /**
   * Get playerLimitGroupId
   * @return playerLimitGroupId
  **/
  @javax.annotation.Nullable
  public Integer getPlayerLimitGroupId() {
    return playerLimitGroupId;
  }

  public void setPlayerLimitGroupId(Integer playerLimitGroupId) {
    this.playerLimitGroupId = playerLimitGroupId;
  }


  public AffiliateWithHierarchyItem playerLimitGroupName(String playerLimitGroupName) {
    this.playerLimitGroupName = playerLimitGroupName;
    return this;
  }

   /**
   * Get playerLimitGroupName
   * @return playerLimitGroupName
  **/
  @javax.annotation.Nullable
  public String getPlayerLimitGroupName() {
    return playerLimitGroupName;
  }

  public void setPlayerLimitGroupName(String playerLimitGroupName) {
    this.playerLimitGroupName = playerLimitGroupName;
  }


  public AffiliateWithHierarchyItem affiliateId(Integer affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

   /**
   * Get affiliateId
   * @return affiliateId
  **/
  @javax.annotation.Nullable
  public Integer getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(Integer affiliateId) {
    this.affiliateId = affiliateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffiliateWithHierarchyItem affiliateWithHierarchyItem = (AffiliateWithHierarchyItem) o;
    return Objects.equals(this.affiliateName, affiliateWithHierarchyItem.affiliateName) &&
        Objects.equals(this.loginExtId, affiliateWithHierarchyItem.loginExtId) &&
        Objects.equals(this.parentAffiliateId, affiliateWithHierarchyItem.parentAffiliateId) &&
        Objects.equals(this.createDate, affiliateWithHierarchyItem.createDate) &&
        Objects.equals(this.licenseId, affiliateWithHierarchyItem.licenseId) &&
        Objects.equals(this.licenseName, affiliateWithHierarchyItem.licenseName) &&
        Objects.equals(this.brandId, affiliateWithHierarchyItem.brandId) &&
        Objects.equals(this.brandName, affiliateWithHierarchyItem.brandName) &&
        Objects.equals(this.printImg, affiliateWithHierarchyItem.printImg) &&
        Objects.equals(this.printSlipHeader, affiliateWithHierarchyItem.printSlipHeader) &&
        Objects.equals(this.printSlipFooter, affiliateWithHierarchyItem.printSlipFooter) &&
        Objects.equals(this.platformQrCode, affiliateWithHierarchyItem.platformQrCode) &&
        Objects.equals(this.playerLimitGroupId, affiliateWithHierarchyItem.playerLimitGroupId) &&
        Objects.equals(this.playerLimitGroupName, affiliateWithHierarchyItem.playerLimitGroupName) &&
        Objects.equals(this.affiliateId, affiliateWithHierarchyItem.affiliateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateName, loginExtId, parentAffiliateId, createDate, licenseId, licenseName, brandId, brandName, printImg, printSlipHeader, printSlipFooter, platformQrCode, playerLimitGroupId, playerLimitGroupName, affiliateId);
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
    sb.append("class AffiliateWithHierarchyItem {\n");
    sb.append("    affiliateName: ").append(toIndentedString(affiliateName)).append("\n");
    sb.append("    loginExtId: ").append(toIndentedString(loginExtId)).append("\n");
    sb.append("    parentAffiliateId: ").append(toIndentedString(parentAffiliateId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    printImg: ").append(toIndentedString(printImg)).append("\n");
    sb.append("    printSlipHeader: ").append(toIndentedString(printSlipHeader)).append("\n");
    sb.append("    printSlipFooter: ").append(toIndentedString(printSlipFooter)).append("\n");
    sb.append("    platformQrCode: ").append(toIndentedString(platformQrCode)).append("\n");
    sb.append("    playerLimitGroupId: ").append(toIndentedString(playerLimitGroupId)).append("\n");
    sb.append("    playerLimitGroupName: ").append(toIndentedString(playerLimitGroupName)).append("\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
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
    openapiFields.add("AffiliateName");
    openapiFields.add("LoginExtId");
    openapiFields.add("ParentAffiliateId");
    openapiFields.add("CreateDate");
    openapiFields.add("LicenseId");
    openapiFields.add("LicenseName");
    openapiFields.add("BrandId");
    openapiFields.add("BrandName");
    openapiFields.add("PrintImg");
    openapiFields.add("PrintSlipHeader");
    openapiFields.add("PrintSlipFooter");
    openapiFields.add("PlatformQrCode");
    openapiFields.add("PlayerLimitGroupId");
    openapiFields.add("PlayerLimitGroupName");
    openapiFields.add("AffiliateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AffiliateWithHierarchyItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AffiliateWithHierarchyItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AffiliateWithHierarchyItem is not found in the empty JSON string", AffiliateWithHierarchyItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AffiliateWithHierarchyItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AffiliateWithHierarchyItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("AffiliateName") != null && !jsonObj.get("AffiliateName").isJsonNull()) && !jsonObj.get("AffiliateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AffiliateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AffiliateName").toString()));
      }
      if ((jsonObj.get("LoginExtId") != null && !jsonObj.get("LoginExtId").isJsonNull()) && !jsonObj.get("LoginExtId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginExtId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginExtId").toString()));
      }
      if ((jsonObj.get("LicenseName") != null && !jsonObj.get("LicenseName").isJsonNull()) && !jsonObj.get("LicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LicenseName").toString()));
      }
      if ((jsonObj.get("BrandName") != null && !jsonObj.get("BrandName").isJsonNull()) && !jsonObj.get("BrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandName").toString()));
      }
      if ((jsonObj.get("PrintImg") != null && !jsonObj.get("PrintImg").isJsonNull()) && !jsonObj.get("PrintImg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrintImg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrintImg").toString()));
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
      if ((jsonObj.get("PlayerLimitGroupName") != null && !jsonObj.get("PlayerLimitGroupName").isJsonNull()) && !jsonObj.get("PlayerLimitGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerLimitGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerLimitGroupName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AffiliateWithHierarchyItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AffiliateWithHierarchyItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AffiliateWithHierarchyItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AffiliateWithHierarchyItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AffiliateWithHierarchyItem>() {
           @Override
           public void write(JsonWriter out, AffiliateWithHierarchyItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AffiliateWithHierarchyItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AffiliateWithHierarchyItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AffiliateWithHierarchyItem
  * @throws IOException if the JSON string is invalid with respect to AffiliateWithHierarchyItem
  */
  public static AffiliateWithHierarchyItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AffiliateWithHierarchyItem.class);
  }

 /**
  * Convert an instance of AffiliateWithHierarchyItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

