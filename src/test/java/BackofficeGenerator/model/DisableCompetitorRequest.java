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
 * DisableCompetitorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class DisableCompetitorRequest {
  public static final String SERIALIZED_NAME_COMPETITOR_ID = "CompetitorId";
  @SerializedName(SERIALIZED_NAME_COMPETITOR_ID)
  private Integer competitorId;

  public static final String SERIALIZED_NAME_IS_DISABLE = "IsDisable";
  @SerializedName(SERIALIZED_NAME_IS_DISABLE)
  private Boolean isDisable;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public DisableCompetitorRequest() {
  }

  public DisableCompetitorRequest competitorId(Integer competitorId) {
    this.competitorId = competitorId;
    return this;
  }

   /**
   * Get competitorId
   * @return competitorId
  **/
  @javax.annotation.Nullable
  public Integer getCompetitorId() {
    return competitorId;
  }

  public void setCompetitorId(Integer competitorId) {
    this.competitorId = competitorId;
  }


  public DisableCompetitorRequest isDisable(Boolean isDisable) {
    this.isDisable = isDisable;
    return this;
  }

   /**
   * Get isDisable
   * @return isDisable
  **/
  @javax.annotation.Nullable
  public Boolean getIsDisable() {
    return isDisable;
  }

  public void setIsDisable(Boolean isDisable) {
    this.isDisable = isDisable;
  }


  public DisableCompetitorRequest configId(Integer configId) {
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
    DisableCompetitorRequest disableCompetitorRequest = (DisableCompetitorRequest) o;
    return Objects.equals(this.competitorId, disableCompetitorRequest.competitorId) &&
        Objects.equals(this.isDisable, disableCompetitorRequest.isDisable) &&
        Objects.equals(this.configId, disableCompetitorRequest.configId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitorId, isDisable, configId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisableCompetitorRequest {\n");
    sb.append("    competitorId: ").append(toIndentedString(competitorId)).append("\n");
    sb.append("    isDisable: ").append(toIndentedString(isDisable)).append("\n");
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
    openapiFields.add("CompetitorId");
    openapiFields.add("IsDisable");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DisableCompetitorRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DisableCompetitorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisableCompetitorRequest is not found in the empty JSON string", DisableCompetitorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DisableCompetitorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DisableCompetitorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisableCompetitorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisableCompetitorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisableCompetitorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisableCompetitorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DisableCompetitorRequest>() {
           @Override
           public void write(JsonWriter out, DisableCompetitorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisableCompetitorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DisableCompetitorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisableCompetitorRequest
  * @throws IOException if the JSON string is invalid with respect to DisableCompetitorRequest
  */
  public static DisableCompetitorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisableCompetitorRequest.class);
  }

 /**
  * Convert an instance of DisableCompetitorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

