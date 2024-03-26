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
 * BonusCodesRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BonusCodesRequestFilter {
  public static final String SERIALIZED_NAME_IS_DISTRIBUTED = "IsDistributed";
  @SerializedName(SERIALIZED_NAME_IS_DISTRIBUTED)
  private Boolean isDistributed;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public static final String SERIALIZED_NAME_PLAYER_NAME = "PlayerName";
  @SerializedName(SERIALIZED_NAME_PLAYER_NAME)
  private String playerName;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "MinAmount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private Double minAmount;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "MaxAmount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private Double maxAmount;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public BonusCodesRequestFilter() {
  }

  public BonusCodesRequestFilter isDistributed(Boolean isDistributed) {
    this.isDistributed = isDistributed;
    return this;
  }

   /**
   * Get isDistributed
   * @return isDistributed
  **/
  @javax.annotation.Nullable
  public Boolean getIsDistributed() {
    return isDistributed;
  }

  public void setIsDistributed(Boolean isDistributed) {
    this.isDistributed = isDistributed;
  }


  public BonusCodesRequestFilter playerId(Integer playerId) {
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


  public BonusCodesRequestFilter playerName(String playerName) {
    this.playerName = playerName;
    return this;
  }

   /**
   * Get playerName
   * @return playerName
  **/
  @javax.annotation.Nullable
  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }


  public BonusCodesRequestFilter minAmount(Double minAmount) {
    this.minAmount = minAmount;
    return this;
  }

   /**
   * Get minAmount
   * @return minAmount
  **/
  @javax.annotation.Nullable
  public Double getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Double minAmount) {
    this.minAmount = minAmount;
  }


  public BonusCodesRequestFilter maxAmount(Double maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Get maxAmount
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  public Double getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Double maxAmount) {
    this.maxAmount = maxAmount;
  }


  public BonusCodesRequestFilter bonusCampaignId(Integer bonusCampaignId) {
    this.bonusCampaignId = bonusCampaignId;
    return this;
  }

   /**
   * Get bonusCampaignId
   * @return bonusCampaignId
  **/
  @javax.annotation.Nullable
  public Integer getBonusCampaignId() {
    return bonusCampaignId;
  }

  public void setBonusCampaignId(Integer bonusCampaignId) {
    this.bonusCampaignId = bonusCampaignId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BonusCodesRequestFilter bonusCodesRequestFilter = (BonusCodesRequestFilter) o;
    return Objects.equals(this.isDistributed, bonusCodesRequestFilter.isDistributed) &&
        Objects.equals(this.playerId, bonusCodesRequestFilter.playerId) &&
        Objects.equals(this.playerName, bonusCodesRequestFilter.playerName) &&
        Objects.equals(this.minAmount, bonusCodesRequestFilter.minAmount) &&
        Objects.equals(this.maxAmount, bonusCodesRequestFilter.maxAmount) &&
        Objects.equals(this.bonusCampaignId, bonusCodesRequestFilter.bonusCampaignId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDistributed, playerId, playerName, minAmount, maxAmount, bonusCampaignId);
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
    sb.append("class BonusCodesRequestFilter {\n");
    sb.append("    isDistributed: ").append(toIndentedString(isDistributed)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    playerName: ").append(toIndentedString(playerName)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    bonusCampaignId: ").append(toIndentedString(bonusCampaignId)).append("\n");
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
    openapiFields.add("IsDistributed");
    openapiFields.add("PlayerId");
    openapiFields.add("PlayerName");
    openapiFields.add("MinAmount");
    openapiFields.add("MaxAmount");
    openapiFields.add("BonusCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BonusCodesRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BonusCodesRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BonusCodesRequestFilter is not found in the empty JSON string", BonusCodesRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BonusCodesRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BonusCodesRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("PlayerName") != null && !jsonObj.get("PlayerName").isJsonNull()) && !jsonObj.get("PlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BonusCodesRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BonusCodesRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BonusCodesRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BonusCodesRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<BonusCodesRequestFilter>() {
           @Override
           public void write(JsonWriter out, BonusCodesRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BonusCodesRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BonusCodesRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BonusCodesRequestFilter
  * @throws IOException if the JSON string is invalid with respect to BonusCodesRequestFilter
  */
  public static BonusCodesRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BonusCodesRequestFilter.class);
  }

 /**
  * Convert an instance of BonusCodesRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
