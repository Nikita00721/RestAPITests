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
import java.time.OffsetDateTime;
import java.util.*;

/**
 * GetFeedReportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class GetFeedReportRequest {
  public static final String SERIALIZED_NAME_DATE_TO = "DateTo";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_CONFIGURATIONS = "Configurations";
  @SerializedName(SERIALIZED_NAME_CONFIGURATIONS)
  private List<Integer> configurations;

  public static final String SERIALIZED_NAME_FEED_SOURCES = "FeedSources";
  @SerializedName(SERIALIZED_NAME_FEED_SOURCES)
  private List<Integer> feedSources;

  public static final String SERIALIZED_NAME_SPORTS = "Sports";
  @SerializedName(SERIALIZED_NAME_SPORTS)
  private List<Integer> sports;

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Integer> categories;

  public static final String SERIALIZED_NAME_CHAMPIONSHIPS = "Championships";
  @SerializedName(SERIALIZED_NAME_CHAMPIONSHIPS)
  private List<Integer> championships;

  public static final String SERIALIZED_NAME_EXCLUDE_U_S = "ExcludeUS";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_U_S)
  private Boolean excludeUS;

  public static final String SERIALIZED_NAME_EXCLUDE_W_T_A = "ExcludeWTA";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_W_T_A)
  private Boolean excludeWTA;

  public static final String SERIALIZED_NAME_EXCLUDE_E_LEAGUES = "ExcludeELeagues";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_E_LEAGUES)
  private Boolean excludeELeagues;

  public static final String SERIALIZED_NAME_EXCLUDE_A_T_P_CHALLENGER = "ExcludeATPChallenger";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_A_T_P_CHALLENGER)
  private Boolean excludeATPChallenger;

  public static final String SERIALIZED_NAME_INCLUDE_OUTRIGHTS = "IncludeOutrights";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OUTRIGHTS)
  private Boolean includeOutrights;

  public static final String SERIALIZED_NAME_DATE_FROM = "DateFrom";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public GetFeedReportRequest() {
  }

  public GetFeedReportRequest dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  public GetFeedReportRequest configurations(List<Integer> configurations) {
    this.configurations = configurations;
    return this;
  }

  public GetFeedReportRequest addConfigurationsItem(Integer configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @javax.annotation.Nullable
  public List<Integer> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<Integer> configurations) {
    this.configurations = configurations;
  }


  public GetFeedReportRequest feedSources(List<Integer> feedSources) {
    this.feedSources = feedSources;
    return this;
  }

  public GetFeedReportRequest addFeedSourcesItem(Integer feedSourcesItem) {
    if (this.feedSources == null) {
      this.feedSources = new ArrayList<>();
    }
    this.feedSources.add(feedSourcesItem);
    return this;
  }

   /**
   * Get feedSources
   * @return feedSources
  **/
  @javax.annotation.Nullable
  public List<Integer> getFeedSources() {
    return feedSources;
  }

  public void setFeedSources(List<Integer> feedSources) {
    this.feedSources = feedSources;
  }


  public GetFeedReportRequest sports(List<Integer> sports) {
    this.sports = sports;
    return this;
  }

  public GetFeedReportRequest addSportsItem(Integer sportsItem) {
    if (this.sports == null) {
      this.sports = new ArrayList<>();
    }
    this.sports.add(sportsItem);
    return this;
  }

   /**
   * Get sports
   * @return sports
  **/
  @javax.annotation.Nullable
  public List<Integer> getSports() {
    return sports;
  }

  public void setSports(List<Integer> sports) {
    this.sports = sports;
  }


  public GetFeedReportRequest categories(List<Integer> categories) {
    this.categories = categories;
    return this;
  }

  public GetFeedReportRequest addCategoriesItem(Integer categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<Integer> getCategories() {
    return categories;
  }

  public void setCategories(List<Integer> categories) {
    this.categories = categories;
  }


  public GetFeedReportRequest championships(List<Integer> championships) {
    this.championships = championships;
    return this;
  }

  public GetFeedReportRequest addChampionshipsItem(Integer championshipsItem) {
    if (this.championships == null) {
      this.championships = new ArrayList<>();
    }
    this.championships.add(championshipsItem);
    return this;
  }

   /**
   * Get championships
   * @return championships
  **/
  @javax.annotation.Nullable
  public List<Integer> getChampionships() {
    return championships;
  }

  public void setChampionships(List<Integer> championships) {
    this.championships = championships;
  }


  public GetFeedReportRequest excludeUS(Boolean excludeUS) {
    this.excludeUS = excludeUS;
    return this;
  }

   /**
   * Get excludeUS
   * @return excludeUS
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeUS() {
    return excludeUS;
  }

  public void setExcludeUS(Boolean excludeUS) {
    this.excludeUS = excludeUS;
  }


  public GetFeedReportRequest excludeWTA(Boolean excludeWTA) {
    this.excludeWTA = excludeWTA;
    return this;
  }

   /**
   * Get excludeWTA
   * @return excludeWTA
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeWTA() {
    return excludeWTA;
  }

  public void setExcludeWTA(Boolean excludeWTA) {
    this.excludeWTA = excludeWTA;
  }


  public GetFeedReportRequest excludeELeagues(Boolean excludeELeagues) {
    this.excludeELeagues = excludeELeagues;
    return this;
  }

   /**
   * Get excludeELeagues
   * @return excludeELeagues
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeELeagues() {
    return excludeELeagues;
  }

  public void setExcludeELeagues(Boolean excludeELeagues) {
    this.excludeELeagues = excludeELeagues;
  }


  public GetFeedReportRequest excludeATPChallenger(Boolean excludeATPChallenger) {
    this.excludeATPChallenger = excludeATPChallenger;
    return this;
  }

   /**
   * Get excludeATPChallenger
   * @return excludeATPChallenger
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeATPChallenger() {
    return excludeATPChallenger;
  }

  public void setExcludeATPChallenger(Boolean excludeATPChallenger) {
    this.excludeATPChallenger = excludeATPChallenger;
  }


  public GetFeedReportRequest includeOutrights(Boolean includeOutrights) {
    this.includeOutrights = includeOutrights;
    return this;
  }

   /**
   * Get includeOutrights
   * @return includeOutrights
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeOutrights() {
    return includeOutrights;
  }

  public void setIncludeOutrights(Boolean includeOutrights) {
    this.includeOutrights = includeOutrights;
  }


  public GetFeedReportRequest dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedReportRequest getFeedReportRequest = (GetFeedReportRequest) o;
    return Objects.equals(this.dateTo, getFeedReportRequest.dateTo) &&
        Objects.equals(this.configurations, getFeedReportRequest.configurations) &&
        Objects.equals(this.feedSources, getFeedReportRequest.feedSources) &&
        Objects.equals(this.sports, getFeedReportRequest.sports) &&
        Objects.equals(this.categories, getFeedReportRequest.categories) &&
        Objects.equals(this.championships, getFeedReportRequest.championships) &&
        Objects.equals(this.excludeUS, getFeedReportRequest.excludeUS) &&
        Objects.equals(this.excludeWTA, getFeedReportRequest.excludeWTA) &&
        Objects.equals(this.excludeELeagues, getFeedReportRequest.excludeELeagues) &&
        Objects.equals(this.excludeATPChallenger, getFeedReportRequest.excludeATPChallenger) &&
        Objects.equals(this.includeOutrights, getFeedReportRequest.includeOutrights) &&
        Objects.equals(this.dateFrom, getFeedReportRequest.dateFrom);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTo, configurations, feedSources, sports, categories, championships, excludeUS, excludeWTA, excludeELeagues, excludeATPChallenger, includeOutrights, dateFrom);
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
    sb.append("class GetFeedReportRequest {\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    feedSources: ").append(toIndentedString(feedSources)).append("\n");
    sb.append("    sports: ").append(toIndentedString(sports)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    championships: ").append(toIndentedString(championships)).append("\n");
    sb.append("    excludeUS: ").append(toIndentedString(excludeUS)).append("\n");
    sb.append("    excludeWTA: ").append(toIndentedString(excludeWTA)).append("\n");
    sb.append("    excludeELeagues: ").append(toIndentedString(excludeELeagues)).append("\n");
    sb.append("    excludeATPChallenger: ").append(toIndentedString(excludeATPChallenger)).append("\n");
    sb.append("    includeOutrights: ").append(toIndentedString(includeOutrights)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
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
    openapiFields.add("DateTo");
    openapiFields.add("Configurations");
    openapiFields.add("FeedSources");
    openapiFields.add("Sports");
    openapiFields.add("Categories");
    openapiFields.add("Championships");
    openapiFields.add("ExcludeUS");
    openapiFields.add("ExcludeWTA");
    openapiFields.add("ExcludeELeagues");
    openapiFields.add("ExcludeATPChallenger");
    openapiFields.add("IncludeOutrights");
    openapiFields.add("DateFrom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetFeedReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFeedReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFeedReportRequest is not found in the empty JSON string", GetFeedReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFeedReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFeedReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Configurations") != null && !jsonObj.get("Configurations").isJsonNull() && !jsonObj.get("Configurations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Configurations` to be an array in the JSON string but got `%s`", jsonObj.get("Configurations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("FeedSources") != null && !jsonObj.get("FeedSources").isJsonNull() && !jsonObj.get("FeedSources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeedSources` to be an array in the JSON string but got `%s`", jsonObj.get("FeedSources").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Sports") != null && !jsonObj.get("Sports").isJsonNull() && !jsonObj.get("Sports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sports` to be an array in the JSON string but got `%s`", jsonObj.get("Sports").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Categories") != null && !jsonObj.get("Categories").isJsonNull() && !jsonObj.get("Categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Categories` to be an array in the JSON string but got `%s`", jsonObj.get("Categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Championships") != null && !jsonObj.get("Championships").isJsonNull() && !jsonObj.get("Championships").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Championships` to be an array in the JSON string but got `%s`", jsonObj.get("Championships").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFeedReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFeedReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFeedReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFeedReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFeedReportRequest>() {
           @Override
           public void write(JsonWriter out, GetFeedReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFeedReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetFeedReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetFeedReportRequest
  * @throws IOException if the JSON string is invalid with respect to GetFeedReportRequest
  */
  public static GetFeedReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFeedReportRequest.class);
  }

 /**
  * Convert an instance of GetFeedReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
