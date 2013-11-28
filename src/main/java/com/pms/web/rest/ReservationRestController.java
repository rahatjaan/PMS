package com.pms.web.rest;

import com.pms.dao.GuestDAO;
import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.TransactionsDAO;

import com.pms.domain.Guest;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Transactions;

import com.pms.service.ReservationService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Reservation entities
 * 
 */

@Controller("ReservationRestController")
public class ReservationRestController {

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
	 * Service injected by Spring that provides CRUD operations for Reservation entities
	 * 
	 */
	@Autowired
	private ReservationService reservationService;

	/**
	 * Select an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}", method = RequestMethod.GET)
	@ResponseBody
	public Reservation loadReservation(@PathVariable Integer reservation_reservationId) {
		return reservationDAO.findReservationByPrimaryKey(reservation_reservationId);
	}

	/**
	 * Get Guest entity by Reservation
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/guest", method = RequestMethod.GET)
	@ResponseBody
	public Guest getReservationGuest(@PathVariable Integer reservation_reservationId) {
		return reservationDAO.findReservationByPrimaryKey(reservation_reservationId).getGuest();
	}

	/**
	 * Create a new Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/transactionses", method = RequestMethod.POST)
	@ResponseBody
	public Transactions newReservationTransactionses(@PathVariable Integer reservation_reservationId, @RequestBody Transactions transactions) {
		reservationService.saveReservationTransactionses(reservation_reservationId, transactions);
		return transactionsDAO.findTransactionsByPrimaryKey(transactions.getTransactionId());
	}

	/**
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/room", method = RequestMethod.POST)
	@ResponseBody
	public Room newReservationRoom(@PathVariable Integer reservation_reservationId, @RequestBody Room room) {
		reservationService.saveReservationRoom(reservation_reservationId, room);
		return roomDAO.findRoomByPrimaryKey(room.getRoomId());
	}

	/**
	 * View an existing Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/transactionses/{transactions_transactionId}", method = RequestMethod.GET)
	@ResponseBody
	public Transactions loadReservationTransactionses(@PathVariable Integer reservation_reservationId, @PathVariable Integer related_transactionses_transactionId) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(related_transactionses_transactionId, -1, -1);

		return transactions;
	}

	/**
	 * Create a new Guest entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/guest", method = RequestMethod.POST)
	@ResponseBody
	public Guest newReservationGuest(@PathVariable Integer reservation_reservationId, @RequestBody Guest guest) {
		reservationService.saveReservationGuest(reservation_reservationId, guest);
		return guestDAO.findGuestByPrimaryKey(guest.getGuestId());
	}

	/**
	 * Show all Transactions entities by Reservation
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/transactionses", method = RequestMethod.GET)
	@ResponseBody
	public List<Transactions> getReservationTransactionses(@PathVariable Integer reservation_reservationId) {
		return new java.util.ArrayList<Transactions>(reservationDAO.findReservationByPrimaryKey(reservation_reservationId).getTransactionses());
	}

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/transactionses/{transactions_transactionId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReservationTransactionses(@PathVariable Integer reservation_reservationId, @PathVariable Integer related_transactionses_transactionId) {
		reservationService.deleteReservationTransactionses(reservation_reservationId, related_transactionses_transactionId);
	}

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/transactionses", method = RequestMethod.PUT)
	@ResponseBody
	public Transactions saveReservationTransactionses(@PathVariable Integer reservation_reservationId, @RequestBody Transactions transactionses) {
		reservationService.saveReservationTransactionses(reservation_reservationId, transactionses);
		return transactionsDAO.findTransactionsByPrimaryKey(transactionses.getTransactionId());
	}

	/**
	 * View an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/guest/{guest_guestId}", method = RequestMethod.GET)
	@ResponseBody
	public Guest loadReservationGuest(@PathVariable Integer reservation_reservationId, @PathVariable Integer related_guest_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(related_guest_guestId, -1, -1);

		return guest;
	}

	/**
	 * Get Room entity by Reservation
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/room", method = RequestMethod.GET)
	@ResponseBody
	public Room getReservationRoom(@PathVariable Integer reservation_reservationId) {
		return reservationDAO.findReservationByPrimaryKey(reservation_reservationId).getRoom();
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/room/{room_roomId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReservationRoom(@PathVariable Integer reservation_reservationId, @PathVariable Integer related_room_roomId) {
		reservationService.deleteReservationRoom(reservation_reservationId, related_room_roomId);
	}

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Reservation", method = RequestMethod.POST)
	@ResponseBody
	public Reservation newReservation(@RequestBody Reservation reservation) {
		reservationService.saveReservation(reservation);
		return reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/room", method = RequestMethod.PUT)
	@ResponseBody
	public Room saveReservationRoom(@PathVariable Integer reservation_reservationId, @RequestBody Room room) {
		reservationService.saveReservationRoom(reservation_reservationId, room);
		return roomDAO.findRoomByPrimaryKey(room.getRoomId());
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/guest", method = RequestMethod.PUT)
	@ResponseBody
	public Guest saveReservationGuest(@PathVariable Integer reservation_reservationId, @RequestBody Guest guest) {
		reservationService.saveReservationGuest(reservation_reservationId, guest);
		return guestDAO.findGuestByPrimaryKey(guest.getGuestId());
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Reservation", method = RequestMethod.PUT)
	@ResponseBody
	public Reservation saveReservation(@RequestBody Reservation reservation) {
		reservationService.saveReservation(reservation);
		return reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReservation(@PathVariable Integer reservation_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservation_reservationId);
		reservationService.deleteReservation(reservation);
	}

	/**
	 * View an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/room/{room_roomId}", method = RequestMethod.GET)
	@ResponseBody
	public Room loadReservationRoom(@PathVariable Integer reservation_reservationId, @PathVariable Integer related_room_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(related_room_roomId, -1, -1);

		return room;
	}

	/**
	 * Show all Reservation entities
	 * 
	 */
	@RequestMapping(value = "/Reservation", method = RequestMethod.GET)
	@ResponseBody
	public List<Reservation> listReservations() {
		return new java.util.ArrayList<Reservation>(reservationService.loadReservations());
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Reservation/{reservation_reservationId}/guest/{guest_guestId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReservationGuest(@PathVariable Integer reservation_reservationId, @PathVariable Integer related_guest_guestId) {
		reservationService.deleteReservationGuest(reservation_reservationId, related_guest_guestId);
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}