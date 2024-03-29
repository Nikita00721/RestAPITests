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
 * LiabilityMarketTypeItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LiabilityMarketTypeItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_TURNOVER = "Turnover";
  @SerializedName(SERIALIZED_NAME_TURNOVER)
  private Double turnover;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_SELECTIONS = "Selections";
  @SerializedName(SERIALIZED_NAME_SELECTIONS)
  private List<MarketTypeSelectionItem> selections;

  public static final String SERIALIZED_NAME_MARKET_ID = "MarketId";
  @SerializedName(SERIALIZED_NAME_MARKET_ID)
  private String marketId;

  public LiabilityMarketTypeItem() {
  }

  public LiabilityMarketTypeItem name(String name) {
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


  public LiabilityMarketTypeItem sortOrder(Integer sortOrder) {
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


  public LiabilityMarketTypeItem turnover(Double turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * Get turnover
   * @return turnover
  **/
  @javax.annotation.Nullable
  public Double getTurnover() {
    return turnover;
  }

  public void setTurnover(Double turnover) {
    this.turnover = turnover;
  }


  public LiabilityMarketTypeItem marketTypeId(Integer marketTypeId) {
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


  public LiabilityMarketTypeItem selections(List<MarketTypeSelectionItem> selections) {
    this.selections = selections;
    return this;
  }

  public LiabilityMarketTypeItem addSelectionsItem(MarketTypeSelectionItem selectionsItem) {
    if (this.selections == null) {
      this.selections = new ArrayList<>();
    }
    this.selections.add(selectionsItem);
    return this;
  }

   /**
   * Get selections
   * @return selections
  **/
  @javax.annotation.Nullable
  public List<MarketTypeSelectionItem> getSelections() {
    return selections;
  }

  public void setSelections(List<MarketTypeSelectionItem> selections) {
    this.selections = selections;
  }


  public LiabilityMarketTypeItem marketId(String marketId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiabilityMarketTypeItem liabilityMarketTypeItem = (LiabilityMarketTypeItem) o;
    return Objects.equals(this.name, liabilityMarketTypeItem.name) &&
        Objects.equals(this.sortOrder, liabilityMarketTypeItem.sortOrder) &&
        Objects.equals(this.turnover, liabilityMarketTypeItem.turnover) &&
        Objects.equals(this.marketTypeId, liabilityMarketTypeItem.marketTypeId) &&
        Objects.equals(this.selections, liabilityMarketTypeItem.selections) &&
        Objects.equals(this.marketId, liabilityMarketTypeItem.marketId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sortOrder, turnover, marketTypeId, selections, marketId);
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
    sb.append("class LiabilityMarketTypeItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    selections: ").append(toIndentedString(selections)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
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
    openapiFields.add("SortOrder");
    openapiFields.add("Turnover");
    openapiFields.add("MarketTypeId");
    openapiFields.add("Selections");
    openapiFields.add("MarketId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LiabilityMarketTypeItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiabilityMarketTypeItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiabilityMarketTypeItem is not found in the empty JSON string", LiabilityMarketTypeItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LiabilityMarketTypeItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiabilityMarketTypeItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Selections") != null && !jsonObj.get("Selections").isJsonNull()) {
        JsonArray jsonArrayselections = jsonObj.getAsJsonArray("Selections");
        if (jsonArrayselections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Selections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Selections` to be an array in the JSON string but got `%s`", jsonObj.get("Selections").toString()));
          }

          // validate the optional field `Selections` (array)
          for (int i = 0; i < jsonArrayselections.size(); i++) {
            MarketTypeSelectionItem.validateJsonElement(jsonArrayselections.get(i));
          };
        }
      }
      if ((jsonObj.get("MarketId") != null && !jsonObj.get("MarketId").isJsonNull()) && !jsonObj.get("MarketId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiabilityMarketTypeItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiabilityMarketTypeItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiabilityMarketTypeItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiabilityMarketTypeItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LiabilityMarketTypeItem>() {
           @Override
           public void write(JsonWriter out, LiabilityMarketTypeItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiabilityMarketTypeItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiabilityMarketTypeItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiabilityMarketTypeItem
  * @throws IOException if the JSON string is invalid with respect to LiabilityMarketTypeItem
  */
  public static LiabilityMarketTypeItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiabilityMarketTypeItem.class);
  }

 /**
  * Convert an instance of LiabilityMarketTypeItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

