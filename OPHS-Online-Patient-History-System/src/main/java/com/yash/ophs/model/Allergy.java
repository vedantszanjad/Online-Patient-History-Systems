package com.yash.ophs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allergy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aId;
	String allergyName;
	String allergyType;

	public Allergy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Allergy(int aId, String allergyName, String allergyType) {
		super();
		this.aId = aId;
		this.allergyName = allergyName;
		this.allergyType = allergyType;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyType() {
		return allergyType;
	}

	public void setAllergyType(String allergyType) {
		this.allergyType = allergyType;
	}

	@Override
	public String toString() {
		return "Allergy [aId=" + aId + ", allergyName=" + allergyName + ", allergyType=" + allergyType + "]";
	}

}
