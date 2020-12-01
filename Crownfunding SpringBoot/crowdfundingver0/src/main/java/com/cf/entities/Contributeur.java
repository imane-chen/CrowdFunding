package com.cf.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Contributeur implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeContributeur;
	private String nomContibuteur;
	private String prenomContributeur;
	private String pays;
	private Long montant;
	private String tel;
	private String email;
	//@ManyToOne
	//private Projet projet;
	@OneToOne
	@JoinColumn(name = "type_financement")
	private modeDeFinancement modeFinancement;
	
	public Long getCodeContributeur() {
		return codeContributeur;
	}
	public void setCodeContributeur(Long codeContributeur) {
		this.codeContributeur = codeContributeur;
	}
	public String getNomContibuteur() {
		return nomContibuteur;
	}
	public void setNomContibuteur(String nomContibuteur) {
		this.nomContibuteur = nomContibuteur;
	}
	public String getPrenomContributeur() {
		return prenomContributeur;
	}
	public void setPrenomContributeur(String prenomContributeur) {
		this.prenomContributeur = prenomContributeur;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Long getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Contributeur(String nomContibuteur, String prenomContributeur, String pays, Long montant, String tel, String password, String username) {
		super();
		this.nomContibuteur = nomContibuteur;
		this.prenomContributeur = prenomContributeur;
		this.pays = pays;
		this.montant = montant;
		this.tel = tel;

	}
	public Contributeur() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
