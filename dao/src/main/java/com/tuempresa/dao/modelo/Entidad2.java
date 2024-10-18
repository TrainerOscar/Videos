package com.tuempresa.dao.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter



public class Entidad2 {
	
	
	@Id
	@Hidden
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	String older;
	
	
	@Column(length=50)
	String drescription;
	
	
	
	
	
	

}
