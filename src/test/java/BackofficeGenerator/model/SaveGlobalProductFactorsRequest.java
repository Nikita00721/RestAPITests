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
 * SaveGlobalProductFactorsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SaveGlobalProductFactorsRequest {
  public static final String SERIALIZED_NAME_PRELIVE = "Prelive";
  @SerializedName(SERIALIZED_NAME_PRELIVE)
  private Double prelive;

  public static final String SERIALIZED_NAME_VIRTUALS = "Virtuals";
  @SerializedName(SERIALIZED_NAME_VIRTUALS)
  private Double virtuals;

  public static final String SERIALIZED_NAME_LIVE = "Live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private Double live;

  public SaveGlobalProductFactorsRequest() {
  }

  public SaveGlobalProductFactorsRequest prelive(Double prelive) {
    this.prelive = prelive;
    return this;
  }

   /**
   * Get prelive
   * @return prelive
  **/
  @javax.annotation.Nullable
  public Double getPrelive() {
    return prelive;
  }

  public void setPrelive(Double prelive) {
    this.prelive = prelive;
  }


  public SaveGlobalProductFactorsRequest virtuals(Double virtuals) {
    this.virtuals = virtuals;
    return this;
  }

   /**
   * Get virtuals
   * @return virtuals
  **/
  @javax.annotation.Nullable
  public Double getVirtuals() {
    return virtuals;
  }

  public void setVirtuals(Double virtuals) {
    this.virtuals = virtuals;
  }


  public SaveGlobalProductFactorsRequest live(Double live) {
    this.live = live;
    return this;
  }

   /**
   * Get live
   * @return live
  **/
  @javax.annotation.Nullable
  public Double getLive() {
    return live;
  }

  public void setLive(Double live) {
    this.live = live;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveGlobalProductFactorsRequest saveGlobalProductFactorsRequest = (SaveGlobalProductFactorsRequest) o;
    return Objects.equals(this.prelive, saveGlobalProductFactorsRequest.prelive) &&
        Objects.equals(this.virtuals, saveGlobalProductFactorsRequest.virtuals) &&
        Objects.equals(this.live, saveGlobalProductFactorsRequest.live);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prelive, virtuals, live);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveGlobalProductFactorsRequest {\n");
    sb.append("    prelive: ").append(toIndentedString(prelive)).append("\n");
    sb.append("    virtuals: ").append(toIndentedString(virtuals)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
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
    openapiFields.add("Prelive");
    openapiFields.add("Virtuals");
    openapiFields.add("Live");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SaveGlobalProductFactorsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaveGlobalProductFactorsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaveGlobalProductFactorsRequest is not found in the empty JSON string", SaveGlobalProductFactorsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaveGlobalProductFactorsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaveGlobalProductFactorsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaveGlobalProductFactorsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaveGlobalProductFactorsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaveGlobalProductFactorsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaveGlobalProductFactorsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SaveGlobalProductFactorsRequest>() {
           @Override
           public void write(JsonWriter out, SaveGlobalProductFactorsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaveGlobalProductFactorsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SaveGlobalProductFactorsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SaveGlobalProductFactorsRequest
  * @throws IOException if the JSON string is invalid with respect to SaveGlobalProductFactorsRequest
  */
  public static SaveGlobalProductFactorsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaveGlobalProductFactorsRequest.class);
  }

 /**
  * Convert an instance of SaveGlobalProductFactorsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

