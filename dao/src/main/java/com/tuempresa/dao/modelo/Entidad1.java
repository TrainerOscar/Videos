package com.tuempresa.dao.modelo;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;

import groovy.lang.*;
import lombok.*;

@Entity 
@Getter @Setter 

public class Entidad1 {
	
	
	@Id
	@Column(length=6)
	int num;
	
	
	@Column(length=50)
	@Required
	String name;
	
	
	@ManyToOne
	(fetch=FetchType.LAZY,
	optional=true)
	@DescriptionsList
	Category category;
	
	
	
	
	
	
	
	
	
	
	
	

}
