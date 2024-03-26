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
 * ResetConfigTemplateMarketMarginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ResetConfigTemplateMarketMarginRequest {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_SPORT_MARKET_ID = "SportMarketId";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_ID)
  private Integer sportMarketId;

  public static final String SERIALIZED_NAME_TIMELINE = "Timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private Integer timeline;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public ResetConfigTemplateMarketMarginRequest() {
  }

  public ResetConfigTemplateMarketMarginRequest templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public ResetConfigTemplateMarketMarginRequest sportMarketId(Integer sportMarketId) {
    this.sportMarketId = sportMarketId;
    return this;
  }

   /**
   * Get sportMarketId
   * @return sportMarketId
  **/
  @javax.annotation.Nullable
  public Integer getSportMarketId() {
    return sportMarketId;
  }

  public void setSportMarketId(Integer sportMarketId) {
    this.sportMarketId = sportMarketId;
  }


  public ResetConfigTemplateMarketMarginRequest timeline(Integer timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  public Integer getTimeline() {
    return timeline;
  }

  public void setTimeline(Integer timeline) {
    this.timeline = timeline;
  }


  public ResetConfigTemplateMarketMarginRequest configId(Integer configId) {
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
    ResetConfigTemplateMarketMarginRequest resetConfigTemplateMarketMarginRequest = (ResetConfigTemplateMarketMarginRequest) o;
    return Objects.equals(this.templateId, resetConfigTemplateMarketMarginRequest.templateId) &&
        Objects.equals(this.sportMarketId, resetConfigTemplateMarketMarginRequest.sportMarketId) &&
        Objects.equals(this.timeline, resetConfigTemplateMarketMarginRequest.timeline) &&
        Objects.equals(this.configId, resetConfigTemplateMarketMarginRequest.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, sportMarketId, timeline, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetConfigTemplateMarketMarginRequest {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    sportMarketId: ").append(toIndentedString(sportMarketId)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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
    openapiFields.add("TemplateId");
    openapiFields.add("SportMarketId");
    openapiFields.add("Timeline");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResetConfigTemplateMarketMarginRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResetConfigTemplateMarketMarginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResetConfigTemplateMarketMarginRequest is not found in the empty JSON string", ResetConfigTemplateMarketMarginRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResetConfigTemplateMarketMarginRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResetConfigTemplateMarketMarginRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResetConfigTemplateMarketMarginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResetConfigTemplateMarketMarginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResetConfigTemplateMarketMarginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResetConfigTemplateMarketMarginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ResetConfigTemplateMarketMarginRequest>() {
           @Override
           public void write(JsonWriter out, ResetConfigTemplateMarketMarginRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResetConfigTemplateMarketMarginRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResetConfigTemplateMarketMarginRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResetConfigTemplateMarketMarginRequest
  * @throws IOException if the JSON string is invalid with respect to ResetConfigTemplateMarketMarginRequest
  */
  public static ResetConfigTemplateMarketMarginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResetConfigTemplateMarketMarginRequest.class);
  }

 /**
  * Convert an instance of ResetConfigTemplateMarketMarginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

