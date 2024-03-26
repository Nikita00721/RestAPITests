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
 * GetAamsSportCategoriesRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetAamsSportCategoriesRequestFilters {
  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public static final String SERIALIZED_NAME_EXT_SPORT_ID = "ExtSportId";
  @SerializedName(SERIALIZED_NAME_EXT_SPORT_ID)
  private Integer extSportId;

  public GetAamsSportCategoriesRequestFilters() {
  }

  public GetAamsSportCategoriesRequestFilters operatorId(Integer operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @javax.annotation.Nullable
  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }


  public GetAamsSportCategoriesRequestFilters extSportId(Integer extSportId) {
    this.extSportId = extSportId;
    return this;
  }

   /**
   * Get extSportId
   * @return extSportId
  **/
  @javax.annotation.Nullable
  public Integer getExtSportId() {
    return extSportId;
  }

  public void setExtSportId(Integer extSportId) {
    this.extSportId = extSportId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAamsSportCategoriesRequestFilters getAamsSportCategoriesRequestFilters = (GetAamsSportCategoriesRequestFilters) o;
    return Objects.equals(this.operatorId, getAamsSportCategoriesRequestFilters.operatorId) &&
        Objects.equals(this.extSportId, getAamsSportCategoriesRequestFilters.extSportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorId, extSportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAamsSportCategoriesRequestFilters {\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    extSportId: ").append(toIndentedString(extSportId)).append("\n");
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
    openapiFields.add("OperatorId");
    openapiFields.add("ExtSportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAamsSportCategoriesRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAamsSportCategoriesRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAamsSportCategoriesRequestFilters is not found in the empty JSON string", GetAamsSportCategoriesRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAamsSportCategoriesRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAamsSportCategoriesRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAamsSportCategoriesRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAamsSportCategoriesRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAamsSportCategoriesRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAamsSportCategoriesRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAamsSportCategoriesRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetAamsSportCategoriesRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAamsSportCategoriesRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAamsSportCategoriesRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAamsSportCategoriesRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetAamsSportCategoriesRequestFilters
  */
  public static GetAamsSportCategoriesRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAamsSportCategoriesRequestFilters.class);
  }

 /**
  * Convert an instance of GetAamsSportCategoriesRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

