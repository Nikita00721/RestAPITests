package BrandsData;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BrandId",
    "Name",
    "LicenseId",
    "DefaultMultipleBonusConfigId"
})
@Data
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("BrandId")
    private Integer brandId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("LicenseId")
    private Integer licenseId;
    @JsonProperty("DefaultMultipleBonusConfigId")
    private Object defaultMultipleBonusConfigId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
