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
 * CreateCountrySportSettingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CreateCountrySportSettingRequest {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_MIN_SELECTIONS_NUMBER = "MinSelectionsNumber";
  @SerializedName(SERIALIZED_NAME_MIN_SELECTIONS_NUMBER)
  private Integer minSelectionsNumber;

  public static final String SERIALIZED_NAME_COUNTRY_CONFIG_ID = "CountryConfigId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CONFIG_ID)
  private Integer countryConfigId;

  public CreateCountrySportSettingRequest() {
  }

  public CreateCountrySportSettingRequest sportId(Integer sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nullable
  public Integer getSportId() {
    return sportId;
  }

  public void setSportId(Integer sportId) {
    this.sportId = sportId;
  }


  public CreateCountrySportSettingRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CreateCountrySportSettingRequest minSelectionsNumber(Integer minSelectionsNumber) {
    this.minSelectionsNumber = minSelectionsNumber;
    return this;
  }

   /**
   * Get minSelectionsNumber
   * @return minSelectionsNumber
  **/
  @javax.annotation.Nullable
  public Integer getMinSelectionsNumber() {
    return minSelectionsNumber;
  }

  public void setMinSelectionsNumber(Integer minSelectionsNumber) {
    this.minSelectionsNumber = minSelectionsNumber;
  }


  public CreateCountrySportSettingRequest countryConfigId(Integer countryConfigId) {
    this.countryConfigId = countryConfigId;
    return this;
  }

   /**
   * Get countryConfigId
   * @return countryConfigId
  **/
  @javax.annotation.Nullable
  public Integer getCountryConfigId() {
    return countryConfigId;
  }

  public void setCountryConfigId(Integer countryConfigId) {
    this.countryConfigId = countryConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCountrySportSettingRequest createCountrySportSettingRequest = (CreateCountrySportSettingRequest) o;
    return Objects.equals(this.sportId, createCountrySportSettingRequest.sportId) &&
        Objects.equals(this.countryCode, createCountrySportSettingRequest.countryCode) &&
        Objects.equals(this.minSelectionsNumber, createCountrySportSettingRequest.minSelectionsNumber) &&
        Objects.equals(this.countryConfigId, createCountrySportSettingRequest.countryConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, countryCode, minSelectionsNumber, countryConfigId);
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
    sb.append("class CreateCountrySportSettingRequest {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    minSelectionsNumber: ").append(toIndentedString(minSelectionsNumber)).append("\n");
    sb.append("    countryConfigId: ").append(toIndentedString(countryConfigId)).append("\n");
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
    openapiFields.add("SportId");
    openapiFields.add("CountryCode");
    openapiFields.add("MinSelectionsNumber");
    openapiFields.add("CountryConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCountrySportSettingRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCountrySportSettingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCountrySportSettingRequest is not found in the empty JSON string", CreateCountrySportSettingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCountrySportSettingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCountrySportSettingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCountrySportSettingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCountrySportSettingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCountrySportSettingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCountrySportSettingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCountrySportSettingRequest>() {
           @Override
           public void write(JsonWriter out, CreateCountrySportSettingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCountrySportSettingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCountrySportSettingRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCountrySportSettingRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCountrySportSettingRequest
  */
  public static CreateCountrySportSettingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCountrySportSettingRequest.class);
  }

 /**
  * Convert an instance of CreateCountrySportSettingRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
