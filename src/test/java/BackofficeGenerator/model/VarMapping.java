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
 * VarMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class VarMapping {
  public static final String SERIALIZED_NAME_SPECIFIER_ID = "SpecifierId";
  @SerializedName(SERIALIZED_NAME_SPECIFIER_ID)
  private Integer specifierId;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public static final String SERIALIZED_NAME_VAR_TYPE = "VarType";
  @SerializedName(SERIALIZED_NAME_VAR_TYPE)
  private Integer varType;

  public VarMapping() {
  }

  public VarMapping specifierId(Integer specifierId) {
    this.specifierId = specifierId;
    return this;
  }

   /**
   * Get specifierId
   * @return specifierId
  **/
  @javax.annotation.Nullable
  public Integer getSpecifierId() {
    return specifierId;
  }

  public void setSpecifierId(Integer specifierId) {
    this.specifierId = specifierId;
  }


  public VarMapping value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  public VarMapping varType(Integer varType) {
    this.varType = varType;
    return this;
  }

   /**
   * Get varType
   * @return varType
  **/
  @javax.annotation.Nullable
  public Integer getVarType() {
    return varType;
  }

  public void setVarType(Integer varType) {
    this.varType = varType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VarMapping varMapping = (VarMapping) o;
    return Objects.equals(this.specifierId, varMapping.specifierId) &&
        Objects.equals(this.value, varMapping.value) &&
        Objects.equals(this.varType, varMapping.varType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(specifierId, value, varType);
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
    sb.append("class VarMapping {\n");
    sb.append("    specifierId: ").append(toIndentedString(specifierId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    varType: ").append(toIndentedString(varType)).append("\n");
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
    openapiFields.add("SpecifierId");
    openapiFields.add("Value");
    openapiFields.add("VarType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VarMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VarMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VarMapping is not found in the empty JSON string", VarMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VarMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VarMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VarMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VarMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VarMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VarMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<VarMapping>() {
           @Override
           public void write(JsonWriter out, VarMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VarMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VarMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VarMapping
  * @throws IOException if the JSON string is invalid with respect to VarMapping
  */
  public static VarMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VarMapping.class);
  }

 /**
  * Convert an instance of VarMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

