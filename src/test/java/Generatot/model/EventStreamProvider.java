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
 * Gets or Sets EventStreamProvider
 */
@JsonAdapter(EventStreamProvider.Adapter.class)
public enum EventStreamProvider {
  
  Betradar(5),
  
  Perform(6),
  
  Twitch(7),
  
  SportsMedia(8),
  
  BetradarStreamV2(9),
  
  Fbstreambro(10),
  
  BetGenius(11),
  
  IMGArena(12);

  private Integer value;

  EventStreamProvider(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventStreamProvider fromValue(Integer value) {
    for (EventStreamProvider b : EventStreamProvider.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventStreamProvider> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventStreamProvider enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventStreamProvider read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return EventStreamProvider.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    EventStreamProvider.fromValue(value);
  }
}
