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
 * UpdateBoostRuleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateBoostRuleRequest {
  public static final String SERIALIZED_NAME_BOOST_RULE_ID = "BoostRuleId";
  @SerializedName(SERIALIZED_NAME_BOOST_RULE_ID)
  private Integer boostRuleId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_MARKETS = "Markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<BoostRuleMarketModel> markets;

  public static final String SERIALIZED_NAME_BOOST_TEMPLATE_ID = "BoostTemplateId";
  @SerializedName(SERIALIZED_NAME_BOOST_TEMPLATE_ID)
  private Integer boostTemplateId;

  public UpdateBoostRuleRequest() {
  }

  public UpdateBoostRuleRequest boostRuleId(Integer boostRuleId) {
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


  public UpdateBoostRuleRequest name(String name) {
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


  public UpdateBoostRuleRequest offerStartTime(Integer offerStartTime) {
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


  public UpdateBoostRuleRequest offerEndTime(Integer offerEndTime) {
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


  public UpdateBoostRuleRequest isLimitedTime(Boolean isLimitedTime) {
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


  public UpdateBoostRuleRequest boostProps(BoostItemProps boostProps) {
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


  public UpdateBoostRuleRequest limitType(BoostLimitType limitType) {
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


  public UpdateBoostRuleRequest stakeLimitFactor(Double stakeLimitFactor) {
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


  public UpdateBoostRuleRequest winLimitFactor(Double winLimitFactor) {
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


  public UpdateBoostRuleRequest boostLimitId(Integer boostLimitId) {
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


  public UpdateBoostRuleRequest markets(List<BoostRuleMarketModel> markets) {
    this.markets = markets;
    return this;
  }

  public UpdateBoostRuleRequest addMarketsItem(BoostRuleMarketModel marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @javax.annotation.Nullable
  public List<BoostRuleMarketModel> getMarkets() {
    return markets;
  }

  public void setMarkets(List<BoostRuleMarketModel> markets) {
    this.markets = markets;
  }


  public UpdateBoostRuleRequest boostTemplateId(Integer boostTemplateId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBoostRuleRequest updateBoostRuleRequest = (UpdateBoostRuleRequest) o;
    return Objects.equals(this.boostRuleId, updateBoostRuleRequest.boostRuleId) &&
        Objects.equals(this.name, updateBoostRuleRequest.name) &&
        Objects.equals(this.offerStartTime, updateBoostRuleRequest.offerStartTime) &&
        Objects.equals(this.offerEndTime, updateBoostRuleRequest.offerEndTime) &&
        Objects.equals(this.isLimitedTime, updateBoostRuleRequest.isLimitedTime) &&
        Objects.equals(this.boostProps, updateBoostRuleRequest.boostProps) &&
        Objects.equals(this.limitType, updateBoostRuleRequest.limitType) &&
        Objects.equals(this.stakeLimitFactor, updateBoostRuleRequest.stakeLimitFactor) &&
        Objects.equals(this.winLimitFactor, updateBoostRuleRequest.winLimitFactor) &&
        Objects.equals(this.boostLimitId, updateBoostRuleRequest.boostLimitId) &&
        Objects.equals(this.markets, updateBoostRuleRequest.markets) &&
        Objects.equals(this.boostTemplateId, updateBoostRuleRequest.boostTemplateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostRuleId, name, offerStartTime, offerEndTime, isLimitedTime, boostProps, limitType, stakeLimitFactor, winLimitFactor, boostLimitId, markets, boostTemplateId);
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
    sb.append("class UpdateBoostRuleRequest {\n");
    sb.append("    boostRuleId: ").append(toIndentedString(boostRuleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offerStartTime: ").append(toIndentedString(offerStartTime)).append("\n");
    sb.append("    offerEndTime: ").append(toIndentedString(offerEndTime)).append("\n");
    sb.append("    isLimitedTime: ").append(toIndentedString(isLimitedTime)).append("\n");
    sb.append("    boostProps: ").append(toIndentedString(boostProps)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    stakeLimitFactor: ").append(toIndentedString(stakeLimitFactor)).append("\n");
    sb.append("    winLimitFactor: ").append(toIndentedString(winLimitFactor)).append("\n");
    sb.append("    boostLimitId: ").append(toIndentedString(boostLimitId)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    boostTemplateId: ").append(toIndentedString(boostTemplateId)).append("\n");
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
    openapiFields.add("BoostRuleId");
    openapiFields.add("Name");
    openapiFields.add("OfferStartTime");
    openapiFields.add("OfferEndTime");
    openapiFields.add("IsLimitedTime");
    openapiFields.add("BoostProps");
    openapiFields.add("LimitType");
    openapiFields.add("StakeLimitFactor");
    openapiFields.add("WinLimitFactor");
    openapiFields.add("BoostLimitId");
    openapiFields.add("Markets");
    openapiFields.add("BoostTemplateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateBoostRuleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBoostRuleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBoostRuleRequest is not found in the empty JSON string", UpdateBoostRuleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBoostRuleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBoostRuleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (jsonObj.get("Markets") != null && !jsonObj.get("Markets").isJsonNull()) {
        JsonArray jsonArraymarkets = jsonObj.getAsJsonArray("Markets");
        if (jsonArraymarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Markets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Markets` to be an array in the JSON string but got `%s`", jsonObj.get("Markets").toString()));
          }

          // validate the optional field `Markets` (array)
          for (int i = 0; i < jsonArraymarkets.size(); i++) {
            BoostRuleMarketModel.validateJsonElement(jsonArraymarkets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBoostRuleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBoostRuleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBoostRuleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBoostRuleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBoostRuleRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBoostRuleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBoostRuleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBoostRuleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBoostRuleRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBoostRuleRequest
  */
  public static UpdateBoostRuleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBoostRuleRequest.class);
  }

 /**
  * Convert an instance of UpdateBoostRuleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

