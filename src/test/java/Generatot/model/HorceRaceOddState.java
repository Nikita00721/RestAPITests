/*
 * WebApi.Frontend
 * WebApi.Frontend
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Generatot.model;

import Generatot.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * HorceRaceOddState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class HorceRaceOddState {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_ODD_STATUS = "OddStatus";
  @SerializedName(SERIALIZED_NAME_ODD_STATUS)
  private OddStatus oddStatus;

  public static final String SERIALIZED_NAME_IS_LIVE = "IsLive";
  @SerializedName(SERIALIZED_NAME_IS_LIVE)
  private Boolean isLive;

  public HorceRaceOddState() {
  }

  public HorceRaceOddState id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public HorceRaceOddState price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public HorceRaceOddState oddStatus(OddStatus oddStatus) {
    this.oddStatus = oddStatus;
    return this;
  }

   /**
   * Get oddStatus
   * @return oddStatus
  **/
  @javax.annotation.Nonnull
  public OddStatus getOddStatus() {
    return oddStatus;
  }

  public void setOddStatus(OddStatus oddStatus) {
    this.oddStatus = oddStatus;
  }


  public HorceRaceOddState isLive(Boolean isLive) {
    this.isLive = isLive;
    return this;
  }

   /**
   * Get isLive
   * @return isLive
  **/
  @javax.annotation.Nonnull
  public Boolean getIsLive() {
    return isLive;
  }

  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HorceRaceOddState horceRaceOddState = (HorceRaceOddState) o;
    return Objects.equals(this.id, horceRaceOddState.id) &&
        Objects.equals(this.price, horceRaceOddState.price) &&
        Objects.equals(this.oddStatus, horceRaceOddState.oddStatus) &&
        Objects.equals(this.isLive, horceRaceOddState.isLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, oddStatus, isLive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HorceRaceOddState {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    oddStatus: ").append(toIndentedString(oddStatus)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("Price");
    openapiFields.add("OddStatus");
    openapiFields.add("IsLive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Price");
    openapiRequiredFields.add("OddStatus");
    openapiRequiredFields.add("IsLive");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HorceRaceOddState
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HorceRaceOddState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HorceRaceOddState is not found in the empty JSON string", HorceRaceOddState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HorceRaceOddState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HorceRaceOddState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HorceRaceOddState.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `OddStatus`
      OddStatus.validateJsonElement(jsonObj.get("OddStatus"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HorceRaceOddState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HorceRaceOddState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HorceRaceOddState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HorceRaceOddState.class));

       return (TypeAdapter<T>) new TypeAdapter<HorceRaceOddState>() {
           @Override
           public void write(JsonWriter out, HorceRaceOddState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HorceRaceOddState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HorceRaceOddState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HorceRaceOddState
  * @throws IOException if the JSON string is invalid with respect to HorceRaceOddState
  */
  public static HorceRaceOddState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HorceRaceOddState.class);
  }

 /**
  * Convert an instance of HorceRaceOddState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

