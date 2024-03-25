/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * TotoCampaignGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class TotoCampaignGroup {
  public static final String SERIALIZED_NAME_TYPE_ID = "TypeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private TotoType typeId;

  public static final String SERIALIZED_NAME_CAMPAIGNS = "Campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<TotoCampaign> campaigns = new ArrayList<>();

  public TotoCampaignGroup() {
  }

  public TotoCampaignGroup typeId(TotoType typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  public TotoType getTypeId() {
    return typeId;
  }

  public void setTypeId(TotoType typeId) {
    this.typeId = typeId;
  }


  public TotoCampaignGroup campaigns(List<TotoCampaign> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public TotoCampaignGroup addCampaignsItem(TotoCampaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @javax.annotation.Nonnull
  public List<TotoCampaign> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<TotoCampaign> campaigns) {
    this.campaigns = campaigns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotoCampaignGroup totoCampaignGroup = (TotoCampaignGroup) o;
    return Objects.equals(this.typeId, totoCampaignGroup.typeId) &&
        Objects.equals(this.campaigns, totoCampaignGroup.campaigns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, campaigns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotoCampaignGroup {\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
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
    openapiFields.add("TypeId");
    openapiFields.add("Campaigns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TypeId");
    openapiRequiredFields.add("Campaigns");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotoCampaignGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoCampaignGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoCampaignGroup is not found in the empty JSON string", TotoCampaignGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoCampaignGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoCampaignGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotoCampaignGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `TypeId`
      TotoType.validateJsonElement(jsonObj.get("TypeId"));
      // ensure the json data is an array
      if (!jsonObj.get("Campaigns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Campaigns` to be an array in the JSON string but got `%s`", jsonObj.get("Campaigns").toString()));
      }

      JsonArray jsonArraycampaigns = jsonObj.getAsJsonArray("Campaigns");
      // validate the required field `Campaigns` (array)
      for (int i = 0; i < jsonArraycampaigns.size(); i++) {
        TotoCampaign.validateJsonElement(jsonArraycampaigns.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoCampaignGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoCampaignGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoCampaignGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoCampaignGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoCampaignGroup>() {
           @Override
           public void write(JsonWriter out, TotoCampaignGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoCampaignGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoCampaignGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoCampaignGroup
  * @throws IOException if the JSON string is invalid with respect to TotoCampaignGroup
  */
  public static TotoCampaignGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoCampaignGroup.class);
  }

 /**
  * Convert an instance of TotoCampaignGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
