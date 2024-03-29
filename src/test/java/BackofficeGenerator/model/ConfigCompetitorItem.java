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
 * ConfigCompetitorItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ConfigCompetitorItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_DEFAULT_JERSEY = "DefaultJersey";
  @SerializedName(SERIALIZED_NAME_DEFAULT_JERSEY)
  private String defaultJersey;

  public static final String SERIALIZED_NAME_CUSTOM_JERSEY = "CustomJersey";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JERSEY)
  private String customJersey;

  public static final String SERIALIZED_NAME_CUSTOM_LOGO = "CustomLogo";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LOGO)
  private String customLogo;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_HAS_CHAMPS_SETTINGS = "HasChampsSettings";
  @SerializedName(SERIALIZED_NAME_HAS_CHAMPS_SETTINGS)
  private Boolean hasChampsSettings;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public ConfigCompetitorItem() {
  }

  public ConfigCompetitorItem name(String name) {
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


  public ConfigCompetitorItem sportName(String sportName) {
    this.sportName = sportName;
    return this;
  }

   /**
   * Get sportName
   * @return sportName
  **/
  @javax.annotation.Nullable
  public String getSportName() {
    return sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }


  public ConfigCompetitorItem defaultJersey(String defaultJersey) {
    this.defaultJersey = defaultJersey;
    return this;
  }

   /**
   * Get defaultJersey
   * @return defaultJersey
  **/
  @javax.annotation.Nullable
  public String getDefaultJersey() {
    return defaultJersey;
  }

  public void setDefaultJersey(String defaultJersey) {
    this.defaultJersey = defaultJersey;
  }


  public ConfigCompetitorItem customJersey(String customJersey) {
    this.customJersey = customJersey;
    return this;
  }

   /**
   * Get customJersey
   * @return customJersey
  **/
  @javax.annotation.Nullable
  public String getCustomJersey() {
    return customJersey;
  }

  public void setCustomJersey(String customJersey) {
    this.customJersey = customJersey;
  }


  public ConfigCompetitorItem customLogo(String customLogo) {
    this.customLogo = customLogo;
    return this;
  }

   /**
   * Get customLogo
   * @return customLogo
  **/
  @javax.annotation.Nullable
  public String getCustomLogo() {
    return customLogo;
  }

  public void setCustomLogo(String customLogo) {
    this.customLogo = customLogo;
  }


  public ConfigCompetitorItem isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public ConfigCompetitorItem hasChampsSettings(Boolean hasChampsSettings) {
    this.hasChampsSettings = hasChampsSettings;
    return this;
  }

   /**
   * Get hasChampsSettings
   * @return hasChampsSettings
  **/
  @javax.annotation.Nullable
  public Boolean getHasChampsSettings() {
    return hasChampsSettings;
  }

  public void setHasChampsSettings(Boolean hasChampsSettings) {
    this.hasChampsSettings = hasChampsSettings;
  }


  public ConfigCompetitorItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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
    ConfigCompetitorItem configCompetitorItem = (ConfigCompetitorItem) o;
    return Objects.equals(this.name, configCompetitorItem.name) &&
        Objects.equals(this.sportName, configCompetitorItem.sportName) &&
        Objects.equals(this.defaultJersey, configCompetitorItem.defaultJersey) &&
        Objects.equals(this.customJersey, configCompetitorItem.customJersey) &&
        Objects.equals(this.customLogo, configCompetitorItem.customLogo) &&
        Objects.equals(this.isDisabled, configCompetitorItem.isDisabled) &&
        Objects.equals(this.hasChampsSettings, configCompetitorItem.hasChampsSettings) &&
        Objects.equals(this.id, configCompetitorItem.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sportName, defaultJersey, customJersey, customLogo, isDisabled, hasChampsSettings, id);
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
    sb.append("class ConfigCompetitorItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    defaultJersey: ").append(toIndentedString(defaultJersey)).append("\n");
    sb.append("    customJersey: ").append(toIndentedString(customJersey)).append("\n");
    sb.append("    customLogo: ").append(toIndentedString(customLogo)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    hasChampsSettings: ").append(toIndentedString(hasChampsSettings)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("SportName");
    openapiFields.add("DefaultJersey");
    openapiFields.add("CustomJersey");
    openapiFields.add("CustomLogo");
    openapiFields.add("IsDisabled");
    openapiFields.add("HasChampsSettings");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigCompetitorItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigCompetitorItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigCompetitorItem is not found in the empty JSON string", ConfigCompetitorItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigCompetitorItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigCompetitorItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if ((jsonObj.get("DefaultJersey") != null && !jsonObj.get("DefaultJersey").isJsonNull()) && !jsonObj.get("DefaultJersey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DefaultJersey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DefaultJersey").toString()));
      }
      if ((jsonObj.get("CustomJersey") != null && !jsonObj.get("CustomJersey").isJsonNull()) && !jsonObj.get("CustomJersey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomJersey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomJersey").toString()));
      }
      if ((jsonObj.get("CustomLogo") != null && !jsonObj.get("CustomLogo").isJsonNull()) && !jsonObj.get("CustomLogo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomLogo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomLogo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigCompetitorItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigCompetitorItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigCompetitorItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigCompetitorItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigCompetitorItem>() {
           @Override
           public void write(JsonWriter out, ConfigCompetitorItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigCompetitorItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigCompetitorItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigCompetitorItem
  * @throws IOException if the JSON string is invalid with respect to ConfigCompetitorItem
  */
  public static ConfigCompetitorItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigCompetitorItem.class);
  }

 /**
  * Convert an instance of ConfigCompetitorItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

