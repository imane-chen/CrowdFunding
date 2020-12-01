package com.cf.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cf.dao.modeDeFinancementRepository;
import com.cf.entities.modeDeFinancement;

@Service
public class modeDeFinancementMetierImpl implements modeDeFinancementMetier{

	@Autowired
	private modeDeFinancementRepository modefinancementRepository;
	@Override
	public modeDeFinancement savemodeDeFinancement(modeDeFinancement mdf) {
		
		return modefinancementRepository.save(mdf);
	}

	@Override
	public List<modeDeFinancement> listmodeDeFinancement() {
		
		return modefinancementRepository.findAll();
	}
}
