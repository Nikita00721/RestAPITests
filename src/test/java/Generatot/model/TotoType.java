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
 * Gets or Sets TotoType
 */
@JsonAdapter(TotoType.Adapter.class)
public enum TotoType {
  
  MatchBet(1),
  
  CorrectScore(2);

  private Integer value;

  TotoType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TotoType fromValue(Integer value) {
    for (TotoType b : TotoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TotoType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TotoType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TotoType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return TotoType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    TotoType.fromValue(value);
  }
}
