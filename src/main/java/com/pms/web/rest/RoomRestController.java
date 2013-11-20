package com.pms.web.rest;

import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;

import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;

import com.pms.service.RoomService;

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
 * Spring Rest controller that handles CRUD requests for Room entities
 * 
 */

@Controller("RoomRestController")
public class RoomRestController {

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
	 * DAO injected by Spring that manages Roomtype entities
	 * 
	 */
	@Autowired
	private RoomtypeDAO roomtypeDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Room entities
	 * 
	 */
	@Autowired
	private RoomService roomService;

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/reservations/{reservation_reservationId}", method = RequestMethod.GET)
	@ResponseBody
	public Reservation loadRoomReservations(@PathVariable String room_roomId, @PathVariable String related_reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(related_reservations_reservationId, -1, -1);

		return reservation;
	}

	/**
	 * Show all Reservation entities by Room
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/reservations", method = RequestMethod.GET)
	@ResponseBody
	public List<Reservation> getRoomReservations(@PathVariable String room_roomId) {
		return new java.util.ArrayList<Reservation>(roomDAO.findRoomByPrimaryKey(room_roomId).getReservations());
	}

	/**
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping(value = "/Room", method = RequestMethod.POST)
	@ResponseBody
	public Room newRoom(@RequestBody Room room) {
		roomService.saveRoom(room);
		return roomDAO.findRoomByPrimaryKey(room.getRoomId());
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Room", method = RequestMethod.PUT)
	@ResponseBody
	public Room saveRoom(@RequestBody Room room) {
		roomService.saveRoom(room);
		return roomDAO.findRoomByPrimaryKey(room.getRoomId());
	}

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/reservations", method = RequestMethod.POST)
	@ResponseBody
	public Reservation newRoomReservations(@PathVariable String room_roomId, @RequestBody Reservation reservation) {
		roomService.saveRoomReservations(room_roomId, reservation);
		return reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoom(@PathVariable String room_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(room_roomId);
		roomService.deleteRoom(room);
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/roomtype/{roomtype_roomTypeId}", method = RequestMethod.GET)
	@ResponseBody
	public Roomtype loadRoomRoomtype(@PathVariable String room_roomId, @PathVariable String related_roomtype_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtype_roomTypeId, -1, -1);

		return roomtype;
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/roomtype", method = RequestMethod.POST)
	@ResponseBody
	public Roomtype newRoomRoomtype(@PathVariable String room_roomId, @RequestBody Roomtype roomtype) {
		roomService.saveRoomRoomtype(room_roomId, roomtype);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/reservations", method = RequestMethod.PUT)
	@ResponseBody
	public Reservation saveRoomReservations(@PathVariable String room_roomId, @RequestBody Reservation reservations) {
		roomService.saveRoomReservations(room_roomId, reservations);
		return reservationDAO.findReservationByPrimaryKey(reservations.getReservationId());
	}

	/**
	 * Show all Room entities
	 * 
	 */
	@RequestMapping(value = "/Room", method = RequestMethod.GET)
	@ResponseBody
	public List<Room> listRooms() {
		return new java.util.ArrayList<Room>(roomService.loadRooms());
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/reservations/{reservation_reservationId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomReservations(@PathVariable String room_roomId, @PathVariable String related_reservations_reservationId) {
		roomService.deleteRoomReservations(room_roomId, related_reservations_reservationId);
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/roomtype/{roomtype_roomTypeId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoomRoomtype(@PathVariable String room_roomId, @PathVariable String related_roomtype_roomTypeId) {
		roomService.deleteRoomRoomtype(room_roomId, related_roomtype_roomTypeId);
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
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/roomtype", method = RequestMethod.PUT)
	@ResponseBody
	public Roomtype saveRoomRoomtype(@PathVariable String room_roomId, @RequestBody Roomtype roomtype) {
		roomService.saveRoomRoomtype(room_roomId, roomtype);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());
	}

	/**
	 * Select an existing Room entity
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}", method = RequestMethod.GET)
	@ResponseBody
	public Room loadRoom(@PathVariable String room_roomId) {
		return roomDAO.findRoomByPrimaryKey(room_roomId);
	}

	/**
	 * Get Roomtype entity by Room
	 * 
	 */
	@RequestMapping(value = "/Room/{room_roomId}/roomtype", method = RequestMethod.GET)
	@ResponseBody
	public Roomtype getRoomRoomtype(@PathVariable String room_roomId) {
		return roomDAO.findRoomByPrimaryKey(room_roomId).getRoomtype();
	}
}