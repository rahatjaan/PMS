package com.pms.service;

import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Room entities
 * 
 */
public interface RoomService {

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public Room saveRoomReservations(Integer roomId, Reservation related_reservations);

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public Room saveRoomRoomtype(Integer roomId_1, Roomtype related_roomtype);

	/**
	 * Delete an existing Room entity
	 * 
	 */
	public void deleteRoom(Room room);

	/**
	 * Save an existing Room entity
	 * 
	 */
	public void saveRoom(Room room_1);

	/**
	 */
	public Room findRoomByPrimaryKey(Integer roomId_2);

	/**
	 * Load an existing Room entity
	 * 
	 */
	public Set<Room> loadRooms();

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public Room deleteRoomReservations(Integer room_roomId, Integer related_reservations_reservationId);

	/**
	 * Return all Room entity
	 * 
	 */
	public List<Room> findAllRooms(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Room entity
	 * 
	 */
	public Integer countRooms();

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public Room deleteRoomRoomtype(Integer room_roomId_1, Integer related_roomtype_roomTypeId);
}