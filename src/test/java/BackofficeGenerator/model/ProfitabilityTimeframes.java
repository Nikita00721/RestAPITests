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
 * Gets or Sets ProfitabilityTimeframes
 */
@JsonAdapter(ProfitabilityTimeframes.Adapter.class)
public enum ProfitabilityTimeframes {
  
  Daily(0),
  
  Weekly(1),
  
  Monthly(2);

  private Integer value;

  ProfitabilityTimeframes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProfitabilityTimeframes fromValue(Integer value) {
    for (ProfitabilityTimeframes b : ProfitabilityTimeframes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProfitabilityTimeframes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProfitabilityTimeframes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProfitabilityTimeframes read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ProfitabilityTimeframes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    ProfitabilityTimeframes.fromValue(value);
  }
}

