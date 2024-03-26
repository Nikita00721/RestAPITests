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
 * UpdateFeedManagerChampGroupTemplateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateFeedManagerChampGroupTemplateRequest {
  public static final String SERIALIZED_NAME_CHAMP_GROUP_ID = "ChampGroupId";
  @SerializedName(SERIALIZED_NAME_CHAMP_GROUP_ID)
  private Integer champGroupId;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_ID = "LiveTemplateId";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_ID)
  private Integer liveTemplateId;

  public static final String SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID = "PreLiveTemplateId";
  @SerializedName(SERIALIZED_NAME_PRE_LIVE_TEMPLATE_ID)
  private Integer preLiveTemplateId;

  public static final String SERIALIZED_NAME_FEED_CONFIG_ID = "FeedConfigId";
  @SerializedName(SERIALIZED_NAME_FEED_CONFIG_ID)
  private Integer feedConfigId;

  public UpdateFeedManagerChampGroupTemplateRequest() {
  }

  public UpdateFeedManagerChampGroupTemplateRequest champGroupId(Integer champGroupId) {
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


  public UpdateFeedManagerChampGroupTemplateRequest sportId(Integer sportId) {
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


  public UpdateFeedManagerChampGroupTemplateRequest liveTemplateId(Integer liveTemplateId) {
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


  public UpdateFeedManagerChampGroupTemplateRequest preLiveTemplateId(Integer preLiveTemplateId) {
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


  public UpdateFeedManagerChampGroupTemplateRequest feedConfigId(Integer feedConfigId) {
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
    UpdateFeedManagerChampGroupTemplateRequest updateFeedManagerChampGroupTemplateRequest = (UpdateFeedManagerChampGroupTemplateRequest) o;
    return Objects.equals(this.champGroupId, updateFeedManagerChampGroupTemplateRequest.champGroupId) &&
        Objects.equals(this.sportId, updateFeedManagerChampGroupTemplateRequest.sportId) &&
        Objects.equals(this.liveTemplateId, updateFeedManagerChampGroupTemplateRequest.liveTemplateId) &&
        Objects.equals(this.preLiveTemplateId, updateFeedManagerChampGroupTemplateRequest.preLiveTemplateId) &&
        Objects.equals(this.feedConfigId, updateFeedManagerChampGroupTemplateRequest.feedConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(champGroupId, sportId, liveTemplateId, preLiveTemplateId, feedConfigId);
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
    sb.append("class UpdateFeedManagerChampGroupTemplateRequest {\n");
    sb.append("    champGroupId: ").append(toIndentedString(champGroupId)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    liveTemplateId: ").append(toIndentedString(liveTemplateId)).append("\n");
    sb.append("    preLiveTemplateId: ").append(toIndentedString(preLiveTemplateId)).append("\n");
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
    openapiFields.add("ChampGroupId");
    openapiFields.add("SportId");
    openapiFields.add("LiveTemplateId");
    openapiFields.add("PreLiveTemplateId");
    openapiFields.add("FeedConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateFeedManagerChampGroupTemplateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFeedManagerChampGroupTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFeedManagerChampGroupTemplateRequest is not found in the empty JSON string", UpdateFeedManagerChampGroupTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFeedManagerChampGroupTemplateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFeedManagerChampGroupTemplateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFeedManagerChampGroupTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFeedManagerChampGroupTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFeedManagerChampGroupTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFeedManagerChampGroupTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFeedManagerChampGroupTemplateRequest>() {
           @Override
           public void write(JsonWriter out, UpdateFeedManagerChampGroupTemplateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFeedManagerChampGroupTemplateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateFeedManagerChampGroupTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateFeedManagerChampGroupTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateFeedManagerChampGroupTemplateRequest
  */
  public static UpdateFeedManagerChampGroupTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFeedManagerChampGroupTemplateRequest.class);
  }

 /**
  * Convert an instance of UpdateFeedManagerChampGroupTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

