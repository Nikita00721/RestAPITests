package HighlightsData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Items",
    "SortOrder",
    "Template",
    "ColumnCount",
    "MColumnCount",
    "MarketTypeId",
    "Name",
    "HighlightsData.SpecOdd"
})
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Header {

    @JsonProperty("Items")
    private List<Item__3> items;
    @JsonProperty("SortOrder")
    private Integer sortOrder;
    @JsonProperty("Template")
    private Integer template;
    @JsonProperty("ColumnCount")
    private Integer columnCount;
    @JsonProperty("MColumnCount")
    private Integer mColumnCount;
    @JsonProperty("MarketTypeId")
    private String marketTypeId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("SpecOdd")
    private SpecOdd specOdd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
