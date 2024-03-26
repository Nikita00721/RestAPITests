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
 * MarketSelectionsInfoItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketSelectionsInfoItem {
  public static final String SERIALIZED_NAME_MARKET_TYPE_NAME = "MarketTypeName";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_NAME)
  private String marketTypeName;

  public static final String SERIALIZED_NAME_SORTING_TYPE = "SortingType";
  @SerializedName(SERIALIZED_NAME_SORTING_TYPE)
  private Integer sortingType;

  public static final String SERIALIZED_NAME_SORTING_TYPE_NAME = "SortingTypeName";
  @SerializedName(SERIALIZED_NAME_SORTING_TYPE_NAME)
  private String sortingTypeName;

  public static final String SERIALIZED_NAME_DEFAULT_TEMPLATE = "DefaultTemplate";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TEMPLATE)
  private Integer defaultTemplate;

  public static final String SERIALIZED_NAME_DESKTOP_COUNT = "DesktopCount";
  @SerializedName(SERIALIZED_NAME_DESKTOP_COUNT)
  private Integer desktopCount;

  public static final String SERIALIZED_NAME_SHORT_DESKTOP_COUNT = "ShortDesktopCount";
  @SerializedName(SERIALIZED_NAME_SHORT_DESKTOP_COUNT)
  private Integer shortDesktopCount;

  public static final String SERIALIZED_NAME_MOBILE_COUNT = "MobileCount";
  @SerializedName(SERIALIZED_NAME_MOBILE_COUNT)
  private Integer mobileCount;

  public static final String SERIALIZED_NAME_SHORT_MOBILE_COUNT = "ShortMobileCount";
  @SerializedName(SERIALIZED_NAME_SHORT_MOBILE_COUNT)
  private Integer shortMobileCount;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public MarketSelectionsInfoItem() {
  }

  public MarketSelectionsInfoItem marketTypeName(String marketTypeName) {
    this.marketTypeName = marketTypeName;
    return this;
  }

   /**
   * Get marketTypeName
   * @return marketTypeName
  **/
  @javax.annotation.Nullable
  public String getMarketTypeName() {
    return marketTypeName;
  }

  public void setMarketTypeName(String marketTypeName) {
    this.marketTypeName = marketTypeName;
  }


  public MarketSelectionsInfoItem sortingType(Integer sortingType) {
    this.sortingType = sortingType;
    return this;
  }

   /**
   * Get sortingType
   * @return sortingType
  **/
  @javax.annotation.Nullable
  public Integer getSortingType() {
    return sortingType;
  }

  public void setSortingType(Integer sortingType) {
    this.sortingType = sortingType;
  }


  public MarketSelectionsInfoItem sortingTypeName(String sortingTypeName) {
    this.sortingTypeName = sortingTypeName;
    return this;
  }

   /**
   * Get sortingTypeName
   * @return sortingTypeName
  **/
  @javax.annotation.Nullable
  public String getSortingTypeName() {
    return sortingTypeName;
  }

  public void setSortingTypeName(String sortingTypeName) {
    this.sortingTypeName = sortingTypeName;
  }


  public MarketSelectionsInfoItem defaultTemplate(Integer defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
    return this;
  }

   /**
   * Get defaultTemplate
   * @return defaultTemplate
  **/
  @javax.annotation.Nullable
  public Integer getDefaultTemplate() {
    return defaultTemplate;
  }

  public void setDefaultTemplate(Integer defaultTemplate) {
    this.defaultTemplate = defaultTemplate;
  }


  public MarketSelectionsInfoItem desktopCount(Integer desktopCount) {
    this.desktopCount = desktopCount;
    return this;
  }

   /**
   * Get desktopCount
   * @return desktopCount
  **/
  @javax.annotation.Nullable
  public Integer getDesktopCount() {
    return desktopCount;
  }

  public void setDesktopCount(Integer desktopCount) {
    this.desktopCount = desktopCount;
  }


  public MarketSelectionsInfoItem shortDesktopCount(Integer shortDesktopCount) {
    this.shortDesktopCount = shortDesktopCount;
    return this;
  }

   /**
   * Get shortDesktopCount
   * @return shortDesktopCount
  **/
  @javax.annotation.Nullable
  public Integer getShortDesktopCount() {
    return shortDesktopCount;
  }

  public void setShortDesktopCount(Integer shortDesktopCount) {
    this.shortDesktopCount = shortDesktopCount;
  }


  public MarketSelectionsInfoItem mobileCount(Integer mobileCount) {
    this.mobileCount = mobileCount;
    return this;
  }

   /**
   * Get mobileCount
   * @return mobileCount
  **/
  @javax.annotation.Nullable
  public Integer getMobileCount() {
    return mobileCount;
  }

  public void setMobileCount(Integer mobileCount) {
    this.mobileCount = mobileCount;
  }


  public MarketSelectionsInfoItem shortMobileCount(Integer shortMobileCount) {
    this.shortMobileCount = shortMobileCount;
    return this;
  }

   /**
   * Get shortMobileCount
   * @return shortMobileCount
  **/
  @javax.annotation.Nullable
  public Integer getShortMobileCount() {
    return shortMobileCount;
  }

  public void setShortMobileCount(Integer shortMobileCount) {
    this.shortMobileCount = shortMobileCount;
  }


  public MarketSelectionsInfoItem marketTypeId(Integer marketTypeId) {
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
    MarketSelectionsInfoItem marketSelectionsInfoItem = (MarketSelectionsInfoItem) o;
    return Objects.equals(this.marketTypeName, marketSelectionsInfoItem.marketTypeName) &&
        Objects.equals(this.sortingType, marketSelectionsInfoItem.sortingType) &&
        Objects.equals(this.sortingTypeName, marketSelectionsInfoItem.sortingTypeName) &&
        Objects.equals(this.defaultTemplate, marketSelectionsInfoItem.defaultTemplate) &&
        Objects.equals(this.desktopCount, marketSelectionsInfoItem.desktopCount) &&
        Objects.equals(this.shortDesktopCount, marketSelectionsInfoItem.shortDesktopCount) &&
        Objects.equals(this.mobileCount, marketSelectionsInfoItem.mobileCount) &&
        Objects.equals(this.shortMobileCount, marketSelectionsInfoItem.shortMobileCount) &&
        Objects.equals(this.marketTypeId, marketSelectionsInfoItem.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeName, sortingType, sortingTypeName, defaultTemplate, desktopCount, shortDesktopCount, mobileCount, shortMobileCount, marketTypeId);
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
    sb.append("class MarketSelectionsInfoItem {\n");
    sb.append("    marketTypeName: ").append(toIndentedString(marketTypeName)).append("\n");
    sb.append("    sortingType: ").append(toIndentedString(sortingType)).append("\n");
    sb.append("    sortingTypeName: ").append(toIndentedString(sortingTypeName)).append("\n");
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    desktopCount: ").append(toIndentedString(desktopCount)).append("\n");
    sb.append("    shortDesktopCount: ").append(toIndentedString(shortDesktopCount)).append("\n");
    sb.append("    mobileCount: ").append(toIndentedString(mobileCount)).append("\n");
    sb.append("    shortMobileCount: ").append(toIndentedString(shortMobileCount)).append("\n");
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
    openapiFields.add("MarketTypeName");
    openapiFields.add("SortingType");
    openapiFields.add("SortingTypeName");
    openapiFields.add("DefaultTemplate");
    openapiFields.add("DesktopCount");
    openapiFields.add("ShortDesktopCount");
    openapiFields.add("MobileCount");
    openapiFields.add("ShortMobileCount");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketSelectionsInfoItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketSelectionsInfoItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketSelectionsInfoItem is not found in the empty JSON string", MarketSelectionsInfoItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketSelectionsInfoItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketSelectionsInfoItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MarketTypeName") != null && !jsonObj.get("MarketTypeName").isJsonNull()) && !jsonObj.get("MarketTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketTypeName").toString()));
      }
      if ((jsonObj.get("SortingTypeName") != null && !jsonObj.get("SortingTypeName").isJsonNull()) && !jsonObj.get("SortingTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SortingTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SortingTypeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketSelectionsInfoItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketSelectionsInfoItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketSelectionsInfoItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketSelectionsInfoItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketSelectionsInfoItem>() {
           @Override
           public void write(JsonWriter out, MarketSelectionsInfoItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketSelectionsInfoItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketSelectionsInfoItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketSelectionsInfoItem
  * @throws IOException if the JSON string is invalid with respect to MarketSelectionsInfoItem
  */
  public static MarketSelectionsInfoItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketSelectionsInfoItem.class);
  }

 /**
  * Convert an instance of MarketSelectionsInfoItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
