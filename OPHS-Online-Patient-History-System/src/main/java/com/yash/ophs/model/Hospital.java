package com.yash.ophs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int hospitalId;
	String hospitalName;
	String hospitalAddress;
	String hospitalCreatedDate;
	double hospitalCharges;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(int hospitalId, String hospitalName, String hospitalAddress, String hospitalCreatedDate,
			double hospitalCharges) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalCreatedDate = hospitalCreatedDate;
		this.hospitalCharges = hospitalCharges;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalCreatedDate() {
		return hospitalCreatedDate;
	}

	public void setHospitalCreatedDate(String hospitalCreatedDate) {
		this.hospitalCreatedDate = hospitalCreatedDate;
	}

	public double getHospitalCharges() {
		return hospitalCharges;
	}

	public void setHospitalCharges(double hospitalCharges) {
		this.hospitalCharges = hospitalCharges;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + ", hospitalCreatedDate=" + hospitalCreatedDate + ", hospitalCharges="
				+ hospitalCharges + "]";
	}

}
