package com.pms.web;

import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;

import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;

import com.pms.service.RoomService;

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
 * Spring MVC controller that handles CRUD requests for Room entities
 * 
 */

@Controller("RoomController")
public class RoomController {

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
	 * Edit an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/editRoomRoomtype")
	public ModelAndView editRoomRoomtype(@RequestParam String room_roomId, @RequestParam String roomtype_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("room/roomtype/editRoomtype.jsp");

		return mav;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping("/saveRoomReservations")
	public ModelAndView saveRoomReservations(@RequestParam String room_roomId, @ModelAttribute Reservation reservations) {
		Room parent_room = roomService.saveRoomReservations(room_roomId, reservations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", parent_room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/selectRoomRoomtype")
	public ModelAndView selectRoomRoomtype(@RequestParam String room_roomId, @RequestParam String roomtype_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("room/roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Show all Reservation entities by Room
	 * 
	 */
	@RequestMapping("/listRoomReservations")
	public ModelAndView listRoomReservations(@RequestParam String roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/reservations/listReservations.jsp");

		return mav;
	}

	/**
	 * Select the child Roomtype entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomRoomtype")
	public ModelAndView confirmDeleteRoomRoomtype(@RequestParam String room_roomId, @RequestParam String related_roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtype_roomTypeId));
		mav.addObject("room_roomId", room_roomId);
		mav.setViewName("room/roomtype/deleteRoomtype.jsp");

		return mav;
	}

	/**
	 * Edit an existing Reservation entity
	 * 
	 */
	@RequestMapping("/editRoomReservations")
	public ModelAndView editRoomReservations(@RequestParam String room_roomId, @RequestParam String reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservations_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("reservation", reservation);
		mav.setViewName("room/reservations/editReservations.jsp");

		return mav;
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping("/deleteRoomReservations")
	public ModelAndView deleteRoomReservations(@RequestParam String room_roomId, @RequestParam String related_reservations_reservationId) {
		ModelAndView mav = new ModelAndView();

		Room room = roomService.deleteRoomReservations(room_roomId, related_reservations_reservationId);

		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping("/saveRoom")
	public String saveRoom(@ModelAttribute Room room) {
		roomService.saveRoom(room);
		return "forward:/indexRoom";
	}

	/**
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping("/newRoom")
	public ModelAndView newRoom() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", new Room());
		mav.addObject("newFlag", true);
		mav.setViewName("room/editRoom.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/roomController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping("/selectRoomReservations")
	public ModelAndView selectRoomReservations(@RequestParam String room_roomId, @RequestParam String reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservations_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("reservation", reservation);
		mav.setViewName("room/reservations/viewReservations.jsp");

		return mav;
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping("/deleteRoom")
	public String deleteRoom(@RequestParam String roomIdKey) {
		Room room = roomDAO.findRoomByPrimaryKey(roomIdKey);
		roomService.deleteRoom(room);
		return "forward:/indexRoom";
	}

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping("/newRoomReservations")
	public ModelAndView newRoomReservations(@RequestParam String room_roomId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("reservation", new Reservation());
		mav.addObject("newFlag", true);
		mav.setViewName("room/reservations/editReservations.jsp");

		return mav;
	}

	/**
	 * Select the child Reservation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomReservations")
	public ModelAndView confirmDeleteRoomReservations(@RequestParam String room_roomId, @RequestParam String related_reservations_reservationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(related_reservations_reservationId));
		mav.addObject("room_roomId", room_roomId);
		mav.setViewName("room/reservations/deleteReservations.jsp");

		return mav;
	}

	/**
	 * Show all Room entities
	 * 
	 */
	@RequestMapping("/indexRoom")
	public ModelAndView listRooms() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rooms", roomService.loadRooms());

		mav.setViewName("room/listRooms.jsp");

		return mav;
	}

	/**
	 * Show all Roomtype entities by Room
	 * 
	 */
	@RequestMapping("/listRoomRoomtype")
	public ModelAndView listRoomRoomtype(@RequestParam String roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/roomtype/listRoomtype.jsp");

		return mav;
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/deleteRoomRoomtype")
	public ModelAndView deleteRoomRoomtype(@RequestParam String room_roomId, @RequestParam String related_roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		Room room = roomService.deleteRoomRoomtype(room_roomId, related_roomtype_roomTypeId);

		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Select the Room entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoom")
	public ModelAndView confirmDeleteRoom(@RequestParam String roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/deleteRoom.jsp");

		return mav;
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/saveRoomRoomtype")
	public ModelAndView saveRoomRoomtype(@RequestParam String room_roomId, @ModelAttribute Roomtype roomtype) {
		Room parent_room = roomService.saveRoomRoomtype(room_roomId, roomtype);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", parent_room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping("/newRoomRoomtype")
	public ModelAndView newRoomRoomtype(@RequestParam String room_roomId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("roomtype", new Roomtype());
		mav.addObject("newFlag", true);
		mav.setViewName("room/roomtype/editRoomtype.jsp");

		return mav;
	}

	/**
	 * Select an existing Room entity
	 * 
	 */
	@RequestMapping("/selectRoom")
	public ModelAndView selectRoom(@RequestParam String roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Edit an existing Room entity
	 * 
	 */
	@RequestMapping("/editRoom")
	public ModelAndView editRoom(@RequestParam String roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/editRoom.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Room entities
	 * 
	 */
	public String indexRoom() {
		return "redirect:/indexRoom";
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