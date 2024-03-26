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
 * AddPlayerLimitRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AddPlayerLimitRequest {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "CategoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP_ID = "ChampionshipId";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP_ID)
  private Integer championshipId;

  public static final String SERIALIZED_NAME_LIMIT_FACTOR = "LimitFactor";
  @SerializedName(SERIALIZED_NAME_LIMIT_FACTOR)
  private Double limitFactor;

  public static final String SERIALIZED_NAME_VIOLATION_ACTION = "ViolationAction";
  @SerializedName(SERIALIZED_NAME_VIOLATION_ACTION)
  private ViolationAction violationAction;

  public static final String SERIALIZED_NAME_PLAYER_ID = "PlayerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private Integer playerId;

  public AddPlayerLimitRequest() {
  }

  public AddPlayerLimitRequest sportId(Integer sportId) {
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


  public AddPlayerLimitRequest categoryId(Integer categoryId) {
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


  public AddPlayerLimitRequest championshipId(Integer championshipId) {
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


  public AddPlayerLimitRequest limitFactor(Double limitFactor) {
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


  public AddPlayerLimitRequest violationAction(ViolationAction violationAction) {
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


  public AddPlayerLimitRequest playerId(Integer playerId) {
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
    AddPlayerLimitRequest addPlayerLimitRequest = (AddPlayerLimitRequest) o;
    return Objects.equals(this.sportId, addPlayerLimitRequest.sportId) &&
        Objects.equals(this.categoryId, addPlayerLimitRequest.categoryId) &&
        Objects.equals(this.championshipId, addPlayerLimitRequest.championshipId) &&
        Objects.equals(this.limitFactor, addPlayerLimitRequest.limitFactor) &&
        Objects.equals(this.violationAction, addPlayerLimitRequest.violationAction) &&
        Objects.equals(this.playerId, addPlayerLimitRequest.playerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, categoryId, championshipId, limitFactor, violationAction, playerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPlayerLimitRequest {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    championshipId: ").append(toIndentedString(championshipId)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to AddPlayerLimitRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddPlayerLimitRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddPlayerLimitRequest is not found in the empty JSON string", AddPlayerLimitRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddPlayerLimitRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddPlayerLimitRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!AddPlayerLimitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddPlayerLimitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddPlayerLimitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddPlayerLimitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddPlayerLimitRequest>() {
           @Override
           public void write(JsonWriter out, AddPlayerLimitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddPlayerLimitRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddPlayerLimitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddPlayerLimitRequest
  * @throws IOException if the JSON string is invalid with respect to AddPlayerLimitRequest
  */
  public static AddPlayerLimitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddPlayerLimitRequest.class);
  }

 /**
  * Convert an instance of AddPlayerLimitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

