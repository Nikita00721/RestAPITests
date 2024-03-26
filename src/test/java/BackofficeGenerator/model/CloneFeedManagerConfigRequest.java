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
 * CloneFeedManagerConfigRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CloneFeedManagerConfigRequest {
  public static final String SERIALIZED_NAME_CLONE_NAME = "CloneName";
  @SerializedName(SERIALIZED_NAME_CLONE_NAME)
  private String cloneName;

  public static final String SERIALIZED_NAME_SOURCE_CONFIG_ID = "SourceConfigId";
  @SerializedName(SERIALIZED_NAME_SOURCE_CONFIG_ID)
  private Integer sourceConfigId;

  public CloneFeedManagerConfigRequest() {
  }

  public CloneFeedManagerConfigRequest cloneName(String cloneName) {
    this.cloneName = cloneName;
    return this;
  }

   /**
   * Get cloneName
   * @return cloneName
  **/
  @javax.annotation.Nullable
  public String getCloneName() {
    return cloneName;
  }

  public void setCloneName(String cloneName) {
    this.cloneName = cloneName;
  }


  public CloneFeedManagerConfigRequest sourceConfigId(Integer sourceConfigId) {
    this.sourceConfigId = sourceConfigId;
    return this;
  }

   /**
   * Get sourceConfigId
   * @return sourceConfigId
  **/
  @javax.annotation.Nullable
  public Integer getSourceConfigId() {
    return sourceConfigId;
  }

  public void setSourceConfigId(Integer sourceConfigId) {
    this.sourceConfigId = sourceConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneFeedManagerConfigRequest cloneFeedManagerConfigRequest = (CloneFeedManagerConfigRequest) o;
    return Objects.equals(this.cloneName, cloneFeedManagerConfigRequest.cloneName) &&
        Objects.equals(this.sourceConfigId, cloneFeedManagerConfigRequest.sourceConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneName, sourceConfigId);
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
    sb.append("class CloneFeedManagerConfigRequest {\n");
    sb.append("    cloneName: ").append(toIndentedString(cloneName)).append("\n");
    sb.append("    sourceConfigId: ").append(toIndentedString(sourceConfigId)).append("\n");
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
    openapiFields.add("CloneName");
    openapiFields.add("SourceConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloneFeedManagerConfigRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloneFeedManagerConfigRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloneFeedManagerConfigRequest is not found in the empty JSON string", CloneFeedManagerConfigRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloneFeedManagerConfigRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloneFeedManagerConfigRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CloneName") != null && !jsonObj.get("CloneName").isJsonNull()) && !jsonObj.get("CloneName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CloneName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CloneName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloneFeedManagerConfigRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloneFeedManagerConfigRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloneFeedManagerConfigRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloneFeedManagerConfigRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CloneFeedManagerConfigRequest>() {
           @Override
           public void write(JsonWriter out, CloneFeedManagerConfigRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloneFeedManagerConfigRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloneFeedManagerConfigRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloneFeedManagerConfigRequest
  * @throws IOException if the JSON string is invalid with respect to CloneFeedManagerConfigRequest
  */
  public static CloneFeedManagerConfigRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloneFeedManagerConfigRequest.class);
  }

 /**
  * Convert an instance of CloneFeedManagerConfigRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

