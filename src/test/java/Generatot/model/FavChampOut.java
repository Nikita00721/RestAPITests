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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * FavChampOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class FavChampOut {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Long sportId;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_CAT_ID = "CatId";
  @SerializedName(SERIALIZED_NAME_CAT_ID)
  private Integer catId;

  public static final String SERIALIZED_NAME_CAT_NAME = "CatName";
  @SerializedName(SERIALIZED_NAME_CAT_NAME)
  private String catName;

  public static final String SERIALIZED_NAME_CHAMP_NAME = "ChampName";
  @SerializedName(SERIALIZED_NAME_CHAMP_NAME)
  private String champName;

  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Long champId;

  public static final String SERIALIZED_NAME_HAS_LIVE_EVENTS = "HasLiveEvents";
  @SerializedName(SERIALIZED_NAME_HAS_LIVE_EVENTS)
  private Boolean hasLiveEvents;

  public static final String SERIALIZED_NAME_EVENTS_COUNT = "EventsCount";
  @SerializedName(SERIALIZED_NAME_EVENTS_COUNT)
  private Integer eventsCount;

  public static final String SERIALIZED_NAME_I_S_O = "ISO";
  @SerializedName(SERIALIZED_NAME_I_S_O)
  private String ISO;

  public static final String SERIALIZED_NAME_SORT_ORDER_BY_SPORT = "SortOrderBySport";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER_BY_SPORT)
  private Long sortOrderBySport;

  public static final String SERIALIZED_NAME_SORT_ORDER_BY_CATEGORY = "SortOrderByCategory";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER_BY_CATEGORY)
  private Long sortOrderByCategory;

  public static final String SERIALIZED_NAME_SORT_ORDER_BY_CHAMP = "SortOrderByChamp";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER_BY_CHAMP)
  private Long sortOrderByChamp;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_IDS = "ChampionshipIds";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_IDS)
  private String championshipIds;

  public static final String SERIALIZED_NAME_E_P = "EP";
  @SerializedName(SERIALIZED_NAME_E_P)
  private Boolean EP;

  public static final String SERIALIZED_NAME_B_D = "BD";
  @SerializedName(SERIALIZED_NAME_B_D)
  private Boolean BD;

  public FavChampOut() {
  }

  public FavChampOut sportId(Long sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nonnull
  public Long getSportId() {
    return sportId;
  }

  public void setSportId(Long sportId) {
    this.sportId = sportId;
  }


  public FavChampOut sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }


  public FavChampOut sportName(String sportName) {
    this.sportName = sportName;
    return this;
  }

   /**
   * Get sportName
   * @return sportName
  **/
  @javax.annotation.Nullable
  public String getSportName() {
    return sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }


  public FavChampOut catId(Integer catId) {
    this.catId = catId;
    return this;
  }

   /**
   * Get catId
   * @return catId
  **/
  @javax.annotation.Nonnull
  public Integer getCatId() {
    return catId;
  }

  public void setCatId(Integer catId) {
    this.catId = catId;
  }


  public FavChampOut catName(String catName) {
    this.catName = catName;
    return this;
  }

   /**
   * Get catName
   * @return catName
  **/
  @javax.annotation.Nullable
  public String getCatName() {
    return catName;
  }

  public void setCatName(String catName) {
    this.catName = catName;
  }


  public FavChampOut champName(String champName) {
    this.champName = champName;
    return this;
  }

   /**
   * Get champName
   * @return champName
  **/
  @javax.annotation.Nullable
  public String getChampName() {
    return champName;
  }

  public void setChampName(String champName) {
    this.champName = champName;
  }


  public FavChampOut champId(Long champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nonnull
  public Long getChampId() {
    return champId;
  }

  public void setChampId(Long champId) {
    this.champId = champId;
  }


  public FavChampOut hasLiveEvents(Boolean hasLiveEvents) {
    this.hasLiveEvents = hasLiveEvents;
    return this;
  }

   /**
   * Get hasLiveEvents
   * @return hasLiveEvents
  **/
  @javax.annotation.Nonnull
  public Boolean getHasLiveEvents() {
    return hasLiveEvents;
  }

  public void setHasLiveEvents(Boolean hasLiveEvents) {
    this.hasLiveEvents = hasLiveEvents;
  }


  public FavChampOut eventsCount(Integer eventsCount) {
    this.eventsCount = eventsCount;
    return this;
  }

   /**
   * Get eventsCount
   * @return eventsCount
  **/
  @javax.annotation.Nonnull
  public Integer getEventsCount() {
    return eventsCount;
  }

  public void setEventsCount(Integer eventsCount) {
    this.eventsCount = eventsCount;
  }


  public FavChampOut ISO(String ISO) {
    this.ISO = ISO;
    return this;
  }

   /**
   * Get ISO
   * @return ISO
  **/
  @javax.annotation.Nullable
  public String getISO() {
    return ISO;
  }

  public void setISO(String ISO) {
    this.ISO = ISO;
  }


  public FavChampOut sortOrderBySport(Long sortOrderBySport) {
    this.sortOrderBySport = sortOrderBySport;
    return this;
  }

   /**
   * Get sortOrderBySport
   * @return sortOrderBySport
  **/
  @javax.annotation.Nonnull
  public Long getSortOrderBySport() {
    return sortOrderBySport;
  }

  public void setSortOrderBySport(Long sortOrderBySport) {
    this.sortOrderBySport = sortOrderBySport;
  }


  public FavChampOut sortOrderByCategory(Long sortOrderByCategory) {
    this.sortOrderByCategory = sortOrderByCategory;
    return this;
  }

   /**
   * Get sortOrderByCategory
   * @return sortOrderByCategory
  **/
  @javax.annotation.Nonnull
  public Long getSortOrderByCategory() {
    return sortOrderByCategory;
  }

  public void setSortOrderByCategory(Long sortOrderByCategory) {
    this.sortOrderByCategory = sortOrderByCategory;
  }


  public FavChampOut sortOrderByChamp(Long sortOrderByChamp) {
    this.sortOrderByChamp = sortOrderByChamp;
    return this;
  }

   /**
   * Get sortOrderByChamp
   * @return sortOrderByChamp
  **/
  @javax.annotation.Nonnull
  public Long getSortOrderByChamp() {
    return sortOrderByChamp;
  }

  public void setSortOrderByChamp(Long sortOrderByChamp) {
    this.sortOrderByChamp = sortOrderByChamp;
  }


  public FavChampOut championshipIds(String championshipIds) {
    this.championshipIds = championshipIds;
    return this;
  }

   /**
   * Get championshipIds
   * @return championshipIds
  **/
  @javax.annotation.Nullable
  public String getChampionshipIds() {
    return championshipIds;
  }

  public void setChampionshipIds(String championshipIds) {
    this.championshipIds = championshipIds;
  }


  public FavChampOut EP(Boolean EP) {
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


  public FavChampOut BD(Boolean BD) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavChampOut favChampOut = (FavChampOut) o;
    return Objects.equals(this.sportId, favChampOut.sportId) &&
        Objects.equals(this.sportTypeId, favChampOut.sportTypeId) &&
        Objects.equals(this.sportName, favChampOut.sportName) &&
        Objects.equals(this.catId, favChampOut.catId) &&
        Objects.equals(this.catName, favChampOut.catName) &&
        Objects.equals(this.champName, favChampOut.champName) &&
        Objects.equals(this.champId, favChampOut.champId) &&
        Objects.equals(this.hasLiveEvents, favChampOut.hasLiveEvents) &&
        Objects.equals(this.eventsCount, favChampOut.eventsCount) &&
        Objects.equals(this.ISO, favChampOut.ISO) &&
        Objects.equals(this.sortOrderBySport, favChampOut.sortOrderBySport) &&
        Objects.equals(this.sortOrderByCategory, favChampOut.sortOrderByCategory) &&
        Objects.equals(this.sortOrderByChamp, favChampOut.sortOrderByChamp) &&
        Objects.equals(this.championshipIds, favChampOut.championshipIds) &&
        Objects.equals(this.EP, favChampOut.EP) &&
        Objects.equals(this.BD, favChampOut.BD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, sportTypeId, sportName, catId, catName, champName, champId, hasLiveEvents, eventsCount, ISO, sortOrderBySport, sortOrderByCategory, sortOrderByChamp, championshipIds, EP, BD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavChampOut {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    catId: ").append(toIndentedString(catId)).append("\n");
    sb.append("    catName: ").append(toIndentedString(catName)).append("\n");
    sb.append("    champName: ").append(toIndentedString(champName)).append("\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    hasLiveEvents: ").append(toIndentedString(hasLiveEvents)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    ISO: ").append(toIndentedString(ISO)).append("\n");
    sb.append("    sortOrderBySport: ").append(toIndentedString(sortOrderBySport)).append("\n");
    sb.append("    sortOrderByCategory: ").append(toIndentedString(sortOrderByCategory)).append("\n");
    sb.append("    sortOrderByChamp: ").append(toIndentedString(sortOrderByChamp)).append("\n");
    sb.append("    championshipIds: ").append(toIndentedString(championshipIds)).append("\n");
    sb.append("    EP: ").append(toIndentedString(EP)).append("\n");
    sb.append("    BD: ").append(toIndentedString(BD)).append("\n");
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
    openapiFields.add("SportId");
    openapiFields.add("SportTypeId");
    openapiFields.add("SportName");
    openapiFields.add("CatId");
    openapiFields.add("CatName");
    openapiFields.add("ChampName");
    openapiFields.add("ChampId");
    openapiFields.add("HasLiveEvents");
    openapiFields.add("EventsCount");
    openapiFields.add("ISO");
    openapiFields.add("SortOrderBySport");
    openapiFields.add("SortOrderByCategory");
    openapiFields.add("SortOrderByChamp");
    openapiFields.add("ChampionshipIds");
    openapiFields.add("EP");
    openapiFields.add("BD");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SportId");
    openapiRequiredFields.add("CatId");
    openapiRequiredFields.add("ChampId");
    openapiRequiredFields.add("HasLiveEvents");
    openapiRequiredFields.add("EventsCount");
    openapiRequiredFields.add("SortOrderBySport");
    openapiRequiredFields.add("SortOrderByCategory");
    openapiRequiredFields.add("SortOrderByChamp");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FavChampOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FavChampOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FavChampOut is not found in the empty JSON string", FavChampOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FavChampOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FavChampOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FavChampOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if ((jsonObj.get("CatName") != null && !jsonObj.get("CatName").isJsonNull()) && !jsonObj.get("CatName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CatName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CatName").toString()));
      }
      if ((jsonObj.get("ChampName") != null && !jsonObj.get("ChampName").isJsonNull()) && !jsonObj.get("ChampName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampName").toString()));
      }
      if ((jsonObj.get("ISO") != null && !jsonObj.get("ISO").isJsonNull()) && !jsonObj.get("ISO").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ISO` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ISO").toString()));
      }
      if ((jsonObj.get("ChampionshipIds") != null && !jsonObj.get("ChampionshipIds").isJsonNull()) && !jsonObj.get("ChampionshipIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampionshipIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampionshipIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FavChampOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FavChampOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FavChampOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FavChampOut.class));

       return (TypeAdapter<T>) new TypeAdapter<FavChampOut>() {
           @Override
           public void write(JsonWriter out, FavChampOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FavChampOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FavChampOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FavChampOut
  * @throws IOException if the JSON string is invalid with respect to FavChampOut
  */
  public static FavChampOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FavChampOut.class);
  }

 /**
  * Convert an instance of FavChampOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
