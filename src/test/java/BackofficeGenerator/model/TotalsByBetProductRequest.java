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
 * TotalsByBetProductRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TotalsByBetProductRequest {
  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_PERIOD_ID = "PeriodId";
  @SerializedName(SERIALIZED_NAME_PERIOD_ID)
  private Long periodId;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_BET_TYPE_ID = "BetTypeId";
  @SerializedName(SERIALIZED_NAME_BET_TYPE_ID)
  private ProfitabilityBetTypes betTypeId;

  public static final String SERIALIZED_NAME_IS_BET_BUILDER = "IsBetBuilder";
  @SerializedName(SERIALIZED_NAME_IS_BET_BUILDER)
  private Boolean isBetBuilder;

  public static final String SERIALIZED_NAME_LICENSE_ID = "LicenseId";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private Integer licenseId;

  public TotalsByBetProductRequest() {
  }

  public TotalsByBetProductRequest brandId(Integer brandId) {
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


  public TotalsByBetProductRequest periodId(Long periodId) {
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


  public TotalsByBetProductRequest sportId(Integer sportId) {
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


  public TotalsByBetProductRequest categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public TotalsByBetProductRequest championshipId(Integer championshipId) {
    this.championshipId = championshipId;
    return this;
  }

   /**
   * Get championshipId
   * @return championshipId
  **/
  @javax.annotation.Nullable
  public Integer getChampionshipId() {
    return championshipId;
  }

  public void setChampionshipId(Integer championshipId) {
    this.championshipId = championshipId;
  }


  public TotalsByBetProductRequest eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public TotalsByBetProductRequest marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public TotalsByBetProductRequest betTypeId(ProfitabilityBetTypes betTypeId) {
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


  public TotalsByBetProductRequest isBetBuilder(Boolean isBetBuilder) {
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


  public TotalsByBetProductRequest licenseId(Integer licenseId) {
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
    TotalsByBetProductRequest totalsByBetProductRequest = (TotalsByBetProductRequest) o;
    return Objects.equals(this.brandId, totalsByBetProductRequest.brandId) &&
        Objects.equals(this.periodId, totalsByBetProductRequest.periodId) &&
        Objects.equals(this.sportId, totalsByBetProductRequest.sportId) &&
        Objects.equals(this.categoryId, totalsByBetProductRequest.categoryId) &&
        Objects.equals(this.championshipId, totalsByBetProductRequest.championshipId) &&
        Objects.equals(this.eventId, totalsByBetProductRequest.eventId) &&
        Objects.equals(this.marketTypeId, totalsByBetProductRequest.marketTypeId) &&
        Objects.equals(this.betTypeId, totalsByBetProductRequest.betTypeId) &&
        Objects.equals(this.isBetBuilder, totalsByBetProductRequest.isBetBuilder) &&
        Objects.equals(this.licenseId, totalsByBetProductRequest.licenseId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, periodId, sportId, categoryId, championshipId, eventId, marketTypeId, betTypeId, isBetBuilder, licenseId);
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
    sb.append("class TotalsByBetProductRequest {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    betTypeId: ").append(toIndentedString(betTypeId)).append("\n");
    sb.append("    isBetBuilder: ").append(toIndentedString(isBetBuilder)).append("\n");
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
    openapiFields.add("PeriodId");
    openapiFields.add("SportId");
    openapiFields.add("CategoryId");
    openapiFields.add("ChampionshipId");
    openapiFields.add("EventId");
    openapiFields.add("MarketTypeId");
    openapiFields.add("BetTypeId");
    openapiFields.add("IsBetBuilder");
    openapiFields.add("LicenseId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotalsByBetProductRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotalsByBetProductRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotalsByBetProductRequest is not found in the empty JSON string", TotalsByBetProductRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotalsByBetProductRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotalsByBetProductRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `BetTypeId`
      if (jsonObj.get("BetTypeId") != null && !jsonObj.get("BetTypeId").isJsonNull()) {
        ProfitabilityBetTypes.validateJsonElement(jsonObj.get("BetTypeId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotalsByBetProductRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotalsByBetProductRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotalsByBetProductRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotalsByBetProductRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TotalsByBetProductRequest>() {
           @Override
           public void write(JsonWriter out, TotalsByBetProductRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotalsByBetProductRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotalsByBetProductRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotalsByBetProductRequest
  * @throws IOException if the JSON string is invalid with respect to TotalsByBetProductRequest
  */
  public static TotalsByBetProductRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotalsByBetProductRequest.class);
  }

 /**
  * Convert an instance of TotalsByBetProductRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

