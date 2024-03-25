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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * RaceResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class RaceResult {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_PLACE_NUM = "PlaceNum";
  @SerializedName(SERIALIZED_NAME_PLACE_NUM)
  private Integer placeNum;

  public static final String SERIALIZED_NAME_COMPETITOR_ID = "CompetitorId";
  @SerializedName(SERIALIZED_NAME_COMPETITOR_ID)
  private Long competitorId;

  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_ODD = "Odd";
  @SerializedName(SERIALIZED_NAME_ODD)
  private Double odd;

  public RaceResult() {
  }

  public RaceResult marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public RaceResult placeNum(Integer placeNum) {
    this.placeNum = placeNum;
    return this;
  }

   /**
   * Get placeNum
   * @return placeNum
  **/
  @javax.annotation.Nullable
  public Integer getPlaceNum() {
    return placeNum;
  }

  public void setPlaceNum(Integer placeNum) {
    this.placeNum = placeNum;
  }


  public RaceResult competitorId(Long competitorId) {
    this.competitorId = competitorId;
    return this;
  }

   /**
   * Get competitorId
   * @return competitorId
  **/
  @javax.annotation.Nullable
  public Long getCompetitorId() {
    return competitorId;
  }

  public void setCompetitorId(Long competitorId) {
    this.competitorId = competitorId;
  }


  public RaceResult result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public RaceResult odd(Double odd) {
    this.odd = odd;
    return this;
  }

   /**
   * Get odd
   * @return odd
  **/
  @javax.annotation.Nonnull
  public Double getOdd() {
    return odd;
  }

  public void setOdd(Double odd) {
    this.odd = odd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceResult raceResult = (RaceResult) o;
    return Objects.equals(this.marketTypeId, raceResult.marketTypeId) &&
        Objects.equals(this.placeNum, raceResult.placeNum) &&
        Objects.equals(this.competitorId, raceResult.competitorId) &&
        Objects.equals(this.result, raceResult.result) &&
        Objects.equals(this.odd, raceResult.odd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, placeNum, competitorId, result, odd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceResult {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    placeNum: ").append(toIndentedString(placeNum)).append("\n");
    sb.append("    competitorId: ").append(toIndentedString(competitorId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    odd: ").append(toIndentedString(odd)).append("\n");
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
    openapiFields.add("MarketTypeId");
    openapiFields.add("PlaceNum");
    openapiFields.add("CompetitorId");
    openapiFields.add("Result");
    openapiFields.add("Odd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MarketTypeId");
    openapiRequiredFields.add("Odd");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RaceResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RaceResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RaceResult is not found in the empty JSON string", RaceResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RaceResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RaceResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RaceResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Result") != null && !jsonObj.get("Result").isJsonNull()) && !jsonObj.get("Result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Result").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RaceResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RaceResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RaceResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RaceResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RaceResult>() {
           @Override
           public void write(JsonWriter out, RaceResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RaceResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RaceResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RaceResult
  * @throws IOException if the JSON string is invalid with respect to RaceResult
  */
  public static RaceResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RaceResult.class);
  }

 /**
  * Convert an instance of RaceResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

