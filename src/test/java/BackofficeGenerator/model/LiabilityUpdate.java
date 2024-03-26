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
 * LiabilityUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LiabilityUpdate {
  public static final String SERIALIZED_NAME_MARKET_ID = "MarketId";
  @SerializedName(SERIALIZED_NAME_MARKET_ID)
  private String marketId;

  public static final String SERIALIZED_NAME_SELECTION_ID = "SelectionId";
  @SerializedName(SERIALIZED_NAME_SELECTION_ID)
  private String selectionId;

  public static final String SERIALIZED_NAME_ODDS = "Odds";
  @SerializedName(SERIALIZED_NAME_ODDS)
  private Double odds;

  public static final String SERIALIZED_NAME_SINGLE_BETS = "SingleBets";
  @SerializedName(SERIALIZED_NAME_SINGLE_BETS)
  private Double singleBets;

  public static final String SERIALIZED_NAME_SINGLE_STAKES = "SingleStakes";
  @SerializedName(SERIALIZED_NAME_SINGLE_STAKES)
  private Double singleStakes;

  public static final String SERIALIZED_NAME_MULTIPLE_BETS = "MultipleBets";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BETS)
  private Double multipleBets;

  public static final String SERIALIZED_NAME_MULTIPLE_STAKES = "MultipleStakes";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_STAKES)
  private Double multipleStakes;

  public static final String SERIALIZED_NAME_TOTAL_BETS = "TotalBets";
  @SerializedName(SERIALIZED_NAME_TOTAL_BETS)
  private Double totalBets;

  public static final String SERIALIZED_NAME_TOTAL_STAKES = "TotalStakes";
  @SerializedName(SERIALIZED_NAME_TOTAL_STAKES)
  private Double totalStakes;

  public static final String SERIALIZED_NAME_LIABILITY_SINGLES = "LiabilitySingles";
  @SerializedName(SERIALIZED_NAME_LIABILITY_SINGLES)
  private Double liabilitySingles;

  public static final String SERIALIZED_NAME_LIABILITY_MULTIPLES = "LiabilityMultiples";
  @SerializedName(SERIALIZED_NAME_LIABILITY_MULTIPLES)
  private Double liabilityMultiples;

  public static final String SERIALIZED_NAME_LIABILITY_SUPER_SINGLES = "LiabilitySuperSingles";
  @SerializedName(SERIALIZED_NAME_LIABILITY_SUPER_SINGLES)
  private Double liabilitySuperSingles;

  public static final String SERIALIZED_NAME_LIABILITY_TOTAL = "LiabilityTotal";
  @SerializedName(SERIALIZED_NAME_LIABILITY_TOTAL)
  private Double liabilityTotal;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public LiabilityUpdate() {
  }

  public LiabilityUpdate marketId(String marketId) {
    this.marketId = marketId;
    return this;
  }

   /**
   * Get marketId
   * @return marketId
  **/
  @javax.annotation.Nullable
  public String getMarketId() {
    return marketId;
  }

  public void setMarketId(String marketId) {
    this.marketId = marketId;
  }


  public LiabilityUpdate selectionId(String selectionId) {
    this.selectionId = selectionId;
    return this;
  }

   /**
   * Get selectionId
   * @return selectionId
  **/
  @javax.annotation.Nullable
  public String getSelectionId() {
    return selectionId;
  }

  public void setSelectionId(String selectionId) {
    this.selectionId = selectionId;
  }


  public LiabilityUpdate odds(Double odds) {
    this.odds = odds;
    return this;
  }

   /**
   * Get odds
   * @return odds
  **/
  @javax.annotation.Nullable
  public Double getOdds() {
    return odds;
  }

  public void setOdds(Double odds) {
    this.odds = odds;
  }


  public LiabilityUpdate singleBets(Double singleBets) {
    this.singleBets = singleBets;
    return this;
  }

   /**
   * Get singleBets
   * @return singleBets
  **/
  @javax.annotation.Nullable
  public Double getSingleBets() {
    return singleBets;
  }

  public void setSingleBets(Double singleBets) {
    this.singleBets = singleBets;
  }


  public LiabilityUpdate singleStakes(Double singleStakes) {
    this.singleStakes = singleStakes;
    return this;
  }

   /**
   * Get singleStakes
   * @return singleStakes
  **/
  @javax.annotation.Nullable
  public Double getSingleStakes() {
    return singleStakes;
  }

  public void setSingleStakes(Double singleStakes) {
    this.singleStakes = singleStakes;
  }


  public LiabilityUpdate multipleBets(Double multipleBets) {
    this.multipleBets = multipleBets;
    return this;
  }

   /**
   * Get multipleBets
   * @return multipleBets
  **/
  @javax.annotation.Nullable
  public Double getMultipleBets() {
    return multipleBets;
  }

  public void setMultipleBets(Double multipleBets) {
    this.multipleBets = multipleBets;
  }


  public LiabilityUpdate multipleStakes(Double multipleStakes) {
    this.multipleStakes = multipleStakes;
    return this;
  }

   /**
   * Get multipleStakes
   * @return multipleStakes
  **/
  @javax.annotation.Nullable
  public Double getMultipleStakes() {
    return multipleStakes;
  }

  public void setMultipleStakes(Double multipleStakes) {
    this.multipleStakes = multipleStakes;
  }


  public LiabilityUpdate totalBets(Double totalBets) {
    this.totalBets = totalBets;
    return this;
  }

   /**
   * Get totalBets
   * @return totalBets
  **/
  @javax.annotation.Nullable
  public Double getTotalBets() {
    return totalBets;
  }

  public void setTotalBets(Double totalBets) {
    this.totalBets = totalBets;
  }


  public LiabilityUpdate totalStakes(Double totalStakes) {
    this.totalStakes = totalStakes;
    return this;
  }

   /**
   * Get totalStakes
   * @return totalStakes
  **/
  @javax.annotation.Nullable
  public Double getTotalStakes() {
    return totalStakes;
  }

  public void setTotalStakes(Double totalStakes) {
    this.totalStakes = totalStakes;
  }


  public LiabilityUpdate liabilitySingles(Double liabilitySingles) {
    this.liabilitySingles = liabilitySingles;
    return this;
  }

   /**
   * Get liabilitySingles
   * @return liabilitySingles
  **/
  @javax.annotation.Nullable
  public Double getLiabilitySingles() {
    return liabilitySingles;
  }

  public void setLiabilitySingles(Double liabilitySingles) {
    this.liabilitySingles = liabilitySingles;
  }


  public LiabilityUpdate liabilityMultiples(Double liabilityMultiples) {
    this.liabilityMultiples = liabilityMultiples;
    return this;
  }

   /**
   * Get liabilityMultiples
   * @return liabilityMultiples
  **/
  @javax.annotation.Nullable
  public Double getLiabilityMultiples() {
    return liabilityMultiples;
  }

  public void setLiabilityMultiples(Double liabilityMultiples) {
    this.liabilityMultiples = liabilityMultiples;
  }


  public LiabilityUpdate liabilitySuperSingles(Double liabilitySuperSingles) {
    this.liabilitySuperSingles = liabilitySuperSingles;
    return this;
  }

   /**
   * Get liabilitySuperSingles
   * @return liabilitySuperSingles
  **/
  @javax.annotation.Nullable
  public Double getLiabilitySuperSingles() {
    return liabilitySuperSingles;
  }

  public void setLiabilitySuperSingles(Double liabilitySuperSingles) {
    this.liabilitySuperSingles = liabilitySuperSingles;
  }


  public LiabilityUpdate liabilityTotal(Double liabilityTotal) {
    this.liabilityTotal = liabilityTotal;
    return this;
  }

   /**
   * Get liabilityTotal
   * @return liabilityTotal
  **/
  @javax.annotation.Nullable
  public Double getLiabilityTotal() {
    return liabilityTotal;
  }

  public void setLiabilityTotal(Double liabilityTotal) {
    this.liabilityTotal = liabilityTotal;
  }


  public LiabilityUpdate eventId(Long eventId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiabilityUpdate liabilityUpdate = (LiabilityUpdate) o;
    return Objects.equals(this.marketId, liabilityUpdate.marketId) &&
        Objects.equals(this.selectionId, liabilityUpdate.selectionId) &&
        Objects.equals(this.odds, liabilityUpdate.odds) &&
        Objects.equals(this.singleBets, liabilityUpdate.singleBets) &&
        Objects.equals(this.singleStakes, liabilityUpdate.singleStakes) &&
        Objects.equals(this.multipleBets, liabilityUpdate.multipleBets) &&
        Objects.equals(this.multipleStakes, liabilityUpdate.multipleStakes) &&
        Objects.equals(this.totalBets, liabilityUpdate.totalBets) &&
        Objects.equals(this.totalStakes, liabilityUpdate.totalStakes) &&
        Objects.equals(this.liabilitySingles, liabilityUpdate.liabilitySingles) &&
        Objects.equals(this.liabilityMultiples, liabilityUpdate.liabilityMultiples) &&
        Objects.equals(this.liabilitySuperSingles, liabilityUpdate.liabilitySuperSingles) &&
        Objects.equals(this.liabilityTotal, liabilityUpdate.liabilityTotal) &&
        Objects.equals(this.eventId, liabilityUpdate.eventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, selectionId, odds, singleBets, singleStakes, multipleBets, multipleStakes, totalBets, totalStakes, liabilitySingles, liabilityMultiples, liabilitySuperSingles, liabilityTotal, eventId);
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
    sb.append("class LiabilityUpdate {\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    selectionId: ").append(toIndentedString(selectionId)).append("\n");
    sb.append("    odds: ").append(toIndentedString(odds)).append("\n");
    sb.append("    singleBets: ").append(toIndentedString(singleBets)).append("\n");
    sb.append("    singleStakes: ").append(toIndentedString(singleStakes)).append("\n");
    sb.append("    multipleBets: ").append(toIndentedString(multipleBets)).append("\n");
    sb.append("    multipleStakes: ").append(toIndentedString(multipleStakes)).append("\n");
    sb.append("    totalBets: ").append(toIndentedString(totalBets)).append("\n");
    sb.append("    totalStakes: ").append(toIndentedString(totalStakes)).append("\n");
    sb.append("    liabilitySingles: ").append(toIndentedString(liabilitySingles)).append("\n");
    sb.append("    liabilityMultiples: ").append(toIndentedString(liabilityMultiples)).append("\n");
    sb.append("    liabilitySuperSingles: ").append(toIndentedString(liabilitySuperSingles)).append("\n");
    sb.append("    liabilityTotal: ").append(toIndentedString(liabilityTotal)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
    openapiFields.add("MarketId");
    openapiFields.add("SelectionId");
    openapiFields.add("Odds");
    openapiFields.add("SingleBets");
    openapiFields.add("SingleStakes");
    openapiFields.add("MultipleBets");
    openapiFields.add("MultipleStakes");
    openapiFields.add("TotalBets");
    openapiFields.add("TotalStakes");
    openapiFields.add("LiabilitySingles");
    openapiFields.add("LiabilityMultiples");
    openapiFields.add("LiabilitySuperSingles");
    openapiFields.add("LiabilityTotal");
    openapiFields.add("EventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LiabilityUpdate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiabilityUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiabilityUpdate is not found in the empty JSON string", LiabilityUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LiabilityUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiabilityUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MarketId") != null && !jsonObj.get("MarketId").isJsonNull()) && !jsonObj.get("MarketId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketId").toString()));
      }
      if ((jsonObj.get("SelectionId") != null && !jsonObj.get("SelectionId").isJsonNull()) && !jsonObj.get("SelectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SelectionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiabilityUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiabilityUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiabilityUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiabilityUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<LiabilityUpdate>() {
           @Override
           public void write(JsonWriter out, LiabilityUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiabilityUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiabilityUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiabilityUpdate
  * @throws IOException if the JSON string is invalid with respect to LiabilityUpdate
  */
  public static LiabilityUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiabilityUpdate.class);
  }

 /**
  * Convert an instance of LiabilityUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
