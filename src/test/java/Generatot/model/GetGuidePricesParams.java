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
 * GetGuidePricesParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetGuidePricesParams {
  public static final String SERIALIZED_NAME_INTEGRATION = "Integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;

  public static final String SERIALIZED_NAME_CULTURE = "Culture";
  @SerializedName(SERIALIZED_NAME_CULTURE)
  private String culture;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "TimezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private Integer timezoneOffset;

  public static final String SERIALIZED_NAME_NUM_FORMAT = "NumFormat";
  @SerializedName(SERIALIZED_NAME_NUM_FORMAT)
  private String numFormat;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "DeviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private DeviceType deviceType;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public static final String SERIALIZED_NAME_COMBINATION = "Combination";
  @SerializedName(SERIALIZED_NAME_COMBINATION)
  private List<Integer> combination = new ArrayList<>();

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_IS_ANY = "IsAny";
  @SerializedName(SERIALIZED_NAME_IS_ANY)
  private Boolean isAny;

  public GetGuidePricesParams() {
  }

  public GetGuidePricesParams integration(String integration) {
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


  public GetGuidePricesParams culture(String culture) {
    this.culture = culture;
    return this;
  }

   /**
   * Get culture
   * @return culture
  **/
  @javax.annotation.Nonnull
  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }


  public GetGuidePricesParams timezoneOffset(Integer timezoneOffset) {
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


  public GetGuidePricesParams numFormat(String numFormat) {
    this.numFormat = numFormat;
    return this;
  }

   /**
   * Get numFormat
   * @return numFormat
  **/
  @javax.annotation.Nullable
  public String getNumFormat() {
    return numFormat;
  }

  public void setNumFormat(String numFormat) {
    this.numFormat = numFormat;
  }


  public GetGuidePricesParams deviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  public DeviceType getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
  }


  public GetGuidePricesParams countryCode(String countryCode) {
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


  public GetGuidePricesParams eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public GetGuidePricesParams combination(List<Integer> combination) {
    this.combination = combination;
    return this;
  }

  public GetGuidePricesParams addCombinationItem(Integer combinationItem) {
    if (this.combination == null) {
      this.combination = new ArrayList<>();
    }
    this.combination.add(combinationItem);
    return this;
  }

   /**
   * Get combination
   * @return combination
  **/
  @javax.annotation.Nonnull
  public List<Integer> getCombination() {
    return combination;
  }

  public void setCombination(List<Integer> combination) {
    this.combination = combination;
  }


  public GetGuidePricesParams marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public GetGuidePricesParams isAny(Boolean isAny) {
    this.isAny = isAny;
    return this;
  }

   /**
   * Get isAny
   * @return isAny
  **/
  @javax.annotation.Nullable
  public Boolean getIsAny() {
    return isAny;
  }

  public void setIsAny(Boolean isAny) {
    this.isAny = isAny;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGuidePricesParams getGuidePricesParams = (GetGuidePricesParams) o;
    return Objects.equals(this.integration, getGuidePricesParams.integration) &&
        Objects.equals(this.culture, getGuidePricesParams.culture) &&
        Objects.equals(this.timezoneOffset, getGuidePricesParams.timezoneOffset) &&
        Objects.equals(this.numFormat, getGuidePricesParams.numFormat) &&
        Objects.equals(this.deviceType, getGuidePricesParams.deviceType) &&
        Objects.equals(this.countryCode, getGuidePricesParams.countryCode) &&
        Objects.equals(this.eventId, getGuidePricesParams.eventId) &&
        Objects.equals(this.combination, getGuidePricesParams.combination) &&
        Objects.equals(this.marketTypeId, getGuidePricesParams.marketTypeId) &&
        Objects.equals(this.isAny, getGuidePricesParams.isAny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integration, culture, timezoneOffset, numFormat, deviceType, countryCode, eventId, combination, marketTypeId, isAny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGuidePricesParams {\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    numFormat: ").append(toIndentedString(numFormat)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    combination: ").append(toIndentedString(combination)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    isAny: ").append(toIndentedString(isAny)).append("\n");
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
    openapiFields.add("Integration");
    openapiFields.add("Culture");
    openapiFields.add("TimezoneOffset");
    openapiFields.add("NumFormat");
    openapiFields.add("DeviceType");
    openapiFields.add("CountryCode");
    openapiFields.add("EventId");
    openapiFields.add("Combination");
    openapiFields.add("MarketTypeId");
    openapiFields.add("IsAny");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Integration");
    openapiRequiredFields.add("Culture");
    openapiRequiredFields.add("Combination");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetGuidePricesParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGuidePricesParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGuidePricesParams is not found in the empty JSON string", GetGuidePricesParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGuidePricesParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGuidePricesParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGuidePricesParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Integration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Integration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Integration").toString()));
      }
      if (!jsonObj.get("Culture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Culture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Culture").toString()));
      }
      if ((jsonObj.get("NumFormat") != null && !jsonObj.get("NumFormat").isJsonNull()) && !jsonObj.get("NumFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NumFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NumFormat").toString()));
      }
      // validate the optional field `DeviceType`
      if (jsonObj.get("DeviceType") != null && !jsonObj.get("DeviceType").isJsonNull()) {
        DeviceType.validateJsonElement(jsonObj.get("DeviceType"));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("Combination") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Combination").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Combination` to be an array in the JSON string but got `%s`", jsonObj.get("Combination").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGuidePricesParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGuidePricesParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGuidePricesParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGuidePricesParams.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGuidePricesParams>() {
           @Override
           public void write(JsonWriter out, GetGuidePricesParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGuidePricesParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGuidePricesParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGuidePricesParams
  * @throws IOException if the JSON string is invalid with respect to GetGuidePricesParams
  */
  public static GetGuidePricesParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGuidePricesParams.class);
  }

 /**
  * Convert an instance of GetGuidePricesParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

