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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * CalcCashoutMarginCoefficientsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class CalcCashoutMarginCoefficientsRequest {
  public static final String SERIALIZED_NAME_POINT_A = "PointA";
  @SerializedName(SERIALIZED_NAME_POINT_A)
  private Double pointA;

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

  public static final String SERIALIZED_NAME_CURVE_TYPE = "CurveType";
  @SerializedName(SERIALIZED_NAME_CURVE_TYPE)
  private CashoutCurveTypes curveType;

  public CalcCashoutMarginCoefficientsRequest() {
  }

  public CalcCashoutMarginCoefficientsRequest pointA(Double pointA) {
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


  public CalcCashoutMarginCoefficientsRequest pointB(Double pointB) {
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


  public CalcCashoutMarginCoefficientsRequest pointC(Double pointC) {
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


  public CalcCashoutMarginCoefficientsRequest pointD(Double pointD) {
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


  public CalcCashoutMarginCoefficientsRequest pointX1(Double pointX1) {
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


  public CalcCashoutMarginCoefficientsRequest pointX2(Double pointX2) {
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


  public CalcCashoutMarginCoefficientsRequest curveType(CashoutCurveTypes curveType) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalcCashoutMarginCoefficientsRequest calcCashoutMarginCoefficientsRequest = (CalcCashoutMarginCoefficientsRequest) o;
    return Objects.equals(this.pointA, calcCashoutMarginCoefficientsRequest.pointA) &&
        Objects.equals(this.pointB, calcCashoutMarginCoefficientsRequest.pointB) &&
        Objects.equals(this.pointC, calcCashoutMarginCoefficientsRequest.pointC) &&
        Objects.equals(this.pointD, calcCashoutMarginCoefficientsRequest.pointD) &&
        Objects.equals(this.pointX1, calcCashoutMarginCoefficientsRequest.pointX1) &&
        Objects.equals(this.pointX2, calcCashoutMarginCoefficientsRequest.pointX2) &&
        Objects.equals(this.curveType, calcCashoutMarginCoefficientsRequest.curveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointA, pointB, pointC, pointD, pointX1, pointX2, curveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalcCashoutMarginCoefficientsRequest {\n");
    sb.append("    pointA: ").append(toIndentedString(pointA)).append("\n");
    sb.append("    pointB: ").append(toIndentedString(pointB)).append("\n");
    sb.append("    pointC: ").append(toIndentedString(pointC)).append("\n");
    sb.append("    pointD: ").append(toIndentedString(pointD)).append("\n");
    sb.append("    pointX1: ").append(toIndentedString(pointX1)).append("\n");
    sb.append("    pointX2: ").append(toIndentedString(pointX2)).append("\n");
    sb.append("    curveType: ").append(toIndentedString(curveType)).append("\n");
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
    openapiFields.add("PointA");
    openapiFields.add("PointB");
    openapiFields.add("PointC");
    openapiFields.add("PointD");
    openapiFields.add("PointX1");
    openapiFields.add("PointX2");
    openapiFields.add("CurveType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CalcCashoutMarginCoefficientsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalcCashoutMarginCoefficientsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalcCashoutMarginCoefficientsRequest is not found in the empty JSON string", CalcCashoutMarginCoefficientsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CalcCashoutMarginCoefficientsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalcCashoutMarginCoefficientsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!CalcCashoutMarginCoefficientsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalcCashoutMarginCoefficientsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalcCashoutMarginCoefficientsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalcCashoutMarginCoefficientsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CalcCashoutMarginCoefficientsRequest>() {
           @Override
           public void write(JsonWriter out, CalcCashoutMarginCoefficientsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalcCashoutMarginCoefficientsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CalcCashoutMarginCoefficientsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CalcCashoutMarginCoefficientsRequest
  * @throws IOException if the JSON string is invalid with respect to CalcCashoutMarginCoefficientsRequest
  */
  public static CalcCashoutMarginCoefficientsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalcCashoutMarginCoefficientsRequest.class);
  }

 /**
  * Convert an instance of CalcCashoutMarginCoefficientsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

