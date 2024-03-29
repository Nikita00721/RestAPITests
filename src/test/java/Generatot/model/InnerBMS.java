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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * InnerBMS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class InnerBMS {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_MARKET_ID = "MarketId";
  @SerializedName(SERIALIZED_NAME_MARKET_ID)
  private Long marketId;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public static final String SERIALIZED_NAME_INT_CHAMP_ID = "IntChampId";
  @SerializedName(SERIALIZED_NAME_INT_CHAMP_ID)
  private Long intChampId;

  public InnerBMS() {
  }

  public InnerBMS id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public InnerBMS marketId(Long marketId) {
    this.marketId = marketId;
    return this;
  }

   /**
   * Get marketId
   * @return marketId
  **/
  @javax.annotation.Nonnull
  public Long getMarketId() {
    return marketId;
  }

  public void setMarketId(Long marketId) {
    this.marketId = marketId;
  }


  public InnerBMS marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nonnull
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }


  public InnerBMS intEventId(Long intEventId) {
    this.intEventId = intEventId;
    return this;
  }

   /**
   * Get intEventId
   * @return intEventId
  **/
  @javax.annotation.Nonnull
  public Long getIntEventId() {
    return intEventId;
  }

  public void setIntEventId(Long intEventId) {
    this.intEventId = intEventId;
  }


  public InnerBMS intChampId(Long intChampId) {
    this.intChampId = intChampId;
    return this;
  }

   /**
   * Get intChampId
   * @return intChampId
  **/
  @javax.annotation.Nonnull
  public Long getIntChampId() {
    return intChampId;
  }

  public void setIntChampId(Long intChampId) {
    this.intChampId = intChampId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerBMS innerBMS = (InnerBMS) o;
    return Objects.equals(this.id, innerBMS.id) &&
        Objects.equals(this.marketId, innerBMS.marketId) &&
        Objects.equals(this.marketTypeId, innerBMS.marketTypeId) &&
        Objects.equals(this.intEventId, innerBMS.intEventId) &&
        Objects.equals(this.intChampId, innerBMS.intChampId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, marketId, marketTypeId, intEventId, intChampId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerBMS {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
    sb.append("    intChampId: ").append(toIndentedString(intChampId)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("MarketId");
    openapiFields.add("MarketTypeId");
    openapiFields.add("IntEventId");
    openapiFields.add("IntChampId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("MarketId");
    openapiRequiredFields.add("MarketTypeId");
    openapiRequiredFields.add("IntEventId");
    openapiRequiredFields.add("IntChampId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InnerBMS
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InnerBMS.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InnerBMS is not found in the empty JSON string", InnerBMS.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InnerBMS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InnerBMS` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InnerBMS.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InnerBMS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InnerBMS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InnerBMS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InnerBMS.class));

       return (TypeAdapter<T>) new TypeAdapter<InnerBMS>() {
           @Override
           public void write(JsonWriter out, InnerBMS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InnerBMS read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InnerBMS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InnerBMS
  * @throws IOException if the JSON string is invalid with respect to InnerBMS
  */
  public static InnerBMS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InnerBMS.class);
  }

 /**
  * Convert an instance of InnerBMS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

