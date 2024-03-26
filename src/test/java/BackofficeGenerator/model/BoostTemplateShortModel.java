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
 * BoostTemplateShortModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostTemplateShortModel {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULES_COUNT = "RulesCount";
  @SerializedName(SERIALIZED_NAME_RULES_COUNT)
  private Integer rulesCount;

  public static final String SERIALIZED_NAME_OFFER_START_TIME = "OfferStartTime";
  @SerializedName(SERIALIZED_NAME_OFFER_START_TIME)
  private Integer offerStartTime;

  public static final String SERIALIZED_NAME_GENERATION_TIME = "GenerationTime";
  @SerializedName(SERIALIZED_NAME_GENERATION_TIME)
  private Integer generationTime;

  public static final String SERIALIZED_NAME_LADDER_TYPE_ID = "LadderTypeId";
  @SerializedName(SERIALIZED_NAME_LADDER_TYPE_ID)
  private LadderTypes ladderTypeId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public BoostTemplateShortModel() {
  }

  public BoostTemplateShortModel name(String name) {
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


  public BoostTemplateShortModel rulesCount(Integer rulesCount) {
    this.rulesCount = rulesCount;
    return this;
  }

   /**
   * Get rulesCount
   * @return rulesCount
  **/
  @javax.annotation.Nullable
  public Integer getRulesCount() {
    return rulesCount;
  }

  public void setRulesCount(Integer rulesCount) {
    this.rulesCount = rulesCount;
  }


  public BoostTemplateShortModel offerStartTime(Integer offerStartTime) {
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


  public BoostTemplateShortModel generationTime(Integer generationTime) {
    this.generationTime = generationTime;
    return this;
  }

   /**
   * Get generationTime
   * @return generationTime
  **/
  @javax.annotation.Nullable
  public Integer getGenerationTime() {
    return generationTime;
  }

  public void setGenerationTime(Integer generationTime) {
    this.generationTime = generationTime;
  }


  public BoostTemplateShortModel ladderTypeId(LadderTypes ladderTypeId) {
    this.ladderTypeId = ladderTypeId;
    return this;
  }

   /**
   * Get ladderTypeId
   * @return ladderTypeId
  **/
  @javax.annotation.Nullable
  public LadderTypes getLadderTypeId() {
    return ladderTypeId;
  }

  public void setLadderTypeId(LadderTypes ladderTypeId) {
    this.ladderTypeId = ladderTypeId;
  }


  public BoostTemplateShortModel templateId(Integer templateId) {
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
    BoostTemplateShortModel boostTemplateShortModel = (BoostTemplateShortModel) o;
    return Objects.equals(this.name, boostTemplateShortModel.name) &&
        Objects.equals(this.rulesCount, boostTemplateShortModel.rulesCount) &&
        Objects.equals(this.offerStartTime, boostTemplateShortModel.offerStartTime) &&
        Objects.equals(this.generationTime, boostTemplateShortModel.generationTime) &&
        Objects.equals(this.ladderTypeId, boostTemplateShortModel.ladderTypeId) &&
        Objects.equals(this.templateId, boostTemplateShortModel.templateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rulesCount, offerStartTime, generationTime, ladderTypeId, templateId);
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
    sb.append("class BoostTemplateShortModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rulesCount: ").append(toIndentedString(rulesCount)).append("\n");
    sb.append("    offerStartTime: ").append(toIndentedString(offerStartTime)).append("\n");
    sb.append("    generationTime: ").append(toIndentedString(generationTime)).append("\n");
    sb.append("    ladderTypeId: ").append(toIndentedString(ladderTypeId)).append("\n");
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
    openapiFields.add("RulesCount");
    openapiFields.add("OfferStartTime");
    openapiFields.add("GenerationTime");
    openapiFields.add("LadderTypeId");
    openapiFields.add("TemplateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostTemplateShortModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostTemplateShortModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostTemplateShortModel is not found in the empty JSON string", BoostTemplateShortModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostTemplateShortModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostTemplateShortModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `LadderTypeId`
      if (jsonObj.get("LadderTypeId") != null && !jsonObj.get("LadderTypeId").isJsonNull()) {
        LadderTypes.validateJsonElement(jsonObj.get("LadderTypeId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostTemplateShortModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostTemplateShortModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostTemplateShortModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostTemplateShortModel.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostTemplateShortModel>() {
           @Override
           public void write(JsonWriter out, BoostTemplateShortModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostTemplateShortModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostTemplateShortModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostTemplateShortModel
  * @throws IOException if the JSON string is invalid with respect to BoostTemplateShortModel
  */
  public static BoostTemplateShortModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostTemplateShortModel.class);
  }

 /**
  * Convert an instance of BoostTemplateShortModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
