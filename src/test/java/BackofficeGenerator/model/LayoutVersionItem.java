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
 * LayoutVersionItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LayoutVersionItem {
  public static final String SERIALIZED_NAME_TIMESTAMP = "Timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_CREATED_BY_USER = "CreatedByUser";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER)
  private String createdByUser;

  public static final String SERIALIZED_NAME_VERSION_ID = "VersionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private Integer versionId;

  public LayoutVersionItem() {
  }

  public LayoutVersionItem timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public LayoutVersionItem createdByUser(String createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * Get createdByUser
   * @return createdByUser
  **/
  @javax.annotation.Nullable
  public String getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(String createdByUser) {
    this.createdByUser = createdByUser;
  }


  public LayoutVersionItem versionId(Integer versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @javax.annotation.Nullable
  public Integer getVersionId() {
    return versionId;
  }

  public void setVersionId(Integer versionId) {
    this.versionId = versionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutVersionItem layoutVersionItem = (LayoutVersionItem) o;
    return Objects.equals(this.timestamp, layoutVersionItem.timestamp) &&
        Objects.equals(this.createdByUser, layoutVersionItem.createdByUser) &&
        Objects.equals(this.versionId, layoutVersionItem.versionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, createdByUser, versionId);
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
    sb.append("class LayoutVersionItem {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
    openapiFields.add("Timestamp");
    openapiFields.add("CreatedByUser");
    openapiFields.add("VersionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LayoutVersionItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LayoutVersionItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LayoutVersionItem is not found in the empty JSON string", LayoutVersionItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LayoutVersionItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LayoutVersionItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CreatedByUser") != null && !jsonObj.get("CreatedByUser").isJsonNull()) && !jsonObj.get("CreatedByUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreatedByUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreatedByUser").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LayoutVersionItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LayoutVersionItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LayoutVersionItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LayoutVersionItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LayoutVersionItem>() {
           @Override
           public void write(JsonWriter out, LayoutVersionItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LayoutVersionItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LayoutVersionItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LayoutVersionItem
  * @throws IOException if the JSON string is invalid with respect to LayoutVersionItem
  */
  public static LayoutVersionItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LayoutVersionItem.class);
  }

 /**
  * Convert an instance of LayoutVersionItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
