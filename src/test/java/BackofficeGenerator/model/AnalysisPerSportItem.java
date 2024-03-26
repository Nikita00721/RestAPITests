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
 * AnalysisPerSportItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T23:02:24.556418400+03:00[Europe/Moscow]")
public class AnalysisPerSportItem {
  public static final String SERIALIZED_NAME_SPORT_ID = "SportId";
  @SerializedName(SERIALIZED_NAME_SPORT_ID)
  private Long sportId;

  public static final String SERIALIZED_NAME_SPORT_NAME = "SportName";
  @SerializedName(SERIALIZED_NAME_SPORT_NAME)
  private String sportName;

  public static final String SERIALIZED_NAME_VOLUME = "Volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private Double volume;

  public static final String SERIALIZED_NAME_RETURNED = "Returned";
  @SerializedName(SERIALIZED_NAME_RETURNED)
  private Double returned;

  public static final String SERIALIZED_NAME_G_G_R = "GGR";
  @SerializedName(SERIALIZED_NAME_G_G_R)
  private Double GGR;

  public static final String SERIALIZED_NAME_MARGIN = "Margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private Double margin;

  public static final String SERIALIZED_NAME_VOLUME_PERCENT = "VolumePercent";
  @SerializedName(SERIALIZED_NAME_VOLUME_PERCENT)
  private Double volumePercent;

  public static final String SERIALIZED_NAME_BET_COUNT = "BetCount";
  @SerializedName(SERIALIZED_NAME_BET_COUNT)
  private Long betCount;

  public static final String SERIALIZED_NAME_SPORT_TYPE_ID = "SportTypeId";
  @SerializedName(SERIALIZED_NAME_SPORT_TYPE_ID)
  private Integer sportTypeId;

  public AnalysisPerSportItem() {
  }

  public AnalysisPerSportItem sportId(Long sportId) {
    this.sportId = sportId;
    return this;
  }

   /**
   * Get sportId
   * @return sportId
  **/
  @javax.annotation.Nullable
  public Long getSportId() {
    return sportId;
  }

  public void setSportId(Long sportId) {
    this.sportId = sportId;
  }


  public AnalysisPerSportItem sportName(String sportName) {
    this.sportName = sportName;
    return this;
  }

   /**
   * Get sportName
   * @return sportName
  **/
  @javax.annotation.Nullable
  public String getSportName() {
    return sportName;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }


  public AnalysisPerSportItem volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }


  public AnalysisPerSportItem returned(Double returned) {
    this.returned = returned;
    return this;
  }

   /**
   * Get returned
   * @return returned
  **/
  @javax.annotation.Nullable
  public Double getReturned() {
    return returned;
  }

  public void setReturned(Double returned) {
    this.returned = returned;
  }


  public AnalysisPerSportItem GGR(Double GGR) {
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


  public AnalysisPerSportItem margin(Double margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Get margin
   * @return margin
  **/
  @javax.annotation.Nullable
  public Double getMargin() {
    return margin;
  }

  public void setMargin(Double margin) {
    this.margin = margin;
  }


  public AnalysisPerSportItem volumePercent(Double volumePercent) {
    this.volumePercent = volumePercent;
    return this;
  }

   /**
   * Get volumePercent
   * @return volumePercent
  **/
  @javax.annotation.Nullable
  public Double getVolumePercent() {
    return volumePercent;
  }

  public void setVolumePercent(Double volumePercent) {
    this.volumePercent = volumePercent;
  }


  public AnalysisPerSportItem betCount(Long betCount) {
    this.betCount = betCount;
    return this;
  }

   /**
   * Get betCount
   * @return betCount
  **/
  @javax.annotation.Nullable
  public Long getBetCount() {
    return betCount;
  }

  public void setBetCount(Long betCount) {
    this.betCount = betCount;
  }


  public AnalysisPerSportItem sportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
    return this;
  }

   /**
   * Get sportTypeId
   * @return sportTypeId
  **/
  @javax.annotation.Nullable
  public Integer getSportTypeId() {
    return sportTypeId;
  }

  public void setSportTypeId(Integer sportTypeId) {
    this.sportTypeId = sportTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisPerSportItem analysisPerSportItem = (AnalysisPerSportItem) o;
    return Objects.equals(this.sportId, analysisPerSportItem.sportId) &&
        Objects.equals(this.sportName, analysisPerSportItem.sportName) &&
        Objects.equals(this.volume, analysisPerSportItem.volume) &&
        Objects.equals(this.returned, analysisPerSportItem.returned) &&
        Objects.equals(this.GGR, analysisPerSportItem.GGR) &&
        Objects.equals(this.margin, analysisPerSportItem.margin) &&
        Objects.equals(this.volumePercent, analysisPerSportItem.volumePercent) &&
        Objects.equals(this.betCount, analysisPerSportItem.betCount) &&
        Objects.equals(this.sportTypeId, analysisPerSportItem.sportTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sportId, sportName, volume, returned, GGR, margin, volumePercent, betCount, sportTypeId);
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
    sb.append("class AnalysisPerSportItem {\n");
    sb.append("    sportId: ").append(toIndentedString(sportId)).append("\n");
    sb.append("    sportName: ").append(toIndentedString(sportName)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    GGR: ").append(toIndentedString(GGR)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    volumePercent: ").append(toIndentedString(volumePercent)).append("\n");
    sb.append("    betCount: ").append(toIndentedString(betCount)).append("\n");
    sb.append("    sportTypeId: ").append(toIndentedString(sportTypeId)).append("\n");
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
    openapiFields.add("SportId");
    openapiFields.add("SportName");
    openapiFields.add("Volume");
    openapiFields.add("Returned");
    openapiFields.add("GGR");
    openapiFields.add("Margin");
    openapiFields.add("VolumePercent");
    openapiFields.add("BetCount");
    openapiFields.add("SportTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AnalysisPerSportItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnalysisPerSportItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalysisPerSportItem is not found in the empty JSON string", AnalysisPerSportItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnalysisPerSportItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnalysisPerSportItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SportName") != null && !jsonObj.get("SportName").isJsonNull()) && !jsonObj.get("SportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SportName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalysisPerSportItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalysisPerSportItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalysisPerSportItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalysisPerSportItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalysisPerSportItem>() {
           @Override
           public void write(JsonWriter out, AnalysisPerSportItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalysisPerSportItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalysisPerSportItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalysisPerSportItem
  * @throws IOException if the JSON string is invalid with respect to AnalysisPerSportItem
  */
  public static AnalysisPerSportItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalysisPerSportItem.class);
  }

 /**
  * Convert an instance of AnalysisPerSportItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

