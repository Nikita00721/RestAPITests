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
 * AuditInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AuditInformation {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "RequestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_REQUEST = "Request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_RESPONSE = "Response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_REQUEST_DATE = "RequestDate";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATE)
  private OffsetDateTime requestDate;

  public AuditInformation() {
  }

  public AuditInformation requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @javax.annotation.Nullable
  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public AuditInformation request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nullable
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }


  public AuditInformation response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  public AuditInformation requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

   /**
   * Get requestDate
   * @return requestDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditInformation auditInformation = (AuditInformation) o;
    return Objects.equals(this.requestType, auditInformation.requestType) &&
        Objects.equals(this.request, auditInformation.request) &&
        Objects.equals(this.response, auditInformation.response) &&
        Objects.equals(this.requestDate, auditInformation.requestDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, request, response, requestDate);
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
    sb.append("class AuditInformation {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
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
    openapiFields.add("RequestType");
    openapiFields.add("Request");
    openapiFields.add("Response");
    openapiFields.add("RequestDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuditInformation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditInformation is not found in the empty JSON string", AuditInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("RequestType") != null && !jsonObj.get("RequestType").isJsonNull()) && !jsonObj.get("RequestType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestType").toString()));
      }
      if ((jsonObj.get("Request") != null && !jsonObj.get("Request").isJsonNull()) && !jsonObj.get("Request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Request").toString()));
      }
      if ((jsonObj.get("Response") != null && !jsonObj.get("Response").isJsonNull()) && !jsonObj.get("Response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Response").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditInformation>() {
           @Override
           public void write(JsonWriter out, AuditInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditInformation
  * @throws IOException if the JSON string is invalid with respect to AuditInformation
  */
  public static AuditInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditInformation.class);
  }

 /**
  * Convert an instance of AuditInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

