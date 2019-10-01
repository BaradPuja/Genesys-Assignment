package com.genesys.knowledgebase.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genesys.knowledgebase.model.KnowledgeDetails;
import com.genesys.knowledgebase.repositories.KnowledgeBaseRepository;

@Service
public class KnowledgeBaseService {

	@Autowired
	private KnowledgeBaseRepository knowledgeBaseRepository;
	
	public KnowledgeDetails createKnowledgeBase(KnowledgeDetails details){
		return knowledgeBaseRepository.save(details);
	}
	
	public List<KnowledgeDetails> getAllKnowledgeBaseDetails(){
		List<KnowledgeDetails> result = new ArrayList<KnowledgeDetails>();
		for(KnowledgeDetails k: knowledgeBaseRepository.findAll()){
			result.add(k);
		}
		return result;
	}
	
	public KnowledgeDetails getKnowledgeDetailsById(long knowledgeId){
		return knowledgeBaseRepository.findByKnowledgeId(knowledgeId);
	}
	
	public long saveKnowledgeDetails(KnowledgeDetails knowledge){
		long id = 0;
		KnowledgeDetails result =  knowledgeBaseRepository.save(knowledge);
		if(result != null)
			id = result.getKnowledgeId();
		return id;
	}
	
}
