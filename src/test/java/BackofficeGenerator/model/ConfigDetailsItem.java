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
 * ConfigDetailsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ConfigDetailsItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "AccessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private AccessTypes accessType;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_IS_READONLY = "IsReadonly";
  @SerializedName(SERIALIZED_NAME_IS_READONLY)
  private Boolean isReadonly;

  public static final String SERIALIZED_NAME_BRANDS = "Brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<BrandName> brands;

  public static final String SERIALIZED_NAME_CREATED_DATE = "CreatedDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public ConfigDetailsItem() {
  }

  public ConfigDetailsItem name(String name) {
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


  public ConfigDetailsItem accessType(AccessTypes accessType) {
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


  public ConfigDetailsItem isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public ConfigDetailsItem isReadonly(Boolean isReadonly) {
    this.isReadonly = isReadonly;
    return this;
  }

   /**
   * Get isReadonly
   * @return isReadonly
  **/
  @javax.annotation.Nullable
  public Boolean getIsReadonly() {
    return isReadonly;
  }

  public void setIsReadonly(Boolean isReadonly) {
    this.isReadonly = isReadonly;
  }


  public ConfigDetailsItem brands(List<BrandName> brands) {
    this.brands = brands;
    return this;
  }

  public ConfigDetailsItem addBrandsItem(BrandName brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * Get brands
   * @return brands
  **/
  @javax.annotation.Nullable
  public List<BrandName> getBrands() {
    return brands;
  }

  public void setBrands(List<BrandName> brands) {
    this.brands = brands;
  }


  public ConfigDetailsItem createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public ConfigDetailsItem configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigDetailsItem configDetailsItem = (ConfigDetailsItem) o;
    return Objects.equals(this.name, configDetailsItem.name) &&
        Objects.equals(this.accessType, configDetailsItem.accessType) &&
        Objects.equals(this.isDefault, configDetailsItem.isDefault) &&
        Objects.equals(this.isReadonly, configDetailsItem.isReadonly) &&
        Objects.equals(this.brands, configDetailsItem.brands) &&
        Objects.equals(this.createdDate, configDetailsItem.createdDate) &&
        Objects.equals(this.configId, configDetailsItem.configId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accessType, isDefault, isReadonly, brands, createdDate, configId);
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
    sb.append("class ConfigDetailsItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isReadonly: ").append(toIndentedString(isReadonly)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
    openapiFields.add("IsDefault");
    openapiFields.add("IsReadonly");
    openapiFields.add("Brands");
    openapiFields.add("CreatedDate");
    openapiFields.add("ConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigDetailsItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigDetailsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigDetailsItem is not found in the empty JSON string", ConfigDetailsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigDetailsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigDetailsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("Brands") != null && !jsonObj.get("Brands").isJsonNull()) {
        JsonArray jsonArraybrands = jsonObj.getAsJsonArray("Brands");
        if (jsonArraybrands != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Brands").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Brands` to be an array in the JSON string but got `%s`", jsonObj.get("Brands").toString()));
          }

          // validate the optional field `Brands` (array)
          for (int i = 0; i < jsonArraybrands.size(); i++) {
            BrandName.validateJsonElement(jsonArraybrands.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigDetailsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigDetailsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigDetailsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigDetailsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigDetailsItem>() {
           @Override
           public void write(JsonWriter out, ConfigDetailsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigDetailsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigDetailsItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigDetailsItem
  * @throws IOException if the JSON string is invalid with respect to ConfigDetailsItem
  */
  public static ConfigDetailsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigDetailsItem.class);
  }

 /**
  * Convert an instance of ConfigDetailsItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

