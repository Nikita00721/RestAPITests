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
 * BoostTemplateRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostTemplateRule {
  public static final String SERIALIZED_NAME_BOOST_TEMPLATE_ID = "BoostTemplateId";
  @SerializedName(SERIALIZED_NAME_BOOST_TEMPLATE_ID)
  private Integer boostTemplateId;

  public static final String SERIALIZED_NAME_BOOST_TYPE = "BoostType";
  @SerializedName(SERIALIZED_NAME_BOOST_TYPE)
  private BoostItemType boostType;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_OFFER_START_TIME = "OfferStartTime";
  @SerializedName(SERIALIZED_NAME_OFFER_START_TIME)
  private Integer offerStartTime;

  public static final String SERIALIZED_NAME_OFFER_END_TIME = "OfferEndTime";
  @SerializedName(SERIALIZED_NAME_OFFER_END_TIME)
  private Integer offerEndTime;

  public static final String SERIALIZED_NAME_IS_LIMITED_TIME = "IsLimitedTime";
  @SerializedName(SERIALIZED_NAME_IS_LIMITED_TIME)
  private Boolean isLimitedTime;

  public static final String SERIALIZED_NAME_BOOST_PROPS = "BoostProps";
  @SerializedName(SERIALIZED_NAME_BOOST_PROPS)
  private BoostItemProps boostProps;

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

  public static final String SERIALIZED_NAME_BOOST_LIMIT_NAME = "BoostLimitName";
  @SerializedName(SERIALIZED_NAME_BOOST_LIMIT_NAME)
  private String boostLimitName;

  public static final String SERIALIZED_NAME_BOOST_METHOD = "BoostMethod";
  @SerializedName(SERIALIZED_NAME_BOOST_METHOD)
  private BoostItemMethod boostMethod;

  public static final String SERIALIZED_NAME_BOOST_RULE_MARKETS = "BoostRuleMarkets";
  @SerializedName(SERIALIZED_NAME_BOOST_RULE_MARKETS)
  private List<BoostRuleMarketModel> boostRuleMarkets;

  public static final String SERIALIZED_NAME_BOOST_RULE_ID = "BoostRuleId";
  @SerializedName(SERIALIZED_NAME_BOOST_RULE_ID)
  private Integer boostRuleId;

  public BoostTemplateRule() {
  }

  public BoostTemplateRule(
     List<BoostRuleMarketModel> boostRuleMarkets
  ) {
    this();
    this.boostRuleMarkets = boostRuleMarkets;
  }

  public BoostTemplateRule boostTemplateId(Integer boostTemplateId) {
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


  public BoostTemplateRule boostType(BoostItemType boostType) {
    this.boostType = boostType;
    return this;
  }

   /**
   * Get boostType
   * @return boostType
  **/
  @javax.annotation.Nullable
  public BoostItemType getBoostType() {
    return boostType;
  }

  public void setBoostType(BoostItemType boostType) {
    this.boostType = boostType;
  }


  public BoostTemplateRule name(String name) {
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


  public BoostTemplateRule isEnabled(Boolean isEnabled) {
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


  public BoostTemplateRule createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public BoostTemplateRule offerStartTime(Integer offerStartTime) {
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


  public BoostTemplateRule offerEndTime(Integer offerEndTime) {
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


  public BoostTemplateRule isLimitedTime(Boolean isLimitedTime) {
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


  public BoostTemplateRule boostProps(BoostItemProps boostProps) {
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


  public BoostTemplateRule limitType(BoostLimitType limitType) {
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


  public BoostTemplateRule stakeLimitFactor(Double stakeLimitFactor) {
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


  public BoostTemplateRule winLimitFactor(Double winLimitFactor) {
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


  public BoostTemplateRule boostLimitId(Integer boostLimitId) {
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


  public BoostTemplateRule boostLimitName(String boostLimitName) {
    this.boostLimitName = boostLimitName;
    return this;
  }

   /**
   * Get boostLimitName
   * @return boostLimitName
  **/
  @javax.annotation.Nullable
  public String getBoostLimitName() {
    return boostLimitName;
  }

  public void setBoostLimitName(String boostLimitName) {
    this.boostLimitName = boostLimitName;
  }


  public BoostTemplateRule boostMethod(BoostItemMethod boostMethod) {
    this.boostMethod = boostMethod;
    return this;
  }

   /**
   * Get boostMethod
   * @return boostMethod
  **/
  @javax.annotation.Nullable
  public BoostItemMethod getBoostMethod() {
    return boostMethod;
  }

  public void setBoostMethod(BoostItemMethod boostMethod) {
    this.boostMethod = boostMethod;
  }


   /**
   * Get boostRuleMarkets
   * @return boostRuleMarkets
  **/
  @javax.annotation.Nullable
  public List<BoostRuleMarketModel> getBoostRuleMarkets() {
    return boostRuleMarkets;
  }



  public BoostTemplateRule boostRuleId(Integer boostRuleId) {
    this.boostRuleId = boostRuleId;
    return this;
  }

   /**
   * Get boostRuleId
   * @return boostRuleId
  **/
  @javax.annotation.Nullable
  public Integer getBoostRuleId() {
    return boostRuleId;
  }

  public void setBoostRuleId(Integer boostRuleId) {
    this.boostRuleId = boostRuleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostTemplateRule boostTemplateRule = (BoostTemplateRule) o;
    return Objects.equals(this.boostTemplateId, boostTemplateRule.boostTemplateId) &&
        Objects.equals(this.boostType, boostTemplateRule.boostType) &&
        Objects.equals(this.name, boostTemplateRule.name) &&
        Objects.equals(this.isEnabled, boostTemplateRule.isEnabled) &&
        Objects.equals(this.createdDate, boostTemplateRule.createdDate) &&
        Objects.equals(this.offerStartTime, boostTemplateRule.offerStartTime) &&
        Objects.equals(this.offerEndTime, boostTemplateRule.offerEndTime) &&
        Objects.equals(this.isLimitedTime, boostTemplateRule.isLimitedTime) &&
        Objects.equals(this.boostProps, boostTemplateRule.boostProps) &&
        Objects.equals(this.limitType, boostTemplateRule.limitType) &&
        Objects.equals(this.stakeLimitFactor, boostTemplateRule.stakeLimitFactor) &&
        Objects.equals(this.winLimitFactor, boostTemplateRule.winLimitFactor) &&
        Objects.equals(this.boostLimitId, boostTemplateRule.boostLimitId) &&
        Objects.equals(this.boostLimitName, boostTemplateRule.boostLimitName) &&
        Objects.equals(this.boostMethod, boostTemplateRule.boostMethod) &&
        Objects.equals(this.boostRuleMarkets, boostTemplateRule.boostRuleMarkets) &&
        Objects.equals(this.boostRuleId, boostTemplateRule.boostRuleId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostTemplateId, boostType, name, isEnabled, createdDate, offerStartTime, offerEndTime, isLimitedTime, boostProps, limitType, stakeLimitFactor, winLimitFactor, boostLimitId, boostLimitName, boostMethod, boostRuleMarkets, boostRuleId);
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
    sb.append("class BoostTemplateRule {\n");
    sb.append("    boostTemplateId: ").append(toIndentedString(boostTemplateId)).append("\n");
    sb.append("    boostType: ").append(toIndentedString(boostType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    offerStartTime: ").append(toIndentedString(offerStartTime)).append("\n");
    sb.append("    offerEndTime: ").append(toIndentedString(offerEndTime)).append("\n");
    sb.append("    isLimitedTime: ").append(toIndentedString(isLimitedTime)).append("\n");
    sb.append("    boostProps: ").append(toIndentedString(boostProps)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    stakeLimitFactor: ").append(toIndentedString(stakeLimitFactor)).append("\n");
    sb.append("    winLimitFactor: ").append(toIndentedString(winLimitFactor)).append("\n");
    sb.append("    boostLimitId: ").append(toIndentedString(boostLimitId)).append("\n");
    sb.append("    boostLimitName: ").append(toIndentedString(boostLimitName)).append("\n");
    sb.append("    boostMethod: ").append(toIndentedString(boostMethod)).append("\n");
    sb.append("    boostRuleMarkets: ").append(toIndentedString(boostRuleMarkets)).append("\n");
    sb.append("    boostRuleId: ").append(toIndentedString(boostRuleId)).append("\n");
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
    openapiFields.add("BoostTemplateId");
    openapiFields.add("BoostType");
    openapiFields.add("Name");
    openapiFields.add("IsEnabled");
    openapiFields.add("CreatedDate");
    openapiFields.add("OfferStartTime");
    openapiFields.add("OfferEndTime");
    openapiFields.add("IsLimitedTime");
    openapiFields.add("BoostProps");
    openapiFields.add("LimitType");
    openapiFields.add("StakeLimitFactor");
    openapiFields.add("WinLimitFactor");
    openapiFields.add("BoostLimitId");
    openapiFields.add("BoostLimitName");
    openapiFields.add("BoostMethod");
    openapiFields.add("BoostRuleMarkets");
    openapiFields.add("BoostRuleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostTemplateRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostTemplateRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostTemplateRule is not found in the empty JSON string", BoostTemplateRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostTemplateRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostTemplateRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `BoostType`
      if (jsonObj.get("BoostType") != null && !jsonObj.get("BoostType").isJsonNull()) {
        BoostItemType.validateJsonElement(jsonObj.get("BoostType"));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `BoostProps`
      if (jsonObj.get("BoostProps") != null && !jsonObj.get("BoostProps").isJsonNull()) {
        BoostItemProps.validateJsonElement(jsonObj.get("BoostProps"));
      }
      // validate the optional field `LimitType`
      if (jsonObj.get("LimitType") != null && !jsonObj.get("LimitType").isJsonNull()) {
        BoostLimitType.validateJsonElement(jsonObj.get("LimitType"));
      }
      if ((jsonObj.get("BoostLimitName") != null && !jsonObj.get("BoostLimitName").isJsonNull()) && !jsonObj.get("BoostLimitName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BoostLimitName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BoostLimitName").toString()));
      }
      // validate the optional field `BoostMethod`
      if (jsonObj.get("BoostMethod") != null && !jsonObj.get("BoostMethod").isJsonNull()) {
        BoostItemMethod.validateJsonElement(jsonObj.get("BoostMethod"));
      }
      if (jsonObj.get("BoostRuleMarkets") != null && !jsonObj.get("BoostRuleMarkets").isJsonNull()) {
        JsonArray jsonArrayboostRuleMarkets = jsonObj.getAsJsonArray("BoostRuleMarkets");
        if (jsonArrayboostRuleMarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("BoostRuleMarkets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `BoostRuleMarkets` to be an array in the JSON string but got `%s`", jsonObj.get("BoostRuleMarkets").toString()));
          }

          // validate the optional field `BoostRuleMarkets` (array)
          for (int i = 0; i < jsonArrayboostRuleMarkets.size(); i++) {
            BoostRuleMarketModel.validateJsonElement(jsonArrayboostRuleMarkets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostTemplateRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostTemplateRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostTemplateRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostTemplateRule.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostTemplateRule>() {
           @Override
           public void write(JsonWriter out, BoostTemplateRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostTemplateRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostTemplateRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostTemplateRule
  * @throws IOException if the JSON string is invalid with respect to BoostTemplateRule
  */
  public static BoostTemplateRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostTemplateRule.class);
  }

 /**
  * Convert an instance of BoostTemplateRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

