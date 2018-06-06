package com.abhi.atm.dao.entity;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ConfigParam {

	@Id
	private int paramId;
	
	private String paramName;
	
	private List<ConfigParamValue> paramValues;

	public int getParamId() {
		return paramId;
	}

	public void setParamId(int paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public List<ConfigParamValue> getParamValues() {
		return paramValues;
	}

	public void setParamValues(List<ConfigParamValue> paramValues) {
		this.paramValues = paramValues;
	}

}
