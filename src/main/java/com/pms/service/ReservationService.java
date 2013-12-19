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
	public Reservation deleteReservationTransactionses(Integer reservation_reservationId, Integer related_transactionses_transactionId);

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
	 * Delete an existing Guest entity
	 * 
	 */
	public Reservation deleteReservationGuest(Integer reservation_reservationId_1, Integer related_guest_guestId);

	/**
	 * Save an existing Guest entity
	 * 
	 */
	public Reservation saveReservationGuest(Integer reservationId, Guest related_guest);

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public void deleteReservation(Reservation reservation);

	/**
	 * Delete an existing Room entity
	 * 
	 */
	public Reservation deleteReservationRoom(Integer reservation_reservationId_2, Integer related_room_roomId);

	/**
	 */
	public Reservation findReservationByPrimaryKey(Integer reservationId_1);

	/**
	 * Return a count of all Reservation entity
	 * 
	 */
	public Integer countReservations();

	/**
	 * Save an existing Room entity
	 * 
	 */
	public Reservation saveReservationRoom(Integer reservationId_2, Room related_room);

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	public Reservation saveReservationTransactionses(Integer reservationId_3, Transactions related_transactionses);
	
	public Guest findGuestBillInfo(String email, String lastName, String roomNumber);

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public void saveReservation(Reservation reservation_1);
	public Reservation findReservationByConfirmationNumber(String confirmationNumber);
}