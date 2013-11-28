package com.pms.web.rest;

import com.pms.dao.RoomtypeDAO;
import com.pms.dao.RoomviewDAO;

import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import com.pms.service.RoomviewService;

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
 * Spring Rest controller that handles CRUD requests for Roomview entities
 * 
 */

@Controller("RoomviewRestController")
public class RoomviewRestController {

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
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}/roomtypes", method = RequestMethod.PUT)
	@ResponseBody
	public Roomtype saveRoomviewRoomtypes(@PathVariable Integer roomview_roomViewId, @RequestBody Roomtype roomtypes) {
		roomviewService.saveRoomviewRoomtypes(roomview_roomViewId, roomtypes);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtypes.getRoomTypeId());
	}

	/**
	 * Show all Roomview entities
	 * 
	 */
	@RequestMapping(value = "/Roomview", method = RequestMethod.GET)
	@ResponseBody
	public List<Roomview> listRoomviews() {
		return new java.util.ArrayList<Roomview>(roomviewService.loadRoomviews());
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}/roomtypes/{roomtype_roomTypeId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomviewRoomtypes(@PathVariable Integer roomview_roomViewId, @PathVariable Integer related_roomtypes_roomTypeId) {
		roomviewService.deleteRoomviewRoomtypes(roomview_roomViewId, related_roomtypes_roomTypeId);
	}

	/**
	 * Select an existing Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}", method = RequestMethod.GET)
	@ResponseBody
	public Roomview loadRoomview(@PathVariable Integer roomview_roomViewId) {
		return roomviewDAO.findRoomviewByPrimaryKey(roomview_roomViewId);
	}

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomview(@PathVariable Integer roomview_roomViewId) {
		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(roomview_roomViewId);
		roomviewService.deleteRoomview(roomview);
	}

	/**
	 * Create a new Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomview", method = RequestMethod.POST)
	@ResponseBody
	public Roomview newRoomview(@RequestBody Roomview roomview) {
		roomviewService.saveRoomview(roomview);
		return roomviewDAO.findRoomviewByPrimaryKey(roomview.getRoomViewId());
	}

	/**
	 * Show all Roomtype entities by Roomview
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}/roomtypes", method = RequestMethod.GET)
	@ResponseBody
	public List<Roomtype> getRoomviewRoomtypes(@PathVariable Integer roomview_roomViewId) {
		return new java.util.ArrayList<Roomtype>(roomviewDAO.findRoomviewByPrimaryKey(roomview_roomViewId).getRoomtypes());
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}/roomtypes/{roomtype_roomTypeId}", method = RequestMethod.GET)
	@ResponseBody
	public Roomtype loadRoomviewRoomtypes(@PathVariable Integer roomview_roomViewId, @PathVariable Integer related_roomtypes_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes_roomTypeId, -1, -1);

		return roomtype;
	}

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomview", method = RequestMethod.PUT)
	@ResponseBody
	public Roomview saveRoomview(@RequestBody Roomview roomview) {
		roomviewService.saveRoomview(roomview);
		return roomviewDAO.findRoomviewByPrimaryKey(roomview.getRoomViewId());
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomview/{roomview_roomViewId}/roomtypes", method = RequestMethod.POST)
	@ResponseBody
	public Roomtype newRoomviewRoomtypes(@PathVariable Integer roomview_roomViewId, @RequestBody Roomtype roomtype) {
		roomviewService.saveRoomviewRoomtypes(roomview_roomViewId, roomtype);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());
	}
}