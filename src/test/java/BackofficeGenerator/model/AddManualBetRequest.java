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
 * AddManualBetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AddManualBetRequest {
  public static final String SERIALIZED_NAME_SELECTION_ID = "SelectionId";
  @SerializedName(SERIALIZED_NAME_SELECTION_ID)
  private Long selectionId;

  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public AddManualBetRequest() {
  }

  public AddManualBetRequest selectionId(Long selectionId) {
    this.selectionId = selectionId;
    return this;
  }

   /**
   * Get selectionId
   * @return selectionId
  **/
  @javax.annotation.Nullable
  public Long getSelectionId() {
    return selectionId;
  }

  public void setSelectionId(Long selectionId) {
    this.selectionId = selectionId;
  }


  public AddManualBetRequest feedEventId(Long feedEventId) {
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


  public AddManualBetRequest brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddManualBetRequest addManualBetRequest = (AddManualBetRequest) o;
    return Objects.equals(this.selectionId, addManualBetRequest.selectionId) &&
        Objects.equals(this.feedEventId, addManualBetRequest.feedEventId) &&
        Objects.equals(this.brandId, addManualBetRequest.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectionId, feedEventId, brandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddManualBetRequest {\n");
    sb.append("    selectionId: ").append(toIndentedString(selectionId)).append("\n");
    sb.append("    feedEventId: ").append(toIndentedString(feedEventId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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
    openapiFields.add("SelectionId");
    openapiFields.add("FeedEventId");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddManualBetRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddManualBetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddManualBetRequest is not found in the empty JSON string", AddManualBetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddManualBetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddManualBetRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddManualBetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddManualBetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddManualBetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddManualBetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddManualBetRequest>() {
           @Override
           public void write(JsonWriter out, AddManualBetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddManualBetRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddManualBetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddManualBetRequest
  * @throws IOException if the JSON string is invalid with respect to AddManualBetRequest
  */
  public static AddManualBetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddManualBetRequest.class);
  }

 /**
  * Convert an instance of AddManualBetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

