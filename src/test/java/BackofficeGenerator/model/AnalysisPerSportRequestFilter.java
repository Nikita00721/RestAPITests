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
 * AnalysisPerSportRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AnalysisPerSportRequestFilter {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_TIME_FRAME = "TimeFrame";
  @SerializedName(SERIALIZED_NAME_TIME_FRAME)
  private ProfitabilityTimeframes timeFrame;

  public static final String SERIALIZED_NAME_PERIOD_ID = "PeriodId";
  @SerializedName(SERIALIZED_NAME_PERIOD_ID)
  private Long periodId;

  public static final String SERIALIZED_NAME_BET_PRODUCT_ID = "BetProductId";
  @SerializedName(SERIALIZED_NAME_BET_PRODUCT_ID)
  private ProfitabilityBetProducts betProductId;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_IS_BET_BUILDER = "IsBetBuilder";
  @SerializedName(SERIALIZED_NAME_IS_BET_BUILDER)
  private Boolean isBetBuilder;

  public static final String SERIALIZED_NAME_IS_BASE_CURRENCY = "IsBaseCurrency";
  @SerializedName(SERIALIZED_NAME_IS_BASE_CURRENCY)
  private Boolean isBaseCurrency;

  public static final String SERIALIZED_NAME_BET_TYPE_ID = "BetTypeId";
  @SerializedName(SERIALIZED_NAME_BET_TYPE_ID)
  private ProfitabilityBetTypes betTypeId;

  public static final String SERIALIZED_NAME_VOLUME_FROM = "VolumeFrom";
  @SerializedName(SERIALIZED_NAME_VOLUME_FROM)
  private Double volumeFrom;

  public static final String SERIALIZED_NAME_VOLUME_TO = "VolumeTo";
  @SerializedName(SERIALIZED_NAME_VOLUME_TO)
  private Double volumeTo;

  public static final String SERIALIZED_NAME_RETURNED_FROM = "ReturnedFrom";
  @SerializedName(SERIALIZED_NAME_RETURNED_FROM)
  private Double returnedFrom;

  public static final String SERIALIZED_NAME_RETURNED_TO = "ReturnedTo";
  @SerializedName(SERIALIZED_NAME_RETURNED_TO)
  private Double returnedTo;

  public static final String SERIALIZED_NAME_GG_R_FROM = "GGRFrom";
  @SerializedName(SERIALIZED_NAME_GG_R_FROM)
  private Double ggRFrom;

  public static final String SERIALIZED_NAME_GG_R_TO = "GGRTo";
  @SerializedName(SERIALIZED_NAME_GG_R_TO)
  private Double ggRTo;

  public static final String SERIALIZED_NAME_MARGIN_FROM = "MarginFrom";
  @SerializedName(SERIALIZED_NAME_MARGIN_FROM)
  private Double marginFrom;

  public static final String SERIALIZED_NAME_MARGIN_TO = "MarginTo";
  @SerializedName(SERIALIZED_NAME_MARGIN_TO)
  private Double marginTo;

  public static final String SERIALIZED_NAME_VOLUME_PERCENT_FROM = "VolumePercentFrom";
  @SerializedName(SERIALIZED_NAME_VOLUME_PERCENT_FROM)
  private Double volumePercentFrom;

  public static final String SERIALIZED_NAME_VOLUME_PERCENT_TO = "VolumePercentTo";
  @SerializedName(SERIALIZED_NAME_VOLUME_PERCENT_TO)
  private Double volumePercentTo;

  public static final String SERIALIZED_NAME_BETS_COUNT_FROM = "BetsCountFrom";
  @SerializedName(SERIALIZED_NAME_BETS_COUNT_FROM)
  private Long betsCountFrom;

  public static final String SERIALIZED_NAME_BETS_COUNT_TO = "BetsCountTo";
  @SerializedName(SERIALIZED_NAME_BETS_COUNT_TO)
  private Long betsCountTo;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public AnalysisPerSportRequestFilter() {
  }

  public AnalysisPerSportRequestFilter brandId(Integer brandId) {
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


  public AnalysisPerSportRequestFilter timeFrame(ProfitabilityTimeframes timeFrame) {
    this.timeFrame = timeFrame;
    return this;
  }

   /**
   * Get timeFrame
   * @return timeFrame
  **/
  @javax.annotation.Nullable
  public ProfitabilityTimeframes getTimeFrame() {
    return timeFrame;
  }

  public void setTimeFrame(ProfitabilityTimeframes timeFrame) {
    this.timeFrame = timeFrame;
  }


  public AnalysisPerSportRequestFilter periodId(Long periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * Get periodId
   * @return periodId
  **/
  @javax.annotation.Nullable
  public Long getPeriodId() {
    return periodId;
  }

  public void setPeriodId(Long periodId) {
    this.periodId = periodId;
  }


  public AnalysisPerSportRequestFilter betProductId(ProfitabilityBetProducts betProductId) {
    this.betProductId = betProductId;
    return this;
  }

   /**
   * Get betProductId
   * @return betProductId
  **/
  @javax.annotation.Nullable
  public ProfitabilityBetProducts getBetProductId() {
    return betProductId;
  }

  public void setBetProductId(ProfitabilityBetProducts betProductId) {
    this.betProductId = betProductId;
  }


  public AnalysisPerSportRequestFilter sportId(Integer sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nullable
  public Integer getSportId() {
    return sportId;
  }

  public void setSportId(Integer sportId) {
    this.sportId = sportId;
  }


  public AnalysisPerSportRequestFilter isBetBuilder(Boolean isBetBuilder) {
    this.isBetBuilder = isBetBuilder;
    return this;
  }

   /**
   * Get isBetBuilder
   * @return isBetBuilder
  **/
  @javax.annotation.Nullable
  public Boolean getIsBetBuilder() {
    return isBetBuilder;
  }

  public void setIsBetBuilder(Boolean isBetBuilder) {
    this.isBetBuilder = isBetBuilder;
  }


  public AnalysisPerSportRequestFilter isBaseCurrency(Boolean isBaseCurrency) {
    this.isBaseCurrency = isBaseCurrency;
    return this;
  }

   /**
   * Get isBaseCurrency
   * @return isBaseCurrency
  **/
  @javax.annotation.Nullable
  public Boolean getIsBaseCurrency() {
    return isBaseCurrency;
  }

  public void setIsBaseCurrency(Boolean isBaseCurrency) {
    this.isBaseCurrency = isBaseCurrency;
  }


  public AnalysisPerSportRequestFilter betTypeId(ProfitabilityBetTypes betTypeId) {
    this.betTypeId = betTypeId;
    return this;
  }

   /**
   * Get betTypeId
   * @return betTypeId
  **/
  @javax.annotation.Nullable
  public ProfitabilityBetTypes getBetTypeId() {
    return betTypeId;
  }

  public void setBetTypeId(ProfitabilityBetTypes betTypeId) {
    this.betTypeId = betTypeId;
  }


  public AnalysisPerSportRequestFilter volumeFrom(Double volumeFrom) {
    this.volumeFrom = volumeFrom;
    return this;
  }

   /**
   * Get volumeFrom
   * @return volumeFrom
  **/
  @javax.annotation.Nullable
  public Double getVolumeFrom() {
    return volumeFrom;
  }

  public void setVolumeFrom(Double volumeFrom) {
    this.volumeFrom = volumeFrom;
  }


  public AnalysisPerSportRequestFilter volumeTo(Double volumeTo) {
    this.volumeTo = volumeTo;
    return this;
  }

   /**
   * Get volumeTo
   * @return volumeTo
  **/
  @javax.annotation.Nullable
  public Double getVolumeTo() {
    return volumeTo;
  }

  public void setVolumeTo(Double volumeTo) {
    this.volumeTo = volumeTo;
  }


  public AnalysisPerSportRequestFilter returnedFrom(Double returnedFrom) {
    this.returnedFrom = returnedFrom;
    return this;
  }

   /**
   * Get returnedFrom
   * @return returnedFrom
  **/
  @javax.annotation.Nullable
  public Double getReturnedFrom() {
    return returnedFrom;
  }

  public void setReturnedFrom(Double returnedFrom) {
    this.returnedFrom = returnedFrom;
  }


  public AnalysisPerSportRequestFilter returnedTo(Double returnedTo) {
    this.returnedTo = returnedTo;
    return this;
  }

   /**
   * Get returnedTo
   * @return returnedTo
  **/
  @javax.annotation.Nullable
  public Double getReturnedTo() {
    return returnedTo;
  }

  public void setReturnedTo(Double returnedTo) {
    this.returnedTo = returnedTo;
  }


  public AnalysisPerSportRequestFilter ggRFrom(Double ggRFrom) {
    this.ggRFrom = ggRFrom;
    return this;
  }

   /**
   * Get ggRFrom
   * @return ggRFrom
  **/
  @javax.annotation.Nullable
  public Double getGgRFrom() {
    return ggRFrom;
  }

  public void setGgRFrom(Double ggRFrom) {
    this.ggRFrom = ggRFrom;
  }


  public AnalysisPerSportRequestFilter ggRTo(Double ggRTo) {
    this.ggRTo = ggRTo;
    return this;
  }

   /**
   * Get ggRTo
   * @return ggRTo
  **/
  @javax.annotation.Nullable
  public Double getGgRTo() {
    return ggRTo;
  }

  public void setGgRTo(Double ggRTo) {
    this.ggRTo = ggRTo;
  }


  public AnalysisPerSportRequestFilter marginFrom(Double marginFrom) {
    this.marginFrom = marginFrom;
    return this;
  }

   /**
   * Get marginFrom
   * @return marginFrom
  **/
  @javax.annotation.Nullable
  public Double getMarginFrom() {
    return marginFrom;
  }

  public void setMarginFrom(Double marginFrom) {
    this.marginFrom = marginFrom;
  }


  public AnalysisPerSportRequestFilter marginTo(Double marginTo) {
    this.marginTo = marginTo;
    return this;
  }

   /**
   * Get marginTo
   * @return marginTo
  **/
  @javax.annotation.Nullable
  public Double getMarginTo() {
    return marginTo;
  }

  public void setMarginTo(Double marginTo) {
    this.marginTo = marginTo;
  }


  public AnalysisPerSportRequestFilter volumePercentFrom(Double volumePercentFrom) {
    this.volumePercentFrom = volumePercentFrom;
    return this;
  }

   /**
   * Get volumePercentFrom
   * @return volumePercentFrom
  **/
  @javax.annotation.Nullable
  public Double getVolumePercentFrom() {
    return volumePercentFrom;
  }

  public void setVolumePercentFrom(Double volumePercentFrom) {
    this.volumePercentFrom = volumePercentFrom;
  }


  public AnalysisPerSportRequestFilter volumePercentTo(Double volumePercentTo) {
    this.volumePercentTo = volumePercentTo;
    return this;
  }

   /**
   * Get volumePercentTo
   * @return volumePercentTo
  **/
  @javax.annotation.Nullable
  public Double getVolumePercentTo() {
    return volumePercentTo;
  }

  public void setVolumePercentTo(Double volumePercentTo) {
    this.volumePercentTo = volumePercentTo;
  }


  public AnalysisPerSportRequestFilter betsCountFrom(Long betsCountFrom) {
    this.betsCountFrom = betsCountFrom;
    return this;
  }

   /**
   * Get betsCountFrom
   * @return betsCountFrom
  **/
  @javax.annotation.Nullable
  public Long getBetsCountFrom() {
    return betsCountFrom;
  }

  public void setBetsCountFrom(Long betsCountFrom) {
    this.betsCountFrom = betsCountFrom;
  }


  public AnalysisPerSportRequestFilter betsCountTo(Long betsCountTo) {
    this.betsCountTo = betsCountTo;
    return this;
  }

   /**
   * Get betsCountTo
   * @return betsCountTo
  **/
  @javax.annotation.Nullable
  public Long getBetsCountTo() {
    return betsCountTo;
  }

  public void setBetsCountTo(Long betsCountTo) {
    this.betsCountTo = betsCountTo;
  }


  public AnalysisPerSportRequestFilter licenseId(Integer licenseId) {
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
    AnalysisPerSportRequestFilter analysisPerSportRequestFilter = (AnalysisPerSportRequestFilter) o;
    return Objects.equals(this.brandId, analysisPerSportRequestFilter.brandId) &&
        Objects.equals(this.timeFrame, analysisPerSportRequestFilter.timeFrame) &&
        Objects.equals(this.periodId, analysisPerSportRequestFilter.periodId) &&
        Objects.equals(this.betProductId, analysisPerSportRequestFilter.betProductId) &&
        Objects.equals(this.sportId, analysisPerSportRequestFilter.sportId) &&
        Objects.equals(this.isBetBuilder, analysisPerSportRequestFilter.isBetBuilder) &&
        Objects.equals(this.isBaseCurrency, analysisPerSportRequestFilter.isBaseCurrency) &&
        Objects.equals(this.betTypeId, analysisPerSportRequestFilter.betTypeId) &&
        Objects.equals(this.volumeFrom, analysisPerSportRequestFilter.volumeFrom) &&
        Objects.equals(this.volumeTo, analysisPerSportRequestFilter.volumeTo) &&
        Objects.equals(this.returnedFrom, analysisPerSportRequestFilter.returnedFrom) &&
        Objects.equals(this.returnedTo, analysisPerSportRequestFilter.returnedTo) &&
        Objects.equals(this.ggRFrom, analysisPerSportRequestFilter.ggRFrom) &&
        Objects.equals(this.ggRTo, analysisPerSportRequestFilter.ggRTo) &&
        Objects.equals(this.marginFrom, analysisPerSportRequestFilter.marginFrom) &&
        Objects.equals(this.marginTo, analysisPerSportRequestFilter.marginTo) &&
        Objects.equals(this.volumePercentFrom, analysisPerSportRequestFilter.volumePercentFrom) &&
        Objects.equals(this.volumePercentTo, analysisPerSportRequestFilter.volumePercentTo) &&
        Objects.equals(this.betsCountFrom, analysisPerSportRequestFilter.betsCountFrom) &&
        Objects.equals(this.betsCountTo, analysisPerSportRequestFilter.betsCountTo) &&
        Objects.equals(this.licenseId, analysisPerSportRequestFilter.licenseId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, timeFrame, periodId, betProductId, sportId, isBetBuilder, isBaseCurrency, betTypeId, volumeFrom, volumeTo, returnedFrom, returnedTo, ggRFrom, ggRTo, marginFrom, marginTo, volumePercentFrom, volumePercentTo, betsCountFrom, betsCountTo, licenseId);
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
    sb.append("class AnalysisPerSportRequestFilter {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    timeFrame: ").append(toIndentedString(timeFrame)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    betProductId: ").append(toIndentedString(betProductId)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    isBetBuilder: ").append(toIndentedString(isBetBuilder)).append("\n");
    sb.append("    isBaseCurrency: ").append(toIndentedString(isBaseCurrency)).append("\n");
    sb.append("    betTypeId: ").append(toIndentedString(betTypeId)).append("\n");
    sb.append("    volumeFrom: ").append(toIndentedString(volumeFrom)).append("\n");
    sb.append("    volumeTo: ").append(toIndentedString(volumeTo)).append("\n");
    sb.append("    returnedFrom: ").append(toIndentedString(returnedFrom)).append("\n");
    sb.append("    returnedTo: ").append(toIndentedString(returnedTo)).append("\n");
    sb.append("    ggRFrom: ").append(toIndentedString(ggRFrom)).append("\n");
    sb.append("    ggRTo: ").append(toIndentedString(ggRTo)).append("\n");
    sb.append("    marginFrom: ").append(toIndentedString(marginFrom)).append("\n");
    sb.append("    marginTo: ").append(toIndentedString(marginTo)).append("\n");
    sb.append("    volumePercentFrom: ").append(toIndentedString(volumePercentFrom)).append("\n");
    sb.append("    volumePercentTo: ").append(toIndentedString(volumePercentTo)).append("\n");
    sb.append("    betsCountFrom: ").append(toIndentedString(betsCountFrom)).append("\n");
    sb.append("    betsCountTo: ").append(toIndentedString(betsCountTo)).append("\n");
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
    openapiFields.add("BrandId");
    openapiFields.add("TimeFrame");
    openapiFields.add("PeriodId");
    openapiFields.add("BetProductId");
    openapiFields.add("SportId");
    openapiFields.add("IsBetBuilder");
    openapiFields.add("IsBaseCurrency");
    openapiFields.add("BetTypeId");
    openapiFields.add("VolumeFrom");
    openapiFields.add("VolumeTo");
    openapiFields.add("ReturnedFrom");
    openapiFields.add("ReturnedTo");
    openapiFields.add("GGRFrom");
    openapiFields.add("GGRTo");
    openapiFields.add("MarginFrom");
    openapiFields.add("MarginTo");
    openapiFields.add("VolumePercentFrom");
    openapiFields.add("VolumePercentTo");
    openapiFields.add("BetsCountFrom");
    openapiFields.add("BetsCountTo");
    openapiFields.add("LicenseId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AnalysisPerSportRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnalysisPerSportRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalysisPerSportRequestFilter is not found in the empty JSON string", AnalysisPerSportRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnalysisPerSportRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnalysisPerSportRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TimeFrame`
      if (jsonObj.get("TimeFrame") != null && !jsonObj.get("TimeFrame").isJsonNull()) {
        ProfitabilityTimeframes.validateJsonElement(jsonObj.get("TimeFrame"));
      }
      // validate the optional field `BetProductId`
      if (jsonObj.get("BetProductId") != null && !jsonObj.get("BetProductId").isJsonNull()) {
        ProfitabilityBetProducts.validateJsonElement(jsonObj.get("BetProductId"));
      }
      // validate the optional field `BetTypeId`
      if (jsonObj.get("BetTypeId") != null && !jsonObj.get("BetTypeId").isJsonNull()) {
        ProfitabilityBetTypes.validateJsonElement(jsonObj.get("BetTypeId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalysisPerSportRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalysisPerSportRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalysisPerSportRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalysisPerSportRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalysisPerSportRequestFilter>() {
           @Override
           public void write(JsonWriter out, AnalysisPerSportRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalysisPerSportRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalysisPerSportRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalysisPerSportRequestFilter
  * @throws IOException if the JSON string is invalid with respect to AnalysisPerSportRequestFilter
  */
  public static AnalysisPerSportRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalysisPerSportRequestFilter.class);
  }

 /**
  * Convert an instance of AnalysisPerSportRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

