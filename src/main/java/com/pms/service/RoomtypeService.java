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
	public Roomtype saveRoomtypeRoomview(Integer roomTypeId, Roomview related_roomview);

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public void deleteRoomtype(Roomtype roomtype);

	/**
	 */
	public Roomtype findRoomtypeByPrimaryKey(Integer roomTypeId_1);

	/**
	 * Return all Roomtype entity
	 * 
	 */
	public List<Roomtype> findAllRoomtypes(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Roomtype entity
	 * 
	 */
	public Set<Roomtype> loadRoomtypes();

	/**
	 * Return a count of all Roomtype entity
	 * 
	 */
	public Integer countRoomtypes();

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public void saveRoomtype(Roomtype roomtype_1);

	/**
	 * Save an existing Room entity
	 * 
	 */
	public Roomtype saveRoomtypeRooms(Integer roomTypeId_2, Room related_rooms);

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	public Roomtype deleteRoomtypeBed(Integer roomtype_roomTypeId, Integer related_bed_bedId);

	/**
	 * Save an existing Bed entity
	 * 
	 */
	public Roomtype saveRoomtypeBed(Integer roomTypeId_3, Bed related_bed);

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	public Roomtype deleteRoomtypeRoomview(Integer roomtype_roomTypeId_1, Integer related_roomview_roomViewId);

	/**
	 * Delete an existing Room entity
	 * 
	 */
	public Roomtype deleteRoomtypeRooms(Integer roomtype_roomTypeId_2, Integer related_rooms_roomId);
}