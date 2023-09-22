package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Student {
	
	
	@Id
	private Integer sid;
	private String sname;
	private String semail;
	private String scity;
	private Gender sgender;
	

}
