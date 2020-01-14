package com.LesAmisDeLEscalade.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Topo implements  Serializable {
@Id @GeneratedValue
	private Long id;
	private String description;
	private boolean disponible;
	public Topo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Topo(String description, boolean disponible) {
		super();
		this.description = description;
		this.disponible = disponible;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
