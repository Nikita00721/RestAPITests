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
 * AamsSkins
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AamsSkins {
  public static final String SERIALIZED_NAME_LICENSE_NAME = "LicenseName";
  @SerializedName(SERIALIZED_NAME_LICENSE_NAME)
  private String licenseName;

  public static final String SERIALIZED_NAME_OPERATOR_NAME = "OperatorName";
  @SerializedName(SERIALIZED_NAME_OPERATOR_NAME)
  private String operatorName;

  public static final String SERIALIZED_NAME_SKIN_ID = "SkinId";
  @SerializedName(SERIALIZED_NAME_SKIN_ID)
  private Integer skinId;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "OperatorId";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private Integer operatorId;

  public static final String SERIALIZED_NAME_IS_ENABLE = "IsEnable";
  @SerializedName(SERIALIZED_NAME_IS_ENABLE)
  private Boolean isEnable;

  public static final String SERIALIZED_NAME_SKIN_NAME = "SkinName";
  @SerializedName(SERIALIZED_NAME_SKIN_NAME)
  private String skinName;

  public AamsSkins() {
  }

  public AamsSkins licenseName(String licenseName) {
    this.licenseName = licenseName;
    return this;
  }

   /**
   * Get licenseName
   * @return licenseName
  **/
  @javax.annotation.Nullable
  public String getLicenseName() {
    return licenseName;
  }

  public void setLicenseName(String licenseName) {
    this.licenseName = licenseName;
  }


  public AamsSkins operatorName(String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @javax.annotation.Nullable
  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public AamsSkins skinId(Integer skinId) {
    this.skinId = skinId;
    return this;
  }

   /**
   * Get skinId
   * @return skinId
  **/
  @javax.annotation.Nullable
  public Integer getSkinId() {
    return skinId;
  }

  public void setSkinId(Integer skinId) {
    this.skinId = skinId;
  }


  public AamsSkins operatorId(Integer operatorId) {
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


  public AamsSkins isEnable(Boolean isEnable) {
    this.isEnable = isEnable;
    return this;
  }

   /**
   * Get isEnable
   * @return isEnable
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(Boolean isEnable) {
    this.isEnable = isEnable;
  }


  public AamsSkins skinName(String skinName) {
    this.skinName = skinName;
    return this;
  }

   /**
   * Get skinName
   * @return skinName
  **/
  @javax.annotation.Nullable
  public String getSkinName() {
    return skinName;
  }

  public void setSkinName(String skinName) {
    this.skinName = skinName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AamsSkins aamsSkins = (AamsSkins) o;
    return Objects.equals(this.licenseName, aamsSkins.licenseName) &&
        Objects.equals(this.operatorName, aamsSkins.operatorName) &&
        Objects.equals(this.skinId, aamsSkins.skinId) &&
        Objects.equals(this.operatorId, aamsSkins.operatorId) &&
        Objects.equals(this.isEnable, aamsSkins.isEnable) &&
        Objects.equals(this.skinName, aamsSkins.skinName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseName, operatorName, skinId, operatorId, isEnable, skinName);
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
    sb.append("class AamsSkins {\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    skinId: ").append(toIndentedString(skinId)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
    sb.append("    skinName: ").append(toIndentedString(skinName)).append("\n");
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
    openapiFields.add("LicenseName");
    openapiFields.add("OperatorName");
    openapiFields.add("SkinId");
    openapiFields.add("OperatorId");
    openapiFields.add("IsEnable");
    openapiFields.add("SkinName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AamsSkins
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AamsSkins.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AamsSkins is not found in the empty JSON string", AamsSkins.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AamsSkins.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AamsSkins` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LicenseName") != null && !jsonObj.get("LicenseName").isJsonNull()) && !jsonObj.get("LicenseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LicenseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LicenseName").toString()));
      }
      if ((jsonObj.get("OperatorName") != null && !jsonObj.get("OperatorName").isJsonNull()) && !jsonObj.get("OperatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OperatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OperatorName").toString()));
      }
      if ((jsonObj.get("SkinName") != null && !jsonObj.get("SkinName").isJsonNull()) && !jsonObj.get("SkinName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SkinName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SkinName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AamsSkins.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AamsSkins' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AamsSkins> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AamsSkins.class));

       return (TypeAdapter<T>) new TypeAdapter<AamsSkins>() {
           @Override
           public void write(JsonWriter out, AamsSkins value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AamsSkins read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AamsSkins given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AamsSkins
  * @throws IOException if the JSON string is invalid with respect to AamsSkins
  */
  public static AamsSkins fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AamsSkins.class);
  }

 /**
  * Convert an instance of AamsSkins to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
