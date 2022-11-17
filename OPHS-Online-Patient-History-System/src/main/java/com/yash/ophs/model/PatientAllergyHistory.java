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
public class PatientAllergyHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_allergy_history")
	int pahId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patientId",referencedColumnName = "patientId")
	private PatientRegistration patientRegistration;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "aId,",referencedColumnName = "aId")
	private Allergy allergy;
	
	PatientAllergyHistory()
	{
		
	}

	public int getPahId() {
		return pahId;
	}

	public void setPahId(int pahId) {
		this.pahId = pahId;
	}

	public PatientRegistration getPatientRegistration() {
		return patientRegistration;
	}

	public void setPatientRegistration(PatientRegistration patientRegistration) {
		this.patientRegistration = patientRegistration;
	}

	public Allergy getAllergy() {
		return allergy;
	}

	public void setAllergy(Allergy allergy) {
		this.allergy = allergy;
	}
	
}
