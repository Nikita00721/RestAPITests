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
 * Gets or Sets OverviewTypes
 */
@JsonAdapter(OverviewTypes.Adapter.class)
public enum OverviewTypes {
  
  None(0),
  
  American(1),
  
  Italian(2);

  private Integer value;

  OverviewTypes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OverviewTypes fromValue(Integer value) {
    for (OverviewTypes b : OverviewTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OverviewTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final OverviewTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OverviewTypes read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return OverviewTypes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    OverviewTypes.fromValue(value);
  }
}

