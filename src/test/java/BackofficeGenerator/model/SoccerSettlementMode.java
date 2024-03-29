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
 * Gets or Sets SoccerSettlementMode
 */
@JsonAdapter(SoccerSettlementMode.Adapter.class)
public enum SoccerSettlementMode {
  
  Completed(0),
  
  InPlay1stHalf(1),
  
  InPlay2ndHalf(2),
  
  Abandoned1stHalf(3),
  
  Abandoned2ndHalf(4);

  private Integer value;

  SoccerSettlementMode(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SoccerSettlementMode fromValue(Integer value) {
    for (SoccerSettlementMode b : SoccerSettlementMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SoccerSettlementMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SoccerSettlementMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SoccerSettlementMode read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return SoccerSettlementMode.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    SoccerSettlementMode.fromValue(value);
  }
}

