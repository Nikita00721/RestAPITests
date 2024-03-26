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
import java.time.OffsetDateTime;
import java.util.*;

/**
 * CompetitorItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CompetitorItem {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_BIRTHDATE = "Birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  private OffsetDateTime birthdate;

  public static final String SERIALIZED_NAME_AGE = "Age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Integer age;

  public static final String SERIALIZED_NAME_JERSEY = "Jersey";
  @SerializedName(SERIALIZED_NAME_JERSEY)
  private String jersey;

  public static final String SERIALIZED_NAME_BIRTHDAY_STATUS = "BirthdayStatus";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY_STATUS)
  private CompetitorStatus birthdayStatus;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "CountryName";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public CompetitorItem() {
  }

  public CompetitorItem name(String name) {
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


  public CompetitorItem sportName(String sportName) {
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


  public CompetitorItem birthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
  }


  public CompetitorItem age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  public CompetitorItem jersey(String jersey) {
    this.jersey = jersey;
    return this;
  }

   /**
   * Get jersey
   * @return jersey
  **/
  @javax.annotation.Nullable
  public String getJersey() {
    return jersey;
  }

  public void setJersey(String jersey) {
    this.jersey = jersey;
  }


  public CompetitorItem birthdayStatus(CompetitorStatus birthdayStatus) {
    this.birthdayStatus = birthdayStatus;
    return this;
  }

   /**
   * Get birthdayStatus
   * @return birthdayStatus
  **/
  @javax.annotation.Nullable
  public CompetitorStatus getBirthdayStatus() {
    return birthdayStatus;
  }

  public void setBirthdayStatus(CompetitorStatus birthdayStatus) {
    this.birthdayStatus = birthdayStatus;
  }


  public CompetitorItem countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CompetitorItem countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @javax.annotation.Nullable
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public CompetitorItem id(Integer id) {
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
    CompetitorItem competitorItem = (CompetitorItem) o;
    return Objects.equals(this.name, competitorItem.name) &&
        Objects.equals(this.sportName, competitorItem.sportName) &&
        Objects.equals(this.birthdate, competitorItem.birthdate) &&
        Objects.equals(this.age, competitorItem.age) &&
        Objects.equals(this.jersey, competitorItem.jersey) &&
        Objects.equals(this.birthdayStatus, competitorItem.birthdayStatus) &&
        Objects.equals(this.countryCode, competitorItem.countryCode) &&
        Objects.equals(this.countryName, competitorItem.countryName) &&
        Objects.equals(this.id, competitorItem.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sportName, birthdate, age, jersey, birthdayStatus, countryCode, countryName, id);
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
    sb.append("class CompetitorItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    jersey: ").append(toIndentedString(jersey)).append("\n");
    sb.append("    birthdayStatus: ").append(toIndentedString(birthdayStatus)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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
    openapiFields.add("Birthdate");
    openapiFields.add("Age");
    openapiFields.add("Jersey");
    openapiFields.add("BirthdayStatus");
    openapiFields.add("CountryCode");
    openapiFields.add("CountryName");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CompetitorItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompetitorItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompetitorItem is not found in the empty JSON string", CompetitorItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompetitorItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompetitorItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
      if ((jsonObj.get("Jersey") != null && !jsonObj.get("Jersey").isJsonNull()) && !jsonObj.get("Jersey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Jersey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Jersey").toString()));
      }
      // validate the optional field `BirthdayStatus`
      if (jsonObj.get("BirthdayStatus") != null && !jsonObj.get("BirthdayStatus").isJsonNull()) {
        CompetitorStatus.validateJsonElement(jsonObj.get("BirthdayStatus"));
      }
      if ((jsonObj.get("CountryCode") != null && !jsonObj.get("CountryCode").isJsonNull()) && !jsonObj.get("CountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryCode").toString()));
      }
      if ((jsonObj.get("CountryName") != null && !jsonObj.get("CountryName").isJsonNull()) && !jsonObj.get("CountryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CountryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CountryName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompetitorItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompetitorItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompetitorItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompetitorItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CompetitorItem>() {
           @Override
           public void write(JsonWriter out, CompetitorItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompetitorItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompetitorItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompetitorItem
  * @throws IOException if the JSON string is invalid with respect to CompetitorItem
  */
  public static CompetitorItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompetitorItem.class);
  }

 /**
  * Convert an instance of CompetitorItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
