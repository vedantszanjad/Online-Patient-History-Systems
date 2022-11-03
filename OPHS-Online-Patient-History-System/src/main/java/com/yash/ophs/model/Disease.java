package com.yash.ophs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disease {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int diseaseId;
	String diseaseName;

	public Disease() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disease(int diseaseId, String diseaseName) {
		super();
		this.diseaseId = diseaseId;
		this.diseaseName = diseaseName;
	}

	public int getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", diseaseName=" + diseaseName + "]";
	}

}
