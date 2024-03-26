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

import BackofficeGenerator.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * GGRResultItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GGRResultItem {
  public static final String SERIALIZED_NAME_G_G_R = "GGR";
  @SerializedName(SERIALIZED_NAME_G_G_R)
  private Double GGR;

  public static final String SERIALIZED_NAME_GG_R_BASE = "GGRBase";
  @SerializedName(SERIALIZED_NAME_GG_R_BASE)
  private Double ggRBase;

  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public GGRResultItem() {
  }

  public GGRResultItem GGR(Double GGR) {
    this.GGR = GGR;
    return this;
  }

   /**
   * Get GGR
   * @return GGR
  **/
  @javax.annotation.Nullable
  public Double getGGR() {
    return GGR;
  }

  public void setGGR(Double GGR) {
    this.GGR = GGR;
  }


  public GGRResultItem ggRBase(Double ggRBase) {
    this.ggRBase = ggRBase;
    return this;
  }

   /**
   * Get ggRBase
   * @return ggRBase
  **/
  @javax.annotation.Nullable
  public Double getGgRBase() {
    return ggRBase;
  }

  public void setGgRBase(Double ggRBase) {
    this.ggRBase = ggRBase;
  }


  public GGRResultItem date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GGRResultItem ggRResultItem = (GGRResultItem) o;
    return Objects.equals(this.GGR, ggRResultItem.GGR) &&
        Objects.equals(this.ggRBase, ggRResultItem.ggRBase) &&
        Objects.equals(this.date, ggRResultItem.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GGR, ggRBase, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GGRResultItem {\n");
    sb.append("    GGR: ").append(toIndentedString(GGR)).append("\n");
    sb.append("    ggRBase: ").append(toIndentedString(ggRBase)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("GGR");
    openapiFields.add("GGRBase");
    openapiFields.add("Date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GGRResultItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GGRResultItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GGRResultItem is not found in the empty JSON string", GGRResultItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GGRResultItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GGRResultItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GGRResultItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GGRResultItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GGRResultItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GGRResultItem.class));

       return (TypeAdapter<T>) new TypeAdapter<GGRResultItem>() {
           @Override
           public void write(JsonWriter out, GGRResultItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GGRResultItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GGRResultItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GGRResultItem
  * @throws IOException if the JSON string is invalid with respect to GGRResultItem
  */
  public static GGRResultItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GGRResultItem.class);
  }

 /**
  * Convert an instance of GGRResultItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

