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
 * UpdateFeedEventResultsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateFeedEventResultsRequest {
  public static final String SERIALIZED_NAME_RESULTS = "Results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<FeedResultScore> results;

  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public UpdateFeedEventResultsRequest() {
  }

  public UpdateFeedEventResultsRequest results(List<FeedResultScore> results) {
    this.results = results;
    return this;
  }

  public UpdateFeedEventResultsRequest addResultsItem(FeedResultScore resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public List<FeedResultScore> getResults() {
    return results;
  }

  public void setResults(List<FeedResultScore> results) {
    this.results = results;
  }


  public UpdateFeedEventResultsRequest feedEventId(Long feedEventId) {
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
    UpdateFeedEventResultsRequest updateFeedEventResultsRequest = (UpdateFeedEventResultsRequest) o;
    return Objects.equals(this.results, updateFeedEventResultsRequest.results) &&
        Objects.equals(this.feedEventId, updateFeedEventResultsRequest.feedEventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, feedEventId);
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
    sb.append("class UpdateFeedEventResultsRequest {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("Results");
    openapiFields.add("FeedEventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateFeedEventResultsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateFeedEventResultsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateFeedEventResultsRequest is not found in the empty JSON string", UpdateFeedEventResultsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateFeedEventResultsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateFeedEventResultsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Results") != null && !jsonObj.get("Results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("Results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Results` to be an array in the JSON string but got `%s`", jsonObj.get("Results").toString()));
          }

          // validate the optional field `Results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            FeedResultScore.validateJsonElement(jsonArrayresults.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateFeedEventResultsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateFeedEventResultsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateFeedEventResultsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateFeedEventResultsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateFeedEventResultsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateFeedEventResultsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateFeedEventResultsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateFeedEventResultsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateFeedEventResultsRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateFeedEventResultsRequest
  */
  public static UpdateFeedEventResultsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateFeedEventResultsRequest.class);
  }

 /**
  * Convert an instance of UpdateFeedEventResultsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

