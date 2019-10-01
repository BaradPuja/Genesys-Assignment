package com.genesys.knowledgebase.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "knowledge_base")
public class KnowledgeDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "KNOWLEDGE_ID")
	private long knowledgeId;
	
	@Column(name = "KNOWLEDGE_DESC")
	private String knowledgeDescription;
	
	@OneToMany(orphanRemoval=true, cascade = { CascadeType.ALL })
	@JoinColumn(name = "KNOWLEDGE_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<Category> categories = new ArrayList<>();
	
	@OneToMany(orphanRemoval = true, cascade = {CascadeType.ALL})
	@JoinColumn(name = "KNOWLEDGE_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<Language> supportedLanguages = new ArrayList<>();
	
	@OneToMany(orphanRemoval=true, cascade = {CascadeType.ALL})
	@JoinColumn(name = "KNOWLEDGE_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<UserDetails> users = new ArrayList<>();
	
	
	public KnowledgeDetails() {
		super();
	}
	public long getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getKnowledgeDescription() {
		return knowledgeDescription;
	}
	public void setKnowledgeDescription(String knowledgeDescription) {
		this.knowledgeDescription = knowledgeDescription;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<Language> getSupportedLanguages() {
		return supportedLanguages;
	}
	public void setSupportedLanguages(List<Language> supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}
	public List<UserDetails> getUsers() {
		return users;
	}
	public void setUsers(List<UserDetails> users) {
		this.users = users;
	}
}
