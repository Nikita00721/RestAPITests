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
 * Gets or Sets EventStatus
 */
@JsonAdapter(EventStatus.Adapter.class)
public enum EventStatus {
  
  N(0),
  
  A(1),
  
  F(2),
  
  C(3),
  
  S(4),
  
  I(5),
  
  D(6),
  
  U(7),
  
  R(9);

  private Integer value;

  EventStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventStatus fromValue(Integer value) {
    for (EventStatus b : EventStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventStatus read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return EventStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    EventStatus.fromValue(value);
  }
}
