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
 * ChampionshipItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChampionshipItem {
  public static final String SERIALIZED_NAME_CATEGORY_NAME = "CategoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_NAME = "ChampionshipName";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_NAME)
  private String championshipName;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public ChampionshipItem() {
  }

  public ChampionshipItem categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public ChampionshipItem sportName(String sportName) {
    this.sportName = sportName;
    return this;
  }

   /**
   * Get sportName
   * @return sportName
  **/
  @javax.annotation.Nullable
  public String getSportName() {
    return sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }


  public ChampionshipItem championshipId(Integer championshipId) {
    this.championshipId = championshipId;
    return this;
  }

   /**
   * Get championshipId
   * @return championshipId
  **/
  @javax.annotation.Nullable
  public Integer getChampionshipId() {
    return championshipId;
  }

  public void setChampionshipId(Integer championshipId) {
    this.championshipId = championshipId;
  }


  public ChampionshipItem championshipName(String championshipName) {
    this.championshipName = championshipName;
    return this;
  }

   /**
   * Get championshipName
   * @return championshipName
  **/
  @javax.annotation.Nullable
  public String getChampionshipName() {
    return championshipName;
  }

  public void setChampionshipName(String championshipName) {
    this.championshipName = championshipName;
  }


  public ChampionshipItem categoryId(Integer categoryId) {
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
    ChampionshipItem championshipItem = (ChampionshipItem) o;
    return Objects.equals(this.categoryName, championshipItem.categoryName) &&
        Objects.equals(this.sportName, championshipItem.sportName) &&
        Objects.equals(this.championshipId, championshipItem.championshipId) &&
        Objects.equals(this.championshipName, championshipItem.championshipName) &&
        Objects.equals(this.categoryId, championshipItem.categoryId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, sportName, championshipId, championshipName, categoryId);
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
    sb.append("class ChampionshipItem {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
    sb.append("    championshipName: ").append(toIndentedString(championshipName)).append("\n");
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
    openapiFields.add("CategoryName");
    openapiFields.add("SportName");
    openapiFields.add("ChampionshipId");
    openapiFields.add("ChampionshipName");
    openapiFields.add("CategoryId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChampionshipItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChampionshipItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChampionshipItem is not found in the empty JSON string", ChampionshipItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChampionshipItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChampionshipItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CategoryName") != null && !jsonObj.get("CategoryName").isJsonNull()) && !jsonObj.get("CategoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CategoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CategoryName").toString()));
      }
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if ((jsonObj.get("ChampionshipName") != null && !jsonObj.get("ChampionshipName").isJsonNull()) && !jsonObj.get("ChampionshipName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ChampionshipName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ChampionshipName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChampionshipItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChampionshipItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChampionshipItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChampionshipItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ChampionshipItem>() {
           @Override
           public void write(JsonWriter out, ChampionshipItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChampionshipItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChampionshipItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChampionshipItem
  * @throws IOException if the JSON string is invalid with respect to ChampionshipItem
  */
  public static ChampionshipItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChampionshipItem.class);
  }

 /**
  * Convert an instance of ChampionshipItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

