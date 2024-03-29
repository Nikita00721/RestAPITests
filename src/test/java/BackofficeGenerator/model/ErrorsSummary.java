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
 * ErrorsSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ErrorsSummary {
  public static final String SERIALIZED_NAME_REGISTRED_EVENTS = "RegistredEvents";
  @SerializedName(SERIALIZED_NAME_REGISTRED_EVENTS)
  private Integer registredEvents;

  public static final String SERIALIZED_NAME_REGISTRED_EVENTS_LIST = "RegistredEventsList";
  @SerializedName(SERIALIZED_NAME_REGISTRED_EVENTS_LIST)
  private Integer registredEventsList;

  public static final String SERIALIZED_NAME_SETTLE_MARKETS = "SettleMarkets";
  @SerializedName(SERIALIZED_NAME_SETTLE_MARKETS)
  private Integer settleMarkets;

  public static final String SERIALIZED_NAME_REFUNDS_BY_TYPE = "RefundsByType";
  @SerializedName(SERIALIZED_NAME_REFUNDS_BY_TYPE)
  private Integer refundsByType;

  public static final String SERIALIZED_NAME_UPDATE_DATE_ERRORS = "UpdateDateErrors";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE_ERRORS)
  private Integer updateDateErrors;

  public static final String SERIALIZED_NAME_BETS = "Bets";
  @SerializedName(SERIALIZED_NAME_BETS)
  private Integer bets;

  public ErrorsSummary() {
  }

  public ErrorsSummary registredEvents(Integer registredEvents) {
    this.registredEvents = registredEvents;
    return this;
  }

   /**
   * Get registredEvents
   * @return registredEvents
  **/
  @javax.annotation.Nullable
  public Integer getRegistredEvents() {
    return registredEvents;
  }

  public void setRegistredEvents(Integer registredEvents) {
    this.registredEvents = registredEvents;
  }


  public ErrorsSummary registredEventsList(Integer registredEventsList) {
    this.registredEventsList = registredEventsList;
    return this;
  }

   /**
   * Get registredEventsList
   * @return registredEventsList
  **/
  @javax.annotation.Nullable
  public Integer getRegistredEventsList() {
    return registredEventsList;
  }

  public void setRegistredEventsList(Integer registredEventsList) {
    this.registredEventsList = registredEventsList;
  }


  public ErrorsSummary settleMarkets(Integer settleMarkets) {
    this.settleMarkets = settleMarkets;
    return this;
  }

   /**
   * Get settleMarkets
   * @return settleMarkets
  **/
  @javax.annotation.Nullable
  public Integer getSettleMarkets() {
    return settleMarkets;
  }

  public void setSettleMarkets(Integer settleMarkets) {
    this.settleMarkets = settleMarkets;
  }


  public ErrorsSummary refundsByType(Integer refundsByType) {
    this.refundsByType = refundsByType;
    return this;
  }

   /**
   * Get refundsByType
   * @return refundsByType
  **/
  @javax.annotation.Nullable
  public Integer getRefundsByType() {
    return refundsByType;
  }

  public void setRefundsByType(Integer refundsByType) {
    this.refundsByType = refundsByType;
  }


  public ErrorsSummary updateDateErrors(Integer updateDateErrors) {
    this.updateDateErrors = updateDateErrors;
    return this;
  }

   /**
   * Get updateDateErrors
   * @return updateDateErrors
  **/
  @javax.annotation.Nullable
  public Integer getUpdateDateErrors() {
    return updateDateErrors;
  }

  public void setUpdateDateErrors(Integer updateDateErrors) {
    this.updateDateErrors = updateDateErrors;
  }


  public ErrorsSummary bets(Integer bets) {
    this.bets = bets;
    return this;
  }

   /**
   * Get bets
   * @return bets
  **/
  @javax.annotation.Nullable
  public Integer getBets() {
    return bets;
  }

  public void setBets(Integer bets) {
    this.bets = bets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsSummary errorsSummary = (ErrorsSummary) o;
    return Objects.equals(this.registredEvents, errorsSummary.registredEvents) &&
        Objects.equals(this.registredEventsList, errorsSummary.registredEventsList) &&
        Objects.equals(this.settleMarkets, errorsSummary.settleMarkets) &&
        Objects.equals(this.refundsByType, errorsSummary.refundsByType) &&
        Objects.equals(this.updateDateErrors, errorsSummary.updateDateErrors) &&
        Objects.equals(this.bets, errorsSummary.bets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registredEvents, registredEventsList, settleMarkets, refundsByType, updateDateErrors, bets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsSummary {\n");
    sb.append("    registredEvents: ").append(toIndentedString(registredEvents)).append("\n");
    sb.append("    registredEventsList: ").append(toIndentedString(registredEventsList)).append("\n");
    sb.append("    settleMarkets: ").append(toIndentedString(settleMarkets)).append("\n");
    sb.append("    refundsByType: ").append(toIndentedString(refundsByType)).append("\n");
    sb.append("    updateDateErrors: ").append(toIndentedString(updateDateErrors)).append("\n");
    sb.append("    bets: ").append(toIndentedString(bets)).append("\n");
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
    openapiFields.add("RegistredEvents");
    openapiFields.add("RegistredEventsList");
    openapiFields.add("SettleMarkets");
    openapiFields.add("RefundsByType");
    openapiFields.add("UpdateDateErrors");
    openapiFields.add("Bets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ErrorsSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ErrorsSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorsSummary is not found in the empty JSON string", ErrorsSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ErrorsSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorsSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorsSummary>() {
           @Override
           public void write(JsonWriter out, ErrorsSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorsSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrorsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorsSummary
  * @throws IOException if the JSON string is invalid with respect to ErrorsSummary
  */
  public static ErrorsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorsSummary.class);
  }

 /**
  * Convert an instance of ErrorsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

