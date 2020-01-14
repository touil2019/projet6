package com.LesAmisDeLEscalade.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ReservationTopo implements Serializable {
@Id @GeneratedValue
	private Long id;
	private Date dateemprunt;
	private boolean encours;
	private boolean acceptations;
	public ReservationTopo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationTopo(Date dateemprunt, boolean encours, boolean acceptations) {
		super();
		this.dateemprunt = dateemprunt;
		this.encours = encours;
		this.acceptations = acceptations;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateemprunt() {
		return dateemprunt;
	}
	public void setDateemprunt(Date dateemprunt) {
		this.dateemprunt = dateemprunt;
	}
	public boolean isEncours() {
		return encours;
	}
	public void setEncours(boolean encours) {
		this.encours = encours;
	}
	public boolean isAcceptations() {
		return acceptations;
	}
	public void setAcceptations(boolean acceptations) {
		this.acceptations = acceptations;
	}
	
	

}
