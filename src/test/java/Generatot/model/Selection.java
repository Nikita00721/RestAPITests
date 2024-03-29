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
 * Selection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class Selection {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ClientSelectionResults result;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_SELECTION_TYPE_ID = "SelectionTypeId";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE_ID)
  private Integer selectionTypeId;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_DISABLED_FOR_COMPETITOR_CONFIG_IDS = "DisabledForCompetitorConfigIds";
  @SerializedName(SERIALIZED_NAME_DISABLED_FOR_COMPETITOR_CONFIG_IDS)
  private List<Integer> disabledForCompetitorConfigIds;

  public static final String SERIALIZED_NAME_CHANCE = "Chance";
  @SerializedName(SERIALIZED_NAME_CHANCE)
  private Double chance;

  public static final String SERIALIZED_NAME_SM_ID = "SMId";
  @SerializedName(SERIALIZED_NAME_SM_ID)
  private Integer smId;

  public static final String SERIALIZED_NAME_FAST_CODE = "FastCode";
  @SerializedName(SERIALIZED_NAME_FAST_CODE)
  private String fastCode;

  public static final String SERIALIZED_NAME_S_P_O_V = "SPOV";
  @SerializedName(SERIALIZED_NAME_S_P_O_V)
  private String SPOV;

  public static final String SERIALIZED_NAME_MOBILE_COLUMN_NUM = "MobileColumnNum";
  @SerializedName(SERIALIZED_NAME_MOBILE_COLUMN_NUM)
  private Integer mobileColumnNum;

  public static final String SERIALIZED_NAME_COLUMN_NUM = "ColumnNum";
  @SerializedName(SERIALIZED_NAME_COLUMN_NUM)
  private Integer columnNum;

  public static final String SERIALIZED_NAME_SELECTION_ICON = "SelectionIcon";
  @SerializedName(SERIALIZED_NAME_SELECTION_ICON)
  private String selectionIcon;

  public static final String SERIALIZED_NAME_M_B = "MB";
  @SerializedName(SERIALIZED_NAME_M_B)
  private Integer MB;

  public static final String SERIALIZED_NAME_E_P = "EP";
  @SerializedName(SERIALIZED_NAME_E_P)
  private OfferEarlyPayout EP;

  public static final String SERIALIZED_NAME_B_D = "BD";
  @SerializedName(SERIALIZED_NAME_B_D)
  private Boolean BD;

  public static final String SERIALIZED_NAME_IS_OTHER = "IsOther";
  @SerializedName(SERIALIZED_NAME_IS_OTHER)
  private Boolean isOther;

  public static final String SERIALIZED_NAME_BOOST_INFO = "BoostInfo";
  @SerializedName(SERIALIZED_NAME_BOOST_INFO)
  private BoostOddInfo boostInfo;

  public Selection() {
  }

  public Selection(
     Boolean isOther
  ) {
    this();
    this.isOther = isOther;
  }

  public Selection id(Long id) {
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


  public Selection name(String name) {
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


  public Selection result(ClientSelectionResults result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  public ClientSelectionResults getResult() {
    return result;
  }

  public void setResult(ClientSelectionResults result) {
    this.result = result;
  }


  public Selection price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public Selection selectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
    return this;
  }

   /**
   * Get selectionTypeId
   * @return selectionTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getSelectionTypeId() {
    return selectionTypeId;
  }

  public void setSelectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
  }


  public Selection isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nonnull
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public Selection disabledForCompetitorConfigIds(List<Integer> disabledForCompetitorConfigIds) {
    this.disabledForCompetitorConfigIds = disabledForCompetitorConfigIds;
    return this;
  }

  public Selection addDisabledForCompetitorConfigIdsItem(Integer disabledForCompetitorConfigIdsItem) {
    if (this.disabledForCompetitorConfigIds == null) {
      this.disabledForCompetitorConfigIds = new ArrayList<>();
    }
    this.disabledForCompetitorConfigIds.add(disabledForCompetitorConfigIdsItem);
    return this;
  }

   /**
   * Get disabledForCompetitorConfigIds
   * @return disabledForCompetitorConfigIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getDisabledForCompetitorConfigIds() {
    return disabledForCompetitorConfigIds;
  }

  public void setDisabledForCompetitorConfigIds(List<Integer> disabledForCompetitorConfigIds) {
    this.disabledForCompetitorConfigIds = disabledForCompetitorConfigIds;
  }


  public Selection chance(Double chance) {
    this.chance = chance;
    return this;
  }

   /**
   * Get chance
   * @return chance
  **/
  @javax.annotation.Nullable
  public Double getChance() {
    return chance;
  }

  public void setChance(Double chance) {
    this.chance = chance;
  }


  public Selection smId(Integer smId) {
    this.smId = smId;
    return this;
  }

   /**
   * Get smId
   * @return smId
  **/
  @javax.annotation.Nullable
  public Integer getSmId() {
    return smId;
  }

  public void setSmId(Integer smId) {
    this.smId = smId;
  }


  public Selection fastCode(String fastCode) {
    this.fastCode = fastCode;
    return this;
  }

   /**
   * Get fastCode
   * @return fastCode
  **/
  @javax.annotation.Nullable
  public String getFastCode() {
    return fastCode;
  }

  public void setFastCode(String fastCode) {
    this.fastCode = fastCode;
  }


  public Selection SPOV(String SPOV) {
    this.SPOV = SPOV;
    return this;
  }

   /**
   * Get SPOV
   * @return SPOV
  **/
  @javax.annotation.Nullable
  public String getSPOV() {
    return SPOV;
  }

  public void setSPOV(String SPOV) {
    this.SPOV = SPOV;
  }


  public Selection mobileColumnNum(Integer mobileColumnNum) {
    this.mobileColumnNum = mobileColumnNum;
    return this;
  }

   /**
   * Get mobileColumnNum
   * @return mobileColumnNum
  **/
  @javax.annotation.Nonnull
  public Integer getMobileColumnNum() {
    return mobileColumnNum;
  }

  public void setMobileColumnNum(Integer mobileColumnNum) {
    this.mobileColumnNum = mobileColumnNum;
  }


  public Selection columnNum(Integer columnNum) {
    this.columnNum = columnNum;
    return this;
  }

   /**
   * Get columnNum
   * @return columnNum
  **/
  @javax.annotation.Nonnull
  public Integer getColumnNum() {
    return columnNum;
  }

  public void setColumnNum(Integer columnNum) {
    this.columnNum = columnNum;
  }


  public Selection selectionIcon(String selectionIcon) {
    this.selectionIcon = selectionIcon;
    return this;
  }

   /**
   * Get selectionIcon
   * @return selectionIcon
  **/
  @javax.annotation.Nullable
  public String getSelectionIcon() {
    return selectionIcon;
  }

  public void setSelectionIcon(String selectionIcon) {
    this.selectionIcon = selectionIcon;
  }


  public Selection MB(Integer MB) {
    this.MB = MB;
    return this;
  }

   /**
   * Get MB
   * @return MB
  **/
  @javax.annotation.Nonnull
  public Integer getMB() {
    return MB;
  }

  public void setMB(Integer MB) {
    this.MB = MB;
  }


  public Selection EP(OfferEarlyPayout EP) {
    this.EP = EP;
    return this;
  }

   /**
   * Get EP
   * @return EP
  **/
  @javax.annotation.Nullable
  public OfferEarlyPayout getEP() {
    return EP;
  }

  public void setEP(OfferEarlyPayout EP) {
    this.EP = EP;
  }


  public Selection BD(Boolean BD) {
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


   /**
   * Get isOther
   * @return isOther
  **/
  @javax.annotation.Nullable
  public Boolean getIsOther() {
    return isOther;
  }



  public Selection boostInfo(BoostOddInfo boostInfo) {
    this.boostInfo = boostInfo;
    return this;
  }

   /**
   * Get boostInfo
   * @return boostInfo
  **/
  @javax.annotation.Nullable
  public BoostOddInfo getBoostInfo() {
    return boostInfo;
  }

  public void setBoostInfo(BoostOddInfo boostInfo) {
    this.boostInfo = boostInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Selection selection = (Selection) o;
    return Objects.equals(this.id, selection.id) &&
        Objects.equals(this.name, selection.name) &&
        Objects.equals(this.result, selection.result) &&
        Objects.equals(this.price, selection.price) &&
        Objects.equals(this.selectionTypeId, selection.selectionTypeId) &&
        Objects.equals(this.isActive, selection.isActive) &&
        Objects.equals(this.disabledForCompetitorConfigIds, selection.disabledForCompetitorConfigIds) &&
        Objects.equals(this.chance, selection.chance) &&
        Objects.equals(this.smId, selection.smId) &&
        Objects.equals(this.fastCode, selection.fastCode) &&
        Objects.equals(this.SPOV, selection.SPOV) &&
        Objects.equals(this.mobileColumnNum, selection.mobileColumnNum) &&
        Objects.equals(this.columnNum, selection.columnNum) &&
        Objects.equals(this.selectionIcon, selection.selectionIcon) &&
        Objects.equals(this.MB, selection.MB) &&
        Objects.equals(this.EP, selection.EP) &&
        Objects.equals(this.BD, selection.BD) &&
        Objects.equals(this.isOther, selection.isOther) &&
        Objects.equals(this.boostInfo, selection.boostInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, result, price, selectionTypeId, isActive, disabledForCompetitorConfigIds, chance, smId, fastCode, SPOV, mobileColumnNum, columnNum, selectionIcon, MB, EP, BD, isOther, boostInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Selection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    selectionTypeId: ").append(toIndentedString(selectionTypeId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    disabledForCompetitorConfigIds: ").append(toIndentedString(disabledForCompetitorConfigIds)).append("\n");
    sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
    sb.append("    smId: ").append(toIndentedString(smId)).append("\n");
    sb.append("    fastCode: ").append(toIndentedString(fastCode)).append("\n");
    sb.append("    SPOV: ").append(toIndentedString(SPOV)).append("\n");
    sb.append("    mobileColumnNum: ").append(toIndentedString(mobileColumnNum)).append("\n");
    sb.append("    columnNum: ").append(toIndentedString(columnNum)).append("\n");
    sb.append("    selectionIcon: ").append(toIndentedString(selectionIcon)).append("\n");
    sb.append("    MB: ").append(toIndentedString(MB)).append("\n");
    sb.append("    EP: ").append(toIndentedString(EP)).append("\n");
    sb.append("    BD: ").append(toIndentedString(BD)).append("\n");
    sb.append("    isOther: ").append(toIndentedString(isOther)).append("\n");
    sb.append("    boostInfo: ").append(toIndentedString(boostInfo)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("Price");
    openapiFields.add("SelectionTypeId");
    openapiFields.add("IsActive");
    openapiFields.add("DisabledForCompetitorConfigIds");
    openapiFields.add("Chance");
    openapiFields.add("SMId");
    openapiFields.add("FastCode");
    openapiFields.add("SPOV");
    openapiFields.add("MobileColumnNum");
    openapiFields.add("ColumnNum");
    openapiFields.add("SelectionIcon");
    openapiFields.add("MB");
    openapiFields.add("EP");
    openapiFields.add("BD");
    openapiFields.add("IsOther");
    openapiFields.add("BoostInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Result");
    openapiRequiredFields.add("SelectionTypeId");
    openapiRequiredFields.add("IsActive");
    openapiRequiredFields.add("MobileColumnNum");
    openapiRequiredFields.add("ColumnNum");
    openapiRequiredFields.add("MB");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Selection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Selection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Selection is not found in the empty JSON string", Selection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Selection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Selection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Selection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the required field `Result`
      ClientSelectionResults.validateJsonElement(jsonObj.get("Result"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("DisabledForCompetitorConfigIds") != null && !jsonObj.get("DisabledForCompetitorConfigIds").isJsonNull() && !jsonObj.get("DisabledForCompetitorConfigIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisabledForCompetitorConfigIds` to be an array in the JSON string but got `%s`", jsonObj.get("DisabledForCompetitorConfigIds").toString()));
      }
      if ((jsonObj.get("FastCode") != null && !jsonObj.get("FastCode").isJsonNull()) && !jsonObj.get("FastCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FastCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FastCode").toString()));
      }
      if ((jsonObj.get("SPOV") != null && !jsonObj.get("SPOV").isJsonNull()) && !jsonObj.get("SPOV").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SPOV` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SPOV").toString()));
      }
      if ((jsonObj.get("SelectionIcon") != null && !jsonObj.get("SelectionIcon").isJsonNull()) && !jsonObj.get("SelectionIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SelectionIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SelectionIcon").toString()));
      }
      // validate the optional field `EP`
      if (jsonObj.get("EP") != null && !jsonObj.get("EP").isJsonNull()) {
        OfferEarlyPayout.validateJsonElement(jsonObj.get("EP"));
      }
      // validate the optional field `BoostInfo`
      if (jsonObj.get("BoostInfo") != null && !jsonObj.get("BoostInfo").isJsonNull()) {
        BoostOddInfo.validateJsonElement(jsonObj.get("BoostInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Selection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Selection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Selection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Selection.class));

       return (TypeAdapter<T>) new TypeAdapter<Selection>() {
           @Override
           public void write(JsonWriter out, Selection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Selection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Selection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Selection
  * @throws IOException if the JSON string is invalid with respect to Selection
  */
  public static Selection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Selection.class);
  }

 /**
  * Convert an instance of Selection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

