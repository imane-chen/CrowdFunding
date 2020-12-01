package com.cf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cf.entities.modeDeFinancement;
import com.cf.metier.modeDeFinancementMetier;
@CrossOrigin("*")
@RestController
public class modeDeFinancementRestService {

	@Autowired
	private modeDeFinancementMetier modefinancementMetier;
	
	@RequestMapping(value = "/mdf", method=RequestMethod.POST)
	public modeDeFinancement saveContributeur(@RequestBody modeDeFinancement mdf) {
		return modefinancementMetier.savemodeDeFinancement(mdf);
	}
	
	@RequestMapping(value = "/mdf", method=RequestMethod.GET)
	public List<modeDeFinancement> listContributeur() {
		return modefinancementMetier.listmodeDeFinancement();
	}
}
