package com.genesys.knowledgebase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FAQ extends Document {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	private static final String docType = "FAQ";
	private String question;
	private String answer;
	public FAQ() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public static String getDoctype() {
		return docType;
	}


	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
