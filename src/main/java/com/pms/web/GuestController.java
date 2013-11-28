package com.pms.web;

import com.pms.dao.GuestDAO;
import com.pms.dao.MembersDAO;
import com.pms.dao.ReservationDAO;

import com.pms.domain.Guest;
import com.pms.domain.Members;
import com.pms.domain.Reservation;

import com.pms.service.GuestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Guest entities
 * 
 */

@Controller("GuestController")
public class GuestController {

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
	 * Select the child Members entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestMembers")
	public ModelAndView confirmDeleteGuestMembers(@RequestParam Integer guest_guestId, @RequestParam String related_members_memberId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", membersDAO.findMembersByPrimaryKey(related_members_memberId));
		mav.addObject("guest_guestId", guest_guestId);
		mav.setViewName("guest/members/deleteMembers.jsp");

		return mav;
	}

	/**
	 * Show all Reservation entities by Guest
	 * 
	 */
	@RequestMapping("/listGuestReservations")
	public ModelAndView listGuestReservations(@RequestParam Integer guestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(guestIdKey));
		mav.setViewName("guest/reservations/listReservations.jsp");

		return mav;
	}

	/**
	 * View an existing Members entity
	 * 
	 */
	@RequestMapping("/selectGuestMembers")
	public ModelAndView selectGuestMembers(@RequestParam Integer guest_guestId, @RequestParam String members_memberId) {
		Members members = membersDAO.findMembersByPrimaryKey(members_memberId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("members", members);
		mav.setViewName("guest/members/viewMembers.jsp");

		return mav;
	}

	/**
	 * Save an existing Members entity
	 * 
	 */
	@RequestMapping("/saveGuestMembers")
	public ModelAndView saveGuestMembers(@RequestParam Integer guest_guestId, @ModelAttribute Members members) {
		Guest parent_guest = guestService.saveGuestMembers(guest_guestId, members);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("guest", parent_guest);
		mav.setViewName("guest/viewGuest.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/guestController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Members entity
	 * 
	 */
	@RequestMapping("/deleteGuestMembers")
	public ModelAndView deleteGuestMembers(@RequestParam Integer guest_guestId, @RequestParam String related_members_memberId) {
		ModelAndView mav = new ModelAndView();

		Guest guest = guestService.deleteGuestMembers(guest_guestId, related_members_memberId);

		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("guest", guest);
		mav.setViewName("guest/viewGuest.jsp");

		return mav;
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@RequestMapping("/saveGuest")
	public String saveGuest(@ModelAttribute Guest guest) {
		guestService.saveGuest(guest);
		return "forward:/indexGuest";
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@RequestMapping("/deleteGuest")
	public String deleteGuest(@RequestParam Integer guestIdKey) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guestIdKey);
		guestService.deleteGuest(guest);
		return "forward:/indexGuest";
	}

	/**
	 * Entry point to show all Guest entities
	 * 
	 */
	public String indexGuest() {
		return "redirect:/indexGuest";
	}

	/**
	 * Select an existing Guest entity
	 * 
	 */
	@RequestMapping("/selectGuest")
	public ModelAndView selectGuest(@RequestParam Integer guestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(guestIdKey));
		mav.setViewName("guest/viewGuest.jsp");

		return mav;
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
	 * Select the Guest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuest")
	public ModelAndView confirmDeleteGuest(@RequestParam Integer guestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(guestIdKey));
		mav.setViewName("guest/deleteGuest.jsp");

		return mav;
	}

	/**
	 * Show all Guest entities
	 * 
	 */
	@RequestMapping("/indexGuest")
	public ModelAndView listGuests() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guests", guestService.loadGuests());

		mav.setViewName("guest/listGuests.jsp");

		return mav;
	}

	/**
	 * Create a new Guest entity
	 * 
	 */
	@RequestMapping("/newGuest")
	public ModelAndView newGuest() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", new Guest());
		mav.addObject("newFlag", true);
		mav.setViewName("guest/editGuest.jsp");

		return mav;
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping("/deleteGuestReservations")
	public ModelAndView deleteGuestReservations(@RequestParam Integer guest_guestId, @RequestParam Integer related_reservations_reservationId) {
		ModelAndView mav = new ModelAndView();

		Guest guest = guestService.deleteGuestReservations(guest_guestId, related_reservations_reservationId);

		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("guest", guest);
		mav.setViewName("guest/viewGuest.jsp");

		return mav;
	}

	/**
	 * Edit an existing Reservation entity
	 * 
	 */
	@RequestMapping("/editGuestReservations")
	public ModelAndView editGuestReservations(@RequestParam Integer guest_guestId, @RequestParam Integer reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservations_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("reservation", reservation);
		mav.setViewName("guest/reservations/editReservations.jsp");

		return mav;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping("/saveGuestReservations")
	public ModelAndView saveGuestReservations(@RequestParam Integer guest_guestId, @ModelAttribute Reservation reservations) {
		Guest parent_guest = guestService.saveGuestReservations(guest_guestId, reservations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("guest", parent_guest);
		mav.setViewName("guest/viewGuest.jsp");

		return mav;
	}

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping("/newGuestReservations")
	public ModelAndView newGuestReservations(@RequestParam Integer guest_guestId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("reservation", new Reservation());
		mav.addObject("newFlag", true);
		mav.setViewName("guest/reservations/editReservations.jsp");

		return mav;
	}

	/**
	 * Select the child Reservation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGuestReservations")
	public ModelAndView confirmDeleteGuestReservations(@RequestParam Integer guest_guestId, @RequestParam Integer related_reservations_reservationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(related_reservations_reservationId));
		mav.addObject("guest_guestId", guest_guestId);
		mav.setViewName("guest/reservations/deleteReservations.jsp");

		return mav;
	}

	/**
	 * Show all Members entities by Guest
	 * 
	 */
	@RequestMapping("/listGuestMembers")
	public ModelAndView listGuestMembers(@RequestParam Integer guestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(guestIdKey));
		mav.setViewName("guest/members/listMembers.jsp");

		return mav;
	}

	/**
	 * Edit an existing Members entity
	 * 
	 */
	@RequestMapping("/editGuestMembers")
	public ModelAndView editGuestMembers(@RequestParam Integer guest_guestId, @RequestParam String members_memberId) {
		Members members = membersDAO.findMembersByPrimaryKey(members_memberId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("members", members);
		mav.setViewName("guest/members/editMembers.jsp");

		return mav;
	}

	/**
	 * Create a new Members entity
	 * 
	 */
	@RequestMapping("/newGuestMembers")
	public ModelAndView newGuestMembers(@RequestParam Integer guest_guestId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("members", new Members());
		mav.addObject("newFlag", true);
		mav.setViewName("guest/members/editMembers.jsp");

		return mav;
	}

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping("/selectGuestReservations")
	public ModelAndView selectGuestReservations(@RequestParam Integer guest_guestId, @RequestParam Integer reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservations_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("guest_guestId", guest_guestId);
		mav.addObject("reservation", reservation);
		mav.setViewName("guest/reservations/viewReservations.jsp");

		return mav;
	}

	/**
	 * Edit an existing Guest entity
	 * 
	 */
	@RequestMapping("/editGuest")
	public ModelAndView editGuest(@RequestParam Integer guestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(guestIdKey));
		mav.setViewName("guest/editGuest.jsp");

		return mav;
	}
}