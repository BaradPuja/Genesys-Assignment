package com.genesys.knowledgebase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article extends Document {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private static final String docType = "Article";
	private String title;
	private String content;
	
	public Article() {
		super();
	}
	

	public static String getDoctype() {
		return docType;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
