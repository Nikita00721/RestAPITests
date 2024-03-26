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

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * LiabilityReportId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class LiabilityReportId {
  public static final String SERIALIZED_NAME_EXPIRE_DATE = "ExpireDate";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private OffsetDateTime expireDate;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public LiabilityReportId() {
  }

  public LiabilityReportId expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }


  public LiabilityReportId id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiabilityReportId liabilityReportId = (LiabilityReportId) o;
    return Objects.equals(this.expireDate, liabilityReportId.expireDate) &&
        Objects.equals(this.id, liabilityReportId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireDate, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiabilityReportId {\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("ExpireDate");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LiabilityReportId
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LiabilityReportId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiabilityReportId is not found in the empty JSON string", LiabilityReportId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LiabilityReportId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiabilityReportId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiabilityReportId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiabilityReportId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiabilityReportId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiabilityReportId.class));

       return (TypeAdapter<T>) new TypeAdapter<LiabilityReportId>() {
           @Override
           public void write(JsonWriter out, LiabilityReportId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiabilityReportId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiabilityReportId given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiabilityReportId
  * @throws IOException if the JSON string is invalid with respect to LiabilityReportId
  */
  public static LiabilityReportId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiabilityReportId.class);
  }

 /**
  * Convert an instance of LiabilityReportId to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

