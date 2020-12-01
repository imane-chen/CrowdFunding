package com.cf.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("REC")
public class Recompense extends modeDeFinancement{


	private static final long serialVersionUID = 1L;

	public Recompense() {
		super();
		
	}
    
	
}
