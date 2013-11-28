package com.pms.web;

import com.pms.dao.GuestDAO;
import com.pms.dao.MembersDAO;

import com.pms.domain.Guest;
import com.pms.domain.Members;

import com.pms.service.MembersService;

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
 * Spring MVC controller that handles CRUD requests for Members entities
 * 
 */

@Controller("MembersController")
public class MembersController {

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
	 * Edit an existing Members entity
	 * 
	 */
	@RequestMapping("/editMembers")
	public ModelAndView editMembers(@RequestParam String memberIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", membersDAO.findMembersByPrimaryKey(memberIdKey));
		mav.setViewName("members/editMembers.jsp");

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
	 * Delete an existing Guest entity
	 * 
	 */
	@RequestMapping("/deleteMembersGuests")
	public ModelAndView deleteMembersGuests(@RequestParam String members_memberId, @RequestParam Integer related_guests_guestId) {
		ModelAndView mav = new ModelAndView();

		Members members = membersService.deleteMembersGuests(members_memberId, related_guests_guestId);

		mav.addObject("members_memberId", members_memberId);
		mav.addObject("members", members);
		mav.setViewName("members/viewMembers.jsp");

		return mav;
	}

	/**
	 * Create a new Members entity
	 * 
	 */
	@RequestMapping("/newMembers")
	public ModelAndView newMembers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", new Members());
		mav.addObject("newFlag", true);
		mav.setViewName("members/editMembers.jsp");

		return mav;
	}

	/**
	 * Create a new Guest entity
	 * 
	 */
	@RequestMapping("/newMembersGuests")
	public ModelAndView newMembersGuests(@RequestParam String members_memberId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("members_memberId", members_memberId);
		mav.addObject("guest", new Guest());
		mav.addObject("newFlag", true);
		mav.setViewName("members/guests/editGuests.jsp");

		return mav;
	}

	/**
	 * Delete an existing Members entity
	 * 
	 */
	@RequestMapping("/deleteMembers")
	public String deleteMembers(@RequestParam String memberIdKey) {
		Members members = membersDAO.findMembersByPrimaryKey(memberIdKey);
		membersService.deleteMembers(members);
		return "forward:/indexMembers";
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@RequestMapping("/saveMembersGuests")
	public ModelAndView saveMembersGuests(@RequestParam String members_memberId, @ModelAttribute Guest guests) {
		Members parent_members = membersService.saveMembersGuests(members_memberId, guests);

		ModelAndView mav = new ModelAndView();
		mav.addObject("members_memberId", members_memberId);
		mav.addObject("members", parent_members);
		mav.setViewName("members/viewMembers.jsp");

		return mav;
	}

	/**
	 * Edit an existing Guest entity
	 * 
	 */
	@RequestMapping("/editMembersGuests")
	public ModelAndView editMembersGuests(@RequestParam String members_memberId, @RequestParam Integer guests_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guests_guestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("members_memberId", members_memberId);
		mav.addObject("guest", guest);
		mav.setViewName("members/guests/editGuests.jsp");

		return mav;
	}

	/**
	 * Save an existing Members entity
	 * 
	 */
	@RequestMapping("/saveMembers")
	public String saveMembers(@ModelAttribute Members members) {
		membersService.saveMembers(members);
		return "forward:/indexMembers";
	}

	/**
	 */
	@RequestMapping("/membersController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Members entity
	 * 
	 */
	@RequestMapping("/selectMembers")
	public ModelAndView selectMembers(@RequestParam String memberIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", membersDAO.findMembersByPrimaryKey(memberIdKey));
		mav.setViewName("members/viewMembers.jsp");

		return mav;
	}

	/**
	 * View an existing Guest entity
	 * 
	 */
	@RequestMapping("/selectMembersGuests")
	public ModelAndView selectMembersGuests(@RequestParam String members_memberId, @RequestParam Integer guests_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guests_guestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("members_memberId", members_memberId);
		mav.addObject("guest", guest);
		mav.setViewName("members/guests/viewGuests.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Members entities
	 * 
	 */
	public String indexMembers() {
		return "redirect:/indexMembers";
	}

	/**
	 * Select the child Guest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMembersGuests")
	public ModelAndView confirmDeleteMembersGuests(@RequestParam String members_memberId, @RequestParam Integer related_guests_guestId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(related_guests_guestId));
		mav.addObject("members_memberId", members_memberId);
		mav.setViewName("members/guests/deleteGuests.jsp");

		return mav;
	}

	/**
	 * Show all Guest entities by Members
	 * 
	 */
	@RequestMapping("/listMembersGuests")
	public ModelAndView listMembersGuests(@RequestParam String memberIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", membersDAO.findMembersByPrimaryKey(memberIdKey));
		mav.setViewName("members/guests/listGuests.jsp");

		return mav;
	}

	/**
	 * Show all Members entities
	 * 
	 */
	@RequestMapping("/indexMembers")
	public ModelAndView listMemberss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("memberss", membersService.loadMemberss());

		mav.setViewName("members/listMemberss.jsp");

		return mav;
	}

	/**
	 * Select the Members entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMembers")
	public ModelAndView confirmDeleteMembers(@RequestParam String memberIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", membersDAO.findMembersByPrimaryKey(memberIdKey));
		mav.setViewName("members/deleteMembers.jsp");

		return mav;
	}
}