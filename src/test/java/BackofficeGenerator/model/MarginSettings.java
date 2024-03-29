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
 * MarginSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class MarginSettings {
  public static final String SERIALIZED_NAME_POINT_B = "PointB";
  @SerializedName(SERIALIZED_NAME_POINT_B)
  private Double pointB;

  public static final String SERIALIZED_NAME_POINT_C = "PointC";
  @SerializedName(SERIALIZED_NAME_POINT_C)
  private Double pointC;

  public static final String SERIALIZED_NAME_POINT_D = "PointD";
  @SerializedName(SERIALIZED_NAME_POINT_D)
  private Double pointD;

  public static final String SERIALIZED_NAME_POINT_X1 = "PointX1";
  @SerializedName(SERIALIZED_NAME_POINT_X1)
  private Double pointX1;

  public static final String SERIALIZED_NAME_POINT_X2 = "PointX2";
  @SerializedName(SERIALIZED_NAME_POINT_X2)
  private Double pointX2;

  public static final String SERIALIZED_NAME_MIN_CASHOUT_VALUE = "MinCashoutValue";
  @SerializedName(SERIALIZED_NAME_MIN_CASHOUT_VALUE)
  private Double minCashoutValue;

  public static final String SERIALIZED_NAME_CURVE_TYPE = "CurveType";
  @SerializedName(SERIALIZED_NAME_CURVE_TYPE)
  private CashoutCurveTypes curveType;

  public static final String SERIALIZED_NAME_IS_INHERITED = "IsInherited";
  @SerializedName(SERIALIZED_NAME_IS_INHERITED)
  private Boolean isInherited;

  public static final String SERIALIZED_NAME_POINT_A = "PointA";
  @SerializedName(SERIALIZED_NAME_POINT_A)
  private Double pointA;

  public MarginSettings() {
  }

  public MarginSettings pointB(Double pointB) {
    this.pointB = pointB;
    return this;
  }

   /**
   * Get pointB
   * @return pointB
  **/
  @javax.annotation.Nullable
  public Double getPointB() {
    return pointB;
  }

  public void setPointB(Double pointB) {
    this.pointB = pointB;
  }


  public MarginSettings pointC(Double pointC) {
    this.pointC = pointC;
    return this;
  }

   /**
   * Get pointC
   * @return pointC
  **/
  @javax.annotation.Nullable
  public Double getPointC() {
    return pointC;
  }

  public void setPointC(Double pointC) {
    this.pointC = pointC;
  }


  public MarginSettings pointD(Double pointD) {
    this.pointD = pointD;
    return this;
  }

   /**
   * Get pointD
   * @return pointD
  **/
  @javax.annotation.Nullable
  public Double getPointD() {
    return pointD;
  }

  public void setPointD(Double pointD) {
    this.pointD = pointD;
  }


  public MarginSettings pointX1(Double pointX1) {
    this.pointX1 = pointX1;
    return this;
  }

   /**
   * Get pointX1
   * @return pointX1
  **/
  @javax.annotation.Nullable
  public Double getPointX1() {
    return pointX1;
  }

  public void setPointX1(Double pointX1) {
    this.pointX1 = pointX1;
  }


  public MarginSettings pointX2(Double pointX2) {
    this.pointX2 = pointX2;
    return this;
  }

   /**
   * Get pointX2
   * @return pointX2
  **/
  @javax.annotation.Nullable
  public Double getPointX2() {
    return pointX2;
  }

  public void setPointX2(Double pointX2) {
    this.pointX2 = pointX2;
  }


  public MarginSettings minCashoutValue(Double minCashoutValue) {
    this.minCashoutValue = minCashoutValue;
    return this;
  }

   /**
   * Get minCashoutValue
   * @return minCashoutValue
  **/
  @javax.annotation.Nullable
  public Double getMinCashoutValue() {
    return minCashoutValue;
  }

  public void setMinCashoutValue(Double minCashoutValue) {
    this.minCashoutValue = minCashoutValue;
  }


  public MarginSettings curveType(CashoutCurveTypes curveType) {
    this.curveType = curveType;
    return this;
  }

   /**
   * Get curveType
   * @return curveType
  **/
  @javax.annotation.Nullable
  public CashoutCurveTypes getCurveType() {
    return curveType;
  }

  public void setCurveType(CashoutCurveTypes curveType) {
    this.curveType = curveType;
  }


  public MarginSettings isInherited(Boolean isInherited) {
    this.isInherited = isInherited;
    return this;
  }

   /**
   * Get isInherited
   * @return isInherited
  **/
  @javax.annotation.Nullable
  public Boolean getIsInherited() {
    return isInherited;
  }

  public void setIsInherited(Boolean isInherited) {
    this.isInherited = isInherited;
  }


  public MarginSettings pointA(Double pointA) {
    this.pointA = pointA;
    return this;
  }

   /**
   * Get pointA
   * @return pointA
  **/
  @javax.annotation.Nullable
  public Double getPointA() {
    return pointA;
  }

  public void setPointA(Double pointA) {
    this.pointA = pointA;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginSettings marginSettings = (MarginSettings) o;
    return Objects.equals(this.pointB, marginSettings.pointB) &&
        Objects.equals(this.pointC, marginSettings.pointC) &&
        Objects.equals(this.pointD, marginSettings.pointD) &&
        Objects.equals(this.pointX1, marginSettings.pointX1) &&
        Objects.equals(this.pointX2, marginSettings.pointX2) &&
        Objects.equals(this.minCashoutValue, marginSettings.minCashoutValue) &&
        Objects.equals(this.curveType, marginSettings.curveType) &&
        Objects.equals(this.isInherited, marginSettings.isInherited) &&
        Objects.equals(this.pointA, marginSettings.pointA);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointB, pointC, pointD, pointX1, pointX2, minCashoutValue, curveType, isInherited, pointA);
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
    sb.append("class MarginSettings {\n");
    sb.append("    pointB: ").append(toIndentedString(pointB)).append("\n");
    sb.append("    pointC: ").append(toIndentedString(pointC)).append("\n");
    sb.append("    pointD: ").append(toIndentedString(pointD)).append("\n");
    sb.append("    pointX1: ").append(toIndentedString(pointX1)).append("\n");
    sb.append("    pointX2: ").append(toIndentedString(pointX2)).append("\n");
    sb.append("    minCashoutValue: ").append(toIndentedString(minCashoutValue)).append("\n");
    sb.append("    curveType: ").append(toIndentedString(curveType)).append("\n");
    sb.append("    isInherited: ").append(toIndentedString(isInherited)).append("\n");
    sb.append("    pointA: ").append(toIndentedString(pointA)).append("\n");
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
    openapiFields.add("PointB");
    openapiFields.add("PointC");
    openapiFields.add("PointD");
    openapiFields.add("PointX1");
    openapiFields.add("PointX2");
    openapiFields.add("MinCashoutValue");
    openapiFields.add("CurveType");
    openapiFields.add("IsInherited");
    openapiFields.add("PointA");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarginSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarginSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarginSettings is not found in the empty JSON string", MarginSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MarginSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MarginSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CurveType`
      if (jsonObj.get("CurveType") != null && !jsonObj.get("CurveType").isJsonNull()) {
        CashoutCurveTypes.validateJsonElement(jsonObj.get("CurveType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarginSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarginSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarginSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarginSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<MarginSettings>() {
           @Override
           public void write(JsonWriter out, MarginSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MarginSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarginSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarginSettings
  * @throws IOException if the JSON string is invalid with respect to MarginSettings
  */
  public static MarginSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarginSettings.class);
  }

 /**
  * Convert an instance of MarginSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

