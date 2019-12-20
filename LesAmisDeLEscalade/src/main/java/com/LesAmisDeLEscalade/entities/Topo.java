package com.LesAmisDeLEscalade.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topo implements Serializable{
@Id @GeneratedValue
private Long id;
private String nom;
private String descriptif;
private Date dateDeParution;
private Boolean disponible;
public Topo() {
	super();
	// TODO Auto-generated constructor stub
}
public Topo(String nom, String descriptif, Date dateDeParution, Boolean disponible) {
	super();
	this.nom = nom;
	this.descriptif = descriptif;
	this.dateDeParution = dateDeParution;
	this.disponible = disponible;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDescriptif() {
	return descriptif;
}
public void setDescriptif(String descriptif) {
	this.descriptif = descriptif;
}
public Date getDateDeParution() {
	return dateDeParution;
}
public void setDateDeParution(Date dateDeParution) {
	this.dateDeParution = dateDeParution;
}
public Boolean getDisponible() {
	return disponible;
}
public void setDisponible(Boolean disponible) {
	this.disponible = disponible;
}


}


