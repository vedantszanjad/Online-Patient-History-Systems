package com.yash.ophs.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.AllergyDao;
import com.yash.ophs.model.Allergy;
import com.yash.ophs.service.AllergyService;

@Service
public class AllergyServiceImpl implements AllergyService {

	@Autowired
	private AllergyDao allergyDao;

	@Override
	public void saveOrUpdate(Allergy allergy) {
		allergyDao.save(allergy);

	}

	@Override
	public List<Allergy> getAllAllergyList() {

		return allergyDao.findAll();
	}

	@Override
	public void delete(int aId) {
		allergyDao.deleteById(aId);

	}

	@Override
	public void updateAllergy(int aId, Allergy allergy) {
		Optional<Allergy> a = allergyDao.findById(aId);
		if (a.isPresent()) {
			Allergy allergy1 = a.get();
			allergy1.setaId(aId);
			allergy1.setAllergyName(allergy.getAllergyName());
			allergy1.setAllergyType(allergy.getAllergyType());
			allergyDao.save(allergy1);
			System.out.println("Allergy updated successfully ...!!!");
		} else {
			System.out.println("Allergy id not found ...!!!");
		}

	}

	@Override
	public Optional<Allergy> findAllergyById(int aId) {
		// TODO Auto-generated method stub
		return allergyDao.findById(aId);
	}

}
