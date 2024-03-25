
package LiveEventsData;

import java.util.LinkedHashMap;
import java.util.List;
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
public class Item__2 {

    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("MarketTypeId")
    public String marketTypeId;
    @JsonProperty("OrgMarketTypeId")
    public Integer orgMarketTypeId;
    @JsonProperty("Items")
    public List<Item__3> items;
    @JsonProperty("ColumnCount")
    public Integer columnCount;
    @JsonProperty("Status")
    public Integer status;
    @JsonProperty("SportMarketId")
    public Integer sportMarketId;
    @JsonProperty("MColumnCount")
    public Integer mColumnCount;
    @JsonProperty("Template")
    public Integer template;
    @JsonProperty("ShortName")
    public String shortName;
    @JsonProperty("SpecialOddsName")
    public String specialOddsName;
    @JsonProperty("SpecialOddsValue")
    public String specialOddsValue;
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
