package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientMedicianhistory;

@Repository
public interface PatientMedicianhistoryDao extends JpaRepository<PatientMedicianhistory, Integer> {

}
