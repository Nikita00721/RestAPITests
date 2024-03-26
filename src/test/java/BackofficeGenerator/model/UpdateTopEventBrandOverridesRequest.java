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
 * UpdateTopEventBrandOverridesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateTopEventBrandOverridesRequest {
  public static final String SERIALIZED_NAME_OVERRIDES = "Overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private List<TopEventHeaderOverride> overrides;

  public static final String SERIALIZED_NAME_SPORT_TABS = "SportTabs";
  @SerializedName(SERIALIZED_NAME_SPORT_TABS)
  private List<TabWithSport> sportTabs;

  public static final String SERIALIZED_NAME_BRAND_ID = "BrandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Integer brandId;

  public UpdateTopEventBrandOverridesRequest() {
  }

  public UpdateTopEventBrandOverridesRequest overrides(List<TopEventHeaderOverride> overrides) {
    this.overrides = overrides;
    return this;
  }

  public UpdateTopEventBrandOverridesRequest addOverridesItem(TopEventHeaderOverride overridesItem) {
    if (this.overrides == null) {
      this.overrides = new ArrayList<>();
    }
    this.overrides.add(overridesItem);
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @javax.annotation.Nullable
  public List<TopEventHeaderOverride> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<TopEventHeaderOverride> overrides) {
    this.overrides = overrides;
  }


  public UpdateTopEventBrandOverridesRequest sportTabs(List<TabWithSport> sportTabs) {
    this.sportTabs = sportTabs;
    return this;
  }

  public UpdateTopEventBrandOverridesRequest addSportTabsItem(TabWithSport sportTabsItem) {
    if (this.sportTabs == null) {
      this.sportTabs = new ArrayList<>();
    }
    this.sportTabs.add(sportTabsItem);
    return this;
  }

   /**
   * Get sportTabs
   * @return sportTabs
  **/
  @javax.annotation.Nullable
  public List<TabWithSport> getSportTabs() {
    return sportTabs;
  }

  public void setSportTabs(List<TabWithSport> sportTabs) {
    this.sportTabs = sportTabs;
  }


  public UpdateTopEventBrandOverridesRequest brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTopEventBrandOverridesRequest updateTopEventBrandOverridesRequest = (UpdateTopEventBrandOverridesRequest) o;
    return Objects.equals(this.overrides, updateTopEventBrandOverridesRequest.overrides) &&
        Objects.equals(this.sportTabs, updateTopEventBrandOverridesRequest.sportTabs) &&
        Objects.equals(this.brandId, updateTopEventBrandOverridesRequest.brandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrides, sportTabs, brandId);
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
    sb.append("class UpdateTopEventBrandOverridesRequest {\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    sportTabs: ").append(toIndentedString(sportTabs)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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
    openapiFields.add("Overrides");
    openapiFields.add("SportTabs");
    openapiFields.add("BrandId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTopEventBrandOverridesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTopEventBrandOverridesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTopEventBrandOverridesRequest is not found in the empty JSON string", UpdateTopEventBrandOverridesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTopEventBrandOverridesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTopEventBrandOverridesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Overrides") != null && !jsonObj.get("Overrides").isJsonNull()) {
        JsonArray jsonArrayoverrides = jsonObj.getAsJsonArray("Overrides");
        if (jsonArrayoverrides != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Overrides").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Overrides` to be an array in the JSON string but got `%s`", jsonObj.get("Overrides").toString()));
          }

          // validate the optional field `Overrides` (array)
          for (int i = 0; i < jsonArrayoverrides.size(); i++) {
            TopEventHeaderOverride.validateJsonElement(jsonArrayoverrides.get(i));
          };
        }
      }
      if (jsonObj.get("SportTabs") != null && !jsonObj.get("SportTabs").isJsonNull()) {
        JsonArray jsonArraysportTabs = jsonObj.getAsJsonArray("SportTabs");
        if (jsonArraysportTabs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SportTabs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SportTabs` to be an array in the JSON string but got `%s`", jsonObj.get("SportTabs").toString()));
          }

          // validate the optional field `SportTabs` (array)
          for (int i = 0; i < jsonArraysportTabs.size(); i++) {
            TabWithSport.validateJsonElement(jsonArraysportTabs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTopEventBrandOverridesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTopEventBrandOverridesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTopEventBrandOverridesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTopEventBrandOverridesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTopEventBrandOverridesRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTopEventBrandOverridesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTopEventBrandOverridesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTopEventBrandOverridesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTopEventBrandOverridesRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTopEventBrandOverridesRequest
  */
  public static UpdateTopEventBrandOverridesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTopEventBrandOverridesRequest.class);
  }

 /**
  * Convert an instance of UpdateTopEventBrandOverridesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
