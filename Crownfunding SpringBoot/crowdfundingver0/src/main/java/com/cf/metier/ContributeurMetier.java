package com.cf.metier;

import java.util.List;

import com.cf.entities.Contributeur;

public interface ContributeurMetier {

	public Contributeur saveContributeur(Contributeur ctr);
	public List<Contributeur> listContributeurs();
}
