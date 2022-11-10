package com.yash.ophs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ophs.model.RoomType;

@Repository
public interface RoomTypeDao extends JpaRepository<RoomType, Integer> {

}
