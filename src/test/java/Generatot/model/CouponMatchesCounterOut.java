/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * CouponMatchesCounterOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class CouponMatchesCounterOut {
  public static final String SERIALIZED_NAME_TODAY = "Today";
  @SerializedName(SERIALIZED_NAME_TODAY)
  private Long today;

  public static final String SERIALIZED_NAME_TOMORROW = "Tomorrow";
  @SerializedName(SERIALIZED_NAME_TOMORROW)
  private Long tomorrow;

  public static final String SERIALIZED_NAME_UPCOMING = "Upcoming";
  @SerializedName(SERIALIZED_NAME_UPCOMING)
  private Long upcoming;

  public static final String SERIALIZED_NAME_MY_LEAGUES = "MyLeagues";
  @SerializedName(SERIALIZED_NAME_MY_LEAGUES)
  private Long myLeagues;

  public static final String SERIALIZED_NAME_WITH_MAX_ODD = "WithMaxOdd";
  @SerializedName(SERIALIZED_NAME_WITH_MAX_ODD)
  private Long withMaxOdd;

  public static final String SERIALIZED_NAME_TOP_LEAGUES = "TopLeagues";
  @SerializedName(SERIALIZED_NAME_TOP_LEAGUES)
  private Long topLeagues;

  public CouponMatchesCounterOut() {
  }

  public CouponMatchesCounterOut today(Long today) {
    this.today = today;
    return this;
  }

   /**
   * Get today
   * @return today
  **/
  @javax.annotation.Nonnull
  public Long getToday() {
    return today;
  }

  public void setToday(Long today) {
    this.today = today;
  }


  public CouponMatchesCounterOut tomorrow(Long tomorrow) {
    this.tomorrow = tomorrow;
    return this;
  }

   /**
   * Get tomorrow
   * @return tomorrow
  **/
  @javax.annotation.Nonnull
  public Long getTomorrow() {
    return tomorrow;
  }

  public void setTomorrow(Long tomorrow) {
    this.tomorrow = tomorrow;
  }


  public CouponMatchesCounterOut upcoming(Long upcoming) {
    this.upcoming = upcoming;
    return this;
  }

   /**
   * Get upcoming
   * @return upcoming
  **/
  @javax.annotation.Nonnull
  public Long getUpcoming() {
    return upcoming;
  }

  public void setUpcoming(Long upcoming) {
    this.upcoming = upcoming;
  }


  public CouponMatchesCounterOut myLeagues(Long myLeagues) {
    this.myLeagues = myLeagues;
    return this;
  }

   /**
   * Get myLeagues
   * @return myLeagues
  **/
  @javax.annotation.Nonnull
  public Long getMyLeagues() {
    return myLeagues;
  }

  public void setMyLeagues(Long myLeagues) {
    this.myLeagues = myLeagues;
  }


  public CouponMatchesCounterOut withMaxOdd(Long withMaxOdd) {
    this.withMaxOdd = withMaxOdd;
    return this;
  }

   /**
   * Get withMaxOdd
   * @return withMaxOdd
  **/
  @javax.annotation.Nonnull
  public Long getWithMaxOdd() {
    return withMaxOdd;
  }

  public void setWithMaxOdd(Long withMaxOdd) {
    this.withMaxOdd = withMaxOdd;
  }


  public CouponMatchesCounterOut topLeagues(Long topLeagues) {
    this.topLeagues = topLeagues;
    return this;
  }

   /**
   * Get topLeagues
   * @return topLeagues
  **/
  @javax.annotation.Nonnull
  public Long getTopLeagues() {
    return topLeagues;
  }

  public void setTopLeagues(Long topLeagues) {
    this.topLeagues = topLeagues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponMatchesCounterOut couponMatchesCounterOut = (CouponMatchesCounterOut) o;
    return Objects.equals(this.today, couponMatchesCounterOut.today) &&
        Objects.equals(this.tomorrow, couponMatchesCounterOut.tomorrow) &&
        Objects.equals(this.upcoming, couponMatchesCounterOut.upcoming) &&
        Objects.equals(this.myLeagues, couponMatchesCounterOut.myLeagues) &&
        Objects.equals(this.withMaxOdd, couponMatchesCounterOut.withMaxOdd) &&
        Objects.equals(this.topLeagues, couponMatchesCounterOut.topLeagues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(today, tomorrow, upcoming, myLeagues, withMaxOdd, topLeagues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponMatchesCounterOut {\n");
    sb.append("    today: ").append(toIndentedString(today)).append("\n");
    sb.append("    tomorrow: ").append(toIndentedString(tomorrow)).append("\n");
    sb.append("    upcoming: ").append(toIndentedString(upcoming)).append("\n");
    sb.append("    myLeagues: ").append(toIndentedString(myLeagues)).append("\n");
    sb.append("    withMaxOdd: ").append(toIndentedString(withMaxOdd)).append("\n");
    sb.append("    topLeagues: ").append(toIndentedString(topLeagues)).append("\n");
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
    openapiFields.add("Today");
    openapiFields.add("Tomorrow");
    openapiFields.add("Upcoming");
    openapiFields.add("MyLeagues");
    openapiFields.add("WithMaxOdd");
    openapiFields.add("TopLeagues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Today");
    openapiRequiredFields.add("Tomorrow");
    openapiRequiredFields.add("Upcoming");
    openapiRequiredFields.add("MyLeagues");
    openapiRequiredFields.add("WithMaxOdd");
    openapiRequiredFields.add("TopLeagues");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CouponMatchesCounterOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CouponMatchesCounterOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CouponMatchesCounterOut is not found in the empty JSON string", CouponMatchesCounterOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CouponMatchesCounterOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CouponMatchesCounterOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CouponMatchesCounterOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CouponMatchesCounterOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CouponMatchesCounterOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CouponMatchesCounterOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CouponMatchesCounterOut.class));

       return (TypeAdapter<T>) new TypeAdapter<CouponMatchesCounterOut>() {
           @Override
           public void write(JsonWriter out, CouponMatchesCounterOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CouponMatchesCounterOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CouponMatchesCounterOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CouponMatchesCounterOut
  * @throws IOException if the JSON string is invalid with respect to CouponMatchesCounterOut
  */
  public static CouponMatchesCounterOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CouponMatchesCounterOut.class);
  }

 /**
  * Convert an instance of CouponMatchesCounterOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

