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
    "Id",
    "Name",
    "MarketTypeId",
    "OrgMarketTypeId",
    "Items",
    "ColumnCount",
    "Status",
    "SportMarketId",
    "MColumnCount",
    "Template",
    "ShortName",
    "SpecialOddsName",
    "SpecialOddsValue"
})
@Data
@Generated("jsonschema2pojo")
public class Item__1 {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("MarketTypeId")
    private String marketTypeId;
    @JsonProperty("OrgMarketTypeId")
    private Integer orgMarketTypeId;
    @JsonProperty("Items")
    private List<Item__2> items;
    @JsonProperty("ColumnCount")
    private Integer columnCount;
    @JsonProperty("Status")
    private Integer status;
    @JsonProperty("SportMarketId")
    private Integer sportMarketId;
    @JsonProperty("MColumnCount")
    private Integer mColumnCount;
    @JsonProperty("Template")
    private Integer template;
    @JsonProperty("ShortName")
    private String shortName;
    @JsonProperty("SpecialOddsName")
    private String specialOddsName;
    @JsonProperty("SpecialOddsValue")
    private String specialOddsValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
