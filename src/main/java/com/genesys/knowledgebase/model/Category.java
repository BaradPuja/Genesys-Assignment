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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String categoryName;
	
	@OneToMany(orphanRemoval = true, cascade = {CascadeType.ALL})
	@JoinColumn(name = "CATEGORY_ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<Document> documents = new ArrayList<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
