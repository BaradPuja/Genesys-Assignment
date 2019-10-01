package com.genesys.knowledgebase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "util_languages")
public class Language {
	
	@Id
	@GeneratedValue
	@Column(name = "ID", unique= true)
	private long languageId;
	@Column(name = "LANGUAGE_NAME")
	private String languageName;
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
}
