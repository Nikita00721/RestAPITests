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
 * UpdateAamsMappingForSportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class UpdateAamsMappingForSportRequest {
  public static final String SERIALIZED_NAME_AAMS_SPORTS_TO_ADD = "AamsSportsToAdd";
  @SerializedName(SERIALIZED_NAME_AAMS_SPORTS_TO_ADD)
  private List<Integer> aamsSportsToAdd;

  public static final String SERIALIZED_NAME_AAMS_SPORTS_TO_REMOVE = "AamsSportsToRemove";
  @SerializedName(SERIALIZED_NAME_AAMS_SPORTS_TO_REMOVE)
  private List<Integer> aamsSportsToRemove;

  public static final String SERIALIZED_NAME_INTERNAL_SPORT_ID = "InternalSportId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_SPORT_ID)
  private Integer internalSportId;

  public UpdateAamsMappingForSportRequest() {
  }

  public UpdateAamsMappingForSportRequest aamsSportsToAdd(List<Integer> aamsSportsToAdd) {
    this.aamsSportsToAdd = aamsSportsToAdd;
    return this;
  }

  public UpdateAamsMappingForSportRequest addAamsSportsToAddItem(Integer aamsSportsToAddItem) {
    if (this.aamsSportsToAdd == null) {
      this.aamsSportsToAdd = new ArrayList<>();
    }
    this.aamsSportsToAdd.add(aamsSportsToAddItem);
    return this;
  }

   /**
   * Get aamsSportsToAdd
   * @return aamsSportsToAdd
  **/
  @javax.annotation.Nullable
  public List<Integer> getAamsSportsToAdd() {
    return aamsSportsToAdd;
  }

  public void setAamsSportsToAdd(List<Integer> aamsSportsToAdd) {
    this.aamsSportsToAdd = aamsSportsToAdd;
  }


  public UpdateAamsMappingForSportRequest aamsSportsToRemove(List<Integer> aamsSportsToRemove) {
    this.aamsSportsToRemove = aamsSportsToRemove;
    return this;
  }

  public UpdateAamsMappingForSportRequest addAamsSportsToRemoveItem(Integer aamsSportsToRemoveItem) {
    if (this.aamsSportsToRemove == null) {
      this.aamsSportsToRemove = new ArrayList<>();
    }
    this.aamsSportsToRemove.add(aamsSportsToRemoveItem);
    return this;
  }

   /**
   * Get aamsSportsToRemove
   * @return aamsSportsToRemove
  **/
  @javax.annotation.Nullable
  public List<Integer> getAamsSportsToRemove() {
    return aamsSportsToRemove;
  }

  public void setAamsSportsToRemove(List<Integer> aamsSportsToRemove) {
    this.aamsSportsToRemove = aamsSportsToRemove;
  }


  public UpdateAamsMappingForSportRequest internalSportId(Integer internalSportId) {
    this.internalSportId = internalSportId;
    return this;
  }

   /**
   * Get internalSportId
   * @return internalSportId
  **/
  @javax.annotation.Nullable
  public Integer getInternalSportId() {
    return internalSportId;
  }

  public void setInternalSportId(Integer internalSportId) {
    this.internalSportId = internalSportId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAamsMappingForSportRequest updateAamsMappingForSportRequest = (UpdateAamsMappingForSportRequest) o;
    return Objects.equals(this.aamsSportsToAdd, updateAamsMappingForSportRequest.aamsSportsToAdd) &&
        Objects.equals(this.aamsSportsToRemove, updateAamsMappingForSportRequest.aamsSportsToRemove) &&
        Objects.equals(this.internalSportId, updateAamsMappingForSportRequest.internalSportId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aamsSportsToAdd, aamsSportsToRemove, internalSportId);
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
    sb.append("class UpdateAamsMappingForSportRequest {\n");
    sb.append("    aamsSportsToAdd: ").append(toIndentedString(aamsSportsToAdd)).append("\n");
    sb.append("    aamsSportsToRemove: ").append(toIndentedString(aamsSportsToRemove)).append("\n");
    sb.append("    internalSportId: ").append(toIndentedString(internalSportId)).append("\n");
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
    openapiFields.add("AamsSportsToAdd");
    openapiFields.add("AamsSportsToRemove");
    openapiFields.add("InternalSportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateAamsMappingForSportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAamsMappingForSportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAamsMappingForSportRequest is not found in the empty JSON string", UpdateAamsMappingForSportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAamsMappingForSportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAamsMappingForSportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("AamsSportsToAdd") != null && !jsonObj.get("AamsSportsToAdd").isJsonNull() && !jsonObj.get("AamsSportsToAdd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AamsSportsToAdd` to be an array in the JSON string but got `%s`", jsonObj.get("AamsSportsToAdd").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("AamsSportsToRemove") != null && !jsonObj.get("AamsSportsToRemove").isJsonNull() && !jsonObj.get("AamsSportsToRemove").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AamsSportsToRemove` to be an array in the JSON string but got `%s`", jsonObj.get("AamsSportsToRemove").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAamsMappingForSportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAamsMappingForSportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAamsMappingForSportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAamsMappingForSportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAamsMappingForSportRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAamsMappingForSportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAamsMappingForSportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateAamsMappingForSportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAamsMappingForSportRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateAamsMappingForSportRequest
  */
  public static UpdateAamsMappingForSportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAamsMappingForSportRequest.class);
  }

 /**
  * Convert an instance of UpdateAamsMappingForSportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

