package com.yash.ophs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class PatientDocVisit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pdvId;
	private String visitDate;
	
	@Column(name = "nxt_vis_date")
	private String nextVisitDate;
	
}
