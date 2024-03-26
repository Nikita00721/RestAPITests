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
 * BoostItemHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostItemHeader {
  public static final String SERIALIZED_NAME_SELECTION_TYPE_ID = "SelectionTypeId";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE_ID)
  private Integer selectionTypeId;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_VALUE = "SpecialOddsValue";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_VALUE)
  private String specialOddsValue;

  public static final String SERIALIZED_NAME_BOOST_METHOD = "BoostMethod";
  @SerializedName(SERIALIZED_NAME_BOOST_METHOD)
  private BoostItemMethod boostMethod;

  public static final String SERIALIZED_NAME_LADDER_TYPE_ID = "LadderTypeId";
  @SerializedName(SERIALIZED_NAME_LADDER_TYPE_ID)
  private LadderTypes ladderTypeId;

  public static final String SERIALIZED_NAME_SELECTION_ID = "SelectionId";
  @SerializedName(SERIALIZED_NAME_SELECTION_ID)
  private Long selectionId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public BoostItemHeader() {
  }

  public BoostItemHeader selectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
    return this;
  }

   /**
   * Get selectionTypeId
   * @return selectionTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSelectionTypeId() {
    return selectionTypeId;
  }

  public void setSelectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
  }


  public BoostItemHeader specialOddsValue(String specialOddsValue) {
    this.specialOddsValue = specialOddsValue;
    return this;
  }

   /**
   * Get specialOddsValue
   * @return specialOddsValue
  **/
  @javax.annotation.Nullable
  public String getSpecialOddsValue() {
    return specialOddsValue;
  }

  public void setSpecialOddsValue(String specialOddsValue) {
    this.specialOddsValue = specialOddsValue;
  }


  public BoostItemHeader boostMethod(BoostItemMethod boostMethod) {
    this.boostMethod = boostMethod;
    return this;
  }

   /**
   * Get boostMethod
   * @return boostMethod
  **/
  @javax.annotation.Nullable
  public BoostItemMethod getBoostMethod() {
    return boostMethod;
  }

  public void setBoostMethod(BoostItemMethod boostMethod) {
    this.boostMethod = boostMethod;
  }


  public BoostItemHeader ladderTypeId(LadderTypes ladderTypeId) {
    this.ladderTypeId = ladderTypeId;
    return this;
  }

   /**
   * Get ladderTypeId
   * @return ladderTypeId
  **/
  @javax.annotation.Nullable
  public LadderTypes getLadderTypeId() {
    return ladderTypeId;
  }

  public void setLadderTypeId(LadderTypes ladderTypeId) {
    this.ladderTypeId = ladderTypeId;
  }


  public BoostItemHeader selectionId(Long selectionId) {
    this.selectionId = selectionId;
    return this;
  }

   /**
   * Get selectionId
   * @return selectionId
  **/
  @javax.annotation.Nullable
  public Long getSelectionId() {
    return selectionId;
  }

  public void setSelectionId(Long selectionId) {
    this.selectionId = selectionId;
  }


  public BoostItemHeader marketTypeId(Integer marketTypeId) {
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
    BoostItemHeader boostItemHeader = (BoostItemHeader) o;
    return Objects.equals(this.selectionTypeId, boostItemHeader.selectionTypeId) &&
        Objects.equals(this.specialOddsValue, boostItemHeader.specialOddsValue) &&
        Objects.equals(this.boostMethod, boostItemHeader.boostMethod) &&
        Objects.equals(this.ladderTypeId, boostItemHeader.ladderTypeId) &&
        Objects.equals(this.selectionId, boostItemHeader.selectionId) &&
        Objects.equals(this.marketTypeId, boostItemHeader.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectionTypeId, specialOddsValue, boostMethod, ladderTypeId, selectionId, marketTypeId);
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
    sb.append("class BoostItemHeader {\n");
    sb.append("    selectionTypeId: ").append(toIndentedString(selectionTypeId)).append("\n");
    sb.append("    specialOddsValue: ").append(toIndentedString(specialOddsValue)).append("\n");
    sb.append("    boostMethod: ").append(toIndentedString(boostMethod)).append("\n");
    sb.append("    ladderTypeId: ").append(toIndentedString(ladderTypeId)).append("\n");
    sb.append("    selectionId: ").append(toIndentedString(selectionId)).append("\n");
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
    openapiFields.add("SelectionTypeId");
    openapiFields.add("SpecialOddsValue");
    openapiFields.add("BoostMethod");
    openapiFields.add("LadderTypeId");
    openapiFields.add("SelectionId");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostItemHeader
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostItemHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostItemHeader is not found in the empty JSON string", BoostItemHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostItemHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostItemHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SpecialOddsValue") != null && !jsonObj.get("SpecialOddsValue").isJsonNull()) && !jsonObj.get("SpecialOddsValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SpecialOddsValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SpecialOddsValue").toString()));
      }
      // validate the optional field `BoostMethod`
      if (jsonObj.get("BoostMethod") != null && !jsonObj.get("BoostMethod").isJsonNull()) {
        BoostItemMethod.validateJsonElement(jsonObj.get("BoostMethod"));
      }
      // validate the optional field `LadderTypeId`
      if (jsonObj.get("LadderTypeId") != null && !jsonObj.get("LadderTypeId").isJsonNull()) {
        LadderTypes.validateJsonElement(jsonObj.get("LadderTypeId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostItemHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostItemHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostItemHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostItemHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostItemHeader>() {
           @Override
           public void write(JsonWriter out, BoostItemHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostItemHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostItemHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostItemHeader
  * @throws IOException if the JSON string is invalid with respect to BoostItemHeader
  */
  public static BoostItemHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostItemHeader.class);
  }

 /**
  * Convert an instance of BoostItemHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

