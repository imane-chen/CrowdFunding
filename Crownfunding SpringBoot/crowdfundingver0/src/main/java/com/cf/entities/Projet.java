package com.cf.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Projet implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numProjet;
	private String nameProjet;
	private String description;
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date date;
	private String categorie;
	private String objectif;
	private String dureeTime;
	private String etat;
	private Long MontantDesire;
	private Long solde;
	private String commantaire;
	private String FAQ;
	private String image;
	private String langue;
	private String pays;
	@ManyToOne
	@JoinColumn(name="type_porteur_projet")
	private porteurProjet porteurprojet;
	@ManyToOne
	@JoinColumn(name = "Contributeurs")
	
	private Contributeur contributeur;
	
	// l'instruction la plus logique
	/*
	  @OneToMany
	@JoinColumn(name = "Contributeurs")
	//private Collection<Contributeur> contributeur;
	 */
	@OneToOne
	@JoinColumn(name = "type_financement")
	private modeDeFinancement modeFinancement;
	
	public Long getNumProjet() {
		return numProjet;
	}
	public void setNumProjet(Long numProjet) {
		this.numProjet = numProjet;
	}
	public String getNameProjet() {
		return nameProjet;
	}
	public void setNameProjet(String nameProjet) {
		this.nameProjet = nameProjet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getObjectif() {
		return objectif;
	}
	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}
	
	public String getDureeTime() {
		return dureeTime;
	}
	public void setDureeTime(String dureeTime) {
		this.dureeTime = dureeTime;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Long getMontantDesire() {
		return MontantDesire;
	}
	public void setMontantDesire(Long montantDesire) {
		MontantDesire = montantDesire;
	}
	public Long getSolde() {
		return solde;
	}
	public void setSolde(Long solde) {
		this.solde = solde;
	}
	public String getCommantaire() {
		return commantaire;
	}
	public void setCommantaire(String commantaire) {
		this.commantaire = commantaire;
	}
	public String getFAQ() {
		return FAQ;
	}
	public void setFAQ(String fAQ) {
		FAQ = fAQ;
	}
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
	public porteurProjet getPorteurprojet() {
		return porteurprojet;
	}
	public void setPorteurprojet(porteurProjet porteurprojet) {
		this.porteurprojet = porteurprojet;
	}
	public Contributeur getControbuter() {
		return contributeur;
	}
	public void setControbuter(Contributeur controbuter) {
		this.contributeur = controbuter;
	}
	public modeDeFinancement getModeDeFinancement() {
		return modeFinancement;
	}
	public void setModeDeFinancement(modeDeFinancement modeDeFinancement) {
		this.modeFinancement = modeFinancement;
	}
//	public Projet(String nameProjet, String description, Date date, String categorie, String objectif, Time dureeTime,
//			String etat, Long montantDesire, Long solde, String commantaire, String fAQ, String image, String langue,
//			String pays) {
//		super();
//		this.nameProjet = nameProjet;
//		this.description = description;
//		this.date = date;
//		this.categorie = categorie;
//		this.objectif = objectif;
//		this.dureeTime = dureeTime;
//		this.etat = etat;
//		MontantDesire = montantDesire;
//		this.solde = solde;
//		this.commantaire = commantaire;
//		FAQ = fAQ;
//		this.image = image;
//		this.langue = langue;
//		this.pays = pays;
//	}
	
	
	public Projet() {
		super();
	}
	public Projet(String nameProjet, String description, Date date, String categorie, String objectif, String dureeTime,
			String etat, Long montantDesire, Long solde, String commantaire, String fAQ, String image, String langue,
			String pays, porteurProjet porteurprojet, Contributeur controbuter,
			com.cf.entities.modeDeFinancement modeDeFinancement) {
		super();
		this.nameProjet = nameProjet;
		this.description = description;
		this.date = date;
		this.categorie = categorie;
		this.objectif = objectif;
		this.dureeTime = dureeTime;
		this.etat = etat;
		MontantDesire = montantDesire;
		this.solde = solde;
		this.commantaire = commantaire;
		FAQ = fAQ;
		this.image = image;
		this.langue = langue;
		this.pays = pays;
		this.porteurprojet = porteurprojet;
		this.contributeur = controbuter;
		this.modeFinancement = modeFinancement;
	}
	
	
	
}
