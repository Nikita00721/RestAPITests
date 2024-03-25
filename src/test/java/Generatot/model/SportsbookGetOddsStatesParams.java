/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * SportsbookGetOddsStatesParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class SportsbookGetOddsStatesParams {
  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public static final String SERIALIZED_NAME_INTEGRATION = "Integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;

  public static final String SERIALIZED_NAME_SKIN_NAME = "SkinName";
  @SerializedName(SERIALIZED_NAME_SKIN_NAME)
  private String skinName;

  public static final String SERIALIZED_NAME_LANG_ID = "LangId";
  @SerializedName(SERIALIZED_NAME_LANG_ID)
  private Integer langId;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "TimezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private Integer timezoneOffset;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "DeviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private String deviceType;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_CULTURE = "Culture";
  @SerializedName(SERIALIZED_NAME_CULTURE)
  private String culture;

  public static final String SERIALIZED_NAME_NUMFORMAT = "Numformat";
  @SerializedName(SERIALIZED_NAME_NUMFORMAT)
  private String numformat;

  public static final String SERIALIZED_NAME_ODDS = "Odds";
  @SerializedName(SERIALIZED_NAME_ODDS)
  private List<OddStateParam> odds = new ArrayList<>();

  public SportsbookGetOddsStatesParams() {
  }

  public SportsbookGetOddsStatesParams configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }


  public SportsbookGetOddsStatesParams integration(String integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nonnull
  public String getIntegration() {
    return integration;
  }

  public void setIntegration(String integration) {
    this.integration = integration;
  }


  public SportsbookGetOddsStatesParams skinName(String skinName) {
    this.skinName = skinName;
    return this;
  }

   /**
   * Get skinName
   * @return skinName
  **/
  @javax.annotation.Nonnull
  public String getSkinName() {
    return skinName;
  }

  public void setSkinName(String skinName) {
    this.skinName = skinName;
  }


  public SportsbookGetOddsStatesParams langId(Integer langId) {
    this.langId = langId;
    return this;
  }

   /**
   * Get langId
   * @return langId
  **/
  @javax.annotation.Nullable
  public Integer getLangId() {
    return langId;
  }

  public void setLangId(Integer langId) {
    this.langId = langId;
  }


  public SportsbookGetOddsStatesParams timezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * Get timezoneOffset
   * @return timezoneOffset
  **/
  @javax.annotation.Nullable
  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }


  public SportsbookGetOddsStatesParams deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public SportsbookGetOddsStatesParams countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public SportsbookGetOddsStatesParams culture(String culture) {
    this.culture = culture;
    return this;
  }

   /**
   * Get culture
   * @return culture
  **/
  @javax.annotation.Nullable
  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }


  public SportsbookGetOddsStatesParams numformat(String numformat) {
    this.numformat = numformat;
    return this;
  }

   /**
   * Get numformat
   * @return numformat
  **/
  @javax.annotation.Nullable
  public String getNumformat() {
    return numformat;
  }

  public void setNumformat(String numformat) {
    this.numformat = numformat;
  }


  public SportsbookGetOddsStatesParams odds(List<OddStateParam> odds) {
    this.odds = odds;
    return this;
  }

  public SportsbookGetOddsStatesParams addOddsItem(OddStateParam oddsItem) {
    if (this.odds == null) {
      this.odds = new ArrayList<>();
    }
    this.odds.add(oddsItem);
    return this;
  }

   /**
   * Get odds
   * @return odds
  **/
  @javax.annotation.Nonnull
  public List<OddStateParam> getOdds() {
    return odds;
  }

  public void setOdds(List<OddStateParam> odds) {
    this.odds = odds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportsbookGetOddsStatesParams sportsbookGetOddsStatesParams = (SportsbookGetOddsStatesParams) o;
    return Objects.equals(this.configId, sportsbookGetOddsStatesParams.configId) &&
        Objects.equals(this.integration, sportsbookGetOddsStatesParams.integration) &&
        Objects.equals(this.skinName, sportsbookGetOddsStatesParams.skinName) &&
        Objects.equals(this.langId, sportsbookGetOddsStatesParams.langId) &&
        Objects.equals(this.timezoneOffset, sportsbookGetOddsStatesParams.timezoneOffset) &&
        Objects.equals(this.deviceType, sportsbookGetOddsStatesParams.deviceType) &&
        Objects.equals(this.countryCode, sportsbookGetOddsStatesParams.countryCode) &&
        Objects.equals(this.culture, sportsbookGetOddsStatesParams.culture) &&
        Objects.equals(this.numformat, sportsbookGetOddsStatesParams.numformat) &&
        Objects.equals(this.odds, sportsbookGetOddsStatesParams.odds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, integration, skinName, langId, timezoneOffset, deviceType, countryCode, culture, numformat, odds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SportsbookGetOddsStatesParams {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    skinName: ").append(toIndentedString(skinName)).append("\n");
    sb.append("    langId: ").append(toIndentedString(langId)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    numformat: ").append(toIndentedString(numformat)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
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
    openapiFields.add("ConfigId");
    openapiFields.add("Integration");
    openapiFields.add("SkinName");
    openapiFields.add("LangId");
    openapiFields.add("TimezoneOffset");
    openapiFields.add("DeviceType");
    openapiFields.add("CountryCode");
    openapiFields.add("Culture");
    openapiFields.add("Numformat");
    openapiFields.add("Odds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Integration");
    openapiRequiredFields.add("SkinName");
    openapiRequiredFields.add("Odds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SportsbookGetOddsStatesParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SportsbookGetOddsStatesParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SportsbookGetOddsStatesParams is not found in the empty JSON string", SportsbookGetOddsStatesParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SportsbookGetOddsStatesParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SportsbookGetOddsStatesParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SportsbookGetOddsStatesParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Integration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Integration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Integration").toString()));
      }
      if (!jsonObj.get("SkinName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SkinName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SkinName").toString()));
      }
      if ((jsonObj.get("DeviceType") != null && !jsonObj.get("DeviceType").isJsonNull()) && !jsonObj.get("DeviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DeviceType").toString()));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
      if ((jsonObj.get("Culture") != null && !jsonObj.get("Culture").isJsonNull()) && !jsonObj.get("Culture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Culture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Culture").toString()));
      }
      if ((jsonObj.get("Numformat") != null && !jsonObj.get("Numformat").isJsonNull()) && !jsonObj.get("Numformat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Numformat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Numformat").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Odds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Odds` to be an array in the JSON string but got `%s`", jsonObj.get("Odds").toString()));
      }

      JsonArray jsonArrayodds = jsonObj.getAsJsonArray("Odds");
      // validate the required field `Odds` (array)
      for (int i = 0; i < jsonArrayodds.size(); i++) {
        OddStateParam.validateJsonElement(jsonArrayodds.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SportsbookGetOddsStatesParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SportsbookGetOddsStatesParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SportsbookGetOddsStatesParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SportsbookGetOddsStatesParams.class));

       return (TypeAdapter<T>) new TypeAdapter<SportsbookGetOddsStatesParams>() {
           @Override
           public void write(JsonWriter out, SportsbookGetOddsStatesParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SportsbookGetOddsStatesParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SportsbookGetOddsStatesParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SportsbookGetOddsStatesParams
  * @throws IOException if the JSON string is invalid with respect to SportsbookGetOddsStatesParams
  */
  public static SportsbookGetOddsStatesParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SportsbookGetOddsStatesParams.class);
  }

 /**
  * Convert an instance of SportsbookGetOddsStatesParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

