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
 * UpdateBoostConfigChampRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateBoostConfigChampRequest {
  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Integer champId;

  public static final String SERIALIZED_NAME_LIVE_TEMPLATE_ID = "LiveTemplateId";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATE_ID)
  private Integer liveTemplateId;

  public static final String SERIALIZED_NAME_PRELIVE_TEMPLATE_ID = "PreliveTemplateId";
  @SerializedName(SERIALIZED_NAME_PRELIVE_TEMPLATE_ID)
  private Integer preliveTemplateId;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public UpdateBoostConfigChampRequest() {
  }

  public UpdateBoostConfigChampRequest champId(Integer champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nullable
  public Integer getChampId() {
    return champId;
  }

  public void setChampId(Integer champId) {
    this.champId = champId;
  }


  public UpdateBoostConfigChampRequest liveTemplateId(Integer liveTemplateId) {
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


  public UpdateBoostConfigChampRequest preliveTemplateId(Integer preliveTemplateId) {
    this.preliveTemplateId = preliveTemplateId;
    return this;
  }

   /**
   * Get preliveTemplateId
   * @return preliveTemplateId
  **/
  @javax.annotation.Nullable
  public Integer getPreliveTemplateId() {
    return preliveTemplateId;
  }

  public void setPreliveTemplateId(Integer preliveTemplateId) {
    this.preliveTemplateId = preliveTemplateId;
  }


  public UpdateBoostConfigChampRequest configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBoostConfigChampRequest updateBoostConfigChampRequest = (UpdateBoostConfigChampRequest) o;
    return Objects.equals(this.champId, updateBoostConfigChampRequest.champId) &&
        Objects.equals(this.liveTemplateId, updateBoostConfigChampRequest.liveTemplateId) &&
        Objects.equals(this.preliveTemplateId, updateBoostConfigChampRequest.preliveTemplateId) &&
        Objects.equals(this.configId, updateBoostConfigChampRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(champId, liveTemplateId, preliveTemplateId, configId);
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
    sb.append("class UpdateBoostConfigChampRequest {\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    liveTemplateId: ").append(toIndentedString(liveTemplateId)).append("\n");
    sb.append("    preliveTemplateId: ").append(toIndentedString(preliveTemplateId)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
    openapiFields.add("ChampId");
    openapiFields.add("LiveTemplateId");
    openapiFields.add("PreliveTemplateId");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateBoostConfigChampRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBoostConfigChampRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBoostConfigChampRequest is not found in the empty JSON string", UpdateBoostConfigChampRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBoostConfigChampRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBoostConfigChampRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBoostConfigChampRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBoostConfigChampRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBoostConfigChampRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBoostConfigChampRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBoostConfigChampRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBoostConfigChampRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBoostConfigChampRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBoostConfigChampRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBoostConfigChampRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBoostConfigChampRequest
  */
  public static UpdateBoostConfigChampRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBoostConfigChampRequest.class);
  }

 /**
  * Convert an instance of UpdateBoostConfigChampRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
