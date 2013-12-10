package com.pms.service;

import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;

import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Room entities
 * 
 */

@Service("RoomService")
@Transactional
public class RoomServiceImpl implements RoomService {

	/**
	 * DAO injected by Spring that manages Reservation entities
	 * 
	 */
	@Autowired
	private ReservationDAO reservationDAO;

	/**
	 * DAO injected by Spring that manages Room entities
	 * 
	 */
	@Autowired
	private RoomDAO roomDAO;

	/**
	 * DAO injected by Spring that manages Roomtype entities
	 * 
	 */
	@Autowired
	private RoomtypeDAO roomtypeDAO;

	/**
	 * Instantiates a new RoomServiceImpl.
	 *
	 */
	public RoomServiceImpl() {
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@Transactional
	public Room saveRoomReservations(Integer roomId, Reservation related_reservations) {
		Room room = roomDAO.findRoomByPrimaryKey(roomId, -1, -1);
		Reservation existingreservations = reservationDAO.findReservationByPrimaryKey(related_reservations.getReservationId());

		// copy into the existing record to preserve existing relationships
		if (existingreservations != null) {
			existingreservations.setReservationId(related_reservations.getReservationId());
			existingreservations.setArrivalDate(related_reservations.getArrivalDate());
			existingreservations.setNumberOfDays(related_reservations.getNumberOfDays());
			existingreservations.setDepartureDate(related_reservations.getDepartureDate());
			existingreservations.setCardType(related_reservations.getCardType());
			existingreservations.setCardNumber(related_reservations.getCardNumber());
			existingreservations.setCvvNumber(related_reservations.getCvvNumber());
			existingreservations.setFolioNumber(related_reservations.getFolioNumber());
			existingreservations.setCurrencyCode(related_reservations.getCurrencyCode());
			existingreservations.setCardExpiryDate(related_reservations.getCardExpiryDate());
			existingreservations.setNumberOfChildren(related_reservations.getNumberOfChildren());
			existingreservations.setNumberOfAdults(related_reservations.getNumberOfAdults());
			existingreservations.setIsCheckedOut(related_reservations.getIsCheckedOut());
			related_reservations = existingreservations;
		} else {
			related_reservations = reservationDAO.store(related_reservations);
			reservationDAO.flush();
		}

		related_reservations.setRoom(room);
		room.getReservations().add(related_reservations);
		related_reservations = reservationDAO.store(related_reservations);
		reservationDAO.flush();

		room = roomDAO.store(room);
		roomDAO.flush();

		return room;
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Room saveRoomRoomtype(Integer roomId, Roomtype related_roomtype) {
		Room room = roomDAO.findRoomByPrimaryKey(roomId, -1, -1);
		Roomtype existingroomtype = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtype.getRoomTypeId());

		// copy into the existing record to preserve existing relationships
		if (existingroomtype != null) {
			existingroomtype.setRoomTypeId(related_roomtype.getRoomTypeId());
			existingroomtype.setRoomTypeField(related_roomtype.getRoomTypeField());
			existingroomtype.setRoomTypeCode(related_roomtype.getRoomTypeCode());
			existingroomtype.setRoomTypeDescription(related_roomtype.getRoomTypeDescription());
			existingroomtype.setRoomLocation(related_roomtype.getRoomLocation());
			existingroomtype.setRoomDescription(related_roomtype.getRoomDescription());
			existingroomtype.setIsReserved(related_roomtype.getIsReserved());
			related_roomtype = existingroomtype;
		} else {
			related_roomtype = roomtypeDAO.store(related_roomtype);
			roomtypeDAO.flush();
		}

		room.setRoomtype(related_roomtype);
		related_roomtype.getRooms().add(room);
		room = roomDAO.store(room);
		roomDAO.flush();

		related_roomtype = roomtypeDAO.store(related_roomtype);
		roomtypeDAO.flush();

		return room;
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@Transactional
	public void deleteRoom(Room room) {
		roomDAO.remove(room);
		roomDAO.flush();
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@Transactional
	public void saveRoom(Room room) {
		Room existingRoom = roomDAO.findRoomByPrimaryKey(room.getRoomId());

		if (existingRoom != null) {
			if (existingRoom != room) {
				existingRoom.setRoomId(room.getRoomId());
				existingRoom.setRoomCategory(room.getRoomCategory());
				existingRoom.setRoomRate(room.getRoomRate());
				existingRoom.setIsSmoking(room.getIsSmoking());
				existingRoom.setIsComposite(room.getIsComposite());
				existingRoom.setFloorNumber(room.getFloorNumber());
				existingRoom.setImage1(room.getImage1());
				existingRoom.setImage2(room.getImage2());
				existingRoom.setImage3(room.getImage3());
				existingRoom.setImage4(room.getImage4());
			}
			room = roomDAO.store(existingRoom);
		} else {
			room = roomDAO.store(room);
		}
		roomDAO.flush();
	}

	/**
	 */
	@Transactional
	public Room findRoomByPrimaryKey(Integer roomId) {
		return roomDAO.findRoomByPrimaryKey(roomId);
	}

	/**
	 * Load an existing Room entity
	 * 
	 */
	@Transactional
	public Set<Room> loadRooms() {
		return roomDAO.findAllRooms();
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@Transactional
	public Room deleteRoomReservations(Integer room_roomId, Integer related_reservations_reservationId) {
		Reservation related_reservations = reservationDAO.findReservationByPrimaryKey(related_reservations_reservationId, -1, -1);

		Room room = roomDAO.findRoomByPrimaryKey(room_roomId, -1, -1);

		related_reservations.setRoom(null);
		room.getReservations().remove(related_reservations);

		reservationDAO.remove(related_reservations);
		reservationDAO.flush();

		return room;
	}

	/**
	 * Return all Room entity
	 * 
	 */
	@Transactional
	public List<Room> findAllRooms(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Room>(roomDAO.findAllRooms(startResult, maxRows));
	}

	/**
	 * Return a count of all Room entity
	 * 
	 */
	@Transactional
	public Integer countRooms() {
		return ((Long) roomDAO.createQuerySingleResult("select count(o) from Room o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Room deleteRoomRoomtype(Integer room_roomId, Integer related_roomtype_roomTypeId) {
		Room room = roomDAO.findRoomByPrimaryKey(room_roomId, -1, -1);
		Roomtype related_roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtype_roomTypeId, -1, -1);

		room.setRoomtype(null);
		related_roomtype.getRooms().remove(room);
		room = roomDAO.store(room);
		roomDAO.flush();

		related_roomtype = roomtypeDAO.store(related_roomtype);
		roomtypeDAO.flush();

		roomtypeDAO.remove(related_roomtype);
		roomtypeDAO.flush();

		return room;
	}
}
