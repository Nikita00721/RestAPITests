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
 * TennisResultScoreItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class TennisResultScoreItem {
  public static final String SERIALIZED_NAME_RESULT_TYPE_CODE = "ResultTypeCode";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE_CODE)
  private String resultTypeCode;

  public static final String SERIALIZED_NAME_RESULT_TYPE_NAME = "ResultTypeName";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE_NAME)
  private String resultTypeName;

  public static final String SERIALIZED_NAME_SCORES = "Scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private List<String> scores;

  public static final String SERIALIZED_NAME_RESULT_TYPE_ID = "ResultTypeId";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE_ID)
  private Integer resultTypeId;

  public TennisResultScoreItem() {
  }

  public TennisResultScoreItem resultTypeCode(String resultTypeCode) {
    this.resultTypeCode = resultTypeCode;
    return this;
  }

   /**
   * Get resultTypeCode
   * @return resultTypeCode
  **/
  @javax.annotation.Nullable
  public String getResultTypeCode() {
    return resultTypeCode;
  }

  public void setResultTypeCode(String resultTypeCode) {
    this.resultTypeCode = resultTypeCode;
  }


  public TennisResultScoreItem resultTypeName(String resultTypeName) {
    this.resultTypeName = resultTypeName;
    return this;
  }

   /**
   * Get resultTypeName
   * @return resultTypeName
  **/
  @javax.annotation.Nullable
  public String getResultTypeName() {
    return resultTypeName;
  }

  public void setResultTypeName(String resultTypeName) {
    this.resultTypeName = resultTypeName;
  }


  public TennisResultScoreItem scores(List<String> scores) {
    this.scores = scores;
    return this;
  }

  public TennisResultScoreItem addScoresItem(String scoresItem) {
    if (this.scores == null) {
      this.scores = new ArrayList<>();
    }
    this.scores.add(scoresItem);
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  @javax.annotation.Nullable
  public List<String> getScores() {
    return scores;
  }

  public void setScores(List<String> scores) {
    this.scores = scores;
  }


  public TennisResultScoreItem resultTypeId(Integer resultTypeId) {
    this.resultTypeId = resultTypeId;
    return this;
  }

   /**
   * Get resultTypeId
   * @return resultTypeId
  **/
  @javax.annotation.Nullable
  public Integer getResultTypeId() {
    return resultTypeId;
  }

  public void setResultTypeId(Integer resultTypeId) {
    this.resultTypeId = resultTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TennisResultScoreItem tennisResultScoreItem = (TennisResultScoreItem) o;
    return Objects.equals(this.resultTypeCode, tennisResultScoreItem.resultTypeCode) &&
        Objects.equals(this.resultTypeName, tennisResultScoreItem.resultTypeName) &&
        Objects.equals(this.scores, tennisResultScoreItem.scores) &&
        Objects.equals(this.resultTypeId, tennisResultScoreItem.resultTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultTypeCode, resultTypeName, scores, resultTypeId);
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
    sb.append("class TennisResultScoreItem {\n");
    sb.append("    resultTypeCode: ").append(toIndentedString(resultTypeCode)).append("\n");
    sb.append("    resultTypeName: ").append(toIndentedString(resultTypeName)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    resultTypeId: ").append(toIndentedString(resultTypeId)).append("\n");
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
    openapiFields.add("ResultTypeCode");
    openapiFields.add("ResultTypeName");
    openapiFields.add("Scores");
    openapiFields.add("ResultTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TennisResultScoreItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TennisResultScoreItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TennisResultScoreItem is not found in the empty JSON string", TennisResultScoreItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TennisResultScoreItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TennisResultScoreItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ResultTypeCode") != null && !jsonObj.get("ResultTypeCode").isJsonNull()) && !jsonObj.get("ResultTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResultTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResultTypeCode").toString()));
      }
      if ((jsonObj.get("ResultTypeName") != null && !jsonObj.get("ResultTypeName").isJsonNull()) && !jsonObj.get("ResultTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ResultTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ResultTypeName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Scores") != null && !jsonObj.get("Scores").isJsonNull() && !jsonObj.get("Scores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Scores` to be an array in the JSON string but got `%s`", jsonObj.get("Scores").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TennisResultScoreItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TennisResultScoreItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TennisResultScoreItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TennisResultScoreItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TennisResultScoreItem>() {
           @Override
           public void write(JsonWriter out, TennisResultScoreItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TennisResultScoreItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TennisResultScoreItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TennisResultScoreItem
  * @throws IOException if the JSON string is invalid with respect to TennisResultScoreItem
  */
  public static TennisResultScoreItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TennisResultScoreItem.class);
  }

 /**
  * Convert an instance of TennisResultScoreItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

