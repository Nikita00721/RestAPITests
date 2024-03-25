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
 * SportNodeWithChildIds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class SportNodeWithChildIds {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ICON_NAME = "IconName";
  @SerializedName(SERIALIZED_NAME_ICON_NAME)
  private String iconName;

  public static final String SERIALIZED_NAME_HAS_LIVE_EVENTS = "HasLiveEvents";
  @SerializedName(SERIALIZED_NAME_HAS_LIVE_EVENTS)
  private Boolean hasLiveEvents;

  public static final String SERIALIZED_NAME_TYPE_ID = "TypeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_CAT_IDS = "CatIds";
  @SerializedName(SERIALIZED_NAME_CAT_IDS)
  private List<Long> catIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNT = "Count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public SportNodeWithChildIds() {
  }

  public SportNodeWithChildIds(
     Long id, 
     String name, 
     String iconName
  ) {
    this();
    this.id = id;
    this.name = name;
    this.iconName = iconName;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



   /**
   * Get iconName
   * @return iconName
  **/
  @javax.annotation.Nullable
  public String getIconName() {
    return iconName;
  }



  public SportNodeWithChildIds hasLiveEvents(Boolean hasLiveEvents) {
    this.hasLiveEvents = hasLiveEvents;
    return this;
  }

   /**
   * Get hasLiveEvents
   * @return hasLiveEvents
  **/
  @javax.annotation.Nonnull
  public Boolean getHasLiveEvents() {
    return hasLiveEvents;
  }

  public void setHasLiveEvents(Boolean hasLiveEvents) {
    this.hasLiveEvents = hasLiveEvents;
  }


  public SportNodeWithChildIds typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public SportNodeWithChildIds catIds(List<Long> catIds) {
    this.catIds = catIds;
    return this;
  }

  public SportNodeWithChildIds addCatIdsItem(Long catIdsItem) {
    if (this.catIds == null) {
      this.catIds = new ArrayList<>();
    }
    this.catIds.add(catIdsItem);
    return this;
  }

   /**
   * Get catIds
   * @return catIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getCatIds() {
    return catIds;
  }

  public void setCatIds(List<Long> catIds) {
    this.catIds = catIds;
  }


  public SportNodeWithChildIds count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SportNodeWithChildIds sportNodeWithChildIds = (SportNodeWithChildIds) o;
    return Objects.equals(this.id, sportNodeWithChildIds.id) &&
        Objects.equals(this.name, sportNodeWithChildIds.name) &&
        Objects.equals(this.iconName, sportNodeWithChildIds.iconName) &&
        Objects.equals(this.hasLiveEvents, sportNodeWithChildIds.hasLiveEvents) &&
        Objects.equals(this.typeId, sportNodeWithChildIds.typeId) &&
        Objects.equals(this.catIds, sportNodeWithChildIds.catIds) &&
        Objects.equals(this.count, sportNodeWithChildIds.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, iconName, hasLiveEvents, typeId, catIds, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SportNodeWithChildIds {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
    sb.append("    hasLiveEvents: ").append(toIndentedString(hasLiveEvents)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    catIds: ").append(toIndentedString(catIds)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("IconName");
    openapiFields.add("HasLiveEvents");
    openapiFields.add("TypeId");
    openapiFields.add("CatIds");
    openapiFields.add("Count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("HasLiveEvents");
    openapiRequiredFields.add("TypeId");
    openapiRequiredFields.add("CatIds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SportNodeWithChildIds
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SportNodeWithChildIds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SportNodeWithChildIds is not found in the empty JSON string", SportNodeWithChildIds.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SportNodeWithChildIds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SportNodeWithChildIds` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SportNodeWithChildIds.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("IconName") != null && !jsonObj.get("IconName").isJsonNull()) && !jsonObj.get("IconName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IconName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IconName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("CatIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("CatIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `CatIds` to be an array in the JSON string but got `%s`", jsonObj.get("CatIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SportNodeWithChildIds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SportNodeWithChildIds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SportNodeWithChildIds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SportNodeWithChildIds.class));

       return (TypeAdapter<T>) new TypeAdapter<SportNodeWithChildIds>() {
           @Override
           public void write(JsonWriter out, SportNodeWithChildIds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SportNodeWithChildIds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SportNodeWithChildIds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SportNodeWithChildIds
  * @throws IOException if the JSON string is invalid with respect to SportNodeWithChildIds
  */
  public static SportNodeWithChildIds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SportNodeWithChildIds.class);
  }

 /**
  * Convert an instance of SportNodeWithChildIds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
