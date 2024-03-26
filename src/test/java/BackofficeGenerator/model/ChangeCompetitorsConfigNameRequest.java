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
 * ChangeCompetitorsConfigNameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ChangeCompetitorsConfigNameRequest {
  public static final String SERIALIZED_NAME_NEW_NAME = "NewName";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public ChangeCompetitorsConfigNameRequest() {
  }

  public ChangeCompetitorsConfigNameRequest newName(String newName) {
    this.newName = newName;
    return this;
  }

   /**
   * Get newName
   * @return newName
  **/
  @javax.annotation.Nullable
  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }


  public ChangeCompetitorsConfigNameRequest configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeCompetitorsConfigNameRequest changeCompetitorsConfigNameRequest = (ChangeCompetitorsConfigNameRequest) o;
    return Objects.equals(this.newName, changeCompetitorsConfigNameRequest.newName) &&
        Objects.equals(this.configId, changeCompetitorsConfigNameRequest.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(newName, configId);
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
    sb.append("class ChangeCompetitorsConfigNameRequest {\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
    openapiFields.add("NewName");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeCompetitorsConfigNameRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeCompetitorsConfigNameRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeCompetitorsConfigNameRequest is not found in the empty JSON string", ChangeCompetitorsConfigNameRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeCompetitorsConfigNameRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeCompetitorsConfigNameRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("NewName") != null && !jsonObj.get("NewName").isJsonNull()) && !jsonObj.get("NewName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NewName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NewName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeCompetitorsConfigNameRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeCompetitorsConfigNameRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeCompetitorsConfigNameRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeCompetitorsConfigNameRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeCompetitorsConfigNameRequest>() {
           @Override
           public void write(JsonWriter out, ChangeCompetitorsConfigNameRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeCompetitorsConfigNameRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeCompetitorsConfigNameRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeCompetitorsConfigNameRequest
  * @throws IOException if the JSON string is invalid with respect to ChangeCompetitorsConfigNameRequest
  */
  public static ChangeCompetitorsConfigNameRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeCompetitorsConfigNameRequest.class);
  }

 /**
  * Convert an instance of ChangeCompetitorsConfigNameRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

