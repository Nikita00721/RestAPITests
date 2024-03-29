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
 * LotteryTypeItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LotteryTypeItem {
  public static final String SERIALIZED_NAME_LOTTERY_TYPE_NAME = "LotteryTypeName";
  @SerializedName(SERIALIZED_NAME_LOTTERY_TYPE_NAME)
  private String lotteryTypeName;

  public static final String SERIALIZED_NAME_LOTTERY_TYPE_ID = "LotteryTypeId";
  @SerializedName(SERIALIZED_NAME_LOTTERY_TYPE_ID)
  private Integer lotteryTypeId;

  public LotteryTypeItem() {
  }

  public LotteryTypeItem lotteryTypeName(String lotteryTypeName) {
    this.lotteryTypeName = lotteryTypeName;
    return this;
  }

   /**
   * Get lotteryTypeName
   * @return lotteryTypeName
  **/
  @javax.annotation.Nullable
  public String getLotteryTypeName() {
    return lotteryTypeName;
  }

  public void setLotteryTypeName(String lotteryTypeName) {
    this.lotteryTypeName = lotteryTypeName;
  }


  public LotteryTypeItem lotteryTypeId(Integer lotteryTypeId) {
    this.lotteryTypeId = lotteryTypeId;
    return this;
  }

   /**
   * Get lotteryTypeId
   * @return lotteryTypeId
  **/
  @javax.annotation.Nullable
  public Integer getLotteryTypeId() {
    return lotteryTypeId;
  }

  public void setLotteryTypeId(Integer lotteryTypeId) {
    this.lotteryTypeId = lotteryTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LotteryTypeItem lotteryTypeItem = (LotteryTypeItem) o;
    return Objects.equals(this.lotteryTypeName, lotteryTypeItem.lotteryTypeName) &&
        Objects.equals(this.lotteryTypeId, lotteryTypeItem.lotteryTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lotteryTypeName, lotteryTypeId);
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
    sb.append("class LotteryTypeItem {\n");
    sb.append("    lotteryTypeName: ").append(toIndentedString(lotteryTypeName)).append("\n");
    sb.append("    lotteryTypeId: ").append(toIndentedString(lotteryTypeId)).append("\n");
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
    openapiFields.add("LotteryTypeName");
    openapiFields.add("LotteryTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LotteryTypeItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LotteryTypeItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LotteryTypeItem is not found in the empty JSON string", LotteryTypeItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LotteryTypeItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LotteryTypeItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LotteryTypeName") != null && !jsonObj.get("LotteryTypeName").isJsonNull()) && !jsonObj.get("LotteryTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LotteryTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LotteryTypeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LotteryTypeItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LotteryTypeItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LotteryTypeItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LotteryTypeItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LotteryTypeItem>() {
           @Override
           public void write(JsonWriter out, LotteryTypeItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LotteryTypeItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LotteryTypeItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LotteryTypeItem
  * @throws IOException if the JSON string is invalid with respect to LotteryTypeItem
  */
  public static LotteryTypeItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LotteryTypeItem.class);
  }

 /**
  * Convert an instance of LotteryTypeItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

