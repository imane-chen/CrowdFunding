package com.cf.metier;
import com.cf.entities.donation;
import com.cf.entities.Projet;
import com.cf.entities.Contributeur;
import com.cf.entities.*;
import java.util.List;

public interface donationMetier {

	public donation saveDonnation(donation don);
    public List<donation> listDonnation();
    public List<donation> DonnationByUser(Contributeur contributeurs);
    public Long donation1(Projet pr);
    public Long donation(Projet pr);
	List<com.cf.entities.donation> DonnationByContributeur(Contributeur contributeur);

}