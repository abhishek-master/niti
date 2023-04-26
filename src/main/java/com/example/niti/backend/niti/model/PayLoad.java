package com.example.niti.backend.niti.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayLoad {

	DataModel data ;

	public DataModel getDataModel() {
		return data;
	}

	public void setDataModel(DataModel dataModel) {
		this.data = dataModel;
	}

	public PayLoad(DataModel dataModel) {
		this.data = dataModel;
	}
	
	
}
