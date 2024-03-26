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
 * MappedInternalChamp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MappedInternalChamp {
  public static final String SERIALIZED_NAME_INTERNAL_CHAMP_NAME = "InternalChampName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_CHAMP_NAME)
  private String internalChampName;

  public static final String SERIALIZED_NAME_INTERNAL_CATEGORY_NAME = "InternalCategoryName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_CATEGORY_NAME)
  private String internalCategoryName;

  public static final String SERIALIZED_NAME_INTERNAL_SPORT_NAME = "InternalSportName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_SPORT_NAME)
  private String internalSportName;

  public static final String SERIALIZED_NAME_INTERNAL_SPORT_ID = "InternalSportId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_SPORT_ID)
  private Integer internalSportId;

  public static final String SERIALIZED_NAME_AAMS_CHAMP = "AamsChamp";
  @SerializedName(SERIALIZED_NAME_AAMS_CHAMP)
  private AamsCaterogy aamsChamp;

  public static final String SERIALIZED_NAME_AAMS_CHAMP_ID = "AamsChampId";
  @SerializedName(SERIALIZED_NAME_AAMS_CHAMP_ID)
  private Integer aamsChampId;

  public static final String SERIALIZED_NAME_AAMS_CHAMP_NAME = "AamsChampName";
  @SerializedName(SERIALIZED_NAME_AAMS_CHAMP_NAME)
  private String aamsChampName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MappingStatus status;

  public static final String SERIALIZED_NAME_INTERNAL_CHAMP_ID = "InternalChampId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_CHAMP_ID)
  private Integer internalChampId;

  public MappedInternalChamp() {
  }

  public MappedInternalChamp(
     Integer aamsChampId, 
     String aamsChampName
  ) {
    this();
    this.aamsChampId = aamsChampId;
    this.aamsChampName = aamsChampName;
  }

  public MappedInternalChamp internalChampName(String internalChampName) {
    this.internalChampName = internalChampName;
    return this;
  }

   /**
   * Get internalChampName
   * @return internalChampName
  **/
  @javax.annotation.Nullable
  public String getInternalChampName() {
    return internalChampName;
  }

  public void setInternalChampName(String internalChampName) {
    this.internalChampName = internalChampName;
  }


  public MappedInternalChamp internalCategoryName(String internalCategoryName) {
    this.internalCategoryName = internalCategoryName;
    return this;
  }

   /**
   * Get internalCategoryName
   * @return internalCategoryName
  **/
  @javax.annotation.Nullable
  public String getInternalCategoryName() {
    return internalCategoryName;
  }

  public void setInternalCategoryName(String internalCategoryName) {
    this.internalCategoryName = internalCategoryName;
  }


  public MappedInternalChamp internalSportName(String internalSportName) {
    this.internalSportName = internalSportName;
    return this;
  }

   /**
   * Get internalSportName
   * @return internalSportName
  **/
  @javax.annotation.Nullable
  public String getInternalSportName() {
    return internalSportName;
  }

  public void setInternalSportName(String internalSportName) {
    this.internalSportName = internalSportName;
  }


  public MappedInternalChamp internalSportId(Integer internalSportId) {
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


  public MappedInternalChamp aamsChamp(AamsCaterogy aamsChamp) {
    this.aamsChamp = aamsChamp;
    return this;
  }

   /**
   * Get aamsChamp
   * @return aamsChamp
  **/
  @javax.annotation.Nullable
  public AamsCaterogy getAamsChamp() {
    return aamsChamp;
  }

  public void setAamsChamp(AamsCaterogy aamsChamp) {
    this.aamsChamp = aamsChamp;
  }


   /**
   * Get aamsChampId
   * @return aamsChampId
  **/
  @javax.annotation.Nullable
  public Integer getAamsChampId() {
    return aamsChampId;
  }



   /**
   * Get aamsChampName
   * @return aamsChampName
  **/
  @javax.annotation.Nullable
  public String getAamsChampName() {
    return aamsChampName;
  }



  public MappedInternalChamp status(MappingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public MappingStatus getStatus() {
    return status;
  }

  public void setStatus(MappingStatus status) {
    this.status = status;
  }


  public MappedInternalChamp internalChampId(Integer internalChampId) {
    this.internalChampId = internalChampId;
    return this;
  }

   /**
   * Get internalChampId
   * @return internalChampId
  **/
  @javax.annotation.Nullable
  public Integer getInternalChampId() {
    return internalChampId;
  }

  public void setInternalChampId(Integer internalChampId) {
    this.internalChampId = internalChampId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappedInternalChamp mappedInternalChamp = (MappedInternalChamp) o;
    return Objects.equals(this.internalChampName, mappedInternalChamp.internalChampName) &&
        Objects.equals(this.internalCategoryName, mappedInternalChamp.internalCategoryName) &&
        Objects.equals(this.internalSportName, mappedInternalChamp.internalSportName) &&
        Objects.equals(this.internalSportId, mappedInternalChamp.internalSportId) &&
        Objects.equals(this.aamsChamp, mappedInternalChamp.aamsChamp) &&
        Objects.equals(this.aamsChampId, mappedInternalChamp.aamsChampId) &&
        Objects.equals(this.aamsChampName, mappedInternalChamp.aamsChampName) &&
        Objects.equals(this.status, mappedInternalChamp.status) &&
        Objects.equals(this.internalChampId, mappedInternalChamp.internalChampId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalChampName, internalCategoryName, internalSportName, internalSportId, aamsChamp, aamsChampId, aamsChampName, status, internalChampId);
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
    sb.append("class MappedInternalChamp {\n");
    sb.append("    internalChampName: ").append(toIndentedString(internalChampName)).append("\n");
    sb.append("    internalCategoryName: ").append(toIndentedString(internalCategoryName)).append("\n");
    sb.append("    internalSportName: ").append(toIndentedString(internalSportName)).append("\n");
    sb.append("    internalSportId: ").append(toIndentedString(internalSportId)).append("\n");
    sb.append("    aamsChamp: ").append(toIndentedString(aamsChamp)).append("\n");
    sb.append("    aamsChampId: ").append(toIndentedString(aamsChampId)).append("\n");
    sb.append("    aamsChampName: ").append(toIndentedString(aamsChampName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    internalChampId: ").append(toIndentedString(internalChampId)).append("\n");
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
    openapiFields.add("InternalChampName");
    openapiFields.add("InternalCategoryName");
    openapiFields.add("InternalSportName");
    openapiFields.add("InternalSportId");
    openapiFields.add("AamsChamp");
    openapiFields.add("AamsChampId");
    openapiFields.add("AamsChampName");
    openapiFields.add("Status");
    openapiFields.add("InternalChampId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MappedInternalChamp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MappedInternalChamp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MappedInternalChamp is not found in the empty JSON string", MappedInternalChamp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MappedInternalChamp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MappedInternalChamp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("InternalChampName") != null && !jsonObj.get("InternalChampName").isJsonNull()) && !jsonObj.get("InternalChampName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalChampName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalChampName").toString()));
      }
      if ((jsonObj.get("InternalCategoryName") != null && !jsonObj.get("InternalCategoryName").isJsonNull()) && !jsonObj.get("InternalCategoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalCategoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalCategoryName").toString()));
      }
      if ((jsonObj.get("InternalSportName") != null && !jsonObj.get("InternalSportName").isJsonNull()) && !jsonObj.get("InternalSportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalSportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalSportName").toString()));
      }
      // validate the optional field `AamsChamp`
      if (jsonObj.get("AamsChamp") != null && !jsonObj.get("AamsChamp").isJsonNull()) {
        AamsCaterogy.validateJsonElement(jsonObj.get("AamsChamp"));
      }
      if ((jsonObj.get("AamsChampName") != null && !jsonObj.get("AamsChampName").isJsonNull()) && !jsonObj.get("AamsChampName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AamsChampName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AamsChampName").toString()));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        MappingStatus.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MappedInternalChamp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MappedInternalChamp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MappedInternalChamp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MappedInternalChamp.class));

       return (TypeAdapter<T>) new TypeAdapter<MappedInternalChamp>() {
           @Override
           public void write(JsonWriter out, MappedInternalChamp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MappedInternalChamp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MappedInternalChamp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MappedInternalChamp
  * @throws IOException if the JSON string is invalid with respect to MappedInternalChamp
  */
  public static MappedInternalChamp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MappedInternalChamp.class);
  }

 /**
  * Convert an instance of MappedInternalChamp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

