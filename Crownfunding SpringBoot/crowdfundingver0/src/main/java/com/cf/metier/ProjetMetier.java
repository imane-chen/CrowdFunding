package com.cf.metier;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.cf.entities.Projet;
import com.cf.entities.porteurProjet;

public interface ProjetMetier {

	public Projet saveProjet(Projet pr);
	public Projet updateProjet(Projet pr);
	//public List<Projet> findByProteur(@Param("mc") String mc);
	//public List<Projet> findByProteur(Projet pp);
	public List<Projet> listProjet();
	//List<Projet> findByProteur(porteurProjet pp);
}
