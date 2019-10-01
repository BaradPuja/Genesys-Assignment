package com.genesys.knowledgebase.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.genesys.knowledgebase.model.KnowledgeDetails;

@Repository
public interface KnowledgeBaseRepository extends CrudRepository<KnowledgeDetails, Long> {

	KnowledgeDetails findByKnowledgeId(long knowledgeId);
}
