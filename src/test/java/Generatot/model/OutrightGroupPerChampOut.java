/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * OutrightGroupPerChampOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class OutrightGroupPerChampOut {
  public static final String SERIALIZED_NAME_CHAMP_ID = "ChampId";
  @SerializedName(SERIALIZED_NAME_CHAMP_ID)
  private Integer champId;

  public static final String SERIALIZED_NAME_GROUPS = "Groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<OutrightGroupOut> groups = new ArrayList<>();

  public OutrightGroupPerChampOut() {
  }

  public OutrightGroupPerChampOut champId(Integer champId) {
    this.champId = champId;
    return this;
  }

   /**
   * Get champId
   * @return champId
  **/
  @javax.annotation.Nonnull
  public Integer getChampId() {
    return champId;
  }

  public void setChampId(Integer champId) {
    this.champId = champId;
  }


  public OutrightGroupPerChampOut groups(List<OutrightGroupOut> groups) {
    this.groups = groups;
    return this;
  }

  public OutrightGroupPerChampOut addGroupsItem(OutrightGroupOut groupsItem) {
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
  @javax.annotation.Nonnull
  public List<OutrightGroupOut> getGroups() {
    return groups;
  }

  public void setGroups(List<OutrightGroupOut> groups) {
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
    OutrightGroupPerChampOut outrightGroupPerChampOut = (OutrightGroupPerChampOut) o;
    return Objects.equals(this.champId, outrightGroupPerChampOut.champId) &&
        Objects.equals(this.groups, outrightGroupPerChampOut.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(champId, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutrightGroupPerChampOut {\n");
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
    openapiRequiredFields.add("ChampId");
    openapiRequiredFields.add("Groups");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OutrightGroupPerChampOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutrightGroupPerChampOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutrightGroupPerChampOut is not found in the empty JSON string", OutrightGroupPerChampOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OutrightGroupPerChampOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutrightGroupPerChampOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutrightGroupPerChampOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Groups` to be an array in the JSON string but got `%s`", jsonObj.get("Groups").toString()));
      }

      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("Groups");
      // validate the required field `Groups` (array)
      for (int i = 0; i < jsonArraygroups.size(); i++) {
        OutrightGroupOut.validateJsonElement(jsonArraygroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutrightGroupPerChampOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutrightGroupPerChampOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutrightGroupPerChampOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutrightGroupPerChampOut.class));

       return (TypeAdapter<T>) new TypeAdapter<OutrightGroupPerChampOut>() {
           @Override
           public void write(JsonWriter out, OutrightGroupPerChampOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutrightGroupPerChampOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutrightGroupPerChampOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutrightGroupPerChampOut
  * @throws IOException if the JSON string is invalid with respect to OutrightGroupPerChampOut
  */
  public static OutrightGroupPerChampOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutrightGroupPerChampOut.class);
  }

 /**
  * Convert an instance of OutrightGroupPerChampOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
