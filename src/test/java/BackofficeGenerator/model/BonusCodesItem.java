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
 * BonusCodesItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BonusCodesItem {
  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_BONUS_ACCOUNT_ID = "BonusAccountId";
  @SerializedName(SERIALIZED_NAME_BONUS_ACCOUNT_ID)
  private Integer bonusAccountId;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public static final String SERIALIZED_NAME_PLAYER_NAME = "PlayerName";
  @SerializedName(SERIALIZED_NAME_PLAYER_NAME)
  private String playerName;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public BonusCodesItem() {
  }

  public BonusCodesItem code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public BonusCodesItem bonusAccountId(Integer bonusAccountId) {
    this.bonusAccountId = bonusAccountId;
    return this;
  }

   /**
   * Get bonusAccountId
   * @return bonusAccountId
  **/
  @javax.annotation.Nullable
  public Integer getBonusAccountId() {
    return bonusAccountId;
  }

  public void setBonusAccountId(Integer bonusAccountId) {
    this.bonusAccountId = bonusAccountId;
  }


  public BonusCodesItem amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public BonusCodesItem playerId(Integer playerId) {
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


  public BonusCodesItem playerName(String playerName) {
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


  public BonusCodesItem bonusCampaignId(Integer bonusCampaignId) {
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
    BonusCodesItem bonusCodesItem = (BonusCodesItem) o;
    return Objects.equals(this.code, bonusCodesItem.code) &&
        Objects.equals(this.bonusAccountId, bonusCodesItem.bonusAccountId) &&
        Objects.equals(this.amount, bonusCodesItem.amount) &&
        Objects.equals(this.playerId, bonusCodesItem.playerId) &&
        Objects.equals(this.playerName, bonusCodesItem.playerName) &&
        Objects.equals(this.bonusCampaignId, bonusCodesItem.bonusCampaignId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, bonusAccountId, amount, playerId, playerName, bonusCampaignId);
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
    sb.append("class BonusCodesItem {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    bonusAccountId: ").append(toIndentedString(bonusAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    playerName: ").append(toIndentedString(playerName)).append("\n");
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
    openapiFields.add("Code");
    openapiFields.add("BonusAccountId");
    openapiFields.add("Amount");
    openapiFields.add("PlayerId");
    openapiFields.add("PlayerName");
    openapiFields.add("BonusCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BonusCodesItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BonusCodesItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BonusCodesItem is not found in the empty JSON string", BonusCodesItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BonusCodesItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BonusCodesItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
      if ((jsonObj.get("PlayerName") != null && !jsonObj.get("PlayerName").isJsonNull()) && !jsonObj.get("PlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BonusCodesItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BonusCodesItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BonusCodesItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BonusCodesItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BonusCodesItem>() {
           @Override
           public void write(JsonWriter out, BonusCodesItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BonusCodesItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BonusCodesItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BonusCodesItem
  * @throws IOException if the JSON string is invalid with respect to BonusCodesItem
  */
  public static BonusCodesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BonusCodesItem.class);
  }

 /**
  * Convert an instance of BonusCodesItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

