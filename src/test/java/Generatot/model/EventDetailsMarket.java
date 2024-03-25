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
 * EventDetailsMarket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class EventDetailsMarket {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE_ID = "TypeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_IS_M_B = "IsMB";
  @SerializedName(SERIALIZED_NAME_IS_M_B)
  private Boolean isMB;

  public static final String SERIALIZED_NAME_SPORT_MARKET_ID = "SportMarketId";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_ID)
  private Integer sportMarketId;

  public static final String SERIALIZED_NAME_SV = "sv";
  @SerializedName(SERIALIZED_NAME_SV)
  private String sv;

  public static final String SERIALIZED_NAME_SN = "sn";
  @SerializedName(SERIALIZED_NAME_SN)
  private String sn;

  public static final String SERIALIZED_NAME_HINT = "Hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public static final String SERIALIZED_NAME_HINT_SPOV = "HintSpov";
  @SerializedName(SERIALIZED_NAME_HINT_SPOV)
  private String hintSpov;

  public static final String SERIALIZED_NAME_SHORT_NAME = "ShortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_DESKTOP_ODD_IDS = "DesktopOddIds";
  @SerializedName(SERIALIZED_NAME_DESKTOP_ODD_IDS)
  private List<List<Long>> desktopOddIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOBILE_ODD_IDS = "MobileOddIds";
  @SerializedName(SERIALIZED_NAME_MOBILE_ODD_IDS)
  private List<List<Long>> mobileOddIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHILD_MARKET_IDS = "ChildMarketIds";
  @SerializedName(SERIALIZED_NAME_CHILD_MARKET_IDS)
  private List<Long> childMarketIds;

  public static final String SERIALIZED_NAME_HEADERS = "Headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<Header> headers;

  public static final String SERIALIZED_NAME_IS_B_B = "IsBB";
  @SerializedName(SERIALIZED_NAME_IS_B_B)
  private Boolean isBB;

  public static final String SERIALIZED_NAME_OFFERS = "Offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<OfferTypeParameter> offers;

  public static final String SERIALIZED_NAME_VARIANT = "Variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private EventDetailsMarketBoxVariants variant;

  public EventDetailsMarket() {
  }

  public EventDetailsMarket(
     Long id, 
     String name
  ) {
    this();
    this.id = id;
    this.name = name;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



  public EventDetailsMarket typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public EventDetailsMarket isMB(Boolean isMB) {
    this.isMB = isMB;
    return this;
  }

   /**
   * Get isMB
   * @return isMB
  **/
  @javax.annotation.Nonnull
  public Boolean getIsMB() {
    return isMB;
  }

  public void setIsMB(Boolean isMB) {
    this.isMB = isMB;
  }


  public EventDetailsMarket sportMarketId(Integer sportMarketId) {
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


  public EventDetailsMarket sv(String sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Get sv
   * @return sv
  **/
  @javax.annotation.Nullable
  public String getSv() {
    return sv;
  }

  public void setSv(String sv) {
    this.sv = sv;
  }


  public EventDetailsMarket sn(String sn) {
    this.sn = sn;
    return this;
  }

   /**
   * Get sn
   * @return sn
  **/
  @javax.annotation.Nullable
  public String getSn() {
    return sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }


  public EventDetailsMarket hint(String hint) {
    this.hint = hint;
    return this;
  }

   /**
   * Get hint
   * @return hint
  **/
  @javax.annotation.Nullable
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }


  public EventDetailsMarket hintSpov(String hintSpov) {
    this.hintSpov = hintSpov;
    return this;
  }

   /**
   * Get hintSpov
   * @return hintSpov
  **/
  @javax.annotation.Nullable
  public String getHintSpov() {
    return hintSpov;
  }

  public void setHintSpov(String hintSpov) {
    this.hintSpov = hintSpov;
  }


  public EventDetailsMarket shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nonnull
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public EventDetailsMarket desktopOddIds(List<List<Long>> desktopOddIds) {
    this.desktopOddIds = desktopOddIds;
    return this;
  }

  public EventDetailsMarket addDesktopOddIdsItem(List<Long> desktopOddIdsItem) {
    if (this.desktopOddIds == null) {
      this.desktopOddIds = new ArrayList<>();
    }
    this.desktopOddIds.add(desktopOddIdsItem);
    return this;
  }

   /**
   * Get desktopOddIds
   * @return desktopOddIds
  **/
  @javax.annotation.Nonnull
  public List<List<Long>> getDesktopOddIds() {
    return desktopOddIds;
  }

  public void setDesktopOddIds(List<List<Long>> desktopOddIds) {
    this.desktopOddIds = desktopOddIds;
  }


  public EventDetailsMarket mobileOddIds(List<List<Long>> mobileOddIds) {
    this.mobileOddIds = mobileOddIds;
    return this;
  }

  public EventDetailsMarket addMobileOddIdsItem(List<Long> mobileOddIdsItem) {
    if (this.mobileOddIds == null) {
      this.mobileOddIds = new ArrayList<>();
    }
    this.mobileOddIds.add(mobileOddIdsItem);
    return this;
  }

   /**
   * Get mobileOddIds
   * @return mobileOddIds
  **/
  @javax.annotation.Nonnull
  public List<List<Long>> getMobileOddIds() {
    return mobileOddIds;
  }

  public void setMobileOddIds(List<List<Long>> mobileOddIds) {
    this.mobileOddIds = mobileOddIds;
  }


  public EventDetailsMarket childMarketIds(List<Long> childMarketIds) {
    this.childMarketIds = childMarketIds;
    return this;
  }

  public EventDetailsMarket addChildMarketIdsItem(Long childMarketIdsItem) {
    if (this.childMarketIds == null) {
      this.childMarketIds = new ArrayList<>();
    }
    this.childMarketIds.add(childMarketIdsItem);
    return this;
  }

   /**
   * Get childMarketIds
   * @return childMarketIds
  **/
  @javax.annotation.Nullable
  public List<Long> getChildMarketIds() {
    return childMarketIds;
  }

  public void setChildMarketIds(List<Long> childMarketIds) {
    this.childMarketIds = childMarketIds;
  }


  public EventDetailsMarket headers(List<Header> headers) {
    this.headers = headers;
    return this;
  }

  public EventDetailsMarket addHeadersItem(Header headersItem) {
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
  public List<Header> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }


  public EventDetailsMarket isBB(Boolean isBB) {
    this.isBB = isBB;
    return this;
  }

   /**
   * Get isBB
   * @return isBB
  **/
  @javax.annotation.Nonnull
  public Boolean getIsBB() {
    return isBB;
  }

  public void setIsBB(Boolean isBB) {
    this.isBB = isBB;
  }


  public EventDetailsMarket offers(List<OfferTypeParameter> offers) {
    this.offers = offers;
    return this;
  }

  public EventDetailsMarket addOffersItem(OfferTypeParameter offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  @javax.annotation.Nullable
  public List<OfferTypeParameter> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferTypeParameter> offers) {
    this.offers = offers;
  }


  public EventDetailsMarket variant(EventDetailsMarketBoxVariants variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @javax.annotation.Nullable
  public EventDetailsMarketBoxVariants getVariant() {
    return variant;
  }

  public void setVariant(EventDetailsMarketBoxVariants variant) {
    this.variant = variant;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDetailsMarket eventDetailsMarket = (EventDetailsMarket) o;
    return Objects.equals(this.id, eventDetailsMarket.id) &&
        Objects.equals(this.name, eventDetailsMarket.name) &&
        Objects.equals(this.typeId, eventDetailsMarket.typeId) &&
        Objects.equals(this.isMB, eventDetailsMarket.isMB) &&
        Objects.equals(this.sportMarketId, eventDetailsMarket.sportMarketId) &&
        Objects.equals(this.sv, eventDetailsMarket.sv) &&
        Objects.equals(this.sn, eventDetailsMarket.sn) &&
        Objects.equals(this.hint, eventDetailsMarket.hint) &&
        Objects.equals(this.hintSpov, eventDetailsMarket.hintSpov) &&
        Objects.equals(this.shortName, eventDetailsMarket.shortName) &&
        Objects.equals(this.desktopOddIds, eventDetailsMarket.desktopOddIds) &&
        Objects.equals(this.mobileOddIds, eventDetailsMarket.mobileOddIds) &&
        Objects.equals(this.childMarketIds, eventDetailsMarket.childMarketIds) &&
        Objects.equals(this.headers, eventDetailsMarket.headers) &&
        Objects.equals(this.isBB, eventDetailsMarket.isBB) &&
        Objects.equals(this.offers, eventDetailsMarket.offers) &&
        Objects.equals(this.variant, eventDetailsMarket.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, typeId, isMB, sportMarketId, sv, sn, hint, hintSpov, shortName, desktopOddIds, mobileOddIds, childMarketIds, headers, isBB, offers, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDetailsMarket {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    isMB: ").append(toIndentedString(isMB)).append("\n");
    sb.append("    sportMarketId: ").append(toIndentedString(sportMarketId)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    hintSpov: ").append(toIndentedString(hintSpov)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    desktopOddIds: ").append(toIndentedString(desktopOddIds)).append("\n");
    sb.append("    mobileOddIds: ").append(toIndentedString(mobileOddIds)).append("\n");
    sb.append("    childMarketIds: ").append(toIndentedString(childMarketIds)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    isBB: ").append(toIndentedString(isBB)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
    openapiFields.add("TypeId");
    openapiFields.add("IsMB");
    openapiFields.add("SportMarketId");
    openapiFields.add("sv");
    openapiFields.add("sn");
    openapiFields.add("Hint");
    openapiFields.add("HintSpov");
    openapiFields.add("ShortName");
    openapiFields.add("DesktopOddIds");
    openapiFields.add("MobileOddIds");
    openapiFields.add("ChildMarketIds");
    openapiFields.add("Headers");
    openapiFields.add("IsBB");
    openapiFields.add("Offers");
    openapiFields.add("Variant");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("TypeId");
    openapiRequiredFields.add("IsMB");
    openapiRequiredFields.add("SportMarketId");
    openapiRequiredFields.add("ShortName");
    openapiRequiredFields.add("DesktopOddIds");
    openapiRequiredFields.add("MobileOddIds");
    openapiRequiredFields.add("IsBB");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventDetailsMarket
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventDetailsMarket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventDetailsMarket is not found in the empty JSON string", EventDetailsMarket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventDetailsMarket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventDetailsMarket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventDetailsMarket.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("sv") != null && !jsonObj.get("sv").isJsonNull()) && !jsonObj.get("sv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sv").toString()));
      }
      if ((jsonObj.get("sn") != null && !jsonObj.get("sn").isJsonNull()) && !jsonObj.get("sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sn").toString()));
      }
      if ((jsonObj.get("Hint") != null && !jsonObj.get("Hint").isJsonNull()) && !jsonObj.get("Hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Hint").toString()));
      }
      if ((jsonObj.get("HintSpov") != null && !jsonObj.get("HintSpov").isJsonNull()) && !jsonObj.get("HintSpov").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HintSpov` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HintSpov").toString()));
      }
      if (!jsonObj.get("ShortName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ShortName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ShortName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("DesktopOddIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("DesktopOddIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DesktopOddIds` to be an array in the JSON string but got `%s`", jsonObj.get("DesktopOddIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("MobileOddIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("MobileOddIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MobileOddIds` to be an array in the JSON string but got `%s`", jsonObj.get("MobileOddIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ChildMarketIds") != null && !jsonObj.get("ChildMarketIds").isJsonNull() && !jsonObj.get("ChildMarketIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChildMarketIds` to be an array in the JSON string but got `%s`", jsonObj.get("ChildMarketIds").toString()));
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
            Header.validateJsonElement(jsonArrayheaders.get(i));
          };
        }
      }
      if (jsonObj.get("Offers") != null && !jsonObj.get("Offers").isJsonNull()) {
        JsonArray jsonArrayoffers = jsonObj.getAsJsonArray("Offers");
        if (jsonArrayoffers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Offers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Offers` to be an array in the JSON string but got `%s`", jsonObj.get("Offers").toString()));
          }

          // validate the optional field `Offers` (array)
          for (int i = 0; i < jsonArrayoffers.size(); i++) {
            OfferTypeParameter.validateJsonElement(jsonArrayoffers.get(i));
          };
        }
      }
      // validate the optional field `Variant`
      if (jsonObj.get("Variant") != null && !jsonObj.get("Variant").isJsonNull()) {
        EventDetailsMarketBoxVariants.validateJsonElement(jsonObj.get("Variant"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventDetailsMarket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventDetailsMarket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventDetailsMarket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventDetailsMarket.class));

       return (TypeAdapter<T>) new TypeAdapter<EventDetailsMarket>() {
           @Override
           public void write(JsonWriter out, EventDetailsMarket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventDetailsMarket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventDetailsMarket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventDetailsMarket
  * @throws IOException if the JSON string is invalid with respect to EventDetailsMarket
  */
  public static EventDetailsMarket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventDetailsMarket.class);
  }

 /**
  * Convert an instance of EventDetailsMarket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
