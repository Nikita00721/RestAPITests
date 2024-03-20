
package CouponsData;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Today",
    "Tomorrow",
    "Upcoming",
    "MyLeagues",
    "WithMaxOdd",
    "TopLeagues"
})
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("Today")
    private Integer today;
    @JsonProperty("Tomorrow")
    private Integer tomorrow;
    @JsonProperty("Upcoming")
    private Integer upcoming;
    @JsonProperty("MyLeagues")
    private Integer myLeagues;
    @JsonProperty("WithMaxOdd")
    private Integer withMaxOdd;
    @JsonProperty("TopLeagues")
    private Integer topLeagues;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
