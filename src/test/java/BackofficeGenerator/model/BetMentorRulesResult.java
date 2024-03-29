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
 * BetMentorRulesResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BetMentorRulesResult {
  public static final String SERIALIZED_NAME_ROWS = "Rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<BetMentorRuleItem> rows;

  public static final String SERIALIZED_NAME_INSIGHTS_ONLY = "InsightsOnly";
  @SerializedName(SERIALIZED_NAME_INSIGHTS_ONLY)
  private Boolean insightsOnly;

  public BetMentorRulesResult() {
  }

  public BetMentorRulesResult rows(List<BetMentorRuleItem> rows) {
    this.rows = rows;
    return this;
  }

  public BetMentorRulesResult addRowsItem(BetMentorRuleItem rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<BetMentorRuleItem> getRows() {
    return rows;
  }

  public void setRows(List<BetMentorRuleItem> rows) {
    this.rows = rows;
  }


  public BetMentorRulesResult insightsOnly(Boolean insightsOnly) {
    this.insightsOnly = insightsOnly;
    return this;
  }

   /**
   * Get insightsOnly
   * @return insightsOnly
  **/
  @javax.annotation.Nullable
  public Boolean getInsightsOnly() {
    return insightsOnly;
  }

  public void setInsightsOnly(Boolean insightsOnly) {
    this.insightsOnly = insightsOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetMentorRulesResult betMentorRulesResult = (BetMentorRulesResult) o;
    return Objects.equals(this.rows, betMentorRulesResult.rows) &&
        Objects.equals(this.insightsOnly, betMentorRulesResult.insightsOnly);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows, insightsOnly);
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
    sb.append("class BetMentorRulesResult {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    insightsOnly: ").append(toIndentedString(insightsOnly)).append("\n");
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
    openapiFields.add("Rows");
    openapiFields.add("InsightsOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BetMentorRulesResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BetMentorRulesResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BetMentorRulesResult is not found in the empty JSON string", BetMentorRulesResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BetMentorRulesResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BetMentorRulesResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Rows") != null && !jsonObj.get("Rows").isJsonNull()) {
        JsonArray jsonArrayrows = jsonObj.getAsJsonArray("Rows");
        if (jsonArrayrows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Rows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Rows` to be an array in the JSON string but got `%s`", jsonObj.get("Rows").toString()));
          }

          // validate the optional field `Rows` (array)
          for (int i = 0; i < jsonArrayrows.size(); i++) {
            BetMentorRuleItem.validateJsonElement(jsonArrayrows.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BetMentorRulesResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BetMentorRulesResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BetMentorRulesResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BetMentorRulesResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BetMentorRulesResult>() {
           @Override
           public void write(JsonWriter out, BetMentorRulesResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BetMentorRulesResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BetMentorRulesResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BetMentorRulesResult
  * @throws IOException if the JSON string is invalid with respect to BetMentorRulesResult
  */
  public static BetMentorRulesResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BetMentorRulesResult.class);
  }

 /**
  * Convert an instance of BetMentorRulesResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

