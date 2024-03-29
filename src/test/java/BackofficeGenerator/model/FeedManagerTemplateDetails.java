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
 * FeedManagerTemplateDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class FeedManagerTemplateDetails {
  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "TemplateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_PRODUCT = "Product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private EventProducts product;

  public static final String SERIALIZED_NAME_CONFIG_ID = "ConfigId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public static final String SERIALIZED_NAME_IS_GLOBAL = "IsGlobal";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL)
  private Boolean isGlobal;

  public static final String SERIALIZED_NAME_USED = "Used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Boolean used;

  public static final String SERIALIZED_NAME_INT_SPORT_ID = "IntSportId";
  @SerializedName(SERIALIZED_NAME_INT_SPORT_ID)
  private Integer intSportId;

  public static final String SERIALIZED_NAME_EVENT_PROVIDERS = "EventProviders";
  @SerializedName(SERIALIZED_NAME_EVENT_PROVIDERS)
  private List<FeedTemplateProvider> eventProviders;

  public static final String SERIALIZED_NAME_MARKET_PROVIDERS = "MarketProviders";
  @SerializedName(SERIALIZED_NAME_MARKET_PROVIDERS)
  private List<FeedTemplateProvider> marketProviders;

  public static final String SERIALIZED_NAME_MARKET_EXCEPTIONS = "MarketExceptions";
  @SerializedName(SERIALIZED_NAME_MARKET_EXCEPTIONS)
  private List<FeedManagerMarketExclusion> marketExceptions;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public FeedManagerTemplateDetails() {
  }

  public FeedManagerTemplateDetails(
     Boolean isGlobal
  ) {
    this();
    this.isGlobal = isGlobal;
  }

  public FeedManagerTemplateDetails templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public FeedManagerTemplateDetails product(EventProducts product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  public EventProducts getProduct() {
    return product;
  }

  public void setProduct(EventProducts product) {
    this.product = product;
  }


  public FeedManagerTemplateDetails configId(Integer configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nullable
  public Integer getConfigId() {
    return configId;
  }

  public void setConfigId(Integer configId) {
    this.configId = configId;
  }


   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getIsGlobal() {
    return isGlobal;
  }



  public FeedManagerTemplateDetails used(Boolean used) {
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @javax.annotation.Nullable
  public Boolean getUsed() {
    return used;
  }

  public void setUsed(Boolean used) {
    this.used = used;
  }


  public FeedManagerTemplateDetails intSportId(Integer intSportId) {
    this.intSportId = intSportId;
    return this;
  }

   /**
   * Get intSportId
   * @return intSportId
  **/
  @javax.annotation.Nullable
  public Integer getIntSportId() {
    return intSportId;
  }

  public void setIntSportId(Integer intSportId) {
    this.intSportId = intSportId;
  }


  public FeedManagerTemplateDetails eventProviders(List<FeedTemplateProvider> eventProviders) {
    this.eventProviders = eventProviders;
    return this;
  }

  public FeedManagerTemplateDetails addEventProvidersItem(FeedTemplateProvider eventProvidersItem) {
    if (this.eventProviders == null) {
      this.eventProviders = new ArrayList<>();
    }
    this.eventProviders.add(eventProvidersItem);
    return this;
  }

   /**
   * Get eventProviders
   * @return eventProviders
  **/
  @javax.annotation.Nullable
  public List<FeedTemplateProvider> getEventProviders() {
    return eventProviders;
  }

  public void setEventProviders(List<FeedTemplateProvider> eventProviders) {
    this.eventProviders = eventProviders;
  }


  public FeedManagerTemplateDetails marketProviders(List<FeedTemplateProvider> marketProviders) {
    this.marketProviders = marketProviders;
    return this;
  }

  public FeedManagerTemplateDetails addMarketProvidersItem(FeedTemplateProvider marketProvidersItem) {
    if (this.marketProviders == null) {
      this.marketProviders = new ArrayList<>();
    }
    this.marketProviders.add(marketProvidersItem);
    return this;
  }

   /**
   * Get marketProviders
   * @return marketProviders
  **/
  @javax.annotation.Nullable
  public List<FeedTemplateProvider> getMarketProviders() {
    return marketProviders;
  }

  public void setMarketProviders(List<FeedTemplateProvider> marketProviders) {
    this.marketProviders = marketProviders;
  }


  public FeedManagerTemplateDetails marketExceptions(List<FeedManagerMarketExclusion> marketExceptions) {
    this.marketExceptions = marketExceptions;
    return this;
  }

  public FeedManagerTemplateDetails addMarketExceptionsItem(FeedManagerMarketExclusion marketExceptionsItem) {
    if (this.marketExceptions == null) {
      this.marketExceptions = new ArrayList<>();
    }
    this.marketExceptions.add(marketExceptionsItem);
    return this;
  }

   /**
   * Get marketExceptions
   * @return marketExceptions
  **/
  @javax.annotation.Nullable
  public List<FeedManagerMarketExclusion> getMarketExceptions() {
    return marketExceptions;
  }

  public void setMarketExceptions(List<FeedManagerMarketExclusion> marketExceptions) {
    this.marketExceptions = marketExceptions;
  }


  public FeedManagerTemplateDetails templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedManagerTemplateDetails feedManagerTemplateDetails = (FeedManagerTemplateDetails) o;
    return Objects.equals(this.templateName, feedManagerTemplateDetails.templateName) &&
        Objects.equals(this.product, feedManagerTemplateDetails.product) &&
        Objects.equals(this.configId, feedManagerTemplateDetails.configId) &&
        Objects.equals(this.isGlobal, feedManagerTemplateDetails.isGlobal) &&
        Objects.equals(this.used, feedManagerTemplateDetails.used) &&
        Objects.equals(this.intSportId, feedManagerTemplateDetails.intSportId) &&
        Objects.equals(this.eventProviders, feedManagerTemplateDetails.eventProviders) &&
        Objects.equals(this.marketProviders, feedManagerTemplateDetails.marketProviders) &&
        Objects.equals(this.marketExceptions, feedManagerTemplateDetails.marketExceptions) &&
        Objects.equals(this.templateId, feedManagerTemplateDetails.templateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, product, configId, isGlobal, used, intSportId, eventProviders, marketProviders, marketExceptions, templateId);
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
    sb.append("class FeedManagerTemplateDetails {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    intSportId: ").append(toIndentedString(intSportId)).append("\n");
    sb.append("    eventProviders: ").append(toIndentedString(eventProviders)).append("\n");
    sb.append("    marketProviders: ").append(toIndentedString(marketProviders)).append("\n");
    sb.append("    marketExceptions: ").append(toIndentedString(marketExceptions)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("TemplateName");
    openapiFields.add("Product");
    openapiFields.add("ConfigId");
    openapiFields.add("IsGlobal");
    openapiFields.add("Used");
    openapiFields.add("IntSportId");
    openapiFields.add("EventProviders");
    openapiFields.add("MarketProviders");
    openapiFields.add("MarketExceptions");
    openapiFields.add("TemplateId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FeedManagerTemplateDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedManagerTemplateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedManagerTemplateDetails is not found in the empty JSON string", FeedManagerTemplateDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedManagerTemplateDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedManagerTemplateDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("TemplateName") != null && !jsonObj.get("TemplateName").isJsonNull()) && !jsonObj.get("TemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TemplateName").toString()));
      }
      // validate the optional field `Product`
      if (jsonObj.get("Product") != null && !jsonObj.get("Product").isJsonNull()) {
        EventProducts.validateJsonElement(jsonObj.get("Product"));
      }
      if (jsonObj.get("EventProviders") != null && !jsonObj.get("EventProviders").isJsonNull()) {
        JsonArray jsonArrayeventProviders = jsonObj.getAsJsonArray("EventProviders");
        if (jsonArrayeventProviders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("EventProviders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `EventProviders` to be an array in the JSON string but got `%s`", jsonObj.get("EventProviders").toString()));
          }

          // validate the optional field `EventProviders` (array)
          for (int i = 0; i < jsonArrayeventProviders.size(); i++) {
            FeedTemplateProvider.validateJsonElement(jsonArrayeventProviders.get(i));
          };
        }
      }
      if (jsonObj.get("MarketProviders") != null && !jsonObj.get("MarketProviders").isJsonNull()) {
        JsonArray jsonArraymarketProviders = jsonObj.getAsJsonArray("MarketProviders");
        if (jsonArraymarketProviders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MarketProviders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MarketProviders` to be an array in the JSON string but got `%s`", jsonObj.get("MarketProviders").toString()));
          }

          // validate the optional field `MarketProviders` (array)
          for (int i = 0; i < jsonArraymarketProviders.size(); i++) {
            FeedTemplateProvider.validateJsonElement(jsonArraymarketProviders.get(i));
          };
        }
      }
      if (jsonObj.get("MarketExceptions") != null && !jsonObj.get("MarketExceptions").isJsonNull()) {
        JsonArray jsonArraymarketExceptions = jsonObj.getAsJsonArray("MarketExceptions");
        if (jsonArraymarketExceptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("MarketExceptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `MarketExceptions` to be an array in the JSON string but got `%s`", jsonObj.get("MarketExceptions").toString()));
          }

          // validate the optional field `MarketExceptions` (array)
          for (int i = 0; i < jsonArraymarketExceptions.size(); i++) {
            FeedManagerMarketExclusion.validateJsonElement(jsonArraymarketExceptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedManagerTemplateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedManagerTemplateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedManagerTemplateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedManagerTemplateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedManagerTemplateDetails>() {
           @Override
           public void write(JsonWriter out, FeedManagerTemplateDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedManagerTemplateDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeedManagerTemplateDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeedManagerTemplateDetails
  * @throws IOException if the JSON string is invalid with respect to FeedManagerTemplateDetails
  */
  public static FeedManagerTemplateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedManagerTemplateDetails.class);
  }

 /**
  * Convert an instance of FeedManagerTemplateDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

