package com.cf.metier;

import java.util.List;

import com.cf.entities.modeDeFinancement;

public interface modeDeFinancementMetier {

	public modeDeFinancement savemodeDeFinancement(modeDeFinancement mdf);
	public List<modeDeFinancement> listmodeDeFinancement();
}
