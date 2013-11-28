package com.pms.web.rest;

import com.pms.dao.GuestDAO;
import com.pms.dao.MembersDAO;
import com.pms.dao.ReservationDAO;

import com.pms.domain.Guest;
import com.pms.domain.Members;
import com.pms.domain.Reservation;

import com.pms.service.GuestService;

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
 * Spring Rest controller that handles CRUD requests for Guest entities
 * 
 */

@Controller("GuestRestController")
public class GuestRestController {

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
	 * Service injected by Spring that provides CRUD operations for Guest entities
	 * 
	 */
	@Autowired
	private GuestService guestService;

	/**
	 * Create a new Members entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/members", method = RequestMethod.POST)
	@ResponseBody
	public Members newGuestMembers(@PathVariable Integer guest_guestId, @RequestBody Members members) {
		guestService.saveGuestMembers(guest_guestId, members);
		return membersDAO.findMembersByPrimaryKey(members.getMemberId());
	}

	/**
	 * Save an existing Members entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/members", method = RequestMethod.PUT)
	@ResponseBody
	public Members saveGuestMembers(@PathVariable Integer guest_guestId, @RequestBody Members members) {
		guestService.saveGuestMembers(guest_guestId, members);
		return membersDAO.findMembersByPrimaryKey(members.getMemberId());
	}

	/**
	 * Get Members entity by Guest
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/members", method = RequestMethod.GET)
	@ResponseBody
	public Members getGuestMembers(@PathVariable Integer guest_guestId) {
		return guestDAO.findGuestByPrimaryKey(guest_guestId).getMembers();
	}

	/**
	 * Select an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}", method = RequestMethod.GET)
	@ResponseBody
	public Guest loadGuest(@PathVariable Integer guest_guestId) {
		return guestDAO.findGuestByPrimaryKey(guest_guestId);
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGuest(@PathVariable Integer guest_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guest_guestId);
		guestService.deleteGuest(guest);
	}

	/**
	 * Show all Reservation entities by Guest
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/reservations", method = RequestMethod.GET)
	@ResponseBody
	public List<Reservation> getGuestReservations(@PathVariable Integer guest_guestId) {
		return new java.util.ArrayList<Reservation>(guestDAO.findGuestByPrimaryKey(guest_guestId).getReservations());
	}

	/**
	 * View an existing Members entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/members/{members_memberId}", method = RequestMethod.GET)
	@ResponseBody
	public Members loadGuestMembers(@PathVariable Integer guest_guestId, @PathVariable String related_members_memberId) {
		Members members = membersDAO.findMembersByPrimaryKey(related_members_memberId, -1, -1);

		return members;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/reservations", method = RequestMethod.PUT)
	@ResponseBody
	public Reservation saveGuestReservations(@PathVariable Integer guest_guestId, @RequestBody Reservation reservations) {
		guestService.saveGuestReservations(guest_guestId, reservations);
		return reservationDAO.findReservationByPrimaryKey(reservations.getReservationId());
	}

	/**
	 * Show all Guest entities
	 * 
	 */
	@RequestMapping(value = "/Guest", method = RequestMethod.GET)
	@ResponseBody
	public List<Guest> listGuests() {
		return new java.util.ArrayList<Guest>(guestService.loadGuests());
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

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/reservations/{reservation_reservationId}", method = RequestMethod.GET)
	@ResponseBody
	public Reservation loadGuestReservations(@PathVariable Integer guest_guestId, @PathVariable Integer related_reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(related_reservations_reservationId, -1, -1);

		return reservation;
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Guest", method = RequestMethod.PUT)
	@ResponseBody
	public Guest saveGuest(@RequestBody Guest guest) {
		guestService.saveGuest(guest);
		return guestDAO.findGuestByPrimaryKey(guest.getGuestId());
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/reservations/{reservation_reservationId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGuestReservations(@PathVariable Integer guest_guestId, @PathVariable Integer related_reservations_reservationId) {
		guestService.deleteGuestReservations(guest_guestId, related_reservations_reservationId);
	}

	/**
	 * Delete an existing Members entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/members/{members_memberId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGuestMembers(@PathVariable Integer guest_guestId, @PathVariable String related_members_memberId) {
		guestService.deleteGuestMembers(guest_guestId, related_members_memberId);
	}

	/**
	 * Create a new Guest entity
	 * 
	 */
	@RequestMapping(value = "/Guest", method = RequestMethod.POST)
	@ResponseBody
	public Guest newGuest(@RequestBody Guest guest) {
		guestService.saveGuest(guest);
		return guestDAO.findGuestByPrimaryKey(guest.getGuestId());
	}

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Guest/{guest_guestId}/reservations", method = RequestMethod.POST)
	@ResponseBody
	public Reservation newGuestReservations(@PathVariable Integer guest_guestId, @RequestBody Reservation reservation) {
		guestService.saveGuestReservations(guest_guestId, reservation);
		return reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());
	}
}