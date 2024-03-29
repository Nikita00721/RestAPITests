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
 * SaveConfigMarginSettingsEquitationCoefficientsRequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class SaveConfigMarginSettingsEquitationCoefficientsRequestItem {
  public static final String SERIALIZED_NAME_C2 = "C2";
  @SerializedName(SERIALIZED_NAME_C2)
  private Double C2;

  public static final String SERIALIZED_NAME_C3 = "C3";
  @SerializedName(SERIALIZED_NAME_C3)
  private Double C3;

  public static final String SERIALIZED_NAME_C4 = "C4";
  @SerializedName(SERIALIZED_NAME_C4)
  private Double C4;

  public static final String SERIALIZED_NAME_C1 = "C1";
  @SerializedName(SERIALIZED_NAME_C1)
  private Double C1;

  public SaveConfigMarginSettingsEquitationCoefficientsRequestItem() {
  }

  public SaveConfigMarginSettingsEquitationCoefficientsRequestItem C2(Double C2) {
    this.C2 = C2;
    return this;
  }

   /**
   * Get C2
   * @return C2
  **/
  @javax.annotation.Nullable
  public Double getC2() {
    return C2;
  }

  public void setC2(Double C2) {
    this.C2 = C2;
  }


  public SaveConfigMarginSettingsEquitationCoefficientsRequestItem C3(Double C3) {
    this.C3 = C3;
    return this;
  }

   /**
   * Get C3
   * @return C3
  **/
  @javax.annotation.Nullable
  public Double getC3() {
    return C3;
  }

  public void setC3(Double C3) {
    this.C3 = C3;
  }


  public SaveConfigMarginSettingsEquitationCoefficientsRequestItem C4(Double C4) {
    this.C4 = C4;
    return this;
  }

   /**
   * Get C4
   * @return C4
  **/
  @javax.annotation.Nullable
  public Double getC4() {
    return C4;
  }

  public void setC4(Double C4) {
    this.C4 = C4;
  }


  public SaveConfigMarginSettingsEquitationCoefficientsRequestItem C1(Double C1) {
    this.C1 = C1;
    return this;
  }

   /**
   * Get C1
   * @return C1
  **/
  @javax.annotation.Nullable
  public Double getC1() {
    return C1;
  }

  public void setC1(Double C1) {
    this.C1 = C1;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveConfigMarginSettingsEquitationCoefficientsRequestItem saveConfigMarginSettingsEquitationCoefficientsRequestItem = (SaveConfigMarginSettingsEquitationCoefficientsRequestItem) o;
    return Objects.equals(this.C2, saveConfigMarginSettingsEquitationCoefficientsRequestItem.C2) &&
        Objects.equals(this.C3, saveConfigMarginSettingsEquitationCoefficientsRequestItem.C3) &&
        Objects.equals(this.C4, saveConfigMarginSettingsEquitationCoefficientsRequestItem.C4) &&
        Objects.equals(this.C1, saveConfigMarginSettingsEquitationCoefficientsRequestItem.C1);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(C2, C3, C4, C1);
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
    sb.append("class SaveConfigMarginSettingsEquitationCoefficientsRequestItem {\n");
    sb.append("    C2: ").append(toIndentedString(C2)).append("\n");
    sb.append("    C3: ").append(toIndentedString(C3)).append("\n");
    sb.append("    C4: ").append(toIndentedString(C4)).append("\n");
    sb.append("    C1: ").append(toIndentedString(C1)).append("\n");
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
    openapiFields.add("C2");
    openapiFields.add("C3");
    openapiFields.add("C4");
    openapiFields.add("C1");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SaveConfigMarginSettingsEquitationCoefficientsRequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SaveConfigMarginSettingsEquitationCoefficientsRequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaveConfigMarginSettingsEquitationCoefficientsRequestItem is not found in the empty JSON string", SaveConfigMarginSettingsEquitationCoefficientsRequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SaveConfigMarginSettingsEquitationCoefficientsRequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SaveConfigMarginSettingsEquitationCoefficientsRequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaveConfigMarginSettingsEquitationCoefficientsRequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaveConfigMarginSettingsEquitationCoefficientsRequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaveConfigMarginSettingsEquitationCoefficientsRequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaveConfigMarginSettingsEquitationCoefficientsRequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SaveConfigMarginSettingsEquitationCoefficientsRequestItem>() {
           @Override
           public void write(JsonWriter out, SaveConfigMarginSettingsEquitationCoefficientsRequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SaveConfigMarginSettingsEquitationCoefficientsRequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SaveConfigMarginSettingsEquitationCoefficientsRequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SaveConfigMarginSettingsEquitationCoefficientsRequestItem
  * @throws IOException if the JSON string is invalid with respect to SaveConfigMarginSettingsEquitationCoefficientsRequestItem
  */
  public static SaveConfigMarginSettingsEquitationCoefficientsRequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaveConfigMarginSettingsEquitationCoefficientsRequestItem.class);
  }

 /**
  * Convert an instance of SaveConfigMarginSettingsEquitationCoefficientsRequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

