package com.yash.ophs.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.PatientDao;
import com.yash.ophs.model.PatientRegistration;
import com.yash.ophs.service.PateintService;

@Service
public class PatientSeviceImpl implements PateintService {
	@Autowired
	PatientDao patientDao;

	/**
	 * 
	 * @param PatientRegistration
	 * @return void
	 */
//	@Override
//	public PatientRegistration saveOrUpdate(PatientRegistration pr) {
//		return patientDao.save(pr);
//
//	}

	@Override
	public List<PatientRegistration> getAllpatient() {
		// TODO Auto-generated method stub
		return patientDao.findAll();
	}

	@Override
	public void delete(int patientId) {
		// TODO Auto-generated method stub
		patientDao.deleteById(patientId);

	}

	@Override
	public void updatePatient(int patientId, PatientRegistration pr) {
		// TODO Auto-generated method stub
		Optional<PatientRegistration> op = patientDao.findById(patientId);
		if (op.isPresent()) {
			PatientRegistration dr = op.get();
			dr.setPatientId(patientId);
			dr.setPatientFirstName(pr.getPatientFirstName());
			dr.setBloodGroup(pr.getBloodGroup());
			dr.setDob(pr.getDob());
			dr.setEmailId(pr.getEmailId());
			dr.setGender(pr.getGender());
			dr.setMobileNumber(pr.getMobileNumber());
			dr.setPassword(pr.getPassword());
			dr.setPatientAddress(pr.getPatientAddress());
			dr.setPatientLastName(pr.getPatientLastName());
			dr.setRelationWithPatient(pr.getRelationWithPatient());
			dr.setRelativeMobileNumber(pr.getRelativeMobileNumber());
			dr.setRelativeName(pr.getRelativeName());
			dr.setRoleId(pr.getRoleId());

			patientDao.save(dr);
			System.out.println("product updated successfully");
		} else {
			System.out.println("product not found");
		}       
		

	}
	@Override
	public PatientRegistration fetchUserByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return patientDao.findByEmailId(emailId);
	}

	 @Override
	    public PatientRegistration saveOrUpdate(PatientRegistration register) {
	        // TODO Auto-generated method stub
	        return patientDao.save(register);
	    }
	 
	 @Override
	    public PatientRegistration fetchUserByEmailIdAndPassword(String emailId, String password) {
	        
	        return patientDao.findByEmailIdAndPassword(emailId,password);
	    }

	@Override
	public Optional<PatientRegistration> findUserById(int roleId) {
		// TODO Auto-generated method stub
		return patientDao.findById(roleId);
	}
	}
