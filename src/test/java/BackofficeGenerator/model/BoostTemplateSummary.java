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
 * BoostTemplateSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostTemplateSummary {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_GLOBAL = "IsGlobal";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL)
  private Boolean isGlobal;

  public static final String SERIALIZED_NAME_CHAMPS_COUNT = "ChampsCount";
  @SerializedName(SERIALIZED_NAME_CHAMPS_COUNT)
  private Integer champsCount;

  public static final String SERIALIZED_NAME_OFFER_START_TIME = "OfferStartTime";
  @SerializedName(SERIALIZED_NAME_OFFER_START_TIME)
  private Integer offerStartTime;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_IS_LIVE = "IsLive";
  @SerializedName(SERIALIZED_NAME_IS_LIVE)
  private Boolean isLive;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public BoostTemplateSummary() {
  }

  public BoostTemplateSummary name(String name) {
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


  public BoostTemplateSummary isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getIsGlobal() {
    return isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  public BoostTemplateSummary champsCount(Integer champsCount) {
    this.champsCount = champsCount;
    return this;
  }

   /**
   * Get champsCount
   * @return champsCount
  **/
  @javax.annotation.Nullable
  public Integer getChampsCount() {
    return champsCount;
  }

  public void setChampsCount(Integer champsCount) {
    this.champsCount = champsCount;
  }


  public BoostTemplateSummary offerStartTime(Integer offerStartTime) {
    this.offerStartTime = offerStartTime;
    return this;
  }

   /**
   * Get offerStartTime
   * @return offerStartTime
  **/
  @javax.annotation.Nullable
  public Integer getOfferStartTime() {
    return offerStartTime;
  }

  public void setOfferStartTime(Integer offerStartTime) {
    this.offerStartTime = offerStartTime;
  }


  public BoostTemplateSummary isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public BoostTemplateSummary isLive(Boolean isLive) {
    this.isLive = isLive;
    return this;
  }

   /**
   * Get isLive
   * @return isLive
  **/
  @javax.annotation.Nullable
  public Boolean getIsLive() {
    return isLive;
  }

  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }


  public BoostTemplateSummary templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostTemplateSummary boostTemplateSummary = (BoostTemplateSummary) o;
    return Objects.equals(this.name, boostTemplateSummary.name) &&
        Objects.equals(this.isGlobal, boostTemplateSummary.isGlobal) &&
        Objects.equals(this.champsCount, boostTemplateSummary.champsCount) &&
        Objects.equals(this.offerStartTime, boostTemplateSummary.offerStartTime) &&
        Objects.equals(this.isEnabled, boostTemplateSummary.isEnabled) &&
        Objects.equals(this.isLive, boostTemplateSummary.isLive) &&
        Objects.equals(this.templateId, boostTemplateSummary.templateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isGlobal, champsCount, offerStartTime, isEnabled, isLive, templateId);
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
    sb.append("class BoostTemplateSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    champsCount: ").append(toIndentedString(champsCount)).append("\n");
    sb.append("    offerStartTime: ").append(toIndentedString(offerStartTime)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("IsGlobal");
    openapiFields.add("ChampsCount");
    openapiFields.add("OfferStartTime");
    openapiFields.add("IsEnabled");
    openapiFields.add("IsLive");
    openapiFields.add("TemplateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostTemplateSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostTemplateSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostTemplateSummary is not found in the empty JSON string", BoostTemplateSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostTemplateSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostTemplateSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostTemplateSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostTemplateSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostTemplateSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostTemplateSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostTemplateSummary>() {
           @Override
           public void write(JsonWriter out, BoostTemplateSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostTemplateSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostTemplateSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostTemplateSummary
  * @throws IOException if the JSON string is invalid with respect to BoostTemplateSummary
  */
  public static BoostTemplateSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostTemplateSummary.class);
  }

 /**
  * Convert an instance of BoostTemplateSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

