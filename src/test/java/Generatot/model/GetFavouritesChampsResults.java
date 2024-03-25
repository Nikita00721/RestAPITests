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
 * GetFavouritesChampsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetFavouritesChampsResults {
  public static final String SERIALIZED_NAME_FAVOURITE_CHAMPS = "FavouriteChamps";
  @SerializedName(SERIALIZED_NAME_FAVOURITE_CHAMPS)
  private List<FavoriteChampionship> favouriteChamps = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPORTS = "Sports";
  @SerializedName(SERIALIZED_NAME_SPORTS)
  private List<SportNodeWithChildIds> sports = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoryNodeWithChildIds> categories = new ArrayList<>();

  public GetFavouritesChampsResults() {
  }

  public GetFavouritesChampsResults favouriteChamps(List<FavoriteChampionship> favouriteChamps) {
    this.favouriteChamps = favouriteChamps;
    return this;
  }

  public GetFavouritesChampsResults addFavouriteChampsItem(FavoriteChampionship favouriteChampsItem) {
    if (this.favouriteChamps == null) {
      this.favouriteChamps = new ArrayList<>();
    }
    this.favouriteChamps.add(favouriteChampsItem);
    return this;
  }

   /**
   * Get favouriteChamps
   * @return favouriteChamps
  **/
  @javax.annotation.Nonnull
  public List<FavoriteChampionship> getFavouriteChamps() {
    return favouriteChamps;
  }

  public void setFavouriteChamps(List<FavoriteChampionship> favouriteChamps) {
    this.favouriteChamps = favouriteChamps;
  }


  public GetFavouritesChampsResults sports(List<SportNodeWithChildIds> sports) {
    this.sports = sports;
    return this;
  }

  public GetFavouritesChampsResults addSportsItem(SportNodeWithChildIds sportsItem) {
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


  public GetFavouritesChampsResults categories(List<CategoryNodeWithChildIds> categories) {
    this.categories = categories;
    return this;
  }

  public GetFavouritesChampsResults addCategoriesItem(CategoryNodeWithChildIds categoriesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFavouritesChampsResults getFavouritesChampsResults = (GetFavouritesChampsResults) o;
    return Objects.equals(this.favouriteChamps, getFavouritesChampsResults.favouriteChamps) &&
        Objects.equals(this.sports, getFavouritesChampsResults.sports) &&
        Objects.equals(this.categories, getFavouritesChampsResults.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favouriteChamps, sports, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFavouritesChampsResults {\n");
    sb.append("    favouriteChamps: ").append(toIndentedString(favouriteChamps)).append("\n");
    sb.append("    sports: ").append(toIndentedString(sports)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("FavouriteChamps");
    openapiFields.add("Sports");
    openapiFields.add("Categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FavouriteChamps");
    openapiRequiredFields.add("Sports");
    openapiRequiredFields.add("Categories");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFavouritesChampsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFavouritesChampsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFavouritesChampsResults is not found in the empty JSON string", GetFavouritesChampsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFavouritesChampsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFavouritesChampsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetFavouritesChampsResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("FavouriteChamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FavouriteChamps` to be an array in the JSON string but got `%s`", jsonObj.get("FavouriteChamps").toString()));
      }

      JsonArray jsonArrayfavouriteChamps = jsonObj.getAsJsonArray("FavouriteChamps");
      // validate the required field `FavouriteChamps` (array)
      for (int i = 0; i < jsonArrayfavouriteChamps.size(); i++) {
        FavoriteChampionship.validateJsonElement(jsonArrayfavouriteChamps.get(i));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFavouritesChampsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFavouritesChampsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFavouritesChampsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFavouritesChampsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFavouritesChampsResults>() {
           @Override
           public void write(JsonWriter out, GetFavouritesChampsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFavouritesChampsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFavouritesChampsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFavouritesChampsResults
  * @throws IOException if the JSON string is invalid with respect to GetFavouritesChampsResults
  */
  public static GetFavouritesChampsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFavouritesChampsResults.class);
  }

 /**
  * Convert an instance of GetFavouritesChampsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

