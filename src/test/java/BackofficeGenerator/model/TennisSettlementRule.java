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
 * TennisSettlementRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TennisSettlementRule {
  public static final String SERIALIZED_NAME_LAST_TIE_BREAK = "LastTieBreak";
  @SerializedName(SERIALIZED_NAME_LAST_TIE_BREAK)
  private RetirementLastTieBreak lastTieBreak;

  public static final String SERIALIZED_NAME_RETIRED_PLAYER = "RetiredPlayer";
  @SerializedName(SERIALIZED_NAME_RETIRED_PLAYER)
  private Integer retiredPlayer;

  public static final String SERIALIZED_NAME_IS_AUTO = "IsAuto";
  @SerializedName(SERIALIZED_NAME_IS_AUTO)
  private Boolean isAuto;

  public static final String SERIALIZED_NAME_HAS_AUTO_SETTLED = "HasAutoSettled";
  @SerializedName(SERIALIZED_NAME_HAS_AUTO_SETTLED)
  private Boolean hasAutoSettled;

  public static final String SERIALIZED_NAME_SETS_NUMBER = "SetsNumber";
  @SerializedName(SERIALIZED_NAME_SETS_NUMBER)
  private Integer setsNumber;

  public static final String SERIALIZED_NAME_SETS = "Sets";
  @SerializedName(SERIALIZED_NAME_SETS)
  private List<TennisResultScoreItem> sets;

  public static final String SERIALIZED_NAME_SETTLEMENT_MODE = "SettlementMode";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_MODE)
  private RetirementSettlementMode settlementMode;

  public TennisSettlementRule() {
  }

  public TennisSettlementRule lastTieBreak(RetirementLastTieBreak lastTieBreak) {
    this.lastTieBreak = lastTieBreak;
    return this;
  }

   /**
   * Get lastTieBreak
   * @return lastTieBreak
  **/
  @javax.annotation.Nullable
  public RetirementLastTieBreak getLastTieBreak() {
    return lastTieBreak;
  }

  public void setLastTieBreak(RetirementLastTieBreak lastTieBreak) {
    this.lastTieBreak = lastTieBreak;
  }


  public TennisSettlementRule retiredPlayer(Integer retiredPlayer) {
    this.retiredPlayer = retiredPlayer;
    return this;
  }

   /**
   * Get retiredPlayer
   * @return retiredPlayer
  **/
  @javax.annotation.Nullable
  public Integer getRetiredPlayer() {
    return retiredPlayer;
  }

  public void setRetiredPlayer(Integer retiredPlayer) {
    this.retiredPlayer = retiredPlayer;
  }


  public TennisSettlementRule isAuto(Boolean isAuto) {
    this.isAuto = isAuto;
    return this;
  }

   /**
   * Get isAuto
   * @return isAuto
  **/
  @javax.annotation.Nullable
  public Boolean getIsAuto() {
    return isAuto;
  }

  public void setIsAuto(Boolean isAuto) {
    this.isAuto = isAuto;
  }


  public TennisSettlementRule hasAutoSettled(Boolean hasAutoSettled) {
    this.hasAutoSettled = hasAutoSettled;
    return this;
  }

   /**
   * Get hasAutoSettled
   * @return hasAutoSettled
  **/
  @javax.annotation.Nullable
  public Boolean getHasAutoSettled() {
    return hasAutoSettled;
  }

  public void setHasAutoSettled(Boolean hasAutoSettled) {
    this.hasAutoSettled = hasAutoSettled;
  }


  public TennisSettlementRule setsNumber(Integer setsNumber) {
    this.setsNumber = setsNumber;
    return this;
  }

   /**
   * Get setsNumber
   * @return setsNumber
  **/
  @javax.annotation.Nullable
  public Integer getSetsNumber() {
    return setsNumber;
  }

  public void setSetsNumber(Integer setsNumber) {
    this.setsNumber = setsNumber;
  }


  public TennisSettlementRule sets(List<TennisResultScoreItem> sets) {
    this.sets = sets;
    return this;
  }

  public TennisSettlementRule addSetsItem(TennisResultScoreItem setsItem) {
    if (this.sets == null) {
      this.sets = new ArrayList<>();
    }
    this.sets.add(setsItem);
    return this;
  }

   /**
   * Get sets
   * @return sets
  **/
  @javax.annotation.Nullable
  public List<TennisResultScoreItem> getSets() {
    return sets;
  }

  public void setSets(List<TennisResultScoreItem> sets) {
    this.sets = sets;
  }


  public TennisSettlementRule settlementMode(RetirementSettlementMode settlementMode) {
    this.settlementMode = settlementMode;
    return this;
  }

   /**
   * Get settlementMode
   * @return settlementMode
  **/
  @javax.annotation.Nullable
  public RetirementSettlementMode getSettlementMode() {
    return settlementMode;
  }

  public void setSettlementMode(RetirementSettlementMode settlementMode) {
    this.settlementMode = settlementMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TennisSettlementRule tennisSettlementRule = (TennisSettlementRule) o;
    return Objects.equals(this.lastTieBreak, tennisSettlementRule.lastTieBreak) &&
        Objects.equals(this.retiredPlayer, tennisSettlementRule.retiredPlayer) &&
        Objects.equals(this.isAuto, tennisSettlementRule.isAuto) &&
        Objects.equals(this.hasAutoSettled, tennisSettlementRule.hasAutoSettled) &&
        Objects.equals(this.setsNumber, tennisSettlementRule.setsNumber) &&
        Objects.equals(this.sets, tennisSettlementRule.sets) &&
        Objects.equals(this.settlementMode, tennisSettlementRule.settlementMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTieBreak, retiredPlayer, isAuto, hasAutoSettled, setsNumber, sets, settlementMode);
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
    sb.append("class TennisSettlementRule {\n");
    sb.append("    lastTieBreak: ").append(toIndentedString(lastTieBreak)).append("\n");
    sb.append("    retiredPlayer: ").append(toIndentedString(retiredPlayer)).append("\n");
    sb.append("    isAuto: ").append(toIndentedString(isAuto)).append("\n");
    sb.append("    hasAutoSettled: ").append(toIndentedString(hasAutoSettled)).append("\n");
    sb.append("    setsNumber: ").append(toIndentedString(setsNumber)).append("\n");
    sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
    sb.append("    settlementMode: ").append(toIndentedString(settlementMode)).append("\n");
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
    openapiFields.add("LastTieBreak");
    openapiFields.add("RetiredPlayer");
    openapiFields.add("IsAuto");
    openapiFields.add("HasAutoSettled");
    openapiFields.add("SetsNumber");
    openapiFields.add("Sets");
    openapiFields.add("SettlementMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TennisSettlementRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TennisSettlementRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TennisSettlementRule is not found in the empty JSON string", TennisSettlementRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TennisSettlementRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TennisSettlementRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LastTieBreak`
      if (jsonObj.get("LastTieBreak") != null && !jsonObj.get("LastTieBreak").isJsonNull()) {
        RetirementLastTieBreak.validateJsonElement(jsonObj.get("LastTieBreak"));
      }
      if (jsonObj.get("Sets") != null && !jsonObj.get("Sets").isJsonNull()) {
        JsonArray jsonArraysets = jsonObj.getAsJsonArray("Sets");
        if (jsonArraysets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Sets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Sets` to be an array in the JSON string but got `%s`", jsonObj.get("Sets").toString()));
          }

          // validate the optional field `Sets` (array)
          for (int i = 0; i < jsonArraysets.size(); i++) {
            TennisResultScoreItem.validateJsonElement(jsonArraysets.get(i));
          };
        }
      }
      // validate the optional field `SettlementMode`
      if (jsonObj.get("SettlementMode") != null && !jsonObj.get("SettlementMode").isJsonNull()) {
        RetirementSettlementMode.validateJsonElement(jsonObj.get("SettlementMode"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TennisSettlementRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TennisSettlementRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TennisSettlementRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TennisSettlementRule.class));

       return (TypeAdapter<T>) new TypeAdapter<TennisSettlementRule>() {
           @Override
           public void write(JsonWriter out, TennisSettlementRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TennisSettlementRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TennisSettlementRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TennisSettlementRule
  * @throws IOException if the JSON string is invalid with respect to TennisSettlementRule
  */
  public static TennisSettlementRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TennisSettlementRule.class);
  }

 /**
  * Convert an instance of TennisSettlementRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

