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
 * Gets or Sets CurrencyDisplay
 */
@JsonAdapter(CurrencyDisplay.Adapter.class)
public enum CurrencyDisplay {
  
  NarrowSymbol(0),
  
  Code(1),
  
  Symbol(2);

  private Integer value;

  CurrencyDisplay(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CurrencyDisplay fromValue(Integer value) {
    for (CurrencyDisplay b : CurrencyDisplay.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CurrencyDisplay> {
    @Override
    public void write(final JsonWriter jsonWriter, final CurrencyDisplay enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CurrencyDisplay read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CurrencyDisplay.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    CurrencyDisplay.fromValue(value);
  }
}

