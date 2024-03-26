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
 * ResetPendingSelectionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ResetPendingSelectionsRequest {
  public static final String SERIALIZED_NAME_RESULT_PROFILE_ID = "ResultProfileId";
  @SerializedName(SERIALIZED_NAME_RESULT_PROFILE_ID)
  private Integer resultProfileId;

  public static final String SERIALIZED_NAME_MARKETS = "Markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<ResetPendingSelectionsMarketRequestItem> markets;

  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public ResetPendingSelectionsRequest() {
  }

  public ResetPendingSelectionsRequest resultProfileId(Integer resultProfileId) {
    this.resultProfileId = resultProfileId;
    return this;
  }

   /**
   * Get resultProfileId
   * @return resultProfileId
  **/
  @javax.annotation.Nullable
  public Integer getResultProfileId() {
    return resultProfileId;
  }

  public void setResultProfileId(Integer resultProfileId) {
    this.resultProfileId = resultProfileId;
  }


  public ResetPendingSelectionsRequest markets(List<ResetPendingSelectionsMarketRequestItem> markets) {
    this.markets = markets;
    return this;
  }

  public ResetPendingSelectionsRequest addMarketsItem(ResetPendingSelectionsMarketRequestItem marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @javax.annotation.Nullable
  public List<ResetPendingSelectionsMarketRequestItem> getMarkets() {
    return markets;
  }

  public void setMarkets(List<ResetPendingSelectionsMarketRequestItem> markets) {
    this.markets = markets;
  }


  public ResetPendingSelectionsRequest feedEventId(Long feedEventId) {
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
    ResetPendingSelectionsRequest resetPendingSelectionsRequest = (ResetPendingSelectionsRequest) o;
    return Objects.equals(this.resultProfileId, resetPendingSelectionsRequest.resultProfileId) &&
        Objects.equals(this.markets, resetPendingSelectionsRequest.markets) &&
        Objects.equals(this.feedEventId, resetPendingSelectionsRequest.feedEventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultProfileId, markets, feedEventId);
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
    sb.append("class ResetPendingSelectionsRequest {\n");
    sb.append("    resultProfileId: ").append(toIndentedString(resultProfileId)).append("\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
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
    openapiFields.add("ResultProfileId");
    openapiFields.add("Markets");
    openapiFields.add("FeedEventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResetPendingSelectionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResetPendingSelectionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResetPendingSelectionsRequest is not found in the empty JSON string", ResetPendingSelectionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResetPendingSelectionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResetPendingSelectionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Markets") != null && !jsonObj.get("Markets").isJsonNull()) {
        JsonArray jsonArraymarkets = jsonObj.getAsJsonArray("Markets");
        if (jsonArraymarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Markets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Markets` to be an array in the JSON string but got `%s`", jsonObj.get("Markets").toString()));
          }

          // validate the optional field `Markets` (array)
          for (int i = 0; i < jsonArraymarkets.size(); i++) {
            ResetPendingSelectionsMarketRequestItem.validateJsonElement(jsonArraymarkets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResetPendingSelectionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResetPendingSelectionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResetPendingSelectionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResetPendingSelectionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ResetPendingSelectionsRequest>() {
           @Override
           public void write(JsonWriter out, ResetPendingSelectionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResetPendingSelectionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResetPendingSelectionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResetPendingSelectionsRequest
  * @throws IOException if the JSON string is invalid with respect to ResetPendingSelectionsRequest
  */
  public static ResetPendingSelectionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResetPendingSelectionsRequest.class);
  }

 /**
  * Convert an instance of ResetPendingSelectionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

