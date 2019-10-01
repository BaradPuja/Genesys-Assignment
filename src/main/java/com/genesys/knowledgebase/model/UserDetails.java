package com.genesys.knowledgebase.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
	
	@Id
	private long id;
	
	private String userName;
	
	@OneToOne(cascade = CascadeType.ALL, fetch= FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name = "USER_ROLE")
	private UserRoles role;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserRoles getRole() {
		return role;
	}

	public void setRole(UserRoles role) {
		this.role = role;
	}
}
