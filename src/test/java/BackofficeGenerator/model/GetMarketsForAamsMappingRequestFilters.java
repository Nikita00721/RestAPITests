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
 * GetMarketsForAamsMappingRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetMarketsForAamsMappingRequestFilters {
  public static final String SERIALIZED_NAME_INTERNAL_MARKET_ID = "InternalMarketId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_MARKET_ID)
  private Integer internalMarketId;

  public static final String SERIALIZED_NAME_INTERNAL_MARKET_NAME = "InternalMarketName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_MARKET_NAME)
  private String internalMarketName;

  public static final String SERIALIZED_NAME_AAMS_MARKET_ID = "AamsMarketId";
  @SerializedName(SERIALIZED_NAME_AAMS_MARKET_ID)
  private Integer aamsMarketId;

  public static final String SERIALIZED_NAME_AAMS_MARKET_NAME = "AamsMarketName";
  @SerializedName(SERIALIZED_NAME_AAMS_MARKET_NAME)
  private String aamsMarketName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MappingStatus status;

  public static final String SERIALIZED_NAME_INTERNAL_SPORT_ID = "InternalSportId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_SPORT_ID)
  private Integer internalSportId;

  public GetMarketsForAamsMappingRequestFilters() {
  }

  public GetMarketsForAamsMappingRequestFilters internalMarketId(Integer internalMarketId) {
    this.internalMarketId = internalMarketId;
    return this;
  }

   /**
   * Get internalMarketId
   * @return internalMarketId
  **/
  @javax.annotation.Nullable
  public Integer getInternalMarketId() {
    return internalMarketId;
  }

  public void setInternalMarketId(Integer internalMarketId) {
    this.internalMarketId = internalMarketId;
  }


  public GetMarketsForAamsMappingRequestFilters internalMarketName(String internalMarketName) {
    this.internalMarketName = internalMarketName;
    return this;
  }

   /**
   * Get internalMarketName
   * @return internalMarketName
  **/
  @javax.annotation.Nullable
  public String getInternalMarketName() {
    return internalMarketName;
  }

  public void setInternalMarketName(String internalMarketName) {
    this.internalMarketName = internalMarketName;
  }


  public GetMarketsForAamsMappingRequestFilters aamsMarketId(Integer aamsMarketId) {
    this.aamsMarketId = aamsMarketId;
    return this;
  }

   /**
   * Get aamsMarketId
   * @return aamsMarketId
  **/
  @javax.annotation.Nullable
  public Integer getAamsMarketId() {
    return aamsMarketId;
  }

  public void setAamsMarketId(Integer aamsMarketId) {
    this.aamsMarketId = aamsMarketId;
  }


  public GetMarketsForAamsMappingRequestFilters aamsMarketName(String aamsMarketName) {
    this.aamsMarketName = aamsMarketName;
    return this;
  }

   /**
   * Get aamsMarketName
   * @return aamsMarketName
  **/
  @javax.annotation.Nullable
  public String getAamsMarketName() {
    return aamsMarketName;
  }

  public void setAamsMarketName(String aamsMarketName) {
    this.aamsMarketName = aamsMarketName;
  }


  public GetMarketsForAamsMappingRequestFilters status(MappingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public MappingStatus getStatus() {
    return status;
  }

  public void setStatus(MappingStatus status) {
    this.status = status;
  }


  public GetMarketsForAamsMappingRequestFilters internalSportId(Integer internalSportId) {
    this.internalSportId = internalSportId;
    return this;
  }

   /**
   * Get internalSportId
   * @return internalSportId
  **/
  @javax.annotation.Nullable
  public Integer getInternalSportId() {
    return internalSportId;
  }

  public void setInternalSportId(Integer internalSportId) {
    this.internalSportId = internalSportId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketsForAamsMappingRequestFilters getMarketsForAamsMappingRequestFilters = (GetMarketsForAamsMappingRequestFilters) o;
    return Objects.equals(this.internalMarketId, getMarketsForAamsMappingRequestFilters.internalMarketId) &&
        Objects.equals(this.internalMarketName, getMarketsForAamsMappingRequestFilters.internalMarketName) &&
        Objects.equals(this.aamsMarketId, getMarketsForAamsMappingRequestFilters.aamsMarketId) &&
        Objects.equals(this.aamsMarketName, getMarketsForAamsMappingRequestFilters.aamsMarketName) &&
        Objects.equals(this.status, getMarketsForAamsMappingRequestFilters.status) &&
        Objects.equals(this.internalSportId, getMarketsForAamsMappingRequestFilters.internalSportId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalMarketId, internalMarketName, aamsMarketId, aamsMarketName, status, internalSportId);
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
    sb.append("class GetMarketsForAamsMappingRequestFilters {\n");
    sb.append("    internalMarketId: ").append(toIndentedString(internalMarketId)).append("\n");
    sb.append("    internalMarketName: ").append(toIndentedString(internalMarketName)).append("\n");
    sb.append("    aamsMarketId: ").append(toIndentedString(aamsMarketId)).append("\n");
    sb.append("    aamsMarketName: ").append(toIndentedString(aamsMarketName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    internalSportId: ").append(toIndentedString(internalSportId)).append("\n");
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
    openapiFields.add("InternalMarketId");
    openapiFields.add("InternalMarketName");
    openapiFields.add("AamsMarketId");
    openapiFields.add("AamsMarketName");
    openapiFields.add("Status");
    openapiFields.add("InternalSportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetMarketsForAamsMappingRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMarketsForAamsMappingRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMarketsForAamsMappingRequestFilters is not found in the empty JSON string", GetMarketsForAamsMappingRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMarketsForAamsMappingRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMarketsForAamsMappingRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("InternalMarketName") != null && !jsonObj.get("InternalMarketName").isJsonNull()) && !jsonObj.get("InternalMarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalMarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalMarketName").toString()));
      }
      if ((jsonObj.get("AamsMarketName") != null && !jsonObj.get("AamsMarketName").isJsonNull()) && !jsonObj.get("AamsMarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AamsMarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AamsMarketName").toString()));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        MappingStatus.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMarketsForAamsMappingRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMarketsForAamsMappingRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMarketsForAamsMappingRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMarketsForAamsMappingRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMarketsForAamsMappingRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetMarketsForAamsMappingRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMarketsForAamsMappingRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMarketsForAamsMappingRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMarketsForAamsMappingRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetMarketsForAamsMappingRequestFilters
  */
  public static GetMarketsForAamsMappingRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMarketsForAamsMappingRequestFilters.class);
  }

 /**
  * Convert an instance of GetMarketsForAamsMappingRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

