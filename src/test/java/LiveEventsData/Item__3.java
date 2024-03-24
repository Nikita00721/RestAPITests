
package LiveEventsData;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
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
public class Item__3 {

    @JsonProperty("MobileColumnNum")
    public Integer mobileColumnNum;
    @JsonProperty("ColumnNum")
    public Integer columnNum;
    @JsonProperty("MB")
    public Integer mb;
    @JsonProperty("Id")
    public Integer id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Result")
    public Integer result;
    @JsonProperty("Price")
    public Double price;
    @JsonProperty("SelectionTypeId")
    public Integer selectionTypeId;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("SPOV")
    public String spov;
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
