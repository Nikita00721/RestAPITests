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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * UpdatePlayerLimitRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdatePlayerLimitRequest {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_NEW_SPORT_ID = "NewSportId";
  @SerializedName(SERIALIZED_NAME_NEW_SPORT_ID)
  private Integer newSportId;

  public static final String SERIALIZED_NAME_NEW_CATEGORY_ID = "NewCategoryId";
  @SerializedName(SERIALIZED_NAME_NEW_CATEGORY_ID)
  private Integer newCategoryId;

  public static final String SERIALIZED_NAME_NEW_CHAMPIONSHIP_ID = "NewChampionshipId";
  @SerializedName(SERIALIZED_NAME_NEW_CHAMPIONSHIP_ID)
  private Integer newChampionshipId;

  public static final String SERIALIZED_NAME_LIMIT_FACTOR = "LimitFactor";
  @SerializedName(SERIALIZED_NAME_LIMIT_FACTOR)
  private Double limitFactor;

  public static final String SERIALIZED_NAME_VIOLATION_ACTION = "ViolationAction";
  @SerializedName(SERIALIZED_NAME_VIOLATION_ACTION)
  private ViolationAction violationAction;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public UpdatePlayerLimitRequest() {
  }

  public UpdatePlayerLimitRequest sportId(Integer sportId) {
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


  public UpdatePlayerLimitRequest categoryId(Integer categoryId) {
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


  public UpdatePlayerLimitRequest championshipId(Integer championshipId) {
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


  public UpdatePlayerLimitRequest newSportId(Integer newSportId) {
    this.newSportId = newSportId;
    return this;
  }

   /**
   * Get newSportId
   * @return newSportId
  **/
  @javax.annotation.Nullable
  public Integer getNewSportId() {
    return newSportId;
  }

  public void setNewSportId(Integer newSportId) {
    this.newSportId = newSportId;
  }


  public UpdatePlayerLimitRequest newCategoryId(Integer newCategoryId) {
    this.newCategoryId = newCategoryId;
    return this;
  }

   /**
   * Get newCategoryId
   * @return newCategoryId
  **/
  @javax.annotation.Nullable
  public Integer getNewCategoryId() {
    return newCategoryId;
  }

  public void setNewCategoryId(Integer newCategoryId) {
    this.newCategoryId = newCategoryId;
  }


  public UpdatePlayerLimitRequest newChampionshipId(Integer newChampionshipId) {
    this.newChampionshipId = newChampionshipId;
    return this;
  }

   /**
   * Get newChampionshipId
   * @return newChampionshipId
  **/
  @javax.annotation.Nullable
  public Integer getNewChampionshipId() {
    return newChampionshipId;
  }

  public void setNewChampionshipId(Integer newChampionshipId) {
    this.newChampionshipId = newChampionshipId;
  }


  public UpdatePlayerLimitRequest limitFactor(Double limitFactor) {
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


  public UpdatePlayerLimitRequest violationAction(ViolationAction violationAction) {
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


  public UpdatePlayerLimitRequest playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

   /**
   * Get playerId
   * @return playerId
  **/
  @javax.annotation.Nullable
  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePlayerLimitRequest updatePlayerLimitRequest = (UpdatePlayerLimitRequest) o;
    return Objects.equals(this.sportId, updatePlayerLimitRequest.sportId) &&
        Objects.equals(this.categoryId, updatePlayerLimitRequest.categoryId) &&
        Objects.equals(this.championshipId, updatePlayerLimitRequest.championshipId) &&
        Objects.equals(this.newSportId, updatePlayerLimitRequest.newSportId) &&
        Objects.equals(this.newCategoryId, updatePlayerLimitRequest.newCategoryId) &&
        Objects.equals(this.newChampionshipId, updatePlayerLimitRequest.newChampionshipId) &&
        Objects.equals(this.limitFactor, updatePlayerLimitRequest.limitFactor) &&
        Objects.equals(this.violationAction, updatePlayerLimitRequest.violationAction) &&
        Objects.equals(this.playerId, updatePlayerLimitRequest.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, categoryId, championshipId, newSportId, newCategoryId, newChampionshipId, limitFactor, violationAction, playerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayerLimitRequest {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
    sb.append("    newSportId: ").append(toIndentedString(newSportId)).append("\n");
    sb.append("    newCategoryId: ").append(toIndentedString(newCategoryId)).append("\n");
    sb.append("    newChampionshipId: ").append(toIndentedString(newChampionshipId)).append("\n");
    sb.append("    limitFactor: ").append(toIndentedString(limitFactor)).append("\n");
    sb.append("    violationAction: ").append(toIndentedString(violationAction)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
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
    openapiFields.add("CategoryId");
    openapiFields.add("ChampionshipId");
    openapiFields.add("NewSportId");
    openapiFields.add("NewCategoryId");
    openapiFields.add("NewChampionshipId");
    openapiFields.add("LimitFactor");
    openapiFields.add("ViolationAction");
    openapiFields.add("PlayerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdatePlayerLimitRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePlayerLimitRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePlayerLimitRequest is not found in the empty JSON string", UpdatePlayerLimitRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePlayerLimitRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePlayerLimitRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ViolationAction`
      if (jsonObj.get("ViolationAction") != null && !jsonObj.get("ViolationAction").isJsonNull()) {
        ViolationAction.validateJsonElement(jsonObj.get("ViolationAction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePlayerLimitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePlayerLimitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePlayerLimitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePlayerLimitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePlayerLimitRequest>() {
           @Override
           public void write(JsonWriter out, UpdatePlayerLimitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePlayerLimitRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePlayerLimitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePlayerLimitRequest
  * @throws IOException if the JSON string is invalid with respect to UpdatePlayerLimitRequest
  */
  public static UpdatePlayerLimitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePlayerLimitRequest.class);
  }

 /**
  * Convert an instance of UpdatePlayerLimitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

