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
 * GetFeedManagerConfigChampsRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetFeedManagerConfigChampsRequestFilters {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Integer champId;

  public static final String SERIALIZED_NAME_CHAMP_GROUP_ID = "ChampGroupId";
  @SerializedName(SERIALIZED_NAME_CHAMP_GROUP_ID)
  private Integer champGroupId;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_ID = "LiveTemplateId";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_ID)
  private Integer liveTemplateId;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID = "PreLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID)
  private Integer preLiveTemplateId;

  public static final String SERIALIZED_NAME_SORTING = "Sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private FeedManagerChampsSorting sorting;

  public static final String SERIALIZED_NAME_TEMPLATE_FILTER = "TemplateFilter";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_FILTER)
  private FeedManagerTemplateFilter templateFilter;

  public static final String SERIALIZED_NAME_FEED_CONFIG_ID = "FeedConfigId";
  @SerializedName(SERIALIZED_NAME_FEED_CONFIG_ID)
  private Integer feedConfigId;

  public GetFeedManagerConfigChampsRequestFilters() {
  }

  public GetFeedManagerConfigChampsRequestFilters sportId(Integer sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nullable
  public Integer getSportId() {
    return sportId;
  }

  public void setSportId(Integer sportId) {
    this.sportId = sportId;
  }


  public GetFeedManagerConfigChampsRequestFilters categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public GetFeedManagerConfigChampsRequestFilters champId(Integer champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nullable
  public Integer getChampId() {
    return champId;
  }

  public void setChampId(Integer champId) {
    this.champId = champId;
  }


  public GetFeedManagerConfigChampsRequestFilters champGroupId(Integer champGroupId) {
    this.champGroupId = champGroupId;
    return this;
  }

   /**
   * Get champGroupId
   * @return champGroupId
  **/
  @javax.annotation.Nullable
  public Integer getChampGroupId() {
    return champGroupId;
  }

  public void setChampGroupId(Integer champGroupId) {
    this.champGroupId = champGroupId;
  }


  public GetFeedManagerConfigChampsRequestFilters liveTemplateId(Integer liveTemplateId) {
    this.liveTemplateId = liveTemplateId;
    return this;
  }

   /**
   * Get liveTemplateId
   * @return liveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getLiveTemplateId() {
    return liveTemplateId;
  }

  public void setLiveTemplateId(Integer liveTemplateId) {
    this.liveTemplateId = liveTemplateId;
  }


  public GetFeedManagerConfigChampsRequestFilters preLiveTemplateId(Integer preLiveTemplateId) {
    this.preLiveTemplateId = preLiveTemplateId;
    return this;
  }

   /**
   * Get preLiveTemplateId
   * @return preLiveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getPreLiveTemplateId() {
    return preLiveTemplateId;
  }

  public void setPreLiveTemplateId(Integer preLiveTemplateId) {
    this.preLiveTemplateId = preLiveTemplateId;
  }


  public GetFeedManagerConfigChampsRequestFilters sorting(FeedManagerChampsSorting sorting) {
    this.sorting = sorting;
    return this;
  }

   /**
   * Get sorting
   * @return sorting
  **/
  @javax.annotation.Nullable
  public FeedManagerChampsSorting getSorting() {
    return sorting;
  }

  public void setSorting(FeedManagerChampsSorting sorting) {
    this.sorting = sorting;
  }


  public GetFeedManagerConfigChampsRequestFilters templateFilter(FeedManagerTemplateFilter templateFilter) {
    this.templateFilter = templateFilter;
    return this;
  }

   /**
   * Get templateFilter
   * @return templateFilter
  **/
  @javax.annotation.Nullable
  public FeedManagerTemplateFilter getTemplateFilter() {
    return templateFilter;
  }

  public void setTemplateFilter(FeedManagerTemplateFilter templateFilter) {
    this.templateFilter = templateFilter;
  }


  public GetFeedManagerConfigChampsRequestFilters feedConfigId(Integer feedConfigId) {
    this.feedConfigId = feedConfigId;
    return this;
  }

   /**
   * Get feedConfigId
   * @return feedConfigId
  **/
  @javax.annotation.Nullable
  public Integer getFeedConfigId() {
    return feedConfigId;
  }

  public void setFeedConfigId(Integer feedConfigId) {
    this.feedConfigId = feedConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedManagerConfigChampsRequestFilters getFeedManagerConfigChampsRequestFilters = (GetFeedManagerConfigChampsRequestFilters) o;
    return Objects.equals(this.sportId, getFeedManagerConfigChampsRequestFilters.sportId) &&
        Objects.equals(this.categoryId, getFeedManagerConfigChampsRequestFilters.categoryId) &&
        Objects.equals(this.champId, getFeedManagerConfigChampsRequestFilters.champId) &&
        Objects.equals(this.champGroupId, getFeedManagerConfigChampsRequestFilters.champGroupId) &&
        Objects.equals(this.liveTemplateId, getFeedManagerConfigChampsRequestFilters.liveTemplateId) &&
        Objects.equals(this.preLiveTemplateId, getFeedManagerConfigChampsRequestFilters.preLiveTemplateId) &&
        Objects.equals(this.sorting, getFeedManagerConfigChampsRequestFilters.sorting) &&
        Objects.equals(this.templateFilter, getFeedManagerConfigChampsRequestFilters.templateFilter) &&
        Objects.equals(this.feedConfigId, getFeedManagerConfigChampsRequestFilters.feedConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, categoryId, champId, champGroupId, liveTemplateId, preLiveTemplateId, sorting, templateFilter, feedConfigId);
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
    sb.append("class GetFeedManagerConfigChampsRequestFilters {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    champGroupId: ").append(toIndentedString(champGroupId)).append("\n");
    sb.append("    liveTemplateId: ").append(toIndentedString(liveTemplateId)).append("\n");
    sb.append("    preLiveTemplateId: ").append(toIndentedString(preLiveTemplateId)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    templateFilter: ").append(toIndentedString(templateFilter)).append("\n");
    sb.append("    feedConfigId: ").append(toIndentedString(feedConfigId)).append("\n");
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
    openapiFields.add("CategoryId");
    openapiFields.add("ChampId");
    openapiFields.add("ChampGroupId");
    openapiFields.add("LiveTemplateId");
    openapiFields.add("PreLiveTemplateId");
    openapiFields.add("Sorting");
    openapiFields.add("TemplateFilter");
    openapiFields.add("FeedConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFeedManagerConfigChampsRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFeedManagerConfigChampsRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFeedManagerConfigChampsRequestFilters is not found in the empty JSON string", GetFeedManagerConfigChampsRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFeedManagerConfigChampsRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFeedManagerConfigChampsRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Sorting`
      if (jsonObj.get("Sorting") != null && !jsonObj.get("Sorting").isJsonNull()) {
        FeedManagerChampsSorting.validateJsonElement(jsonObj.get("Sorting"));
      }
      // validate the optional field `TemplateFilter`
      if (jsonObj.get("TemplateFilter") != null && !jsonObj.get("TemplateFilter").isJsonNull()) {
        FeedManagerTemplateFilter.validateJsonElement(jsonObj.get("TemplateFilter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFeedManagerConfigChampsRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFeedManagerConfigChampsRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFeedManagerConfigChampsRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFeedManagerConfigChampsRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFeedManagerConfigChampsRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetFeedManagerConfigChampsRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFeedManagerConfigChampsRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFeedManagerConfigChampsRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFeedManagerConfigChampsRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetFeedManagerConfigChampsRequestFilters
  */
  public static GetFeedManagerConfigChampsRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFeedManagerConfigChampsRequestFilters.class);
  }

 /**
  * Convert an instance of GetFeedManagerConfigChampsRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

