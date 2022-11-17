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
@Table(name="patient_disease_history")
public class PatientDiseaseHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "patient_disease_history_id")
	private int pdhId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patientId",referencedColumnName = "patientId")
	private PatientRegistration patientRegistration;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "diseaseId,",referencedColumnName = "diseaseId")
	private Disease disease;

	@Column(name = "sev_of_disease")
	private String seviretyOfDisease;
	
	PatientDiseaseHistory()
	{
		
	}

	public int getPdhId() {
		return pdhId;
	}

	public void setPdhId(int pdhId) {
		this.pdhId = pdhId;
	}

	public PatientRegistration getPatientRegistration() {
		return patientRegistration;
	}

	public void setPatientRegistration(PatientRegistration patientRegistration) {
		this.patientRegistration = patientRegistration;
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	public String getSeviretyOfDisease() {
		return seviretyOfDisease;
	}

	public void setSeviretyOfDisease(String seviretyOfDisease) {
		this.seviretyOfDisease = seviretyOfDisease;
	}
	
	
}
