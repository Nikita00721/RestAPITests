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
 * GetTopHorseRacesResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class GetTopHorseRacesResults {
  public static final String SERIALIZED_NAME_RACES = "Races";
  @SerializedName(SERIALIZED_NAME_RACES)
  private List<Race> races = new ArrayList<>();

  public static final String SERIALIZED_NAME_VENUES = "Venues";
  @SerializedName(SERIALIZED_NAME_VENUES)
  private List<Venue> venues = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTRIES = "Countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<Country> countries = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPORT = "Sport";
  @SerializedName(SERIALIZED_NAME_SPORT)
  private SportNode sport;

  public GetTopHorseRacesResults() {
  }

  public GetTopHorseRacesResults races(List<Race> races) {
    this.races = races;
    return this;
  }

  public GetTopHorseRacesResults addRacesItem(Race racesItem) {
    if (this.races == null) {
      this.races = new ArrayList<>();
    }
    this.races.add(racesItem);
    return this;
  }

   /**
   * Get races
   * @return races
  **/
  @javax.annotation.Nonnull
  public List<Race> getRaces() {
    return races;
  }

  public void setRaces(List<Race> races) {
    this.races = races;
  }


  public GetTopHorseRacesResults venues(List<Venue> venues) {
    this.venues = venues;
    return this;
  }

  public GetTopHorseRacesResults addVenuesItem(Venue venuesItem) {
    if (this.venues == null) {
      this.venues = new ArrayList<>();
    }
    this.venues.add(venuesItem);
    return this;
  }

   /**
   * Get venues
   * @return venues
  **/
  @javax.annotation.Nonnull
  public List<Venue> getVenues() {
    return venues;
  }

  public void setVenues(List<Venue> venues) {
    this.venues = venues;
  }


  public GetTopHorseRacesResults countries(List<Country> countries) {
    this.countries = countries;
    return this;
  }

  public GetTopHorseRacesResults addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @javax.annotation.Nonnull
  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }


  public GetTopHorseRacesResults sport(SportNode sport) {
    this.sport = sport;
    return this;
  }

   /**
   * Get sport
   * @return sport
  **/
  @javax.annotation.Nonnull
  public SportNode getSport() {
    return sport;
  }

  public void setSport(SportNode sport) {
    this.sport = sport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTopHorseRacesResults getTopHorseRacesResults = (GetTopHorseRacesResults) o;
    return Objects.equals(this.races, getTopHorseRacesResults.races) &&
        Objects.equals(this.venues, getTopHorseRacesResults.venues) &&
        Objects.equals(this.countries, getTopHorseRacesResults.countries) &&
        Objects.equals(this.sport, getTopHorseRacesResults.sport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(races, venues, countries, sport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTopHorseRacesResults {\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    venues: ").append(toIndentedString(venues)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    sport: ").append(toIndentedString(sport)).append("\n");
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
    openapiFields.add("Races");
    openapiFields.add("Venues");
    openapiFields.add("Countries");
    openapiFields.add("Sport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Races");
    openapiRequiredFields.add("Venues");
    openapiRequiredFields.add("Countries");
    openapiRequiredFields.add("Sport");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTopHorseRacesResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTopHorseRacesResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTopHorseRacesResults is not found in the empty JSON string", GetTopHorseRacesResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTopHorseRacesResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTopHorseRacesResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTopHorseRacesResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Races").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Races` to be an array in the JSON string but got `%s`", jsonObj.get("Races").toString()));
      }

      JsonArray jsonArrayraces = jsonObj.getAsJsonArray("Races");
      // validate the required field `Races` (array)
      for (int i = 0; i < jsonArrayraces.size(); i++) {
        Race.validateJsonElement(jsonArrayraces.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Venues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Venues` to be an array in the JSON string but got `%s`", jsonObj.get("Venues").toString()));
      }

      JsonArray jsonArrayvenues = jsonObj.getAsJsonArray("Venues");
      // validate the required field `Venues` (array)
      for (int i = 0; i < jsonArrayvenues.size(); i++) {
        Venue.validateJsonElement(jsonArrayvenues.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Countries` to be an array in the JSON string but got `%s`", jsonObj.get("Countries").toString()));
      }

      JsonArray jsonArraycountries = jsonObj.getAsJsonArray("Countries");
      // validate the required field `Countries` (array)
      for (int i = 0; i < jsonArraycountries.size(); i++) {
        Country.validateJsonElement(jsonArraycountries.get(i));
      };
      // validate the required field `Sport`
      SportNode.validateJsonElement(jsonObj.get("Sport"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTopHorseRacesResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTopHorseRacesResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTopHorseRacesResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTopHorseRacesResults.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTopHorseRacesResults>() {
           @Override
           public void write(JsonWriter out, GetTopHorseRacesResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTopHorseRacesResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTopHorseRacesResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTopHorseRacesResults
  * @throws IOException if the JSON string is invalid with respect to GetTopHorseRacesResults
  */
  public static GetTopHorseRacesResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTopHorseRacesResults.class);
  }

 /**
  * Convert an instance of GetTopHorseRacesResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

