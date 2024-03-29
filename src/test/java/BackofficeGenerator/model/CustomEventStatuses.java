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
 * Gets or Sets CustomEventStatuses
 */
@JsonAdapter(CustomEventStatuses.Adapter.class)
public enum CustomEventStatuses {
  
  All(0),
  
  Cancelled(1),
  
  ManuallySettled(2),
  
  PendingResults(3),
  
  WithMarkets(4),
  
  Favorite(5),
  
  SettledByAutoIs(6);

  private Integer value;

  CustomEventStatuses(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomEventStatuses fromValue(Integer value) {
    for (CustomEventStatuses b : CustomEventStatuses.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CustomEventStatuses> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomEventStatuses enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomEventStatuses read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CustomEventStatuses.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    CustomEventStatuses.fromValue(value);
  }
}

