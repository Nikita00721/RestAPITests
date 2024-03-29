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
 * CreateCompetitorsConfigRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CreateCompetitorsConfigRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "AccessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private AccessTypes accessType;

  public static final String SERIALIZED_NAME_IS_PRIVATE = "IsPrivate";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE)
  private Boolean isPrivate;

  public CreateCompetitorsConfigRequest() {
  }

  public CreateCompetitorsConfigRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateCompetitorsConfigRequest accessType(AccessTypes accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nullable
  public AccessTypes getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessTypes accessType) {
    this.accessType = accessType;
  }


  public CreateCompetitorsConfigRequest isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompetitorsConfigRequest createCompetitorsConfigRequest = (CreateCompetitorsConfigRequest) o;
    return Objects.equals(this.name, createCompetitorsConfigRequest.name) &&
        Objects.equals(this.accessType, createCompetitorsConfigRequest.accessType) &&
        Objects.equals(this.isPrivate, createCompetitorsConfigRequest.isPrivate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accessType, isPrivate);
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
    sb.append("class CreateCompetitorsConfigRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("AccessType");
    openapiFields.add("IsPrivate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCompetitorsConfigRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCompetitorsConfigRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompetitorsConfigRequest is not found in the empty JSON string", CreateCompetitorsConfigRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCompetitorsConfigRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCompetitorsConfigRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `AccessType`
      if (jsonObj.get("AccessType") != null && !jsonObj.get("AccessType").isJsonNull()) {
        AccessTypes.validateJsonElement(jsonObj.get("AccessType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompetitorsConfigRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompetitorsConfigRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompetitorsConfigRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompetitorsConfigRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompetitorsConfigRequest>() {
           @Override
           public void write(JsonWriter out, CreateCompetitorsConfigRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCompetitorsConfigRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCompetitorsConfigRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompetitorsConfigRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCompetitorsConfigRequest
  */
  public static CreateCompetitorsConfigRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompetitorsConfigRequest.class);
  }

 /**
  * Convert an instance of CreateCompetitorsConfigRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

