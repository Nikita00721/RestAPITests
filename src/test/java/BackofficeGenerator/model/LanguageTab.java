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
 * LanguageTab
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LanguageTab {
  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "LanguageName";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_TOP_EVENTS = "TopEvents";
  @SerializedName(SERIALIZED_NAME_TOP_EVENTS)
  private List<ConfigTopEvent> topEvents;

  public static final String SERIALIZED_NAME_SPORT_TABS = "SportTabs";
  @SerializedName(SERIALIZED_NAME_SPORT_TABS)
  private List<SportTab> sportTabs;

  public static final String SERIALIZED_NAME_LANGUAGE_ID = "LanguageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private Integer languageId;

  public LanguageTab() {
  }

  public LanguageTab languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

   /**
   * Get languageName
   * @return languageName
  **/
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public LanguageTab topEvents(List<ConfigTopEvent> topEvents) {
    this.topEvents = topEvents;
    return this;
  }

  public LanguageTab addTopEventsItem(ConfigTopEvent topEventsItem) {
    if (this.topEvents == null) {
      this.topEvents = new ArrayList<>();
    }
    this.topEvents.add(topEventsItem);
    return this;
  }

   /**
   * Get topEvents
   * @return topEvents
  **/
  @javax.annotation.Nullable
  public List<ConfigTopEvent> getTopEvents() {
    return topEvents;
  }

  public void setTopEvents(List<ConfigTopEvent> topEvents) {
    this.topEvents = topEvents;
  }


  public LanguageTab sportTabs(List<SportTab> sportTabs) {
    this.sportTabs = sportTabs;
    return this;
  }

  public LanguageTab addSportTabsItem(SportTab sportTabsItem) {
    if (this.sportTabs == null) {
      this.sportTabs = new ArrayList<>();
    }
    this.sportTabs.add(sportTabsItem);
    return this;
  }

   /**
   * Get sportTabs
   * @return sportTabs
  **/
  @javax.annotation.Nullable
  public List<SportTab> getSportTabs() {
    return sportTabs;
  }

  public void setSportTabs(List<SportTab> sportTabs) {
    this.sportTabs = sportTabs;
  }


  public LanguageTab languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @javax.annotation.Nullable
  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageTab languageTab = (LanguageTab) o;
    return Objects.equals(this.languageName, languageTab.languageName) &&
        Objects.equals(this.topEvents, languageTab.topEvents) &&
        Objects.equals(this.sportTabs, languageTab.sportTabs) &&
        Objects.equals(this.languageId, languageTab.languageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageName, topEvents, sportTabs, languageId);
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
    sb.append("class LanguageTab {\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    topEvents: ").append(toIndentedString(topEvents)).append("\n");
    sb.append("    sportTabs: ").append(toIndentedString(sportTabs)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
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
    openapiFields.add("LanguageName");
    openapiFields.add("TopEvents");
    openapiFields.add("SportTabs");
    openapiFields.add("LanguageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LanguageTab
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LanguageTab.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LanguageTab is not found in the empty JSON string", LanguageTab.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LanguageTab.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LanguageTab` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LanguageName") != null && !jsonObj.get("LanguageName").isJsonNull()) && !jsonObj.get("LanguageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LanguageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LanguageName").toString()));
      }
      if (jsonObj.get("TopEvents") != null && !jsonObj.get("TopEvents").isJsonNull()) {
        JsonArray jsonArraytopEvents = jsonObj.getAsJsonArray("TopEvents");
        if (jsonArraytopEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("TopEvents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `TopEvents` to be an array in the JSON string but got `%s`", jsonObj.get("TopEvents").toString()));
          }

          // validate the optional field `TopEvents` (array)
          for (int i = 0; i < jsonArraytopEvents.size(); i++) {
            ConfigTopEvent.validateJsonElement(jsonArraytopEvents.get(i));
          };
        }
      }
      if (jsonObj.get("SportTabs") != null && !jsonObj.get("SportTabs").isJsonNull()) {
        JsonArray jsonArraysportTabs = jsonObj.getAsJsonArray("SportTabs");
        if (jsonArraysportTabs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SportTabs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SportTabs` to be an array in the JSON string but got `%s`", jsonObj.get("SportTabs").toString()));
          }

          // validate the optional field `SportTabs` (array)
          for (int i = 0; i < jsonArraysportTabs.size(); i++) {
            SportTab.validateJsonElement(jsonArraysportTabs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LanguageTab.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LanguageTab' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LanguageTab> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LanguageTab.class));

       return (TypeAdapter<T>) new TypeAdapter<LanguageTab>() {
           @Override
           public void write(JsonWriter out, LanguageTab value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LanguageTab read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LanguageTab given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LanguageTab
  * @throws IOException if the JSON string is invalid with respect to LanguageTab
  */
  public static LanguageTab fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LanguageTab.class);
  }

 /**
  * Convert an instance of LanguageTab to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

