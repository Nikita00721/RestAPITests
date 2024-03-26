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
 * CurrencySettingsRequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CurrencySettingsRequestItem {
  public static final String SERIALIZED_NAME_CURRENCY_ID = "CurrencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;

  public static final String SERIALIZED_NAME_STAKE = "Stake";
  @SerializedName(SERIALIZED_NAME_STAKE)
  private Double stake;

  public static final String SERIALIZED_NAME_WINNINGS = "Winnings";
  @SerializedName(SERIALIZED_NAME_WINNINGS)
  private Double winnings;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public CurrencySettingsRequestItem() {
  }

  public CurrencySettingsRequestItem currencyId(Integer currencyId) {
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


  public CurrencySettingsRequestItem stake(Double stake) {
    this.stake = stake;
    return this;
  }

   /**
   * Get stake
   * @return stake
  **/
  @javax.annotation.Nullable
  public Double getStake() {
    return stake;
  }

  public void setStake(Double stake) {
    this.stake = stake;
  }


  public CurrencySettingsRequestItem winnings(Double winnings) {
    this.winnings = winnings;
    return this;
  }

   /**
   * Get winnings
   * @return winnings
  **/
  @javax.annotation.Nullable
  public Double getWinnings() {
    return winnings;
  }

  public void setWinnings(Double winnings) {
    this.winnings = winnings;
  }


  public CurrencySettingsRequestItem isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencySettingsRequestItem currencySettingsRequestItem = (CurrencySettingsRequestItem) o;
    return Objects.equals(this.currencyId, currencySettingsRequestItem.currencyId) &&
        Objects.equals(this.stake, currencySettingsRequestItem.stake) &&
        Objects.equals(this.winnings, currencySettingsRequestItem.winnings) &&
        Objects.equals(this.isDefault, currencySettingsRequestItem.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyId, stake, winnings, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencySettingsRequestItem {\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    stake: ").append(toIndentedString(stake)).append("\n");
    sb.append("    winnings: ").append(toIndentedString(winnings)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
    openapiFields.add("CurrencyId");
    openapiFields.add("Stake");
    openapiFields.add("Winnings");
    openapiFields.add("IsDefault");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CurrencySettingsRequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CurrencySettingsRequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrencySettingsRequestItem is not found in the empty JSON string", CurrencySettingsRequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CurrencySettingsRequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrencySettingsRequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrencySettingsRequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrencySettingsRequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrencySettingsRequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrencySettingsRequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrencySettingsRequestItem>() {
           @Override
           public void write(JsonWriter out, CurrencySettingsRequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrencySettingsRequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurrencySettingsRequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrencySettingsRequestItem
  * @throws IOException if the JSON string is invalid with respect to CurrencySettingsRequestItem
  */
  public static CurrencySettingsRequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrencySettingsRequestItem.class);
  }

 /**
  * Convert an instance of CurrencySettingsRequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

