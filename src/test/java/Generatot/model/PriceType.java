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
 * Gets or Sets PriceType
 */
@JsonAdapter(PriceType.Adapter.class)
public enum PriceType {
  
  Prelive(0),
  
  Live(1),
  
  SP(2),
  
  Boosted(3);

  private Integer value;

  PriceType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PriceType fromValue(Integer value) {
    for (PriceType b : PriceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PriceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PriceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PriceType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return PriceType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    PriceType.fromValue(value);
  }
}
