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
 * Gets or Sets EventProducts
 */
@JsonAdapter(EventProducts.Adapter.class)
public enum EventProducts {
  
  PreLive(0),
  
  Live(1);

  private Integer value;

  EventProducts(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventProducts fromValue(Integer value) {
    for (EventProducts b : EventProducts.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventProducts> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventProducts enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventProducts read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return EventProducts.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    EventProducts.fromValue(value);
  }
}

