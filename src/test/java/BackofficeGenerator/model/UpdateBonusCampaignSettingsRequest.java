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
 * UpdateBonusCampaignSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateBonusCampaignSettingsRequest {
  public static final String SERIALIZED_NAME_CODE_NAME = "CodeName";
  @SerializedName(SERIALIZED_NAME_CODE_NAME)
  private String codeName;

  public static final String SERIALIZED_NAME_TOTAL_PLAN_AMOUNT = "TotalPlanAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAN_AMOUNT)
  private Double totalPlanAmount;

  public static final String SERIALIZED_NAME_TOTAL_PLAN_COUNT = "TotalPlanCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAN_COUNT)
  private Integer totalPlanCount;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public UpdateBonusCampaignSettingsRequest() {
  }

  public UpdateBonusCampaignSettingsRequest codeName(String codeName) {
    this.codeName = codeName;
    return this;
  }

   /**
   * Get codeName
   * @return codeName
  **/
  @javax.annotation.Nullable
  public String getCodeName() {
    return codeName;
  }

  public void setCodeName(String codeName) {
    this.codeName = codeName;
  }


  public UpdateBonusCampaignSettingsRequest totalPlanAmount(Double totalPlanAmount) {
    this.totalPlanAmount = totalPlanAmount;
    return this;
  }

   /**
   * Get totalPlanAmount
   * @return totalPlanAmount
  **/
  @javax.annotation.Nullable
  public Double getTotalPlanAmount() {
    return totalPlanAmount;
  }

  public void setTotalPlanAmount(Double totalPlanAmount) {
    this.totalPlanAmount = totalPlanAmount;
  }


  public UpdateBonusCampaignSettingsRequest totalPlanCount(Integer totalPlanCount) {
    this.totalPlanCount = totalPlanCount;
    return this;
  }

   /**
   * Get totalPlanCount
   * @return totalPlanCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalPlanCount() {
    return totalPlanCount;
  }

  public void setTotalPlanCount(Integer totalPlanCount) {
    this.totalPlanCount = totalPlanCount;
  }


  public UpdateBonusCampaignSettingsRequest bonusCampaignId(Integer bonusCampaignId) {
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
    UpdateBonusCampaignSettingsRequest updateBonusCampaignSettingsRequest = (UpdateBonusCampaignSettingsRequest) o;
    return Objects.equals(this.codeName, updateBonusCampaignSettingsRequest.codeName) &&
        Objects.equals(this.totalPlanAmount, updateBonusCampaignSettingsRequest.totalPlanAmount) &&
        Objects.equals(this.totalPlanCount, updateBonusCampaignSettingsRequest.totalPlanCount) &&
        Objects.equals(this.bonusCampaignId, updateBonusCampaignSettingsRequest.bonusCampaignId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeName, totalPlanAmount, totalPlanCount, bonusCampaignId);
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
    sb.append("class UpdateBonusCampaignSettingsRequest {\n");
    sb.append("    codeName: ").append(toIndentedString(codeName)).append("\n");
    sb.append("    totalPlanAmount: ").append(toIndentedString(totalPlanAmount)).append("\n");
    sb.append("    totalPlanCount: ").append(toIndentedString(totalPlanCount)).append("\n");
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
    openapiFields.add("CodeName");
    openapiFields.add("TotalPlanAmount");
    openapiFields.add("TotalPlanCount");
    openapiFields.add("BonusCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateBonusCampaignSettingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBonusCampaignSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBonusCampaignSettingsRequest is not found in the empty JSON string", UpdateBonusCampaignSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBonusCampaignSettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBonusCampaignSettingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CodeName") != null && !jsonObj.get("CodeName").isJsonNull()) && !jsonObj.get("CodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CodeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBonusCampaignSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBonusCampaignSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBonusCampaignSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBonusCampaignSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBonusCampaignSettingsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBonusCampaignSettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBonusCampaignSettingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBonusCampaignSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBonusCampaignSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBonusCampaignSettingsRequest
  */
  public static UpdateBonusCampaignSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBonusCampaignSettingsRequest.class);
  }

 /**
  * Convert an instance of UpdateBonusCampaignSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

