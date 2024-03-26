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
 * OverrideSelectionCustomDescriptionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class OverrideSelectionCustomDescriptionsRequest {
  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_SELECTION_TYPE_ID = "SelectionTypeId";
  @SerializedName(SERIALIZED_NAME_SELECTION_TYPE_ID)
  private Integer selectionTypeId;

  public static final String SERIALIZED_NAME_CUSTOM_DESCRIPTION = "CustomDescription";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DESCRIPTION)
  private String customDescription;

  public static final String SERIALIZED_NAME_LANGUAGE_IDS = "LanguageIds";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_IDS)
  private List<Integer> languageIds;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public OverrideSelectionCustomDescriptionsRequest() {
  }

  public OverrideSelectionCustomDescriptionsRequest sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }


  public OverrideSelectionCustomDescriptionsRequest marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public OverrideSelectionCustomDescriptionsRequest selectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
    return this;
  }

   /**
   * Get selectionTypeId
   * @return selectionTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSelectionTypeId() {
    return selectionTypeId;
  }

  public void setSelectionTypeId(Integer selectionTypeId) {
    this.selectionTypeId = selectionTypeId;
  }


  public OverrideSelectionCustomDescriptionsRequest customDescription(String customDescription) {
    this.customDescription = customDescription;
    return this;
  }

   /**
   * Get customDescription
   * @return customDescription
  **/
  @javax.annotation.Nullable
  public String getCustomDescription() {
    return customDescription;
  }

  public void setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
  }


  public OverrideSelectionCustomDescriptionsRequest languageIds(List<Integer> languageIds) {
    this.languageIds = languageIds;
    return this;
  }

  public OverrideSelectionCustomDescriptionsRequest addLanguageIdsItem(Integer languageIdsItem) {
    if (this.languageIds == null) {
      this.languageIds = new ArrayList<>();
    }
    this.languageIds.add(languageIdsItem);
    return this;
  }

   /**
   * Get languageIds
   * @return languageIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getLanguageIds() {
    return languageIds;
  }

  public void setLanguageIds(List<Integer> languageIds) {
    this.languageIds = languageIds;
  }


  public OverrideSelectionCustomDescriptionsRequest configId(Integer configId) {
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
    OverrideSelectionCustomDescriptionsRequest overrideSelectionCustomDescriptionsRequest = (OverrideSelectionCustomDescriptionsRequest) o;
    return Objects.equals(this.sportTypeId, overrideSelectionCustomDescriptionsRequest.sportTypeId) &&
        Objects.equals(this.marketTypeId, overrideSelectionCustomDescriptionsRequest.marketTypeId) &&
        Objects.equals(this.selectionTypeId, overrideSelectionCustomDescriptionsRequest.selectionTypeId) &&
        Objects.equals(this.customDescription, overrideSelectionCustomDescriptionsRequest.customDescription) &&
        Objects.equals(this.languageIds, overrideSelectionCustomDescriptionsRequest.languageIds) &&
        Objects.equals(this.configId, overrideSelectionCustomDescriptionsRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportTypeId, marketTypeId, selectionTypeId, customDescription, languageIds, configId);
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
    sb.append("class OverrideSelectionCustomDescriptionsRequest {\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    selectionTypeId: ").append(toIndentedString(selectionTypeId)).append("\n");
    sb.append("    customDescription: ").append(toIndentedString(customDescription)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
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
    openapiFields.add("SportTypeId");
    openapiFields.add("MarketTypeId");
    openapiFields.add("SelectionTypeId");
    openapiFields.add("CustomDescription");
    openapiFields.add("LanguageIds");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OverrideSelectionCustomDescriptionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OverrideSelectionCustomDescriptionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverrideSelectionCustomDescriptionsRequest is not found in the empty JSON string", OverrideSelectionCustomDescriptionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OverrideSelectionCustomDescriptionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OverrideSelectionCustomDescriptionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CustomDescription") != null && !jsonObj.get("CustomDescription").isJsonNull()) && !jsonObj.get("CustomDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomDescription").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("LanguageIds") != null && !jsonObj.get("LanguageIds").isJsonNull() && !jsonObj.get("LanguageIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LanguageIds` to be an array in the JSON string but got `%s`", jsonObj.get("LanguageIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverrideSelectionCustomDescriptionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverrideSelectionCustomDescriptionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverrideSelectionCustomDescriptionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverrideSelectionCustomDescriptionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OverrideSelectionCustomDescriptionsRequest>() {
           @Override
           public void write(JsonWriter out, OverrideSelectionCustomDescriptionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OverrideSelectionCustomDescriptionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OverrideSelectionCustomDescriptionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverrideSelectionCustomDescriptionsRequest
  * @throws IOException if the JSON string is invalid with respect to OverrideSelectionCustomDescriptionsRequest
  */
  public static OverrideSelectionCustomDescriptionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverrideSelectionCustomDescriptionsRequest.class);
  }

 /**
  * Convert an instance of OverrideSelectionCustomDescriptionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
