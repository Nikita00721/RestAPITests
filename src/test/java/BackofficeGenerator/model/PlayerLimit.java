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
 * PlayerLimit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class PlayerLimit {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_SPORT = "Sport";
  @SerializedName(SERIALIZED_NAME_SPORT)
  private String sport;

  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP = "Championship";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP)
  private String championship;

  public static final String SERIALIZED_NAME_VIOLATION_ACTION = "ViolationAction";
  @SerializedName(SERIALIZED_NAME_VIOLATION_ACTION)
  private ViolationAction violationAction;

  public static final String SERIALIZED_NAME_LIMIT_FACTOR = "LimitFactor";
  @SerializedName(SERIALIZED_NAME_LIMIT_FACTOR)
  private Double limitFactor;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public PlayerLimit() {
  }

  public PlayerLimit categoryId(Integer categoryId) {
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


  public PlayerLimit championshipId(Integer championshipId) {
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


  public PlayerLimit sport(String sport) {
    this.sport = sport;
    return this;
  }

   /**
   * Get sport
   * @return sport
  **/
  @javax.annotation.Nullable
  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }


  public PlayerLimit category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public PlayerLimit championship(String championship) {
    this.championship = championship;
    return this;
  }

   /**
   * Get championship
   * @return championship
  **/
  @javax.annotation.Nullable
  public String getChampionship() {
    return championship;
  }

  public void setChampionship(String championship) {
    this.championship = championship;
  }


  public PlayerLimit violationAction(ViolationAction violationAction) {
    this.violationAction = violationAction;
    return this;
  }

   /**
   * Get violationAction
   * @return violationAction
  **/
  @javax.annotation.Nullable
  public ViolationAction getViolationAction() {
    return violationAction;
  }

  public void setViolationAction(ViolationAction violationAction) {
    this.violationAction = violationAction;
  }


  public PlayerLimit limitFactor(Double limitFactor) {
    this.limitFactor = limitFactor;
    return this;
  }

   /**
   * Get limitFactor
   * @return limitFactor
  **/
  @javax.annotation.Nullable
  public Double getLimitFactor() {
    return limitFactor;
  }

  public void setLimitFactor(Double limitFactor) {
    this.limitFactor = limitFactor;
  }


  public PlayerLimit sportId(Integer sportId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerLimit playerLimit = (PlayerLimit) o;
    return Objects.equals(this.categoryId, playerLimit.categoryId) &&
        Objects.equals(this.championshipId, playerLimit.championshipId) &&
        Objects.equals(this.sport, playerLimit.sport) &&
        Objects.equals(this.category, playerLimit.category) &&
        Objects.equals(this.championship, playerLimit.championship) &&
        Objects.equals(this.violationAction, playerLimit.violationAction) &&
        Objects.equals(this.limitFactor, playerLimit.limitFactor) &&
        Objects.equals(this.sportId, playerLimit.sportId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, championshipId, sport, category, championship, violationAction, limitFactor, sportId);
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
    sb.append("class PlayerLimit {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
    sb.append("    sport: ").append(toIndentedString(sport)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    championship: ").append(toIndentedString(championship)).append("\n");
    sb.append("    violationAction: ").append(toIndentedString(violationAction)).append("\n");
    sb.append("    limitFactor: ").append(toIndentedString(limitFactor)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
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
    openapiFields.add("CategoryId");
    openapiFields.add("ChampionshipId");
    openapiFields.add("Sport");
    openapiFields.add("Category");
    openapiFields.add("Championship");
    openapiFields.add("ViolationAction");
    openapiFields.add("LimitFactor");
    openapiFields.add("SportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlayerLimit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayerLimit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerLimit is not found in the empty JSON string", PlayerLimit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlayerLimit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayerLimit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Sport") != null && !jsonObj.get("Sport").isJsonNull()) && !jsonObj.get("Sport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sport").toString()));
      }
      if ((jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull()) && !jsonObj.get("Category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Category").toString()));
      }
      if ((jsonObj.get("Championship") != null && !jsonObj.get("Championship").isJsonNull()) && !jsonObj.get("Championship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Championship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Championship").toString()));
      }
      // validate the optional field `ViolationAction`
      if (jsonObj.get("ViolationAction") != null && !jsonObj.get("ViolationAction").isJsonNull()) {
        ViolationAction.validateJsonElement(jsonObj.get("ViolationAction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerLimit>() {
           @Override
           public void write(JsonWriter out, PlayerLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerLimit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlayerLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerLimit
  * @throws IOException if the JSON string is invalid with respect to PlayerLimit
  */
  public static PlayerLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerLimit.class);
  }

 /**
  * Convert an instance of PlayerLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

