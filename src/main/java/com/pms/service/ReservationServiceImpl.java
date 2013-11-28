package com.pms.service;

import com.pms.dao.GuestDAO;
import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.TransactionsDAO;

import com.pms.domain.Guest;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Transactions;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Reservation entities
 * 
 */

@Service("ReservationService")
@Transactional
public class ReservationServiceImpl implements ReservationService {

	/**
	 * DAO injected by Spring that manages Guest entities
	 * 
	 */
	@Autowired
	private GuestDAO guestDAO;

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
	 * DAO injected by Spring that manages Transactions entities
	 * 
	 */
	@Autowired
	private TransactionsDAO transactionsDAO;

	/**
	 * Instantiates a new ReservationServiceImpl.
	 *
	 */
	public ReservationServiceImpl() {
	}

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	@Transactional
	public Reservation deleteReservationTransactionses(Integer reservation_reservationId, Integer related_transactionses_transactionId) {
		Transactions related_transactionses = transactionsDAO.findTransactionsByPrimaryKey(related_transactionses_transactionId, -1, -1);

		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservation_reservationId, -1, -1);

		related_transactionses.setReservation(null);
		reservation.getTransactionses().remove(related_transactionses);

		transactionsDAO.remove(related_transactionses);
		transactionsDAO.flush();

		return reservation;
	}

	/**
	 * Load an existing Reservation entity
	 * 
	 */
	@Transactional
	public Set<Reservation> loadReservations() {
		return reservationDAO.findAllReservations();
	}

	/**
	 * Return all Reservation entity
	 * 
	 */
	@Transactional
	public List<Reservation> findAllReservations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Reservation>(reservationDAO.findAllReservations(startResult, maxRows));
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@Transactional
	public Reservation deleteReservationGuest(Integer reservation_reservationId, Integer related_guest_guestId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservation_reservationId, -1, -1);
		Guest related_guest = guestDAO.findGuestByPrimaryKey(related_guest_guestId, -1, -1);

		reservation.setGuest(null);
		related_guest.getReservations().remove(reservation);
		reservation = reservationDAO.store(reservation);
		reservationDAO.flush();

		related_guest = guestDAO.store(related_guest);
		guestDAO.flush();

		guestDAO.remove(related_guest);
		guestDAO.flush();

		return reservation;
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@Transactional
	public Reservation saveReservationGuest(Integer reservationId, Guest related_guest) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservationId, -1, -1);
		Guest existingguest = guestDAO.findGuestByPrimaryKey(related_guest.getGuestId());

		// copy into the existing record to preserve existing relationships
		if (existingguest != null) {
			existingguest.setGuestId(related_guest.getGuestId());
			existingguest.setNamePrefix(related_guest.getNamePrefix());
			existingguest.setFirstName(related_guest.getFirstName());
			existingguest.setLastName(related_guest.getLastName());
			existingguest.setAddress1(related_guest.getAddress1());
			existingguest.setAddress2(related_guest.getAddress2());
			existingguest.setEmail(related_guest.getEmail());
			existingguest.setCountry(related_guest.getCountry());
			existingguest.setMobileNumber(related_guest.getMobileNumber());
			related_guest = existingguest;
		} else {
			related_guest = guestDAO.store(related_guest);
			guestDAO.flush();
		}

		reservation.setGuest(related_guest);
		related_guest.getReservations().add(reservation);
		reservation = reservationDAO.store(reservation);
		reservationDAO.flush();

		related_guest = guestDAO.store(related_guest);
		guestDAO.flush();

		return reservation;
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@Transactional
	public void deleteReservation(Reservation reservation) {
		reservationDAO.remove(reservation);
		reservationDAO.flush();
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@Transactional
	public Reservation deleteReservationRoom(Integer reservation_reservationId, Integer related_room_roomId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservation_reservationId, -1, -1);
		Room related_room = roomDAO.findRoomByPrimaryKey(related_room_roomId, -1, -1);

		reservation.setRoom(null);
		related_room.getReservations().remove(reservation);
		reservation = reservationDAO.store(reservation);
		reservationDAO.flush();

		related_room = roomDAO.store(related_room);
		roomDAO.flush();

		roomDAO.remove(related_room);
		roomDAO.flush();

		return reservation;
	}

	/**
	 */
	@Transactional
	public Reservation findReservationByPrimaryKey(Integer reservationId) {
		return reservationDAO.findReservationByPrimaryKey(reservationId);
	}

	/**
	 * Return a count of all Reservation entity
	 * 
	 */
	@Transactional
	public Integer countReservations() {
		return ((Long) reservationDAO.createQuerySingleResult("select count(o) from Reservation o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@Transactional
	public Reservation saveReservationRoom(Integer reservationId, Room related_room) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservationId, -1, -1);
		Room existingroom = roomDAO.findRoomByPrimaryKey(related_room.getRoomId());

		// copy into the existing record to preserve existing relationships
		if (existingroom != null) {
			existingroom.setRoomId(related_room.getRoomId());
			existingroom.setRoomCategory(related_room.getRoomCategory());
			existingroom.setIsSmoking(related_room.getIsSmoking());
			existingroom.setIsComposite(related_room.getIsComposite());
			existingroom.setFloorNumber(related_room.getFloorNumber());
			related_room = existingroom;
		} else {
			related_room = roomDAO.store(related_room);
			roomDAO.flush();
		}

		reservation.setRoom(related_room);
		related_room.getReservations().add(reservation);
		reservation = reservationDAO.store(reservation);
		reservationDAO.flush();

		related_room = roomDAO.store(related_room);
		roomDAO.flush();

		return reservation;
	}

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	@Transactional
	public Reservation saveReservationTransactionses(Integer reservationId, Transactions related_transactionses) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservationId, -1, -1);
		Transactions existingtransactionses = transactionsDAO.findTransactionsByPrimaryKey(related_transactionses.getTransactionId());

		// copy into the existing record to preserve existing relationships
		if (existingtransactionses != null) {
			existingtransactionses.setTransactionId(related_transactionses.getTransactionId());
			existingtransactionses.setTransactionDate(related_transactionses.getTransactionDate());
			existingtransactionses.setReferenceNumber(related_transactionses.getReferenceNumber());
			existingtransactionses.setCharges(related_transactionses.getCharges());
			existingtransactionses.setDescription(related_transactionses.getDescription());
			related_transactionses = existingtransactionses;
		} else {
			related_transactionses = transactionsDAO.store(related_transactionses);
			transactionsDAO.flush();
		}

		related_transactionses.setReservation(reservation);
		reservation.getTransactionses().add(related_transactionses);
		related_transactionses = transactionsDAO.store(related_transactionses);
		transactionsDAO.flush();

		reservation = reservationDAO.store(reservation);
		reservationDAO.flush();

		return reservation;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@Transactional
	public void saveReservation(Reservation reservation) {
		Reservation existingReservation = reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());

		if (existingReservation != null) {
			if (existingReservation != reservation) {
				existingReservation.setReservationId(reservation.getReservationId());
				existingReservation.setArrivalDate(reservation.getArrivalDate());
				existingReservation.setNumberOfDays(reservation.getNumberOfDays());
				existingReservation.setDepartureDate(reservation.getDepartureDate());
				existingReservation.setCardType(reservation.getCardType());
				existingReservation.setCardNumber(reservation.getCardNumber());
				existingReservation.setCvvNumber(reservation.getCvvNumber());
				existingReservation.setFolioNumber(reservation.getFolioNumber());
				existingReservation.setCurrencyCode(reservation.getCurrencyCode());
				existingReservation.setCardExpiryDate(reservation.getCardExpiryDate());
				existingReservation.setNumberOfChildren(reservation.getNumberOfChildren());
				existingReservation.setNumberOfAdults(reservation.getNumberOfAdults());
				existingReservation.setIsCheckedOut(reservation.getIsCheckedOut());
			}
			reservation = reservationDAO.store(existingReservation);
		} else {
			reservation = reservationDAO.store(reservation);
		}
		reservationDAO.flush();
	}
}
