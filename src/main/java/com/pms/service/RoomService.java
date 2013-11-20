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
	 * Return all Room entity
	 * 
	 */
	public List<Room> findAllRooms(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public Room saveRoomRoomtype(String roomId, Roomtype related_roomtype);

	/**
	 * Load an existing Room entity
	 * 
	 */
	public Set<Room> loadRooms();

	/**
	 * Delete an existing Room entity
	 * 
	 */
	public void deleteRoom(Room room);

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public Room deleteRoomReservations(String room_roomId, String related_reservations_reservationId);

	/**
	 */
	public Room findRoomByPrimaryKey(String roomId_1);

	/**
	 * Save an existing Room entity
	 * 
	 */
	public void saveRoom(Room room_1);

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public Room saveRoomReservations(String roomId_2, Reservation related_reservations);

	/**
	 * Return a count of all Room entity
	 * 
	 */
	public Integer countRooms();

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public Room deleteRoomRoomtype(String room_roomId_1, String related_roomtype_roomTypeId);
}