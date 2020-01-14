package com.LesAmisDeLEscalade.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Role implements Serializable{
@Id @GeneratedValue
	private Long id;
	private boolean adherent;
	private boolean admin;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(boolean adherent, boolean admin) {
		super();
		this.adherent = adherent;
		this.admin = admin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isAdherent() {
		return adherent;
	}
	public void setAdherent(boolean adherent) {
		this.adherent = adherent;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
		

}
