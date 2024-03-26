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
 * BrandTopEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BrandTopEvent {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENT_DATE = "EventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_SPORT = "Sport";
  @SerializedName(SERIALIZED_NAME_SPORT)
  private String sport;

  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CHAMPIONSHIP = "Championship";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIP)
  private String championship;

  public static final String SERIALIZED_NAME_HEADER_MARKET_ID = "HeaderMarketId";
  @SerializedName(SERIALIZED_NAME_HEADER_MARKET_ID)
  private Integer headerMarketId;

  public static final String SERIALIZED_NAME_ORDER = "Order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_IS_LIVE = "IsLive";
  @SerializedName(SERIALIZED_NAME_IS_LIVE)
  private Boolean isLive;

  public static final String SERIALIZED_NAME_POSSIBLE_HEADER_MARKETS = "PossibleHeaderMarkets";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_HEADER_MARKETS)
  private List<TopEventHeaderMarket> possibleHeaderMarkets;

  public static final String SERIALIZED_NAME_EVENT_ID = "EventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId;

  public BrandTopEvent() {
  }

  public BrandTopEvent name(String name) {
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


  public BrandTopEvent eventDate(OffsetDateTime eventDate) {
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


  public BrandTopEvent sport(String sport) {
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


  public BrandTopEvent category(String category) {
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


  public BrandTopEvent championship(String championship) {
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


  public BrandTopEvent headerMarketId(Integer headerMarketId) {
    this.headerMarketId = headerMarketId;
    return this;
  }

   /**
   * Get headerMarketId
   * @return headerMarketId
  **/
  @javax.annotation.Nullable
  public Integer getHeaderMarketId() {
    return headerMarketId;
  }

  public void setHeaderMarketId(Integer headerMarketId) {
    this.headerMarketId = headerMarketId;
  }


  public BrandTopEvent order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public BrandTopEvent isLive(Boolean isLive) {
    this.isLive = isLive;
    return this;
  }

   /**
   * Get isLive
   * @return isLive
  **/
  @javax.annotation.Nullable
  public Boolean getIsLive() {
    return isLive;
  }

  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }


  public BrandTopEvent possibleHeaderMarkets(List<TopEventHeaderMarket> possibleHeaderMarkets) {
    this.possibleHeaderMarkets = possibleHeaderMarkets;
    return this;
  }

  public BrandTopEvent addPossibleHeaderMarketsItem(TopEventHeaderMarket possibleHeaderMarketsItem) {
    if (this.possibleHeaderMarkets == null) {
      this.possibleHeaderMarkets = new ArrayList<>();
    }
    this.possibleHeaderMarkets.add(possibleHeaderMarketsItem);
    return this;
  }

   /**
   * Get possibleHeaderMarkets
   * @return possibleHeaderMarkets
  **/
  @javax.annotation.Nullable
  public List<TopEventHeaderMarket> getPossibleHeaderMarkets() {
    return possibleHeaderMarkets;
  }

  public void setPossibleHeaderMarkets(List<TopEventHeaderMarket> possibleHeaderMarkets) {
    this.possibleHeaderMarkets = possibleHeaderMarkets;
  }


  public BrandTopEvent eventId(Long eventId) {
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
    BrandTopEvent brandTopEvent = (BrandTopEvent) o;
    return Objects.equals(this.name, brandTopEvent.name) &&
        Objects.equals(this.eventDate, brandTopEvent.eventDate) &&
        Objects.equals(this.sport, brandTopEvent.sport) &&
        Objects.equals(this.category, brandTopEvent.category) &&
        Objects.equals(this.championship, brandTopEvent.championship) &&
        Objects.equals(this.headerMarketId, brandTopEvent.headerMarketId) &&
        Objects.equals(this.order, brandTopEvent.order) &&
        Objects.equals(this.isLive, brandTopEvent.isLive) &&
        Objects.equals(this.possibleHeaderMarkets, brandTopEvent.possibleHeaderMarkets) &&
        Objects.equals(this.eventId, brandTopEvent.eventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, eventDate, sport, category, championship, headerMarketId, order, isLive, possibleHeaderMarkets, eventId);
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
    sb.append("class BrandTopEvent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    sport: ").append(toIndentedString(sport)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    championship: ").append(toIndentedString(championship)).append("\n");
    sb.append("    headerMarketId: ").append(toIndentedString(headerMarketId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    possibleHeaderMarkets: ").append(toIndentedString(possibleHeaderMarkets)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("EventDate");
    openapiFields.add("Sport");
    openapiFields.add("Category");
    openapiFields.add("Championship");
    openapiFields.add("HeaderMarketId");
    openapiFields.add("Order");
    openapiFields.add("IsLive");
    openapiFields.add("PossibleHeaderMarkets");
    openapiFields.add("EventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BrandTopEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BrandTopEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandTopEvent is not found in the empty JSON string", BrandTopEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BrandTopEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandTopEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Sport") != null && !jsonObj.get("Sport").isJsonNull()) && !jsonObj.get("Sport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sport").toString()));
      }
      if ((jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull()) && !jsonObj.get("Category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Category").toString()));
      }
      if ((jsonObj.get("Championship") != null && !jsonObj.get("Championship").isJsonNull()) && !jsonObj.get("Championship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Championship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Championship").toString()));
      }
      if (jsonObj.get("PossibleHeaderMarkets") != null && !jsonObj.get("PossibleHeaderMarkets").isJsonNull()) {
        JsonArray jsonArraypossibleHeaderMarkets = jsonObj.getAsJsonArray("PossibleHeaderMarkets");
        if (jsonArraypossibleHeaderMarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PossibleHeaderMarkets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PossibleHeaderMarkets` to be an array in the JSON string but got `%s`", jsonObj.get("PossibleHeaderMarkets").toString()));
          }

          // validate the optional field `PossibleHeaderMarkets` (array)
          for (int i = 0; i < jsonArraypossibleHeaderMarkets.size(); i++) {
            TopEventHeaderMarket.validateJsonElement(jsonArraypossibleHeaderMarkets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandTopEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandTopEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandTopEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandTopEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandTopEvent>() {
           @Override
           public void write(JsonWriter out, BrandTopEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandTopEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandTopEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandTopEvent
  * @throws IOException if the JSON string is invalid with respect to BrandTopEvent
  */
  public static BrandTopEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandTopEvent.class);
  }

 /**
  * Convert an instance of BrandTopEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
