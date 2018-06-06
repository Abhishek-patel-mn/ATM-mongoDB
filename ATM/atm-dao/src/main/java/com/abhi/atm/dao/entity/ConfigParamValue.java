package com.abhi.atm.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ConfigParamValue {

	@Id
	private int paramValueId;
	
	private String paramValue;

	public int getParamValueId() {
		return paramValueId;
	}

	public void setParamValueId(int paramValueId) {
		this.paramValueId = paramValueId;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

}
