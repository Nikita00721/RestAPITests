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
 * UpdateAamsMappingForMatchMarketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateAamsMappingForMatchMarketRequest {
  public static final String SERIALIZED_NAME_INT_SPORT_ID = "IntSportId";
  @SerializedName(SERIALIZED_NAME_INT_SPORT_ID)
  private Integer intSportId;

  public static final String SERIALIZED_NAME_SELECTIONS = "Selections";
  @SerializedName(SERIALIZED_NAME_SELECTIONS)
  private List<UpdateAamsMappingForSelectionRequestItem> selections;

  public static final String SERIALIZED_NAME_MATCH_MARKET_WITH_UNIQUE_VARS = "MatchMarketWithUniqueVars";
  @SerializedName(SERIALIZED_NAME_MATCH_MARKET_WITH_UNIQUE_VARS)
  private List<MatchMarketWithUniqueVarsRequestItem> matchMarketWithUniqueVars;

  public static final String SERIALIZED_NAME_MARKET_TYPE_ID = "MarketTypeId";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE_ID)
  private Integer marketTypeId;

  public UpdateAamsMappingForMatchMarketRequest() {
  }

  public UpdateAamsMappingForMatchMarketRequest intSportId(Integer intSportId) {
    this.intSportId = intSportId;
    return this;
  }

   /**
   * Get intSportId
   * @return intSportId
  **/
  @javax.annotation.Nullable
  public Integer getIntSportId() {
    return intSportId;
  }

  public void setIntSportId(Integer intSportId) {
    this.intSportId = intSportId;
  }


  public UpdateAamsMappingForMatchMarketRequest selections(List<UpdateAamsMappingForSelectionRequestItem> selections) {
    this.selections = selections;
    return this;
  }

  public UpdateAamsMappingForMatchMarketRequest addSelectionsItem(UpdateAamsMappingForSelectionRequestItem selectionsItem) {
    if (this.selections == null) {
      this.selections = new ArrayList<>();
    }
    this.selections.add(selectionsItem);
    return this;
  }

   /**
   * Get selections
   * @return selections
  **/
  @javax.annotation.Nullable
  public List<UpdateAamsMappingForSelectionRequestItem> getSelections() {
    return selections;
  }

  public void setSelections(List<UpdateAamsMappingForSelectionRequestItem> selections) {
    this.selections = selections;
  }


  public UpdateAamsMappingForMatchMarketRequest matchMarketWithUniqueVars(List<MatchMarketWithUniqueVarsRequestItem> matchMarketWithUniqueVars) {
    this.matchMarketWithUniqueVars = matchMarketWithUniqueVars;
    return this;
  }

  public UpdateAamsMappingForMatchMarketRequest addMatchMarketWithUniqueVarsItem(MatchMarketWithUniqueVarsRequestItem matchMarketWithUniqueVarsItem) {
    if (this.matchMarketWithUniqueVars == null) {
      this.matchMarketWithUniqueVars = new ArrayList<>();
    }
    this.matchMarketWithUniqueVars.add(matchMarketWithUniqueVarsItem);
    return this;
  }

   /**
   * Get matchMarketWithUniqueVars
   * @return matchMarketWithUniqueVars
  **/
  @javax.annotation.Nullable
  public List<MatchMarketWithUniqueVarsRequestItem> getMatchMarketWithUniqueVars() {
    return matchMarketWithUniqueVars;
  }

  public void setMatchMarketWithUniqueVars(List<MatchMarketWithUniqueVarsRequestItem> matchMarketWithUniqueVars) {
    this.matchMarketWithUniqueVars = matchMarketWithUniqueVars;
  }


  public UpdateAamsMappingForMatchMarketRequest marketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
    return this;
  }

   /**
   * Get marketTypeId
   * @return marketTypeId
  **/
  @javax.annotation.Nullable
  public Integer getMarketTypeId() {
    return marketTypeId;
  }

  public void setMarketTypeId(Integer marketTypeId) {
    this.marketTypeId = marketTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAamsMappingForMatchMarketRequest updateAamsMappingForMatchMarketRequest = (UpdateAamsMappingForMatchMarketRequest) o;
    return Objects.equals(this.intSportId, updateAamsMappingForMatchMarketRequest.intSportId) &&
        Objects.equals(this.selections, updateAamsMappingForMatchMarketRequest.selections) &&
        Objects.equals(this.matchMarketWithUniqueVars, updateAamsMappingForMatchMarketRequest.matchMarketWithUniqueVars) &&
        Objects.equals(this.marketTypeId, updateAamsMappingForMatchMarketRequest.marketTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intSportId, selections, matchMarketWithUniqueVars, marketTypeId);
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
    sb.append("class UpdateAamsMappingForMatchMarketRequest {\n");
    sb.append("    intSportId: ").append(toIndentedString(intSportId)).append("\n");
    sb.append("    selections: ").append(toIndentedString(selections)).append("\n");
    sb.append("    matchMarketWithUniqueVars: ").append(toIndentedString(matchMarketWithUniqueVars)).append("\n");
    sb.append("    marketTypeId: ").append(toIndentedString(marketTypeId)).append("\n");
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
    openapiFields.add("IntSportId");
    openapiFields.add("Selections");
    openapiFields.add("MatchMarketWithUniqueVars");
    openapiFields.add("MarketTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateAamsMappingForMatchMarketRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAamsMappingForMatchMarketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAamsMappingForMatchMarketRequest is not found in the empty JSON string", UpdateAamsMappingForMatchMarketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAamsMappingForMatchMarketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAamsMappingForMatchMarketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Selections") != null && !jsonObj.get("Selections").isJsonNull()) {
        JsonArray jsonArrayselections = jsonObj.getAsJsonArray("Selections");
        if (jsonArrayselections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Selections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Selections` to be an array in the JSON string but got `%s`", jsonObj.get("Selections").toString()));
          }

          // validate the optional field `Selections` (array)
          for (int i = 0; i < jsonArrayselections.size(); i++) {
            UpdateAamsMappingForSelectionRequestItem.validateJsonElement(jsonArrayselections.get(i));
          };
        }
      }
      if (jsonObj.get("MatchMarketWithUniqueVars") != null && !jsonObj.get("MatchMarketWithUniqueVars").isJsonNull()) {
        JsonArray jsonArraymatchMarketWithUniqueVars = jsonObj.getAsJsonArray("MatchMarketWithUniqueVars");
        if (jsonArraymatchMarketWithUniqueVars != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MatchMarketWithUniqueVars").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MatchMarketWithUniqueVars` to be an array in the JSON string but got `%s`", jsonObj.get("MatchMarketWithUniqueVars").toString()));
          }

          // validate the optional field `MatchMarketWithUniqueVars` (array)
          for (int i = 0; i < jsonArraymatchMarketWithUniqueVars.size(); i++) {
            MatchMarketWithUniqueVarsRequestItem.validateJsonElement(jsonArraymatchMarketWithUniqueVars.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAamsMappingForMatchMarketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAamsMappingForMatchMarketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAamsMappingForMatchMarketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAamsMappingForMatchMarketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAamsMappingForMatchMarketRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAamsMappingForMatchMarketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAamsMappingForMatchMarketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateAamsMappingForMatchMarketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAamsMappingForMatchMarketRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateAamsMappingForMatchMarketRequest
  */
  public static UpdateAamsMappingForMatchMarketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAamsMappingForMatchMarketRequest.class);
  }

 /**
  * Convert an instance of UpdateAamsMappingForMatchMarketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

