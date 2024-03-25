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
 * GetBreadcrumbsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetBreadcrumbsResults {
  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<BreadcrumbEventInfo> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPORTS = "Sports";
  @SerializedName(SERIALIZED_NAME_SPORTS)
  private List<SportNode> sports = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryNode> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHAMPS = "Champs";
  @SerializedName(SERIALIZED_NAME_CHAMPS)
  private List<ChampionshipNode> champs = new ArrayList<>();

  public GetBreadcrumbsResults() {
  }

  public GetBreadcrumbsResults events(List<BreadcrumbEventInfo> events) {
    this.events = events;
    return this;
  }

  public GetBreadcrumbsResults addEventsItem(BreadcrumbEventInfo eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull
  public List<BreadcrumbEventInfo> getEvents() {
    return events;
  }

  public void setEvents(List<BreadcrumbEventInfo> events) {
    this.events = events;
  }


  public GetBreadcrumbsResults sports(List<SportNode> sports) {
    this.sports = sports;
    return this;
  }

  public GetBreadcrumbsResults addSportsItem(SportNode sportsItem) {
    if (this.sports == null) {
      this.sports = new ArrayList<>();
    }
    this.sports.add(sportsItem);
    return this;
  }

   /**
   * Get sports
   * @return sports
  **/
  @javax.annotation.Nonnull
  public List<SportNode> getSports() {
    return sports;
  }

  public void setSports(List<SportNode> sports) {
    this.sports = sports;
  }


  public GetBreadcrumbsResults categories(List<CategoryNode> categories) {
    this.categories = categories;
    return this;
  }

  public GetBreadcrumbsResults addCategoriesItem(CategoryNode categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nonnull
  public List<CategoryNode> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoryNode> categories) {
    this.categories = categories;
  }


  public GetBreadcrumbsResults champs(List<ChampionshipNode> champs) {
    this.champs = champs;
    return this;
  }

  public GetBreadcrumbsResults addChampsItem(ChampionshipNode champsItem) {
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
  @javax.annotation.Nonnull
  public List<ChampionshipNode> getChamps() {
    return champs;
  }

  public void setChamps(List<ChampionshipNode> champs) {
    this.champs = champs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBreadcrumbsResults getBreadcrumbsResults = (GetBreadcrumbsResults) o;
    return Objects.equals(this.events, getBreadcrumbsResults.events) &&
        Objects.equals(this.sports, getBreadcrumbsResults.sports) &&
        Objects.equals(this.categories, getBreadcrumbsResults.categories) &&
        Objects.equals(this.champs, getBreadcrumbsResults.champs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, sports, categories, champs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBreadcrumbsResults {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    sports: ").append(toIndentedString(sports)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
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
    openapiFields.add("Events");
    openapiFields.add("Sports");
    openapiFields.add("Categories");
    openapiFields.add("Champs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Events");
    openapiRequiredFields.add("Sports");
    openapiRequiredFields.add("Categories");
    openapiRequiredFields.add("Champs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetBreadcrumbsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBreadcrumbsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBreadcrumbsResults is not found in the empty JSON string", GetBreadcrumbsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBreadcrumbsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBreadcrumbsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetBreadcrumbsResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Events` to be an array in the JSON string but got `%s`", jsonObj.get("Events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("Events");
      // validate the required field `Events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        BreadcrumbEventInfo.validateJsonElement(jsonArrayevents.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Sports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sports` to be an array in the JSON string but got `%s`", jsonObj.get("Sports").toString()));
      }

      JsonArray jsonArraysports = jsonObj.getAsJsonArray("Sports");
      // validate the required field `Sports` (array)
      for (int i = 0; i < jsonArraysports.size(); i++) {
        SportNode.validateJsonElement(jsonArraysports.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Categories` to be an array in the JSON string but got `%s`", jsonObj.get("Categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("Categories");
      // validate the required field `Categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        CategoryNode.validateJsonElement(jsonArraycategories.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Champs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Champs` to be an array in the JSON string but got `%s`", jsonObj.get("Champs").toString()));
      }

      JsonArray jsonArraychamps = jsonObj.getAsJsonArray("Champs");
      // validate the required field `Champs` (array)
      for (int i = 0; i < jsonArraychamps.size(); i++) {
        ChampionshipNode.validateJsonElement(jsonArraychamps.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBreadcrumbsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBreadcrumbsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBreadcrumbsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBreadcrumbsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBreadcrumbsResults>() {
           @Override
           public void write(JsonWriter out, GetBreadcrumbsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBreadcrumbsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBreadcrumbsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBreadcrumbsResults
  * @throws IOException if the JSON string is invalid with respect to GetBreadcrumbsResults
  */
  public static GetBreadcrumbsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBreadcrumbsResults.class);
  }

 /**
  * Convert an instance of GetBreadcrumbsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

