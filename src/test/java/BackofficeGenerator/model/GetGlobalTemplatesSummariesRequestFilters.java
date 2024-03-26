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
 * GetGlobalTemplatesSummariesRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetGlobalTemplatesSummariesRequestFilters {
  public static final String SERIALIZED_NAME_ACTIVE_ONLY = "ActiveOnly";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ONLY)
  private Boolean activeOnly;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public GetGlobalTemplatesSummariesRequestFilters() {
  }

  public GetGlobalTemplatesSummariesRequestFilters activeOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
    return this;
  }

   /**
   * Get activeOnly
   * @return activeOnly
  **/
  @javax.annotation.Nullable
  public Boolean getActiveOnly() {
    return activeOnly;
  }

  public void setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
  }


  public GetGlobalTemplatesSummariesRequestFilters sportId(Integer sportId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGlobalTemplatesSummariesRequestFilters getGlobalTemplatesSummariesRequestFilters = (GetGlobalTemplatesSummariesRequestFilters) o;
    return Objects.equals(this.activeOnly, getGlobalTemplatesSummariesRequestFilters.activeOnly) &&
        Objects.equals(this.sportId, getGlobalTemplatesSummariesRequestFilters.sportId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeOnly, sportId);
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
    sb.append("class GetGlobalTemplatesSummariesRequestFilters {\n");
    sb.append("    activeOnly: ").append(toIndentedString(activeOnly)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
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
    openapiFields.add("ActiveOnly");
    openapiFields.add("SportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetGlobalTemplatesSummariesRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGlobalTemplatesSummariesRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGlobalTemplatesSummariesRequestFilters is not found in the empty JSON string", GetGlobalTemplatesSummariesRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGlobalTemplatesSummariesRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGlobalTemplatesSummariesRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGlobalTemplatesSummariesRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGlobalTemplatesSummariesRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGlobalTemplatesSummariesRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGlobalTemplatesSummariesRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGlobalTemplatesSummariesRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetGlobalTemplatesSummariesRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGlobalTemplatesSummariesRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetGlobalTemplatesSummariesRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetGlobalTemplatesSummariesRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetGlobalTemplatesSummariesRequestFilters
  */
  public static GetGlobalTemplatesSummariesRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGlobalTemplatesSummariesRequestFilters.class);
  }

 /**
  * Convert an instance of GetGlobalTemplatesSummariesRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
