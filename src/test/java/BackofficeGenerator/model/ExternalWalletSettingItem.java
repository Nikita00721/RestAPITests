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
 * ExternalWalletSettingItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ExternalWalletSettingItem {
  public static final String SERIALIZED_NAME_WALLET_CODE = "WalletCode";
  @SerializedName(SERIALIZED_NAME_WALLET_CODE)
  private String walletCode;

  public static final String SERIALIZED_NAME_IS_ENABLE = "IsEnable";
  @SerializedName(SERIALIZED_NAME_IS_ENABLE)
  private Boolean isEnable;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private String settings;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public ExternalWalletSettingItem() {
  }

  public ExternalWalletSettingItem walletCode(String walletCode) {
    this.walletCode = walletCode;
    return this;
  }

   /**
   * Get walletCode
   * @return walletCode
  **/
  @javax.annotation.Nullable
  public String getWalletCode() {
    return walletCode;
  }

  public void setWalletCode(String walletCode) {
    this.walletCode = walletCode;
  }


  public ExternalWalletSettingItem isEnable(Boolean isEnable) {
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


  public ExternalWalletSettingItem comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public ExternalWalletSettingItem settings(String settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }


  public ExternalWalletSettingItem id(Integer id) {
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
    ExternalWalletSettingItem externalWalletSettingItem = (ExternalWalletSettingItem) o;
    return Objects.equals(this.walletCode, externalWalletSettingItem.walletCode) &&
        Objects.equals(this.isEnable, externalWalletSettingItem.isEnable) &&
        Objects.equals(this.comment, externalWalletSettingItem.comment) &&
        Objects.equals(this.settings, externalWalletSettingItem.settings) &&
        Objects.equals(this.id, externalWalletSettingItem.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletCode, isEnable, comment, settings, id);
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
    sb.append("class ExternalWalletSettingItem {\n");
    sb.append("    walletCode: ").append(toIndentedString(walletCode)).append("\n");
    sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("WalletCode");
    openapiFields.add("IsEnable");
    openapiFields.add("Comment");
    openapiFields.add("Settings");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExternalWalletSettingItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExternalWalletSettingItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalWalletSettingItem is not found in the empty JSON string", ExternalWalletSettingItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExternalWalletSettingItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalWalletSettingItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("WalletCode") != null && !jsonObj.get("WalletCode").isJsonNull()) && !jsonObj.get("WalletCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WalletCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WalletCode").toString()));
      }
      if ((jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) && !jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
      if ((jsonObj.get("Settings") != null && !jsonObj.get("Settings").isJsonNull()) && !jsonObj.get("Settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Settings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalWalletSettingItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalWalletSettingItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalWalletSettingItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalWalletSettingItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalWalletSettingItem>() {
           @Override
           public void write(JsonWriter out, ExternalWalletSettingItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalWalletSettingItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalWalletSettingItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalWalletSettingItem
  * @throws IOException if the JSON string is invalid with respect to ExternalWalletSettingItem
  */
  public static ExternalWalletSettingItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalWalletSettingItem.class);
  }

 /**
  * Convert an instance of ExternalWalletSettingItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
