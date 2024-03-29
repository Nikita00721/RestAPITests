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
 * UpdateMarketSelectionsInfoRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateMarketSelectionsInfoRequest {
  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public static final String SERIALIZED_NAME_DESKTOP_COUNT = "DesktopCount";
  @SerializedName(SERIALIZED_NAME_DESKTOP_COUNT)
  private Integer desktopCount;

  public static final String SERIALIZED_NAME_SHORT_DESKTOP_COUNT = "ShortDesktopCount";
  @SerializedName(SERIALIZED_NAME_SHORT_DESKTOP_COUNT)
  private Integer shortDesktopCount;

  public static final String SERIALIZED_NAME_MOBILE_COUNT = "MobileCount";
  @SerializedName(SERIALIZED_NAME_MOBILE_COUNT)
  private Integer mobileCount;

  public static final String SERIALIZED_NAME_SHORT_MOBILE_COUNT = "ShortMobileCount";
  @SerializedName(SERIALIZED_NAME_SHORT_MOBILE_COUNT)
  private Integer shortMobileCount;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public UpdateMarketSelectionsInfoRequest() {
  }

  public UpdateMarketSelectionsInfoRequest marketTypeId(Integer marketTypeId) {
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


  public UpdateMarketSelectionsInfoRequest desktopCount(Integer desktopCount) {
    this.desktopCount = desktopCount;
    return this;
  }

   /**
   * Get desktopCount
   * @return desktopCount
  **/
  @javax.annotation.Nullable
  public Integer getDesktopCount() {
    return desktopCount;
  }

  public void setDesktopCount(Integer desktopCount) {
    this.desktopCount = desktopCount;
  }


  public UpdateMarketSelectionsInfoRequest shortDesktopCount(Integer shortDesktopCount) {
    this.shortDesktopCount = shortDesktopCount;
    return this;
  }

   /**
   * Get shortDesktopCount
   * @return shortDesktopCount
  **/
  @javax.annotation.Nullable
  public Integer getShortDesktopCount() {
    return shortDesktopCount;
  }

  public void setShortDesktopCount(Integer shortDesktopCount) {
    this.shortDesktopCount = shortDesktopCount;
  }


  public UpdateMarketSelectionsInfoRequest mobileCount(Integer mobileCount) {
    this.mobileCount = mobileCount;
    return this;
  }

   /**
   * Get mobileCount
   * @return mobileCount
  **/
  @javax.annotation.Nullable
  public Integer getMobileCount() {
    return mobileCount;
  }

  public void setMobileCount(Integer mobileCount) {
    this.mobileCount = mobileCount;
  }


  public UpdateMarketSelectionsInfoRequest shortMobileCount(Integer shortMobileCount) {
    this.shortMobileCount = shortMobileCount;
    return this;
  }

   /**
   * Get shortMobileCount
   * @return shortMobileCount
  **/
  @javax.annotation.Nullable
  public Integer getShortMobileCount() {
    return shortMobileCount;
  }

  public void setShortMobileCount(Integer shortMobileCount) {
    this.shortMobileCount = shortMobileCount;
  }


  public UpdateMarketSelectionsInfoRequest configId(Integer configId) {
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
    UpdateMarketSelectionsInfoRequest updateMarketSelectionsInfoRequest = (UpdateMarketSelectionsInfoRequest) o;
    return Objects.equals(this.marketTypeId, updateMarketSelectionsInfoRequest.marketTypeId) &&
        Objects.equals(this.desktopCount, updateMarketSelectionsInfoRequest.desktopCount) &&
        Objects.equals(this.shortDesktopCount, updateMarketSelectionsInfoRequest.shortDesktopCount) &&
        Objects.equals(this.mobileCount, updateMarketSelectionsInfoRequest.mobileCount) &&
        Objects.equals(this.shortMobileCount, updateMarketSelectionsInfoRequest.shortMobileCount) &&
        Objects.equals(this.configId, updateMarketSelectionsInfoRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketTypeId, desktopCount, shortDesktopCount, mobileCount, shortMobileCount, configId);
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
    sb.append("class UpdateMarketSelectionsInfoRequest {\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
    sb.append("    desktopCount: ").append(toIndentedString(desktopCount)).append("\n");
    sb.append("    shortDesktopCount: ").append(toIndentedString(shortDesktopCount)).append("\n");
    sb.append("    mobileCount: ").append(toIndentedString(mobileCount)).append("\n");
    sb.append("    shortMobileCount: ").append(toIndentedString(shortMobileCount)).append("\n");
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
    openapiFields.add("MarketTypeId");
    openapiFields.add("DesktopCount");
    openapiFields.add("ShortDesktopCount");
    openapiFields.add("MobileCount");
    openapiFields.add("ShortMobileCount");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateMarketSelectionsInfoRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateMarketSelectionsInfoRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMarketSelectionsInfoRequest is not found in the empty JSON string", UpdateMarketSelectionsInfoRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateMarketSelectionsInfoRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMarketSelectionsInfoRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMarketSelectionsInfoRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMarketSelectionsInfoRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMarketSelectionsInfoRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMarketSelectionsInfoRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMarketSelectionsInfoRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMarketSelectionsInfoRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMarketSelectionsInfoRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateMarketSelectionsInfoRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateMarketSelectionsInfoRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateMarketSelectionsInfoRequest
  */
  public static UpdateMarketSelectionsInfoRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMarketSelectionsInfoRequest.class);
  }

 /**
  * Convert an instance of UpdateMarketSelectionsInfoRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

