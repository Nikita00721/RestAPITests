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
 * LiabilitySelection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LiabilitySelection {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_DECIMAL_SPOV = "DecimalSpov";
  @SerializedName(SERIALIZED_NAME_DECIMAL_SPOV)
  private Double decimalSpov;

  public static final String SERIALIZED_NAME_SELECTION_ID = "SelectionId";
  @SerializedName(SERIALIZED_NAME_SELECTION_ID)
  private String selectionId;

  public LiabilitySelection() {
  }

  public LiabilitySelection name(String name) {
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


  public LiabilitySelection odds(Double odds) {
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


  public LiabilitySelection singleBets(Double singleBets) {
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


  public LiabilitySelection singleStakes(Double singleStakes) {
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


  public LiabilitySelection multipleBets(Double multipleBets) {
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


  public LiabilitySelection multipleStakes(Double multipleStakes) {
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


  public LiabilitySelection totalBets(Double totalBets) {
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


  public LiabilitySelection totalStakes(Double totalStakes) {
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


  public LiabilitySelection liabilitySingles(Double liabilitySingles) {
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


  public LiabilitySelection liabilityMultiples(Double liabilityMultiples) {
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


  public LiabilitySelection liabilitySuperSingles(Double liabilitySuperSingles) {
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


  public LiabilitySelection liabilityTotal(Double liabilityTotal) {
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


  public LiabilitySelection sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public LiabilitySelection decimalSpov(Double decimalSpov) {
    this.decimalSpov = decimalSpov;
    return this;
  }

   /**
   * Get decimalSpov
   * @return decimalSpov
  **/
  @javax.annotation.Nullable
  public Double getDecimalSpov() {
    return decimalSpov;
  }

  public void setDecimalSpov(Double decimalSpov) {
    this.decimalSpov = decimalSpov;
  }


  public LiabilitySelection selectionId(String selectionId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiabilitySelection liabilitySelection = (LiabilitySelection) o;
    return Objects.equals(this.name, liabilitySelection.name) &&
        Objects.equals(this.odds, liabilitySelection.odds) &&
        Objects.equals(this.singleBets, liabilitySelection.singleBets) &&
        Objects.equals(this.singleStakes, liabilitySelection.singleStakes) &&
        Objects.equals(this.multipleBets, liabilitySelection.multipleBets) &&
        Objects.equals(this.multipleStakes, liabilitySelection.multipleStakes) &&
        Objects.equals(this.totalBets, liabilitySelection.totalBets) &&
        Objects.equals(this.totalStakes, liabilitySelection.totalStakes) &&
        Objects.equals(this.liabilitySingles, liabilitySelection.liabilitySingles) &&
        Objects.equals(this.liabilityMultiples, liabilitySelection.liabilityMultiples) &&
        Objects.equals(this.liabilitySuperSingles, liabilitySelection.liabilitySuperSingles) &&
        Objects.equals(this.liabilityTotal, liabilitySelection.liabilityTotal) &&
        Objects.equals(this.sortOrder, liabilitySelection.sortOrder) &&
        Objects.equals(this.decimalSpov, liabilitySelection.decimalSpov) &&
        Objects.equals(this.selectionId, liabilitySelection.selectionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, odds, singleBets, singleStakes, multipleBets, multipleStakes, totalBets, totalStakes, liabilitySingles, liabilityMultiples, liabilitySuperSingles, liabilityTotal, sortOrder, decimalSpov, selectionId);
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
    sb.append("class LiabilitySelection {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    decimalSpov: ").append(toIndentedString(decimalSpov)).append("\n");
    sb.append("    selectionId: ").append(toIndentedString(selectionId)).append("\n");
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
    openapiFields.add("SortOrder");
    openapiFields.add("DecimalSpov");
    openapiFields.add("SelectionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LiabilitySelection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiabilitySelection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiabilitySelection is not found in the empty JSON string", LiabilitySelection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LiabilitySelection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiabilitySelection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("SelectionId") != null && !jsonObj.get("SelectionId").isJsonNull()) && !jsonObj.get("SelectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SelectionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiabilitySelection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiabilitySelection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiabilitySelection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiabilitySelection.class));

       return (TypeAdapter<T>) new TypeAdapter<LiabilitySelection>() {
           @Override
           public void write(JsonWriter out, LiabilitySelection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiabilitySelection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiabilitySelection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiabilitySelection
  * @throws IOException if the JSON string is invalid with respect to LiabilitySelection
  */
  public static LiabilitySelection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiabilitySelection.class);
  }

 /**
  * Convert an instance of LiabilitySelection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

