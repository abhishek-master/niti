package com.example.niti.backend.niti.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transactions {
	
	private String startDate ;
	private String endDate ; 
	
	private Transaction[] transaction ;

	
	
	public Transactions(String startDate, String endDate, Transaction[] transaction) {
	
		this.startDate = startDate;
		this.endDate = endDate;
		this.transaction = transaction;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Transaction[] getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction[] transaction) {
		this.transaction = transaction;
	} 
	
	
	
}
