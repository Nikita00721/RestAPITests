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
 * BonusDistributionCodesRequestFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BonusDistributionCodesRequestFilter {
  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private DistributionFilters filters;

  public static final String SERIALIZED_NAME_PLAYER_NAME = "PlayerName";
  @SerializedName(SERIALIZED_NAME_PLAYER_NAME)
  private String playerName;

  public static final String SERIALIZED_NAME_INT_PLAYER_ID = "IntPlayerId";
  @SerializedName(SERIALIZED_NAME_INT_PLAYER_ID)
  private String intPlayerId;

  public static final String SERIALIZED_NAME_EXT_PLAYER_ID = "ExtPlayerId";
  @SerializedName(SERIALIZED_NAME_EXT_PLAYER_ID)
  private String extPlayerId;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "MinAmount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private Double minAmount;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "MaxAmount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private Double maxAmount;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public BonusDistributionCodesRequestFilter() {
  }

  public BonusDistributionCodesRequestFilter filters(DistributionFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public DistributionFilters getFilters() {
    return filters;
  }

  public void setFilters(DistributionFilters filters) {
    this.filters = filters;
  }


  public BonusDistributionCodesRequestFilter playerName(String playerName) {
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


  public BonusDistributionCodesRequestFilter intPlayerId(String intPlayerId) {
    this.intPlayerId = intPlayerId;
    return this;
  }

   /**
   * Get intPlayerId
   * @return intPlayerId
  **/
  @javax.annotation.Nullable
  public String getIntPlayerId() {
    return intPlayerId;
  }

  public void setIntPlayerId(String intPlayerId) {
    this.intPlayerId = intPlayerId;
  }


  public BonusDistributionCodesRequestFilter extPlayerId(String extPlayerId) {
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


  public BonusDistributionCodesRequestFilter minAmount(Double minAmount) {
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


  public BonusDistributionCodesRequestFilter maxAmount(Double maxAmount) {
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


  public BonusDistributionCodesRequestFilter bonusCampaignId(Integer bonusCampaignId) {
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
    BonusDistributionCodesRequestFilter bonusDistributionCodesRequestFilter = (BonusDistributionCodesRequestFilter) o;
    return Objects.equals(this.filters, bonusDistributionCodesRequestFilter.filters) &&
        Objects.equals(this.playerName, bonusDistributionCodesRequestFilter.playerName) &&
        Objects.equals(this.intPlayerId, bonusDistributionCodesRequestFilter.intPlayerId) &&
        Objects.equals(this.extPlayerId, bonusDistributionCodesRequestFilter.extPlayerId) &&
        Objects.equals(this.minAmount, bonusDistributionCodesRequestFilter.minAmount) &&
        Objects.equals(this.maxAmount, bonusDistributionCodesRequestFilter.maxAmount) &&
        Objects.equals(this.bonusCampaignId, bonusDistributionCodesRequestFilter.bonusCampaignId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, playerName, intPlayerId, extPlayerId, minAmount, maxAmount, bonusCampaignId);
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
    sb.append("class BonusDistributionCodesRequestFilter {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    playerName: ").append(toIndentedString(playerName)).append("\n");
    sb.append("    intPlayerId: ").append(toIndentedString(intPlayerId)).append("\n");
    sb.append("    extPlayerId: ").append(toIndentedString(extPlayerId)).append("\n");
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
    openapiFields.add("Filters");
    openapiFields.add("PlayerName");
    openapiFields.add("IntPlayerId");
    openapiFields.add("ExtPlayerId");
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
  * @throws IOException if the JSON Element is invalid with respect to BonusDistributionCodesRequestFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BonusDistributionCodesRequestFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BonusDistributionCodesRequestFilter is not found in the empty JSON string", BonusDistributionCodesRequestFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BonusDistributionCodesRequestFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BonusDistributionCodesRequestFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Filters`
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        DistributionFilters.validateJsonElement(jsonObj.get("Filters"));
      }
      if ((jsonObj.get("PlayerName") != null && !jsonObj.get("PlayerName").isJsonNull()) && !jsonObj.get("PlayerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PlayerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PlayerName").toString()));
      }
      if ((jsonObj.get("IntPlayerId") != null && !jsonObj.get("IntPlayerId").isJsonNull()) && !jsonObj.get("IntPlayerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IntPlayerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IntPlayerId").toString()));
      }
      if ((jsonObj.get("ExtPlayerId") != null && !jsonObj.get("ExtPlayerId").isJsonNull()) && !jsonObj.get("ExtPlayerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtPlayerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtPlayerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BonusDistributionCodesRequestFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BonusDistributionCodesRequestFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BonusDistributionCodesRequestFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BonusDistributionCodesRequestFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<BonusDistributionCodesRequestFilter>() {
           @Override
           public void write(JsonWriter out, BonusDistributionCodesRequestFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BonusDistributionCodesRequestFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BonusDistributionCodesRequestFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BonusDistributionCodesRequestFilter
  * @throws IOException if the JSON string is invalid with respect to BonusDistributionCodesRequestFilter
  */
  public static BonusDistributionCodesRequestFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BonusDistributionCodesRequestFilter.class);
  }

 /**
  * Convert an instance of BonusDistributionCodesRequestFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

