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
 * GetAamsRefundByTimeInfoRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetAamsRefundByTimeInfoRequestFilters {
  public static final String SERIALIZED_NAME_EXT_EVENT_ID = "ExtEventId";
  @SerializedName(SERIALIZED_NAME_EXT_EVENT_ID)
  private String extEventId;

  public static final String SERIALIZED_NAME_EXT_MARKET_ID = "ExtMarketId";
  @SerializedName(SERIALIZED_NAME_EXT_MARKET_ID)
  private Integer extMarketId;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public GetAamsRefundByTimeInfoRequestFilters() {
  }

  public GetAamsRefundByTimeInfoRequestFilters extEventId(String extEventId) {
    this.extEventId = extEventId;
    return this;
  }

   /**
   * Get extEventId
   * @return extEventId
  **/
  @javax.annotation.Nullable
  public String getExtEventId() {
    return extEventId;
  }

  public void setExtEventId(String extEventId) {
    this.extEventId = extEventId;
  }


  public GetAamsRefundByTimeInfoRequestFilters extMarketId(Integer extMarketId) {
    this.extMarketId = extMarketId;
    return this;
  }

   /**
   * Get extMarketId
   * @return extMarketId
  **/
  @javax.annotation.Nullable
  public Integer getExtMarketId() {
    return extMarketId;
  }

  public void setExtMarketId(Integer extMarketId) {
    this.extMarketId = extMarketId;
  }


  public GetAamsRefundByTimeInfoRequestFilters operatorId(Integer operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @javax.annotation.Nullable
  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAamsRefundByTimeInfoRequestFilters getAamsRefundByTimeInfoRequestFilters = (GetAamsRefundByTimeInfoRequestFilters) o;
    return Objects.equals(this.extEventId, getAamsRefundByTimeInfoRequestFilters.extEventId) &&
        Objects.equals(this.extMarketId, getAamsRefundByTimeInfoRequestFilters.extMarketId) &&
        Objects.equals(this.operatorId, getAamsRefundByTimeInfoRequestFilters.operatorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(extEventId, extMarketId, operatorId);
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
    sb.append("class GetAamsRefundByTimeInfoRequestFilters {\n");
    sb.append("    extEventId: ").append(toIndentedString(extEventId)).append("\n");
    sb.append("    extMarketId: ").append(toIndentedString(extMarketId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
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
    openapiFields.add("ExtEventId");
    openapiFields.add("ExtMarketId");
    openapiFields.add("OperatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAamsRefundByTimeInfoRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAamsRefundByTimeInfoRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAamsRefundByTimeInfoRequestFilters is not found in the empty JSON string", GetAamsRefundByTimeInfoRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAamsRefundByTimeInfoRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAamsRefundByTimeInfoRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExtEventId") != null && !jsonObj.get("ExtEventId").isJsonNull()) && !jsonObj.get("ExtEventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtEventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtEventId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAamsRefundByTimeInfoRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAamsRefundByTimeInfoRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAamsRefundByTimeInfoRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAamsRefundByTimeInfoRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAamsRefundByTimeInfoRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetAamsRefundByTimeInfoRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAamsRefundByTimeInfoRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAamsRefundByTimeInfoRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAamsRefundByTimeInfoRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetAamsRefundByTimeInfoRequestFilters
  */
  public static GetAamsRefundByTimeInfoRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAamsRefundByTimeInfoRequestFilters.class);
  }

 /**
  * Convert an instance of GetAamsRefundByTimeInfoRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

