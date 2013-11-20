package com.pms.service;

import com.pms.domain.Bed;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Roomtype entities
 * 
 */
public interface RoomtypeService {

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	public Roomtype saveRoomtypeRoomview(String roomTypeId, Roomview related_roomview);

	/**
	 * Load an existing Roomtype entity
	 * 
	 */
	public Set<Roomtype> loadRoomtypes();

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	public Roomtype deleteRoomtypeBed(String roomtype_roomTypeId, String related_bed_bedId);

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public void saveRoomtype(Roomtype roomtype);

	/**
	 * Save an existing Bed entity
	 * 
	 */
	public Roomtype saveRoomtypeBed(String roomTypeId_1, Bed related_bed);

	/**
	 * Return a count of all Roomtype entity
	 * 
	 */
	public Integer countRoomtypes();

	/**
	 * Save an existing Room entity
	 * 
	 */
	public Roomtype saveRoomtypeRooms(String roomTypeId_2, Room related_rooms);

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	public Roomtype deleteRoomtypeRoomview(String roomtype_roomTypeId_1, String related_roomview_roomViewId);

	/**
	 * Delete an existing Room entity
	 * 
	 */
	public Roomtype deleteRoomtypeRooms(String roomtype_roomTypeId_2, String related_rooms_roomId);

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public void deleteRoomtype(Roomtype roomtype_1);

	/**
	 * Return all Roomtype entity
	 * 
	 */
	public List<Roomtype> findAllRoomtypes(Integer startResult, Integer maxRows);

	/**
	 */
	public Roomtype findRoomtypeByPrimaryKey(String roomTypeId_3);
}