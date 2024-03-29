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
 * Gets or Sets HeaderTypes
 */
@JsonAdapter(HeaderTypes.Adapter.class)
public enum HeaderTypes {
  
  None(0),
  
  UseMostBalanced(1),
  
  AsianLines(2);

  private Integer value;

  HeaderTypes(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HeaderTypes fromValue(Integer value) {
    for (HeaderTypes b : HeaderTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<HeaderTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final HeaderTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HeaderTypes read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return HeaderTypes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    HeaderTypes.fromValue(value);
  }
}

