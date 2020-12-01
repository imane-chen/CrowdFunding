package com.cf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cf.dao.ProjetRepository;
import com.cf.entities.Projet;
import com.cf.entities.porteurProjet;
@Service
public class ProjetMetierImpl implements ProjetMetier{

	@Autowired
	private ProjetRepository projetrepository;
	@Override
	public Projet saveProjet(Projet pr) {
		
		return projetrepository.save(pr);
	}

	@Override
	public List<Projet> listProjet() {
	
		return projetrepository.findAll();
	}

	@Override
	public Projet updateProjet(Projet pr) {
		
		return projetrepository.saveAndFlush(pr);
	}

	/*
	 * public List<Projet> findParProteur(porteurProjet numPorteur) {
	 * 
	 * return projetrepository.findByPorteur(numPorteur); }
	 */

	/*
	 * @Override public List<Projet> findByProteur(porteurProjet pp) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public List<Projet> findByProteur(Projet pp) { // TODO
	 * Auto-generated method stub return null; }
	 */

	

}
