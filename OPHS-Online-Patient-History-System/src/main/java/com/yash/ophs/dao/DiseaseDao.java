package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer> {

}
