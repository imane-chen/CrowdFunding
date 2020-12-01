package com.cf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cf.dao.PorteurProjetRepository;
import com.cf.entities.porteurProjet;

@Service
public class PorteurProjetMetierImpl implements PorteurProjetMetier {

	
	@Autowired
	private PorteurProjetRepository porteurprojetrepository;
	@Override
	public porteurProjet saveporteurProjet(porteurProjet pp) {

		return porteurprojetrepository.save(pp);
	}

	@Override
	public List<porteurProjet> listporteurProjet() {

		return porteurprojetrepository.findAll();
	}
	
	

}
