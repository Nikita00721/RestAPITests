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
 * GetFeedManagerConfigTemplatesForAssignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetFeedManagerConfigTemplatesForAssignRequest {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_FEED_CONFIG_ID = "FeedConfigId";
  @SerializedName(SERIALIZED_NAME_FEED_CONFIG_ID)
  private Integer feedConfigId;

  public GetFeedManagerConfigTemplatesForAssignRequest() {
  }

  public GetFeedManagerConfigTemplatesForAssignRequest sportId(Integer sportId) {
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


  public GetFeedManagerConfigTemplatesForAssignRequest feedConfigId(Integer feedConfigId) {
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
    GetFeedManagerConfigTemplatesForAssignRequest getFeedManagerConfigTemplatesForAssignRequest = (GetFeedManagerConfigTemplatesForAssignRequest) o;
    return Objects.equals(this.sportId, getFeedManagerConfigTemplatesForAssignRequest.sportId) &&
        Objects.equals(this.feedConfigId, getFeedManagerConfigTemplatesForAssignRequest.feedConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, feedConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedManagerConfigTemplatesForAssignRequest {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
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
    openapiFields.add("FeedConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFeedManagerConfigTemplatesForAssignRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFeedManagerConfigTemplatesForAssignRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFeedManagerConfigTemplatesForAssignRequest is not found in the empty JSON string", GetFeedManagerConfigTemplatesForAssignRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFeedManagerConfigTemplatesForAssignRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFeedManagerConfigTemplatesForAssignRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFeedManagerConfigTemplatesForAssignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFeedManagerConfigTemplatesForAssignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFeedManagerConfigTemplatesForAssignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFeedManagerConfigTemplatesForAssignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFeedManagerConfigTemplatesForAssignRequest>() {
           @Override
           public void write(JsonWriter out, GetFeedManagerConfigTemplatesForAssignRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFeedManagerConfigTemplatesForAssignRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFeedManagerConfigTemplatesForAssignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFeedManagerConfigTemplatesForAssignRequest
  * @throws IOException if the JSON string is invalid with respect to GetFeedManagerConfigTemplatesForAssignRequest
  */
  public static GetFeedManagerConfigTemplatesForAssignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFeedManagerConfigTemplatesForAssignRequest.class);
  }

 /**
  * Convert an instance of GetFeedManagerConfigTemplatesForAssignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

