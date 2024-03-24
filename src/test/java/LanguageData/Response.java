package LanguageData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response{

	@JsonProperty("Result")
	private Result result;

	public Result getResult(){
		return result;
	}
}