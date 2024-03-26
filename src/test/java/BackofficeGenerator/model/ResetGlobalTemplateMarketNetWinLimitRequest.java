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
 * ResetGlobalTemplateMarketNetWinLimitRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ResetGlobalTemplateMarketNetWinLimitRequest {
  public static final String SERIALIZED_NAME_SPORT_MARKET_ID = "SportMarketId";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_ID)
  private Integer sportMarketId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public ResetGlobalTemplateMarketNetWinLimitRequest() {
  }

  public ResetGlobalTemplateMarketNetWinLimitRequest sportMarketId(Integer sportMarketId) {
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


  public ResetGlobalTemplateMarketNetWinLimitRequest templateId(Integer templateId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetGlobalTemplateMarketNetWinLimitRequest resetGlobalTemplateMarketNetWinLimitRequest = (ResetGlobalTemplateMarketNetWinLimitRequest) o;
    return Objects.equals(this.sportMarketId, resetGlobalTemplateMarketNetWinLimitRequest.sportMarketId) &&
        Objects.equals(this.templateId, resetGlobalTemplateMarketNetWinLimitRequest.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportMarketId, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetGlobalTemplateMarketNetWinLimitRequest {\n");
    sb.append("    sportMarketId: ").append(toIndentedString(sportMarketId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("SportMarketId");
    openapiFields.add("TemplateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResetGlobalTemplateMarketNetWinLimitRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResetGlobalTemplateMarketNetWinLimitRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResetGlobalTemplateMarketNetWinLimitRequest is not found in the empty JSON string", ResetGlobalTemplateMarketNetWinLimitRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResetGlobalTemplateMarketNetWinLimitRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResetGlobalTemplateMarketNetWinLimitRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResetGlobalTemplateMarketNetWinLimitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResetGlobalTemplateMarketNetWinLimitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResetGlobalTemplateMarketNetWinLimitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResetGlobalTemplateMarketNetWinLimitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ResetGlobalTemplateMarketNetWinLimitRequest>() {
           @Override
           public void write(JsonWriter out, ResetGlobalTemplateMarketNetWinLimitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResetGlobalTemplateMarketNetWinLimitRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResetGlobalTemplateMarketNetWinLimitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResetGlobalTemplateMarketNetWinLimitRequest
  * @throws IOException if the JSON string is invalid with respect to ResetGlobalTemplateMarketNetWinLimitRequest
  */
  public static ResetGlobalTemplateMarketNetWinLimitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResetGlobalTemplateMarketNetWinLimitRequest.class);
  }

 /**
  * Convert an instance of ResetGlobalTemplateMarketNetWinLimitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
