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
 * UpdateDraftRecordRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateDraftRecordRequest {
  public static final String SERIALIZED_NAME_DRAFT_RECORD_ID = "DraftRecordId";
  @SerializedName(SERIALIZED_NAME_DRAFT_RECORD_ID)
  private Integer draftRecordId;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_PREV_AMOUNT = "PrevAmount";
  @SerializedName(SERIALIZED_NAME_PREV_AMOUNT)
  private Double prevAmount;

  public static final String SERIALIZED_NAME_BINDED_PLAYER_ID = "BindedPlayerId";
  @SerializedName(SERIALIZED_NAME_BINDED_PLAYER_ID)
  private Integer bindedPlayerId;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public UpdateDraftRecordRequest() {
  }

  public UpdateDraftRecordRequest draftRecordId(Integer draftRecordId) {
    this.draftRecordId = draftRecordId;
    return this;
  }

   /**
   * Get draftRecordId
   * @return draftRecordId
  **/
  @javax.annotation.Nullable
  public Integer getDraftRecordId() {
    return draftRecordId;
  }

  public void setDraftRecordId(Integer draftRecordId) {
    this.draftRecordId = draftRecordId;
  }


  public UpdateDraftRecordRequest amount(Double amount) {
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


  public UpdateDraftRecordRequest prevAmount(Double prevAmount) {
    this.prevAmount = prevAmount;
    return this;
  }

   /**
   * Get prevAmount
   * @return prevAmount
  **/
  @javax.annotation.Nullable
  public Double getPrevAmount() {
    return prevAmount;
  }

  public void setPrevAmount(Double prevAmount) {
    this.prevAmount = prevAmount;
  }


  public UpdateDraftRecordRequest bindedPlayerId(Integer bindedPlayerId) {
    this.bindedPlayerId = bindedPlayerId;
    return this;
  }

   /**
   * Get bindedPlayerId
   * @return bindedPlayerId
  **/
  @javax.annotation.Nullable
  public Integer getBindedPlayerId() {
    return bindedPlayerId;
  }

  public void setBindedPlayerId(Integer bindedPlayerId) {
    this.bindedPlayerId = bindedPlayerId;
  }


  public UpdateDraftRecordRequest bonusCampaignId(Integer bonusCampaignId) {
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
    UpdateDraftRecordRequest updateDraftRecordRequest = (UpdateDraftRecordRequest) o;
    return Objects.equals(this.draftRecordId, updateDraftRecordRequest.draftRecordId) &&
        Objects.equals(this.amount, updateDraftRecordRequest.amount) &&
        Objects.equals(this.prevAmount, updateDraftRecordRequest.prevAmount) &&
        Objects.equals(this.bindedPlayerId, updateDraftRecordRequest.bindedPlayerId) &&
        Objects.equals(this.bonusCampaignId, updateDraftRecordRequest.bonusCampaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftRecordId, amount, prevAmount, bindedPlayerId, bonusCampaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDraftRecordRequest {\n");
    sb.append("    draftRecordId: ").append(toIndentedString(draftRecordId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    prevAmount: ").append(toIndentedString(prevAmount)).append("\n");
    sb.append("    bindedPlayerId: ").append(toIndentedString(bindedPlayerId)).append("\n");
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
    openapiFields.add("DraftRecordId");
    openapiFields.add("Amount");
    openapiFields.add("PrevAmount");
    openapiFields.add("BindedPlayerId");
    openapiFields.add("BonusCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateDraftRecordRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateDraftRecordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDraftRecordRequest is not found in the empty JSON string", UpdateDraftRecordRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateDraftRecordRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDraftRecordRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDraftRecordRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDraftRecordRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDraftRecordRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDraftRecordRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDraftRecordRequest>() {
           @Override
           public void write(JsonWriter out, UpdateDraftRecordRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDraftRecordRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDraftRecordRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDraftRecordRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateDraftRecordRequest
  */
  public static UpdateDraftRecordRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDraftRecordRequest.class);
  }

 /**
  * Convert an instance of UpdateDraftRecordRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
