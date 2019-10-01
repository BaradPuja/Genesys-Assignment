package com.genesys.knowledgebase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.genesys.knowledgebase.model.KnowledgeDetails;
import com.genesys.knowledgebase.services.KnowledgeBaseService;

@RestController
@RequestMapping("/")
public class KnowledgeBaseController {
	
	@Autowired
	private KnowledgeBaseService service;
	
	@GetMapping("/home")
	public String homePage(){
		return "Welcome to Knwledgebase centre";
	}
	
	@GetMapping("/knowledgebase")
	public List<KnowledgeDetails> findAllKnowledgeBase(){
		return service.getAllKnowledgeBaseDetails();
	}
	
	@GetMapping(path = "/knowledgebase/{knowledgeId}", produces = "application/json")
	public KnowledgeDetails findKnowledgeBaseById(@PathVariable long knowledgeId){
		return service.getKnowledgeDetailsById(knowledgeId);
	}
	
	@PostMapping(path = "/knowledgebase", produces = "application/json", consumes = "application/json")
	public long saveKnowledgeDetails(@RequestBody KnowledgeDetails knowledge){
		return service.saveKnowledgeDetails(knowledge);
	}

}
