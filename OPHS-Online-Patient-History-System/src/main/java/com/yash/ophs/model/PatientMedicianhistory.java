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
@Table(name="patient_medicine_history")
public class PatientMedicianhistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_medicine_history_id")
	private int pmhId;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patientId",referencedColumnName = "patientId")
	private PatientRegistration patientRegistration;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tabletId,",referencedColumnName = "tabletId")
	private Medicine medicine;
	
	@Column(name = "dose")
	private String dose;
	
	PatientMedicianhistory()
	{
		
	}

	public int getPmhId() {
		return pmhId;
	}

	public void setPmhId(int pmhId) {
		this.pmhId = pmhId;
	}

	public PatientRegistration getPatientRegistration() {
		return patientRegistration;
	}

	public void setPatientRegistration(PatientRegistration patientRegistration) {
		this.patientRegistration = patientRegistration;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}
		
}
