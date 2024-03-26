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
 * TemplateChampionshipSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TemplateChampionshipSettings {
  public static final String SERIALIZED_NAME_CATEGORY_NAME = "CategoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_NAME = "ChampionshipName";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_NAME)
  private String championshipName;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "TemplateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_DEFAULT_TEMPLATE_ID = "DefaultTemplateId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TEMPLATE_ID)
  private Integer defaultTemplateId;

  public static final String SERIALIZED_NAME_DEFAULT_TEMPLATE_NAME = "DefaultTemplateName";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TEMPLATE_NAME)
  private String defaultTemplateName;

  public static final String SERIALIZED_NAME_LIVE_BET_DELAY = "LiveBetDelay";
  @SerializedName(SERIALIZED_NAME_LIVE_BET_DELAY)
  private Integer liveBetDelay;

  public static final String SERIALIZED_NAME_STAKE_LIMIT = "StakeLimit";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT)
  private Double stakeLimit;

  public static final String SERIALIZED_NAME_NET_WIN_LIMIT = "NetWinLimit";
  @SerializedName(SERIALIZED_NAME_NET_WIN_LIMIT)
  private Double netWinLimit;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_DEFAULT_STAKE_LIMIT = "DefaultStakeLimit";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STAKE_LIMIT)
  private Double defaultStakeLimit;

  public static final String SERIALIZED_NAME_DEFAULT_NET_WIN_LIMIT = "DefaultNetWinLimit";
  @SerializedName(SERIALIZED_NAME_DEFAULT_NET_WIN_LIMIT)
  private Double defaultNetWinLimit;

  public static final String SERIALIZED_NAME_DEFAULT_IS_ENABLED = "DefaultIsEnabled";
  @SerializedName(SERIALIZED_NAME_DEFAULT_IS_ENABLED)
  private Boolean defaultIsEnabled;

  public static final String SERIALIZED_NAME_STAKE_LIMIT_INHERITANCE = "StakeLimitInheritance";
  @SerializedName(SERIALIZED_NAME_STAKE_LIMIT_INHERITANCE)
  private TradingInheritanceLevel stakeLimitInheritance;

  public static final String SERIALIZED_NAME_NET_WIN_LIMIT_INHERITANCE = "NetWinLimitInheritance";
  @SerializedName(SERIALIZED_NAME_NET_WIN_LIMIT_INHERITANCE)
  private TradingInheritanceLevel netWinLimitInheritance;

  public static final String SERIALIZED_NAME_IS_ENABLED_INHERITANCE = "IsEnabledInheritance";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED_INHERITANCE)
  private TradingInheritanceLevel isEnabledInheritance;

  public static final String SERIALIZED_NAME_DEFAULT_TEMPLATE_IS_GLOBAL = "DefaultTemplateIsGlobal";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TEMPLATE_IS_GLOBAL)
  private Boolean defaultTemplateIsGlobal;

  public static final String SERIALIZED_NAME_TEMPLATE_IS_GLOBAL = "TemplateIsGlobal";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IS_GLOBAL)
  private Boolean templateIsGlobal;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public TemplateChampionshipSettings() {
  }

  public TemplateChampionshipSettings categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public TemplateChampionshipSettings championshipId(Integer championshipId) {
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


  public TemplateChampionshipSettings championshipName(String championshipName) {
    this.championshipName = championshipName;
    return this;
  }

   /**
   * Get championshipName
   * @return championshipName
  **/
  @javax.annotation.Nullable
  public String getChampionshipName() {
    return championshipName;
  }

  public void setChampionshipName(String championshipName) {
    this.championshipName = championshipName;
  }


  public TemplateChampionshipSettings templateId(Integer templateId) {
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


  public TemplateChampionshipSettings templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public TemplateChampionshipSettings defaultTemplateId(Integer defaultTemplateId) {
    this.defaultTemplateId = defaultTemplateId;
    return this;
  }

   /**
   * Get defaultTemplateId
   * @return defaultTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getDefaultTemplateId() {
    return defaultTemplateId;
  }

  public void setDefaultTemplateId(Integer defaultTemplateId) {
    this.defaultTemplateId = defaultTemplateId;
  }


  public TemplateChampionshipSettings defaultTemplateName(String defaultTemplateName) {
    this.defaultTemplateName = defaultTemplateName;
    return this;
  }

   /**
   * Get defaultTemplateName
   * @return defaultTemplateName
  **/
  @javax.annotation.Nullable
  public String getDefaultTemplateName() {
    return defaultTemplateName;
  }

  public void setDefaultTemplateName(String defaultTemplateName) {
    this.defaultTemplateName = defaultTemplateName;
  }


  public TemplateChampionshipSettings liveBetDelay(Integer liveBetDelay) {
    this.liveBetDelay = liveBetDelay;
    return this;
  }

   /**
   * Get liveBetDelay
   * @return liveBetDelay
  **/
  @javax.annotation.Nullable
  public Integer getLiveBetDelay() {
    return liveBetDelay;
  }

  public void setLiveBetDelay(Integer liveBetDelay) {
    this.liveBetDelay = liveBetDelay;
  }


  public TemplateChampionshipSettings stakeLimit(Double stakeLimit) {
    this.stakeLimit = stakeLimit;
    return this;
  }

   /**
   * Get stakeLimit
   * @return stakeLimit
  **/
  @javax.annotation.Nullable
  public Double getStakeLimit() {
    return stakeLimit;
  }

  public void setStakeLimit(Double stakeLimit) {
    this.stakeLimit = stakeLimit;
  }


  public TemplateChampionshipSettings netWinLimit(Double netWinLimit) {
    this.netWinLimit = netWinLimit;
    return this;
  }

   /**
   * Get netWinLimit
   * @return netWinLimit
  **/
  @javax.annotation.Nullable
  public Double getNetWinLimit() {
    return netWinLimit;
  }

  public void setNetWinLimit(Double netWinLimit) {
    this.netWinLimit = netWinLimit;
  }


  public TemplateChampionshipSettings isEnabled(Boolean isEnabled) {
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


  public TemplateChampionshipSettings defaultStakeLimit(Double defaultStakeLimit) {
    this.defaultStakeLimit = defaultStakeLimit;
    return this;
  }

   /**
   * Get defaultStakeLimit
   * @return defaultStakeLimit
  **/
  @javax.annotation.Nullable
  public Double getDefaultStakeLimit() {
    return defaultStakeLimit;
  }

  public void setDefaultStakeLimit(Double defaultStakeLimit) {
    this.defaultStakeLimit = defaultStakeLimit;
  }


  public TemplateChampionshipSettings defaultNetWinLimit(Double defaultNetWinLimit) {
    this.defaultNetWinLimit = defaultNetWinLimit;
    return this;
  }

   /**
   * Get defaultNetWinLimit
   * @return defaultNetWinLimit
  **/
  @javax.annotation.Nullable
  public Double getDefaultNetWinLimit() {
    return defaultNetWinLimit;
  }

  public void setDefaultNetWinLimit(Double defaultNetWinLimit) {
    this.defaultNetWinLimit = defaultNetWinLimit;
  }


  public TemplateChampionshipSettings defaultIsEnabled(Boolean defaultIsEnabled) {
    this.defaultIsEnabled = defaultIsEnabled;
    return this;
  }

   /**
   * Get defaultIsEnabled
   * @return defaultIsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getDefaultIsEnabled() {
    return defaultIsEnabled;
  }

  public void setDefaultIsEnabled(Boolean defaultIsEnabled) {
    this.defaultIsEnabled = defaultIsEnabled;
  }


  public TemplateChampionshipSettings stakeLimitInheritance(TradingInheritanceLevel stakeLimitInheritance) {
    this.stakeLimitInheritance = stakeLimitInheritance;
    return this;
  }

   /**
   * Get stakeLimitInheritance
   * @return stakeLimitInheritance
  **/
  @javax.annotation.Nullable
  public TradingInheritanceLevel getStakeLimitInheritance() {
    return stakeLimitInheritance;
  }

  public void setStakeLimitInheritance(TradingInheritanceLevel stakeLimitInheritance) {
    this.stakeLimitInheritance = stakeLimitInheritance;
  }


  public TemplateChampionshipSettings netWinLimitInheritance(TradingInheritanceLevel netWinLimitInheritance) {
    this.netWinLimitInheritance = netWinLimitInheritance;
    return this;
  }

   /**
   * Get netWinLimitInheritance
   * @return netWinLimitInheritance
  **/
  @javax.annotation.Nullable
  public TradingInheritanceLevel getNetWinLimitInheritance() {
    return netWinLimitInheritance;
  }

  public void setNetWinLimitInheritance(TradingInheritanceLevel netWinLimitInheritance) {
    this.netWinLimitInheritance = netWinLimitInheritance;
  }


  public TemplateChampionshipSettings isEnabledInheritance(TradingInheritanceLevel isEnabledInheritance) {
    this.isEnabledInheritance = isEnabledInheritance;
    return this;
  }

   /**
   * Get isEnabledInheritance
   * @return isEnabledInheritance
  **/
  @javax.annotation.Nullable
  public TradingInheritanceLevel getIsEnabledInheritance() {
    return isEnabledInheritance;
  }

  public void setIsEnabledInheritance(TradingInheritanceLevel isEnabledInheritance) {
    this.isEnabledInheritance = isEnabledInheritance;
  }


  public TemplateChampionshipSettings defaultTemplateIsGlobal(Boolean defaultTemplateIsGlobal) {
    this.defaultTemplateIsGlobal = defaultTemplateIsGlobal;
    return this;
  }

   /**
   * Get defaultTemplateIsGlobal
   * @return defaultTemplateIsGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getDefaultTemplateIsGlobal() {
    return defaultTemplateIsGlobal;
  }

  public void setDefaultTemplateIsGlobal(Boolean defaultTemplateIsGlobal) {
    this.defaultTemplateIsGlobal = defaultTemplateIsGlobal;
  }


  public TemplateChampionshipSettings templateIsGlobal(Boolean templateIsGlobal) {
    this.templateIsGlobal = templateIsGlobal;
    return this;
  }

   /**
   * Get templateIsGlobal
   * @return templateIsGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getTemplateIsGlobal() {
    return templateIsGlobal;
  }

  public void setTemplateIsGlobal(Boolean templateIsGlobal) {
    this.templateIsGlobal = templateIsGlobal;
  }


  public TemplateChampionshipSettings categoryId(Integer categoryId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateChampionshipSettings templateChampionshipSettings = (TemplateChampionshipSettings) o;
    return Objects.equals(this.categoryName, templateChampionshipSettings.categoryName) &&
        Objects.equals(this.championshipId, templateChampionshipSettings.championshipId) &&
        Objects.equals(this.championshipName, templateChampionshipSettings.championshipName) &&
        Objects.equals(this.templateId, templateChampionshipSettings.templateId) &&
        Objects.equals(this.templateName, templateChampionshipSettings.templateName) &&
        Objects.equals(this.defaultTemplateId, templateChampionshipSettings.defaultTemplateId) &&
        Objects.equals(this.defaultTemplateName, templateChampionshipSettings.defaultTemplateName) &&
        Objects.equals(this.liveBetDelay, templateChampionshipSettings.liveBetDelay) &&
        Objects.equals(this.stakeLimit, templateChampionshipSettings.stakeLimit) &&
        Objects.equals(this.netWinLimit, templateChampionshipSettings.netWinLimit) &&
        Objects.equals(this.isEnabled, templateChampionshipSettings.isEnabled) &&
        Objects.equals(this.defaultStakeLimit, templateChampionshipSettings.defaultStakeLimit) &&
        Objects.equals(this.defaultNetWinLimit, templateChampionshipSettings.defaultNetWinLimit) &&
        Objects.equals(this.defaultIsEnabled, templateChampionshipSettings.defaultIsEnabled) &&
        Objects.equals(this.stakeLimitInheritance, templateChampionshipSettings.stakeLimitInheritance) &&
        Objects.equals(this.netWinLimitInheritance, templateChampionshipSettings.netWinLimitInheritance) &&
        Objects.equals(this.isEnabledInheritance, templateChampionshipSettings.isEnabledInheritance) &&
        Objects.equals(this.defaultTemplateIsGlobal, templateChampionshipSettings.defaultTemplateIsGlobal) &&
        Objects.equals(this.templateIsGlobal, templateChampionshipSettings.templateIsGlobal) &&
        Objects.equals(this.categoryId, templateChampionshipSettings.categoryId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, championshipId, championshipName, templateId, templateName, defaultTemplateId, defaultTemplateName, liveBetDelay, stakeLimit, netWinLimit, isEnabled, defaultStakeLimit, defaultNetWinLimit, defaultIsEnabled, stakeLimitInheritance, netWinLimitInheritance, isEnabledInheritance, defaultTemplateIsGlobal, templateIsGlobal, categoryId);
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
    sb.append("class TemplateChampionshipSettings {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
    sb.append("    championshipName: ").append(toIndentedString(championshipName)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    defaultTemplateId: ").append(toIndentedString(defaultTemplateId)).append("\n");
    sb.append("    defaultTemplateName: ").append(toIndentedString(defaultTemplateName)).append("\n");
    sb.append("    liveBetDelay: ").append(toIndentedString(liveBetDelay)).append("\n");
    sb.append("    stakeLimit: ").append(toIndentedString(stakeLimit)).append("\n");
    sb.append("    netWinLimit: ").append(toIndentedString(netWinLimit)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    defaultStakeLimit: ").append(toIndentedString(defaultStakeLimit)).append("\n");
    sb.append("    defaultNetWinLimit: ").append(toIndentedString(defaultNetWinLimit)).append("\n");
    sb.append("    defaultIsEnabled: ").append(toIndentedString(defaultIsEnabled)).append("\n");
    sb.append("    stakeLimitInheritance: ").append(toIndentedString(stakeLimitInheritance)).append("\n");
    sb.append("    netWinLimitInheritance: ").append(toIndentedString(netWinLimitInheritance)).append("\n");
    sb.append("    isEnabledInheritance: ").append(toIndentedString(isEnabledInheritance)).append("\n");
    sb.append("    defaultTemplateIsGlobal: ").append(toIndentedString(defaultTemplateIsGlobal)).append("\n");
    sb.append("    templateIsGlobal: ").append(toIndentedString(templateIsGlobal)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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
    openapiFields.add("CategoryName");
    openapiFields.add("ChampionshipId");
    openapiFields.add("ChampionshipName");
    openapiFields.add("TemplateId");
    openapiFields.add("TemplateName");
    openapiFields.add("DefaultTemplateId");
    openapiFields.add("DefaultTemplateName");
    openapiFields.add("LiveBetDelay");
    openapiFields.add("StakeLimit");
    openapiFields.add("NetWinLimit");
    openapiFields.add("IsEnabled");
    openapiFields.add("DefaultStakeLimit");
    openapiFields.add("DefaultNetWinLimit");
    openapiFields.add("DefaultIsEnabled");
    openapiFields.add("StakeLimitInheritance");
    openapiFields.add("NetWinLimitInheritance");
    openapiFields.add("IsEnabledInheritance");
    openapiFields.add("DefaultTemplateIsGlobal");
    openapiFields.add("TemplateIsGlobal");
    openapiFields.add("CategoryId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TemplateChampionshipSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateChampionshipSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateChampionshipSettings is not found in the empty JSON string", TemplateChampionshipSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateChampionshipSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateChampionshipSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CategoryName") != null && !jsonObj.get("CategoryName").isJsonNull()) && !jsonObj.get("CategoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CategoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CategoryName").toString()));
      }
      if ((jsonObj.get("ChampionshipName") != null && !jsonObj.get("ChampionshipName").isJsonNull()) && !jsonObj.get("ChampionshipName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampionshipName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampionshipName").toString()));
      }
      if ((jsonObj.get("TemplateName") != null && !jsonObj.get("TemplateName").isJsonNull()) && !jsonObj.get("TemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TemplateName").toString()));
      }
      if ((jsonObj.get("DefaultTemplateName") != null && !jsonObj.get("DefaultTemplateName").isJsonNull()) && !jsonObj.get("DefaultTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DefaultTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DefaultTemplateName").toString()));
      }
      // validate the optional field `StakeLimitInheritance`
      if (jsonObj.get("StakeLimitInheritance") != null && !jsonObj.get("StakeLimitInheritance").isJsonNull()) {
        TradingInheritanceLevel.validateJsonElement(jsonObj.get("StakeLimitInheritance"));
      }
      // validate the optional field `NetWinLimitInheritance`
      if (jsonObj.get("NetWinLimitInheritance") != null && !jsonObj.get("NetWinLimitInheritance").isJsonNull()) {
        TradingInheritanceLevel.validateJsonElement(jsonObj.get("NetWinLimitInheritance"));
      }
      // validate the optional field `IsEnabledInheritance`
      if (jsonObj.get("IsEnabledInheritance") != null && !jsonObj.get("IsEnabledInheritance").isJsonNull()) {
        TradingInheritanceLevel.validateJsonElement(jsonObj.get("IsEnabledInheritance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateChampionshipSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateChampionshipSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateChampionshipSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateChampionshipSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateChampionshipSettings>() {
           @Override
           public void write(JsonWriter out, TemplateChampionshipSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateChampionshipSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateChampionshipSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateChampionshipSettings
  * @throws IOException if the JSON string is invalid with respect to TemplateChampionshipSettings
  */
  public static TemplateChampionshipSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateChampionshipSettings.class);
  }

 /**
  * Convert an instance of TemplateChampionshipSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
