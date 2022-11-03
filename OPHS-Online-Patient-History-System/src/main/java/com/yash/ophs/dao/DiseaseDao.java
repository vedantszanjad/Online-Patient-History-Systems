package com.ysh.ophs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ysh.ophs.model.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer> {

}
