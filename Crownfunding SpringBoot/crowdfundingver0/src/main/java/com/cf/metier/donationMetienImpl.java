package com.cf.metier;

import com.cf.dao.donationRepository;
import com.cf.entities.donation;
import com.cf.entities.Projet;
import com.cf.entities.Contributeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class donationMetienImpl implements donationMetier {

    @Autowired
    private donationRepository donnationRepository ;
    /*@Override
    public donation saveDonnation(donation don) {
        return donnationRepository.save(don);
    }*/

    @Override
    public List<donation> listDonnation() {
        return donnationRepository.findAll();
    }
/*
    @Override
    public List<donation> DonnationByContributeur(Contributeur contributeur) {
        List<donation> donn = donnationRepository.findAll();
        System.err.println(donn);
        for (int i = 0 ; i< donn.size() ; i++){
           if(donn.get(i).getDonneur().getcodeContributeur() != contributeur.getcodeContributeur()) {
               donn.remove(i);
               System.err.println("yes remove!!");
           }

        }
        System.err.println(donn);
        return donn;
    }

    @Override
    public Long donationByProjet(Projet pr) {
        List<donation> donnationList = listDonnation();
        Long som = 0L ;

        for (donation var : donnationList)
        {
            if (var.getProjet().getTitre().equals(pr.getTitre()))
                som += var.getMontant();
        }
        System.err.println("DonnationByProjet projet--->"+pr.getTitre()+"------"+som);

        return som;
    }

    @Override
    public Long donationNbrProjet(Projet pr) {
        List<donation> donnationList = listDonnation();
        Long som = 0L ;

        for (donation var : donnationList)
        {
            if (var.getProjet().getTitre().equals(pr.getTitre()))
                som ++;
        }
        System.err.println("DonnationByProjet projet--->"+pr.getTitre()+"------"+som);

        return som;
    }

	@Override
	public com.cf.entities.donation saveDonnation(com.cf.entities.donation don) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.cf.entities.donation> DonnationByUser(Contributeur contributeurs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long donation1(Projet pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long donation(Projet pr) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public com.cf.entities.donation saveDonnation(com.cf.entities.donation don) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.cf.entities.donation> DonnationByUser(Contributeur contributeurs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long donation1(Projet pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long donation(Projet pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.cf.entities.donation> DonnationByContributeur(Contributeur contributeur) {
		// TODO Auto-generated method stub
		return null;
	}
}
