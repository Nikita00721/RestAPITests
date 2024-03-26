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
 * Gets or Sets BoostItemType
 */
@JsonAdapter(BoostItemType.Adapter.class)
public enum BoostItemType {
  
  Simple(0),
  
  BetBuilder(1);

  private Integer value;

  BoostItemType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoostItemType fromValue(Integer value) {
    for (BoostItemType b : BoostItemType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BoostItemType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BoostItemType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BoostItemType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return BoostItemType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    BoostItemType.fromValue(value);
  }
}

