package com.cf.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PRE")
public class Pret extends modeDeFinancement {


	private static final long serialVersionUID = 1L;

	public Pret() {
		super();
	}

	
}
