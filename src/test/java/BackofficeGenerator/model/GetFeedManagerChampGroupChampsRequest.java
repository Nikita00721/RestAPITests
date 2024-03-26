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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * GetFeedManagerChampGroupChampsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetFeedManagerChampGroupChampsRequest {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_FEED_CONFIG_ID = "FeedConfigId";
  @SerializedName(SERIALIZED_NAME_FEED_CONFIG_ID)
  private Integer feedConfigId;

  public static final String SERIALIZED_NAME_ASSIGN_TYPE = "AssignType";
  @SerializedName(SERIALIZED_NAME_ASSIGN_TYPE)
  private FeedManagerChampGroupChampsAssignType assignType;

  public static final String SERIALIZED_NAME_CHAMPS_GROUP_ID = "ChampsGroupId";
  @SerializedName(SERIALIZED_NAME_CHAMPS_GROUP_ID)
  private Integer champsGroupId;

  public GetFeedManagerChampGroupChampsRequest() {
  }

  public GetFeedManagerChampGroupChampsRequest sportId(Integer sportId) {
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


  public GetFeedManagerChampGroupChampsRequest feedConfigId(Integer feedConfigId) {
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


  public GetFeedManagerChampGroupChampsRequest assignType(FeedManagerChampGroupChampsAssignType assignType) {
    this.assignType = assignType;
    return this;
  }

   /**
   * Get assignType
   * @return assignType
  **/
  @javax.annotation.Nullable
  public FeedManagerChampGroupChampsAssignType getAssignType() {
    return assignType;
  }

  public void setAssignType(FeedManagerChampGroupChampsAssignType assignType) {
    this.assignType = assignType;
  }


  public GetFeedManagerChampGroupChampsRequest champsGroupId(Integer champsGroupId) {
    this.champsGroupId = champsGroupId;
    return this;
  }

   /**
   * Get champsGroupId
   * @return champsGroupId
  **/
  @javax.annotation.Nullable
  public Integer getChampsGroupId() {
    return champsGroupId;
  }

  public void setChampsGroupId(Integer champsGroupId) {
    this.champsGroupId = champsGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedManagerChampGroupChampsRequest getFeedManagerChampGroupChampsRequest = (GetFeedManagerChampGroupChampsRequest) o;
    return Objects.equals(this.sportId, getFeedManagerChampGroupChampsRequest.sportId) &&
        Objects.equals(this.feedConfigId, getFeedManagerChampGroupChampsRequest.feedConfigId) &&
        Objects.equals(this.assignType, getFeedManagerChampGroupChampsRequest.assignType) &&
        Objects.equals(this.champsGroupId, getFeedManagerChampGroupChampsRequest.champsGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, feedConfigId, assignType, champsGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedManagerChampGroupChampsRequest {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    feedConfigId: ").append(toIndentedString(feedConfigId)).append("\n");
    sb.append("    assignType: ").append(toIndentedString(assignType)).append("\n");
    sb.append("    champsGroupId: ").append(toIndentedString(champsGroupId)).append("\n");
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
    openapiFields.add("FeedConfigId");
    openapiFields.add("AssignType");
    openapiFields.add("ChampsGroupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFeedManagerChampGroupChampsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFeedManagerChampGroupChampsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFeedManagerChampGroupChampsRequest is not found in the empty JSON string", GetFeedManagerChampGroupChampsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFeedManagerChampGroupChampsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFeedManagerChampGroupChampsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AssignType`
      if (jsonObj.get("AssignType") != null && !jsonObj.get("AssignType").isJsonNull()) {
        FeedManagerChampGroupChampsAssignType.validateJsonElement(jsonObj.get("AssignType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFeedManagerChampGroupChampsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFeedManagerChampGroupChampsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFeedManagerChampGroupChampsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFeedManagerChampGroupChampsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFeedManagerChampGroupChampsRequest>() {
           @Override
           public void write(JsonWriter out, GetFeedManagerChampGroupChampsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFeedManagerChampGroupChampsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFeedManagerChampGroupChampsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFeedManagerChampGroupChampsRequest
  * @throws IOException if the JSON string is invalid with respect to GetFeedManagerChampGroupChampsRequest
  */
  public static GetFeedManagerChampGroupChampsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFeedManagerChampGroupChampsRequest.class);
  }

 /**
  * Convert an instance of GetFeedManagerChampGroupChampsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
