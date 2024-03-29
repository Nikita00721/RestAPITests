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
 * LotteryClassicMarket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LotteryClassicMarket {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KIND = "Kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private LotteryMarketKinds kind;

  public static final String SERIALIZED_NAME_SELECTIONS = "Selections";
  @SerializedName(SERIALIZED_NAME_SELECTIONS)
  private List<LotteryClassicMarketOutcome> selections;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public LotteryClassicMarket() {
  }

  public LotteryClassicMarket name(String name) {
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


  public LotteryClassicMarket kind(LotteryMarketKinds kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  public LotteryMarketKinds getKind() {
    return kind;
  }

  public void setKind(LotteryMarketKinds kind) {
    this.kind = kind;
  }


  public LotteryClassicMarket selections(List<LotteryClassicMarketOutcome> selections) {
    this.selections = selections;
    return this;
  }

  public LotteryClassicMarket addSelectionsItem(LotteryClassicMarketOutcome selectionsItem) {
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
  public List<LotteryClassicMarketOutcome> getSelections() {
    return selections;
  }

  public void setSelections(List<LotteryClassicMarketOutcome> selections) {
    this.selections = selections;
  }


  public LotteryClassicMarket marketTypeId(Integer marketTypeId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LotteryClassicMarket lotteryClassicMarket = (LotteryClassicMarket) o;
    return Objects.equals(this.name, lotteryClassicMarket.name) &&
        Objects.equals(this.kind, lotteryClassicMarket.kind) &&
        Objects.equals(this.selections, lotteryClassicMarket.selections) &&
        Objects.equals(this.marketTypeId, lotteryClassicMarket.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, kind, selections, marketTypeId);
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
    sb.append("class LotteryClassicMarket {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    selections: ").append(toIndentedString(selections)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
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
    openapiFields.add("Kind");
    openapiFields.add("Selections");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LotteryClassicMarket
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LotteryClassicMarket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LotteryClassicMarket is not found in the empty JSON string", LotteryClassicMarket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LotteryClassicMarket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LotteryClassicMarket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `Kind`
      if (jsonObj.get("Kind") != null && !jsonObj.get("Kind").isJsonNull()) {
        LotteryMarketKinds.validateJsonElement(jsonObj.get("Kind"));
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
            LotteryClassicMarketOutcome.validateJsonElement(jsonArrayselections.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LotteryClassicMarket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LotteryClassicMarket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LotteryClassicMarket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LotteryClassicMarket.class));

       return (TypeAdapter<T>) new TypeAdapter<LotteryClassicMarket>() {
           @Override
           public void write(JsonWriter out, LotteryClassicMarket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LotteryClassicMarket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LotteryClassicMarket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LotteryClassicMarket
  * @throws IOException if the JSON string is invalid with respect to LotteryClassicMarket
  */
  public static LotteryClassicMarket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LotteryClassicMarket.class);
  }

 /**
  * Convert an instance of LotteryClassicMarket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

