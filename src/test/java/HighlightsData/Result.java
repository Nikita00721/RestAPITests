package HighlightsData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Items",
    "EventsCount",
    "ShowMoreEventsInt",
    "ShowMoreEvents",
    "IsLiveStream"
})
@Data
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("Items")
    private List<Item> items;
    @JsonProperty("EventsCount")
    private Integer eventsCount;
    @JsonProperty("ShowMoreEventsInt")
    private Boolean showMoreEventsInt;
    @JsonProperty("ShowMoreEvents")
    private Boolean showMoreEvents;
    @JsonProperty("IsLiveStream")
    private Boolean isLiveStream;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
