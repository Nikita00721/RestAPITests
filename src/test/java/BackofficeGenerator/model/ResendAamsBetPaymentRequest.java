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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * ResendAamsBetPaymentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ResendAamsBetPaymentRequest {
  public static final String SERIALIZED_NAME_INT_BET_ID = "IntBetId";
  @SerializedName(SERIALIZED_NAME_INT_BET_ID)
  private Long intBetId;

  public ResendAamsBetPaymentRequest() {
  }

  public ResendAamsBetPaymentRequest intBetId(Long intBetId) {
    this.intBetId = intBetId;
    return this;
  }

   /**
   * Get intBetId
   * @return intBetId
  **/
  @javax.annotation.Nullable
  public Long getIntBetId() {
    return intBetId;
  }

  public void setIntBetId(Long intBetId) {
    this.intBetId = intBetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResendAamsBetPaymentRequest resendAamsBetPaymentRequest = (ResendAamsBetPaymentRequest) o;
    return Objects.equals(this.intBetId, resendAamsBetPaymentRequest.intBetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intBetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendAamsBetPaymentRequest {\n");
    sb.append("    intBetId: ").append(toIndentedString(intBetId)).append("\n");
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
    openapiFields.add("IntBetId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResendAamsBetPaymentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResendAamsBetPaymentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResendAamsBetPaymentRequest is not found in the empty JSON string", ResendAamsBetPaymentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResendAamsBetPaymentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResendAamsBetPaymentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResendAamsBetPaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResendAamsBetPaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResendAamsBetPaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResendAamsBetPaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ResendAamsBetPaymentRequest>() {
           @Override
           public void write(JsonWriter out, ResendAamsBetPaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResendAamsBetPaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResendAamsBetPaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResendAamsBetPaymentRequest
  * @throws IOException if the JSON string is invalid with respect to ResendAamsBetPaymentRequest
  */
  public static ResendAamsBetPaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResendAamsBetPaymentRequest.class);
  }

 /**
  * Convert an instance of ResendAamsBetPaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
