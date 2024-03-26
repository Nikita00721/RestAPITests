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
 * ChangeVSportGamesOrderRequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChangeVSportGamesOrderRequestItem {
  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_VSPORT_GAME_ID = "VSportGameId";
  @SerializedName(SERIALIZED_NAME_VSPORT_GAME_ID)
  private Integer vsportGameId;

  public ChangeVSportGamesOrderRequestItem() {
  }

  public ChangeVSportGamesOrderRequestItem sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }


  public ChangeVSportGamesOrderRequestItem vsportGameId(Integer vsportGameId) {
    this.vsportGameId = vsportGameId;
    return this;
  }

   /**
   * Get vsportGameId
   * @return vsportGameId
  **/
  @javax.annotation.Nullable
  public Integer getVsportGameId() {
    return vsportGameId;
  }

  public void setVsportGameId(Integer vsportGameId) {
    this.vsportGameId = vsportGameId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeVSportGamesOrderRequestItem changeVSportGamesOrderRequestItem = (ChangeVSportGamesOrderRequestItem) o;
    return Objects.equals(this.sortOrder, changeVSportGamesOrderRequestItem.sortOrder) &&
        Objects.equals(this.vsportGameId, changeVSportGamesOrderRequestItem.vsportGameId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, vsportGameId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeVSportGamesOrderRequestItem {\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    vsportGameId: ").append(toIndentedString(vsportGameId)).append("\n");
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
    openapiFields.add("SortOrder");
    openapiFields.add("VSportGameId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeVSportGamesOrderRequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeVSportGamesOrderRequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeVSportGamesOrderRequestItem is not found in the empty JSON string", ChangeVSportGamesOrderRequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeVSportGamesOrderRequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeVSportGamesOrderRequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeVSportGamesOrderRequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeVSportGamesOrderRequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeVSportGamesOrderRequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeVSportGamesOrderRequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeVSportGamesOrderRequestItem>() {
           @Override
           public void write(JsonWriter out, ChangeVSportGamesOrderRequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeVSportGamesOrderRequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeVSportGamesOrderRequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeVSportGamesOrderRequestItem
  * @throws IOException if the JSON string is invalid with respect to ChangeVSportGamesOrderRequestItem
  */
  public static ChangeVSportGamesOrderRequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeVSportGamesOrderRequestItem.class);
  }

 /**
  * Convert an instance of ChangeVSportGamesOrderRequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

