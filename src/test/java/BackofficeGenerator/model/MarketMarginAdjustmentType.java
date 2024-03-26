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
 * Gets or Sets MarketMarginAdjustmentType
 */
@JsonAdapter(MarketMarginAdjustmentType.Adapter.class)
public enum MarketMarginAdjustmentType {
  
  None(0),
  
  Favorite(1),
  
  Draw(2),
  
  Over(3),
  
  Yes(4),
  
  NegativeHcp(5);

  private Integer value;

  MarketMarginAdjustmentType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MarketMarginAdjustmentType fromValue(Integer value) {
    for (MarketMarginAdjustmentType b : MarketMarginAdjustmentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MarketMarginAdjustmentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MarketMarginAdjustmentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MarketMarginAdjustmentType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return MarketMarginAdjustmentType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    MarketMarginAdjustmentType.fromValue(value);
  }
}

