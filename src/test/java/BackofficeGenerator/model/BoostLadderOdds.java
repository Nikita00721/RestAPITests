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
 * BoostLadderOdds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostLadderOdds {
  public static final String SERIALIZED_NAME_PRICES = "Prices";
  @SerializedName(SERIALIZED_NAME_PRICES)
  private List<BoostLadderPrice> prices;

  public static final String SERIALIZED_NAME_ODD = "Odd";
  @SerializedName(SERIALIZED_NAME_ODD)
  private Double odd;

  public BoostLadderOdds() {
  }

  public BoostLadderOdds prices(List<BoostLadderPrice> prices) {
    this.prices = prices;
    return this;
  }

  public BoostLadderOdds addPricesItem(BoostLadderPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @javax.annotation.Nullable
  public List<BoostLadderPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<BoostLadderPrice> prices) {
    this.prices = prices;
  }


  public BoostLadderOdds odd(Double odd) {
    this.odd = odd;
    return this;
  }

   /**
   * Get odd
   * @return odd
  **/
  @javax.annotation.Nullable
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
    BoostLadderOdds boostLadderOdds = (BoostLadderOdds) o;
    return Objects.equals(this.prices, boostLadderOdds.prices) &&
        Objects.equals(this.odd, boostLadderOdds.odd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, odd);
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
    sb.append("class BoostLadderOdds {\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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
    openapiFields.add("Prices");
    openapiFields.add("Odd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostLadderOdds
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostLadderOdds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostLadderOdds is not found in the empty JSON string", BoostLadderOdds.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostLadderOdds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostLadderOdds` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Prices") != null && !jsonObj.get("Prices").isJsonNull()) {
        JsonArray jsonArrayprices = jsonObj.getAsJsonArray("Prices");
        if (jsonArrayprices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Prices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Prices` to be an array in the JSON string but got `%s`", jsonObj.get("Prices").toString()));
          }

          // validate the optional field `Prices` (array)
          for (int i = 0; i < jsonArrayprices.size(); i++) {
            BoostLadderPrice.validateJsonElement(jsonArrayprices.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostLadderOdds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostLadderOdds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostLadderOdds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostLadderOdds.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostLadderOdds>() {
           @Override
           public void write(JsonWriter out, BoostLadderOdds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostLadderOdds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostLadderOdds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostLadderOdds
  * @throws IOException if the JSON string is invalid with respect to BoostLadderOdds
  */
  public static BoostLadderOdds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostLadderOdds.class);
  }

 /**
  * Convert an instance of BoostLadderOdds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

