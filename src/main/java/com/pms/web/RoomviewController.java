package com.pms.web;

import com.pms.dao.RoomtypeDAO;
import com.pms.dao.RoomviewDAO;

import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import com.pms.service.RoomviewService;

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
 * Spring MVC controller that handles CRUD requests for Roomview entities
 * 
 */

@Controller("RoomviewController")
public class RoomviewController {

	/**
	 * DAO injected by Spring that manages Roomtype entities
	 * 
	 */
	@Autowired
	private RoomtypeDAO roomtypeDAO;

	/**
	 * DAO injected by Spring that manages Roomview entities
	 * 
	 */
	@Autowired
	private RoomviewDAO roomviewDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Roomview entities
	 * 
	 */
	@Autowired
	private RoomviewService roomviewService;

	/**
	 * Select the Roomview entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomview")
	public ModelAndView confirmDeleteRoomview(@RequestParam String roomViewIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomview", roomviewDAO.findRoomviewByPrimaryKey(roomViewIdKey));
		mav.setViewName("roomview/deleteRoomview.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/roomviewController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all Roomview entities
	 * 
	 */
	public String indexRoomview() {
		return "redirect:/indexRoomview";
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/selectRoomviewRoomtypes")
	public ModelAndView selectRoomviewRoomtypes(@RequestParam String roomview_roomViewId, @RequestParam String roomtypes_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtypes_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomview_roomViewId", roomview_roomViewId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("roomview/roomtypes/viewRoomtypes.jsp");

		return mav;
	}

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	@RequestMapping("/deleteRoomview")
	public String deleteRoomview(@RequestParam String roomViewIdKey) {
		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(roomViewIdKey);
		roomviewService.deleteRoomview(roomview);
		return "forward:/indexRoomview";
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/deleteRoomviewRoomtypes")
	public ModelAndView deleteRoomviewRoomtypes(@RequestParam String roomview_roomViewId, @RequestParam String related_roomtypes_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		Roomview roomview = roomviewService.deleteRoomviewRoomtypes(roomview_roomViewId, related_roomtypes_roomTypeId);

		mav.addObject("roomview_roomViewId", roomview_roomViewId);
		mav.addObject("roomview", roomview);
		mav.setViewName("roomview/viewRoomview.jsp");

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
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping("/newRoomviewRoomtypes")
	public ModelAndView newRoomviewRoomtypes(@RequestParam String roomview_roomViewId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roomview_roomViewId", roomview_roomViewId);
		mav.addObject("roomtype", new Roomtype());
		mav.addObject("newFlag", true);
		mav.setViewName("roomview/roomtypes/editRoomtypes.jsp");

		return mav;
	}

	/**
	 * Select an existing Roomview entity
	 * 
	 */
	@RequestMapping("/selectRoomview")
	public ModelAndView selectRoomview(@RequestParam String roomViewIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomview", roomviewDAO.findRoomviewByPrimaryKey(roomViewIdKey));
		mav.setViewName("roomview/viewRoomview.jsp");

		return mav;
	}

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	@RequestMapping("/saveRoomview")
	public String saveRoomview(@ModelAttribute Roomview roomview) {
		roomviewService.saveRoomview(roomview);
		return "forward:/indexRoomview";
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/saveRoomviewRoomtypes")
	public ModelAndView saveRoomviewRoomtypes(@RequestParam String roomview_roomViewId, @ModelAttribute Roomtype roomtypes) {
		Roomview parent_roomview = roomviewService.saveRoomviewRoomtypes(roomview_roomViewId, roomtypes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomview_roomViewId", roomview_roomViewId);
		mav.addObject("roomview", parent_roomview);
		mav.setViewName("roomview/viewRoomview.jsp");

		return mav;
	}

	/**
	 * Edit an existing Roomview entity
	 * 
	 */
	@RequestMapping("/editRoomview")
	public ModelAndView editRoomview(@RequestParam String roomViewIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomview", roomviewDAO.findRoomviewByPrimaryKey(roomViewIdKey));
		mav.setViewName("roomview/editRoomview.jsp");

		return mav;
	}

	/**
	 * Show all Roomtype entities by Roomview
	 * 
	 */
	@RequestMapping("/listRoomviewRoomtypes")
	public ModelAndView listRoomviewRoomtypes(@RequestParam String roomViewIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomview", roomviewDAO.findRoomviewByPrimaryKey(roomViewIdKey));
		mav.setViewName("roomview/roomtypes/listRoomtypes.jsp");

		return mav;
	}

	/**
	 * Show all Roomview entities
	 * 
	 */
	@RequestMapping("/indexRoomview")
	public ModelAndView listRoomviews() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomviews", roomviewService.loadRoomviews());

		mav.setViewName("roomview/listRoomviews.jsp");

		return mav;
	}

	/**
	 * Select the child Roomtype entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomviewRoomtypes")
	public ModelAndView confirmDeleteRoomviewRoomtypes(@RequestParam String roomview_roomViewId, @RequestParam String related_roomtypes_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes_roomTypeId));
		mav.addObject("roomview_roomViewId", roomview_roomViewId);
		mav.setViewName("roomview/roomtypes/deleteRoomtypes.jsp");

		return mav;
	}

	/**
	 * Edit an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/editRoomviewRoomtypes")
	public ModelAndView editRoomviewRoomtypes(@RequestParam String roomview_roomViewId, @RequestParam String roomtypes_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtypes_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomview_roomViewId", roomview_roomViewId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("roomview/roomtypes/editRoomtypes.jsp");

		return mav;
	}

	/**
	 * Create a new Roomview entity
	 * 
	 */
	@RequestMapping("/newRoomview")
	public ModelAndView newRoomview() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomview", new Roomview());
		mav.addObject("newFlag", true);
		mav.setViewName("roomview/editRoomview.jsp");

		return mav;
	}
}