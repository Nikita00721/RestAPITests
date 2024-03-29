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
 * OverallParametersResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class OverallParametersResult {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "TotalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_SINGLES_COUNT = "SinglesCount";
  @SerializedName(SERIALIZED_NAME_SINGLES_COUNT)
  private Integer singlesCount;

  public static final String SERIALIZED_NAME_SINGLES_PERCENT = "SinglesPercent";
  @SerializedName(SERIALIZED_NAME_SINGLES_PERCENT)
  private Integer singlesPercent;

  public static final String SERIALIZED_NAME_COMBO_COUNT = "ComboCount";
  @SerializedName(SERIALIZED_NAME_COMBO_COUNT)
  private Integer comboCount;

  public static final String SERIALIZED_NAME_COMBO_PERCENT = "ComboPercent";
  @SerializedName(SERIALIZED_NAME_COMBO_PERCENT)
  private Integer comboPercent;

  public static final String SERIALIZED_NAME_AVG_STAKE = "AvgStake";
  @SerializedName(SERIALIZED_NAME_AVG_STAKE)
  private Double avgStake;

  public static final String SERIALIZED_NAME_AVG_STAKE_BASE = "AvgStakeBase";
  @SerializedName(SERIALIZED_NAME_AVG_STAKE_BASE)
  private Double avgStakeBase;

  public static final String SERIALIZED_NAME_AVG_ODDS = "AvgOdds";
  @SerializedName(SERIALIZED_NAME_AVG_ODDS)
  private Double avgOdds;

  public static final String SERIALIZED_NAME_MARGIN = "Margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private Double margin;

  public static final String SERIALIZED_NAME_MARGIN_BASE = "MarginBase";
  @SerializedName(SERIALIZED_NAME_MARGIN_BASE)
  private Double marginBase;

  public static final String SERIALIZED_NAME_TURNOVER = "Turnover";
  @SerializedName(SERIALIZED_NAME_TURNOVER)
  private Double turnover;

  public static final String SERIALIZED_NAME_TURNOVER_BASE = "TurnoverBase";
  @SerializedName(SERIALIZED_NAME_TURNOVER_BASE)
  private Double turnoverBase;

  public static final String SERIALIZED_NAME_G_G_R = "GGR";
  @SerializedName(SERIALIZED_NAME_G_G_R)
  private Double GGR;

  public static final String SERIALIZED_NAME_GG_R_BASE = "GGRBase";
  @SerializedName(SERIALIZED_NAME_GG_R_BASE)
  private Double ggRBase;

  public static final String SERIALIZED_NAME_BASE_CURRENCY_SIGN = "BaseCurrencySign";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY_SIGN)
  private String baseCurrencySign;

  public static final String SERIALIZED_NAME_NATIVE_CURRENCY_SIGN = "NativeCurrencySign";
  @SerializedName(SERIALIZED_NAME_NATIVE_CURRENCY_SIGN)
  private String nativeCurrencySign;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public OverallParametersResult() {
  }

  public OverallParametersResult totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public OverallParametersResult singlesCount(Integer singlesCount) {
    this.singlesCount = singlesCount;
    return this;
  }

   /**
   * Get singlesCount
   * @return singlesCount
  **/
  @javax.annotation.Nullable
  public Integer getSinglesCount() {
    return singlesCount;
  }

  public void setSinglesCount(Integer singlesCount) {
    this.singlesCount = singlesCount;
  }


  public OverallParametersResult singlesPercent(Integer singlesPercent) {
    this.singlesPercent = singlesPercent;
    return this;
  }

   /**
   * Get singlesPercent
   * @return singlesPercent
  **/
  @javax.annotation.Nullable
  public Integer getSinglesPercent() {
    return singlesPercent;
  }

  public void setSinglesPercent(Integer singlesPercent) {
    this.singlesPercent = singlesPercent;
  }


  public OverallParametersResult comboCount(Integer comboCount) {
    this.comboCount = comboCount;
    return this;
  }

   /**
   * Get comboCount
   * @return comboCount
  **/
  @javax.annotation.Nullable
  public Integer getComboCount() {
    return comboCount;
  }

  public void setComboCount(Integer comboCount) {
    this.comboCount = comboCount;
  }


  public OverallParametersResult comboPercent(Integer comboPercent) {
    this.comboPercent = comboPercent;
    return this;
  }

   /**
   * Get comboPercent
   * @return comboPercent
  **/
  @javax.annotation.Nullable
  public Integer getComboPercent() {
    return comboPercent;
  }

  public void setComboPercent(Integer comboPercent) {
    this.comboPercent = comboPercent;
  }


  public OverallParametersResult avgStake(Double avgStake) {
    this.avgStake = avgStake;
    return this;
  }

   /**
   * Get avgStake
   * @return avgStake
  **/
  @javax.annotation.Nullable
  public Double getAvgStake() {
    return avgStake;
  }

  public void setAvgStake(Double avgStake) {
    this.avgStake = avgStake;
  }


  public OverallParametersResult avgStakeBase(Double avgStakeBase) {
    this.avgStakeBase = avgStakeBase;
    return this;
  }

   /**
   * Get avgStakeBase
   * @return avgStakeBase
  **/
  @javax.annotation.Nullable
  public Double getAvgStakeBase() {
    return avgStakeBase;
  }

  public void setAvgStakeBase(Double avgStakeBase) {
    this.avgStakeBase = avgStakeBase;
  }


  public OverallParametersResult avgOdds(Double avgOdds) {
    this.avgOdds = avgOdds;
    return this;
  }

   /**
   * Get avgOdds
   * @return avgOdds
  **/
  @javax.annotation.Nullable
  public Double getAvgOdds() {
    return avgOdds;
  }

  public void setAvgOdds(Double avgOdds) {
    this.avgOdds = avgOdds;
  }


  public OverallParametersResult margin(Double margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Get margin
   * @return margin
  **/
  @javax.annotation.Nullable
  public Double getMargin() {
    return margin;
  }

  public void setMargin(Double margin) {
    this.margin = margin;
  }


  public OverallParametersResult marginBase(Double marginBase) {
    this.marginBase = marginBase;
    return this;
  }

   /**
   * Get marginBase
   * @return marginBase
  **/
  @javax.annotation.Nullable
  public Double getMarginBase() {
    return marginBase;
  }

  public void setMarginBase(Double marginBase) {
    this.marginBase = marginBase;
  }


  public OverallParametersResult turnover(Double turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * Get turnover
   * @return turnover
  **/
  @javax.annotation.Nullable
  public Double getTurnover() {
    return turnover;
  }

  public void setTurnover(Double turnover) {
    this.turnover = turnover;
  }


  public OverallParametersResult turnoverBase(Double turnoverBase) {
    this.turnoverBase = turnoverBase;
    return this;
  }

   /**
   * Get turnoverBase
   * @return turnoverBase
  **/
  @javax.annotation.Nullable
  public Double getTurnoverBase() {
    return turnoverBase;
  }

  public void setTurnoverBase(Double turnoverBase) {
    this.turnoverBase = turnoverBase;
  }


  public OverallParametersResult GGR(Double GGR) {
    this.GGR = GGR;
    return this;
  }

   /**
   * Get GGR
   * @return GGR
  **/
  @javax.annotation.Nullable
  public Double getGGR() {
    return GGR;
  }

  public void setGGR(Double GGR) {
    this.GGR = GGR;
  }


  public OverallParametersResult ggRBase(Double ggRBase) {
    this.ggRBase = ggRBase;
    return this;
  }

   /**
   * Get ggRBase
   * @return ggRBase
  **/
  @javax.annotation.Nullable
  public Double getGgRBase() {
    return ggRBase;
  }

  public void setGgRBase(Double ggRBase) {
    this.ggRBase = ggRBase;
  }


  public OverallParametersResult baseCurrencySign(String baseCurrencySign) {
    this.baseCurrencySign = baseCurrencySign;
    return this;
  }

   /**
   * Get baseCurrencySign
   * @return baseCurrencySign
  **/
  @javax.annotation.Nullable
  public String getBaseCurrencySign() {
    return baseCurrencySign;
  }

  public void setBaseCurrencySign(String baseCurrencySign) {
    this.baseCurrencySign = baseCurrencySign;
  }


  public OverallParametersResult nativeCurrencySign(String nativeCurrencySign) {
    this.nativeCurrencySign = nativeCurrencySign;
    return this;
  }

   /**
   * Get nativeCurrencySign
   * @return nativeCurrencySign
  **/
  @javax.annotation.Nullable
  public String getNativeCurrencySign() {
    return nativeCurrencySign;
  }

  public void setNativeCurrencySign(String nativeCurrencySign) {
    this.nativeCurrencySign = nativeCurrencySign;
  }


  public OverallParametersResult playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @javax.annotation.Nullable
  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverallParametersResult overallParametersResult = (OverallParametersResult) o;
    return Objects.equals(this.totalCount, overallParametersResult.totalCount) &&
        Objects.equals(this.singlesCount, overallParametersResult.singlesCount) &&
        Objects.equals(this.singlesPercent, overallParametersResult.singlesPercent) &&
        Objects.equals(this.comboCount, overallParametersResult.comboCount) &&
        Objects.equals(this.comboPercent, overallParametersResult.comboPercent) &&
        Objects.equals(this.avgStake, overallParametersResult.avgStake) &&
        Objects.equals(this.avgStakeBase, overallParametersResult.avgStakeBase) &&
        Objects.equals(this.avgOdds, overallParametersResult.avgOdds) &&
        Objects.equals(this.margin, overallParametersResult.margin) &&
        Objects.equals(this.marginBase, overallParametersResult.marginBase) &&
        Objects.equals(this.turnover, overallParametersResult.turnover) &&
        Objects.equals(this.turnoverBase, overallParametersResult.turnoverBase) &&
        Objects.equals(this.GGR, overallParametersResult.GGR) &&
        Objects.equals(this.ggRBase, overallParametersResult.ggRBase) &&
        Objects.equals(this.baseCurrencySign, overallParametersResult.baseCurrencySign) &&
        Objects.equals(this.nativeCurrencySign, overallParametersResult.nativeCurrencySign) &&
        Objects.equals(this.playerId, overallParametersResult.playerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, singlesCount, singlesPercent, comboCount, comboPercent, avgStake, avgStakeBase, avgOdds, margin, marginBase, turnover, turnoverBase, GGR, ggRBase, baseCurrencySign, nativeCurrencySign, playerId);
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
    sb.append("class OverallParametersResult {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    singlesCount: ").append(toIndentedString(singlesCount)).append("\n");
    sb.append("    singlesPercent: ").append(toIndentedString(singlesPercent)).append("\n");
    sb.append("    comboCount: ").append(toIndentedString(comboCount)).append("\n");
    sb.append("    comboPercent: ").append(toIndentedString(comboPercent)).append("\n");
    sb.append("    avgStake: ").append(toIndentedString(avgStake)).append("\n");
    sb.append("    avgStakeBase: ").append(toIndentedString(avgStakeBase)).append("\n");
    sb.append("    avgOdds: ").append(toIndentedString(avgOdds)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    marginBase: ").append(toIndentedString(marginBase)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    turnoverBase: ").append(toIndentedString(turnoverBase)).append("\n");
    sb.append("    GGR: ").append(toIndentedString(GGR)).append("\n");
    sb.append("    ggRBase: ").append(toIndentedString(ggRBase)).append("\n");
    sb.append("    baseCurrencySign: ").append(toIndentedString(baseCurrencySign)).append("\n");
    sb.append("    nativeCurrencySign: ").append(toIndentedString(nativeCurrencySign)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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
    openapiFields.add("TotalCount");
    openapiFields.add("SinglesCount");
    openapiFields.add("SinglesPercent");
    openapiFields.add("ComboCount");
    openapiFields.add("ComboPercent");
    openapiFields.add("AvgStake");
    openapiFields.add("AvgStakeBase");
    openapiFields.add("AvgOdds");
    openapiFields.add("Margin");
    openapiFields.add("MarginBase");
    openapiFields.add("Turnover");
    openapiFields.add("TurnoverBase");
    openapiFields.add("GGR");
    openapiFields.add("GGRBase");
    openapiFields.add("BaseCurrencySign");
    openapiFields.add("NativeCurrencySign");
    openapiFields.add("PlayerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OverallParametersResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OverallParametersResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverallParametersResult is not found in the empty JSON string", OverallParametersResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OverallParametersResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OverallParametersResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("BaseCurrencySign") != null && !jsonObj.get("BaseCurrencySign").isJsonNull()) && !jsonObj.get("BaseCurrencySign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BaseCurrencySign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BaseCurrencySign").toString()));
      }
      if ((jsonObj.get("NativeCurrencySign") != null && !jsonObj.get("NativeCurrencySign").isJsonNull()) && !jsonObj.get("NativeCurrencySign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NativeCurrencySign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NativeCurrencySign").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverallParametersResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverallParametersResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverallParametersResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverallParametersResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OverallParametersResult>() {
           @Override
           public void write(JsonWriter out, OverallParametersResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OverallParametersResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OverallParametersResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverallParametersResult
  * @throws IOException if the JSON string is invalid with respect to OverallParametersResult
  */
  public static OverallParametersResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverallParametersResult.class);
  }

 /**
  * Convert an instance of OverallParametersResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

