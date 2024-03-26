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
 * MatchMarketMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MatchMarketMapping {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_SELECTIONS = "Selections";
  @SerializedName(SERIALIZED_NAME_SELECTIONS)
  private List<MatchMarketSelelectionMapping> selections;

  public static final String SERIALIZED_NAME_MATCH_MARKET_UNIQUE_VARS = "MatchMarketUniqueVars";
  @SerializedName(SERIALIZED_NAME_MATCH_MARKET_UNIQUE_VARS)
  private List<MatchMarketUniqueVarMappings> matchMarketUniqueVars;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public MatchMarketMapping() {
  }

  public MatchMarketMapping name(String name) {
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


  public MatchMarketMapping sportName(String sportName) {
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


  public MatchMarketMapping selections(List<MatchMarketSelelectionMapping> selections) {
    this.selections = selections;
    return this;
  }

  public MatchMarketMapping addSelectionsItem(MatchMarketSelelectionMapping selectionsItem) {
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
  public List<MatchMarketSelelectionMapping> getSelections() {
    return selections;
  }

  public void setSelections(List<MatchMarketSelelectionMapping> selections) {
    this.selections = selections;
  }


  public MatchMarketMapping matchMarketUniqueVars(List<MatchMarketUniqueVarMappings> matchMarketUniqueVars) {
    this.matchMarketUniqueVars = matchMarketUniqueVars;
    return this;
  }

  public MatchMarketMapping addMatchMarketUniqueVarsItem(MatchMarketUniqueVarMappings matchMarketUniqueVarsItem) {
    if (this.matchMarketUniqueVars == null) {
      this.matchMarketUniqueVars = new ArrayList<>();
    }
    this.matchMarketUniqueVars.add(matchMarketUniqueVarsItem);
    return this;
  }

   /**
   * Get matchMarketUniqueVars
   * @return matchMarketUniqueVars
  **/
  @javax.annotation.Nullable
  public List<MatchMarketUniqueVarMappings> getMatchMarketUniqueVars() {
    return matchMarketUniqueVars;
  }

  public void setMatchMarketUniqueVars(List<MatchMarketUniqueVarMappings> matchMarketUniqueVars) {
    this.matchMarketUniqueVars = matchMarketUniqueVars;
  }


  public MatchMarketMapping id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchMarketMapping matchMarketMapping = (MatchMarketMapping) o;
    return Objects.equals(this.name, matchMarketMapping.name) &&
        Objects.equals(this.sportName, matchMarketMapping.sportName) &&
        Objects.equals(this.selections, matchMarketMapping.selections) &&
        Objects.equals(this.matchMarketUniqueVars, matchMarketMapping.matchMarketUniqueVars) &&
        Objects.equals(this.id, matchMarketMapping.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sportName, selections, matchMarketUniqueVars, id);
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
    sb.append("class MatchMarketMapping {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    selections: ").append(toIndentedString(selections)).append("\n");
    sb.append("    matchMarketUniqueVars: ").append(toIndentedString(matchMarketUniqueVars)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("SportName");
    openapiFields.add("Selections");
    openapiFields.add("MatchMarketUniqueVars");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MatchMarketMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MatchMarketMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchMarketMapping is not found in the empty JSON string", MatchMarketMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MatchMarketMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchMarketMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if (jsonObj.get("Selections") != null && !jsonObj.get("Selections").isJsonNull()) {
        JsonArray jsonArrayselections = jsonObj.getAsJsonArray("Selections");
        if (jsonArrayselections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Selections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Selections` to be an array in the JSON string but got `%s`", jsonObj.get("Selections").toString()));
          }

          // validate the optional field `Selections` (array)
          for (int i = 0; i < jsonArrayselections.size(); i++) {
            MatchMarketSelelectionMapping.validateJsonElement(jsonArrayselections.get(i));
          };
        }
      }
      if (jsonObj.get("MatchMarketUniqueVars") != null && !jsonObj.get("MatchMarketUniqueVars").isJsonNull()) {
        JsonArray jsonArraymatchMarketUniqueVars = jsonObj.getAsJsonArray("MatchMarketUniqueVars");
        if (jsonArraymatchMarketUniqueVars != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MatchMarketUniqueVars").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MatchMarketUniqueVars` to be an array in the JSON string but got `%s`", jsonObj.get("MatchMarketUniqueVars").toString()));
          }

          // validate the optional field `MatchMarketUniqueVars` (array)
          for (int i = 0; i < jsonArraymatchMarketUniqueVars.size(); i++) {
            MatchMarketUniqueVarMappings.validateJsonElement(jsonArraymatchMarketUniqueVars.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchMarketMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchMarketMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchMarketMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchMarketMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchMarketMapping>() {
           @Override
           public void write(JsonWriter out, MatchMarketMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchMarketMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MatchMarketMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MatchMarketMapping
  * @throws IOException if the JSON string is invalid with respect to MatchMarketMapping
  */
  public static MatchMarketMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchMarketMapping.class);
  }

 /**
  * Convert an instance of MatchMarketMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

