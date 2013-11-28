package com.pms.web.rest;

import com.pms.dao.BedDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;
import com.pms.dao.RoomviewDAO;

import com.pms.domain.Bed;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import com.pms.service.RoomtypeService;

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
 * Spring Rest controller that handles CRUD requests for Roomtype entities
 * 
 */

@Controller("RoomtypeRestController")
public class RoomtypeRestController {

	/**
	 * DAO injected by Spring that manages Bed entities
	 * 
	 */
	@Autowired
	private BedDAO bedDAO;

	/**
	 * DAO injected by Spring that manages Room entities
	 * 
	 */
	@Autowired
	private RoomDAO roomDAO;

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
	 * Service injected by Spring that provides CRUD operations for Roomtype entities
	 * 
	 */
	@Autowired
	private RoomtypeService roomtypeService;

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype", method = RequestMethod.PUT)
	@ResponseBody
	public Roomtype saveRoomtype(@RequestBody Roomtype roomtype) {
		roomtypeService.saveRoomtype(roomtype);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());
	}

	/**
	 * Save an existing Bed entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/bed", method = RequestMethod.PUT)
	@ResponseBody
	public Bed saveRoomtypeBed(@PathVariable Integer roomtype_roomTypeId, @RequestBody Bed bed) {
		roomtypeService.saveRoomtypeBed(roomtype_roomTypeId, bed);
		return bedDAO.findBedByPrimaryKey(bed.getBedId());
	}

	/**
	 * View an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/rooms/{room_roomId}", method = RequestMethod.GET)
	@ResponseBody
	public Room loadRoomtypeRooms(@PathVariable Integer roomtype_roomTypeId, @PathVariable Integer related_rooms_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(related_rooms_roomId, -1, -1);

		return room;
	}

	/**
	 * Get Bed entity by Roomtype
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/bed", method = RequestMethod.GET)
	@ResponseBody
	public Bed getRoomtypeBed(@PathVariable Integer roomtype_roomTypeId) {
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId).getBed();
	}

	/**
	 * Show all Room entities by Roomtype
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/rooms", method = RequestMethod.GET)
	@ResponseBody
	public List<Room> getRoomtypeRooms(@PathVariable Integer roomtype_roomTypeId) {
		return new java.util.ArrayList<Room>(roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId).getRooms());
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/rooms/{room_roomId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomtypeRooms(@PathVariable Integer roomtype_roomTypeId, @PathVariable Integer related_rooms_roomId) {
		roomtypeService.deleteRoomtypeRooms(roomtype_roomTypeId, related_rooms_roomId);
	}

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/bed/{bed_bedId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomtypeBed(@PathVariable Integer roomtype_roomTypeId, @PathVariable Integer related_bed_bedId) {
		roomtypeService.deleteRoomtypeBed(roomtype_roomTypeId, related_bed_bedId);
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
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomtype(@PathVariable Integer roomtype_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId);
		roomtypeService.deleteRoomtype(roomtype);
	}

	/**
	 * Get Roomview entity by Roomtype
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/roomview", method = RequestMethod.GET)
	@ResponseBody
	public Roomview getRoomtypeRoomview(@PathVariable Integer roomtype_roomTypeId) {
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId).getRoomview();
	}

	/**
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/rooms", method = RequestMethod.POST)
	@ResponseBody
	public Room newRoomtypeRooms(@PathVariable Integer roomtype_roomTypeId, @RequestBody Room room) {
		roomtypeService.saveRoomtypeRooms(roomtype_roomTypeId, room);
		return roomDAO.findRoomByPrimaryKey(room.getRoomId());
	}

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/roomview", method = RequestMethod.PUT)
	@ResponseBody
	public Roomview saveRoomtypeRoomview(@PathVariable Integer roomtype_roomTypeId, @RequestBody Roomview roomview) {
		roomtypeService.saveRoomtypeRoomview(roomtype_roomTypeId, roomview);
		return roomviewDAO.findRoomviewByPrimaryKey(roomview.getRoomViewId());
	}

	/**
	 * View an existing Bed entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/bed/{bed_bedId}", method = RequestMethod.GET)
	@ResponseBody
	public Bed loadRoomtypeBed(@PathVariable Integer roomtype_roomTypeId, @PathVariable Integer related_bed_bedId) {
		Bed bed = bedDAO.findBedByPrimaryKey(related_bed_bedId, -1, -1);

		return bed;
	}

	/**
	 * Create a new Bed entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/bed", method = RequestMethod.POST)
	@ResponseBody
	public Bed newRoomtypeBed(@PathVariable Integer roomtype_roomTypeId, @RequestBody Bed bed) {
		roomtypeService.saveRoomtypeBed(roomtype_roomTypeId, bed);
		return bedDAO.findBedByPrimaryKey(bed.getBedId());
	}

	/**
	 * Show all Roomtype entities
	 * 
	 */
	@RequestMapping(value = "/Roomtype", method = RequestMethod.GET)
	@ResponseBody
	public List<Roomtype> listRoomtypes() {
		return new java.util.ArrayList<Roomtype>(roomtypeService.loadRoomtypes());
	}

	/**
	 * Select an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}", method = RequestMethod.GET)
	@ResponseBody
	public Roomtype loadRoomtype(@PathVariable Integer roomtype_roomTypeId) {
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId);
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype", method = RequestMethod.POST)
	@ResponseBody
	public Roomtype newRoomtype(@RequestBody Roomtype roomtype) {
		roomtypeService.saveRoomtype(roomtype);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());
	}

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/roomview/{roomview_roomViewId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomtypeRoomview(@PathVariable Integer roomtype_roomTypeId, @PathVariable Integer related_roomview_roomViewId) {
		roomtypeService.deleteRoomtypeRoomview(roomtype_roomTypeId, related_roomview_roomViewId);
	}

	/**
	 * Create a new Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/roomview", method = RequestMethod.POST)
	@ResponseBody
	public Roomview newRoomtypeRoomview(@PathVariable Integer roomtype_roomTypeId, @RequestBody Roomview roomview) {
		roomtypeService.saveRoomtypeRoomview(roomtype_roomTypeId, roomview);
		return roomviewDAO.findRoomviewByPrimaryKey(roomview.getRoomViewId());
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/rooms", method = RequestMethod.PUT)
	@ResponseBody
	public Room saveRoomtypeRooms(@PathVariable Integer roomtype_roomTypeId, @RequestBody Room rooms) {
		roomtypeService.saveRoomtypeRooms(roomtype_roomTypeId, rooms);
		return roomDAO.findRoomByPrimaryKey(rooms.getRoomId());
	}

	/**
	 * View an existing Roomview entity
	 * 
	 */
	@RequestMapping(value = "/Roomtype/{roomtype_roomTypeId}/roomview/{roomview_roomViewId}", method = RequestMethod.GET)
	@ResponseBody
	public Roomview loadRoomtypeRoomview(@PathVariable Integer roomtype_roomTypeId, @PathVariable Integer related_roomview_roomViewId) {
		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(related_roomview_roomViewId, -1, -1);

		return roomview;
	}
}