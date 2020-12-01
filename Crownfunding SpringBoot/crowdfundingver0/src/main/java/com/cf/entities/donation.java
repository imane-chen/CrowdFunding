package com.cf.entities;

import com.fasterxml.jackson.annotation.JsonSetter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class donation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonn ;
    @ManyToOne
    @JoinColumn(name = "contributeur_id")
    private Contributeur contributeur ;
    private Long montant ;
    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet projet ;


    private Date dateDonn;

    donation(){

    }

    public donation(Contributeur contributeur, Long montant, Projet projet) {
        this.contributeur = contributeur;
        this.montant = montant;
        this.projet = projet;
    }

    public int getIdDonn() {
        return idDonn;
    }

    public void setIdDonn(int idDonn) {
        this.idDonn = idDonn;
    }

    public Contributeur getDonneur() {
        return contributeur;
    }

    public void setDonneur(Contributeur contributeur) {
        this.contributeur = contributeur;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public Projet getProjet() {
        return projet;
    }
    @JsonSetter
    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    @Override
    public String toString() {
        return "Donnation{" +
                "idDonn=" + idDonn +
                ", contributeur=" + contributeur +
                ", montant=" + montant +
                ", projet=" + projet +
                '}';
    }


    public Date getDateDonn() {
        return dateDonn;
    }

    public void setDateDonn(Date dateDonn) {
        this.dateDonn = dateDonn;
    }
}




