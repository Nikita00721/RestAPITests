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
 * BoreDrawRuleItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoreDrawRuleItem {
  public static final String SERIALIZED_NAME_MARKETS = "Markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<BoreDrawRuleMarketItem> markets;

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<BoreDrawCategoryItem> categories;

  public static final String SERIALIZED_NAME_CHAMPS = "Champs";
  @SerializedName(SERIALIZED_NAME_CHAMPS)
  private List<BoreDrawChampItem> champs;

  public static final String SERIALIZED_NAME_RULE_ID = "RuleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private Integer ruleId;

  public BoreDrawRuleItem() {
  }

  public BoreDrawRuleItem markets(List<BoreDrawRuleMarketItem> markets) {
    this.markets = markets;
    return this;
  }

  public BoreDrawRuleItem addMarketsItem(BoreDrawRuleMarketItem marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @javax.annotation.Nullable
  public List<BoreDrawRuleMarketItem> getMarkets() {
    return markets;
  }

  public void setMarkets(List<BoreDrawRuleMarketItem> markets) {
    this.markets = markets;
  }


  public BoreDrawRuleItem categories(List<BoreDrawCategoryItem> categories) {
    this.categories = categories;
    return this;
  }

  public BoreDrawRuleItem addCategoriesItem(BoreDrawCategoryItem categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<BoreDrawCategoryItem> getCategories() {
    return categories;
  }

  public void setCategories(List<BoreDrawCategoryItem> categories) {
    this.categories = categories;
  }


  public BoreDrawRuleItem champs(List<BoreDrawChampItem> champs) {
    this.champs = champs;
    return this;
  }

  public BoreDrawRuleItem addChampsItem(BoreDrawChampItem champsItem) {
    if (this.champs == null) {
      this.champs = new ArrayList<>();
    }
    this.champs.add(champsItem);
    return this;
  }

   /**
   * Get champs
   * @return champs
  **/
  @javax.annotation.Nullable
  public List<BoreDrawChampItem> getChamps() {
    return champs;
  }

  public void setChamps(List<BoreDrawChampItem> champs) {
    this.champs = champs;
  }


  public BoreDrawRuleItem ruleId(Integer ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public Integer getRuleId() {
    return ruleId;
  }

  public void setRuleId(Integer ruleId) {
    this.ruleId = ruleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoreDrawRuleItem boreDrawRuleItem = (BoreDrawRuleItem) o;
    return Objects.equals(this.markets, boreDrawRuleItem.markets) &&
        Objects.equals(this.categories, boreDrawRuleItem.categories) &&
        Objects.equals(this.champs, boreDrawRuleItem.champs) &&
        Objects.equals(this.ruleId, boreDrawRuleItem.ruleId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, categories, champs, ruleId);
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
    sb.append("class BoreDrawRuleItem {\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
    openapiFields.add("Markets");
    openapiFields.add("Categories");
    openapiFields.add("Champs");
    openapiFields.add("RuleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoreDrawRuleItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoreDrawRuleItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoreDrawRuleItem is not found in the empty JSON string", BoreDrawRuleItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoreDrawRuleItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoreDrawRuleItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Markets") != null && !jsonObj.get("Markets").isJsonNull()) {
        JsonArray jsonArraymarkets = jsonObj.getAsJsonArray("Markets");
        if (jsonArraymarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Markets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Markets` to be an array in the JSON string but got `%s`", jsonObj.get("Markets").toString()));
          }

          // validate the optional field `Markets` (array)
          for (int i = 0; i < jsonArraymarkets.size(); i++) {
            BoreDrawRuleMarketItem.validateJsonElement(jsonArraymarkets.get(i));
          };
        }
      }
      if (jsonObj.get("Categories") != null && !jsonObj.get("Categories").isJsonNull()) {
        JsonArray jsonArraycategories = jsonObj.getAsJsonArray("Categories");
        if (jsonArraycategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Categories` to be an array in the JSON string but got `%s`", jsonObj.get("Categories").toString()));
          }

          // validate the optional field `Categories` (array)
          for (int i = 0; i < jsonArraycategories.size(); i++) {
            BoreDrawCategoryItem.validateJsonElement(jsonArraycategories.get(i));
          };
        }
      }
      if (jsonObj.get("Champs") != null && !jsonObj.get("Champs").isJsonNull()) {
        JsonArray jsonArraychamps = jsonObj.getAsJsonArray("Champs");
        if (jsonArraychamps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Champs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Champs` to be an array in the JSON string but got `%s`", jsonObj.get("Champs").toString()));
          }

          // validate the optional field `Champs` (array)
          for (int i = 0; i < jsonArraychamps.size(); i++) {
            BoreDrawChampItem.validateJsonElement(jsonArraychamps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoreDrawRuleItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoreDrawRuleItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoreDrawRuleItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoreDrawRuleItem.class));

       return (TypeAdapter<T>) new TypeAdapter<BoreDrawRuleItem>() {
           @Override
           public void write(JsonWriter out, BoreDrawRuleItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoreDrawRuleItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoreDrawRuleItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoreDrawRuleItem
  * @throws IOException if the JSON string is invalid with respect to BoreDrawRuleItem
  */
  public static BoreDrawRuleItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoreDrawRuleItem.class);
  }

 /**
  * Convert an instance of BoreDrawRuleItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

