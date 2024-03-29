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
 * UpdateInsightRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateInsightRequest {
  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_INSIGHTS_SHOWN = "InsightsShown";
  @SerializedName(SERIALIZED_NAME_INSIGHTS_SHOWN)
  private Integer insightsShown;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public UpdateInsightRequest() {
  }

  public UpdateInsightRequest isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public UpdateInsightRequest insightsShown(Integer insightsShown) {
    this.insightsShown = insightsShown;
    return this;
  }

   /**
   * Get insightsShown
   * @return insightsShown
  **/
  @javax.annotation.Nullable
  public Integer getInsightsShown() {
    return insightsShown;
  }

  public void setInsightsShown(Integer insightsShown) {
    this.insightsShown = insightsShown;
  }


  public UpdateInsightRequest configId(Integer configId) {
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
    UpdateInsightRequest updateInsightRequest = (UpdateInsightRequest) o;
    return Objects.equals(this.isEnabled, updateInsightRequest.isEnabled) &&
        Objects.equals(this.insightsShown, updateInsightRequest.insightsShown) &&
        Objects.equals(this.configId, updateInsightRequest.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, insightsShown, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInsightRequest {\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    insightsShown: ").append(toIndentedString(insightsShown)).append("\n");
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
    openapiFields.add("IsEnabled");
    openapiFields.add("InsightsShown");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateInsightRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateInsightRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateInsightRequest is not found in the empty JSON string", UpdateInsightRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateInsightRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateInsightRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateInsightRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateInsightRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateInsightRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateInsightRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateInsightRequest>() {
           @Override
           public void write(JsonWriter out, UpdateInsightRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateInsightRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateInsightRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateInsightRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateInsightRequest
  */
  public static UpdateInsightRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateInsightRequest.class);
  }

 /**
  * Convert an instance of UpdateInsightRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

