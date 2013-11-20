package com.pms.service;

import com.pms.domain.Guest;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Transactions;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Reservation entities
 * 
 */
public interface ReservationService {

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	public Reservation deleteReservationTransactionses(String reservation_reservationId, String related_transactionses_transactionId);

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	public Reservation saveReservationTransactionses(String reservationId, Transactions related_transactionses);

	/**
	 * Return a count of all Reservation entity
	 * 
	 */
	public Integer countReservations();

	/**
	 * Delete an existing Room entity
	 * 
	 */
	public Reservation deleteReservationRoom(String reservation_reservationId_1, String related_room_roomId);

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	public Reservation deleteReservationGuest(String reservation_reservationId_2, String related_guest_guestId);

	/**
	 * Load an existing Reservation entity
	 * 
	 */
	public Set<Reservation> loadReservations();

	/**
	 * Return all Reservation entity
	 * 
	 */
	public List<Reservation> findAllReservations(Integer startResult, Integer maxRows);

	/**
	 */
	public Reservation findReservationByPrimaryKey(String reservationId_1);

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public void deleteReservation(Reservation reservation);

	/**
	 * Save an existing Room entity
	 * 
	 */
	public Reservation saveReservationRoom(String reservationId_2, Room related_room);

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public void saveReservation(Reservation reservation_1);

	/**
	 * Save an existing Guest entity
	 * 
	 */
	public Reservation saveReservationGuest(String reservationId_3, Guest related_guest);
}