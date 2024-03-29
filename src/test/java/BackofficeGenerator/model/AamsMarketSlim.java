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
 * AamsMarketSlim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AamsMarketSlim {
  public static final String SERIALIZED_NAME_SPORT_MARKET_NAME = "SportMarketName";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_NAME)
  private String sportMarketName;

  public static final String SERIALIZED_NAME_EXT_MARKET_ID = "ExtMarketId";
  @SerializedName(SERIALIZED_NAME_EXT_MARKET_ID)
  private Integer extMarketId;

  public static final String SERIALIZED_NAME_MAPPING_TYPE = "MappingType";
  @SerializedName(SERIALIZED_NAME_MAPPING_TYPE)
  private Integer mappingType;

  public static final String SERIALIZED_NAME_SPORT_MARKET_ID = "SportMarketId";
  @SerializedName(SERIALIZED_NAME_SPORT_MARKET_ID)
  private Integer sportMarketId;

  public AamsMarketSlim() {
  }

  public AamsMarketSlim sportMarketName(String sportMarketName) {
    this.sportMarketName = sportMarketName;
    return this;
  }

   /**
   * Get sportMarketName
   * @return sportMarketName
  **/
  @javax.annotation.Nullable
  public String getSportMarketName() {
    return sportMarketName;
  }

  public void setSportMarketName(String sportMarketName) {
    this.sportMarketName = sportMarketName;
  }


  public AamsMarketSlim extMarketId(Integer extMarketId) {
    this.extMarketId = extMarketId;
    return this;
  }

   /**
   * Get extMarketId
   * @return extMarketId
  **/
  @javax.annotation.Nullable
  public Integer getExtMarketId() {
    return extMarketId;
  }

  public void setExtMarketId(Integer extMarketId) {
    this.extMarketId = extMarketId;
  }


  public AamsMarketSlim mappingType(Integer mappingType) {
    this.mappingType = mappingType;
    return this;
  }

   /**
   * Get mappingType
   * @return mappingType
  **/
  @javax.annotation.Nullable
  public Integer getMappingType() {
    return mappingType;
  }

  public void setMappingType(Integer mappingType) {
    this.mappingType = mappingType;
  }


  public AamsMarketSlim sportMarketId(Integer sportMarketId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AamsMarketSlim aamsMarketSlim = (AamsMarketSlim) o;
    return Objects.equals(this.sportMarketName, aamsMarketSlim.sportMarketName) &&
        Objects.equals(this.extMarketId, aamsMarketSlim.extMarketId) &&
        Objects.equals(this.mappingType, aamsMarketSlim.mappingType) &&
        Objects.equals(this.sportMarketId, aamsMarketSlim.sportMarketId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportMarketName, extMarketId, mappingType, sportMarketId);
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
    sb.append("class AamsMarketSlim {\n");
    sb.append("    sportMarketName: ").append(toIndentedString(sportMarketName)).append("\n");
    sb.append("    extMarketId: ").append(toIndentedString(extMarketId)).append("\n");
    sb.append("    mappingType: ").append(toIndentedString(mappingType)).append("\n");
    sb.append("    sportMarketId: ").append(toIndentedString(sportMarketId)).append("\n");
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
    openapiFields.add("SportMarketName");
    openapiFields.add("ExtMarketId");
    openapiFields.add("MappingType");
    openapiFields.add("SportMarketId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AamsMarketSlim
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AamsMarketSlim.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AamsMarketSlim is not found in the empty JSON string", AamsMarketSlim.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AamsMarketSlim.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AamsMarketSlim` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SportMarketName") != null && !jsonObj.get("SportMarketName").isJsonNull()) && !jsonObj.get("SportMarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportMarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportMarketName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AamsMarketSlim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AamsMarketSlim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AamsMarketSlim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AamsMarketSlim.class));

       return (TypeAdapter<T>) new TypeAdapter<AamsMarketSlim>() {
           @Override
           public void write(JsonWriter out, AamsMarketSlim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AamsMarketSlim read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AamsMarketSlim given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AamsMarketSlim
  * @throws IOException if the JSON string is invalid with respect to AamsMarketSlim
  */
  public static AamsMarketSlim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AamsMarketSlim.class);
  }

 /**
  * Convert an instance of AamsMarketSlim to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

