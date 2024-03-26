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
 * GetMarketMarginSummariesRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetMarketMarginSummariesRequestFilters {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_SELECTIONS_NUMBER = "SelectionsNumber";
  @SerializedName(SERIALIZED_NAME_SELECTIONS_NUMBER)
  private Integer selectionsNumber;

  public static final String SERIALIZED_NAME_MSUM = "Msum";
  @SerializedName(SERIALIZED_NAME_MSUM)
  private Double msum;

  public static final String SERIALIZED_NAME_ONLY_MULTILINES = "OnlyMultilines";
  @SerializedName(SERIALIZED_NAME_ONLY_MULTILINES)
  private Boolean onlyMultilines;

  public GetMarketMarginSummariesRequestFilters() {
  }

  public GetMarketMarginSummariesRequestFilters marketTypeId(Integer marketTypeId) {
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


  public GetMarketMarginSummariesRequestFilters selectionsNumber(Integer selectionsNumber) {
    this.selectionsNumber = selectionsNumber;
    return this;
  }

   /**
   * Get selectionsNumber
   * @return selectionsNumber
  **/
  @javax.annotation.Nullable
  public Integer getSelectionsNumber() {
    return selectionsNumber;
  }

  public void setSelectionsNumber(Integer selectionsNumber) {
    this.selectionsNumber = selectionsNumber;
  }


  public GetMarketMarginSummariesRequestFilters msum(Double msum) {
    this.msum = msum;
    return this;
  }

   /**
   * Get msum
   * @return msum
  **/
  @javax.annotation.Nullable
  public Double getMsum() {
    return msum;
  }

  public void setMsum(Double msum) {
    this.msum = msum;
  }


  public GetMarketMarginSummariesRequestFilters onlyMultilines(Boolean onlyMultilines) {
    this.onlyMultilines = onlyMultilines;
    return this;
  }

   /**
   * Get onlyMultilines
   * @return onlyMultilines
  **/
  @javax.annotation.Nullable
  public Boolean getOnlyMultilines() {
    return onlyMultilines;
  }

  public void setOnlyMultilines(Boolean onlyMultilines) {
    this.onlyMultilines = onlyMultilines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketMarginSummariesRequestFilters getMarketMarginSummariesRequestFilters = (GetMarketMarginSummariesRequestFilters) o;
    return Objects.equals(this.marketTypeId, getMarketMarginSummariesRequestFilters.marketTypeId) &&
        Objects.equals(this.selectionsNumber, getMarketMarginSummariesRequestFilters.selectionsNumber) &&
        Objects.equals(this.msum, getMarketMarginSummariesRequestFilters.msum) &&
        Objects.equals(this.onlyMultilines, getMarketMarginSummariesRequestFilters.onlyMultilines);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, selectionsNumber, msum, onlyMultilines);
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
    sb.append("class GetMarketMarginSummariesRequestFilters {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    selectionsNumber: ").append(toIndentedString(selectionsNumber)).append("\n");
    sb.append("    msum: ").append(toIndentedString(msum)).append("\n");
    sb.append("    onlyMultilines: ").append(toIndentedString(onlyMultilines)).append("\n");
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
    openapiFields.add("SelectionsNumber");
    openapiFields.add("Msum");
    openapiFields.add("OnlyMultilines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMarketMarginSummariesRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMarketMarginSummariesRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMarketMarginSummariesRequestFilters is not found in the empty JSON string", GetMarketMarginSummariesRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMarketMarginSummariesRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMarketMarginSummariesRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMarketMarginSummariesRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMarketMarginSummariesRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMarketMarginSummariesRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMarketMarginSummariesRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMarketMarginSummariesRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetMarketMarginSummariesRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMarketMarginSummariesRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMarketMarginSummariesRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMarketMarginSummariesRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetMarketMarginSummariesRequestFilters
  */
  public static GetMarketMarginSummariesRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMarketMarginSummariesRequestFilters.class);
  }

 /**
  * Convert an instance of GetMarketMarginSummariesRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

