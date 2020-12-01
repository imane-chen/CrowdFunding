package com.cf.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
 @DiscriminatorValue( "not null" )
// @DiscriminatorValue("DON")
public class Don extends modeDeFinancement {

	private static final long serialVersionUID = 1L;

	
	public Don() {
		super();
	}

	
}
