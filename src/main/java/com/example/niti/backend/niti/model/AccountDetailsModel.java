package com.example.niti.backend.niti.model;

public class AccountDetailsModel {

	private String status ;
	private String id ; 
	private String consentId; 
	private PayLoad Payload ;
	
	
	
	public AccountDetailsModel(String status, String id, String consentId, PayLoad payload) {
	
		this.status = status;
		this.id = id;
		this.consentId = consentId;
		this.Payload = payload;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConsentId() {
		return consentId;
	}
	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}
	public PayLoad getPayload() {
		return Payload;
	}
	public void setPayload(PayLoad payload) {
		this.Payload = payload;
	}
	
	
	
	
}
