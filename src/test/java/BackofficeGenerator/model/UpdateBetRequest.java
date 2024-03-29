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
 * UpdateBetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateBetRequest {
  public static final String SERIALIZED_NAME_NEW_SELECTION_ID = "NewSelectionId";
  @SerializedName(SERIALIZED_NAME_NEW_SELECTION_ID)
  private Long newSelectionId;

  public static final String SERIALIZED_NAME_OLD_SELECTION_ID = "OldSelectionId";
  @SerializedName(SERIALIZED_NAME_OLD_SELECTION_ID)
  private Long oldSelectionId;

  public static final String SERIALIZED_NAME_FEED_EVENT_ID = "FeedEventId";
  @SerializedName(SERIALIZED_NAME_FEED_EVENT_ID)
  private Long feedEventId;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public UpdateBetRequest() {
  }

  public UpdateBetRequest newSelectionId(Long newSelectionId) {
    this.newSelectionId = newSelectionId;
    return this;
  }

   /**
   * Get newSelectionId
   * @return newSelectionId
  **/
  @javax.annotation.Nullable
  public Long getNewSelectionId() {
    return newSelectionId;
  }

  public void setNewSelectionId(Long newSelectionId) {
    this.newSelectionId = newSelectionId;
  }


  public UpdateBetRequest oldSelectionId(Long oldSelectionId) {
    this.oldSelectionId = oldSelectionId;
    return this;
  }

   /**
   * Get oldSelectionId
   * @return oldSelectionId
  **/
  @javax.annotation.Nullable
  public Long getOldSelectionId() {
    return oldSelectionId;
  }

  public void setOldSelectionId(Long oldSelectionId) {
    this.oldSelectionId = oldSelectionId;
  }


  public UpdateBetRequest feedEventId(Long feedEventId) {
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


  public UpdateBetRequest brandId(Integer brandId) {
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
    UpdateBetRequest updateBetRequest = (UpdateBetRequest) o;
    return Objects.equals(this.newSelectionId, updateBetRequest.newSelectionId) &&
        Objects.equals(this.oldSelectionId, updateBetRequest.oldSelectionId) &&
        Objects.equals(this.feedEventId, updateBetRequest.feedEventId) &&
        Objects.equals(this.brandId, updateBetRequest.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newSelectionId, oldSelectionId, feedEventId, brandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBetRequest {\n");
    sb.append("    newSelectionId: ").append(toIndentedString(newSelectionId)).append("\n");
    sb.append("    oldSelectionId: ").append(toIndentedString(oldSelectionId)).append("\n");
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
    openapiFields.add("NewSelectionId");
    openapiFields.add("OldSelectionId");
    openapiFields.add("FeedEventId");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateBetRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBetRequest is not found in the empty JSON string", UpdateBetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBetRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBetRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBetRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBetRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBetRequest
  */
  public static UpdateBetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBetRequest.class);
  }

 /**
  * Convert an instance of UpdateBetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

