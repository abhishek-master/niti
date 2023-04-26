package com.example.niti.backend.niti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.niti.backend.niti.model.AccountDetailsModel;
import com.example.niti.backend.niti.model.DataSessionModel;
import com.example.niti.backend.niti.model.PostModelRecieved;
import com.example.niti.backend.niti.model.PostModelSent;
import com.example.niti.backend.niti.service.AllService;

@RestController
@RequestMapping("/api/v1")
public class MainController {

	@Autowired
	private AllService allService ;	
	
	//public String idForGetConsent ; 
	
	@PostMapping("/createConsent")
	public PostModelRecieved createConsent(@RequestBody PostModelSent postModelSent) {
		PostModelRecieved pmr = allService.createConsent(postModelSent) ;
		//idForGetConsent  = pmr.getId() ;
		return pmr ;
	}
	
	
	
	@GetMapping("/getConsents") 	
	public PostModelRecieved getConsent () { //@PathVariable String Id--> which is 'idForGetConsent' 
		
		PostModelRecieved pmr = allService.getConsent("4a199b6f-78f1-4ef7-9696-d358d1802447"); 
		System.out.println(pmr.getId());
		System.out.println(pmr.getStatus()); 
		System.out.println(pmr.getUrl()) ; 
		
		return pmr ; 
	}
	
	//private String DataSession_Id ;
	
	  @PostMapping("/createDataSession") 
	  public DataSessionModel createDataSession (@RequestBody DataSessionModel dataSessionModel ) {
	   DataSessionModel dsm = allService.createDataSession(dataSessionModel) ;
	  // DataSession_Id = dsm.getId() ; 
	   return dsm ;
	  
	  }
	
	@GetMapping("/getData")
	public AccountDetailsModel getBankDetails() {
		//Id = DataSession_Id as the PathVariable ;
		
		AccountDetailsModel adm = allService.getData("e3c313f7-18c1-4652-9d91-6971a48f3fe7" ) ;
		return adm ;
	}
}
