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
 * SearchEventsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class SearchEventsResults {
  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<LiveEvent> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPORTS = "Sports";
  @SerializedName(SERIALIZED_NAME_SPORTS)
  private List<SportNodeWithChildIds> sports = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryNodeWithChildIds> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHAMPS = "Champs";
  @SerializedName(SERIALIZED_NAME_CHAMPS)
  private List<ChampionshipNode> champs = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPETITORS = "Competitors";
  @SerializedName(SERIALIZED_NAME_COMPETITORS)
  private List<Competitor> competitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOUND_SPORTS = "FoundSports";
  @SerializedName(SERIALIZED_NAME_FOUND_SPORTS)
  private List<SportNodeWithChildIds> foundSports = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOUND_CATEGORIES = "FoundCategories";
  @SerializedName(SERIALIZED_NAME_FOUND_CATEGORIES)
  private List<CategoryNodeWithChildIds> foundCategories = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOUND_CHAMPS = "FoundChamps";
  @SerializedName(SERIALIZED_NAME_FOUND_CHAMPS)
  private List<ChampionshipNode> foundChamps = new ArrayList<>();

  public SearchEventsResults() {
  }

  public SearchEventsResults events(List<LiveEvent> events) {
    this.events = events;
    return this;
  }

  public SearchEventsResults addEventsItem(LiveEvent eventsItem) {
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
  public List<LiveEvent> getEvents() {
    return events;
  }

  public void setEvents(List<LiveEvent> events) {
    this.events = events;
  }


  public SearchEventsResults sports(List<SportNodeWithChildIds> sports) {
    this.sports = sports;
    return this;
  }

  public SearchEventsResults addSportsItem(SportNodeWithChildIds sportsItem) {
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
  public List<SportNodeWithChildIds> getSports() {
    return sports;
  }

  public void setSports(List<SportNodeWithChildIds> sports) {
    this.sports = sports;
  }


  public SearchEventsResults categories(List<CategoryNodeWithChildIds> categories) {
    this.categories = categories;
    return this;
  }

  public SearchEventsResults addCategoriesItem(CategoryNodeWithChildIds categoriesItem) {
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
  public List<CategoryNodeWithChildIds> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoryNodeWithChildIds> categories) {
    this.categories = categories;
  }


  public SearchEventsResults champs(List<ChampionshipNode> champs) {
    this.champs = champs;
    return this;
  }

  public SearchEventsResults addChampsItem(ChampionshipNode champsItem) {
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


  public SearchEventsResults competitors(List<Competitor> competitors) {
    this.competitors = competitors;
    return this;
  }

  public SearchEventsResults addCompetitorsItem(Competitor competitorsItem) {
    if (this.competitors == null) {
      this.competitors = new ArrayList<>();
    }
    this.competitors.add(competitorsItem);
    return this;
  }

   /**
   * Get competitors
   * @return competitors
  **/
  @javax.annotation.Nonnull
  public List<Competitor> getCompetitors() {
    return competitors;
  }

  public void setCompetitors(List<Competitor> competitors) {
    this.competitors = competitors;
  }


  public SearchEventsResults foundSports(List<SportNodeWithChildIds> foundSports) {
    this.foundSports = foundSports;
    return this;
  }

  public SearchEventsResults addFoundSportsItem(SportNodeWithChildIds foundSportsItem) {
    if (this.foundSports == null) {
      this.foundSports = new ArrayList<>();
    }
    this.foundSports.add(foundSportsItem);
    return this;
  }

   /**
   * Get foundSports
   * @return foundSports
  **/
  @javax.annotation.Nonnull
  public List<SportNodeWithChildIds> getFoundSports() {
    return foundSports;
  }

  public void setFoundSports(List<SportNodeWithChildIds> foundSports) {
    this.foundSports = foundSports;
  }


  public SearchEventsResults foundCategories(List<CategoryNodeWithChildIds> foundCategories) {
    this.foundCategories = foundCategories;
    return this;
  }

  public SearchEventsResults addFoundCategoriesItem(CategoryNodeWithChildIds foundCategoriesItem) {
    if (this.foundCategories == null) {
      this.foundCategories = new ArrayList<>();
    }
    this.foundCategories.add(foundCategoriesItem);
    return this;
  }

   /**
   * Get foundCategories
   * @return foundCategories
  **/
  @javax.annotation.Nonnull
  public List<CategoryNodeWithChildIds> getFoundCategories() {
    return foundCategories;
  }

  public void setFoundCategories(List<CategoryNodeWithChildIds> foundCategories) {
    this.foundCategories = foundCategories;
  }


  public SearchEventsResults foundChamps(List<ChampionshipNode> foundChamps) {
    this.foundChamps = foundChamps;
    return this;
  }

  public SearchEventsResults addFoundChampsItem(ChampionshipNode foundChampsItem) {
    if (this.foundChamps == null) {
      this.foundChamps = new ArrayList<>();
    }
    this.foundChamps.add(foundChampsItem);
    return this;
  }

   /**
   * Get foundChamps
   * @return foundChamps
  **/
  @javax.annotation.Nonnull
  public List<ChampionshipNode> getFoundChamps() {
    return foundChamps;
  }

  public void setFoundChamps(List<ChampionshipNode> foundChamps) {
    this.foundChamps = foundChamps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEventsResults searchEventsResults = (SearchEventsResults) o;
    return Objects.equals(this.events, searchEventsResults.events) &&
        Objects.equals(this.sports, searchEventsResults.sports) &&
        Objects.equals(this.categories, searchEventsResults.categories) &&
        Objects.equals(this.champs, searchEventsResults.champs) &&
        Objects.equals(this.competitors, searchEventsResults.competitors) &&
        Objects.equals(this.foundSports, searchEventsResults.foundSports) &&
        Objects.equals(this.foundCategories, searchEventsResults.foundCategories) &&
        Objects.equals(this.foundChamps, searchEventsResults.foundChamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, sports, categories, champs, competitors, foundSports, foundCategories, foundChamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEventsResults {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    sports: ").append(toIndentedString(sports)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    competitors: ").append(toIndentedString(competitors)).append("\n");
    sb.append("    foundSports: ").append(toIndentedString(foundSports)).append("\n");
    sb.append("    foundCategories: ").append(toIndentedString(foundCategories)).append("\n");
    sb.append("    foundChamps: ").append(toIndentedString(foundChamps)).append("\n");
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
    openapiFields.add("Competitors");
    openapiFields.add("FoundSports");
    openapiFields.add("FoundCategories");
    openapiFields.add("FoundChamps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Events");
    openapiRequiredFields.add("Sports");
    openapiRequiredFields.add("Categories");
    openapiRequiredFields.add("Champs");
    openapiRequiredFields.add("Competitors");
    openapiRequiredFields.add("FoundSports");
    openapiRequiredFields.add("FoundCategories");
    openapiRequiredFields.add("FoundChamps");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchEventsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchEventsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchEventsResults is not found in the empty JSON string", SearchEventsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchEventsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchEventsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchEventsResults.openapiRequiredFields) {
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
        LiveEvent.validateJsonElement(jsonArrayevents.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Sports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sports` to be an array in the JSON string but got `%s`", jsonObj.get("Sports").toString()));
      }

      JsonArray jsonArraysports = jsonObj.getAsJsonArray("Sports");
      // validate the required field `Sports` (array)
      for (int i = 0; i < jsonArraysports.size(); i++) {
        SportNodeWithChildIds.validateJsonElement(jsonArraysports.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Categories` to be an array in the JSON string but got `%s`", jsonObj.get("Categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("Categories");
      // validate the required field `Categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        CategoryNodeWithChildIds.validateJsonElement(jsonArraycategories.get(i));
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
      // ensure the json data is an array
      if (!jsonObj.get("Competitors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Competitors` to be an array in the JSON string but got `%s`", jsonObj.get("Competitors").toString()));
      }

      JsonArray jsonArraycompetitors = jsonObj.getAsJsonArray("Competitors");
      // validate the required field `Competitors` (array)
      for (int i = 0; i < jsonArraycompetitors.size(); i++) {
        Competitor.validateJsonElement(jsonArraycompetitors.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("FoundSports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FoundSports` to be an array in the JSON string but got `%s`", jsonObj.get("FoundSports").toString()));
      }

      JsonArray jsonArrayfoundSports = jsonObj.getAsJsonArray("FoundSports");
      // validate the required field `FoundSports` (array)
      for (int i = 0; i < jsonArrayfoundSports.size(); i++) {
        SportNodeWithChildIds.validateJsonElement(jsonArrayfoundSports.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("FoundCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FoundCategories` to be an array in the JSON string but got `%s`", jsonObj.get("FoundCategories").toString()));
      }

      JsonArray jsonArrayfoundCategories = jsonObj.getAsJsonArray("FoundCategories");
      // validate the required field `FoundCategories` (array)
      for (int i = 0; i < jsonArrayfoundCategories.size(); i++) {
        CategoryNodeWithChildIds.validateJsonElement(jsonArrayfoundCategories.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("FoundChamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FoundChamps` to be an array in the JSON string but got `%s`", jsonObj.get("FoundChamps").toString()));
      }

      JsonArray jsonArrayfoundChamps = jsonObj.getAsJsonArray("FoundChamps");
      // validate the required field `FoundChamps` (array)
      for (int i = 0; i < jsonArrayfoundChamps.size(); i++) {
        ChampionshipNode.validateJsonElement(jsonArrayfoundChamps.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchEventsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchEventsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchEventsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchEventsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchEventsResults>() {
           @Override
           public void write(JsonWriter out, SearchEventsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchEventsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchEventsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchEventsResults
  * @throws IOException if the JSON string is invalid with respect to SearchEventsResults
  */
  public static SearchEventsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchEventsResults.class);
  }

 /**
  * Convert an instance of SearchEventsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

