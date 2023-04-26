package com.example.niti.backend.niti.service;



import com.example.niti.backend.niti.model.AccountDetailsModel;
import com.example.niti.backend.niti.model.DataSessionModel;
import com.example.niti.backend.niti.model.PostModelRecieved;
import com.example.niti.backend.niti.model.PostModelSent;

public interface AllService {
	
	public PostModelRecieved createConsent(PostModelSent postModelSent) ;
	
	public PostModelRecieved getConsent(String id);
	
	public DataSessionModel createDataSession(DataSessionModel dataSessionModel) ;
	
	public AccountDetailsModel getData(String id) ;
	
}
