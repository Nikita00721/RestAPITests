
package LiveEventsData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "SportId",
    "SportTypeId",
    "SportName",
    "SportIcon",
    "CategoryId",
    "CategoryName",
    "ChampId",
    "ChampName",
    "Name",
    "EventDate",
    "EventCode",
    "Status",
    "ExtId",
    "IsPromo",
    "IsLiveStream",
    "EventType",
    "Items",
    "Node",
    "Competitors",
    "IsLiveEvent",
    "LiveCurrentTime",
    "LiveScore",
    "ISO",
    "CompetitorsCount",
    "CategoryOrder",
    "IsParlay",
    "IsVirtual",
    "IsLiveBooked",
    "IsSafe",
    "DbId",
    "SelectionsCount"
})
@Data
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("SportId")
    public Integer sportId;
    @JsonProperty("SportTypeId")
    public Integer sportTypeId;
    @JsonProperty("SportName")
    public String sportName;
    @JsonProperty("SportIcon")
    public String sportIcon;
    @JsonProperty("CategoryId")
    public Integer categoryId;
    @JsonProperty("CategoryName")
    public String categoryName;
    @JsonProperty("ChampId")
    public Integer champId;
    @JsonProperty("ChampName")
    public String champName;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("EventDate")
    public String eventDate;
    @JsonProperty("EventCode")
    public Integer eventCode;
    @JsonProperty("Status")
    public Integer status;
    @JsonProperty("ExtId")
    public String extId;
    @JsonProperty("IsPromo")
    public Boolean isPromo;
    @JsonProperty("IsLiveStream")
    public Boolean isLiveStream;
    @JsonProperty("EventType")
    public Integer eventType;
    @JsonProperty("Items")
    public List<Item__2> items;
    @JsonProperty("Node")
    public String node;
    @JsonProperty("Competitors")
    public List<Competitor> competitors;
    @JsonProperty("IsLiveEvent")
    public Boolean isLiveEvent;
    @JsonProperty("LiveCurrentTime")
    public String liveCurrentTime;
    @JsonProperty("LiveScore")
    public String liveScore;
    @JsonProperty("ISO")
    public String iso;
    @JsonProperty("CompetitorsCount")
    public Integer competitorsCount;
    @JsonProperty("CategoryOrder")
    public Integer categoryOrder;
    @JsonProperty("IsParlay")
    public Boolean isParlay;
    @JsonProperty("IsVirtual")
    public Boolean isVirtual;
    @JsonProperty("IsLiveBooked")
    public Boolean isLiveBooked;
    @JsonProperty("IsSafe")
    public Boolean isSafe;
    @JsonProperty("DbId")
    public Integer dbId;
    @JsonProperty("SelectionsCount")
    public Integer selectionsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
