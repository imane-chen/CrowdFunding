package com.cf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cf.entities.porteurProjet;
import com.cf.metier.PorteurProjetMetier;
@CrossOrigin("*")
@RestController
public class porteurProjetRestService {

	@Autowired
	private PorteurProjetMetier porteurprojetmetier;
	
	@RequestMapping(value = "/porteurprojets", method=RequestMethod.POST)
	public porteurProjet saveporteurProjet(@RequestBody porteurProjet p) {
		return porteurprojetmetier.saveporteurProjet(p);
	}
	
	@RequestMapping(value = "/porteurprojets", method=RequestMethod.GET)
	public List<porteurProjet> listporteurProjet() {
		return porteurprojetmetier.listporteurProjet();
	}
}
