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
 * PlayerDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class PlayerDetails {
  public static final String SERIALIZED_NAME_EXT_ID = "ExtId";
  @SerializedName(SERIALIZED_NAME_EXT_ID)
  private String extId;

  public static final String SERIALIZED_NAME_PLAYER_NAME = "PlayerName";
  @SerializedName(SERIALIZED_NAME_PLAYER_NAME)
  private String playerName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "CountryName";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_REGISTRATION_DATE = "RegistrationDate";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DATE)
  private OffsetDateTime registrationDate;

  public static final String SERIALIZED_NAME_AFFILIATE_PATH = "AffiliatePath";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_PATH)
  private String affiliatePath;

  public static final String SERIALIZED_NAME_FUNDS_STRING = "FundsString";
  @SerializedName(SERIALIZED_NAME_FUNDS_STRING)
  private String fundsString;

  public static final String SERIALIZED_NAME_BONUS_STRING = "BonusString";
  @SerializedName(SERIALIZED_NAME_BONUS_STRING)
  private String bonusString;

  public static final String SERIALIZED_NAME_COLOR = "Color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_LIMIT_GROUP_ID = "LimitGroupId";
  @SerializedName(SERIALIZED_NAME_LIMIT_GROUP_ID)
  private Integer limitGroupId;

  public static final String SERIALIZED_NAME_LIMIT_GROUP_NAME = "LimitGroupName";
  @SerializedName(SERIALIZED_NAME_LIMIT_GROUP_NAME)
  private String limitGroupName;

  public static final String SERIALIZED_NAME_LIMIT_GROUP_INHERITANCE_TYPE = "LimitGroupInheritanceType";
  @SerializedName(SERIALIZED_NAME_LIMIT_GROUP_INHERITANCE_TYPE)
  private String limitGroupInheritanceType;

  public static final String SERIALIZED_NAME_MULTIPLE_BONUS_ID = "MultipleBonusId";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BONUS_ID)
  private Integer multipleBonusId;

  public static final String SERIALIZED_NAME_MULTIPLE_BONUS_NAME = "MultipleBonusName";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BONUS_NAME)
  private String multipleBonusName;

  public static final String SERIALIZED_NAME_MULTIPLE_BONUS_INHERITANCE_TYPE = "MultipleBonusInheritanceType";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BONUS_INHERITANCE_TYPE)
  private String multipleBonusInheritanceType;

  public static final String SERIALIZED_NAME_IS_BLOCKED = "IsBlocked";
  @SerializedName(SERIALIZED_NAME_IS_BLOCKED)
  private Boolean isBlocked;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public PlayerDetails() {
  }

  public PlayerDetails extId(String extId) {
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


  public PlayerDetails playerName(String playerName) {
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


  public PlayerDetails countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public PlayerDetails countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @javax.annotation.Nullable
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public PlayerDetails registrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

   /**
   * Get registrationDate
   * @return registrationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(OffsetDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }


  public PlayerDetails affiliatePath(String affiliatePath) {
    this.affiliatePath = affiliatePath;
    return this;
  }

   /**
   * Get affiliatePath
   * @return affiliatePath
  **/
  @javax.annotation.Nullable
  public String getAffiliatePath() {
    return affiliatePath;
  }

  public void setAffiliatePath(String affiliatePath) {
    this.affiliatePath = affiliatePath;
  }


  public PlayerDetails fundsString(String fundsString) {
    this.fundsString = fundsString;
    return this;
  }

   /**
   * Get fundsString
   * @return fundsString
  **/
  @javax.annotation.Nullable
  public String getFundsString() {
    return fundsString;
  }

  public void setFundsString(String fundsString) {
    this.fundsString = fundsString;
  }


  public PlayerDetails bonusString(String bonusString) {
    this.bonusString = bonusString;
    return this;
  }

   /**
   * Get bonusString
   * @return bonusString
  **/
  @javax.annotation.Nullable
  public String getBonusString() {
    return bonusString;
  }

  public void setBonusString(String bonusString) {
    this.bonusString = bonusString;
  }


  public PlayerDetails color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public PlayerDetails limitGroupId(Integer limitGroupId) {
    this.limitGroupId = limitGroupId;
    return this;
  }

   /**
   * Get limitGroupId
   * @return limitGroupId
  **/
  @javax.annotation.Nullable
  public Integer getLimitGroupId() {
    return limitGroupId;
  }

  public void setLimitGroupId(Integer limitGroupId) {
    this.limitGroupId = limitGroupId;
  }


  public PlayerDetails limitGroupName(String limitGroupName) {
    this.limitGroupName = limitGroupName;
    return this;
  }

   /**
   * Get limitGroupName
   * @return limitGroupName
  **/
  @javax.annotation.Nullable
  public String getLimitGroupName() {
    return limitGroupName;
  }

  public void setLimitGroupName(String limitGroupName) {
    this.limitGroupName = limitGroupName;
  }


  public PlayerDetails limitGroupInheritanceType(String limitGroupInheritanceType) {
    this.limitGroupInheritanceType = limitGroupInheritanceType;
    return this;
  }

   /**
   * Get limitGroupInheritanceType
   * @return limitGroupInheritanceType
  **/
  @javax.annotation.Nullable
  public String getLimitGroupInheritanceType() {
    return limitGroupInheritanceType;
  }

  public void setLimitGroupInheritanceType(String limitGroupInheritanceType) {
    this.limitGroupInheritanceType = limitGroupInheritanceType;
  }


  public PlayerDetails multipleBonusId(Integer multipleBonusId) {
    this.multipleBonusId = multipleBonusId;
    return this;
  }

   /**
   * Get multipleBonusId
   * @return multipleBonusId
  **/
  @javax.annotation.Nullable
  public Integer getMultipleBonusId() {
    return multipleBonusId;
  }

  public void setMultipleBonusId(Integer multipleBonusId) {
    this.multipleBonusId = multipleBonusId;
  }


  public PlayerDetails multipleBonusName(String multipleBonusName) {
    this.multipleBonusName = multipleBonusName;
    return this;
  }

   /**
   * Get multipleBonusName
   * @return multipleBonusName
  **/
  @javax.annotation.Nullable
  public String getMultipleBonusName() {
    return multipleBonusName;
  }

  public void setMultipleBonusName(String multipleBonusName) {
    this.multipleBonusName = multipleBonusName;
  }


  public PlayerDetails multipleBonusInheritanceType(String multipleBonusInheritanceType) {
    this.multipleBonusInheritanceType = multipleBonusInheritanceType;
    return this;
  }

   /**
   * Get multipleBonusInheritanceType
   * @return multipleBonusInheritanceType
  **/
  @javax.annotation.Nullable
  public String getMultipleBonusInheritanceType() {
    return multipleBonusInheritanceType;
  }

  public void setMultipleBonusInheritanceType(String multipleBonusInheritanceType) {
    this.multipleBonusInheritanceType = multipleBonusInheritanceType;
  }


  public PlayerDetails isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Get isBlocked
   * @return isBlocked
  **/
  @javax.annotation.Nullable
  public Boolean getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }


  public PlayerDetails playerId(Integer playerId) {
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
    PlayerDetails playerDetails = (PlayerDetails) o;
    return Objects.equals(this.extId, playerDetails.extId) &&
        Objects.equals(this.playerName, playerDetails.playerName) &&
        Objects.equals(this.countryCode, playerDetails.countryCode) &&
        Objects.equals(this.countryName, playerDetails.countryName) &&
        Objects.equals(this.registrationDate, playerDetails.registrationDate) &&
        Objects.equals(this.affiliatePath, playerDetails.affiliatePath) &&
        Objects.equals(this.fundsString, playerDetails.fundsString) &&
        Objects.equals(this.bonusString, playerDetails.bonusString) &&
        Objects.equals(this.color, playerDetails.color) &&
        Objects.equals(this.limitGroupId, playerDetails.limitGroupId) &&
        Objects.equals(this.limitGroupName, playerDetails.limitGroupName) &&
        Objects.equals(this.limitGroupInheritanceType, playerDetails.limitGroupInheritanceType) &&
        Objects.equals(this.multipleBonusId, playerDetails.multipleBonusId) &&
        Objects.equals(this.multipleBonusName, playerDetails.multipleBonusName) &&
        Objects.equals(this.multipleBonusInheritanceType, playerDetails.multipleBonusInheritanceType) &&
        Objects.equals(this.isBlocked, playerDetails.isBlocked) &&
        Objects.equals(this.playerId, playerDetails.playerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(extId, playerName, countryCode, countryName, registrationDate, affiliatePath, fundsString, bonusString, color, limitGroupId, limitGroupName, limitGroupInheritanceType, multipleBonusId, multipleBonusName, multipleBonusInheritanceType, isBlocked, playerId);
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
    sb.append("class PlayerDetails {\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
    sb.append("    playerName: ").append(toIndentedString(playerName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    affiliatePath: ").append(toIndentedString(affiliatePath)).append("\n");
    sb.append("    fundsString: ").append(toIndentedString(fundsString)).append("\n");
    sb.append("    bonusString: ").append(toIndentedString(bonusString)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    limitGroupId: ").append(toIndentedString(limitGroupId)).append("\n");
    sb.append("    limitGroupName: ").append(toIndentedString(limitGroupName)).append("\n");
    sb.append("    limitGroupInheritanceType: ").append(toIndentedString(limitGroupInheritanceType)).append("\n");
    sb.append("    multipleBonusId: ").append(toIndentedString(multipleBonusId)).append("\n");
    sb.append("    multipleBonusName: ").append(toIndentedString(multipleBonusName)).append("\n");
    sb.append("    multipleBonusInheritanceType: ").append(toIndentedString(multipleBonusInheritanceType)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
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
    openapiFields.add("ExtId");
    openapiFields.add("PlayerName");
    openapiFields.add("CountryCode");
    openapiFields.add("CountryName");
    openapiFields.add("RegistrationDate");
    openapiFields.add("AffiliatePath");
    openapiFields.add("FundsString");
    openapiFields.add("BonusString");
    openapiFields.add("Color");
    openapiFields.add("LimitGroupId");
    openapiFields.add("LimitGroupName");
    openapiFields.add("LimitGroupInheritanceType");
    openapiFields.add("MultipleBonusId");
    openapiFields.add("MultipleBonusName");
    openapiFields.add("MultipleBonusInheritanceType");
    openapiFields.add("IsBlocked");
    openapiFields.add("PlayerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlayerDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayerDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerDetails is not found in the empty JSON string", PlayerDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlayerDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayerDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExtId") != null && !jsonObj.get("ExtId").isJsonNull()) && !jsonObj.get("ExtId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtId").toString()));
      }
      if ((jsonObj.get("PlayerName") != null && !jsonObj.get("PlayerName").isJsonNull()) && !jsonObj.get("PlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerName").toString()));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
      if ((jsonObj.get("CountryName") != null && !jsonObj.get("CountryName").isJsonNull()) && !jsonObj.get("CountryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryName").toString()));
      }
      if ((jsonObj.get("AffiliatePath") != null && !jsonObj.get("AffiliatePath").isJsonNull()) && !jsonObj.get("AffiliatePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AffiliatePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AffiliatePath").toString()));
      }
      if ((jsonObj.get("FundsString") != null && !jsonObj.get("FundsString").isJsonNull()) && !jsonObj.get("FundsString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FundsString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FundsString").toString()));
      }
      if ((jsonObj.get("BonusString") != null && !jsonObj.get("BonusString").isJsonNull()) && !jsonObj.get("BonusString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BonusString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BonusString").toString()));
      }
      if ((jsonObj.get("Color") != null && !jsonObj.get("Color").isJsonNull()) && !jsonObj.get("Color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Color").toString()));
      }
      if ((jsonObj.get("LimitGroupName") != null && !jsonObj.get("LimitGroupName").isJsonNull()) && !jsonObj.get("LimitGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LimitGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LimitGroupName").toString()));
      }
      if ((jsonObj.get("LimitGroupInheritanceType") != null && !jsonObj.get("LimitGroupInheritanceType").isJsonNull()) && !jsonObj.get("LimitGroupInheritanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LimitGroupInheritanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LimitGroupInheritanceType").toString()));
      }
      if ((jsonObj.get("MultipleBonusName") != null && !jsonObj.get("MultipleBonusName").isJsonNull()) && !jsonObj.get("MultipleBonusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MultipleBonusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MultipleBonusName").toString()));
      }
      if ((jsonObj.get("MultipleBonusInheritanceType") != null && !jsonObj.get("MultipleBonusInheritanceType").isJsonNull()) && !jsonObj.get("MultipleBonusInheritanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MultipleBonusInheritanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MultipleBonusInheritanceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerDetails>() {
           @Override
           public void write(JsonWriter out, PlayerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlayerDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerDetails
  * @throws IOException if the JSON string is invalid with respect to PlayerDetails
  */
  public static PlayerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerDetails.class);
  }

 /**
  * Convert an instance of PlayerDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

