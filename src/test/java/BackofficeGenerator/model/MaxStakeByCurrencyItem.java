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
 * MaxStakeByCurrencyItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MaxStakeByCurrencyItem {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MAX_STAKE = "MaxStake";
  @SerializedName(SERIALIZED_NAME_MAX_STAKE)
  private Double maxStake;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "CurrencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;

  public MaxStakeByCurrencyItem() {
  }

  public MaxStakeByCurrencyItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MaxStakeByCurrencyItem name(String name) {
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


  public MaxStakeByCurrencyItem maxStake(Double maxStake) {
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


  public MaxStakeByCurrencyItem currencyId(Integer currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @javax.annotation.Nullable
  public Integer getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Integer currencyId) {
    this.currencyId = currencyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxStakeByCurrencyItem maxStakeByCurrencyItem = (MaxStakeByCurrencyItem) o;
    return Objects.equals(this.description, maxStakeByCurrencyItem.description) &&
        Objects.equals(this.name, maxStakeByCurrencyItem.name) &&
        Objects.equals(this.maxStake, maxStakeByCurrencyItem.maxStake) &&
        Objects.equals(this.currencyId, maxStakeByCurrencyItem.currencyId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, maxStake, currencyId);
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
    sb.append("class MaxStakeByCurrencyItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxStake: ").append(toIndentedString(maxStake)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
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
    openapiFields.add("Description");
    openapiFields.add("Name");
    openapiFields.add("MaxStake");
    openapiFields.add("CurrencyId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MaxStakeByCurrencyItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MaxStakeByCurrencyItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaxStakeByCurrencyItem is not found in the empty JSON string", MaxStakeByCurrencyItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MaxStakeByCurrencyItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MaxStakeByCurrencyItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaxStakeByCurrencyItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaxStakeByCurrencyItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaxStakeByCurrencyItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaxStakeByCurrencyItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MaxStakeByCurrencyItem>() {
           @Override
           public void write(JsonWriter out, MaxStakeByCurrencyItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaxStakeByCurrencyItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaxStakeByCurrencyItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaxStakeByCurrencyItem
  * @throws IOException if the JSON string is invalid with respect to MaxStakeByCurrencyItem
  */
  public static MaxStakeByCurrencyItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaxStakeByCurrencyItem.class);
  }

 /**
  * Convert an instance of MaxStakeByCurrencyItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

