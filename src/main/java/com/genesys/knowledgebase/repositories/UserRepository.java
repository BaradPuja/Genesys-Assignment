package com.genesys.knowledgebase.repositories;

import org.springframework.data.repository.CrudRepository;

import com.genesys.knowledgebase.model.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails, Long> {

}
