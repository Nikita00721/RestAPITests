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

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets CouponType
 */
@JsonAdapter(CouponType.Adapter.class)
public enum CouponType {
  
  None(0),
  
  Today(1),
  
  Tomorrow(2),
  
  Upcoming(3),
  
  MyLeagues(4),
  
  WithMaxOdd(5),
  
  TopLeagues(6),
  
  Player(7),
  
  BoostOdds(8);

  private Integer value;

  CouponType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CouponType fromValue(Integer value) {
    for (CouponType b : CouponType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CouponType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CouponType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CouponType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CouponType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    CouponType.fromValue(value);
  }
}

