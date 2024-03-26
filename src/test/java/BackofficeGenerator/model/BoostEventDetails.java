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
import java.time.OffsetDateTime;
import java.util.*;

/**
 * BoostEventDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostEventDetails {
  public static final String SERIALIZED_NAME_EVENT_DATE = "EventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_EVENT_NAME = "EventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Integer sportId;

  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Integer champId;

  public static final String SERIALIZED_NAME_TEMPLATE = "Template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private BoostTemplateShortModel template;

  public static final String SERIALIZED_NAME_GOLDEN_BOOSTS = "GoldenBoosts";
  @SerializedName(SERIALIZED_NAME_GOLDEN_BOOSTS)
  private List<BoostItemDetailWithMarket> goldenBoosts;

  public static final String SERIALIZED_NAME_SIMPLE_BOOSTS = "SimpleBoosts";
  @SerializedName(SERIALIZED_NAME_SIMPLE_BOOSTS)
  private List<BoostItemDetailWithMarket> simpleBoosts;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public BoostEventDetails() {
  }

  public BoostEventDetails(
     List<BoostItemDetailWithMarket> goldenBoosts,
     List<BoostItemDetailWithMarket> simpleBoosts
  ) {
    this();
    this.goldenBoosts = goldenBoosts;
    this.simpleBoosts = simpleBoosts;
  }

  public BoostEventDetails eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public BoostEventDetails eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public BoostEventDetails sportId(Integer sportId) {
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


  public BoostEventDetails champId(Integer champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nullable
  public Integer getChampId() {
    return champId;
  }

  public void setChampId(Integer champId) {
    this.champId = champId;
  }


  public BoostEventDetails template(BoostTemplateShortModel template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public BoostTemplateShortModel getTemplate() {
    return template;
  }

  public void setTemplate(BoostTemplateShortModel template) {
    this.template = template;
  }


   /**
   * Get goldenBoosts
   * @return goldenBoosts
  **/
  @javax.annotation.Nullable
  public List<BoostItemDetailWithMarket> getGoldenBoosts() {
    return goldenBoosts;
  }



   /**
   * Get simpleBoosts
   * @return simpleBoosts
  **/
  @javax.annotation.Nullable
  public List<BoostItemDetailWithMarket> getSimpleBoosts() {
    return simpleBoosts;
  }



  public BoostEventDetails eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostEventDetails boostEventDetails = (BoostEventDetails) o;
    return Objects.equals(this.eventDate, boostEventDetails.eventDate) &&
        Objects.equals(this.eventName, boostEventDetails.eventName) &&
        Objects.equals(this.sportId, boostEventDetails.sportId) &&
        Objects.equals(this.champId, boostEventDetails.champId) &&
        Objects.equals(this.template, boostEventDetails.template) &&
        Objects.equals(this.goldenBoosts, boostEventDetails.goldenBoosts) &&
        Objects.equals(this.simpleBoosts, boostEventDetails.simpleBoosts) &&
        Objects.equals(this.eventId, boostEventDetails.eventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventName, sportId, champId, template, goldenBoosts, simpleBoosts, eventId);
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
    sb.append("class BoostEventDetails {\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    goldenBoosts: ").append(toIndentedString(goldenBoosts)).append("\n");
    sb.append("    simpleBoosts: ").append(toIndentedString(simpleBoosts)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
    openapiFields.add("EventDate");
    openapiFields.add("EventName");
    openapiFields.add("SportId");
    openapiFields.add("ChampId");
    openapiFields.add("Template");
    openapiFields.add("GoldenBoosts");
    openapiFields.add("SimpleBoosts");
    openapiFields.add("EventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostEventDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostEventDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostEventDetails is not found in the empty JSON string", BoostEventDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostEventDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostEventDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EventName") != null && !jsonObj.get("EventName").isJsonNull()) && !jsonObj.get("EventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EventName").toString()));
      }
      // validate the optional field `Template`
      if (jsonObj.get("Template") != null && !jsonObj.get("Template").isJsonNull()) {
        BoostTemplateShortModel.validateJsonElement(jsonObj.get("Template"));
      }
      if (jsonObj.get("GoldenBoosts") != null && !jsonObj.get("GoldenBoosts").isJsonNull()) {
        JsonArray jsonArraygoldenBoosts = jsonObj.getAsJsonArray("GoldenBoosts");
        if (jsonArraygoldenBoosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("GoldenBoosts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `GoldenBoosts` to be an array in the JSON string but got `%s`", jsonObj.get("GoldenBoosts").toString()));
          }

          // validate the optional field `GoldenBoosts` (array)
          for (int i = 0; i < jsonArraygoldenBoosts.size(); i++) {
            BoostItemDetailWithMarket.validateJsonElement(jsonArraygoldenBoosts.get(i));
          };
        }
      }
      if (jsonObj.get("SimpleBoosts") != null && !jsonObj.get("SimpleBoosts").isJsonNull()) {
        JsonArray jsonArraysimpleBoosts = jsonObj.getAsJsonArray("SimpleBoosts");
        if (jsonArraysimpleBoosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SimpleBoosts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SimpleBoosts` to be an array in the JSON string but got `%s`", jsonObj.get("SimpleBoosts").toString()));
          }

          // validate the optional field `SimpleBoosts` (array)
          for (int i = 0; i < jsonArraysimpleBoosts.size(); i++) {
            BoostItemDetailWithMarket.validateJsonElement(jsonArraysimpleBoosts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostEventDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostEventDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostEventDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostEventDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostEventDetails>() {
           @Override
           public void write(JsonWriter out, BoostEventDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostEventDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostEventDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostEventDetails
  * @throws IOException if the JSON string is invalid with respect to BoostEventDetails
  */
  public static BoostEventDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostEventDetails.class);
  }

 /**
  * Convert an instance of BoostEventDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

