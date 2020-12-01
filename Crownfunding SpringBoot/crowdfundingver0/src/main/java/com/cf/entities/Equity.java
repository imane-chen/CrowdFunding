package com.cf.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EQT")
public class Equity extends modeDeFinancement {

	private static final long serialVersionUID = 1L;

	public Equity() {
		super();
	}
}
