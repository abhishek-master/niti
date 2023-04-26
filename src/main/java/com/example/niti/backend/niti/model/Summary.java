package com.example.niti.backend.niti.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary {
	
	private String status ; // ACTIVE or Not
	private String type ;  //Savings or Current 
	private String currentBalance ;  
	private String currenvy ; //INR or Dollar
	
	
	
	public Summary(String status, String type, String currentBalance, String currenvy) {
	
		this.status = status;
		this.type = type;
		this.currentBalance = currentBalance;
		this.currenvy = currenvy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getCurrenvy() {
		return currenvy;
	}
	public void setCurrenvy(String currenvy) {
		this.currenvy = currenvy;
	}
	
	

}
