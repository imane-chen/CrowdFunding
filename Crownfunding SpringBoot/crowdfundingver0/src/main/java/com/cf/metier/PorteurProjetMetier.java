package com.cf.metier;

import java.util.List;

import com.cf.entities.porteurProjet;

public interface PorteurProjetMetier {

	public porteurProjet saveporteurProjet(porteurProjet pp);
	public List<porteurProjet> listporteurProjet();
}
