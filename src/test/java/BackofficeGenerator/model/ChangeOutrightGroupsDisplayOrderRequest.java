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
 * ChangeOutrightGroupsDisplayOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChangeOutrightGroupsDisplayOrderRequest {
  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Integer champId;

  public static final String SERIALIZED_NAME_GROUPS = "Groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupRequestItem> groups;

  public ChangeOutrightGroupsDisplayOrderRequest() {
  }

  public ChangeOutrightGroupsDisplayOrderRequest champId(Integer champId) {
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


  public ChangeOutrightGroupsDisplayOrderRequest groups(List<GroupRequestItem> groups) {
    this.groups = groups;
    return this;
  }

  public ChangeOutrightGroupsDisplayOrderRequest addGroupsItem(GroupRequestItem groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<GroupRequestItem> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupRequestItem> groups) {
    this.groups = groups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeOutrightGroupsDisplayOrderRequest changeOutrightGroupsDisplayOrderRequest = (ChangeOutrightGroupsDisplayOrderRequest) o;
    return Objects.equals(this.champId, changeOutrightGroupsDisplayOrderRequest.champId) &&
        Objects.equals(this.groups, changeOutrightGroupsDisplayOrderRequest.groups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(champId, groups);
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
    sb.append("class ChangeOutrightGroupsDisplayOrderRequest {\n");
    sb.append("    champId: ").append(toIndentedString(champId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("ChampId");
    openapiFields.add("Groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeOutrightGroupsDisplayOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeOutrightGroupsDisplayOrderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeOutrightGroupsDisplayOrderRequest is not found in the empty JSON string", ChangeOutrightGroupsDisplayOrderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeOutrightGroupsDisplayOrderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeOutrightGroupsDisplayOrderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Groups") != null && !jsonObj.get("Groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("Groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Groups` to be an array in the JSON string but got `%s`", jsonObj.get("Groups").toString()));
          }

          // validate the optional field `Groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            GroupRequestItem.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeOutrightGroupsDisplayOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeOutrightGroupsDisplayOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeOutrightGroupsDisplayOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeOutrightGroupsDisplayOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeOutrightGroupsDisplayOrderRequest>() {
           @Override
           public void write(JsonWriter out, ChangeOutrightGroupsDisplayOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeOutrightGroupsDisplayOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeOutrightGroupsDisplayOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeOutrightGroupsDisplayOrderRequest
  * @throws IOException if the JSON string is invalid with respect to ChangeOutrightGroupsDisplayOrderRequest
  */
  public static ChangeOutrightGroupsDisplayOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeOutrightGroupsDisplayOrderRequest.class);
  }

 /**
  * Convert an instance of ChangeOutrightGroupsDisplayOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

