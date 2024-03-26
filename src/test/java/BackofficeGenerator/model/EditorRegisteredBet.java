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
 * EditorRegisteredBet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class EditorRegisteredBet {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_TOTAL_STAKE = "TotalStake";
  @SerializedName(SERIALIZED_NAME_TOTAL_STAKE)
  private Long totalStake;

  public static final String SERIALIZED_NAME_TOTAL_WIN = "TotalWin";
  @SerializedName(SERIALIZED_NAME_TOTAL_WIN)
  private Long totalWin;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_PROCESSED_STATUS = "ProcessedStatus";
  @SerializedName(SERIALIZED_NAME_PROCESSED_STATUS)
  private Integer processedStatus;

  public static final String SERIALIZED_NAME_PROCESSED_MESSAGE = "ProcessedMessage";
  @SerializedName(SERIALIZED_NAME_PROCESSED_MESSAGE)
  private String processedMessage;

  public static final String SERIALIZED_NAME_EXT_ID = "ExtId";
  @SerializedName(SERIALIZED_NAME_EXT_ID)
  private String extId;

  public EditorRegisteredBet() {
  }

  public EditorRegisteredBet accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EditorRegisteredBet createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public EditorRegisteredBet totalStake(Long totalStake) {
    this.totalStake = totalStake;
    return this;
  }

   /**
   * Get totalStake
   * @return totalStake
  **/
  @javax.annotation.Nullable
  public Long getTotalStake() {
    return totalStake;
  }

  public void setTotalStake(Long totalStake) {
    this.totalStake = totalStake;
  }


  public EditorRegisteredBet totalWin(Long totalWin) {
    this.totalWin = totalWin;
    return this;
  }

   /**
   * Get totalWin
   * @return totalWin
  **/
  @javax.annotation.Nullable
  public Long getTotalWin() {
    return totalWin;
  }

  public void setTotalWin(Long totalWin) {
    this.totalWin = totalWin;
  }


  public EditorRegisteredBet status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public EditorRegisteredBet processedStatus(Integer processedStatus) {
    this.processedStatus = processedStatus;
    return this;
  }

   /**
   * Get processedStatus
   * @return processedStatus
  **/
  @javax.annotation.Nullable
  public Integer getProcessedStatus() {
    return processedStatus;
  }

  public void setProcessedStatus(Integer processedStatus) {
    this.processedStatus = processedStatus;
  }


  public EditorRegisteredBet processedMessage(String processedMessage) {
    this.processedMessage = processedMessage;
    return this;
  }

   /**
   * Get processedMessage
   * @return processedMessage
  **/
  @javax.annotation.Nullable
  public String getProcessedMessage() {
    return processedMessage;
  }

  public void setProcessedMessage(String processedMessage) {
    this.processedMessage = processedMessage;
  }


  public EditorRegisteredBet extId(String extId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditorRegisteredBet editorRegisteredBet = (EditorRegisteredBet) o;
    return Objects.equals(this.accountId, editorRegisteredBet.accountId) &&
        Objects.equals(this.createdDate, editorRegisteredBet.createdDate) &&
        Objects.equals(this.totalStake, editorRegisteredBet.totalStake) &&
        Objects.equals(this.totalWin, editorRegisteredBet.totalWin) &&
        Objects.equals(this.status, editorRegisteredBet.status) &&
        Objects.equals(this.processedStatus, editorRegisteredBet.processedStatus) &&
        Objects.equals(this.processedMessage, editorRegisteredBet.processedMessage) &&
        Objects.equals(this.extId, editorRegisteredBet.extId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdDate, totalStake, totalWin, status, processedStatus, processedMessage, extId);
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
    sb.append("class EditorRegisteredBet {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    totalStake: ").append(toIndentedString(totalStake)).append("\n");
    sb.append("    totalWin: ").append(toIndentedString(totalWin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    processedStatus: ").append(toIndentedString(processedStatus)).append("\n");
    sb.append("    processedMessage: ").append(toIndentedString(processedMessage)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
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
    openapiFields.add("AccountId");
    openapiFields.add("CreatedDate");
    openapiFields.add("TotalStake");
    openapiFields.add("TotalWin");
    openapiFields.add("Status");
    openapiFields.add("ProcessedStatus");
    openapiFields.add("ProcessedMessage");
    openapiFields.add("ExtId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EditorRegisteredBet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditorRegisteredBet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditorRegisteredBet is not found in the empty JSON string", EditorRegisteredBet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EditorRegisteredBet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EditorRegisteredBet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) && !jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("ProcessedMessage") != null && !jsonObj.get("ProcessedMessage").isJsonNull()) && !jsonObj.get("ProcessedMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProcessedMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProcessedMessage").toString()));
      }
      if ((jsonObj.get("ExtId") != null && !jsonObj.get("ExtId").isJsonNull()) && !jsonObj.get("ExtId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditorRegisteredBet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditorRegisteredBet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditorRegisteredBet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditorRegisteredBet.class));

       return (TypeAdapter<T>) new TypeAdapter<EditorRegisteredBet>() {
           @Override
           public void write(JsonWriter out, EditorRegisteredBet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditorRegisteredBet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EditorRegisteredBet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EditorRegisteredBet
  * @throws IOException if the JSON string is invalid with respect to EditorRegisteredBet
  */
  public static EditorRegisteredBet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditorRegisteredBet.class);
  }

 /**
  * Convert an instance of EditorRegisteredBet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

