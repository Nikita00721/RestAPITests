/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * MarketOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class MarketOut {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_VALUE = "SpecialOddsValue";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_VALUE)
  private String specialOddsValue;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private String marketTypeId;

  public static final String SERIALIZED_NAME_ORG_MARKET_TYPE_ID = "OrgMarketTypeId";
  @SerializedName(SERIALIZED_NAME_ORG_MARKET_TYPE_ID)
  private Integer orgMarketTypeId;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_TYPE_NAME = "SpecialOddsTypeName";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_TYPE_NAME)
  private String specialOddsTypeName;

  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Selection> items;

  public static final String SERIALIZED_NAME_COLUMN_COUNT = "ColumnCount";
  @SerializedName(SERIALIZED_NAME_COLUMN_COUNT)
  private Integer columnCount;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_SPORT_MARKET_ID = "SportMarketId";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_ID)
  private Integer sportMarketId;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "DisplayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  public static final String SERIALIZED_NAME_MCOLUMN_COUNT = "MColumnCount";
  @SerializedName(SERIALIZED_NAME_MCOLUMN_COUNT)
  private Integer mcolumnCount;

  public static final String SERIALIZED_NAME_SPECIAL_ODDS_NAME = "SpecialOddsName";
  @SerializedName(SERIALIZED_NAME_SPECIAL_ODDS_NAME)
  private String specialOddsName;

  public static final String SERIALIZED_NAME_TEMPLATE = "Template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Integer template;

  public static final String SERIALIZED_NAME_CHILD_MARKETS = "ChildMarkets";
  @SerializedName(SERIALIZED_NAME_CHILD_MARKETS)
  private List<MarketOut> childMarkets;

  public static final String SERIALIZED_NAME_HEADERS = "Headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<MarketHeaderOut> headers;

  public static final String SERIALIZED_NAME_SHORT_NAME = "ShortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_HAS_MORE_SELECTIONS = "HasMoreSelections";
  @SerializedName(SERIALIZED_NAME_HAS_MORE_SELECTIONS)
  private Boolean hasMoreSelections;

  public static final String SERIALIZED_NAME_R_C = "RC";
  @SerializedName(SERIALIZED_NAME_R_C)
  private Boolean RC;

  public static final String SERIALIZED_NAME_E_P = "EP";
  @SerializedName(SERIALIZED_NAME_E_P)
  private Boolean EP;

  public static final String SERIALIZED_NAME_B_D = "BD";
  @SerializedName(SERIALIZED_NAME_B_D)
  private Boolean BD;

  public static final String SERIALIZED_NAME_CID = "CId";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public MarketOut() {
  }

  public MarketOut id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public MarketOut name(String name) {
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


  public MarketOut specialOddsValue(String specialOddsValue) {
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


  public MarketOut marketTypeId(String marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nonnull
  public String getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(String marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public MarketOut orgMarketTypeId(Integer orgMarketTypeId) {
    this.orgMarketTypeId = orgMarketTypeId;
    return this;
  }

   /**
   * Get orgMarketTypeId
   * @return orgMarketTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getOrgMarketTypeId() {
    return orgMarketTypeId;
  }

  public void setOrgMarketTypeId(Integer orgMarketTypeId) {
    this.orgMarketTypeId = orgMarketTypeId;
  }


  public MarketOut specialOddsTypeName(String specialOddsTypeName) {
    this.specialOddsTypeName = specialOddsTypeName;
    return this;
  }

   /**
   * Get specialOddsTypeName
   * @return specialOddsTypeName
  **/
  @javax.annotation.Nullable
  public String getSpecialOddsTypeName() {
    return specialOddsTypeName;
  }

  public void setSpecialOddsTypeName(String specialOddsTypeName) {
    this.specialOddsTypeName = specialOddsTypeName;
  }


  public MarketOut items(List<Selection> items) {
    this.items = items;
    return this;
  }

  public MarketOut addItemsItem(Selection itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<Selection> getItems() {
    return items;
  }

  public void setItems(List<Selection> items) {
    this.items = items;
  }


  public MarketOut columnCount(Integer columnCount) {
    this.columnCount = columnCount;
    return this;
  }

   /**
   * Get columnCount
   * @return columnCount
  **/
  @javax.annotation.Nonnull
  public Integer getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(Integer columnCount) {
    this.columnCount = columnCount;
  }


  public MarketOut status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public MarketOut sportMarketId(Integer sportMarketId) {
    this.sportMarketId = sportMarketId;
    return this;
  }

   /**
   * Get sportMarketId
   * @return sportMarketId
  **/
  @javax.annotation.Nonnull
  public Integer getSportMarketId() {
    return sportMarketId;
  }

  public void setSportMarketId(Integer sportMarketId) {
    this.sportMarketId = sportMarketId;
  }


  public MarketOut displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  public MarketOut mcolumnCount(Integer mcolumnCount) {
    this.mcolumnCount = mcolumnCount;
    return this;
  }

   /**
   * Get mcolumnCount
   * @return mcolumnCount
  **/
  @javax.annotation.Nonnull
  public Integer getMcolumnCount() {
    return mcolumnCount;
  }

  public void setMcolumnCount(Integer mcolumnCount) {
    this.mcolumnCount = mcolumnCount;
  }


  public MarketOut specialOddsName(String specialOddsName) {
    this.specialOddsName = specialOddsName;
    return this;
  }

   /**
   * Get specialOddsName
   * @return specialOddsName
  **/
  @javax.annotation.Nullable
  public String getSpecialOddsName() {
    return specialOddsName;
  }

  public void setSpecialOddsName(String specialOddsName) {
    this.specialOddsName = specialOddsName;
  }


  public MarketOut template(Integer template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public Integer getTemplate() {
    return template;
  }

  public void setTemplate(Integer template) {
    this.template = template;
  }


  public MarketOut childMarkets(List<MarketOut> childMarkets) {
    this.childMarkets = childMarkets;
    return this;
  }

  public MarketOut addChildMarketsItem(MarketOut childMarketsItem) {
    if (this.childMarkets == null) {
      this.childMarkets = new ArrayList<>();
    }
    this.childMarkets.add(childMarketsItem);
    return this;
  }

   /**
   * Get childMarkets
   * @return childMarkets
  **/
  @javax.annotation.Nullable
  public List<MarketOut> getChildMarkets() {
    return childMarkets;
  }

  public void setChildMarkets(List<MarketOut> childMarkets) {
    this.childMarkets = childMarkets;
  }


  public MarketOut headers(List<MarketHeaderOut> headers) {
    this.headers = headers;
    return this;
  }

  public MarketOut addHeadersItem(MarketHeaderOut headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  public List<MarketHeaderOut> getHeaders() {
    return headers;
  }

  public void setHeaders(List<MarketHeaderOut> headers) {
    this.headers = headers;
  }


  public MarketOut shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public MarketOut hasMoreSelections(Boolean hasMoreSelections) {
    this.hasMoreSelections = hasMoreSelections;
    return this;
  }

   /**
   * Get hasMoreSelections
   * @return hasMoreSelections
  **/
  @javax.annotation.Nullable
  public Boolean getHasMoreSelections() {
    return hasMoreSelections;
  }

  public void setHasMoreSelections(Boolean hasMoreSelections) {
    this.hasMoreSelections = hasMoreSelections;
  }


  public MarketOut RC(Boolean RC) {
    this.RC = RC;
    return this;
  }

   /**
   * Get RC
   * @return RC
  **/
  @javax.annotation.Nullable
  public Boolean getRC() {
    return RC;
  }

  public void setRC(Boolean RC) {
    this.RC = RC;
  }


  public MarketOut EP(Boolean EP) {
    this.EP = EP;
    return this;
  }

   /**
   * Get EP
   * @return EP
  **/
  @javax.annotation.Nullable
  public Boolean getEP() {
    return EP;
  }

  public void setEP(Boolean EP) {
    this.EP = EP;
  }


  public MarketOut BD(Boolean BD) {
    this.BD = BD;
    return this;
  }

   /**
   * Get BD
   * @return BD
  **/
  @javax.annotation.Nullable
  public Boolean getBD() {
    return BD;
  }

  public void setBD(Boolean BD) {
    this.BD = BD;
  }


  public MarketOut cid(Integer cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @javax.annotation.Nullable
  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketOut marketOut = (MarketOut) o;
    return Objects.equals(this.id, marketOut.id) &&
        Objects.equals(this.name, marketOut.name) &&
        Objects.equals(this.specialOddsValue, marketOut.specialOddsValue) &&
        Objects.equals(this.marketTypeId, marketOut.marketTypeId) &&
        Objects.equals(this.orgMarketTypeId, marketOut.orgMarketTypeId) &&
        Objects.equals(this.specialOddsTypeName, marketOut.specialOddsTypeName) &&
        Objects.equals(this.items, marketOut.items) &&
        Objects.equals(this.columnCount, marketOut.columnCount) &&
        Objects.equals(this.status, marketOut.status) &&
        Objects.equals(this.sportMarketId, marketOut.sportMarketId) &&
        Objects.equals(this.displayOrder, marketOut.displayOrder) &&
        Objects.equals(this.mcolumnCount, marketOut.mcolumnCount) &&
        Objects.equals(this.specialOddsName, marketOut.specialOddsName) &&
        Objects.equals(this.template, marketOut.template) &&
        Objects.equals(this.childMarkets, marketOut.childMarkets) &&
        Objects.equals(this.headers, marketOut.headers) &&
        Objects.equals(this.shortName, marketOut.shortName) &&
        Objects.equals(this.hasMoreSelections, marketOut.hasMoreSelections) &&
        Objects.equals(this.RC, marketOut.RC) &&
        Objects.equals(this.EP, marketOut.EP) &&
        Objects.equals(this.BD, marketOut.BD) &&
        Objects.equals(this.cid, marketOut.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, specialOddsValue, marketTypeId, orgMarketTypeId, specialOddsTypeName, items, columnCount, status, sportMarketId, displayOrder, mcolumnCount, specialOddsName, template, childMarkets, headers, shortName, hasMoreSelections, RC, EP, BD, cid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    specialOddsValue: ").append(toIndentedString(specialOddsValue)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    orgMarketTypeId: ").append(toIndentedString(orgMarketTypeId)).append("\n");
    sb.append("    specialOddsTypeName: ").append(toIndentedString(specialOddsTypeName)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sportMarketId: ").append(toIndentedString(sportMarketId)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    mcolumnCount: ").append(toIndentedString(mcolumnCount)).append("\n");
    sb.append("    specialOddsName: ").append(toIndentedString(specialOddsName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    childMarkets: ").append(toIndentedString(childMarkets)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    hasMoreSelections: ").append(toIndentedString(hasMoreSelections)).append("\n");
    sb.append("    RC: ").append(toIndentedString(RC)).append("\n");
    sb.append("    EP: ").append(toIndentedString(EP)).append("\n");
    sb.append("    BD: ").append(toIndentedString(BD)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("Name");
    openapiFields.add("SpecialOddsValue");
    openapiFields.add("MarketTypeId");
    openapiFields.add("OrgMarketTypeId");
    openapiFields.add("SpecialOddsTypeName");
    openapiFields.add("Items");
    openapiFields.add("ColumnCount");
    openapiFields.add("Status");
    openapiFields.add("SportMarketId");
    openapiFields.add("DisplayOrder");
    openapiFields.add("MColumnCount");
    openapiFields.add("SpecialOddsName");
    openapiFields.add("Template");
    openapiFields.add("ChildMarkets");
    openapiFields.add("Headers");
    openapiFields.add("ShortName");
    openapiFields.add("HasMoreSelections");
    openapiFields.add("RC");
    openapiFields.add("EP");
    openapiFields.add("BD");
    openapiFields.add("CId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("MarketTypeId");
    openapiRequiredFields.add("OrgMarketTypeId");
    openapiRequiredFields.add("ColumnCount");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("SportMarketId");
    openapiRequiredFields.add("MColumnCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketOut is not found in the empty JSON string", MarketOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MarketOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("SpecialOddsValue") != null && !jsonObj.get("SpecialOddsValue").isJsonNull()) && !jsonObj.get("SpecialOddsValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SpecialOddsValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SpecialOddsValue").toString()));
      }
      if (!jsonObj.get("MarketTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketTypeId").toString()));
      }
      if ((jsonObj.get("SpecialOddsTypeName") != null && !jsonObj.get("SpecialOddsTypeName").isJsonNull()) && !jsonObj.get("SpecialOddsTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SpecialOddsTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SpecialOddsTypeName").toString()));
      }
      if (jsonObj.get("Items") != null && !jsonObj.get("Items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("Items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Items` to be an array in the JSON string but got `%s`", jsonObj.get("Items").toString()));
          }

          // validate the optional field `Items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            Selection.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if ((jsonObj.get("SpecialOddsName") != null && !jsonObj.get("SpecialOddsName").isJsonNull()) && !jsonObj.get("SpecialOddsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SpecialOddsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SpecialOddsName").toString()));
      }
      if (jsonObj.get("ChildMarkets") != null && !jsonObj.get("ChildMarkets").isJsonNull()) {
        JsonArray jsonArraychildMarkets = jsonObj.getAsJsonArray("ChildMarkets");
        if (jsonArraychildMarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ChildMarkets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ChildMarkets` to be an array in the JSON string but got `%s`", jsonObj.get("ChildMarkets").toString()));
          }

          // validate the optional field `ChildMarkets` (array)
          for (int i = 0; i < jsonArraychildMarkets.size(); i++) {
            MarketOut.validateJsonElement(jsonArraychildMarkets.get(i));
          };
        }
      }
      if (jsonObj.get("Headers") != null && !jsonObj.get("Headers").isJsonNull()) {
        JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("Headers");
        if (jsonArrayheaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Headers` to be an array in the JSON string but got `%s`", jsonObj.get("Headers").toString()));
          }

          // validate the optional field `Headers` (array)
          for (int i = 0; i < jsonArrayheaders.size(); i++) {
            MarketHeaderOut.validateJsonElement(jsonArrayheaders.get(i));
          };
        }
      }
      if ((jsonObj.get("ShortName") != null && !jsonObj.get("ShortName").isJsonNull()) && !jsonObj.get("ShortName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ShortName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ShortName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketOut.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketOut>() {
           @Override
           public void write(JsonWriter out, MarketOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketOut
  * @throws IOException if the JSON string is invalid with respect to MarketOut
  */
  public static MarketOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketOut.class);
  }

 /**
  * Convert an instance of MarketOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

