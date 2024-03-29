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
 * GetTopBoostRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetTopBoostRequestFilter {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_BOOST_TEMPLATE_ID = "BoostTemplateId";
  @SerializedName(SERIALIZED_NAME_BOOST_TEMPLATE_ID)
  private Integer boostTemplateId;

  public static final String SERIALIZED_NAME_SEARCH_ID_NAME = "SearchIdName";
  @SerializedName(SERIALIZED_NAME_SEARCH_ID_NAME)
  private String searchIdName;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_BOOST_PROPS = "BoostProps";
  @SerializedName(SERIALIZED_NAME_BOOST_PROPS)
  private List<BoostItemProps> boostProps;

  public static final String SERIALIZED_NAME_IS_LIMITED_TIME = "IsLimitedTime";
  @SerializedName(SERIALIZED_NAME_IS_LIMITED_TIME)
  private Boolean isLimitedTime;

  public static final String SERIALIZED_NAME_SORTING = "Sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private TopBoostSorting sorting;

  public static final String SERIALIZED_NAME_OFFER_START_FROM = "OfferStartFrom";
  @SerializedName(SERIALIZED_NAME_OFFER_START_FROM)
  private OffsetDateTime offerStartFrom;

  public static final String SERIALIZED_NAME_OFFER_START_TO = "OfferStartTo";
  @SerializedName(SERIALIZED_NAME_OFFER_START_TO)
  private OffsetDateTime offerStartTo;

  public static final String SERIALIZED_NAME_OFFER_END_FROM = "OfferEndFrom";
  @SerializedName(SERIALIZED_NAME_OFFER_END_FROM)
  private OffsetDateTime offerEndFrom;

  public static final String SERIALIZED_NAME_OFFER_END_TO = "OfferEndTo";
  @SerializedName(SERIALIZED_NAME_OFFER_END_TO)
  private OffsetDateTime offerEndTo;

  public static final String SERIALIZED_NAME_FM_CONFIG_ID = "FMConfigId";
  @SerializedName(SERIALIZED_NAME_FM_CONFIG_ID)
  private Integer fmConfigId;

  public static final String SERIALIZED_NAME_TRADING_CONFIG_ID = "TradingConfigId";
  @SerializedName(SERIALIZED_NAME_TRADING_CONFIG_ID)
  private Integer tradingConfigId;

  public static final String SERIALIZED_NAME_IS_MAIN_PAGE = "IsMainPage";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_PAGE)
  private Boolean isMainPage;

  public static final String SERIALIZED_NAME_BOOST_CONFIG_ID = "BoostConfigId";
  @SerializedName(SERIALIZED_NAME_BOOST_CONFIG_ID)
  private Integer boostConfigId;

  public GetTopBoostRequestFilter() {
  }

  public GetTopBoostRequestFilter sportId(Integer sportId) {
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


  public GetTopBoostRequestFilter boostTemplateId(Integer boostTemplateId) {
    this.boostTemplateId = boostTemplateId;
    return this;
  }

   /**
   * Get boostTemplateId
   * @return boostTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getBoostTemplateId() {
    return boostTemplateId;
  }

  public void setBoostTemplateId(Integer boostTemplateId) {
    this.boostTemplateId = boostTemplateId;
  }


  public GetTopBoostRequestFilter searchIdName(String searchIdName) {
    this.searchIdName = searchIdName;
    return this;
  }

   /**
   * Get searchIdName
   * @return searchIdName
  **/
  @javax.annotation.Nullable
  public String getSearchIdName() {
    return searchIdName;
  }

  public void setSearchIdName(String searchIdName) {
    this.searchIdName = searchIdName;
  }


  public GetTopBoostRequestFilter isEnabled(Boolean isEnabled) {
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


  public GetTopBoostRequestFilter boostProps(List<BoostItemProps> boostProps) {
    this.boostProps = boostProps;
    return this;
  }

  public GetTopBoostRequestFilter addBoostPropsItem(BoostItemProps boostPropsItem) {
    if (this.boostProps == null) {
      this.boostProps = new ArrayList<>();
    }
    this.boostProps.add(boostPropsItem);
    return this;
  }

   /**
   * Get boostProps
   * @return boostProps
  **/
  @javax.annotation.Nullable
  public List<BoostItemProps> getBoostProps() {
    return boostProps;
  }

  public void setBoostProps(List<BoostItemProps> boostProps) {
    this.boostProps = boostProps;
  }


  public GetTopBoostRequestFilter isLimitedTime(Boolean isLimitedTime) {
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


  public GetTopBoostRequestFilter sorting(TopBoostSorting sorting) {
    this.sorting = sorting;
    return this;
  }

   /**
   * Get sorting
   * @return sorting
  **/
  @javax.annotation.Nullable
  public TopBoostSorting getSorting() {
    return sorting;
  }

  public void setSorting(TopBoostSorting sorting) {
    this.sorting = sorting;
  }


  public GetTopBoostRequestFilter offerStartFrom(OffsetDateTime offerStartFrom) {
    this.offerStartFrom = offerStartFrom;
    return this;
  }

   /**
   * Get offerStartFrom
   * @return offerStartFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOfferStartFrom() {
    return offerStartFrom;
  }

  public void setOfferStartFrom(OffsetDateTime offerStartFrom) {
    this.offerStartFrom = offerStartFrom;
  }


  public GetTopBoostRequestFilter offerStartTo(OffsetDateTime offerStartTo) {
    this.offerStartTo = offerStartTo;
    return this;
  }

   /**
   * Get offerStartTo
   * @return offerStartTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOfferStartTo() {
    return offerStartTo;
  }

  public void setOfferStartTo(OffsetDateTime offerStartTo) {
    this.offerStartTo = offerStartTo;
  }


  public GetTopBoostRequestFilter offerEndFrom(OffsetDateTime offerEndFrom) {
    this.offerEndFrom = offerEndFrom;
    return this;
  }

   /**
   * Get offerEndFrom
   * @return offerEndFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOfferEndFrom() {
    return offerEndFrom;
  }

  public void setOfferEndFrom(OffsetDateTime offerEndFrom) {
    this.offerEndFrom = offerEndFrom;
  }


  public GetTopBoostRequestFilter offerEndTo(OffsetDateTime offerEndTo) {
    this.offerEndTo = offerEndTo;
    return this;
  }

   /**
   * Get offerEndTo
   * @return offerEndTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOfferEndTo() {
    return offerEndTo;
  }

  public void setOfferEndTo(OffsetDateTime offerEndTo) {
    this.offerEndTo = offerEndTo;
  }


  public GetTopBoostRequestFilter fmConfigId(Integer fmConfigId) {
    this.fmConfigId = fmConfigId;
    return this;
  }

   /**
   * Get fmConfigId
   * @return fmConfigId
  **/
  @javax.annotation.Nullable
  public Integer getFmConfigId() {
    return fmConfigId;
  }

  public void setFmConfigId(Integer fmConfigId) {
    this.fmConfigId = fmConfigId;
  }


  public GetTopBoostRequestFilter tradingConfigId(Integer tradingConfigId) {
    this.tradingConfigId = tradingConfigId;
    return this;
  }

   /**
   * Get tradingConfigId
   * @return tradingConfigId
  **/
  @javax.annotation.Nullable
  public Integer getTradingConfigId() {
    return tradingConfigId;
  }

  public void setTradingConfigId(Integer tradingConfigId) {
    this.tradingConfigId = tradingConfigId;
  }


  public GetTopBoostRequestFilter isMainPage(Boolean isMainPage) {
    this.isMainPage = isMainPage;
    return this;
  }

   /**
   * Get isMainPage
   * @return isMainPage
  **/
  @javax.annotation.Nullable
  public Boolean getIsMainPage() {
    return isMainPage;
  }

  public void setIsMainPage(Boolean isMainPage) {
    this.isMainPage = isMainPage;
  }


  public GetTopBoostRequestFilter boostConfigId(Integer boostConfigId) {
    this.boostConfigId = boostConfigId;
    return this;
  }

   /**
   * Get boostConfigId
   * @return boostConfigId
  **/
  @javax.annotation.Nullable
  public Integer getBoostConfigId() {
    return boostConfigId;
  }

  public void setBoostConfigId(Integer boostConfigId) {
    this.boostConfigId = boostConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTopBoostRequestFilter getTopBoostRequestFilter = (GetTopBoostRequestFilter) o;
    return Objects.equals(this.sportId, getTopBoostRequestFilter.sportId) &&
        Objects.equals(this.boostTemplateId, getTopBoostRequestFilter.boostTemplateId) &&
        Objects.equals(this.searchIdName, getTopBoostRequestFilter.searchIdName) &&
        Objects.equals(this.isEnabled, getTopBoostRequestFilter.isEnabled) &&
        Objects.equals(this.boostProps, getTopBoostRequestFilter.boostProps) &&
        Objects.equals(this.isLimitedTime, getTopBoostRequestFilter.isLimitedTime) &&
        Objects.equals(this.sorting, getTopBoostRequestFilter.sorting) &&
        Objects.equals(this.offerStartFrom, getTopBoostRequestFilter.offerStartFrom) &&
        Objects.equals(this.offerStartTo, getTopBoostRequestFilter.offerStartTo) &&
        Objects.equals(this.offerEndFrom, getTopBoostRequestFilter.offerEndFrom) &&
        Objects.equals(this.offerEndTo, getTopBoostRequestFilter.offerEndTo) &&
        Objects.equals(this.fmConfigId, getTopBoostRequestFilter.fmConfigId) &&
        Objects.equals(this.tradingConfigId, getTopBoostRequestFilter.tradingConfigId) &&
        Objects.equals(this.isMainPage, getTopBoostRequestFilter.isMainPage) &&
        Objects.equals(this.boostConfigId, getTopBoostRequestFilter.boostConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, boostTemplateId, searchIdName, isEnabled, boostProps, isLimitedTime, sorting, offerStartFrom, offerStartTo, offerEndFrom, offerEndTo, fmConfigId, tradingConfigId, isMainPage, boostConfigId);
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
    sb.append("class GetTopBoostRequestFilter {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    boostTemplateId: ").append(toIndentedString(boostTemplateId)).append("\n");
    sb.append("    searchIdName: ").append(toIndentedString(searchIdName)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    boostProps: ").append(toIndentedString(boostProps)).append("\n");
    sb.append("    isLimitedTime: ").append(toIndentedString(isLimitedTime)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    offerStartFrom: ").append(toIndentedString(offerStartFrom)).append("\n");
    sb.append("    offerStartTo: ").append(toIndentedString(offerStartTo)).append("\n");
    sb.append("    offerEndFrom: ").append(toIndentedString(offerEndFrom)).append("\n");
    sb.append("    offerEndTo: ").append(toIndentedString(offerEndTo)).append("\n");
    sb.append("    fmConfigId: ").append(toIndentedString(fmConfigId)).append("\n");
    sb.append("    tradingConfigId: ").append(toIndentedString(tradingConfigId)).append("\n");
    sb.append("    isMainPage: ").append(toIndentedString(isMainPage)).append("\n");
    sb.append("    boostConfigId: ").append(toIndentedString(boostConfigId)).append("\n");
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
    openapiFields.add("SportId");
    openapiFields.add("BoostTemplateId");
    openapiFields.add("SearchIdName");
    openapiFields.add("IsEnabled");
    openapiFields.add("BoostProps");
    openapiFields.add("IsLimitedTime");
    openapiFields.add("Sorting");
    openapiFields.add("OfferStartFrom");
    openapiFields.add("OfferStartTo");
    openapiFields.add("OfferEndFrom");
    openapiFields.add("OfferEndTo");
    openapiFields.add("FMConfigId");
    openapiFields.add("TradingConfigId");
    openapiFields.add("IsMainPage");
    openapiFields.add("BoostConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTopBoostRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTopBoostRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTopBoostRequestFilter is not found in the empty JSON string", GetTopBoostRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTopBoostRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTopBoostRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SearchIdName") != null && !jsonObj.get("SearchIdName").isJsonNull()) && !jsonObj.get("SearchIdName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SearchIdName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SearchIdName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BoostProps") != null && !jsonObj.get("BoostProps").isJsonNull() && !jsonObj.get("BoostProps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoostProps` to be an array in the JSON string but got `%s`", jsonObj.get("BoostProps").toString()));
      }
      // validate the optional field `Sorting`
      if (jsonObj.get("Sorting") != null && !jsonObj.get("Sorting").isJsonNull()) {
        TopBoostSorting.validateJsonElement(jsonObj.get("Sorting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTopBoostRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTopBoostRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTopBoostRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTopBoostRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTopBoostRequestFilter>() {
           @Override
           public void write(JsonWriter out, GetTopBoostRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTopBoostRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTopBoostRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTopBoostRequestFilter
  * @throws IOException if the JSON string is invalid with respect to GetTopBoostRequestFilter
  */
  public static GetTopBoostRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTopBoostRequestFilter.class);
  }

 /**
  * Convert an instance of GetTopBoostRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

