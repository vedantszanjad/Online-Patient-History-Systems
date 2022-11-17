package com.yash.ophs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PatientHospitalHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_hospital_history")
	private int phhId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patientId",referencedColumnName = "patientId")
	private PatientRegistration patientRegistration;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "hospitalId,",referencedColumnName = "hospitalId")
	private Hospital hospital;
	
	@Column(name ="adm_date")
	private String admitDate;
	
	private String dischargedate;
	
	@Column(name="bill")
	private double bill;
	
	PatientHospitalHistory()
	{
	}

	public int getPhhId() {
		return phhId;
	}

	public void setPhhId(int phhId) {
		this.phhId = phhId;
	}

	public PatientRegistration getPatientRegistration() {
		return patientRegistration;
	}

	public void setPatientRegistration(PatientRegistration patientRegistration) {
		this.patientRegistration = patientRegistration;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public String getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(String admitDate) {
		this.admitDate = admitDate;
	}

	public String getDischargedate() {
		return dischargedate;
	}

	public void setDischargedate(String dischargedate) {
		this.dischargedate = dischargedate;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}
	
	
}
