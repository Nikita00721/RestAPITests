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
 * TotoDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TotoDetails {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE_FROM = "DateFrom";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "DateTo";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TotoType type;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_IS_VOIDED = "IsVoided";
  @SerializedName(SERIALIZED_NAME_IS_VOIDED)
  private Boolean isVoided;

  public static final String SERIALIZED_NAME_INT_SPORT_ID = "IntSportId";
  @SerializedName(SERIALIZED_NAME_INT_SPORT_ID)
  private Integer intSportId;

  public static final String SERIALIZED_NAME_LICENSE_IDS = "LicenseIds";
  @SerializedName(SERIALIZED_NAME_LICENSE_IDS)
  private List<Integer> licenseIds;

  public static final String SERIALIZED_NAME_BRAND_IDS = "BrandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<Integer> brandIds;

  public static final String SERIALIZED_NAME_CURRENCY_SETTINGS = "CurrencySettings";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SETTINGS)
  private List<TotoCurrencySettings> currencySettings;

  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<TotoEventDetails> events;

  public static final String SERIALIZED_NAME_SPLIT_WINNINGS = "SplitWinnings";
  @SerializedName(SERIALIZED_NAME_SPLIT_WINNINGS)
  private Boolean splitWinnings;

  public static final String SERIALIZED_NAME_DEPTH = "Depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public static final String SERIALIZED_NAME_AUTO_SETTLE = "AutoSettle";
  @SerializedName(SERIALIZED_NAME_AUTO_SETTLE)
  private Boolean autoSettle;

  public static final String SERIALIZED_NAME_PROBABILITIES = "Probabilities";
  @SerializedName(SERIALIZED_NAME_PROBABILITIES)
  private Boolean probabilities;

  public static final String SERIALIZED_NAME_ALLOW_MULTI_SELECTIONS = "AllowMultiSelections";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTI_SELECTIONS)
  private Boolean allowMultiSelections;

  public static final String SERIALIZED_NAME_TOTO_ID = "TotoId";
  @SerializedName(SERIALIZED_NAME_TOTO_ID)
  private Integer totoId;

  public TotoDetails() {
  }

  public TotoDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TotoDetails dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }


  public TotoDetails dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  public TotoDetails type(TotoType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TotoType getType() {
    return type;
  }

  public void setType(TotoType type) {
    this.type = type;
  }


  public TotoDetails isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public TotoDetails isVoided(Boolean isVoided) {
    this.isVoided = isVoided;
    return this;
  }

   /**
   * Get isVoided
   * @return isVoided
  **/
  @javax.annotation.Nullable
  public Boolean getIsVoided() {
    return isVoided;
  }

  public void setIsVoided(Boolean isVoided) {
    this.isVoided = isVoided;
  }


  public TotoDetails intSportId(Integer intSportId) {
    this.intSportId = intSportId;
    return this;
  }

   /**
   * Get intSportId
   * @return intSportId
  **/
  @javax.annotation.Nullable
  public Integer getIntSportId() {
    return intSportId;
  }

  public void setIntSportId(Integer intSportId) {
    this.intSportId = intSportId;
  }


  public TotoDetails licenseIds(List<Integer> licenseIds) {
    this.licenseIds = licenseIds;
    return this;
  }

  public TotoDetails addLicenseIdsItem(Integer licenseIdsItem) {
    if (this.licenseIds == null) {
      this.licenseIds = new ArrayList<>();
    }
    this.licenseIds.add(licenseIdsItem);
    return this;
  }

   /**
   * Get licenseIds
   * @return licenseIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getLicenseIds() {
    return licenseIds;
  }

  public void setLicenseIds(List<Integer> licenseIds) {
    this.licenseIds = licenseIds;
  }


  public TotoDetails brandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
    return this;
  }

  public TotoDetails addBrandIdsItem(Integer brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * Get brandIds
   * @return brandIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getBrandIds() {
    return brandIds;
  }

  public void setBrandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
  }


  public TotoDetails currencySettings(List<TotoCurrencySettings> currencySettings) {
    this.currencySettings = currencySettings;
    return this;
  }

  public TotoDetails addCurrencySettingsItem(TotoCurrencySettings currencySettingsItem) {
    if (this.currencySettings == null) {
      this.currencySettings = new ArrayList<>();
    }
    this.currencySettings.add(currencySettingsItem);
    return this;
  }

   /**
   * Get currencySettings
   * @return currencySettings
  **/
  @javax.annotation.Nullable
  public List<TotoCurrencySettings> getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(List<TotoCurrencySettings> currencySettings) {
    this.currencySettings = currencySettings;
  }


  public TotoDetails events(List<TotoEventDetails> events) {
    this.events = events;
    return this;
  }

  public TotoDetails addEventsItem(TotoEventDetails eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<TotoEventDetails> getEvents() {
    return events;
  }

  public void setEvents(List<TotoEventDetails> events) {
    this.events = events;
  }


  public TotoDetails splitWinnings(Boolean splitWinnings) {
    this.splitWinnings = splitWinnings;
    return this;
  }

   /**
   * Get splitWinnings
   * @return splitWinnings
  **/
  @javax.annotation.Nullable
  public Boolean getSplitWinnings() {
    return splitWinnings;
  }

  public void setSplitWinnings(Boolean splitWinnings) {
    this.splitWinnings = splitWinnings;
  }


  public TotoDetails depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @javax.annotation.Nullable
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public TotoDetails autoSettle(Boolean autoSettle) {
    this.autoSettle = autoSettle;
    return this;
  }

   /**
   * Get autoSettle
   * @return autoSettle
  **/
  @javax.annotation.Nullable
  public Boolean getAutoSettle() {
    return autoSettle;
  }

  public void setAutoSettle(Boolean autoSettle) {
    this.autoSettle = autoSettle;
  }


  public TotoDetails probabilities(Boolean probabilities) {
    this.probabilities = probabilities;
    return this;
  }

   /**
   * Get probabilities
   * @return probabilities
  **/
  @javax.annotation.Nullable
  public Boolean getProbabilities() {
    return probabilities;
  }

  public void setProbabilities(Boolean probabilities) {
    this.probabilities = probabilities;
  }


  public TotoDetails allowMultiSelections(Boolean allowMultiSelections) {
    this.allowMultiSelections = allowMultiSelections;
    return this;
  }

   /**
   * Get allowMultiSelections
   * @return allowMultiSelections
  **/
  @javax.annotation.Nullable
  public Boolean getAllowMultiSelections() {
    return allowMultiSelections;
  }

  public void setAllowMultiSelections(Boolean allowMultiSelections) {
    this.allowMultiSelections = allowMultiSelections;
  }


  public TotoDetails totoId(Integer totoId) {
    this.totoId = totoId;
    return this;
  }

   /**
   * Get totoId
   * @return totoId
  **/
  @javax.annotation.Nullable
  public Integer getTotoId() {
    return totoId;
  }

  public void setTotoId(Integer totoId) {
    this.totoId = totoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotoDetails totoDetails = (TotoDetails) o;
    return Objects.equals(this.name, totoDetails.name) &&
        Objects.equals(this.dateFrom, totoDetails.dateFrom) &&
        Objects.equals(this.dateTo, totoDetails.dateTo) &&
        Objects.equals(this.type, totoDetails.type) &&
        Objects.equals(this.isEnabled, totoDetails.isEnabled) &&
        Objects.equals(this.isVoided, totoDetails.isVoided) &&
        Objects.equals(this.intSportId, totoDetails.intSportId) &&
        Objects.equals(this.licenseIds, totoDetails.licenseIds) &&
        Objects.equals(this.brandIds, totoDetails.brandIds) &&
        Objects.equals(this.currencySettings, totoDetails.currencySettings) &&
        Objects.equals(this.events, totoDetails.events) &&
        Objects.equals(this.splitWinnings, totoDetails.splitWinnings) &&
        Objects.equals(this.depth, totoDetails.depth) &&
        Objects.equals(this.autoSettle, totoDetails.autoSettle) &&
        Objects.equals(this.probabilities, totoDetails.probabilities) &&
        Objects.equals(this.allowMultiSelections, totoDetails.allowMultiSelections) &&
        Objects.equals(this.totoId, totoDetails.totoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dateFrom, dateTo, type, isEnabled, isVoided, intSportId, licenseIds, brandIds, currencySettings, events, splitWinnings, depth, autoSettle, probabilities, allowMultiSelections, totoId);
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
    sb.append("class TotoDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isVoided: ").append(toIndentedString(isVoided)).append("\n");
    sb.append("    intSportId: ").append(toIndentedString(intSportId)).append("\n");
    sb.append("    licenseIds: ").append(toIndentedString(licenseIds)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    currencySettings: ").append(toIndentedString(currencySettings)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    splitWinnings: ").append(toIndentedString(splitWinnings)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    autoSettle: ").append(toIndentedString(autoSettle)).append("\n");
    sb.append("    probabilities: ").append(toIndentedString(probabilities)).append("\n");
    sb.append("    allowMultiSelections: ").append(toIndentedString(allowMultiSelections)).append("\n");
    sb.append("    totoId: ").append(toIndentedString(totoId)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("DateFrom");
    openapiFields.add("DateTo");
    openapiFields.add("Type");
    openapiFields.add("IsEnabled");
    openapiFields.add("IsVoided");
    openapiFields.add("IntSportId");
    openapiFields.add("LicenseIds");
    openapiFields.add("BrandIds");
    openapiFields.add("CurrencySettings");
    openapiFields.add("Events");
    openapiFields.add("SplitWinnings");
    openapiFields.add("Depth");
    openapiFields.add("AutoSettle");
    openapiFields.add("Probabilities");
    openapiFields.add("AllowMultiSelections");
    openapiFields.add("TotoId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotoDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoDetails is not found in the empty JSON string", TotoDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        TotoType.validateJsonElement(jsonObj.get("Type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("LicenseIds") != null && !jsonObj.get("LicenseIds").isJsonNull() && !jsonObj.get("LicenseIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseIds` to be an array in the JSON string but got `%s`", jsonObj.get("LicenseIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BrandIds") != null && !jsonObj.get("BrandIds").isJsonNull() && !jsonObj.get("BrandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandIds` to be an array in the JSON string but got `%s`", jsonObj.get("BrandIds").toString()));
      }
      if (jsonObj.get("CurrencySettings") != null && !jsonObj.get("CurrencySettings").isJsonNull()) {
        JsonArray jsonArraycurrencySettings = jsonObj.getAsJsonArray("CurrencySettings");
        if (jsonArraycurrencySettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("CurrencySettings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `CurrencySettings` to be an array in the JSON string but got `%s`", jsonObj.get("CurrencySettings").toString()));
          }

          // validate the optional field `CurrencySettings` (array)
          for (int i = 0; i < jsonArraycurrencySettings.size(); i++) {
            TotoCurrencySettings.validateJsonElement(jsonArraycurrencySettings.get(i));
          };
        }
      }
      if (jsonObj.get("Events") != null && !jsonObj.get("Events").isJsonNull()) {
        JsonArray jsonArrayevents = jsonObj.getAsJsonArray("Events");
        if (jsonArrayevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Events` to be an array in the JSON string but got `%s`", jsonObj.get("Events").toString()));
          }

          // validate the optional field `Events` (array)
          for (int i = 0; i < jsonArrayevents.size(); i++) {
            TotoEventDetails.validateJsonElement(jsonArrayevents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoDetails>() {
           @Override
           public void write(JsonWriter out, TotoDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoDetails
  * @throws IOException if the JSON string is invalid with respect to TotoDetails
  */
  public static TotoDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoDetails.class);
  }

 /**
  * Convert an instance of TotoDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

