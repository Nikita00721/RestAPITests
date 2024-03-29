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
 * TotoGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-25T19:49:20.010092+03:00[Europe/Moscow]")
public class TotoGroup {
  public static final String SERIALIZED_NAME_TYPE_ID = "TypeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private TotoType typeId;

  public static final String SERIALIZED_NAME_LIST = "List";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<Toto> _list = new ArrayList<>();

  public TotoGroup() {
  }

  public TotoGroup typeId(TotoType typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  public TotoType getTypeId() {
    return typeId;
  }

  public void setTypeId(TotoType typeId) {
    this.typeId = typeId;
  }


  public TotoGroup _list(List<Toto> _list) {
    this._list = _list;
    return this;
  }

  public TotoGroup addListItem(Toto _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @javax.annotation.Nonnull
  public List<Toto> getList() {
    return _list;
  }

  public void setList(List<Toto> _list) {
    this._list = _list;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotoGroup totoGroup = (TotoGroup) o;
    return Objects.equals(this.typeId, totoGroup.typeId) &&
        Objects.equals(this._list, totoGroup._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotoGroup {\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("TypeId");
    openapiFields.add("List");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TypeId");
    openapiRequiredFields.add("List");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TotoGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TotoGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotoGroup is not found in the empty JSON string", TotoGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TotoGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TotoGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotoGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `TypeId`
      TotoType.validateJsonElement(jsonObj.get("TypeId"));
      // ensure the json data is an array
      if (!jsonObj.get("List").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `List` to be an array in the JSON string but got `%s`", jsonObj.get("List").toString()));
      }

      JsonArray jsonArray_list = jsonObj.getAsJsonArray("List");
      // validate the required field `List` (array)
      for (int i = 0; i < jsonArray_list.size(); i++) {
        Toto.validateJsonElement(jsonArray_list.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotoGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotoGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotoGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotoGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<TotoGroup>() {
           @Override
           public void write(JsonWriter out, TotoGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TotoGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TotoGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotoGroup
  * @throws IOException if the JSON string is invalid with respect to TotoGroup
  */
  public static TotoGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotoGroup.class);
  }

 /**
  * Convert an instance of TotoGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

