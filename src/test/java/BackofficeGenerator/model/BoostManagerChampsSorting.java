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
 * Gets or Sets BoostManagerChampsSorting
 */
@JsonAdapter(BoostManagerChampsSorting.Adapter.class)
public enum BoostManagerChampsSorting {
  
  BySportNameAsc(0),
  
  BySportNameDesc(1),
  
  ByCategoryNameAsc(2),
  
  ByCategoryNameDesc(3),
  
  ByChampNameAsc(4),
  
  ByChampNameDesc(5),
  
  PreliveTemplateNameAsc(6),
  
  PreliveTemplateNameDesc(7),
  
  LiveTemplateNameAsc(8),
  
  LiveTemplateNameDesc(9);

  private Integer value;

  BoostManagerChampsSorting(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoostManagerChampsSorting fromValue(Integer value) {
    for (BoostManagerChampsSorting b : BoostManagerChampsSorting.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BoostManagerChampsSorting> {
    @Override
    public void write(final JsonWriter jsonWriter, final BoostManagerChampsSorting enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BoostManagerChampsSorting read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return BoostManagerChampsSorting.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    BoostManagerChampsSorting.fromValue(value);
  }
}

