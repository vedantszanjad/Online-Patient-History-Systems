package com.ysh.ophs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int patientId;
	String emailId;
	String password;
	String patientFirstName;
	String patientLastName;
	String patientAddress;
	String dob;
	String gender;
	String bloodGroup;
	long mobileNumber;
	String relativeName;
	String relativeMobileNumber;
	String relationWithPatient;

	public PatientRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientRegistration(int patientId, String emailId, String password, String patientFirstName,
			String patientLastName, String patientAddress, String dob, String gender, String bloodGroup,
			long mobileNumber, String relativeName, String relativeMobileNumber, String relationWithPatient) {
		super();
		this.patientId = patientId;
		this.emailId = emailId;
		this.password = password;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.patientAddress = patientAddress;
		this.dob = dob;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.mobileNumber = mobileNumber;
		this.relativeName = relativeName;
		this.relativeMobileNumber = relativeMobileNumber;
		this.relationWithPatient = relationWithPatient;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	public String getRelativeMobileNumber() {
		return relativeMobileNumber;
	}

	public void setRelativeMobileNumber(String relativeMobileNumber) {
		this.relativeMobileNumber = relativeMobileNumber;
	}

	public String getRelationWithPatient() {
		return relationWithPatient;
	}

	public void setRelationWithPatient(String relationWithPatient) {
		this.relationWithPatient = relationWithPatient;
	}

	@Override
	public String toString() {
		return "PatientRegistration [patientId=" + patientId + ", emailId=" + emailId + ", password=" + password
				+ ", patientFirstName=" + patientFirstName + ", patientLastName=" + patientLastName
				+ ", patientAddress=" + patientAddress + ", dob=" + dob + ", gender=" + gender + ", bloodGroup="
				+ bloodGroup + ", mobileNumber=" + mobileNumber + ", relativeName=" + relativeName
				+ ", relativeMobileNumber=" + relativeMobileNumber + ", relationWithPatient=" + relationWithPatient
				+ "]";
	}

}
