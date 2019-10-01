package com.genesys.knowledgebase.repositories;

import org.springframework.data.repository.CrudRepository;

import com.genesys.knowledgebase.model.Document;

public interface DocumentRepository extends CrudRepository<Document, Long>{

}
