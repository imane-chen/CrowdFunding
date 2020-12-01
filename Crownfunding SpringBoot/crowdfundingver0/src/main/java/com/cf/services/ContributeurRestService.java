package com.cf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cf.entities.Contributeur;
import com.cf.metier.ContributeurMetier;
@CrossOrigin("*")
@RestController
public class ContributeurRestService {

	@Autowired
	private ContributeurMetier contributeurMetier;
	
	@RequestMapping(value = "/contributeurs", method=RequestMethod.POST)
	public Contributeur saveContributeur(@RequestBody Contributeur ctr) {
		return contributeurMetier.saveContributeur(ctr);
	}
	
	@RequestMapping(value = "/contributeurs", method=RequestMethod.GET)
	public List<Contributeur> listContributeur() {
		return contributeurMetier.listContributeurs();
	}
	
}
