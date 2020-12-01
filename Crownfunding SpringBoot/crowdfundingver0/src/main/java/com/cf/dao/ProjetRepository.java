package com.cf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cf.entities.Projet;
import com.cf.entities.porteurProjet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

	//List<Projet> findByPorteur(porteurProjet numPorteur);

}
