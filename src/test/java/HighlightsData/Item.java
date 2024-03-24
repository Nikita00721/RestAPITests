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
    "Name",
    "Node",
    "Events",
    "Headers",
    "Order",
    "SportTypeId"
})
@Data
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Node")
    private String node;
    @JsonProperty("Events")
    private List<Event> events;
    @JsonProperty("Headers")
    private List<Header> headers;
    @JsonProperty("Order")
    private Integer order;
    @JsonProperty("SportTypeId")
    private Integer sportTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
