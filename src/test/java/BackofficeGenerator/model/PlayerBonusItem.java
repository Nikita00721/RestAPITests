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
 * PlayerBonusItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class PlayerBonusItem {
  public static final String SERIALIZED_NAME_EXT_PLAYER_ID = "ExtPlayerId";
  @SerializedName(SERIALIZED_NAME_EXT_PLAYER_ID)
  private String extPlayerId;

  public static final String SERIALIZED_NAME_PLAYER_NAME = "PlayerName";
  @SerializedName(SERIALIZED_NAME_PLAYER_NAME)
  private String playerName;

  public static final String SERIALIZED_NAME_LICENSE_NAME = "LicenseName";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public static final String SERIALIZED_NAME_BRAND_NAME = "BrandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_BRAND_CONFIG_NAME = "BrandConfigName";
  @SerializedName(SERIALIZED_NAME_BRAND_CONFIG_NAME)
  private String brandConfigName;

  public static final String SERIALIZED_NAME_AFFILIATE_NAME = "AffiliateName";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_NAME)
  private String affiliateName;

  public static final String SERIALIZED_NAME_AFFILIATE_CONFIG_NAME = "AffiliateConfigName";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_CONFIG_NAME)
  private String affiliateConfigName;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public static final String SERIALIZED_NAME_CONFIG_NAME = "ConfigName";
  @SerializedName(SERIALIZED_NAME_CONFIG_NAME)
  private String configName;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public PlayerBonusItem() {
  }

  public PlayerBonusItem extPlayerId(String extPlayerId) {
    this.extPlayerId = extPlayerId;
    return this;
  }

   /**
   * Get extPlayerId
   * @return extPlayerId
  **/
  @javax.annotation.Nullable
  public String getExtPlayerId() {
    return extPlayerId;
  }

  public void setExtPlayerId(String extPlayerId) {
    this.extPlayerId = extPlayerId;
  }


  public PlayerBonusItem playerName(String playerName) {
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


  public PlayerBonusItem licenseName(String licenseName) {
    this.licenseName = licenseName;
    return this;
  }

   /**
   * Get licenseName
   * @return licenseName
  **/
  @javax.annotation.Nullable
  public String getLicenseName() {
    return licenseName;
  }

  public void setLicenseName(String licenseName) {
    this.licenseName = licenseName;
  }


  public PlayerBonusItem brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }


  public PlayerBonusItem brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public PlayerBonusItem brandConfigName(String brandConfigName) {
    this.brandConfigName = brandConfigName;
    return this;
  }

   /**
   * Get brandConfigName
   * @return brandConfigName
  **/
  @javax.annotation.Nullable
  public String getBrandConfigName() {
    return brandConfigName;
  }

  public void setBrandConfigName(String brandConfigName) {
    this.brandConfigName = brandConfigName;
  }


  public PlayerBonusItem affiliateName(String affiliateName) {
    this.affiliateName = affiliateName;
    return this;
  }

   /**
   * Get affiliateName
   * @return affiliateName
  **/
  @javax.annotation.Nullable
  public String getAffiliateName() {
    return affiliateName;
  }

  public void setAffiliateName(String affiliateName) {
    this.affiliateName = affiliateName;
  }


  public PlayerBonusItem affiliateConfigName(String affiliateConfigName) {
    this.affiliateConfigName = affiliateConfigName;
    return this;
  }

   /**
   * Get affiliateConfigName
   * @return affiliateConfigName
  **/
  @javax.annotation.Nullable
  public String getAffiliateConfigName() {
    return affiliateConfigName;
  }

  public void setAffiliateConfigName(String affiliateConfigName) {
    this.affiliateConfigName = affiliateConfigName;
  }


  public PlayerBonusItem configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }


  public PlayerBonusItem configName(String configName) {
    this.configName = configName;
    return this;
  }

   /**
   * Get configName
   * @return configName
  **/
  @javax.annotation.Nullable
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }


  public PlayerBonusItem playerId(Integer playerId) {
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
    PlayerBonusItem playerBonusItem = (PlayerBonusItem) o;
    return Objects.equals(this.extPlayerId, playerBonusItem.extPlayerId) &&
        Objects.equals(this.playerName, playerBonusItem.playerName) &&
        Objects.equals(this.licenseName, playerBonusItem.licenseName) &&
        Objects.equals(this.brandId, playerBonusItem.brandId) &&
        Objects.equals(this.brandName, playerBonusItem.brandName) &&
        Objects.equals(this.brandConfigName, playerBonusItem.brandConfigName) &&
        Objects.equals(this.affiliateName, playerBonusItem.affiliateName) &&
        Objects.equals(this.affiliateConfigName, playerBonusItem.affiliateConfigName) &&
        Objects.equals(this.configId, playerBonusItem.configId) &&
        Objects.equals(this.configName, playerBonusItem.configName) &&
        Objects.equals(this.playerId, playerBonusItem.playerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(extPlayerId, playerName, licenseName, brandId, brandName, brandConfigName, affiliateName, affiliateConfigName, configId, configName, playerId);
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
    sb.append("class PlayerBonusItem {\n");
    sb.append("    extPlayerId: ").append(toIndentedString(extPlayerId)).append("\n");
    sb.append("    playerName: ").append(toIndentedString(playerName)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandConfigName: ").append(toIndentedString(brandConfigName)).append("\n");
    sb.append("    affiliateName: ").append(toIndentedString(affiliateName)).append("\n");
    sb.append("    affiliateConfigName: ").append(toIndentedString(affiliateConfigName)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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
    openapiFields.add("ExtPlayerId");
    openapiFields.add("PlayerName");
    openapiFields.add("LicenseName");
    openapiFields.add("BrandId");
    openapiFields.add("BrandName");
    openapiFields.add("BrandConfigName");
    openapiFields.add("AffiliateName");
    openapiFields.add("AffiliateConfigName");
    openapiFields.add("ConfigId");
    openapiFields.add("ConfigName");
    openapiFields.add("PlayerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlayerBonusItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayerBonusItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerBonusItem is not found in the empty JSON string", PlayerBonusItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlayerBonusItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayerBonusItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExtPlayerId") != null && !jsonObj.get("ExtPlayerId").isJsonNull()) && !jsonObj.get("ExtPlayerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtPlayerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtPlayerId").toString()));
      }
      if ((jsonObj.get("PlayerName") != null && !jsonObj.get("PlayerName").isJsonNull()) && !jsonObj.get("PlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerName").toString()));
      }
      if ((jsonObj.get("LicenseName") != null && !jsonObj.get("LicenseName").isJsonNull()) && !jsonObj.get("LicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LicenseName").toString()));
      }
      if ((jsonObj.get("BrandName") != null && !jsonObj.get("BrandName").isJsonNull()) && !jsonObj.get("BrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandName").toString()));
      }
      if ((jsonObj.get("BrandConfigName") != null && !jsonObj.get("BrandConfigName").isJsonNull()) && !jsonObj.get("BrandConfigName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandConfigName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandConfigName").toString()));
      }
      if ((jsonObj.get("AffiliateName") != null && !jsonObj.get("AffiliateName").isJsonNull()) && !jsonObj.get("AffiliateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AffiliateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AffiliateName").toString()));
      }
      if ((jsonObj.get("AffiliateConfigName") != null && !jsonObj.get("AffiliateConfigName").isJsonNull()) && !jsonObj.get("AffiliateConfigName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AffiliateConfigName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AffiliateConfigName").toString()));
      }
      if ((jsonObj.get("ConfigName") != null && !jsonObj.get("ConfigName").isJsonNull()) && !jsonObj.get("ConfigName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ConfigName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerBonusItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerBonusItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerBonusItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerBonusItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerBonusItem>() {
           @Override
           public void write(JsonWriter out, PlayerBonusItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerBonusItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlayerBonusItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerBonusItem
  * @throws IOException if the JSON string is invalid with respect to PlayerBonusItem
  */
  public static PlayerBonusItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerBonusItem.class);
  }

 /**
  * Convert an instance of PlayerBonusItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
