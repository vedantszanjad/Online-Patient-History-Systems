package com.yash.ophs.serviceimplementation;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.ophs.dao.DoctorDao;
import com.yash.ophs.model.Doctor;
import com.yash.ophs.service.DoctorService;

@Service
public class DoctorServiceImplementation implements DoctorService {

	@Autowired
	private DoctorDao doctorDao;

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorDao.findAll();
	}

	@Override
	public Optional<Doctor> getOneDoctor(int doctorId) {
		// TODO Auto-generated method stub
		return doctorDao.findById(doctorId);
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDao.save(doctor);
		return  doctor;
	}

	@Override
	public Doctor update(Doctor doctor, int doctorId) {
		// TODO Auto-generated method stub
		Optional<Doctor> op= doctorDao.findById(doctorId);
		if(op.isPresent())
		{
			Doctor dr =op.get();
			dr.setDoctorAge(doctor.getDoctorAge());
			dr.setDoctorGender(doctor.getDoctorGender());
			dr.setDoctorMobileNumber(doctor.getDoctorMobileNumber());
			dr.setDoctorName(doctor.getDoctorName());
			dr.setDoctorQualification(doctor.getDoctorQualification());
			dr.setDoctorSpecification(doctor.getDoctorSpecification());
			doctorDao.save(dr);
			System.out.println("Doctor update successfully");

		}		
		else
		{
			System.out.println("Doctor not found");
		}
//		
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorDao.deleteById(doctorId);
	}
	
	

}
