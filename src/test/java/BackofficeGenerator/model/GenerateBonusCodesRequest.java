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
 * GenerateBonusCodesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GenerateBonusCodesRequest {
  public static final String SERIALIZED_NAME_FREE_PLAN_AMOUNT = "FreePlanAmount";
  @SerializedName(SERIALIZED_NAME_FREE_PLAN_AMOUNT)
  private Double freePlanAmount;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public GenerateBonusCodesRequest() {
  }

  public GenerateBonusCodesRequest freePlanAmount(Double freePlanAmount) {
    this.freePlanAmount = freePlanAmount;
    return this;
  }

   /**
   * Get freePlanAmount
   * @return freePlanAmount
  **/
  @javax.annotation.Nullable
  public Double getFreePlanAmount() {
    return freePlanAmount;
  }

  public void setFreePlanAmount(Double freePlanAmount) {
    this.freePlanAmount = freePlanAmount;
  }


  public GenerateBonusCodesRequest bonusCampaignId(Integer bonusCampaignId) {
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
    GenerateBonusCodesRequest generateBonusCodesRequest = (GenerateBonusCodesRequest) o;
    return Objects.equals(this.freePlanAmount, generateBonusCodesRequest.freePlanAmount) &&
        Objects.equals(this.bonusCampaignId, generateBonusCodesRequest.bonusCampaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freePlanAmount, bonusCampaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBonusCodesRequest {\n");
    sb.append("    freePlanAmount: ").append(toIndentedString(freePlanAmount)).append("\n");
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
    openapiFields.add("FreePlanAmount");
    openapiFields.add("BonusCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenerateBonusCodesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateBonusCodesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateBonusCodesRequest is not found in the empty JSON string", GenerateBonusCodesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateBonusCodesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateBonusCodesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateBonusCodesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateBonusCodesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateBonusCodesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateBonusCodesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateBonusCodesRequest>() {
           @Override
           public void write(JsonWriter out, GenerateBonusCodesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateBonusCodesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateBonusCodesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateBonusCodesRequest
  * @throws IOException if the JSON string is invalid with respect to GenerateBonusCodesRequest
  */
  public static GenerateBonusCodesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateBonusCodesRequest.class);
  }

 /**
  * Convert an instance of GenerateBonusCodesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

