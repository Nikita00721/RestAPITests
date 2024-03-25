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
 * CategoryNodeWithChildIds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class CategoryNodeWithChildIds {
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

  public static final String SERIALIZED_NAME_ISO = "Iso";
  @SerializedName(SERIALIZED_NAME_ISO)
  private String iso;

  public static final String SERIALIZED_NAME_CHAMP_IDS = "ChampIds";
  @SerializedName(SERIALIZED_NAME_CHAMP_IDS)
  private List<Long> champIds = new ArrayList<>();

  public CategoryNodeWithChildIds() {
  }

  public CategoryNodeWithChildIds(
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



  public CategoryNodeWithChildIds hasLiveEvents(Boolean hasLiveEvents) {
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


  public CategoryNodeWithChildIds iso(String iso) {
    this.iso = iso;
    return this;
  }

   /**
   * Get iso
   * @return iso
  **/
  @javax.annotation.Nullable
  public String getIso() {
    return iso;
  }

  public void setIso(String iso) {
    this.iso = iso;
  }


  public CategoryNodeWithChildIds champIds(List<Long> champIds) {
    this.champIds = champIds;
    return this;
  }

  public CategoryNodeWithChildIds addChampIdsItem(Long champIdsItem) {
    if (this.champIds == null) {
      this.champIds = new ArrayList<>();
    }
    this.champIds.add(champIdsItem);
    return this;
  }

   /**
   * Get champIds
   * @return champIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getChampIds() {
    return champIds;
  }

  public void setChampIds(List<Long> champIds) {
    this.champIds = champIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryNodeWithChildIds categoryNodeWithChildIds = (CategoryNodeWithChildIds) o;
    return Objects.equals(this.id, categoryNodeWithChildIds.id) &&
        Objects.equals(this.name, categoryNodeWithChildIds.name) &&
        Objects.equals(this.iconName, categoryNodeWithChildIds.iconName) &&
        Objects.equals(this.hasLiveEvents, categoryNodeWithChildIds.hasLiveEvents) &&
        Objects.equals(this.iso, categoryNodeWithChildIds.iso) &&
        Objects.equals(this.champIds, categoryNodeWithChildIds.champIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, iconName, hasLiveEvents, iso, champIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryNodeWithChildIds {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
    sb.append("    hasLiveEvents: ").append(toIndentedString(hasLiveEvents)).append("\n");
    sb.append("    iso: ").append(toIndentedString(iso)).append("\n");
    sb.append("    champIds: ").append(toIndentedString(champIds)).append("\n");
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
    openapiFields.add("Iso");
    openapiFields.add("ChampIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("HasLiveEvents");
    openapiRequiredFields.add("ChampIds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CategoryNodeWithChildIds
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CategoryNodeWithChildIds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CategoryNodeWithChildIds is not found in the empty JSON string", CategoryNodeWithChildIds.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CategoryNodeWithChildIds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CategoryNodeWithChildIds` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CategoryNodeWithChildIds.openapiRequiredFields) {
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
      if ((jsonObj.get("Iso") != null && !jsonObj.get("Iso").isJsonNull()) && !jsonObj.get("Iso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Iso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Iso").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("ChampIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ChampIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampIds` to be an array in the JSON string but got `%s`", jsonObj.get("ChampIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CategoryNodeWithChildIds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CategoryNodeWithChildIds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CategoryNodeWithChildIds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CategoryNodeWithChildIds.class));

       return (TypeAdapter<T>) new TypeAdapter<CategoryNodeWithChildIds>() {
           @Override
           public void write(JsonWriter out, CategoryNodeWithChildIds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CategoryNodeWithChildIds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CategoryNodeWithChildIds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CategoryNodeWithChildIds
  * @throws IOException if the JSON string is invalid with respect to CategoryNodeWithChildIds
  */
  public static CategoryNodeWithChildIds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CategoryNodeWithChildIds.class);
  }

 /**
  * Convert an instance of CategoryNodeWithChildIds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
