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
 * MappedInternalSport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MappedInternalSport {
  public static final String SERIALIZED_NAME_INTERNAL_SPORT_ID = "InternalSportId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_SPORT_ID)
  private Integer internalSportId;

  public static final String SERIALIZED_NAME_MAPPED_SPORTS = "MappedSports";
  @SerializedName(SERIALIZED_NAME_MAPPED_SPORTS)
  private List<AamsSport> mappedSports;

  public static final String SERIALIZED_NAME_MAPPED_SPORTS_COUNT = "MappedSportsCount";
  @SerializedName(SERIALIZED_NAME_MAPPED_SPORTS_COUNT)
  private Integer mappedSportsCount;

  public static final String SERIALIZED_NAME_MAPPED_SPORTS_IDS = "MappedSportsIds";
  @SerializedName(SERIALIZED_NAME_MAPPED_SPORTS_IDS)
  private List<Integer> mappedSportsIds;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MappingStatus status;

  public static final String SERIALIZED_NAME_INTERNAL_SPORT_NAME = "InternalSportName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_SPORT_NAME)
  private String internalSportName;

  public MappedInternalSport() {
  }

  public MappedInternalSport(
     Integer mappedSportsCount, 
     List<Integer> mappedSportsIds
  ) {
    this();
    this.mappedSportsCount = mappedSportsCount;
    this.mappedSportsIds = mappedSportsIds;
  }

  public MappedInternalSport internalSportId(Integer internalSportId) {
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


  public MappedInternalSport mappedSports(List<AamsSport> mappedSports) {
    this.mappedSports = mappedSports;
    return this;
  }

  public MappedInternalSport addMappedSportsItem(AamsSport mappedSportsItem) {
    if (this.mappedSports == null) {
      this.mappedSports = new ArrayList<>();
    }
    this.mappedSports.add(mappedSportsItem);
    return this;
  }

   /**
   * Get mappedSports
   * @return mappedSports
  **/
  @javax.annotation.Nullable
  public List<AamsSport> getMappedSports() {
    return mappedSports;
  }

  public void setMappedSports(List<AamsSport> mappedSports) {
    this.mappedSports = mappedSports;
  }


   /**
   * Get mappedSportsCount
   * @return mappedSportsCount
  **/
  @javax.annotation.Nullable
  public Integer getMappedSportsCount() {
    return mappedSportsCount;
  }



   /**
   * Get mappedSportsIds
   * @return mappedSportsIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getMappedSportsIds() {
    return mappedSportsIds;
  }



  public MappedInternalSport status(MappingStatus status) {
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


  public MappedInternalSport internalSportName(String internalSportName) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappedInternalSport mappedInternalSport = (MappedInternalSport) o;
    return Objects.equals(this.internalSportId, mappedInternalSport.internalSportId) &&
        Objects.equals(this.mappedSports, mappedInternalSport.mappedSports) &&
        Objects.equals(this.mappedSportsCount, mappedInternalSport.mappedSportsCount) &&
        Objects.equals(this.mappedSportsIds, mappedInternalSport.mappedSportsIds) &&
        Objects.equals(this.status, mappedInternalSport.status) &&
        Objects.equals(this.internalSportName, mappedInternalSport.internalSportName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalSportId, mappedSports, mappedSportsCount, mappedSportsIds, status, internalSportName);
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
    sb.append("class MappedInternalSport {\n");
    sb.append("    internalSportId: ").append(toIndentedString(internalSportId)).append("\n");
    sb.append("    mappedSports: ").append(toIndentedString(mappedSports)).append("\n");
    sb.append("    mappedSportsCount: ").append(toIndentedString(mappedSportsCount)).append("\n");
    sb.append("    mappedSportsIds: ").append(toIndentedString(mappedSportsIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    internalSportName: ").append(toIndentedString(internalSportName)).append("\n");
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
    openapiFields.add("InternalSportId");
    openapiFields.add("MappedSports");
    openapiFields.add("MappedSportsCount");
    openapiFields.add("MappedSportsIds");
    openapiFields.add("Status");
    openapiFields.add("InternalSportName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MappedInternalSport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MappedInternalSport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MappedInternalSport is not found in the empty JSON string", MappedInternalSport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MappedInternalSport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MappedInternalSport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("MappedSports") != null && !jsonObj.get("MappedSports").isJsonNull()) {
        JsonArray jsonArraymappedSports = jsonObj.getAsJsonArray("MappedSports");
        if (jsonArraymappedSports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MappedSports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MappedSports` to be an array in the JSON string but got `%s`", jsonObj.get("MappedSports").toString()));
          }

          // validate the optional field `MappedSports` (array)
          for (int i = 0; i < jsonArraymappedSports.size(); i++) {
            AamsSport.validateJsonElement(jsonArraymappedSports.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("MappedSportsIds") != null && !jsonObj.get("MappedSportsIds").isJsonNull() && !jsonObj.get("MappedSportsIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MappedSportsIds` to be an array in the JSON string but got `%s`", jsonObj.get("MappedSportsIds").toString()));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        MappingStatus.validateJsonElement(jsonObj.get("Status"));
      }
      if ((jsonObj.get("InternalSportName") != null && !jsonObj.get("InternalSportName").isJsonNull()) && !jsonObj.get("InternalSportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalSportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalSportName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MappedInternalSport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MappedInternalSport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MappedInternalSport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MappedInternalSport.class));

       return (TypeAdapter<T>) new TypeAdapter<MappedInternalSport>() {
           @Override
           public void write(JsonWriter out, MappedInternalSport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MappedInternalSport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MappedInternalSport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MappedInternalSport
  * @throws IOException if the JSON string is invalid with respect to MappedInternalSport
  */
  public static MappedInternalSport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MappedInternalSport.class);
  }

 /**
  * Convert an instance of MappedInternalSport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
