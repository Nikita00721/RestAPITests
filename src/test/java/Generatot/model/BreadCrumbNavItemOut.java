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
import java.util.*;

/**
 * BreadCrumbNavItemOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class BreadCrumbNavItemOut {
  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SportNavItemOut> items = new ArrayList<>();

  public BreadCrumbNavItemOut() {
  }

  public BreadCrumbNavItemOut items(List<SportNavItemOut> items) {
    this.items = items;
    return this;
  }

  public BreadCrumbNavItemOut addItemsItem(SportNavItemOut itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  public List<SportNavItemOut> getItems() {
    return items;
  }

  public void setItems(List<SportNavItemOut> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreadCrumbNavItemOut breadCrumbNavItemOut = (BreadCrumbNavItemOut) o;
    return Objects.equals(this.items, breadCrumbNavItemOut.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreadCrumbNavItemOut {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("Items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Items");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BreadCrumbNavItemOut
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BreadCrumbNavItemOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BreadCrumbNavItemOut is not found in the empty JSON string", BreadCrumbNavItemOut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BreadCrumbNavItemOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BreadCrumbNavItemOut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BreadCrumbNavItemOut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Items` to be an array in the JSON string but got `%s`", jsonObj.get("Items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("Items");
      // validate the required field `Items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        SportNavItemOut.validateJsonElement(jsonArrayitems.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BreadCrumbNavItemOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BreadCrumbNavItemOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BreadCrumbNavItemOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BreadCrumbNavItemOut.class));

       return (TypeAdapter<T>) new TypeAdapter<BreadCrumbNavItemOut>() {
           @Override
           public void write(JsonWriter out, BreadCrumbNavItemOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BreadCrumbNavItemOut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BreadCrumbNavItemOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BreadCrumbNavItemOut
  * @throws IOException if the JSON string is invalid with respect to BreadCrumbNavItemOut
  */
  public static BreadCrumbNavItemOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BreadCrumbNavItemOut.class);
  }

 /**
  * Convert an instance of BreadCrumbNavItemOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

