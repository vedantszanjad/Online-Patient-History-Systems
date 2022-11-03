package com.ysh.ophs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ysh.ophs.model.Hospital;

@Repository
public interface HospitalDao extends JpaRepository<Hospital, Integer> {

}
