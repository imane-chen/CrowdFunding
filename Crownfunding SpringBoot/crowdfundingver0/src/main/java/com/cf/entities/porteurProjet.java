package com.cf.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class porteurProjet implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numPorteur;
	private String nomPorteur;
	private String prenomPorteur;
	private Date dateNaissance;
	private String nationality;
	private String tel;
	private String pays;
	private String email;
//	private String username;
//	private String password;
//	@ManyToMany(fetch = FetchType.EAGER)
//	private Collection<AppRole> roles = new ArrayList<>();
	
//	@OneToMany(fetch = FetchType.LAZY)
//	private Collection<Projet> projet;
	
	
//	public porteurProjet(String nomPorteur, String prenomPorteur, Date dateNaissance, String nationality, String tel,
//			String pays, String email, String username, String password, Collection<AppRole> roles) {
//		super();
//		this.nomPorteur = nomPorteur;
//		this.prenomPorteur = prenomPorteur;
//		this.dateNaissance = dateNaissance;
//		this.nationality = nationality;
//		this.tel = tel;
//		this.pays = pays;
//		this.email = email;
//		this.username = username;
//		this.password = password;
//		this.roles = roles;
//	}
	public Long getNumPorteur() {
		return numPorteur;
	}
	public void setNumPorteur(Long numPorteur) {
		this.numPorteur = numPorteur;
	}
	public String getNomPorteur() {
		return nomPorteur;
	}
	public void setNomPorteur(String nomPorteur) {
		this.nomPorteur = nomPorteur;
	}
	public String getPrenomPorteur() {
		return prenomPorteur;
	}
	public void setPrenomPorteur(String prenomPorteur) {
		this.prenomPorteur = prenomPorteur;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
//	public porteurProjet(String nomPorteur, String prenomPorteur, Date dateNaissance, String nationality, String tel,
//			String pays, String password ) {
//		super();
//		this.nomPorteur = nomPorteur;
//		this.prenomPorteur = prenomPorteur;
//		this.dateNaissance = dateNaissance;
//		this.nationality = nationality;
//		this.tel = tel;
//		this.pays = pays;
//		this.password = password;
//	}
	
	
	public porteurProjet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public porteurProjet(String nomPorteur, String prenomPorteur, Date dateNaissance, String nationality, String tel,
			String pays, String email) {
		super();
		this.nomPorteur = nomPorteur;
		this.prenomPorteur = prenomPorteur;
		this.dateNaissance = dateNaissance;
		this.nationality = nationality;
		this.tel = tel;
		this.pays = pays;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
