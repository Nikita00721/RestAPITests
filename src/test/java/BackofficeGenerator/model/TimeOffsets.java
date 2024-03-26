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

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets TimeOffsets
 */
@JsonAdapter(TimeOffsets.Adapter.class)
public enum TimeOffsets {
  
  UTC0(0),
  
  UTCP1(1),
  
  UTCP2(2),
  
  UTCP3(3),
  
  UTCP4(4),
  
  UTCP5(5),
  
  UTCP6(6),
  
  UTCP7(7),
  
  UTCP8(8),
  
  UTCP9(9),
  
  UTCP10(10),
  
  UTCP11(11),
  
  UTCP12(12),
  
  UTCN12(-12),
  
  UTCN11(-11),
  
  UTCN10(-10),
  
  UTCN9(-9),
  
  UTCN8(-8),
  
  UTCN7(-7),
  
  UTCN6(-6),
  
  UTCN5(-5),
  
  UTCN4(-4),
  
  UTCN3(-3),
  
  UTCN2(-2),
  
  UTCN1(-1);

  private Integer value;

  TimeOffsets(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeOffsets fromValue(Integer value) {
    for (TimeOffsets b : TimeOffsets.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TimeOffsets> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimeOffsets enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimeOffsets read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return TimeOffsets.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    TimeOffsets.fromValue(value);
  }
}
