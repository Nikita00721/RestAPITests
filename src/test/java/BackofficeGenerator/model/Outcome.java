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
 * Outcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class Outcome {
  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_ODD = "Odd";
  @SerializedName(SERIALIZED_NAME_ODD)
  private Long odd;

  public static final String SERIALIZED_NAME_BONUS = "Bonus";
  @SerializedName(SERIALIZED_NAME_BONUS)
  private Boolean bonus;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public Outcome() {
  }

  public Outcome result(Integer result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


  public Outcome odd(Long odd) {
    this.odd = odd;
    return this;
  }

   /**
   * Get odd
   * @return odd
  **/
  @javax.annotation.Nullable
  public Long getOdd() {
    return odd;
  }

  public void setOdd(Long odd) {
    this.odd = odd;
  }


  public Outcome bonus(Boolean bonus) {
    this.bonus = bonus;
    return this;
  }

   /**
   * Get bonus
   * @return bonus
  **/
  @javax.annotation.Nullable
  public Boolean getBonus() {
    return bonus;
  }

  public void setBonus(Boolean bonus) {
    this.bonus = bonus;
  }


  public Outcome name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outcome outcome = (Outcome) o;
    return Objects.equals(this.result, outcome.result) &&
        Objects.equals(this.odd, outcome.odd) &&
        Objects.equals(this.bonus, outcome.bonus) &&
        Objects.equals(this.name, outcome.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, odd, bonus, name);
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
    sb.append("class Outcome {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    odd: ").append(toIndentedString(odd)).append("\n");
    sb.append("    bonus: ").append(toIndentedString(bonus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("Odd");
    openapiFields.add("Bonus");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outcome
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outcome.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outcome is not found in the empty JSON string", Outcome.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outcome.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outcome` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!Outcome.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outcome' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outcome> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outcome.class));

       return (TypeAdapter<T>) new TypeAdapter<Outcome>() {
           @Override
           public void write(JsonWriter out, Outcome value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outcome read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outcome given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outcome
  * @throws IOException if the JSON string is invalid with respect to Outcome
  */
  public static Outcome fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outcome.class);
  }

 /**
  * Convert an instance of Outcome to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

