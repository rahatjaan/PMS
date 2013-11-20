package com.pms.service;

import com.pms.domain.Guest;
import com.pms.domain.Members;
import com.pms.domain.Reservation;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Guest entities
 * 
 */
public interface GuestService {

	/**
	 * Save an existing Members entity
	 * 
	 */
	public Guest saveGuestMembers(String guestId, Members related_members);

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public Guest saveGuestReservations(String guestId_1, Reservation related_reservations);

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public Guest deleteGuestReservations(String guest_guestId, String related_reservations_reservationId);

	/**
	 * Return a count of all Guest entity
	 * 
	 */
	public Integer countGuests();

	/**
	 */
	public Guest findGuestByPrimaryKey(String guestId_2);

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	public void deleteGuest(Guest guest);

	/**
	 * Save an existing Guest entity
	 * 
	 */
	public void saveGuest(Guest guest_1);

	/**
	 * Delete an existing Members entity
	 * 
	 */
	public Guest deleteGuestMembers(String guest_guestId_1, String related_members_memberId);

	/**
	 * Load an existing Guest entity
	 * 
	 */
	public Set<Guest> loadGuests();

	/**
	 * Return all Guest entity
	 * 
	 */
	public List<Guest> findAllGuests(Integer startResult, Integer maxRows);
}