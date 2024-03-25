package HighlightsData;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

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
    "MobileColumnNum",
    "ColumnNum",
    "MB",
    "Id",
    "Name",
    "Result",
    "Price",
    "SelectionTypeId",
    "IsActive",
    "SPOV"
})
@Data
@Generated("jsonschema2pojo")
public class Item__2 {

    @JsonProperty("MobileColumnNum")
    private Integer mobileColumnNum;
    @JsonProperty("ColumnNum")
    private Integer columnNum;
    @JsonProperty("MB")
    private Integer mb;
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Result")
    private Integer result;
    @JsonProperty("Price")
    private Integer price;
    @JsonProperty("SelectionTypeId")
    private Integer selectionTypeId;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("SPOV")
    private String spov;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
