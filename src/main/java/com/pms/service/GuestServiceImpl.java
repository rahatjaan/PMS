package com.pms.service;

import com.pms.dao.GuestDAO;
import com.pms.dao.MembersDAO;
import com.pms.dao.ReservationDAO;

import com.pms.domain.Guest;
import com.pms.domain.Members;
import com.pms.domain.Reservation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Guest entities
 * 
 */

@Service("GuestService")
@Transactional
public class GuestServiceImpl implements GuestService {

	/**
	 * DAO injected by Spring that manages Guest entities
	 * 
	 */
	@Autowired
	private GuestDAO guestDAO;

	/**
	 * DAO injected by Spring that manages Members entities
	 * 
	 */
	@Autowired
	private MembersDAO membersDAO;

	/**
	 * DAO injected by Spring that manages Reservation entities
	 * 
	 */
	@Autowired
	private ReservationDAO reservationDAO;

	/**
	 * Instantiates a new GuestServiceImpl.
	 *
	 */
	public GuestServiceImpl() {
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@Transactional
	public Guest deleteGuestReservations(Integer guest_guestId, Integer related_reservations_reservationId) {
		Reservation related_reservations = reservationDAO.findReservationByPrimaryKey(related_reservations_reservationId, -1, -1);

		Guest guest = guestDAO.findGuestByPrimaryKey(guest_guestId, -1, -1);

		related_reservations.setGuest(null);
		guest.getReservations().remove(related_reservations);

		reservationDAO.remove(related_reservations);
		reservationDAO.flush();

		return guest;
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@Transactional
	public void saveGuest(Guest guest) {
		Guest existingGuest = guestDAO.findGuestByPrimaryKey(guest.getGuestId());

		if (existingGuest != null) {
			if (existingGuest != guest) {
				existingGuest.setGuestId(guest.getGuestId());
				existingGuest.setNamePrefix(guest.getNamePrefix());
				existingGuest.setFirstName(guest.getFirstName());
				existingGuest.setLastName(guest.getLastName());
				existingGuest.setAddress1(guest.getAddress1());
				existingGuest.setAddress2(guest.getAddress2());
				existingGuest.setEmail(guest.getEmail());
				existingGuest.setCountry(guest.getCountry());
				existingGuest.setMobileNumber(guest.getMobileNumber());
			}
			guest = guestDAO.store(existingGuest);
		} else {
			guest = guestDAO.store(guest);
		}
		guestDAO.flush();
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@Transactional
	public void deleteGuest(Guest guest) {
		guestDAO.remove(guest);
		guestDAO.flush();
	}

	/**
	 * Return all Guest entity
	 * 
	 */
	@Transactional
	public List<Guest> findAllGuests(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Guest>(guestDAO.findAllGuests(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Guest findGuestByPrimaryKey(Integer guestId) {
		return guestDAO.findGuestByPrimaryKey(guestId);
	}

	/**
	 * Delete an existing Members entity
	 * 
	 */
	@Transactional
	public Guest deleteGuestMembers(Integer guest_guestId, String related_members_memberId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guest_guestId, -1, -1);
		Members related_members = membersDAO.findMembersByPrimaryKey(related_members_memberId, -1, -1);

		guest.setMembers(null);
		related_members.getGuests().remove(guest);
		guest = guestDAO.store(guest);
		guestDAO.flush();

		related_members = membersDAO.store(related_members);
		membersDAO.flush();

		membersDAO.remove(related_members);
		membersDAO.flush();

		return guest;
	}

	/**
	 * Save an existing Members entity
	 * 
	 */
	@Transactional
	public Guest saveGuestMembers(Integer guestId, Members related_members) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guestId, -1, -1);
		Members existingmembers = membersDAO.findMembersByPrimaryKey(related_members.getMemberId());

		// copy into the existing record to preserve existing relationships
		if (existingmembers != null) {
			existingmembers.setMemberId(related_members.getMemberId());
			existingmembers.setMembershipType(related_members.getMembershipType());
			related_members = existingmembers;
		} else {
			related_members = membersDAO.store(related_members);
			membersDAO.flush();
		}

		guest.setMembers(related_members);
		related_members.getGuests().add(guest);
		guest = guestDAO.store(guest);
		guestDAO.flush();

		related_members = membersDAO.store(related_members);
		membersDAO.flush();

		return guest;
	}

	/**
	 * Load an existing Guest entity
	 * 
	 */
	@Transactional
	public Set<Guest> loadGuests() {
		return guestDAO.findAllGuests();
	}

	/**
	 * Return a count of all Guest entity
	 * 
	 */
	@Transactional
	public Integer countGuests() {
		return ((Long) guestDAO.createQuerySingleResult("select count(o) from Guest o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@Transactional
	public Guest saveGuestReservations(Integer guestId, Reservation related_reservations) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guestId, -1, -1);
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

		related_reservations.setGuest(guest);
		guest.getReservations().add(related_reservations);
		related_reservations = reservationDAO.store(related_reservations);
		reservationDAO.flush();

		guest = guestDAO.store(guest);
		guestDAO.flush();

		return guest;
	}
}
