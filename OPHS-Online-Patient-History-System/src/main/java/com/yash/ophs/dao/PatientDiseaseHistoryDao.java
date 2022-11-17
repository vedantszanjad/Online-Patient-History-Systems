package com.yash.ophs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.PatientDiseaseHistory;
import com.yash.ophs.model.PatientMedicianhistory;
import com.yash.ophs.model.RoomType;

@Repository
public interface PatientDiseaseHistoryDao extends JpaRepository<PatientDiseaseHistory,Integer> {


}
