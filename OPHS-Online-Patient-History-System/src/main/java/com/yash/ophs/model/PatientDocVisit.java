package com.yash.ophs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
public class PatientDocVisit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pdvId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patientId",referencedColumnName = "patientId")
	private PatientRegistration patientRegistration;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "dr_id",referencedColumnName = "dr_id")
	private Doctor doctor;
	
	@Column(name = "visitDate")
	private String visitDate;
	
	@Column(name = "nxt_vis_date")
	private String nextVisitDate;
	
	PatientDocVisit()
	{
		
	}

	public int getPdvId() {
		return pdvId;
	}

	public void setPdvId(int pdvId) {
		this.pdvId = pdvId;
	}

	public PatientRegistration getPatientRegistration() {
		return patientRegistration;
	}

	public void setPatientRegistration(PatientRegistration patientRegistration) {
		this.patientRegistration = patientRegistration;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public String getNextVisitDate() {
		return nextVisitDate;
	}

	public void setNextVisitDate(String nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
	}
	
	
	
	
}
