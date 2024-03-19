package HighlightsData;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Name"
})
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Item__3 {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
