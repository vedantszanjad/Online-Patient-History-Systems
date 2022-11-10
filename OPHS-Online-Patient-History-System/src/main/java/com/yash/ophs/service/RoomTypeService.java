package com.yash.ophs.service;

import java.util.List;
import java.util.Optional;

import com.yash.ophs.model.Medicine;
import com.yash.ophs.model.RoomType;

public interface RoomTypeService {
	public List<RoomType> getAllRoomTypes();

	public Optional<RoomType> getOneRoomType(int roomTypeId);

	public RoomType addRoomType(RoomType roomType);

	public RoomType updateRoomType(RoomType roomType, int roomTypeId);

	public void deleteRoomType(int roomTypeId);
	
	public Optional<RoomType> findRoomTypeById(int roomTypeId);
	
}
