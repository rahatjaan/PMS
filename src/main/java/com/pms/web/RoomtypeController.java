package com.pms.web;

import com.pms.dao.BedDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;
import com.pms.dao.RoomviewDAO;

import com.pms.domain.Bed;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import com.pms.service.RoomtypeService;

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
 * Spring MVC controller that handles CRUD requests for Roomtype entities
 * 
 */

@Controller("RoomtypeController")
public class RoomtypeController {

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
	 */
	@RequestMapping("/roomtypeController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Room entity
	 * 
	 */
	@RequestMapping("/editRoomtypeRooms")
	public ModelAndView editRoomtypeRooms(@RequestParam String roomtype_roomTypeId, @RequestParam String rooms_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(rooms_roomId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("room", room);
		mav.setViewName("roomtype/rooms/editRooms.jsp");

		return mav;
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/deleteRoomtype")
	public String deleteRoomtype(@RequestParam String roomTypeIdKey) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey);
		roomtypeService.deleteRoomtype(roomtype);
		return "forward:/indexRoomtype";
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping("/saveRoomtypeRooms")
	public ModelAndView saveRoomtypeRooms(@RequestParam String roomtype_roomTypeId, @ModelAttribute Room rooms) {
		Roomtype parent_roomtype = roomtypeService.saveRoomtypeRooms(roomtype_roomTypeId, rooms);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomtype", parent_roomtype);
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Create a new Bed entity
	 * 
	 */
	@RequestMapping("/newRoomtypeBed")
	public ModelAndView newRoomtypeBed(@RequestParam String roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("bed", new Bed());
		mav.addObject("newFlag", true);
		mav.setViewName("roomtype/bed/editBed.jsp");

		return mav;
	}

	/**
	 * Select the Roomtype entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomtype")
	public ModelAndView confirmDeleteRoomtype(@RequestParam String roomTypeIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey));
		mav.setViewName("roomtype/deleteRoomtype.jsp");

		return mav;
	}

	/**
	 * View an existing Bed entity
	 * 
	 */
	@RequestMapping("/selectRoomtypeBed")
	public ModelAndView selectRoomtypeBed(@RequestParam String roomtype_roomTypeId, @RequestParam String bed_bedId) {
		Bed bed = bedDAO.findBedByPrimaryKey(bed_bedId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("bed", bed);
		mav.setViewName("roomtype/bed/viewBed.jsp");

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
	 * Select the child Roomview entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomtypeRoomview")
	public ModelAndView confirmDeleteRoomtypeRoomview(@RequestParam String roomtype_roomTypeId, @RequestParam String related_roomview_roomViewId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomview", roomviewDAO.findRoomviewByPrimaryKey(related_roomview_roomViewId));
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.setViewName("roomtype/roomview/deleteRoomview.jsp");

		return mav;
	}

	/**
	 * Show all Roomtype entities
	 * 
	 */
	@RequestMapping("/indexRoomtype")
	public ModelAndView listRoomtypes() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtypes", roomtypeService.loadRoomtypes());

		mav.setViewName("roomtype/listRoomtypes.jsp");

		return mav;
	}

	/**
	 * View an existing Room entity
	 * 
	 */
	@RequestMapping("/selectRoomtypeRooms")
	public ModelAndView selectRoomtypeRooms(@RequestParam String roomtype_roomTypeId, @RequestParam String rooms_roomId) {
		Room room = roomDAO.findRoomByPrimaryKey(rooms_roomId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("room", room);
		mav.setViewName("roomtype/rooms/viewRooms.jsp");

		return mav;
	}

	/**
	 * Select an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/selectRoomtype")
	public ModelAndView selectRoomtype(@RequestParam String roomTypeIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey));
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	@RequestMapping("/deleteRoomtypeRoomview")
	public ModelAndView deleteRoomtypeRoomview(@RequestParam String roomtype_roomTypeId, @RequestParam String related_roomview_roomViewId) {
		ModelAndView mav = new ModelAndView();

		Roomtype roomtype = roomtypeService.deleteRoomtypeRoomview(roomtype_roomTypeId, related_roomview_roomViewId);

		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Select the child Room entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomtypeRooms")
	public ModelAndView confirmDeleteRoomtypeRooms(@RequestParam String roomtype_roomTypeId, @RequestParam String related_rooms_roomId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(related_rooms_roomId));
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.setViewName("roomtype/rooms/deleteRooms.jsp");

		return mav;
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping("/newRoomtype")
	public ModelAndView newRoomtype() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", new Roomtype());
		mav.addObject("newFlag", true);
		mav.setViewName("roomtype/editRoomtype.jsp");

		return mav;
	}

	/**
	 * Show all Room entities by Roomtype
	 * 
	 */
	@RequestMapping("/listRoomtypeRooms")
	public ModelAndView listRoomtypeRooms(@RequestParam String roomTypeIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey));
		mav.setViewName("roomtype/rooms/listRooms.jsp");

		return mav;
	}

	/**
	 * Save an existing Bed entity
	 * 
	 */
	@RequestMapping("/saveRoomtypeBed")
	public ModelAndView saveRoomtypeBed(@RequestParam String roomtype_roomTypeId, @ModelAttribute Bed bed) {
		Roomtype parent_roomtype = roomtypeService.saveRoomtypeBed(roomtype_roomTypeId, bed);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomtype", parent_roomtype);
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Create a new Roomview entity
	 * 
	 */
	@RequestMapping("/newRoomtypeRoomview")
	public ModelAndView newRoomtypeRoomview(@RequestParam String roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomview", new Roomview());
		mav.addObject("newFlag", true);
		mav.setViewName("roomtype/roomview/editRoomview.jsp");

		return mav;
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping("/deleteRoomtypeRooms")
	public ModelAndView deleteRoomtypeRooms(@RequestParam String roomtype_roomTypeId, @RequestParam String related_rooms_roomId) {
		ModelAndView mav = new ModelAndView();

		Roomtype roomtype = roomtypeService.deleteRoomtypeRooms(roomtype_roomTypeId, related_rooms_roomId);

		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping("/newRoomtypeRooms")
	public ModelAndView newRoomtypeRooms(@RequestParam String roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("room", new Room());
		mav.addObject("newFlag", true);
		mav.setViewName("roomtype/rooms/editRooms.jsp");

		return mav;
	}

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	@RequestMapping("/deleteRoomtypeBed")
	public ModelAndView deleteRoomtypeBed(@RequestParam String roomtype_roomTypeId, @RequestParam String related_bed_bedId) {
		ModelAndView mav = new ModelAndView();

		Roomtype roomtype = roomtypeService.deleteRoomtypeBed(roomtype_roomTypeId, related_bed_bedId);

		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Show all Bed entities by Roomtype
	 * 
	 */
	@RequestMapping("/listRoomtypeBed")
	public ModelAndView listRoomtypeBed(@RequestParam String roomTypeIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey));
		mav.setViewName("roomtype/bed/listBed.jsp");

		return mav;
	}

	/**
	 * Edit an existing Roomview entity
	 * 
	 */
	@RequestMapping("/editRoomtypeRoomview")
	public ModelAndView editRoomtypeRoomview(@RequestParam String roomtype_roomTypeId, @RequestParam String roomview_roomViewId) {
		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(roomview_roomViewId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomview", roomview);
		mav.setViewName("roomtype/roomview/editRoomview.jsp");

		return mav;
	}

	/**
	 * Edit an existing Bed entity
	 * 
	 */
	@RequestMapping("/editRoomtypeBed")
	public ModelAndView editRoomtypeBed(@RequestParam String roomtype_roomTypeId, @RequestParam String bed_bedId) {
		Bed bed = bedDAO.findBedByPrimaryKey(bed_bedId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("bed", bed);
		mav.setViewName("roomtype/bed/editBed.jsp");

		return mav;
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/saveRoomtype")
	public String saveRoomtype(@ModelAttribute Roomtype roomtype) {
		roomtypeService.saveRoomtype(roomtype);
		return "forward:/indexRoomtype";
	}

	/**
	 * Entry point to show all Roomtype entities
	 * 
	 */
	public String indexRoomtype() {
		return "redirect:/indexRoomtype";
	}

	/**
	 * Show all Roomview entities by Roomtype
	 * 
	 */
	@RequestMapping("/listRoomtypeRoomview")
	public ModelAndView listRoomtypeRoomview(@RequestParam String roomTypeIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey));
		mav.setViewName("roomtype/roomview/listRoomview.jsp");

		return mav;
	}

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	@RequestMapping("/saveRoomtypeRoomview")
	public ModelAndView saveRoomtypeRoomview(@RequestParam String roomtype_roomTypeId, @ModelAttribute Roomview roomview) {
		Roomtype parent_roomtype = roomtypeService.saveRoomtypeRoomview(roomtype_roomTypeId, roomview);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomtype", parent_roomtype);
		mav.setViewName("roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Edit an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/editRoomtype")
	public ModelAndView editRoomtype(@RequestParam String roomTypeIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeIdKey));
		mav.setViewName("roomtype/editRoomtype.jsp");

		return mav;
	}

	/**
	 * Select the child Bed entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomtypeBed")
	public ModelAndView confirmDeleteRoomtypeBed(@RequestParam String roomtype_roomTypeId, @RequestParam String related_bed_bedId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bed", bedDAO.findBedByPrimaryKey(related_bed_bedId));
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.setViewName("roomtype/bed/deleteBed.jsp");

		return mav;
	}

	/**
	 * View an existing Roomview entity
	 * 
	 */
	@RequestMapping("/selectRoomtypeRoomview")
	public ModelAndView selectRoomtypeRoomview(@RequestParam String roomtype_roomTypeId, @RequestParam String roomview_roomViewId) {
		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(roomview_roomViewId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roomtype_roomTypeId", roomtype_roomTypeId);
		mav.addObject("roomview", roomview);
		mav.setViewName("roomtype/roomview/viewRoomview.jsp");

		return mav;
	}
}