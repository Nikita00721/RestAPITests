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
 * UpdateBetMentorRuleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateBetMentorRuleRequest {
  public static final String SERIALIZED_NAME_GROUP_NUMBER = "GroupNumber";
  @SerializedName(SERIALIZED_NAME_GROUP_NUMBER)
  private Integer groupNumber;

  public static final String SERIALIZED_NAME_TOTAL_ODDS_FROM = "TotalOddsFrom";
  @SerializedName(SERIALIZED_NAME_TOTAL_ODDS_FROM)
  private Double totalOddsFrom;

  public static final String SERIALIZED_NAME_TOTAL_ODDS_TO = "TotalOddsTo";
  @SerializedName(SERIALIZED_NAME_TOTAL_ODDS_TO)
  private Double totalOddsTo;

  public static final String SERIALIZED_NAME_MAX_SELECTIONS = "MaxSelections";
  @SerializedName(SERIALIZED_NAME_MAX_SELECTIONS)
  private Integer maxSelections;

  public static final String SERIALIZED_NAME_MAX_ODDS_SELECTION = "MaxOddsSelection";
  @SerializedName(SERIALIZED_NAME_MAX_ODDS_SELECTION)
  private Double maxOddsSelection;

  public static final String SERIALIZED_NAME_MIN_ODDS_SELECTION = "MinOddsSelection";
  @SerializedName(SERIALIZED_NAME_MIN_ODDS_SELECTION)
  private Double minOddsSelection;

  public static final String SERIALIZED_NAME_MAX_STAKE = "MaxStake";
  @SerializedName(SERIALIZED_NAME_MAX_STAKE)
  private Double maxStake;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public UpdateBetMentorRuleRequest() {
  }

  public UpdateBetMentorRuleRequest groupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
    return this;
  }

   /**
   * Get groupNumber
   * @return groupNumber
  **/
  @javax.annotation.Nullable
  public Integer getGroupNumber() {
    return groupNumber;
  }

  public void setGroupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
  }


  public UpdateBetMentorRuleRequest totalOddsFrom(Double totalOddsFrom) {
    this.totalOddsFrom = totalOddsFrom;
    return this;
  }

   /**
   * Get totalOddsFrom
   * @return totalOddsFrom
  **/
  @javax.annotation.Nullable
  public Double getTotalOddsFrom() {
    return totalOddsFrom;
  }

  public void setTotalOddsFrom(Double totalOddsFrom) {
    this.totalOddsFrom = totalOddsFrom;
  }


  public UpdateBetMentorRuleRequest totalOddsTo(Double totalOddsTo) {
    this.totalOddsTo = totalOddsTo;
    return this;
  }

   /**
   * Get totalOddsTo
   * @return totalOddsTo
  **/
  @javax.annotation.Nullable
  public Double getTotalOddsTo() {
    return totalOddsTo;
  }

  public void setTotalOddsTo(Double totalOddsTo) {
    this.totalOddsTo = totalOddsTo;
  }


  public UpdateBetMentorRuleRequest maxSelections(Integer maxSelections) {
    this.maxSelections = maxSelections;
    return this;
  }

   /**
   * Get maxSelections
   * @return maxSelections
  **/
  @javax.annotation.Nullable
  public Integer getMaxSelections() {
    return maxSelections;
  }

  public void setMaxSelections(Integer maxSelections) {
    this.maxSelections = maxSelections;
  }


  public UpdateBetMentorRuleRequest maxOddsSelection(Double maxOddsSelection) {
    this.maxOddsSelection = maxOddsSelection;
    return this;
  }

   /**
   * Get maxOddsSelection
   * @return maxOddsSelection
  **/
  @javax.annotation.Nullable
  public Double getMaxOddsSelection() {
    return maxOddsSelection;
  }

  public void setMaxOddsSelection(Double maxOddsSelection) {
    this.maxOddsSelection = maxOddsSelection;
  }


  public UpdateBetMentorRuleRequest minOddsSelection(Double minOddsSelection) {
    this.minOddsSelection = minOddsSelection;
    return this;
  }

   /**
   * Get minOddsSelection
   * @return minOddsSelection
  **/
  @javax.annotation.Nullable
  public Double getMinOddsSelection() {
    return minOddsSelection;
  }

  public void setMinOddsSelection(Double minOddsSelection) {
    this.minOddsSelection = minOddsSelection;
  }


  public UpdateBetMentorRuleRequest maxStake(Double maxStake) {
    this.maxStake = maxStake;
    return this;
  }

   /**
   * Get maxStake
   * @return maxStake
  **/
  @javax.annotation.Nullable
  public Double getMaxStake() {
    return maxStake;
  }

  public void setMaxStake(Double maxStake) {
    this.maxStake = maxStake;
  }


  public UpdateBetMentorRuleRequest configId(Integer configId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBetMentorRuleRequest updateBetMentorRuleRequest = (UpdateBetMentorRuleRequest) o;
    return Objects.equals(this.groupNumber, updateBetMentorRuleRequest.groupNumber) &&
        Objects.equals(this.totalOddsFrom, updateBetMentorRuleRequest.totalOddsFrom) &&
        Objects.equals(this.totalOddsTo, updateBetMentorRuleRequest.totalOddsTo) &&
        Objects.equals(this.maxSelections, updateBetMentorRuleRequest.maxSelections) &&
        Objects.equals(this.maxOddsSelection, updateBetMentorRuleRequest.maxOddsSelection) &&
        Objects.equals(this.minOddsSelection, updateBetMentorRuleRequest.minOddsSelection) &&
        Objects.equals(this.maxStake, updateBetMentorRuleRequest.maxStake) &&
        Objects.equals(this.configId, updateBetMentorRuleRequest.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupNumber, totalOddsFrom, totalOddsTo, maxSelections, maxOddsSelection, minOddsSelection, maxStake, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBetMentorRuleRequest {\n");
    sb.append("    groupNumber: ").append(toIndentedString(groupNumber)).append("\n");
    sb.append("    totalOddsFrom: ").append(toIndentedString(totalOddsFrom)).append("\n");
    sb.append("    totalOddsTo: ").append(toIndentedString(totalOddsTo)).append("\n");
    sb.append("    maxSelections: ").append(toIndentedString(maxSelections)).append("\n");
    sb.append("    maxOddsSelection: ").append(toIndentedString(maxOddsSelection)).append("\n");
    sb.append("    minOddsSelection: ").append(toIndentedString(minOddsSelection)).append("\n");
    sb.append("    maxStake: ").append(toIndentedString(maxStake)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
    openapiFields.add("GroupNumber");
    openapiFields.add("TotalOddsFrom");
    openapiFields.add("TotalOddsTo");
    openapiFields.add("MaxSelections");
    openapiFields.add("MaxOddsSelection");
    openapiFields.add("MinOddsSelection");
    openapiFields.add("MaxStake");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateBetMentorRuleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBetMentorRuleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBetMentorRuleRequest is not found in the empty JSON string", UpdateBetMentorRuleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBetMentorRuleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBetMentorRuleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBetMentorRuleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBetMentorRuleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBetMentorRuleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBetMentorRuleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBetMentorRuleRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBetMentorRuleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBetMentorRuleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBetMentorRuleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBetMentorRuleRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBetMentorRuleRequest
  */
  public static UpdateBetMentorRuleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBetMentorRuleRequest.class);
  }

 /**
  * Convert an instance of UpdateBetMentorRuleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

