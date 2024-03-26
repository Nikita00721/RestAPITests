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
 * UpdateFeedEventVoidStateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateFeedEventVoidStateRequest {
  public static final String SERIALIZED_NAME_IS_VOID = "IsVoid";
  @SerializedName(SERIALIZED_NAME_IS_VOID)
  private Boolean isVoid;

  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public UpdateFeedEventVoidStateRequest() {
  }

  public UpdateFeedEventVoidStateRequest isVoid(Boolean isVoid) {
    this.isVoid = isVoid;
    return this;
  }

   /**
   * Get isVoid
   * @return isVoid
  **/
  @javax.annotation.Nullable
  public Boolean getIsVoid() {
    return isVoid;
  }

  public void setIsVoid(Boolean isVoid) {
    this.isVoid = isVoid;
  }


  public UpdateFeedEventVoidStateRequest feedEventId(Long feedEventId) {
    this.feedEventId = feedEventId;
    return this;
  }

   /**
   * Get feedEventId
   * @return feedEventId
  **/
  @javax.annotation.Nullable
  public Long getFeedEventId() {
    return feedEventId;
  }

  public void setFeedEventId(Long feedEventId) {
    this.feedEventId = feedEventId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFeedEventVoidStateRequest updateFeedEventVoidStateRequest = (UpdateFeedEventVoidStateRequest) o;
    return Objects.equals(this.isVoid, updateFeedEventVoidStateRequest.isVoid) &&
        Objects.equals(this.feedEventId, updateFeedEventVoidStateRequest.feedEventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isVoid, feedEventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFeedEventVoidStateRequest {\n");
    sb.append("    isVoid: ").append(toIndentedString(isVoid)).append("\n");
    sb.append("    feedEventId: ").append(toIndentedString(feedEventId)).append("\n");
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
    openapiFields.add("IsVoid");
    openapiFields.add("FeedEventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateFeedEventVoidStateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFeedEventVoidStateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFeedEventVoidStateRequest is not found in the empty JSON string", UpdateFeedEventVoidStateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFeedEventVoidStateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFeedEventVoidStateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFeedEventVoidStateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFeedEventVoidStateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFeedEventVoidStateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFeedEventVoidStateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFeedEventVoidStateRequest>() {
           @Override
           public void write(JsonWriter out, UpdateFeedEventVoidStateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFeedEventVoidStateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateFeedEventVoidStateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateFeedEventVoidStateRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateFeedEventVoidStateRequest
  */
  public static UpdateFeedEventVoidStateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFeedEventVoidStateRequest.class);
  }

 /**
  * Convert an instance of UpdateFeedEventVoidStateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

