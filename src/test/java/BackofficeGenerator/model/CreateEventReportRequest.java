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
 * CreateEventReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CreateEventReportRequest {
  public static final String SERIALIZED_NAME_INTEGRATION = "Integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;

  public static final String SERIALIZED_NAME_PROBLEM_TYPE = "ProblemType";
  @SerializedName(SERIALIZED_NAME_PROBLEM_TYPE)
  private ProblemType problemType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INT_EVENT_ID = "IntEventId";
  @SerializedName(SERIALIZED_NAME_INT_EVENT_ID)
  private Long intEventId;

  public CreateEventReportRequest() {
  }

  public CreateEventReportRequest integration(String integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  public String getIntegration() {
    return integration;
  }

  public void setIntegration(String integration) {
    this.integration = integration;
  }


  public CreateEventReportRequest problemType(ProblemType problemType) {
    this.problemType = problemType;
    return this;
  }

   /**
   * Get problemType
   * @return problemType
  **/
  @javax.annotation.Nullable
  public ProblemType getProblemType() {
    return problemType;
  }

  public void setProblemType(ProblemType problemType) {
    this.problemType = problemType;
  }


  public CreateEventReportRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateEventReportRequest intEventId(Long intEventId) {
    this.intEventId = intEventId;
    return this;
  }

   /**
   * Get intEventId
   * @return intEventId
  **/
  @javax.annotation.Nullable
  public Long getIntEventId() {
    return intEventId;
  }

  public void setIntEventId(Long intEventId) {
    this.intEventId = intEventId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEventReportRequest createEventReportRequest = (CreateEventReportRequest) o;
    return Objects.equals(this.integration, createEventReportRequest.integration) &&
        Objects.equals(this.problemType, createEventReportRequest.problemType) &&
        Objects.equals(this.description, createEventReportRequest.description) &&
        Objects.equals(this.intEventId, createEventReportRequest.intEventId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(integration, problemType, description, intEventId);
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
    sb.append("class CreateEventReportRequest {\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    problemType: ").append(toIndentedString(problemType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    intEventId: ").append(toIndentedString(intEventId)).append("\n");
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
    openapiFields.add("Integration");
    openapiFields.add("ProblemType");
    openapiFields.add("Description");
    openapiFields.add("IntEventId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateEventReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEventReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEventReportRequest is not found in the empty JSON string", CreateEventReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEventReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEventReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Integration") != null && !jsonObj.get("Integration").isJsonNull()) && !jsonObj.get("Integration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Integration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Integration").toString()));
      }
      // validate the optional field `ProblemType`
      if (jsonObj.get("ProblemType") != null && !jsonObj.get("ProblemType").isJsonNull()) {
        ProblemType.validateJsonElement(jsonObj.get("ProblemType"));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEventReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEventReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEventReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEventReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEventReportRequest>() {
           @Override
           public void write(JsonWriter out, CreateEventReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEventReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEventReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEventReportRequest
  * @throws IOException if the JSON string is invalid with respect to CreateEventReportRequest
  */
  public static CreateEventReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEventReportRequest.class);
  }

 /**
  * Convert an instance of CreateEventReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

