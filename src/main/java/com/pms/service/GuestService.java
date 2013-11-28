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
	 * Delete an existing Reservation entity
	 * 
	 */
	public Guest deleteGuestReservations(Integer guest_guestId, Integer related_reservations_reservationId);

	/**
	 * Save an existing Guest entity
	 * 
	 */
	public void saveGuest(Guest guest);

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	public void deleteGuest(Guest guest_1);

	/**
	 * Return all Guest entity
	 * 
	 */
	public List<Guest> findAllGuests(Integer startResult, Integer maxRows);

	/**
	 */
	public Guest findGuestByPrimaryKey(Integer guestId);

	/**
	 * Delete an existing Members entity
	 * 
	 */
	public Guest deleteGuestMembers(Integer guest_guestId_1, String related_members_memberId);

	/**
	 * Save an existing Members entity
	 * 
	 */
	public Guest saveGuestMembers(Integer guestId_1, Members related_members);

	/**
	 * Load an existing Guest entity
	 * 
	 */
	public Set<Guest> loadGuests();

	/**
	 * Return a count of all Guest entity
	 * 
	 */
	public Integer countGuests();

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public Guest saveGuestReservations(Integer guestId_2, Reservation related_reservations);
}