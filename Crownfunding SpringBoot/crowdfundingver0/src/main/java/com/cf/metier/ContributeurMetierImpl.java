package com.cf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cf.dao.ContributerRepository;
import com.cf.entities.Contributeur;
@Service
public class ContributeurMetierImpl implements ContributeurMetier {

	@Autowired
	private ContributerRepository contributeurRepository;
	@Override
	public Contributeur saveContributeur(Contributeur ctr) {
		
		return contributeurRepository.save(ctr);
	}

	@Override
	public List<Contributeur> listContributeurs() {
		
		return contributeurRepository.findAll();
	}
	

}
