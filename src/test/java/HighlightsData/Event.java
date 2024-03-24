package HighlightsData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

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
    private Integer id;
    @JsonProperty("SportId")
    private Integer sportId;
    @JsonProperty("SportTypeId")
    private Integer sportTypeId;
    @JsonProperty("SportName")
    private String sportName;
    @JsonProperty("SportIcon")
    private String sportIcon;
    @JsonProperty("CategoryId")
    private Integer categoryId;
    @JsonProperty("CategoryName")
    private String categoryName;
    @JsonProperty("ChampId")
    private Integer champId;
    @JsonProperty("ChampName")
    private String champName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("EventDate")
    private String eventDate;
    @JsonProperty("EventCode")
    private Integer eventCode;
    @JsonProperty("Status")
    private Integer status;
    @JsonProperty("ExtId")
    private String extId;
    @JsonProperty("IsPromo")
    private Boolean isPromo;
    @JsonProperty("IsLiveStream")
    private Boolean isLiveStream;
    @JsonProperty("EventType")
    private Integer eventType;
    @JsonProperty("Items")
    private List<Item__1> items;
    @JsonProperty("Node")
    private String node;
    @JsonProperty("Competitors")
    private List<Competitor> competitors;
    @JsonProperty("IsLiveEvent")
    private Boolean isLiveEvent;
    @JsonProperty("ISO")
    private String iso;
    @JsonProperty("CompetitorsCount")
    private Integer competitorsCount;
    @JsonProperty("CategoryOrder")
    private Integer categoryOrder;
    @JsonProperty("IsParlay")
    private Boolean isParlay;
    @JsonProperty("IsVirtual")
    private Boolean isVirtual;
    @JsonProperty("IsLiveBooked")
    private Boolean isLiveBooked;
    @JsonProperty("IsSafe")
    private Boolean isSafe;
    @JsonProperty("DbId")
    private Integer dbId;
    @JsonProperty("SelectionsCount")
    private Integer selectionsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
