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
 * MarketGroupChild
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketGroupChild {
  public static final String SERIALIZED_NAME_SUB_GROUP_NAME = "SubGroupName";
  @SerializedName(SERIALIZED_NAME_SUB_GROUP_NAME)
  private String subGroupName;

  public static final String SERIALIZED_NAME_SUB_GROUP_ID = "SubGroupId";
  @SerializedName(SERIALIZED_NAME_SUB_GROUP_ID)
  private Integer subGroupId;

  public MarketGroupChild() {
  }

  public MarketGroupChild subGroupName(String subGroupName) {
    this.subGroupName = subGroupName;
    return this;
  }

   /**
   * Get subGroupName
   * @return subGroupName
  **/
  @javax.annotation.Nullable
  public String getSubGroupName() {
    return subGroupName;
  }

  public void setSubGroupName(String subGroupName) {
    this.subGroupName = subGroupName;
  }


  public MarketGroupChild subGroupId(Integer subGroupId) {
    this.subGroupId = subGroupId;
    return this;
  }

   /**
   * Get subGroupId
   * @return subGroupId
  **/
  @javax.annotation.Nullable
  public Integer getSubGroupId() {
    return subGroupId;
  }

  public void setSubGroupId(Integer subGroupId) {
    this.subGroupId = subGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketGroupChild marketGroupChild = (MarketGroupChild) o;
    return Objects.equals(this.subGroupName, marketGroupChild.subGroupName) &&
        Objects.equals(this.subGroupId, marketGroupChild.subGroupId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(subGroupName, subGroupId);
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
    sb.append("class MarketGroupChild {\n");
    sb.append("    subGroupName: ").append(toIndentedString(subGroupName)).append("\n");
    sb.append("    subGroupId: ").append(toIndentedString(subGroupId)).append("\n");
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
    openapiFields.add("SubGroupName");
    openapiFields.add("SubGroupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketGroupChild
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketGroupChild.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketGroupChild is not found in the empty JSON string", MarketGroupChild.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketGroupChild.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketGroupChild` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SubGroupName") != null && !jsonObj.get("SubGroupName").isJsonNull()) && !jsonObj.get("SubGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubGroupName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketGroupChild.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketGroupChild' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketGroupChild> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketGroupChild.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketGroupChild>() {
           @Override
           public void write(JsonWriter out, MarketGroupChild value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketGroupChild read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketGroupChild given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketGroupChild
  * @throws IOException if the JSON string is invalid with respect to MarketGroupChild
  */
  public static MarketGroupChild fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketGroupChild.class);
  }

 /**
  * Convert an instance of MarketGroupChild to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

