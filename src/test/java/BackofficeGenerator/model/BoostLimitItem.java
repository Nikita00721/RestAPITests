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
 * BoostLimitItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostLimitItem {
  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "TemplateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "CurrencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;

  public static final String SERIALIZED_NAME_CURRENCY_NAME = "CurrencyName";
  @SerializedName(SERIALIZED_NAME_CURRENCY_NAME)
  private String currencyName;

  public static final String SERIALIZED_NAME_STAKE_LIMIT = "StakeLimit";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT)
  private Double stakeLimit;

  public static final String SERIALIZED_NAME_NET_WIN_LIMIT = "NetWinLimit";
  @SerializedName(SERIALIZED_NAME_NET_WIN_LIMIT)
  private Double netWinLimit;

  public static final String SERIALIZED_NAME_IS_BASE_CURRENCY = "IsBaseCurrency";
  @SerializedName(SERIALIZED_NAME_IS_BASE_CURRENCY)
  private Boolean isBaseCurrency;

  public static final String SERIALIZED_NAME_BOOST_LIMIT_ID = "BoostLimitId";
  @SerializedName(SERIALIZED_NAME_BOOST_LIMIT_ID)
  private Integer boostLimitId;

  public BoostLimitItem() {
  }

  public BoostLimitItem templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public BoostLimitItem currencyId(Integer currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @javax.annotation.Nullable
  public Integer getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Integer currencyId) {
    this.currencyId = currencyId;
  }


  public BoostLimitItem currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }

   /**
   * Get currencyName
   * @return currencyName
  **/
  @javax.annotation.Nullable
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }


  public BoostLimitItem stakeLimit(Double stakeLimit) {
    this.stakeLimit = stakeLimit;
    return this;
  }

   /**
   * Get stakeLimit
   * @return stakeLimit
  **/
  @javax.annotation.Nullable
  public Double getStakeLimit() {
    return stakeLimit;
  }

  public void setStakeLimit(Double stakeLimit) {
    this.stakeLimit = stakeLimit;
  }


  public BoostLimitItem netWinLimit(Double netWinLimit) {
    this.netWinLimit = netWinLimit;
    return this;
  }

   /**
   * Get netWinLimit
   * @return netWinLimit
  **/
  @javax.annotation.Nullable
  public Double getNetWinLimit() {
    return netWinLimit;
  }

  public void setNetWinLimit(Double netWinLimit) {
    this.netWinLimit = netWinLimit;
  }


  public BoostLimitItem isBaseCurrency(Boolean isBaseCurrency) {
    this.isBaseCurrency = isBaseCurrency;
    return this;
  }

   /**
   * Get isBaseCurrency
   * @return isBaseCurrency
  **/
  @javax.annotation.Nullable
  public Boolean getIsBaseCurrency() {
    return isBaseCurrency;
  }

  public void setIsBaseCurrency(Boolean isBaseCurrency) {
    this.isBaseCurrency = isBaseCurrency;
  }


  public BoostLimitItem boostLimitId(Integer boostLimitId) {
    this.boostLimitId = boostLimitId;
    return this;
  }

   /**
   * Get boostLimitId
   * @return boostLimitId
  **/
  @javax.annotation.Nullable
  public Integer getBoostLimitId() {
    return boostLimitId;
  }

  public void setBoostLimitId(Integer boostLimitId) {
    this.boostLimitId = boostLimitId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostLimitItem boostLimitItem = (BoostLimitItem) o;
    return Objects.equals(this.templateName, boostLimitItem.templateName) &&
        Objects.equals(this.currencyId, boostLimitItem.currencyId) &&
        Objects.equals(this.currencyName, boostLimitItem.currencyName) &&
        Objects.equals(this.stakeLimit, boostLimitItem.stakeLimit) &&
        Objects.equals(this.netWinLimit, boostLimitItem.netWinLimit) &&
        Objects.equals(this.isBaseCurrency, boostLimitItem.isBaseCurrency) &&
        Objects.equals(this.boostLimitId, boostLimitItem.boostLimitId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, currencyId, currencyName, stakeLimit, netWinLimit, isBaseCurrency, boostLimitId);
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
    sb.append("class BoostLimitItem {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    stakeLimit: ").append(toIndentedString(stakeLimit)).append("\n");
    sb.append("    netWinLimit: ").append(toIndentedString(netWinLimit)).append("\n");
    sb.append("    isBaseCurrency: ").append(toIndentedString(isBaseCurrency)).append("\n");
    sb.append("    boostLimitId: ").append(toIndentedString(boostLimitId)).append("\n");
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
    openapiFields.add("TemplateName");
    openapiFields.add("CurrencyId");
    openapiFields.add("CurrencyName");
    openapiFields.add("StakeLimit");
    openapiFields.add("NetWinLimit");
    openapiFields.add("IsBaseCurrency");
    openapiFields.add("BoostLimitId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostLimitItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostLimitItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostLimitItem is not found in the empty JSON string", BoostLimitItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostLimitItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostLimitItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TemplateName") != null && !jsonObj.get("TemplateName").isJsonNull()) && !jsonObj.get("TemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TemplateName").toString()));
      }
      if ((jsonObj.get("CurrencyName") != null && !jsonObj.get("CurrencyName").isJsonNull()) && !jsonObj.get("CurrencyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CurrencyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CurrencyName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostLimitItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostLimitItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostLimitItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostLimitItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostLimitItem>() {
           @Override
           public void write(JsonWriter out, BoostLimitItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostLimitItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostLimitItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostLimitItem
  * @throws IOException if the JSON string is invalid with respect to BoostLimitItem
  */
  public static BoostLimitItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostLimitItem.class);
  }

 /**
  * Convert an instance of BoostLimitItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

