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
 * GetTotoListRequestFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetTotoListRequestFilters {
  public static final String SERIALIZED_NAME_TOTO_NAME = "TotoName";
  @SerializedName(SERIALIZED_NAME_TOTO_NAME)
  private String totoName;

  public static final String SERIALIZED_NAME_DATE_FROM = "DateFrom";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "DateTo";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_TOTO_TYPE = "TotoType";
  @SerializedName(SERIALIZED_NAME_TOTO_TYPE)
  private TotoType totoType;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_BRAND_IDS = "BrandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<Integer> brandIds;

  public static final String SERIALIZED_NAME_TOTO_ID = "TotoId";
  @SerializedName(SERIALIZED_NAME_TOTO_ID)
  private Integer totoId;

  public GetTotoListRequestFilters() {
  }

  public GetTotoListRequestFilters totoName(String totoName) {
    this.totoName = totoName;
    return this;
  }

   /**
   * Get totoName
   * @return totoName
  **/
  @javax.annotation.Nullable
  public String getTotoName() {
    return totoName;
  }

  public void setTotoName(String totoName) {
    this.totoName = totoName;
  }


  public GetTotoListRequestFilters dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }


  public GetTotoListRequestFilters dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  public GetTotoListRequestFilters totoType(TotoType totoType) {
    this.totoType = totoType;
    return this;
  }

   /**
   * Get totoType
   * @return totoType
  **/
  @javax.annotation.Nullable
  public TotoType getTotoType() {
    return totoType;
  }

  public void setTotoType(TotoType totoType) {
    this.totoType = totoType;
  }


  public GetTotoListRequestFilters isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public GetTotoListRequestFilters brandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
    return this;
  }

  public GetTotoListRequestFilters addBrandIdsItem(Integer brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * Get brandIds
   * @return brandIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getBrandIds() {
    return brandIds;
  }

  public void setBrandIds(List<Integer> brandIds) {
    this.brandIds = brandIds;
  }


  public GetTotoListRequestFilters totoId(Integer totoId) {
    this.totoId = totoId;
    return this;
  }

   /**
   * Get totoId
   * @return totoId
  **/
  @javax.annotation.Nullable
  public Integer getTotoId() {
    return totoId;
  }

  public void setTotoId(Integer totoId) {
    this.totoId = totoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTotoListRequestFilters getTotoListRequestFilters = (GetTotoListRequestFilters) o;
    return Objects.equals(this.totoName, getTotoListRequestFilters.totoName) &&
        Objects.equals(this.dateFrom, getTotoListRequestFilters.dateFrom) &&
        Objects.equals(this.dateTo, getTotoListRequestFilters.dateTo) &&
        Objects.equals(this.totoType, getTotoListRequestFilters.totoType) &&
        Objects.equals(this.isActive, getTotoListRequestFilters.isActive) &&
        Objects.equals(this.brandIds, getTotoListRequestFilters.brandIds) &&
        Objects.equals(this.totoId, getTotoListRequestFilters.totoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totoName, dateFrom, dateTo, totoType, isActive, brandIds, totoId);
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
    sb.append("class GetTotoListRequestFilters {\n");
    sb.append("    totoName: ").append(toIndentedString(totoName)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    totoType: ").append(toIndentedString(totoType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    totoId: ").append(toIndentedString(totoId)).append("\n");
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
    openapiFields.add("TotoName");
    openapiFields.add("DateFrom");
    openapiFields.add("DateTo");
    openapiFields.add("TotoType");
    openapiFields.add("IsActive");
    openapiFields.add("BrandIds");
    openapiFields.add("TotoId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTotoListRequestFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTotoListRequestFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTotoListRequestFilters is not found in the empty JSON string", GetTotoListRequestFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTotoListRequestFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTotoListRequestFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TotoName") != null && !jsonObj.get("TotoName").isJsonNull()) && !jsonObj.get("TotoName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TotoName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TotoName").toString()));
      }
      // validate the optional field `TotoType`
      if (jsonObj.get("TotoType") != null && !jsonObj.get("TotoType").isJsonNull()) {
        TotoType.validateJsonElement(jsonObj.get("TotoType"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BrandIds") != null && !jsonObj.get("BrandIds").isJsonNull() && !jsonObj.get("BrandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandIds` to be an array in the JSON string but got `%s`", jsonObj.get("BrandIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTotoListRequestFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTotoListRequestFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTotoListRequestFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTotoListRequestFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTotoListRequestFilters>() {
           @Override
           public void write(JsonWriter out, GetTotoListRequestFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTotoListRequestFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTotoListRequestFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTotoListRequestFilters
  * @throws IOException if the JSON string is invalid with respect to GetTotoListRequestFilters
  */
  public static GetTotoListRequestFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTotoListRequestFilters.class);
  }

 /**
  * Convert an instance of GetTotoListRequestFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
