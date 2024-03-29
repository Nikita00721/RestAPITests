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
 * UpdateTopBoostItemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateTopBoostItemRequest {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_IS_MAIN_PAGE = "IsMainPage";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_PAGE)
  private Boolean isMainPage;

  public static final String SERIALIZED_NAME_BOOST_ITEMS = "BoostItems";
  @SerializedName(SERIALIZED_NAME_BOOST_ITEMS)
  private List<TopBoostItemModel> boostItems;

  public static final String SERIALIZED_NAME_BOOST_CONFIG_ID = "BoostConfigId";
  @SerializedName(SERIALIZED_NAME_BOOST_CONFIG_ID)
  private Integer boostConfigId;

  public UpdateTopBoostItemRequest() {
  }

  public UpdateTopBoostItemRequest sportId(Integer sportId) {
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


  public UpdateTopBoostItemRequest isMainPage(Boolean isMainPage) {
    this.isMainPage = isMainPage;
    return this;
  }

   /**
   * Get isMainPage
   * @return isMainPage
  **/
  @javax.annotation.Nullable
  public Boolean getIsMainPage() {
    return isMainPage;
  }

  public void setIsMainPage(Boolean isMainPage) {
    this.isMainPage = isMainPage;
  }


  public UpdateTopBoostItemRequest boostItems(List<TopBoostItemModel> boostItems) {
    this.boostItems = boostItems;
    return this;
  }

  public UpdateTopBoostItemRequest addBoostItemsItem(TopBoostItemModel boostItemsItem) {
    if (this.boostItems == null) {
      this.boostItems = new ArrayList<>();
    }
    this.boostItems.add(boostItemsItem);
    return this;
  }

   /**
   * Get boostItems
   * @return boostItems
  **/
  @javax.annotation.Nullable
  public List<TopBoostItemModel> getBoostItems() {
    return boostItems;
  }

  public void setBoostItems(List<TopBoostItemModel> boostItems) {
    this.boostItems = boostItems;
  }


  public UpdateTopBoostItemRequest boostConfigId(Integer boostConfigId) {
    this.boostConfigId = boostConfigId;
    return this;
  }

   /**
   * Get boostConfigId
   * @return boostConfigId
  **/
  @javax.annotation.Nullable
  public Integer getBoostConfigId() {
    return boostConfigId;
  }

  public void setBoostConfigId(Integer boostConfigId) {
    this.boostConfigId = boostConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTopBoostItemRequest updateTopBoostItemRequest = (UpdateTopBoostItemRequest) o;
    return Objects.equals(this.sportId, updateTopBoostItemRequest.sportId) &&
        Objects.equals(this.isMainPage, updateTopBoostItemRequest.isMainPage) &&
        Objects.equals(this.boostItems, updateTopBoostItemRequest.boostItems) &&
        Objects.equals(this.boostConfigId, updateTopBoostItemRequest.boostConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, isMainPage, boostItems, boostConfigId);
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
    sb.append("class UpdateTopBoostItemRequest {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    isMainPage: ").append(toIndentedString(isMainPage)).append("\n");
    sb.append("    boostItems: ").append(toIndentedString(boostItems)).append("\n");
    sb.append("    boostConfigId: ").append(toIndentedString(boostConfigId)).append("\n");
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
    openapiFields.add("IsMainPage");
    openapiFields.add("BoostItems");
    openapiFields.add("BoostConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTopBoostItemRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTopBoostItemRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTopBoostItemRequest is not found in the empty JSON string", UpdateTopBoostItemRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTopBoostItemRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTopBoostItemRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("BoostItems") != null && !jsonObj.get("BoostItems").isJsonNull()) {
        JsonArray jsonArrayboostItems = jsonObj.getAsJsonArray("BoostItems");
        if (jsonArrayboostItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("BoostItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `BoostItems` to be an array in the JSON string but got `%s`", jsonObj.get("BoostItems").toString()));
          }

          // validate the optional field `BoostItems` (array)
          for (int i = 0; i < jsonArrayboostItems.size(); i++) {
            TopBoostItemModel.validateJsonElement(jsonArrayboostItems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTopBoostItemRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTopBoostItemRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTopBoostItemRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTopBoostItemRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTopBoostItemRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTopBoostItemRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTopBoostItemRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTopBoostItemRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTopBoostItemRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTopBoostItemRequest
  */
  public static UpdateTopBoostItemRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTopBoostItemRequest.class);
  }

 /**
  * Convert an instance of UpdateTopBoostItemRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

