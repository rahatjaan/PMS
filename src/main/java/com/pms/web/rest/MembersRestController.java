package com.pms.web.rest;

import com.pms.dao.GuestDAO;
import com.pms.dao.MembersDAO;

import com.pms.domain.Guest;
import com.pms.domain.Members;

import com.pms.service.MembersService;

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
 * Spring Rest controller that handles CRUD requests for Members entities
 * 
 */

@Controller("MembersRestController")
public class MembersRestController {

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
	 * Service injected by Spring that provides CRUD operations for Members entities
	 * 
	 */
	@Autowired
	private MembersService membersService;

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
	 * Select an existing Members entity
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}", method = RequestMethod.GET)
	@ResponseBody
	public Members loadMembers(@PathVariable String members_memberId) {
		return membersDAO.findMembersByPrimaryKey(members_memberId);
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}/guests/{guest_guestId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteMembersGuests(@PathVariable String members_memberId, @PathVariable String related_guests_guestId) {
		membersService.deleteMembersGuests(members_memberId, related_guests_guestId);
	}

	/**
	 * Show all Members entities
	 * 
	 */
	@RequestMapping(value = "/Members", method = RequestMethod.GET)
	@ResponseBody
	public List<Members> listMemberss() {
		return new java.util.ArrayList<Members>(membersService.loadMemberss());
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}/guests", method = RequestMethod.PUT)
	@ResponseBody
	public Guest saveMembersGuests(@PathVariable String members_memberId, @RequestBody Guest guests) {
		membersService.saveMembersGuests(members_memberId, guests);
		return guestDAO.findGuestByPrimaryKey(guests.getGuestId());
	}

	/**
	 * Show all Guest entities by Members
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}/guests", method = RequestMethod.GET)
	@ResponseBody
	public List<Guest> getMembersGuests(@PathVariable String members_memberId) {
		return new java.util.ArrayList<Guest>(membersDAO.findMembersByPrimaryKey(members_memberId).getGuests());
	}

	/**
	 * View an existing Guest entity
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}/guests/{guest_guestId}", method = RequestMethod.GET)
	@ResponseBody
	public Guest loadMembersGuests(@PathVariable String members_memberId, @PathVariable String related_guests_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(related_guests_guestId, -1, -1);

		return guest;
	}

	/**
	 * Save an existing Members entity
	 * 
	 */
	@RequestMapping(value = "/Members", method = RequestMethod.PUT)
	@ResponseBody
	public Members saveMembers(@RequestBody Members members) {
		membersService.saveMembers(members);
		return membersDAO.findMembersByPrimaryKey(members.getMemberId());
	}

	/**
	 * Create a new Members entity
	 * 
	 */
	@RequestMapping(value = "/Members", method = RequestMethod.POST)
	@ResponseBody
	public Members newMembers(@RequestBody Members members) {
		membersService.saveMembers(members);
		return membersDAO.findMembersByPrimaryKey(members.getMemberId());
	}

	/**
	 * Create a new Guest entity
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}/guests", method = RequestMethod.POST)
	@ResponseBody
	public Guest newMembersGuests(@PathVariable String members_memberId, @RequestBody Guest guest) {
		membersService.saveMembersGuests(members_memberId, guest);
		return guestDAO.findGuestByPrimaryKey(guest.getGuestId());
	}

	/**
	 * Delete an existing Members entity
	 * 
	 */
	@RequestMapping(value = "/Members/{members_memberId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteMembers(@PathVariable String members_memberId) {
		Members members = membersDAO.findMembersByPrimaryKey(members_memberId);
		membersService.deleteMembers(members);
	}
}