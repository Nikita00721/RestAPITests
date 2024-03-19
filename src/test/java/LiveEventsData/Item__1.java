
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
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Name",
    "Node",
    "Items",
    "Events",
    "Headers",
    "Order",
    "ISO"
})
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Item__1 {

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Node")
    public String node;
    @JsonProperty("Items")
    public List<Object> items;
    @JsonProperty("Events")
    public List<Event> events;
    @JsonProperty("Headers")
    public List<Object> headers;
    @JsonProperty("Order")
    public Integer order;
    @JsonProperty("ISO")
    public String iso;
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
