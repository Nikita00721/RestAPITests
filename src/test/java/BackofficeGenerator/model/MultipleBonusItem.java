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
 * MultipleBonusItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MultipleBonusItem {
  public static final String SERIALIZED_NAME_MULTIPLE_BONUS_NAME = "MultipleBonusName";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BONUS_NAME)
  private String multipleBonusName;

  public static final String SERIALIZED_NAME_MULTIPLE_BONUS_ID = "MultipleBonusId";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BONUS_ID)
  private Integer multipleBonusId;

  public MultipleBonusItem() {
  }

  public MultipleBonusItem multipleBonusName(String multipleBonusName) {
    this.multipleBonusName = multipleBonusName;
    return this;
  }

   /**
   * Get multipleBonusName
   * @return multipleBonusName
  **/
  @javax.annotation.Nullable
  public String getMultipleBonusName() {
    return multipleBonusName;
  }

  public void setMultipleBonusName(String multipleBonusName) {
    this.multipleBonusName = multipleBonusName;
  }


  public MultipleBonusItem multipleBonusId(Integer multipleBonusId) {
    this.multipleBonusId = multipleBonusId;
    return this;
  }

   /**
   * Get multipleBonusId
   * @return multipleBonusId
  **/
  @javax.annotation.Nullable
  public Integer getMultipleBonusId() {
    return multipleBonusId;
  }

  public void setMultipleBonusId(Integer multipleBonusId) {
    this.multipleBonusId = multipleBonusId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleBonusItem multipleBonusItem = (MultipleBonusItem) o;
    return Objects.equals(this.multipleBonusName, multipleBonusItem.multipleBonusName) &&
        Objects.equals(this.multipleBonusId, multipleBonusItem.multipleBonusId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleBonusName, multipleBonusId);
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
    sb.append("class MultipleBonusItem {\n");
    sb.append("    multipleBonusName: ").append(toIndentedString(multipleBonusName)).append("\n");
    sb.append("    multipleBonusId: ").append(toIndentedString(multipleBonusId)).append("\n");
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
    openapiFields.add("MultipleBonusName");
    openapiFields.add("MultipleBonusId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultipleBonusItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultipleBonusItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultipleBonusItem is not found in the empty JSON string", MultipleBonusItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultipleBonusItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultipleBonusItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("MultipleBonusName") != null && !jsonObj.get("MultipleBonusName").isJsonNull()) && !jsonObj.get("MultipleBonusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MultipleBonusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MultipleBonusName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultipleBonusItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultipleBonusItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultipleBonusItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultipleBonusItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MultipleBonusItem>() {
           @Override
           public void write(JsonWriter out, MultipleBonusItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultipleBonusItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultipleBonusItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultipleBonusItem
  * @throws IOException if the JSON string is invalid with respect to MultipleBonusItem
  */
  public static MultipleBonusItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultipleBonusItem.class);
  }

 /**
  * Convert an instance of MultipleBonusItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

