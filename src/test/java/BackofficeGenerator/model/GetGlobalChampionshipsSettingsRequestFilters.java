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
 * GetGlobalChampionshipsSettingsRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetGlobalChampionshipsSettingsRequestFilters {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_STAKE_LIMIT_FROM = "StakeLimitFrom";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT_FROM)
  private Double stakeLimitFrom;

  public static final String SERIALIZED_NAME_STAKE_LIMIT_TO = "StakeLimitTo";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT_TO)
  private Double stakeLimitTo;

  public static final String SERIALIZED_NAME_ONLY_OWN_STAKE_LIMIT = "OnlyOwnStakeLimit";
  @SerializedName(SERIALIZED_NAME_ONLY_OWN_STAKE_LIMIT)
  private Boolean onlyOwnStakeLimit;

  public static final String SERIALIZED_NAME_NET_WIN_FROM = "NetWinFrom";
  @SerializedName(SERIALIZED_NAME_NET_WIN_FROM)
  private Double netWinFrom;

  public static final String SERIALIZED_NAME_NET_WIN_TO = "NetWinTo";
  @SerializedName(SERIALIZED_NAME_NET_WIN_TO)
  private Double netWinTo;

  public static final String SERIALIZED_NAME_ONLY_OWN_NET_WIN = "OnlyOwnNetWin";
  @SerializedName(SERIALIZED_NAME_ONLY_OWN_NET_WIN)
  private Boolean onlyOwnNetWin;

  public static final String SERIALIZED_NAME_LIVE_BET_DELAY_FROM = "LiveBetDelayFrom";
  @SerializedName(SERIALIZED_NAME_LIVE_BET_DELAY_FROM)
  private Integer liveBetDelayFrom;

  public static final String SERIALIZED_NAME_LIVE_BET_DELAY_TO = "LiveBetDelayTo";
  @SerializedName(SERIALIZED_NAME_LIVE_BET_DELAY_TO)
  private Integer liveBetDelayTo;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public GetGlobalChampionshipsSettingsRequestFilters() {
  }

  public GetGlobalChampionshipsSettingsRequestFilters categoryId(Integer categoryId) {
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


  public GetGlobalChampionshipsSettingsRequestFilters championshipId(Integer championshipId) {
    this.championshipId = championshipId;
    return this;
  }

   /**
   * Get championshipId
   * @return championshipId
  **/
  @javax.annotation.Nullable
  public Integer getChampionshipId() {
    return championshipId;
  }

  public void setChampionshipId(Integer championshipId) {
    this.championshipId = championshipId;
  }


  public GetGlobalChampionshipsSettingsRequestFilters templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public GetGlobalChampionshipsSettingsRequestFilters isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public GetGlobalChampionshipsSettingsRequestFilters stakeLimitFrom(Double stakeLimitFrom) {
    this.stakeLimitFrom = stakeLimitFrom;
    return this;
  }

   /**
   * Get stakeLimitFrom
   * @return stakeLimitFrom
  **/
  @javax.annotation.Nullable
  public Double getStakeLimitFrom() {
    return stakeLimitFrom;
  }

  public void setStakeLimitFrom(Double stakeLimitFrom) {
    this.stakeLimitFrom = stakeLimitFrom;
  }


  public GetGlobalChampionshipsSettingsRequestFilters stakeLimitTo(Double stakeLimitTo) {
    this.stakeLimitTo = stakeLimitTo;
    return this;
  }

   /**
   * Get stakeLimitTo
   * @return stakeLimitTo
  **/
  @javax.annotation.Nullable
  public Double getStakeLimitTo() {
    return stakeLimitTo;
  }

  public void setStakeLimitTo(Double stakeLimitTo) {
    this.stakeLimitTo = stakeLimitTo;
  }


  public GetGlobalChampionshipsSettingsRequestFilters onlyOwnStakeLimit(Boolean onlyOwnStakeLimit) {
    this.onlyOwnStakeLimit = onlyOwnStakeLimit;
    return this;
  }

   /**
   * Get onlyOwnStakeLimit
   * @return onlyOwnStakeLimit
  **/
  @javax.annotation.Nullable
  public Boolean getOnlyOwnStakeLimit() {
    return onlyOwnStakeLimit;
  }

  public void setOnlyOwnStakeLimit(Boolean onlyOwnStakeLimit) {
    this.onlyOwnStakeLimit = onlyOwnStakeLimit;
  }


  public GetGlobalChampionshipsSettingsRequestFilters netWinFrom(Double netWinFrom) {
    this.netWinFrom = netWinFrom;
    return this;
  }

   /**
   * Get netWinFrom
   * @return netWinFrom
  **/
  @javax.annotation.Nullable
  public Double getNetWinFrom() {
    return netWinFrom;
  }

  public void setNetWinFrom(Double netWinFrom) {
    this.netWinFrom = netWinFrom;
  }


  public GetGlobalChampionshipsSettingsRequestFilters netWinTo(Double netWinTo) {
    this.netWinTo = netWinTo;
    return this;
  }

   /**
   * Get netWinTo
   * @return netWinTo
  **/
  @javax.annotation.Nullable
  public Double getNetWinTo() {
    return netWinTo;
  }

  public void setNetWinTo(Double netWinTo) {
    this.netWinTo = netWinTo;
  }


  public GetGlobalChampionshipsSettingsRequestFilters onlyOwnNetWin(Boolean onlyOwnNetWin) {
    this.onlyOwnNetWin = onlyOwnNetWin;
    return this;
  }

   /**
   * Get onlyOwnNetWin
   * @return onlyOwnNetWin
  **/
  @javax.annotation.Nullable
  public Boolean getOnlyOwnNetWin() {
    return onlyOwnNetWin;
  }

  public void setOnlyOwnNetWin(Boolean onlyOwnNetWin) {
    this.onlyOwnNetWin = onlyOwnNetWin;
  }


  public GetGlobalChampionshipsSettingsRequestFilters liveBetDelayFrom(Integer liveBetDelayFrom) {
    this.liveBetDelayFrom = liveBetDelayFrom;
    return this;
  }

   /**
   * Get liveBetDelayFrom
   * @return liveBetDelayFrom
  **/
  @javax.annotation.Nullable
  public Integer getLiveBetDelayFrom() {
    return liveBetDelayFrom;
  }

  public void setLiveBetDelayFrom(Integer liveBetDelayFrom) {
    this.liveBetDelayFrom = liveBetDelayFrom;
  }


  public GetGlobalChampionshipsSettingsRequestFilters liveBetDelayTo(Integer liveBetDelayTo) {
    this.liveBetDelayTo = liveBetDelayTo;
    return this;
  }

   /**
   * Get liveBetDelayTo
   * @return liveBetDelayTo
  **/
  @javax.annotation.Nullable
  public Integer getLiveBetDelayTo() {
    return liveBetDelayTo;
  }

  public void setLiveBetDelayTo(Integer liveBetDelayTo) {
    this.liveBetDelayTo = liveBetDelayTo;
  }


  public GetGlobalChampionshipsSettingsRequestFilters sportId(Integer sportId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGlobalChampionshipsSettingsRequestFilters getGlobalChampionshipsSettingsRequestFilters = (GetGlobalChampionshipsSettingsRequestFilters) o;
    return Objects.equals(this.categoryId, getGlobalChampionshipsSettingsRequestFilters.categoryId) &&
        Objects.equals(this.championshipId, getGlobalChampionshipsSettingsRequestFilters.championshipId) &&
        Objects.equals(this.templateId, getGlobalChampionshipsSettingsRequestFilters.templateId) &&
        Objects.equals(this.isEnabled, getGlobalChampionshipsSettingsRequestFilters.isEnabled) &&
        Objects.equals(this.stakeLimitFrom, getGlobalChampionshipsSettingsRequestFilters.stakeLimitFrom) &&
        Objects.equals(this.stakeLimitTo, getGlobalChampionshipsSettingsRequestFilters.stakeLimitTo) &&
        Objects.equals(this.onlyOwnStakeLimit, getGlobalChampionshipsSettingsRequestFilters.onlyOwnStakeLimit) &&
        Objects.equals(this.netWinFrom, getGlobalChampionshipsSettingsRequestFilters.netWinFrom) &&
        Objects.equals(this.netWinTo, getGlobalChampionshipsSettingsRequestFilters.netWinTo) &&
        Objects.equals(this.onlyOwnNetWin, getGlobalChampionshipsSettingsRequestFilters.onlyOwnNetWin) &&
        Objects.equals(this.liveBetDelayFrom, getGlobalChampionshipsSettingsRequestFilters.liveBetDelayFrom) &&
        Objects.equals(this.liveBetDelayTo, getGlobalChampionshipsSettingsRequestFilters.liveBetDelayTo) &&
        Objects.equals(this.sportId, getGlobalChampionshipsSettingsRequestFilters.sportId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, championshipId, templateId, isEnabled, stakeLimitFrom, stakeLimitTo, onlyOwnStakeLimit, netWinFrom, netWinTo, onlyOwnNetWin, liveBetDelayFrom, liveBetDelayTo, sportId);
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
    sb.append("class GetGlobalChampionshipsSettingsRequestFilters {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    stakeLimitFrom: ").append(toIndentedString(stakeLimitFrom)).append("\n");
    sb.append("    stakeLimitTo: ").append(toIndentedString(stakeLimitTo)).append("\n");
    sb.append("    onlyOwnStakeLimit: ").append(toIndentedString(onlyOwnStakeLimit)).append("\n");
    sb.append("    netWinFrom: ").append(toIndentedString(netWinFrom)).append("\n");
    sb.append("    netWinTo: ").append(toIndentedString(netWinTo)).append("\n");
    sb.append("    onlyOwnNetWin: ").append(toIndentedString(onlyOwnNetWin)).append("\n");
    sb.append("    liveBetDelayFrom: ").append(toIndentedString(liveBetDelayFrom)).append("\n");
    sb.append("    liveBetDelayTo: ").append(toIndentedString(liveBetDelayTo)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
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
    openapiFields.add("CategoryId");
    openapiFields.add("ChampionshipId");
    openapiFields.add("TemplateId");
    openapiFields.add("IsEnabled");
    openapiFields.add("StakeLimitFrom");
    openapiFields.add("StakeLimitTo");
    openapiFields.add("OnlyOwnStakeLimit");
    openapiFields.add("NetWinFrom");
    openapiFields.add("NetWinTo");
    openapiFields.add("OnlyOwnNetWin");
    openapiFields.add("LiveBetDelayFrom");
    openapiFields.add("LiveBetDelayTo");
    openapiFields.add("SportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetGlobalChampionshipsSettingsRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGlobalChampionshipsSettingsRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGlobalChampionshipsSettingsRequestFilters is not found in the empty JSON string", GetGlobalChampionshipsSettingsRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGlobalChampionshipsSettingsRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGlobalChampionshipsSettingsRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGlobalChampionshipsSettingsRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGlobalChampionshipsSettingsRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGlobalChampionshipsSettingsRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGlobalChampionshipsSettingsRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGlobalChampionshipsSettingsRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetGlobalChampionshipsSettingsRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGlobalChampionshipsSettingsRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGlobalChampionshipsSettingsRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGlobalChampionshipsSettingsRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetGlobalChampionshipsSettingsRequestFilters
  */
  public static GetGlobalChampionshipsSettingsRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGlobalChampionshipsSettingsRequestFilters.class);
  }

 /**
  * Convert an instance of GetGlobalChampionshipsSettingsRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

