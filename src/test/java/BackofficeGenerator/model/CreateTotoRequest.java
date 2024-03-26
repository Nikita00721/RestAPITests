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
 * CreateTotoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CreateTotoRequest {
  public static final String SERIALIZED_NAME_DATE_FROM = "DateFrom";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "DateTo";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_TOTO_TYPE = "TotoType";
  @SerializedName(SERIALIZED_NAME_TOTO_TYPE)
  private TotoType totoType;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_SPLIT_WINNINGS = "SplitWinnings";
  @SerializedName(SERIALIZED_NAME_SPLIT_WINNINGS)
  private Boolean splitWinnings;

  public static final String SERIALIZED_NAME_AUTO_SETTLE = "AutoSettle";
  @SerializedName(SERIALIZED_NAME_AUTO_SETTLE)
  private Boolean autoSettle;

  public static final String SERIALIZED_NAME_PROBABILITIES = "Probabilities";
  @SerializedName(SERIALIZED_NAME_PROBABILITIES)
  private Boolean probabilities;

  public static final String SERIALIZED_NAME_ALLOW_MULTI_SELECTIONS = "AllowMultiSelections";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTI_SELECTIONS)
  private Boolean allowMultiSelections;

  public static final String SERIALIZED_NAME_BRAND_IDS = "BrandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<Integer> brandIds;

  public static final String SERIALIZED_NAME_CURRENCY_SETTINGS = "CurrencySettings";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SETTINGS)
  private List<CurrencySettingsRequestItem> currencySettings;

  public static final String SERIALIZED_NAME_EVENT_IDS = "EventIds";
  @SerializedName(SERIALIZED_NAME_EVENT_IDS)
  private List<Long> eventIds;

  public static final String SERIALIZED_NAME_DEPTH = "Depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public static final String SERIALIZED_NAME_TOTO_NAME = "TotoName";
  @SerializedName(SERIALIZED_NAME_TOTO_NAME)
  private String totoName;

  public CreateTotoRequest() {
  }

  public CreateTotoRequest dateFrom(OffsetDateTime dateFrom) {
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


  public CreateTotoRequest dateTo(OffsetDateTime dateTo) {
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


  public CreateTotoRequest totoType(TotoType totoType) {
    this.totoType = totoType;
    return this;
  }

   /**
   * Get totoType
   * @return totoType
  **/
  @javax.annotation.Nullable
  public TotoType getTotoType() {
    return totoType;
  }

  public void setTotoType(TotoType totoType) {
    this.totoType = totoType;
  }


  public CreateTotoRequest isEnabled(Boolean isEnabled) {
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


  public CreateTotoRequest splitWinnings(Boolean splitWinnings) {
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


  public CreateTotoRequest autoSettle(Boolean autoSettle) {
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


  public CreateTotoRequest probabilities(Boolean probabilities) {
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


  public CreateTotoRequest allowMultiSelections(Boolean allowMultiSelections) {
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


  public CreateTotoRequest brandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
    return this;
  }

  public CreateTotoRequest addBrandIdsItem(Integer brandIdsItem) {
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


  public CreateTotoRequest currencySettings(List<CurrencySettingsRequestItem> currencySettings) {
    this.currencySettings = currencySettings;
    return this;
  }

  public CreateTotoRequest addCurrencySettingsItem(CurrencySettingsRequestItem currencySettingsItem) {
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
  public List<CurrencySettingsRequestItem> getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(List<CurrencySettingsRequestItem> currencySettings) {
    this.currencySettings = currencySettings;
  }


  public CreateTotoRequest eventIds(List<Long> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public CreateTotoRequest addEventIdsItem(Long eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

   /**
   * Get eventIds
   * @return eventIds
  **/
  @javax.annotation.Nullable
  public List<Long> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<Long> eventIds) {
    this.eventIds = eventIds;
  }


  public CreateTotoRequest depth(Integer depth) {
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


  public CreateTotoRequest totoName(String totoName) {
    this.totoName = totoName;
    return this;
  }

   /**
   * Get totoName
   * @return totoName
  **/
  @javax.annotation.Nullable
  public String getTotoName() {
    return totoName;
  }

  public void setTotoName(String totoName) {
    this.totoName = totoName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTotoRequest createTotoRequest = (CreateTotoRequest) o;
    return Objects.equals(this.dateFrom, createTotoRequest.dateFrom) &&
        Objects.equals(this.dateTo, createTotoRequest.dateTo) &&
        Objects.equals(this.totoType, createTotoRequest.totoType) &&
        Objects.equals(this.isEnabled, createTotoRequest.isEnabled) &&
        Objects.equals(this.splitWinnings, createTotoRequest.splitWinnings) &&
        Objects.equals(this.autoSettle, createTotoRequest.autoSettle) &&
        Objects.equals(this.probabilities, createTotoRequest.probabilities) &&
        Objects.equals(this.allowMultiSelections, createTotoRequest.allowMultiSelections) &&
        Objects.equals(this.brandIds, createTotoRequest.brandIds) &&
        Objects.equals(this.currencySettings, createTotoRequest.currencySettings) &&
        Objects.equals(this.eventIds, createTotoRequest.eventIds) &&
        Objects.equals(this.depth, createTotoRequest.depth) &&
        Objects.equals(this.totoName, createTotoRequest.totoName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, totoType, isEnabled, splitWinnings, autoSettle, probabilities, allowMultiSelections, brandIds, currencySettings, eventIds, depth, totoName);
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
    sb.append("class CreateTotoRequest {\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    totoType: ").append(toIndentedString(totoType)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    splitWinnings: ").append(toIndentedString(splitWinnings)).append("\n");
    sb.append("    autoSettle: ").append(toIndentedString(autoSettle)).append("\n");
    sb.append("    probabilities: ").append(toIndentedString(probabilities)).append("\n");
    sb.append("    allowMultiSelections: ").append(toIndentedString(allowMultiSelections)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    currencySettings: ").append(toIndentedString(currencySettings)).append("\n");
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    totoName: ").append(toIndentedString(totoName)).append("\n");
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
    openapiFields.add("DateFrom");
    openapiFields.add("DateTo");
    openapiFields.add("TotoType");
    openapiFields.add("IsEnabled");
    openapiFields.add("SplitWinnings");
    openapiFields.add("AutoSettle");
    openapiFields.add("Probabilities");
    openapiFields.add("AllowMultiSelections");
    openapiFields.add("BrandIds");
    openapiFields.add("CurrencySettings");
    openapiFields.add("EventIds");
    openapiFields.add("Depth");
    openapiFields.add("TotoName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTotoRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTotoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTotoRequest is not found in the empty JSON string", CreateTotoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTotoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTotoRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `TotoType`
      if (jsonObj.get("TotoType") != null && !jsonObj.get("TotoType").isJsonNull()) {
        TotoType.validateJsonElement(jsonObj.get("TotoType"));
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
            CurrencySettingsRequestItem.validateJsonElement(jsonArraycurrencySettings.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("EventIds") != null && !jsonObj.get("EventIds").isJsonNull() && !jsonObj.get("EventIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventIds` to be an array in the JSON string but got `%s`", jsonObj.get("EventIds").toString()));
      }
      if ((jsonObj.get("TotoName") != null && !jsonObj.get("TotoName").isJsonNull()) && !jsonObj.get("TotoName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TotoName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TotoName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTotoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTotoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTotoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTotoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTotoRequest>() {
           @Override
           public void write(JsonWriter out, CreateTotoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTotoRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTotoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTotoRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTotoRequest
  */
  public static CreateTotoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTotoRequest.class);
  }

 /**
  * Convert an instance of CreateTotoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

