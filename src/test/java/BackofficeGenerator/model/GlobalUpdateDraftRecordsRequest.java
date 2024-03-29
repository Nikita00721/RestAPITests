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
 * GlobalUpdateDraftRecordsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GlobalUpdateDraftRecordsRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_RECORDS_TO_UPDATE = "RecordsToUpdate";
  @SerializedName(SERIALIZED_NAME_RECORDS_TO_UPDATE)
  private List<RecordsToUpdateRequestItem> recordsToUpdate;

  public static final String SERIALIZED_NAME_BONUS_CAMPAIGN_ID = "BonusCampaignId";
  @SerializedName(SERIALIZED_NAME_BONUS_CAMPAIGN_ID)
  private Integer bonusCampaignId;

  public GlobalUpdateDraftRecordsRequest() {
  }

  public GlobalUpdateDraftRecordsRequest amount(Double amount) {
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


  public GlobalUpdateDraftRecordsRequest recordsToUpdate(List<RecordsToUpdateRequestItem> recordsToUpdate) {
    this.recordsToUpdate = recordsToUpdate;
    return this;
  }

  public GlobalUpdateDraftRecordsRequest addRecordsToUpdateItem(RecordsToUpdateRequestItem recordsToUpdateItem) {
    if (this.recordsToUpdate == null) {
      this.recordsToUpdate = new ArrayList<>();
    }
    this.recordsToUpdate.add(recordsToUpdateItem);
    return this;
  }

   /**
   * Get recordsToUpdate
   * @return recordsToUpdate
  **/
  @javax.annotation.Nullable
  public List<RecordsToUpdateRequestItem> getRecordsToUpdate() {
    return recordsToUpdate;
  }

  public void setRecordsToUpdate(List<RecordsToUpdateRequestItem> recordsToUpdate) {
    this.recordsToUpdate = recordsToUpdate;
  }


  public GlobalUpdateDraftRecordsRequest bonusCampaignId(Integer bonusCampaignId) {
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
    GlobalUpdateDraftRecordsRequest globalUpdateDraftRecordsRequest = (GlobalUpdateDraftRecordsRequest) o;
    return Objects.equals(this.amount, globalUpdateDraftRecordsRequest.amount) &&
        Objects.equals(this.recordsToUpdate, globalUpdateDraftRecordsRequest.recordsToUpdate) &&
        Objects.equals(this.bonusCampaignId, globalUpdateDraftRecordsRequest.bonusCampaignId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, recordsToUpdate, bonusCampaignId);
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
    sb.append("class GlobalUpdateDraftRecordsRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    recordsToUpdate: ").append(toIndentedString(recordsToUpdate)).append("\n");
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
    openapiFields.add("Amount");
    openapiFields.add("RecordsToUpdate");
    openapiFields.add("BonusCampaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GlobalUpdateDraftRecordsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalUpdateDraftRecordsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalUpdateDraftRecordsRequest is not found in the empty JSON string", GlobalUpdateDraftRecordsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalUpdateDraftRecordsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalUpdateDraftRecordsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("RecordsToUpdate") != null && !jsonObj.get("RecordsToUpdate").isJsonNull()) {
        JsonArray jsonArrayrecordsToUpdate = jsonObj.getAsJsonArray("RecordsToUpdate");
        if (jsonArrayrecordsToUpdate != null) {
          // ensure the json data is an array
          if (!jsonObj.get("RecordsToUpdate").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `RecordsToUpdate` to be an array in the JSON string but got `%s`", jsonObj.get("RecordsToUpdate").toString()));
          }

          // validate the optional field `RecordsToUpdate` (array)
          for (int i = 0; i < jsonArrayrecordsToUpdate.size(); i++) {
            RecordsToUpdateRequestItem.validateJsonElement(jsonArrayrecordsToUpdate.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalUpdateDraftRecordsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalUpdateDraftRecordsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalUpdateDraftRecordsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalUpdateDraftRecordsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalUpdateDraftRecordsRequest>() {
           @Override
           public void write(JsonWriter out, GlobalUpdateDraftRecordsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalUpdateDraftRecordsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GlobalUpdateDraftRecordsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GlobalUpdateDraftRecordsRequest
  * @throws IOException if the JSON string is invalid with respect to GlobalUpdateDraftRecordsRequest
  */
  public static GlobalUpdateDraftRecordsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalUpdateDraftRecordsRequest.class);
  }

 /**
  * Convert an instance of GlobalUpdateDraftRecordsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

