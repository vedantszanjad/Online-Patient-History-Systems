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
public class PatientHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patientHistoryId")
	int patientHistoryId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patient_allergy_history",referencedColumnName = "patient_allergy_history")
	private PatientAllergyHistory patientAllergyHistory;

	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patient_disease_history_id",referencedColumnName = "patient_disease_history_id")
	private PatientDiseaseHistory patientDiseaseHistory;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patient_hospital_history",referencedColumnName = "patient_hospital_history")
	private PatientHospitalHistory patientHospitalHistory;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patient_medicine_history_id",referencedColumnName = "patient_medicine_history_id")
	private  PatientMedicianhistory patientMedicineHistory;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "pdvId",referencedColumnName = "pdvId")
	private PatientDocVisit patientDocVisit;
	
	PatientHistory(){}

	public int getPatientHistoryId() {
		return patientHistoryId;
	}

	public void setPatientHistoryId(int patientHistoryId) {
		this.patientHistoryId = patientHistoryId;
	}

	public PatientAllergyHistory getPatientAllergyHistory() {
		return patientAllergyHistory;
	}

	public void setPatientAllergyHistory(PatientAllergyHistory patientAllergyHistory) {
		this.patientAllergyHistory = patientAllergyHistory;
	}

	public PatientDiseaseHistory getPatientDiseaseHistory() {
		return patientDiseaseHistory;
	}

	public void setPatientDiseaseHistory(PatientDiseaseHistory patientDiseaseHistory) {
		this.patientDiseaseHistory = patientDiseaseHistory;
	}

	public PatientHospitalHistory getPatientHospitalHistory() {
		return patientHospitalHistory;
	}

	public void setPatientHospitalHistory(PatientHospitalHistory patientHospitalHistory) {
		this.patientHospitalHistory = patientHospitalHistory;
	}

	public PatientMedicianhistory getPatientMedicineHistory() {
		return patientMedicineHistory;
	}

	public void setPatientMedicineHistory(PatientMedicianhistory patientMedicineHistory) {
		this.patientMedicineHistory = patientMedicineHistory;
	}

	public PatientDocVisit getPatientDocVisit() {
		return patientDocVisit;
	}

	public void setPatientDocVisit(PatientDocVisit patientDocVisit) {
		this.patientDocVisit = patientDocVisit;
	}
	
	
	

}
