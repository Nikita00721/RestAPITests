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
 * Gets or Sets ProfitabilityBetTypes
 */
@JsonAdapter(ProfitabilityBetTypes.Adapter.class)
public enum ProfitabilityBetTypes {
  
  All(0),
  
  Singles(1),
  
  NonSingles(2),
  
  Multiples(3),
  
  Systems(4);

  private Integer value;

  ProfitabilityBetTypes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProfitabilityBetTypes fromValue(Integer value) {
    for (ProfitabilityBetTypes b : ProfitabilityBetTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProfitabilityBetTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProfitabilityBetTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProfitabilityBetTypes read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ProfitabilityBetTypes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    ProfitabilityBetTypes.fromValue(value);
  }
}

