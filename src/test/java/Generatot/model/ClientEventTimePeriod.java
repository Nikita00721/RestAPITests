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
 * Gets or Sets ClientEventTimePeriod
 */
@JsonAdapter(ClientEventTimePeriod.Adapter.class)
public enum ClientEventTimePeriod {
  
  PreLive(0),
  
  Live(1),
  
  Mixed(2);

  private Integer value;

  ClientEventTimePeriod(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClientEventTimePeriod fromValue(Integer value) {
    for (ClientEventTimePeriod b : ClientEventTimePeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClientEventTimePeriod> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClientEventTimePeriod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClientEventTimePeriod read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ClientEventTimePeriod.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    ClientEventTimePeriod.fromValue(value);
  }
}

