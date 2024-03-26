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
 * BoostTemplateLists
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class BoostTemplateLists {
  public static final String SERIALIZED_NAME_LIVE_TEMPLATES = "LiveTemplates";
  @SerializedName(SERIALIZED_NAME_LIVE_TEMPLATES)
  private List<BoostTemplateItem> liveTemplates;

  public static final String SERIALIZED_NAME_PRELIVE_TEMPLATES = "PreliveTemplates";
  @SerializedName(SERIALIZED_NAME_PRELIVE_TEMPLATES)
  private List<BoostTemplateItem> preliveTemplates;

  public BoostTemplateLists() {
  }

  public BoostTemplateLists liveTemplates(List<BoostTemplateItem> liveTemplates) {
    this.liveTemplates = liveTemplates;
    return this;
  }

  public BoostTemplateLists addLiveTemplatesItem(BoostTemplateItem liveTemplatesItem) {
    if (this.liveTemplates == null) {
      this.liveTemplates = new ArrayList<>();
    }
    this.liveTemplates.add(liveTemplatesItem);
    return this;
  }

   /**
   * Get liveTemplates
   * @return liveTemplates
  **/
  @javax.annotation.Nullable
  public List<BoostTemplateItem> getLiveTemplates() {
    return liveTemplates;
  }

  public void setLiveTemplates(List<BoostTemplateItem> liveTemplates) {
    this.liveTemplates = liveTemplates;
  }


  public BoostTemplateLists preliveTemplates(List<BoostTemplateItem> preliveTemplates) {
    this.preliveTemplates = preliveTemplates;
    return this;
  }

  public BoostTemplateLists addPreliveTemplatesItem(BoostTemplateItem preliveTemplatesItem) {
    if (this.preliveTemplates == null) {
      this.preliveTemplates = new ArrayList<>();
    }
    this.preliveTemplates.add(preliveTemplatesItem);
    return this;
  }

   /**
   * Get preliveTemplates
   * @return preliveTemplates
  **/
  @javax.annotation.Nullable
  public List<BoostTemplateItem> getPreliveTemplates() {
    return preliveTemplates;
  }

  public void setPreliveTemplates(List<BoostTemplateItem> preliveTemplates) {
    this.preliveTemplates = preliveTemplates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoostTemplateLists boostTemplateLists = (BoostTemplateLists) o;
    return Objects.equals(this.liveTemplates, boostTemplateLists.liveTemplates) &&
        Objects.equals(this.preliveTemplates, boostTemplateLists.preliveTemplates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveTemplates, preliveTemplates);
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
    sb.append("class BoostTemplateLists {\n");
    sb.append("    liveTemplates: ").append(toIndentedString(liveTemplates)).append("\n");
    sb.append("    preliveTemplates: ").append(toIndentedString(preliveTemplates)).append("\n");
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
    openapiFields.add("LiveTemplates");
    openapiFields.add("PreliveTemplates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoostTemplateLists
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoostTemplateLists.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoostTemplateLists is not found in the empty JSON string", BoostTemplateLists.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoostTemplateLists.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoostTemplateLists` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("LiveTemplates") != null && !jsonObj.get("LiveTemplates").isJsonNull()) {
        JsonArray jsonArrayliveTemplates = jsonObj.getAsJsonArray("LiveTemplates");
        if (jsonArrayliveTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("LiveTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `LiveTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("LiveTemplates").toString()));
          }

          // validate the optional field `LiveTemplates` (array)
          for (int i = 0; i < jsonArrayliveTemplates.size(); i++) {
            BoostTemplateItem.validateJsonElement(jsonArrayliveTemplates.get(i));
          };
        }
      }
      if (jsonObj.get("PreliveTemplates") != null && !jsonObj.get("PreliveTemplates").isJsonNull()) {
        JsonArray jsonArraypreliveTemplates = jsonObj.getAsJsonArray("PreliveTemplates");
        if (jsonArraypreliveTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PreliveTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PreliveTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("PreliveTemplates").toString()));
          }

          // validate the optional field `PreliveTemplates` (array)
          for (int i = 0; i < jsonArraypreliveTemplates.size(); i++) {
            BoostTemplateItem.validateJsonElement(jsonArraypreliveTemplates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoostTemplateLists.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoostTemplateLists' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoostTemplateLists> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoostTemplateLists.class));

       return (TypeAdapter<T>) new TypeAdapter<BoostTemplateLists>() {
           @Override
           public void write(JsonWriter out, BoostTemplateLists value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoostTemplateLists read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoostTemplateLists given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoostTemplateLists
  * @throws IOException if the JSON string is invalid with respect to BoostTemplateLists
  */
  public static BoostTemplateLists fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoostTemplateLists.class);
  }

 /**
  * Convert an instance of BoostTemplateLists to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

