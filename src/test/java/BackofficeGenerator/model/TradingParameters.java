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
 * TradingParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TradingParameters {
  public static final String SERIALIZED_NAME_MAX_PRICE_VALUE = "MaxPriceValue";
  @SerializedName(SERIALIZED_NAME_MAX_PRICE_VALUE)
  private Double maxPriceValue;

  public static final String SERIALIZED_NAME_CASHOUT_MARGIN_VIRTUALS = "CashoutMarginVirtuals";
  @SerializedName(SERIALIZED_NAME_CASHOUT_MARGIN_VIRTUALS)
  private Double cashoutMarginVirtuals;

  public static final String SERIALIZED_NAME_DEFAULT_CASHOUT_MARGIN = "DefaultCashoutMargin";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CASHOUT_MARGIN)
  private Double defaultCashoutMargin;

  public static final String SERIALIZED_NAME_DEFAULT_V2_CASHOUT_MARGIN = "DefaultV2CashoutMargin";
  @SerializedName(SERIALIZED_NAME_DEFAULT_V2_CASHOUT_MARGIN)
  private Double defaultV2CashoutMargin;

  public static final String SERIALIZED_NAME_BET_BUILDER_MAX_ODDS = "BetBuilderMaxOdds";
  @SerializedName(SERIALIZED_NAME_BET_BUILDER_MAX_ODDS)
  private Integer betBuilderMaxOdds;

  public static final String SERIALIZED_NAME_BET_BUILDER_MAX_ODDS_LIVE = "BetBuilderMaxOddsLive";
  @SerializedName(SERIALIZED_NAME_BET_BUILDER_MAX_ODDS_LIVE)
  private Integer betBuilderMaxOddsLive;

  public static final String SERIALIZED_NAME_MIN_PRICE_VALUE = "MinPriceValue";
  @SerializedName(SERIALIZED_NAME_MIN_PRICE_VALUE)
  private Double minPriceValue;

  public TradingParameters() {
  }

  public TradingParameters maxPriceValue(Double maxPriceValue) {
    this.maxPriceValue = maxPriceValue;
    return this;
  }

   /**
   * Get maxPriceValue
   * @return maxPriceValue
  **/
  @javax.annotation.Nullable
  public Double getMaxPriceValue() {
    return maxPriceValue;
  }

  public void setMaxPriceValue(Double maxPriceValue) {
    this.maxPriceValue = maxPriceValue;
  }


  public TradingParameters cashoutMarginVirtuals(Double cashoutMarginVirtuals) {
    this.cashoutMarginVirtuals = cashoutMarginVirtuals;
    return this;
  }

   /**
   * Get cashoutMarginVirtuals
   * @return cashoutMarginVirtuals
  **/
  @javax.annotation.Nullable
  public Double getCashoutMarginVirtuals() {
    return cashoutMarginVirtuals;
  }

  public void setCashoutMarginVirtuals(Double cashoutMarginVirtuals) {
    this.cashoutMarginVirtuals = cashoutMarginVirtuals;
  }


  public TradingParameters defaultCashoutMargin(Double defaultCashoutMargin) {
    this.defaultCashoutMargin = defaultCashoutMargin;
    return this;
  }

   /**
   * Get defaultCashoutMargin
   * @return defaultCashoutMargin
  **/
  @javax.annotation.Nullable
  public Double getDefaultCashoutMargin() {
    return defaultCashoutMargin;
  }

  public void setDefaultCashoutMargin(Double defaultCashoutMargin) {
    this.defaultCashoutMargin = defaultCashoutMargin;
  }


  public TradingParameters defaultV2CashoutMargin(Double defaultV2CashoutMargin) {
    this.defaultV2CashoutMargin = defaultV2CashoutMargin;
    return this;
  }

   /**
   * Get defaultV2CashoutMargin
   * @return defaultV2CashoutMargin
  **/
  @javax.annotation.Nullable
  public Double getDefaultV2CashoutMargin() {
    return defaultV2CashoutMargin;
  }

  public void setDefaultV2CashoutMargin(Double defaultV2CashoutMargin) {
    this.defaultV2CashoutMargin = defaultV2CashoutMargin;
  }


  public TradingParameters betBuilderMaxOdds(Integer betBuilderMaxOdds) {
    this.betBuilderMaxOdds = betBuilderMaxOdds;
    return this;
  }

   /**
   * Get betBuilderMaxOdds
   * @return betBuilderMaxOdds
  **/
  @javax.annotation.Nullable
  public Integer getBetBuilderMaxOdds() {
    return betBuilderMaxOdds;
  }

  public void setBetBuilderMaxOdds(Integer betBuilderMaxOdds) {
    this.betBuilderMaxOdds = betBuilderMaxOdds;
  }


  public TradingParameters betBuilderMaxOddsLive(Integer betBuilderMaxOddsLive) {
    this.betBuilderMaxOddsLive = betBuilderMaxOddsLive;
    return this;
  }

   /**
   * Get betBuilderMaxOddsLive
   * @return betBuilderMaxOddsLive
  **/
  @javax.annotation.Nullable
  public Integer getBetBuilderMaxOddsLive() {
    return betBuilderMaxOddsLive;
  }

  public void setBetBuilderMaxOddsLive(Integer betBuilderMaxOddsLive) {
    this.betBuilderMaxOddsLive = betBuilderMaxOddsLive;
  }


  public TradingParameters minPriceValue(Double minPriceValue) {
    this.minPriceValue = minPriceValue;
    return this;
  }

   /**
   * Get minPriceValue
   * @return minPriceValue
  **/
  @javax.annotation.Nullable
  public Double getMinPriceValue() {
    return minPriceValue;
  }

  public void setMinPriceValue(Double minPriceValue) {
    this.minPriceValue = minPriceValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingParameters tradingParameters = (TradingParameters) o;
    return Objects.equals(this.maxPriceValue, tradingParameters.maxPriceValue) &&
        Objects.equals(this.cashoutMarginVirtuals, tradingParameters.cashoutMarginVirtuals) &&
        Objects.equals(this.defaultCashoutMargin, tradingParameters.defaultCashoutMargin) &&
        Objects.equals(this.defaultV2CashoutMargin, tradingParameters.defaultV2CashoutMargin) &&
        Objects.equals(this.betBuilderMaxOdds, tradingParameters.betBuilderMaxOdds) &&
        Objects.equals(this.betBuilderMaxOddsLive, tradingParameters.betBuilderMaxOddsLive) &&
        Objects.equals(this.minPriceValue, tradingParameters.minPriceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPriceValue, cashoutMarginVirtuals, defaultCashoutMargin, defaultV2CashoutMargin, betBuilderMaxOdds, betBuilderMaxOddsLive, minPriceValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingParameters {\n");
    sb.append("    maxPriceValue: ").append(toIndentedString(maxPriceValue)).append("\n");
    sb.append("    cashoutMarginVirtuals: ").append(toIndentedString(cashoutMarginVirtuals)).append("\n");
    sb.append("    defaultCashoutMargin: ").append(toIndentedString(defaultCashoutMargin)).append("\n");
    sb.append("    defaultV2CashoutMargin: ").append(toIndentedString(defaultV2CashoutMargin)).append("\n");
    sb.append("    betBuilderMaxOdds: ").append(toIndentedString(betBuilderMaxOdds)).append("\n");
    sb.append("    betBuilderMaxOddsLive: ").append(toIndentedString(betBuilderMaxOddsLive)).append("\n");
    sb.append("    minPriceValue: ").append(toIndentedString(minPriceValue)).append("\n");
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
    openapiFields.add("MaxPriceValue");
    openapiFields.add("CashoutMarginVirtuals");
    openapiFields.add("DefaultCashoutMargin");
    openapiFields.add("DefaultV2CashoutMargin");
    openapiFields.add("BetBuilderMaxOdds");
    openapiFields.add("BetBuilderMaxOddsLive");
    openapiFields.add("MinPriceValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TradingParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TradingParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradingParameters is not found in the empty JSON string", TradingParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TradingParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradingParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradingParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradingParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradingParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradingParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<TradingParameters>() {
           @Override
           public void write(JsonWriter out, TradingParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradingParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TradingParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TradingParameters
  * @throws IOException if the JSON string is invalid with respect to TradingParameters
  */
  public static TradingParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradingParameters.class);
  }

 /**
  * Convert an instance of TradingParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

