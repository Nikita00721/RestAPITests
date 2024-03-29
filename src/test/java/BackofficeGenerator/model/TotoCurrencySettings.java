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
 * TotoCurrencySettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TotoCurrencySettings {
  public static final String SERIALIZED_NAME_CURRENCY_ID = "CurrencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;

  public static final String SERIALIZED_NAME_CURRENCY_NAME = "CurrencyName";
  @SerializedName(SERIALIZED_NAME_CURRENCY_NAME)
  private String currencyName;

  public static final String SERIALIZED_NAME_STAKE = "Stake";
  @SerializedName(SERIALIZED_NAME_STAKE)
  private Double stake;

  public static final String SERIALIZED_NAME_WINNINGS = "Winnings";
  @SerializedName(SERIALIZED_NAME_WINNINGS)
  private Double winnings;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public TotoCurrencySettings() {
  }

  public TotoCurrencySettings currencyId(Integer currencyId) {
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


  public TotoCurrencySettings currencyName(String currencyName) {
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


  public TotoCurrencySettings stake(Double stake) {
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


  public TotoCurrencySettings winnings(Double winnings) {
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


  public TotoCurrencySettings isDefault(Boolean isDefault) {
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
    TotoCurrencySettings totoCurrencySettings = (TotoCurrencySettings) o;
    return Objects.equals(this.currencyId, totoCurrencySettings.currencyId) &&
        Objects.equals(this.currencyName, totoCurrencySettings.currencyName) &&
        Objects.equals(this.stake, totoCurrencySettings.stake) &&
        Objects.equals(this.winnings, totoCurrencySettings.winnings) &&
        Objects.equals(this.isDefault, totoCurrencySettings.isDefault);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyId, currencyName, stake, winnings, isDefault);
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
    sb.append("class TotoCurrencySettings {\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
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
    openapiFields.add("CurrencyName");
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
  * @throws IOException if the JSON Element is invalid with respect to TotoCurrencySettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoCurrencySettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoCurrencySettings is not found in the empty JSON string", TotoCurrencySettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoCurrencySettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoCurrencySettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CurrencyName") != null && !jsonObj.get("CurrencyName").isJsonNull()) && !jsonObj.get("CurrencyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CurrencyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CurrencyName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoCurrencySettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoCurrencySettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoCurrencySettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoCurrencySettings.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoCurrencySettings>() {
           @Override
           public void write(JsonWriter out, TotoCurrencySettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoCurrencySettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoCurrencySettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoCurrencySettings
  * @throws IOException if the JSON string is invalid with respect to TotoCurrencySettings
  */
  public static TotoCurrencySettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoCurrencySettings.class);
  }

 /**
  * Convert an instance of TotoCurrencySettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

