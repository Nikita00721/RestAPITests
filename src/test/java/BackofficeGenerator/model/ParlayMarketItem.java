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
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.*;

/**
 * ParlayMarketItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class ParlayMarketItem {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "ProductName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_FIRST_MARKET_ID = "FirstMarketId";
  @SerializedName(SERIALIZED_NAME_FIRST_MARKET_ID)
  private Integer firstMarketId;

  public static final String SERIALIZED_NAME_FIRST_MARKET_NAME = "FirstMarketName";
  @SerializedName(SERIALIZED_NAME_FIRST_MARKET_NAME)
  private String firstMarketName;

  public static final String SERIALIZED_NAME_IS_FIRST_MOST_BALANCED = "IsFirstMostBalanced";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_MOST_BALANCED)
  private Boolean isFirstMostBalanced;

  public static final String SERIALIZED_NAME_SECOND_MARKET_ID = "SecondMarketId";
  @SerializedName(SERIALIZED_NAME_SECOND_MARKET_ID)
  private Integer secondMarketId;

  public static final String SERIALIZED_NAME_SECOND_MARKET_NAME = "SecondMarketName";
  @SerializedName(SERIALIZED_NAME_SECOND_MARKET_NAME)
  private String secondMarketName;

  public static final String SERIALIZED_NAME_IS_SECOND_MOST_BALANCED = "IsSecondMostBalanced";
  @SerializedName(SERIALIZED_NAME_IS_SECOND_MOST_BALANCED)
  private Boolean isSecondMostBalanced;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public ParlayMarketItem() {
  }

  public ParlayMarketItem productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public ParlayMarketItem productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public ParlayMarketItem firstMarketId(Integer firstMarketId) {
    this.firstMarketId = firstMarketId;
    return this;
  }

   /**
   * Get firstMarketId
   * @return firstMarketId
  **/
  @javax.annotation.Nullable
  public Integer getFirstMarketId() {
    return firstMarketId;
  }

  public void setFirstMarketId(Integer firstMarketId) {
    this.firstMarketId = firstMarketId;
  }


  public ParlayMarketItem firstMarketName(String firstMarketName) {
    this.firstMarketName = firstMarketName;
    return this;
  }

   /**
   * Get firstMarketName
   * @return firstMarketName
  **/
  @javax.annotation.Nullable
  public String getFirstMarketName() {
    return firstMarketName;
  }

  public void setFirstMarketName(String firstMarketName) {
    this.firstMarketName = firstMarketName;
  }


  public ParlayMarketItem isFirstMostBalanced(Boolean isFirstMostBalanced) {
    this.isFirstMostBalanced = isFirstMostBalanced;
    return this;
  }

   /**
   * Get isFirstMostBalanced
   * @return isFirstMostBalanced
  **/
  @javax.annotation.Nullable
  public Boolean getIsFirstMostBalanced() {
    return isFirstMostBalanced;
  }

  public void setIsFirstMostBalanced(Boolean isFirstMostBalanced) {
    this.isFirstMostBalanced = isFirstMostBalanced;
  }


  public ParlayMarketItem secondMarketId(Integer secondMarketId) {
    this.secondMarketId = secondMarketId;
    return this;
  }

   /**
   * Get secondMarketId
   * @return secondMarketId
  **/
  @javax.annotation.Nullable
  public Integer getSecondMarketId() {
    return secondMarketId;
  }

  public void setSecondMarketId(Integer secondMarketId) {
    this.secondMarketId = secondMarketId;
  }


  public ParlayMarketItem secondMarketName(String secondMarketName) {
    this.secondMarketName = secondMarketName;
    return this;
  }

   /**
   * Get secondMarketName
   * @return secondMarketName
  **/
  @javax.annotation.Nullable
  public String getSecondMarketName() {
    return secondMarketName;
  }

  public void setSecondMarketName(String secondMarketName) {
    this.secondMarketName = secondMarketName;
  }


  public ParlayMarketItem isSecondMostBalanced(Boolean isSecondMostBalanced) {
    this.isSecondMostBalanced = isSecondMostBalanced;
    return this;
  }

   /**
   * Get isSecondMostBalanced
   * @return isSecondMostBalanced
  **/
  @javax.annotation.Nullable
  public Boolean getIsSecondMostBalanced() {
    return isSecondMostBalanced;
  }

  public void setIsSecondMostBalanced(Boolean isSecondMostBalanced) {
    this.isSecondMostBalanced = isSecondMostBalanced;
  }


  public ParlayMarketItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParlayMarketItem parlayMarketItem = (ParlayMarketItem) o;
    return Objects.equals(this.productId, parlayMarketItem.productId) &&
        Objects.equals(this.productName, parlayMarketItem.productName) &&
        Objects.equals(this.firstMarketId, parlayMarketItem.firstMarketId) &&
        Objects.equals(this.firstMarketName, parlayMarketItem.firstMarketName) &&
        Objects.equals(this.isFirstMostBalanced, parlayMarketItem.isFirstMostBalanced) &&
        Objects.equals(this.secondMarketId, parlayMarketItem.secondMarketId) &&
        Objects.equals(this.secondMarketName, parlayMarketItem.secondMarketName) &&
        Objects.equals(this.isSecondMostBalanced, parlayMarketItem.isSecondMostBalanced) &&
        Objects.equals(this.id, parlayMarketItem.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, firstMarketId, firstMarketName, isFirstMostBalanced, secondMarketId, secondMarketName, isSecondMostBalanced, id);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParlayMarketItem {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    firstMarketId: ").append(toIndentedString(firstMarketId)).append("\n");
    sb.append("    firstMarketName: ").append(toIndentedString(firstMarketName)).append("\n");
    sb.append("    isFirstMostBalanced: ").append(toIndentedString(isFirstMostBalanced)).append("\n");
    sb.append("    secondMarketId: ").append(toIndentedString(secondMarketId)).append("\n");
    sb.append("    secondMarketName: ").append(toIndentedString(secondMarketName)).append("\n");
    sb.append("    isSecondMostBalanced: ").append(toIndentedString(isSecondMostBalanced)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("ProductId");
    openapiFields.add("ProductName");
    openapiFields.add("FirstMarketId");
    openapiFields.add("FirstMarketName");
    openapiFields.add("IsFirstMostBalanced");
    openapiFields.add("SecondMarketId");
    openapiFields.add("SecondMarketName");
    openapiFields.add("IsSecondMostBalanced");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParlayMarketItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParlayMarketItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParlayMarketItem is not found in the empty JSON string", ParlayMarketItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParlayMarketItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParlayMarketItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ProductName") != null && !jsonObj.get("ProductName").isJsonNull()) && !jsonObj.get("ProductName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProductName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProductName").toString()));
      }
      if ((jsonObj.get("FirstMarketName") != null && !jsonObj.get("FirstMarketName").isJsonNull()) && !jsonObj.get("FirstMarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstMarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstMarketName").toString()));
      }
      if ((jsonObj.get("SecondMarketName") != null && !jsonObj.get("SecondMarketName").isJsonNull()) && !jsonObj.get("SecondMarketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondMarketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondMarketName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParlayMarketItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParlayMarketItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParlayMarketItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParlayMarketItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ParlayMarketItem>() {
           @Override
           public void write(JsonWriter out, ParlayMarketItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParlayMarketItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParlayMarketItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParlayMarketItem
  * @throws IOException if the JSON string is invalid with respect to ParlayMarketItem
  */
  public static ParlayMarketItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParlayMarketItem.class);
  }

 /**
  * Convert an instance of ParlayMarketItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

