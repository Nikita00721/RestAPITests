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
 * ResetPendingSelectionsMarketRequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ResetPendingSelectionsMarketRequestItem {
  public static final String SERIALIZED_NAME_BET_CANCEL_ID = "BetCancelId";
  @SerializedName(SERIALIZED_NAME_BET_CANCEL_ID)
  private Long betCancelId;

  public static final String SERIALIZED_NAME_PENDING_SELECTIONS = "PendingSelections";
  @SerializedName(SERIALIZED_NAME_PENDING_SELECTIONS)
  private List<ResetPendingSelectionRequestItem> pendingSelections;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public ResetPendingSelectionsMarketRequestItem() {
  }

  public ResetPendingSelectionsMarketRequestItem betCancelId(Long betCancelId) {
    this.betCancelId = betCancelId;
    return this;
  }

   /**
   * Get betCancelId
   * @return betCancelId
  **/
  @javax.annotation.Nullable
  public Long getBetCancelId() {
    return betCancelId;
  }

  public void setBetCancelId(Long betCancelId) {
    this.betCancelId = betCancelId;
  }


  public ResetPendingSelectionsMarketRequestItem pendingSelections(List<ResetPendingSelectionRequestItem> pendingSelections) {
    this.pendingSelections = pendingSelections;
    return this;
  }

  public ResetPendingSelectionsMarketRequestItem addPendingSelectionsItem(ResetPendingSelectionRequestItem pendingSelectionsItem) {
    if (this.pendingSelections == null) {
      this.pendingSelections = new ArrayList<>();
    }
    this.pendingSelections.add(pendingSelectionsItem);
    return this;
  }

   /**
   * Get pendingSelections
   * @return pendingSelections
  **/
  @javax.annotation.Nullable
  public List<ResetPendingSelectionRequestItem> getPendingSelections() {
    return pendingSelections;
  }

  public void setPendingSelections(List<ResetPendingSelectionRequestItem> pendingSelections) {
    this.pendingSelections = pendingSelections;
  }


  public ResetPendingSelectionsMarketRequestItem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
    ResetPendingSelectionsMarketRequestItem resetPendingSelectionsMarketRequestItem = (ResetPendingSelectionsMarketRequestItem) o;
    return Objects.equals(this.betCancelId, resetPendingSelectionsMarketRequestItem.betCancelId) &&
        Objects.equals(this.pendingSelections, resetPendingSelectionsMarketRequestItem.pendingSelections) &&
        Objects.equals(this.id, resetPendingSelectionsMarketRequestItem.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(betCancelId, pendingSelections, id);
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
    sb.append("class ResetPendingSelectionsMarketRequestItem {\n");
    sb.append("    betCancelId: ").append(toIndentedString(betCancelId)).append("\n");
    sb.append("    pendingSelections: ").append(toIndentedString(pendingSelections)).append("\n");
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
    openapiFields.add("BetCancelId");
    openapiFields.add("PendingSelections");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResetPendingSelectionsMarketRequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResetPendingSelectionsMarketRequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResetPendingSelectionsMarketRequestItem is not found in the empty JSON string", ResetPendingSelectionsMarketRequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResetPendingSelectionsMarketRequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResetPendingSelectionsMarketRequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("PendingSelections") != null && !jsonObj.get("PendingSelections").isJsonNull()) {
        JsonArray jsonArraypendingSelections = jsonObj.getAsJsonArray("PendingSelections");
        if (jsonArraypendingSelections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PendingSelections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PendingSelections` to be an array in the JSON string but got `%s`", jsonObj.get("PendingSelections").toString()));
          }

          // validate the optional field `PendingSelections` (array)
          for (int i = 0; i < jsonArraypendingSelections.size(); i++) {
            ResetPendingSelectionRequestItem.validateJsonElement(jsonArraypendingSelections.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResetPendingSelectionsMarketRequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResetPendingSelectionsMarketRequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResetPendingSelectionsMarketRequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResetPendingSelectionsMarketRequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ResetPendingSelectionsMarketRequestItem>() {
           @Override
           public void write(JsonWriter out, ResetPendingSelectionsMarketRequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResetPendingSelectionsMarketRequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResetPendingSelectionsMarketRequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResetPendingSelectionsMarketRequestItem
  * @throws IOException if the JSON string is invalid with respect to ResetPendingSelectionsMarketRequestItem
  */
  public static ResetPendingSelectionsMarketRequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResetPendingSelectionsMarketRequestItem.class);
  }

 /**
  * Convert an instance of ResetPendingSelectionsMarketRequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

