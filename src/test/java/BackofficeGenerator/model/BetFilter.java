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
 * BetFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BetFilter {
  public static final String SERIALIZED_NAME_INT_BET_ID = "IntBetId";
  @SerializedName(SERIALIZED_NAME_INT_BET_ID)
  private Long intBetId;

  public static final String SERIALIZED_NAME_EXT_BET_ID = "ExtBetId";
  @SerializedName(SERIALIZED_NAME_EXT_BET_ID)
  private String extBetId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_TOTAL_STAKE = "TotalStake";
  @SerializedName(SERIALIZED_NAME_TOTAL_STAKE)
  private Long totalStake;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public BetFilter() {
  }

  public BetFilter intBetId(Long intBetId) {
    this.intBetId = intBetId;
    return this;
  }

   /**
   * Get intBetId
   * @return intBetId
  **/
  @javax.annotation.Nullable
  public Long getIntBetId() {
    return intBetId;
  }

  public void setIntBetId(Long intBetId) {
    this.intBetId = intBetId;
  }


  public BetFilter extBetId(String extBetId) {
    this.extBetId = extBetId;
    return this;
  }

   /**
   * Get extBetId
   * @return extBetId
  **/
  @javax.annotation.Nullable
  public String getExtBetId() {
    return extBetId;
  }

  public void setExtBetId(String extBetId) {
    this.extBetId = extBetId;
  }


  public BetFilter accountId(String accountId) {
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


  public BetFilter totalStake(Long totalStake) {
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


  public BetFilter operatorId(Integer operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @javax.annotation.Nullable
  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetFilter betFilter = (BetFilter) o;
    return Objects.equals(this.intBetId, betFilter.intBetId) &&
        Objects.equals(this.extBetId, betFilter.extBetId) &&
        Objects.equals(this.accountId, betFilter.accountId) &&
        Objects.equals(this.totalStake, betFilter.totalStake) &&
        Objects.equals(this.operatorId, betFilter.operatorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intBetId, extBetId, accountId, totalStake, operatorId);
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
    sb.append("class BetFilter {\n");
    sb.append("    intBetId: ").append(toIndentedString(intBetId)).append("\n");
    sb.append("    extBetId: ").append(toIndentedString(extBetId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    totalStake: ").append(toIndentedString(totalStake)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
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
    openapiFields.add("IntBetId");
    openapiFields.add("ExtBetId");
    openapiFields.add("AccountId");
    openapiFields.add("TotalStake");
    openapiFields.add("OperatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BetFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BetFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BetFilter is not found in the empty JSON string", BetFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BetFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BetFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExtBetId") != null && !jsonObj.get("ExtBetId").isJsonNull()) && !jsonObj.get("ExtBetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtBetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtBetId").toString()));
      }
      if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) && !jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BetFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BetFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BetFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BetFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<BetFilter>() {
           @Override
           public void write(JsonWriter out, BetFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BetFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BetFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BetFilter
  * @throws IOException if the JSON string is invalid with respect to BetFilter
  */
  public static BetFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BetFilter.class);
  }

 /**
  * Convert an instance of BetFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
