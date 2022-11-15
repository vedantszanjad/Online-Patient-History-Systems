package com.yash.ophs.service;

import java.util.List;
import java.util.Optional;

import com.yash.ophs.model.Allergy;


public interface AllergyService {

	public void saveOrUpdate(Allergy allergy);

	public List<Allergy> getAllAllergyList();

	public void delete(int aId);

	public void updateAllergy(int aId, Allergy allergy);

	public Optional<Allergy> findAllergyById(int aId);
}
