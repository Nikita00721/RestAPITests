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
 * DeleteCountrySportSelectionConfigs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class DeleteCountrySportSelectionConfigs {
  public static final String SERIALIZED_NAME_CONFIG_IDS = "ConfigIds";
  @SerializedName(SERIALIZED_NAME_CONFIG_IDS)
  private List<Integer> configIds;

  public DeleteCountrySportSelectionConfigs() {
  }

  public DeleteCountrySportSelectionConfigs configIds(List<Integer> configIds) {
    this.configIds = configIds;
    return this;
  }

  public DeleteCountrySportSelectionConfigs addConfigIdsItem(Integer configIdsItem) {
    if (this.configIds == null) {
      this.configIds = new ArrayList<>();
    }
    this.configIds.add(configIdsItem);
    return this;
  }

   /**
   * Get configIds
   * @return configIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getConfigIds() {
    return configIds;
  }

  public void setConfigIds(List<Integer> configIds) {
    this.configIds = configIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCountrySportSelectionConfigs deleteCountrySportSelectionConfigs = (DeleteCountrySportSelectionConfigs) o;
    return Objects.equals(this.configIds, deleteCountrySportSelectionConfigs.configIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configIds);
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
    sb.append("class DeleteCountrySportSelectionConfigs {\n");
    sb.append("    configIds: ").append(toIndentedString(configIds)).append("\n");
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
    openapiFields.add("ConfigIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteCountrySportSelectionConfigs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteCountrySportSelectionConfigs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteCountrySportSelectionConfigs is not found in the empty JSON string", DeleteCountrySportSelectionConfigs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteCountrySportSelectionConfigs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteCountrySportSelectionConfigs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ConfigIds") != null && !jsonObj.get("ConfigIds").isJsonNull() && !jsonObj.get("ConfigIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigIds` to be an array in the JSON string but got `%s`", jsonObj.get("ConfigIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteCountrySportSelectionConfigs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteCountrySportSelectionConfigs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteCountrySportSelectionConfigs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteCountrySportSelectionConfigs.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteCountrySportSelectionConfigs>() {
           @Override
           public void write(JsonWriter out, DeleteCountrySportSelectionConfigs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteCountrySportSelectionConfigs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteCountrySportSelectionConfigs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteCountrySportSelectionConfigs
  * @throws IOException if the JSON string is invalid with respect to DeleteCountrySportSelectionConfigs
  */
  public static DeleteCountrySportSelectionConfigs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteCountrySportSelectionConfigs.class);
  }

 /**
  * Convert an instance of DeleteCountrySportSelectionConfigs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

