/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * OutrightEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class OutrightEvent {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMPETITOR_IDS = "CompetitorIds";
  @SerializedName(SERIALIZED_NAME_COMPETITOR_IDS)
  private List<Long> competitorIds;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_CAT_ID = "CatId";
  @SerializedName(SERIALIZED_NAME_CAT_ID)
  private Integer catId;

  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Long champId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EventStatus status;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MARKET_IDS = "MarketIds";
  @SerializedName(SERIALIZED_NAME_MARKET_IDS)
  private List<Long> marketIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOOST_ODD_IDS = "BoostOddIds";
  @SerializedName(SERIALIZED_NAME_BOOST_ODD_IDS)
  private List<Long> boostOddIds;

  public static final String SERIALIZED_NAME_IS_BOOKED = "IsBooked";
  @SerializedName(SERIALIZED_NAME_IS_BOOKED)
  private Boolean isBooked;

  public static final String SERIALIZED_NAME_IS_PARLAY = "IsParlay";
  @SerializedName(SERIALIZED_NAME_IS_PARLAY)
  private Boolean isParlay;

  public static final String SERIALIZED_NAME_VARIANT = "Variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private EventBoxVariants variant;

  public static final String SERIALIZED_NAME_OFFERS = "Offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<OfferTypeParameter> offers;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_HAS_STREAM = "HasStream";
  @SerializedName(SERIALIZED_NAME_HAS_STREAM)
  private Boolean hasStream;

  public static final String SERIALIZED_NAME_EXT_ID = "ExtId";
  @SerializedName(SERIALIZED_NAME_EXT_ID)
  private String extId;

  public static final String SERIALIZED_NAME_EXTRA_INFO = "ExtraInfo";
  @SerializedName(SERIALIZED_NAME_EXTRA_INFO)
  private String extraInfo;

  public static final String SERIALIZED_NAME_SC = "sc";
  @SerializedName(SERIALIZED_NAME_SC)
  private Integer sc;

  public static final String SERIALIZED_NAME_RC = "rc";
  @SerializedName(SERIALIZED_NAME_RC)
  private Boolean rc;

  public static final String SERIALIZED_NAME_PITCHERS = "Pitchers";
  @SerializedName(SERIALIZED_NAME_PITCHERS)
  private List<Pitcher> pitchers;

  public static final String SERIALIZED_NAME_P_ID = "pId";
  @SerializedName(SERIALIZED_NAME_P_ID)
  private FeedProvidersEnum pId;

  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public OutrightEvent() {
  }

  public OutrightEvent(
     Long id, 
     String name
  ) {
    this();
    this.id = id;
    this.name = name;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



  public OutrightEvent competitorIds(List<Long> competitorIds) {
    this.competitorIds = competitorIds;
    return this;
  }

  public OutrightEvent addCompetitorIdsItem(Long competitorIdsItem) {
    if (this.competitorIds == null) {
      this.competitorIds = new ArrayList<>();
    }
    this.competitorIds.add(competitorIdsItem);
    return this;
  }

   /**
   * Get competitorIds
   * @return competitorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCompetitorIds() {
    return competitorIds;
  }

  public void setCompetitorIds(List<Long> competitorIds) {
    this.competitorIds = competitorIds;
  }


  public OutrightEvent sportId(Integer sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nonnull
  public Integer getSportId() {
    return sportId;
  }

  public void setSportId(Integer sportId) {
    this.sportId = sportId;
  }


  public OutrightEvent catId(Integer catId) {
    this.catId = catId;
    return this;
  }

   /**
   * Get catId
   * @return catId
  **/
  @javax.annotation.Nonnull
  public Integer getCatId() {
    return catId;
  }

  public void setCatId(Integer catId) {
    this.catId = catId;
  }


  public OutrightEvent champId(Long champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nonnull
  public Long getChampId() {
    return champId;
  }

  public void setChampId(Long champId) {
    this.champId = champId;
  }


  public OutrightEvent status(EventStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public EventStatus getStatus() {
    return status;
  }

  public void setStatus(EventStatus status) {
    this.status = status;
  }


  public OutrightEvent startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public OutrightEvent marketIds(List<Long> marketIds) {
    this.marketIds = marketIds;
    return this;
  }

  public OutrightEvent addMarketIdsItem(Long marketIdsItem) {
    if (this.marketIds == null) {
      this.marketIds = new ArrayList<>();
    }
    this.marketIds.add(marketIdsItem);
    return this;
  }

   /**
   * Get marketIds
   * @return marketIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getMarketIds() {
    return marketIds;
  }

  public void setMarketIds(List<Long> marketIds) {
    this.marketIds = marketIds;
  }


  public OutrightEvent boostOddIds(List<Long> boostOddIds) {
    this.boostOddIds = boostOddIds;
    return this;
  }

  public OutrightEvent addBoostOddIdsItem(Long boostOddIdsItem) {
    if (this.boostOddIds == null) {
      this.boostOddIds = new ArrayList<>();
    }
    this.boostOddIds.add(boostOddIdsItem);
    return this;
  }

   /**
   * Get boostOddIds
   * @return boostOddIds
  **/
  @javax.annotation.Nullable
  public List<Long> getBoostOddIds() {
    return boostOddIds;
  }

  public void setBoostOddIds(List<Long> boostOddIds) {
    this.boostOddIds = boostOddIds;
  }


  public OutrightEvent isBooked(Boolean isBooked) {
    this.isBooked = isBooked;
    return this;
  }

   /**
   * Get isBooked
   * @return isBooked
  **/
  @javax.annotation.Nonnull
  public Boolean getIsBooked() {
    return isBooked;
  }

  public void setIsBooked(Boolean isBooked) {
    this.isBooked = isBooked;
  }


  public OutrightEvent isParlay(Boolean isParlay) {
    this.isParlay = isParlay;
    return this;
  }

   /**
   * Get isParlay
   * @return isParlay
  **/
  @javax.annotation.Nonnull
  public Boolean getIsParlay() {
    return isParlay;
  }

  public void setIsParlay(Boolean isParlay) {
    this.isParlay = isParlay;
  }


  public OutrightEvent variant(EventBoxVariants variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @javax.annotation.Nullable
  public EventBoxVariants getVariant() {
    return variant;
  }

  public void setVariant(EventBoxVariants variant) {
    this.variant = variant;
  }


  public OutrightEvent offers(List<OfferTypeParameter> offers) {
    this.offers = offers;
    return this;
  }

  public OutrightEvent addOffersItem(OfferTypeParameter offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  @javax.annotation.Nullable
  public List<OfferTypeParameter> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferTypeParameter> offers) {
    this.offers = offers;
  }


  public OutrightEvent code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  public OutrightEvent hasStream(Boolean hasStream) {
    this.hasStream = hasStream;
    return this;
  }

   /**
   * Get hasStream
   * @return hasStream
  **/
  @javax.annotation.Nonnull
  public Boolean getHasStream() {
    return hasStream;
  }

  public void setHasStream(Boolean hasStream) {
    this.hasStream = hasStream;
  }


  public OutrightEvent extId(String extId) {
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


  public OutrightEvent extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @javax.annotation.Nullable
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }


  public OutrightEvent sc(Integer sc) {
    this.sc = sc;
    return this;
  }

   /**
   * Get sc
   * @return sc
  **/
  @javax.annotation.Nonnull
  public Integer getSc() {
    return sc;
  }

  public void setSc(Integer sc) {
    this.sc = sc;
  }


  public OutrightEvent rc(Boolean rc) {
    this.rc = rc;
    return this;
  }

   /**
   * Get rc
   * @return rc
  **/
  @javax.annotation.Nullable
  public Boolean getRc() {
    return rc;
  }

  public void setRc(Boolean rc) {
    this.rc = rc;
  }


  public OutrightEvent pitchers(List<Pitcher> pitchers) {
    this.pitchers = pitchers;
    return this;
  }

  public OutrightEvent addPitchersItem(Pitcher pitchersItem) {
    if (this.pitchers == null) {
      this.pitchers = new ArrayList<>();
    }
    this.pitchers.add(pitchersItem);
    return this;
  }

   /**
   * Get pitchers
   * @return pitchers
  **/
  @javax.annotation.Nullable
  public List<Pitcher> getPitchers() {
    return pitchers;
  }

  public void setPitchers(List<Pitcher> pitchers) {
    this.pitchers = pitchers;
  }


  public OutrightEvent pId(FeedProvidersEnum pId) {
    this.pId = pId;
    return this;
  }

   /**
   * Get pId
   * @return pId
  **/
  @javax.annotation.Nonnull
  public FeedProvidersEnum getpId() {
    return pId;
  }

  public void setpId(FeedProvidersEnum pId) {
    this.pId = pId;
  }


  public OutrightEvent endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutrightEvent outrightEvent = (OutrightEvent) o;
    return Objects.equals(this.id, outrightEvent.id) &&
        Objects.equals(this.name, outrightEvent.name) &&
        Objects.equals(this.competitorIds, outrightEvent.competitorIds) &&
        Objects.equals(this.sportId, outrightEvent.sportId) &&
        Objects.equals(this.catId, outrightEvent.catId) &&
        Objects.equals(this.champId, outrightEvent.champId) &&
        Objects.equals(this.status, outrightEvent.status) &&
        Objects.equals(this.startDate, outrightEvent.startDate) &&
        Objects.equals(this.marketIds, outrightEvent.marketIds) &&
        Objects.equals(this.boostOddIds, outrightEvent.boostOddIds) &&
        Objects.equals(this.isBooked, outrightEvent.isBooked) &&
        Objects.equals(this.isParlay, outrightEvent.isParlay) &&
        Objects.equals(this.variant, outrightEvent.variant) &&
        Objects.equals(this.offers, outrightEvent.offers) &&
        Objects.equals(this.code, outrightEvent.code) &&
        Objects.equals(this.hasStream, outrightEvent.hasStream) &&
        Objects.equals(this.extId, outrightEvent.extId) &&
        Objects.equals(this.extraInfo, outrightEvent.extraInfo) &&
        Objects.equals(this.sc, outrightEvent.sc) &&
        Objects.equals(this.rc, outrightEvent.rc) &&
        Objects.equals(this.pitchers, outrightEvent.pitchers) &&
        Objects.equals(this.pId, outrightEvent.pId) &&
        Objects.equals(this.endDate, outrightEvent.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, competitorIds, sportId, catId, champId, status, startDate, marketIds, boostOddIds, isBooked, isParlay, variant, offers, code, hasStream, extId, extraInfo, sc, rc, pitchers, pId, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutrightEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    competitorIds: ").append(toIndentedString(competitorIds)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    catId: ").append(toIndentedString(catId)).append("\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    marketIds: ").append(toIndentedString(marketIds)).append("\n");
    sb.append("    boostOddIds: ").append(toIndentedString(boostOddIds)).append("\n");
    sb.append("    isBooked: ").append(toIndentedString(isBooked)).append("\n");
    sb.append("    isParlay: ").append(toIndentedString(isParlay)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    hasStream: ").append(toIndentedString(hasStream)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    sc: ").append(toIndentedString(sc)).append("\n");
    sb.append("    rc: ").append(toIndentedString(rc)).append("\n");
    sb.append("    pitchers: ").append(toIndentedString(pitchers)).append("\n");
    sb.append("    pId: ").append(toIndentedString(pId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("Name");
    openapiFields.add("CompetitorIds");
    openapiFields.add("SportId");
    openapiFields.add("CatId");
    openapiFields.add("ChampId");
    openapiFields.add("Status");
    openapiFields.add("StartDate");
    openapiFields.add("MarketIds");
    openapiFields.add("BoostOddIds");
    openapiFields.add("IsBooked");
    openapiFields.add("IsParlay");
    openapiFields.add("Variant");
    openapiFields.add("Offers");
    openapiFields.add("Code");
    openapiFields.add("HasStream");
    openapiFields.add("ExtId");
    openapiFields.add("ExtraInfo");
    openapiFields.add("sc");
    openapiFields.add("rc");
    openapiFields.add("Pitchers");
    openapiFields.add("pId");
    openapiFields.add("EndDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("SportId");
    openapiRequiredFields.add("CatId");
    openapiRequiredFields.add("ChampId");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("StartDate");
    openapiRequiredFields.add("MarketIds");
    openapiRequiredFields.add("IsBooked");
    openapiRequiredFields.add("IsParlay");
    openapiRequiredFields.add("HasStream");
    openapiRequiredFields.add("sc");
    openapiRequiredFields.add("pId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OutrightEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutrightEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutrightEvent is not found in the empty JSON string", OutrightEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutrightEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutrightEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutrightEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("CompetitorIds") != null && !jsonObj.get("CompetitorIds").isJsonNull() && !jsonObj.get("CompetitorIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `CompetitorIds` to be an array in the JSON string but got `%s`", jsonObj.get("CompetitorIds").toString()));
      }
      // validate the required field `Status`
      EventStatus.validateJsonElement(jsonObj.get("Status"));
      // ensure the required json array is present
      if (jsonObj.get("MarketIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("MarketIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketIds` to be an array in the JSON string but got `%s`", jsonObj.get("MarketIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BoostOddIds") != null && !jsonObj.get("BoostOddIds").isJsonNull() && !jsonObj.get("BoostOddIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoostOddIds` to be an array in the JSON string but got `%s`", jsonObj.get("BoostOddIds").toString()));
      }
      // validate the optional field `Variant`
      if (jsonObj.get("Variant") != null && !jsonObj.get("Variant").isJsonNull()) {
        EventBoxVariants.validateJsonElement(jsonObj.get("Variant"));
      }
      if (jsonObj.get("Offers") != null && !jsonObj.get("Offers").isJsonNull()) {
        JsonArray jsonArrayoffers = jsonObj.getAsJsonArray("Offers");
        if (jsonArrayoffers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Offers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Offers` to be an array in the JSON string but got `%s`", jsonObj.get("Offers").toString()));
          }

          // validate the optional field `Offers` (array)
          for (int i = 0; i < jsonArrayoffers.size(); i++) {
            OfferTypeParameter.validateJsonElement(jsonArrayoffers.get(i));
          };
        }
      }
      if ((jsonObj.get("ExtId") != null && !jsonObj.get("ExtId").isJsonNull()) && !jsonObj.get("ExtId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtId").toString()));
      }
      if ((jsonObj.get("ExtraInfo") != null && !jsonObj.get("ExtraInfo").isJsonNull()) && !jsonObj.get("ExtraInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtraInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtraInfo").toString()));
      }
      if (jsonObj.get("Pitchers") != null && !jsonObj.get("Pitchers").isJsonNull()) {
        JsonArray jsonArraypitchers = jsonObj.getAsJsonArray("Pitchers");
        if (jsonArraypitchers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Pitchers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Pitchers` to be an array in the JSON string but got `%s`", jsonObj.get("Pitchers").toString()));
          }

          // validate the optional field `Pitchers` (array)
          for (int i = 0; i < jsonArraypitchers.size(); i++) {
            Pitcher.validateJsonElement(jsonArraypitchers.get(i));
          };
        }
      }
      // validate the required field `pId`
      FeedProvidersEnum.validateJsonElement(jsonObj.get("pId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutrightEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutrightEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutrightEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutrightEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<OutrightEvent>() {
           @Override
           public void write(JsonWriter out, OutrightEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutrightEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutrightEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutrightEvent
  * @throws IOException if the JSON string is invalid with respect to OutrightEvent
  */
  public static OutrightEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutrightEvent.class);
  }

 /**
  * Convert an instance of OutrightEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

