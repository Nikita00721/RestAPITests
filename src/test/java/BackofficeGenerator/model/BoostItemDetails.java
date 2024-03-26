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
 * BoostItemDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostItemDetails {
  public static final String SERIALIZED_NAME_OFFER_START_DATE_TIME = "OfferStartDateTime";
  @SerializedName(SERIALIZED_NAME_OFFER_START_DATE_TIME)
  private OffsetDateTime offerStartDateTime;

  public static final String SERIALIZED_NAME_OFFER_END_DATE_TIME = "OfferEndDateTime";
  @SerializedName(SERIALIZED_NAME_OFFER_END_DATE_TIME)
  private OffsetDateTime offerEndDateTime;

  public static final String SERIALIZED_NAME_OFFER_START_TIME = "OfferStartTime";
  @SerializedName(SERIALIZED_NAME_OFFER_START_TIME)
  private Integer offerStartTime;

  public static final String SERIALIZED_NAME_OFFER_END_TIME = "OfferEndTime";
  @SerializedName(SERIALIZED_NAME_OFFER_END_TIME)
  private Integer offerEndTime;

  public static final String SERIALIZED_NAME_LIMIT_TYPE = "LimitType";
  @SerializedName(SERIALIZED_NAME_LIMIT_TYPE)
  private BoostLimitType limitType;

  public static final String SERIALIZED_NAME_STAKE_LIMIT_FACTOR = "StakeLimitFactor";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT_FACTOR)
  private Double stakeLimitFactor;

  public static final String SERIALIZED_NAME_WIN_LIMIT_FACTOR = "WinLimitFactor";
  @SerializedName(SERIALIZED_NAME_WIN_LIMIT_FACTOR)
  private Double winLimitFactor;

  public static final String SERIALIZED_NAME_BOOST_LIMIT_ID = "BoostLimitId";
  @SerializedName(SERIALIZED_NAME_BOOST_LIMIT_ID)
  private Integer boostLimitId;

  public static final String SERIALIZED_NAME_IS_MANUAL = "IsManual";
  @SerializedName(SERIALIZED_NAME_IS_MANUAL)
  private Boolean isManual;

  public static final String SERIALIZED_NAME_IS_LIMITED_TIME = "IsLimitedTime";
  @SerializedName(SERIALIZED_NAME_IS_LIMITED_TIME)
  private Boolean isLimitedTime;

  public static final String SERIALIZED_NAME_BOOST_PROPS = "BoostProps";
  @SerializedName(SERIALIZED_NAME_BOOST_PROPS)
  private BoostItemProps boostProps;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_BOOST_ITEM_ID = "BoostItemId";
  @SerializedName(SERIALIZED_NAME_BOOST_ITEM_ID)
  private Integer boostItemId;

  public BoostItemDetails() {
  }

  public BoostItemDetails offerStartDateTime(OffsetDateTime offerStartDateTime) {
    this.offerStartDateTime = offerStartDateTime;
    return this;
  }

   /**
   * Get offerStartDateTime
   * @return offerStartDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOfferStartDateTime() {
    return offerStartDateTime;
  }

  public void setOfferStartDateTime(OffsetDateTime offerStartDateTime) {
    this.offerStartDateTime = offerStartDateTime;
  }


  public BoostItemDetails offerEndDateTime(OffsetDateTime offerEndDateTime) {
    this.offerEndDateTime = offerEndDateTime;
    return this;
  }

   /**
   * Get offerEndDateTime
   * @return offerEndDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOfferEndDateTime() {
    return offerEndDateTime;
  }

  public void setOfferEndDateTime(OffsetDateTime offerEndDateTime) {
    this.offerEndDateTime = offerEndDateTime;
  }


  public BoostItemDetails offerStartTime(Integer offerStartTime) {
    this.offerStartTime = offerStartTime;
    return this;
  }

   /**
   * Get offerStartTime
   * @return offerStartTime
  **/
  @javax.annotation.Nullable
  public Integer getOfferStartTime() {
    return offerStartTime;
  }

  public void setOfferStartTime(Integer offerStartTime) {
    this.offerStartTime = offerStartTime;
  }


  public BoostItemDetails offerEndTime(Integer offerEndTime) {
    this.offerEndTime = offerEndTime;
    return this;
  }

   /**
   * Get offerEndTime
   * @return offerEndTime
  **/
  @javax.annotation.Nullable
  public Integer getOfferEndTime() {
    return offerEndTime;
  }

  public void setOfferEndTime(Integer offerEndTime) {
    this.offerEndTime = offerEndTime;
  }


  public BoostItemDetails limitType(BoostLimitType limitType) {
    this.limitType = limitType;
    return this;
  }

   /**
   * Get limitType
   * @return limitType
  **/
  @javax.annotation.Nullable
  public BoostLimitType getLimitType() {
    return limitType;
  }

  public void setLimitType(BoostLimitType limitType) {
    this.limitType = limitType;
  }


  public BoostItemDetails stakeLimitFactor(Double stakeLimitFactor) {
    this.stakeLimitFactor = stakeLimitFactor;
    return this;
  }

   /**
   * Get stakeLimitFactor
   * @return stakeLimitFactor
  **/
  @javax.annotation.Nullable
  public Double getStakeLimitFactor() {
    return stakeLimitFactor;
  }

  public void setStakeLimitFactor(Double stakeLimitFactor) {
    this.stakeLimitFactor = stakeLimitFactor;
  }


  public BoostItemDetails winLimitFactor(Double winLimitFactor) {
    this.winLimitFactor = winLimitFactor;
    return this;
  }

   /**
   * Get winLimitFactor
   * @return winLimitFactor
  **/
  @javax.annotation.Nullable
  public Double getWinLimitFactor() {
    return winLimitFactor;
  }

  public void setWinLimitFactor(Double winLimitFactor) {
    this.winLimitFactor = winLimitFactor;
  }


  public BoostItemDetails boostLimitId(Integer boostLimitId) {
    this.boostLimitId = boostLimitId;
    return this;
  }

   /**
   * Get boostLimitId
   * @return boostLimitId
  **/
  @javax.annotation.Nullable
  public Integer getBoostLimitId() {
    return boostLimitId;
  }

  public void setBoostLimitId(Integer boostLimitId) {
    this.boostLimitId = boostLimitId;
  }


  public BoostItemDetails isManual(Boolean isManual) {
    this.isManual = isManual;
    return this;
  }

   /**
   * Get isManual
   * @return isManual
  **/
  @javax.annotation.Nullable
  public Boolean getIsManual() {
    return isManual;
  }

  public void setIsManual(Boolean isManual) {
    this.isManual = isManual;
  }


  public BoostItemDetails isLimitedTime(Boolean isLimitedTime) {
    this.isLimitedTime = isLimitedTime;
    return this;
  }

   /**
   * Get isLimitedTime
   * @return isLimitedTime
  **/
  @javax.annotation.Nullable
  public Boolean getIsLimitedTime() {
    return isLimitedTime;
  }

  public void setIsLimitedTime(Boolean isLimitedTime) {
    this.isLimitedTime = isLimitedTime;
  }


  public BoostItemDetails boostProps(BoostItemProps boostProps) {
    this.boostProps = boostProps;
    return this;
  }

   /**
   * Get boostProps
   * @return boostProps
  **/
  @javax.annotation.Nullable
  public BoostItemProps getBoostProps() {
    return boostProps;
  }

  public void setBoostProps(BoostItemProps boostProps) {
    this.boostProps = boostProps;
  }


  public BoostItemDetails isEnabled(Boolean isEnabled) {
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


  public BoostItemDetails boostItemId(Integer boostItemId) {
    this.boostItemId = boostItemId;
    return this;
  }

   /**
   * Get boostItemId
   * @return boostItemId
  **/
  @javax.annotation.Nullable
  public Integer getBoostItemId() {
    return boostItemId;
  }

  public void setBoostItemId(Integer boostItemId) {
    this.boostItemId = boostItemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostItemDetails boostItemDetails = (BoostItemDetails) o;
    return Objects.equals(this.offerStartDateTime, boostItemDetails.offerStartDateTime) &&
        Objects.equals(this.offerEndDateTime, boostItemDetails.offerEndDateTime) &&
        Objects.equals(this.offerStartTime, boostItemDetails.offerStartTime) &&
        Objects.equals(this.offerEndTime, boostItemDetails.offerEndTime) &&
        Objects.equals(this.limitType, boostItemDetails.limitType) &&
        Objects.equals(this.stakeLimitFactor, boostItemDetails.stakeLimitFactor) &&
        Objects.equals(this.winLimitFactor, boostItemDetails.winLimitFactor) &&
        Objects.equals(this.boostLimitId, boostItemDetails.boostLimitId) &&
        Objects.equals(this.isManual, boostItemDetails.isManual) &&
        Objects.equals(this.isLimitedTime, boostItemDetails.isLimitedTime) &&
        Objects.equals(this.boostProps, boostItemDetails.boostProps) &&
        Objects.equals(this.isEnabled, boostItemDetails.isEnabled) &&
        Objects.equals(this.boostItemId, boostItemDetails.boostItemId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerStartDateTime, offerEndDateTime, offerStartTime, offerEndTime, limitType, stakeLimitFactor, winLimitFactor, boostLimitId, isManual, isLimitedTime, boostProps, isEnabled, boostItemId);
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
    sb.append("class BoostItemDetails {\n");
    sb.append("    offerStartDateTime: ").append(toIndentedString(offerStartDateTime)).append("\n");
    sb.append("    offerEndDateTime: ").append(toIndentedString(offerEndDateTime)).append("\n");
    sb.append("    offerStartTime: ").append(toIndentedString(offerStartTime)).append("\n");
    sb.append("    offerEndTime: ").append(toIndentedString(offerEndTime)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    stakeLimitFactor: ").append(toIndentedString(stakeLimitFactor)).append("\n");
    sb.append("    winLimitFactor: ").append(toIndentedString(winLimitFactor)).append("\n");
    sb.append("    boostLimitId: ").append(toIndentedString(boostLimitId)).append("\n");
    sb.append("    isManual: ").append(toIndentedString(isManual)).append("\n");
    sb.append("    isLimitedTime: ").append(toIndentedString(isLimitedTime)).append("\n");
    sb.append("    boostProps: ").append(toIndentedString(boostProps)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    boostItemId: ").append(toIndentedString(boostItemId)).append("\n");
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
    openapiFields.add("OfferStartDateTime");
    openapiFields.add("OfferEndDateTime");
    openapiFields.add("OfferStartTime");
    openapiFields.add("OfferEndTime");
    openapiFields.add("LimitType");
    openapiFields.add("StakeLimitFactor");
    openapiFields.add("WinLimitFactor");
    openapiFields.add("BoostLimitId");
    openapiFields.add("IsManual");
    openapiFields.add("IsLimitedTime");
    openapiFields.add("BoostProps");
    openapiFields.add("IsEnabled");
    openapiFields.add("BoostItemId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostItemDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostItemDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostItemDetails is not found in the empty JSON string", BoostItemDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostItemDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostItemDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LimitType`
      if (jsonObj.get("LimitType") != null && !jsonObj.get("LimitType").isJsonNull()) {
        BoostLimitType.validateJsonElement(jsonObj.get("LimitType"));
      }
      // validate the optional field `BoostProps`
      if (jsonObj.get("BoostProps") != null && !jsonObj.get("BoostProps").isJsonNull()) {
        BoostItemProps.validateJsonElement(jsonObj.get("BoostProps"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostItemDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostItemDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostItemDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostItemDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostItemDetails>() {
           @Override
           public void write(JsonWriter out, BoostItemDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostItemDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostItemDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostItemDetails
  * @throws IOException if the JSON string is invalid with respect to BoostItemDetails
  */
  public static BoostItemDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostItemDetails.class);
  }

 /**
  * Convert an instance of BoostItemDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

