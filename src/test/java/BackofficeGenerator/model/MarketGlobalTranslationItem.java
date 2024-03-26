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
 * MarketGlobalTranslationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarketGlobalTranslationItem {
  public static final String SERIALIZED_NAME_LANGUAGE_NAME = "LanguageName";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_NAME)
  private String languageName;

  public static final String SERIALIZED_NAME_INTERNAL_TRANSLATION = "InternalTranslation";
  @SerializedName(SERIALIZED_NAME_INTERNAL_TRANSLATION)
  private String internalTranslation;

  public static final String SERIALIZED_NAME_INTERNAL_DESCRIPTION = "InternalDescription";
  @SerializedName(SERIALIZED_NAME_INTERNAL_DESCRIPTION)
  private String internalDescription;

  public static final String SERIALIZED_NAME_SPORT_TRANSLATION = "SportTranslation";
  @SerializedName(SERIALIZED_NAME_SPORT_TRANSLATION)
  private String sportTranslation;

  public static final String SERIALIZED_NAME_SPORT_DESCRIPTION = "SportDescription";
  @SerializedName(SERIALIZED_NAME_SPORT_DESCRIPTION)
  private String sportDescription;

  public static final String SERIALIZED_NAME_GENDER = "Gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Integer gender;

  public static final String SERIALIZED_NAME_IS_UNFINISHED = "IsUnfinished";
  @SerializedName(SERIALIZED_NAME_IS_UNFINISHED)
  private Boolean isUnfinished;

  public static final String SERIALIZED_NAME_LANGUAGE_ID = "LanguageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private Integer languageId;

  public MarketGlobalTranslationItem() {
  }

  public MarketGlobalTranslationItem languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

   /**
   * Get languageName
   * @return languageName
  **/
  @javax.annotation.Nullable
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }


  public MarketGlobalTranslationItem internalTranslation(String internalTranslation) {
    this.internalTranslation = internalTranslation;
    return this;
  }

   /**
   * Get internalTranslation
   * @return internalTranslation
  **/
  @javax.annotation.Nullable
  public String getInternalTranslation() {
    return internalTranslation;
  }

  public void setInternalTranslation(String internalTranslation) {
    this.internalTranslation = internalTranslation;
  }


  public MarketGlobalTranslationItem internalDescription(String internalDescription) {
    this.internalDescription = internalDescription;
    return this;
  }

   /**
   * Get internalDescription
   * @return internalDescription
  **/
  @javax.annotation.Nullable
  public String getInternalDescription() {
    return internalDescription;
  }

  public void setInternalDescription(String internalDescription) {
    this.internalDescription = internalDescription;
  }


  public MarketGlobalTranslationItem sportTranslation(String sportTranslation) {
    this.sportTranslation = sportTranslation;
    return this;
  }

   /**
   * Get sportTranslation
   * @return sportTranslation
  **/
  @javax.annotation.Nullable
  public String getSportTranslation() {
    return sportTranslation;
  }

  public void setSportTranslation(String sportTranslation) {
    this.sportTranslation = sportTranslation;
  }


  public MarketGlobalTranslationItem sportDescription(String sportDescription) {
    this.sportDescription = sportDescription;
    return this;
  }

   /**
   * Get sportDescription
   * @return sportDescription
  **/
  @javax.annotation.Nullable
  public String getSportDescription() {
    return sportDescription;
  }

  public void setSportDescription(String sportDescription) {
    this.sportDescription = sportDescription;
  }


  public MarketGlobalTranslationItem gender(Integer gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public MarketGlobalTranslationItem isUnfinished(Boolean isUnfinished) {
    this.isUnfinished = isUnfinished;
    return this;
  }

   /**
   * Get isUnfinished
   * @return isUnfinished
  **/
  @javax.annotation.Nullable
  public Boolean getIsUnfinished() {
    return isUnfinished;
  }

  public void setIsUnfinished(Boolean isUnfinished) {
    this.isUnfinished = isUnfinished;
  }


  public MarketGlobalTranslationItem languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @javax.annotation.Nullable
  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketGlobalTranslationItem marketGlobalTranslationItem = (MarketGlobalTranslationItem) o;
    return Objects.equals(this.languageName, marketGlobalTranslationItem.languageName) &&
        Objects.equals(this.internalTranslation, marketGlobalTranslationItem.internalTranslation) &&
        Objects.equals(this.internalDescription, marketGlobalTranslationItem.internalDescription) &&
        Objects.equals(this.sportTranslation, marketGlobalTranslationItem.sportTranslation) &&
        Objects.equals(this.sportDescription, marketGlobalTranslationItem.sportDescription) &&
        Objects.equals(this.gender, marketGlobalTranslationItem.gender) &&
        Objects.equals(this.isUnfinished, marketGlobalTranslationItem.isUnfinished) &&
        Objects.equals(this.languageId, marketGlobalTranslationItem.languageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageName, internalTranslation, internalDescription, sportTranslation, sportDescription, gender, isUnfinished, languageId);
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
    sb.append("class MarketGlobalTranslationItem {\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    internalTranslation: ").append(toIndentedString(internalTranslation)).append("\n");
    sb.append("    internalDescription: ").append(toIndentedString(internalDescription)).append("\n");
    sb.append("    sportTranslation: ").append(toIndentedString(sportTranslation)).append("\n");
    sb.append("    sportDescription: ").append(toIndentedString(sportDescription)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    isUnfinished: ").append(toIndentedString(isUnfinished)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
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
    openapiFields.add("LanguageName");
    openapiFields.add("InternalTranslation");
    openapiFields.add("InternalDescription");
    openapiFields.add("SportTranslation");
    openapiFields.add("SportDescription");
    openapiFields.add("Gender");
    openapiFields.add("IsUnfinished");
    openapiFields.add("LanguageId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketGlobalTranslationItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketGlobalTranslationItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketGlobalTranslationItem is not found in the empty JSON string", MarketGlobalTranslationItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarketGlobalTranslationItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarketGlobalTranslationItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LanguageName") != null && !jsonObj.get("LanguageName").isJsonNull()) && !jsonObj.get("LanguageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LanguageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LanguageName").toString()));
      }
      if ((jsonObj.get("InternalTranslation") != null && !jsonObj.get("InternalTranslation").isJsonNull()) && !jsonObj.get("InternalTranslation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalTranslation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalTranslation").toString()));
      }
      if ((jsonObj.get("InternalDescription") != null && !jsonObj.get("InternalDescription").isJsonNull()) && !jsonObj.get("InternalDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InternalDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InternalDescription").toString()));
      }
      if ((jsonObj.get("SportTranslation") != null && !jsonObj.get("SportTranslation").isJsonNull()) && !jsonObj.get("SportTranslation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportTranslation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportTranslation").toString()));
      }
      if ((jsonObj.get("SportDescription") != null && !jsonObj.get("SportDescription").isJsonNull()) && !jsonObj.get("SportDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketGlobalTranslationItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketGlobalTranslationItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketGlobalTranslationItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketGlobalTranslationItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketGlobalTranslationItem>() {
           @Override
           public void write(JsonWriter out, MarketGlobalTranslationItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarketGlobalTranslationItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarketGlobalTranslationItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketGlobalTranslationItem
  * @throws IOException if the JSON string is invalid with respect to MarketGlobalTranslationItem
  */
  public static MarketGlobalTranslationItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketGlobalTranslationItem.class);
  }

 /**
  * Convert an instance of MarketGlobalTranslationItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

