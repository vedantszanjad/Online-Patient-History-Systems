package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.Allergy;
@Repository
public interface AllergyDao extends JpaRepository<Allergy, Integer> {

}
