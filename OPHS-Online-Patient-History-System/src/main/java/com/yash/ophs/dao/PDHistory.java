package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientDiseaseHistory;

@Repository
public interface PDHistory extends JpaRepository<PatientDiseaseHistory, Integer>
{

}
