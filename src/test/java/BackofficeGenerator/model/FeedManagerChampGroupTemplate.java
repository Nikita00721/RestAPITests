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
 * FeedManagerChampGroupTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class FeedManagerChampGroupTemplate {
  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_ID = "LiveTemplateId";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_ID)
  private Integer liveTemplateId;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_NAME = "LiveTemplateName";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_NAME)
  private String liveTemplateName;

  public static final String SERIALIZED_NAME_GLOBAL_LIVE_TEMPLATE_ID = "GlobalLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIVE_TEMPLATE_ID)
  private Integer globalLiveTemplateId;

  public static final String SERIALIZED_NAME_GLOBAL_LIVE_TEMPLATE_NAME = "GlobalLiveTemplateName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIVE_TEMPLATE_NAME)
  private String globalLiveTemplateName;

  public static final String SERIALIZED_NAME_IS_LIVE_GLOBAL = "IsLiveGlobal";
  @SerializedName(SERIALIZED_NAME_IS_LIVE_GLOBAL)
  private Boolean isLiveGlobal;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID = "PreLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID)
  private Integer preLiveTemplateId;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_NAME = "PreLiveTemplateName";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_NAME)
  private String preLiveTemplateName;

  public static final String SERIALIZED_NAME_GLOBAL_PRE_LIVE_TEMPLATE_ID = "GlobalPreLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_PRE_LIVE_TEMPLATE_ID)
  private Integer globalPreLiveTemplateId;

  public static final String SERIALIZED_NAME_GLOBAL_PRE_LIVE_TEMPLATE_NAME = "GlobalPreLiveTemplateName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_PRE_LIVE_TEMPLATE_NAME)
  private String globalPreLiveTemplateName;

  public static final String SERIALIZED_NAME_IS_PRE_LIVE_GLOBAL = "IsPreLiveGlobal";
  @SerializedName(SERIALIZED_NAME_IS_PRE_LIVE_GLOBAL)
  private Boolean isPreLiveGlobal;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public FeedManagerChampGroupTemplate() {
  }

  public FeedManagerChampGroupTemplate sportName(String sportName) {
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


  public FeedManagerChampGroupTemplate liveTemplateId(Integer liveTemplateId) {
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


  public FeedManagerChampGroupTemplate liveTemplateName(String liveTemplateName) {
    this.liveTemplateName = liveTemplateName;
    return this;
  }

   /**
   * Get liveTemplateName
   * @return liveTemplateName
  **/
  @javax.annotation.Nullable
  public String getLiveTemplateName() {
    return liveTemplateName;
  }

  public void setLiveTemplateName(String liveTemplateName) {
    this.liveTemplateName = liveTemplateName;
  }


  public FeedManagerChampGroupTemplate globalLiveTemplateId(Integer globalLiveTemplateId) {
    this.globalLiveTemplateId = globalLiveTemplateId;
    return this;
  }

   /**
   * Get globalLiveTemplateId
   * @return globalLiveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getGlobalLiveTemplateId() {
    return globalLiveTemplateId;
  }

  public void setGlobalLiveTemplateId(Integer globalLiveTemplateId) {
    this.globalLiveTemplateId = globalLiveTemplateId;
  }


  public FeedManagerChampGroupTemplate globalLiveTemplateName(String globalLiveTemplateName) {
    this.globalLiveTemplateName = globalLiveTemplateName;
    return this;
  }

   /**
   * Get globalLiveTemplateName
   * @return globalLiveTemplateName
  **/
  @javax.annotation.Nullable
  public String getGlobalLiveTemplateName() {
    return globalLiveTemplateName;
  }

  public void setGlobalLiveTemplateName(String globalLiveTemplateName) {
    this.globalLiveTemplateName = globalLiveTemplateName;
  }


  public FeedManagerChampGroupTemplate isLiveGlobal(Boolean isLiveGlobal) {
    this.isLiveGlobal = isLiveGlobal;
    return this;
  }

   /**
   * Get isLiveGlobal
   * @return isLiveGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getIsLiveGlobal() {
    return isLiveGlobal;
  }

  public void setIsLiveGlobal(Boolean isLiveGlobal) {
    this.isLiveGlobal = isLiveGlobal;
  }


  public FeedManagerChampGroupTemplate preLiveTemplateId(Integer preLiveTemplateId) {
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


  public FeedManagerChampGroupTemplate preLiveTemplateName(String preLiveTemplateName) {
    this.preLiveTemplateName = preLiveTemplateName;
    return this;
  }

   /**
   * Get preLiveTemplateName
   * @return preLiveTemplateName
  **/
  @javax.annotation.Nullable
  public String getPreLiveTemplateName() {
    return preLiveTemplateName;
  }

  public void setPreLiveTemplateName(String preLiveTemplateName) {
    this.preLiveTemplateName = preLiveTemplateName;
  }


  public FeedManagerChampGroupTemplate globalPreLiveTemplateId(Integer globalPreLiveTemplateId) {
    this.globalPreLiveTemplateId = globalPreLiveTemplateId;
    return this;
  }

   /**
   * Get globalPreLiveTemplateId
   * @return globalPreLiveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getGlobalPreLiveTemplateId() {
    return globalPreLiveTemplateId;
  }

  public void setGlobalPreLiveTemplateId(Integer globalPreLiveTemplateId) {
    this.globalPreLiveTemplateId = globalPreLiveTemplateId;
  }


  public FeedManagerChampGroupTemplate globalPreLiveTemplateName(String globalPreLiveTemplateName) {
    this.globalPreLiveTemplateName = globalPreLiveTemplateName;
    return this;
  }

   /**
   * Get globalPreLiveTemplateName
   * @return globalPreLiveTemplateName
  **/
  @javax.annotation.Nullable
  public String getGlobalPreLiveTemplateName() {
    return globalPreLiveTemplateName;
  }

  public void setGlobalPreLiveTemplateName(String globalPreLiveTemplateName) {
    this.globalPreLiveTemplateName = globalPreLiveTemplateName;
  }


  public FeedManagerChampGroupTemplate isPreLiveGlobal(Boolean isPreLiveGlobal) {
    this.isPreLiveGlobal = isPreLiveGlobal;
    return this;
  }

   /**
   * Get isPreLiveGlobal
   * @return isPreLiveGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getIsPreLiveGlobal() {
    return isPreLiveGlobal;
  }

  public void setIsPreLiveGlobal(Boolean isPreLiveGlobal) {
    this.isPreLiveGlobal = isPreLiveGlobal;
  }


  public FeedManagerChampGroupTemplate sportId(Integer sportId) {
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
    FeedManagerChampGroupTemplate feedManagerChampGroupTemplate = (FeedManagerChampGroupTemplate) o;
    return Objects.equals(this.sportName, feedManagerChampGroupTemplate.sportName) &&
        Objects.equals(this.liveTemplateId, feedManagerChampGroupTemplate.liveTemplateId) &&
        Objects.equals(this.liveTemplateName, feedManagerChampGroupTemplate.liveTemplateName) &&
        Objects.equals(this.globalLiveTemplateId, feedManagerChampGroupTemplate.globalLiveTemplateId) &&
        Objects.equals(this.globalLiveTemplateName, feedManagerChampGroupTemplate.globalLiveTemplateName) &&
        Objects.equals(this.isLiveGlobal, feedManagerChampGroupTemplate.isLiveGlobal) &&
        Objects.equals(this.preLiveTemplateId, feedManagerChampGroupTemplate.preLiveTemplateId) &&
        Objects.equals(this.preLiveTemplateName, feedManagerChampGroupTemplate.preLiveTemplateName) &&
        Objects.equals(this.globalPreLiveTemplateId, feedManagerChampGroupTemplate.globalPreLiveTemplateId) &&
        Objects.equals(this.globalPreLiveTemplateName, feedManagerChampGroupTemplate.globalPreLiveTemplateName) &&
        Objects.equals(this.isPreLiveGlobal, feedManagerChampGroupTemplate.isPreLiveGlobal) &&
        Objects.equals(this.sportId, feedManagerChampGroupTemplate.sportId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportName, liveTemplateId, liveTemplateName, globalLiveTemplateId, globalLiveTemplateName, isLiveGlobal, preLiveTemplateId, preLiveTemplateName, globalPreLiveTemplateId, globalPreLiveTemplateName, isPreLiveGlobal, sportId);
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
    sb.append("class FeedManagerChampGroupTemplate {\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    liveTemplateId: ").append(toIndentedString(liveTemplateId)).append("\n");
    sb.append("    liveTemplateName: ").append(toIndentedString(liveTemplateName)).append("\n");
    sb.append("    globalLiveTemplateId: ").append(toIndentedString(globalLiveTemplateId)).append("\n");
    sb.append("    globalLiveTemplateName: ").append(toIndentedString(globalLiveTemplateName)).append("\n");
    sb.append("    isLiveGlobal: ").append(toIndentedString(isLiveGlobal)).append("\n");
    sb.append("    preLiveTemplateId: ").append(toIndentedString(preLiveTemplateId)).append("\n");
    sb.append("    preLiveTemplateName: ").append(toIndentedString(preLiveTemplateName)).append("\n");
    sb.append("    globalPreLiveTemplateId: ").append(toIndentedString(globalPreLiveTemplateId)).append("\n");
    sb.append("    globalPreLiveTemplateName: ").append(toIndentedString(globalPreLiveTemplateName)).append("\n");
    sb.append("    isPreLiveGlobal: ").append(toIndentedString(isPreLiveGlobal)).append("\n");
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
    openapiFields.add("SportName");
    openapiFields.add("LiveTemplateId");
    openapiFields.add("LiveTemplateName");
    openapiFields.add("GlobalLiveTemplateId");
    openapiFields.add("GlobalLiveTemplateName");
    openapiFields.add("IsLiveGlobal");
    openapiFields.add("PreLiveTemplateId");
    openapiFields.add("PreLiveTemplateName");
    openapiFields.add("GlobalPreLiveTemplateId");
    openapiFields.add("GlobalPreLiveTemplateName");
    openapiFields.add("IsPreLiveGlobal");
    openapiFields.add("SportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FeedManagerChampGroupTemplate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedManagerChampGroupTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedManagerChampGroupTemplate is not found in the empty JSON string", FeedManagerChampGroupTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedManagerChampGroupTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedManagerChampGroupTemplate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if ((jsonObj.get("LiveTemplateName") != null && !jsonObj.get("LiveTemplateName").isJsonNull()) && !jsonObj.get("LiveTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LiveTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LiveTemplateName").toString()));
      }
      if ((jsonObj.get("GlobalLiveTemplateName") != null && !jsonObj.get("GlobalLiveTemplateName").isJsonNull()) && !jsonObj.get("GlobalLiveTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalLiveTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalLiveTemplateName").toString()));
      }
      if ((jsonObj.get("PreLiveTemplateName") != null && !jsonObj.get("PreLiveTemplateName").isJsonNull()) && !jsonObj.get("PreLiveTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PreLiveTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PreLiveTemplateName").toString()));
      }
      if ((jsonObj.get("GlobalPreLiveTemplateName") != null && !jsonObj.get("GlobalPreLiveTemplateName").isJsonNull()) && !jsonObj.get("GlobalPreLiveTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalPreLiveTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalPreLiveTemplateName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedManagerChampGroupTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedManagerChampGroupTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedManagerChampGroupTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedManagerChampGroupTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedManagerChampGroupTemplate>() {
           @Override
           public void write(JsonWriter out, FeedManagerChampGroupTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedManagerChampGroupTemplate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeedManagerChampGroupTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeedManagerChampGroupTemplate
  * @throws IOException if the JSON string is invalid with respect to FeedManagerChampGroupTemplate
  */
  public static FeedManagerChampGroupTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedManagerChampGroupTemplate.class);
  }

 /**
  * Convert an instance of FeedManagerChampGroupTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

