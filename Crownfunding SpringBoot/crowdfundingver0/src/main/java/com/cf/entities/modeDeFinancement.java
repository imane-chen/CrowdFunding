package com.cf.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue( "null" )
@DiscriminatorColumn(name="TYPE_FINANCEMENT",discriminatorType=DiscriminatorType.STRING, length = 3)
public class modeDeFinancement implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_modeFinancement;
	
	/*private String typeFinancement;
	

	public String getTypeFinancement() {
		return typeFinancement;
	}

	public void setTypeFinancement(String typeFinancement) {
		this.typeFinancement = typeFinancement;
	}*/

	public Long getId_modeFinancement() {
		return id_modeFinancement;
	}

	public void setId_modeFinancement(Long id_modeFinancement) {
		this.id_modeFinancement = id_modeFinancement;
	}

	public modeDeFinancement() {
		super();
	}
	
	
}
