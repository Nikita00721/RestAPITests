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
 * EventCategoryItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class EventCategoryItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHAMPS = "Champs";
  @SerializedName(SERIALIZED_NAME_CHAMPS)
  private List<EventChampItem> champs;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public EventCategoryItem() {
  }

  public EventCategoryItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public EventCategoryItem champs(List<EventChampItem> champs) {
    this.champs = champs;
    return this;
  }

  public EventCategoryItem addChampsItem(EventChampItem champsItem) {
    if (this.champs == null) {
      this.champs = new ArrayList<>();
    }
    this.champs.add(champsItem);
    return this;
  }

   /**
   * Get champs
   * @return champs
  **/
  @javax.annotation.Nullable
  public List<EventChampItem> getChamps() {
    return champs;
  }

  public void setChamps(List<EventChampItem> champs) {
    this.champs = champs;
  }


  public EventCategoryItem categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCategoryItem eventCategoryItem = (EventCategoryItem) o;
    return Objects.equals(this.name, eventCategoryItem.name) &&
        Objects.equals(this.champs, eventCategoryItem.champs) &&
        Objects.equals(this.categoryId, eventCategoryItem.categoryId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, champs, categoryId);
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
    sb.append("class EventCategoryItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Champs");
    openapiFields.add("CategoryId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCategoryItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCategoryItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCategoryItem is not found in the empty JSON string", EventCategoryItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCategoryItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCategoryItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Champs") != null && !jsonObj.get("Champs").isJsonNull()) {
        JsonArray jsonArraychamps = jsonObj.getAsJsonArray("Champs");
        if (jsonArraychamps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Champs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Champs` to be an array in the JSON string but got `%s`", jsonObj.get("Champs").toString()));
          }

          // validate the optional field `Champs` (array)
          for (int i = 0; i < jsonArraychamps.size(); i++) {
            EventChampItem.validateJsonElement(jsonArraychamps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCategoryItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCategoryItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCategoryItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCategoryItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCategoryItem>() {
           @Override
           public void write(JsonWriter out, EventCategoryItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCategoryItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCategoryItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCategoryItem
  * @throws IOException if the JSON string is invalid with respect to EventCategoryItem
  */
  public static EventCategoryItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCategoryItem.class);
  }

 /**
  * Convert an instance of EventCategoryItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

