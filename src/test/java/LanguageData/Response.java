package LanguageData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("Result")
	private Result result;

	public Result getResult(){
		return result;
	}
}