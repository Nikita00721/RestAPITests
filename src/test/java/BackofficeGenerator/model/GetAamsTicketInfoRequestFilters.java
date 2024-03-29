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
 * GetAamsTicketInfoRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetAamsTicketInfoRequestFilters {
  public static final String SERIALIZED_NAME_EXT_BET_ID = "ExtBetId";
  @SerializedName(SERIALIZED_NAME_EXT_BET_ID)
  private String extBetId;

  public static final String SERIALIZED_NAME_WITH_COMBINATIONS = "WithCombinations";
  @SerializedName(SERIALIZED_NAME_WITH_COMBINATIONS)
  private Boolean withCombinations;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public GetAamsTicketInfoRequestFilters() {
  }

  public GetAamsTicketInfoRequestFilters extBetId(String extBetId) {
    this.extBetId = extBetId;
    return this;
  }

   /**
   * Get extBetId
   * @return extBetId
  **/
  @javax.annotation.Nullable
  public String getExtBetId() {
    return extBetId;
  }

  public void setExtBetId(String extBetId) {
    this.extBetId = extBetId;
  }


  public GetAamsTicketInfoRequestFilters withCombinations(Boolean withCombinations) {
    this.withCombinations = withCombinations;
    return this;
  }

   /**
   * Get withCombinations
   * @return withCombinations
  **/
  @javax.annotation.Nullable
  public Boolean getWithCombinations() {
    return withCombinations;
  }

  public void setWithCombinations(Boolean withCombinations) {
    this.withCombinations = withCombinations;
  }


  public GetAamsTicketInfoRequestFilters operatorId(Integer operatorId) {
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
    GetAamsTicketInfoRequestFilters getAamsTicketInfoRequestFilters = (GetAamsTicketInfoRequestFilters) o;
    return Objects.equals(this.extBetId, getAamsTicketInfoRequestFilters.extBetId) &&
        Objects.equals(this.withCombinations, getAamsTicketInfoRequestFilters.withCombinations) &&
        Objects.equals(this.operatorId, getAamsTicketInfoRequestFilters.operatorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(extBetId, withCombinations, operatorId);
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
    sb.append("class GetAamsTicketInfoRequestFilters {\n");
    sb.append("    extBetId: ").append(toIndentedString(extBetId)).append("\n");
    sb.append("    withCombinations: ").append(toIndentedString(withCombinations)).append("\n");
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
    openapiFields.add("ExtBetId");
    openapiFields.add("WithCombinations");
    openapiFields.add("OperatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAamsTicketInfoRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAamsTicketInfoRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAamsTicketInfoRequestFilters is not found in the empty JSON string", GetAamsTicketInfoRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAamsTicketInfoRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAamsTicketInfoRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ExtBetId") != null && !jsonObj.get("ExtBetId").isJsonNull()) && !jsonObj.get("ExtBetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtBetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtBetId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAamsTicketInfoRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAamsTicketInfoRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAamsTicketInfoRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAamsTicketInfoRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAamsTicketInfoRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetAamsTicketInfoRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAamsTicketInfoRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAamsTicketInfoRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAamsTicketInfoRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetAamsTicketInfoRequestFilters
  */
  public static GetAamsTicketInfoRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAamsTicketInfoRequestFilters.class);
  }

 /**
  * Convert an instance of GetAamsTicketInfoRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

