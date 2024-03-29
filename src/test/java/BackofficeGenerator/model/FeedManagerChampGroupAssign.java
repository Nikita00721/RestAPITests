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
 * FeedManagerChampGroupAssign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class FeedManagerChampGroupAssign {
  public static final String SERIALIZED_NAME_CHAMP_GROUP_NAME = "ChampGroupName";
  @SerializedName(SERIALIZED_NAME_CHAMP_GROUP_NAME)
  private String champGroupName;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_ID = "LiveTemplateId";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_ID)
  private Integer liveTemplateId;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_NAME = "LiveTemplateName";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_NAME)
  private String liveTemplateName;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID = "PreLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID)
  private Integer preLiveTemplateId;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_NAME = "PreLiveTemplateName";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_NAME)
  private String preLiveTemplateName;

  public static final String SERIALIZED_NAME_CHAMP_GROUP_ID = "ChampGroupId";
  @SerializedName(SERIALIZED_NAME_CHAMP_GROUP_ID)
  private Integer champGroupId;

  public FeedManagerChampGroupAssign() {
  }

  public FeedManagerChampGroupAssign champGroupName(String champGroupName) {
    this.champGroupName = champGroupName;
    return this;
  }

   /**
   * Get champGroupName
   * @return champGroupName
  **/
  @javax.annotation.Nullable
  public String getChampGroupName() {
    return champGroupName;
  }

  public void setChampGroupName(String champGroupName) {
    this.champGroupName = champGroupName;
  }


  public FeedManagerChampGroupAssign liveTemplateId(Integer liveTemplateId) {
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


  public FeedManagerChampGroupAssign liveTemplateName(String liveTemplateName) {
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


  public FeedManagerChampGroupAssign preLiveTemplateId(Integer preLiveTemplateId) {
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


  public FeedManagerChampGroupAssign preLiveTemplateName(String preLiveTemplateName) {
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


  public FeedManagerChampGroupAssign champGroupId(Integer champGroupId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedManagerChampGroupAssign feedManagerChampGroupAssign = (FeedManagerChampGroupAssign) o;
    return Objects.equals(this.champGroupName, feedManagerChampGroupAssign.champGroupName) &&
        Objects.equals(this.liveTemplateId, feedManagerChampGroupAssign.liveTemplateId) &&
        Objects.equals(this.liveTemplateName, feedManagerChampGroupAssign.liveTemplateName) &&
        Objects.equals(this.preLiveTemplateId, feedManagerChampGroupAssign.preLiveTemplateId) &&
        Objects.equals(this.preLiveTemplateName, feedManagerChampGroupAssign.preLiveTemplateName) &&
        Objects.equals(this.champGroupId, feedManagerChampGroupAssign.champGroupId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(champGroupName, liveTemplateId, liveTemplateName, preLiveTemplateId, preLiveTemplateName, champGroupId);
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
    sb.append("class FeedManagerChampGroupAssign {\n");
    sb.append("    champGroupName: ").append(toIndentedString(champGroupName)).append("\n");
    sb.append("    liveTemplateId: ").append(toIndentedString(liveTemplateId)).append("\n");
    sb.append("    liveTemplateName: ").append(toIndentedString(liveTemplateName)).append("\n");
    sb.append("    preLiveTemplateId: ").append(toIndentedString(preLiveTemplateId)).append("\n");
    sb.append("    preLiveTemplateName: ").append(toIndentedString(preLiveTemplateName)).append("\n");
    sb.append("    champGroupId: ").append(toIndentedString(champGroupId)).append("\n");
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
    openapiFields.add("ChampGroupName");
    openapiFields.add("LiveTemplateId");
    openapiFields.add("LiveTemplateName");
    openapiFields.add("PreLiveTemplateId");
    openapiFields.add("PreLiveTemplateName");
    openapiFields.add("ChampGroupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FeedManagerChampGroupAssign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedManagerChampGroupAssign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedManagerChampGroupAssign is not found in the empty JSON string", FeedManagerChampGroupAssign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedManagerChampGroupAssign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedManagerChampGroupAssign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ChampGroupName") != null && !jsonObj.get("ChampGroupName").isJsonNull()) && !jsonObj.get("ChampGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampGroupName").toString()));
      }
      if ((jsonObj.get("LiveTemplateName") != null && !jsonObj.get("LiveTemplateName").isJsonNull()) && !jsonObj.get("LiveTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LiveTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LiveTemplateName").toString()));
      }
      if ((jsonObj.get("PreLiveTemplateName") != null && !jsonObj.get("PreLiveTemplateName").isJsonNull()) && !jsonObj.get("PreLiveTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PreLiveTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PreLiveTemplateName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedManagerChampGroupAssign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedManagerChampGroupAssign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedManagerChampGroupAssign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedManagerChampGroupAssign.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedManagerChampGroupAssign>() {
           @Override
           public void write(JsonWriter out, FeedManagerChampGroupAssign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedManagerChampGroupAssign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeedManagerChampGroupAssign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeedManagerChampGroupAssign
  * @throws IOException if the JSON string is invalid with respect to FeedManagerChampGroupAssign
  */
  public static FeedManagerChampGroupAssign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedManagerChampGroupAssign.class);
  }

 /**
  * Convert an instance of FeedManagerChampGroupAssign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

