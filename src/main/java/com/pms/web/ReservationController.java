package com.pms.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

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

import com.pms.dao.GuestDAO;
import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.TransactionsDAO;
import com.pms.domain.Guest;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Transactions;
import com.pms.service.ReservationService;

/**
 * Spring MVC controller that handles CRUD requests for Reservation entities
 * 
 */

@Controller("ReservationController")
public class ReservationController {

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
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping("/newReservation")
	public ModelAndView newReservation() {
		ModelAndView mav = new ModelAndView();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date currentDate = Calendar.getInstance().getTime();
		String stringDate = simpleDateFormat.format(currentDate);
		try {
			currentDate = simpleDateFormat.parse(stringDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		 
		cal.setTime(currentDate);
		Reservation reservation = new Reservation();
		reservation.setArrivalDate(cal);
		reservation.setNumberOfDays(1);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(currentDate);
		cal1.add(Calendar.DATE, 1);
		reservation.setDepartureDate(cal1);
		UUID idOne = UUID.randomUUID();
		reservation.setFolioNumber(idOne.toString().replaceAll("-", "").toUpperCase());
		
		Map<Integer,String> roomList = new LinkedHashMap<Integer,String>();
		Set<Room> rooms = roomDAO.findAllRooms();
		for(Room rT : rooms){
			roomList.put(rT.getRoomId(), rT.getRoomCategory());
	    }
		
		
		Map<Integer,String> guestList = new LinkedHashMap<Integer,String>();
		Set<Guest> guests = guestDAO.findAllGuests();
		for(Guest rT : guests){
			guestList.put(rT.getGuestId(), rT.getFirstName()+" "+rT.getLastName());
	    }
		
		
		mav.addObject("reservation", reservation);
		mav.addObject("roomList", roomList);
		mav.addObject("guestList", guestList);
		mav.addObject("newFlag", true);
		mav.setViewName("reservation/editReservation.jsp");

		return mav;
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@RequestMapping("/deleteReservationGuest")
	public ModelAndView deleteReservationGuest(@RequestParam Integer reservation_reservationId, @RequestParam Integer related_guest_guestId) {
		ModelAndView mav = new ModelAndView();

		Reservation reservation = reservationService.deleteReservationGuest(reservation_reservationId, related_guest_guestId);

		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("reservation", reservation);
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Edit an existing Guest entity
	 * 
	 */
	@RequestMapping("/editReservationGuest")
	public ModelAndView editReservationGuest(@RequestParam Integer reservation_reservationId, @RequestParam Integer guest_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guest_guestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("guest", guest);
		mav.setViewName("reservation/guest/editGuest.jsp");

		return mav;
	}

	/**
	 * View an existing Room entity
	 * 
	 */
	@RequestMapping("/selectReservationRoom")
	public ModelAndView selectReservationRoom(@RequestParam Integer reservation_reservationId, @RequestParam Integer room_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(room_roomId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("room", room);
		mav.setViewName("reservation/room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Edit an existing Transactions entity
	 * 
	 */
	@RequestMapping("/editReservationTransactionses")
	public ModelAndView editReservationTransactionses(@RequestParam Integer reservation_reservationId, @RequestParam Integer transactionses_transactionId) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(transactionses_transactionId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("transactions", transactions);
		mav.setViewName("reservation/transactionses/editTransactionses.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/reservationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Transactions entities by Reservation
	 * 
	 */
	@RequestMapping("/listReservationTransactionses")
	public ModelAndView listReservationTransactionses(@RequestParam Integer reservationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(reservationIdKey));
		mav.setViewName("reservation/transactionses/listTransactionses.jsp");

		return mav;
	}

	/**
	 * Show all Room entities by Reservation
	 * 
	 */
	@RequestMapping("/listReservationRoom")
	public ModelAndView listReservationRoom(@RequestParam Integer reservationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(reservationIdKey));
		mav.setViewName("reservation/room/listRoom.jsp");

		return mav;
	}

	/**
	 * Create a new Guest entity
	 * 
	 */
	@RequestMapping("/newReservationGuest")
	public ModelAndView newReservationGuest(@RequestParam Integer reservation_reservationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("guest", new Guest());
		mav.addObject("newFlag", true);
		mav.setViewName("reservation/guest/editGuest.jsp");

		return mav;
	}

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	@RequestMapping("/saveReservationTransactionses")
	public ModelAndView saveReservationTransactionses(@RequestParam Integer reservation_reservationId, @ModelAttribute Transactions transactionses) {
		Reservation parent_reservation = reservationService.saveReservationTransactionses(reservation_reservationId, transactionses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("reservation", parent_reservation);
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping("/saveReservationRoom")
	public ModelAndView saveReservationRoom(@RequestParam Integer reservation_reservationId, @ModelAttribute Room room) {
		Reservation parent_reservation = reservationService.saveReservationRoom(reservation_reservationId, room);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("reservation", parent_reservation);
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Select an existing Reservation entity
	 * 
	 */
	@RequestMapping("/selectReservation")
	public ModelAndView selectReservation(@RequestParam Integer reservationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(reservationIdKey));
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	@RequestMapping("/deleteReservationTransactionses")
	public ModelAndView deleteReservationTransactionses(@RequestParam Integer reservation_reservationId, @RequestParam Integer related_transactionses_transactionId) {
		ModelAndView mav = new ModelAndView();

		Reservation reservation = reservationService.deleteReservationTransactionses(reservation_reservationId, related_transactionses_transactionId);

		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("reservation", reservation);
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Edit an existing Reservation entity
	 * 
	 */
	@RequestMapping("/editReservation")
	public ModelAndView editReservation(@RequestParam Integer reservationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(reservationIdKey));
		mav.setViewName("reservation/editReservation.jsp");

		return mav;
	}

	/**
	 * Create a new Transactions entity
	 * 
	 */
	@RequestMapping("/newReservationTransactionses")
	public ModelAndView newReservationTransactionses(@RequestParam Integer reservation_reservationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("transactions", new Transactions());
		mav.addObject("newFlag", true);
		mav.setViewName("reservation/transactionses/editTransactionses.jsp");

		return mav;
	}

	/**
	 * Show all Guest entities by Reservation
	 * 
	 */
	@RequestMapping("/listReservationGuest")
	public ModelAndView listReservationGuest(@RequestParam Integer reservationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(reservationIdKey));
		mav.setViewName("reservation/guest/listGuest.jsp");

		return mav;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping("/saveReservation")
	public String saveReservation(@ModelAttribute Reservation reservation) {
		reservationService.saveReservation(reservation);
		return "forward:/indexReservation";
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping("/deleteReservationRoom")
	public ModelAndView deleteReservationRoom(@RequestParam Integer reservation_reservationId, @RequestParam Integer related_room_roomId) {
		ModelAndView mav = new ModelAndView();

		Reservation reservation = reservationService.deleteReservationRoom(reservation_reservationId, related_room_roomId);

		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("reservation", reservation);
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping("/newReservationRoom")
	public ModelAndView newReservationRoom(@RequestParam Integer reservation_reservationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("room", new Room());
		mav.addObject("newFlag", true);
		mav.setViewName("reservation/room/editRoom.jsp");

		return mav;
	}

	/**
	 * View an existing Transactions entity
	 * 
	 */
	@RequestMapping("/selectReservationTransactionses")
	public ModelAndView selectReservationTransactionses(@RequestParam Integer reservation_reservationId, @RequestParam Integer transactionses_transactionId) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(transactionses_transactionId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("transactions", transactions);
		mav.setViewName("reservation/transactionses/viewTransactionses.jsp");

		return mav;
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@RequestMapping("/saveReservationGuest")
	public ModelAndView saveReservationGuest(@RequestParam Integer reservation_reservationId, @ModelAttribute Guest guest) {
		Reservation parent_reservation = reservationService.saveReservationGuest(reservation_reservationId, guest);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("reservation", parent_reservation);
		mav.setViewName("reservation/viewReservation.jsp");

		return mav;
	}

	/**
	 * Select the child Transactions entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReservationTransactionses")
	public ModelAndView confirmDeleteReservationTransactionses(@RequestParam Integer reservation_reservationId, @RequestParam Integer related_transactionses_transactionId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactions", transactionsDAO.findTransactionsByPrimaryKey(related_transactionses_transactionId));
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.setViewName("reservation/transactionses/deleteTransactionses.jsp");

		return mav;
	}

	/**
	 * Select the child Guest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReservationGuest")
	public ModelAndView confirmDeleteReservationGuest(@RequestParam Integer reservation_reservationId, @RequestParam Integer related_guest_guestId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("guest", guestDAO.findGuestByPrimaryKey(related_guest_guestId));
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.setViewName("reservation/guest/deleteGuest.jsp");

		return mav;
	}

	/**
	 * Edit an existing Room entity
	 * 
	 */
	@RequestMapping("/editReservationRoom")
	public ModelAndView editReservationRoom(@RequestParam Integer reservation_reservationId, @RequestParam Integer room_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(room_roomId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("room", room);
		mav.setViewName("reservation/room/editRoom.jsp");

		return mav;
	}

	/**
	 * View an existing Guest entity
	 * 
	 */
	@RequestMapping("/selectReservationGuest")
	public ModelAndView selectReservationGuest(@RequestParam Integer reservation_reservationId, @RequestParam Integer guest_guestId) {
		Guest guest = guestDAO.findGuestByPrimaryKey(guest_guestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.addObject("guest", guest);
		mav.setViewName("reservation/guest/viewGuest.jsp");

		return mav;
	}

	/**
	 * Select the Reservation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReservation")
	public ModelAndView confirmDeleteReservation(@RequestParam Integer reservationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(reservationIdKey));
		mav.setViewName("reservation/deleteReservation.jsp");

		return mav;
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping("/deleteReservation")
	public String deleteReservation(@RequestParam Integer reservationIdKey) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservationIdKey);
		reservationService.deleteReservation(reservation);
		return "forward:/indexReservation";
	}

	/**
	 * Show all Reservation entities
	 * 
	 */
	@RequestMapping("/indexReservation")
	public ModelAndView listReservations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservations", reservationService.loadReservations());

		mav.setViewName("reservation/listReservations.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Reservation entities
	 * 
	 */
	public String indexReservation() {
		return "redirect:/indexReservation";
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
	 * Select the child Room entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReservationRoom")
	public ModelAndView confirmDeleteReservationRoom(@RequestParam Integer reservation_reservationId, @RequestParam Integer related_room_roomId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(related_room_roomId));
		mav.addObject("reservation_reservationId", reservation_reservationId);
		mav.setViewName("reservation/room/deleteRoom.jsp");

		return mav;
	}
}