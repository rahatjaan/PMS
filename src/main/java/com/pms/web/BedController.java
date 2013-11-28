package com.pms.web;

import com.pms.dao.BedDAO;
import com.pms.dao.RoomtypeDAO;

import com.pms.domain.Bed;
import com.pms.domain.Roomtype;

import com.pms.service.BedService;

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
 * Spring MVC controller that handles CRUD requests for Bed entities
 * 
 */

@Controller("BedController")
public class BedController {

	/**
	 * DAO injected by Spring that manages Bed entities
	 * 
	 */
	@Autowired
	private BedDAO bedDAO;

	/**
	 * DAO injected by Spring that manages Roomtype entities
	 * 
	 */
	@Autowired
	private RoomtypeDAO roomtypeDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Bed entities
	 * 
	 */
	@Autowired
	private BedService bedService;

	/**
	 * Select the Bed entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBed")
	public ModelAndView confirmDeleteBed(@RequestParam Integer bedIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bed", bedDAO.findBedByPrimaryKey(bedIdKey));
		mav.setViewName("bed/deleteBed.jsp");

		return mav;
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping("/newBedRoomtypes")
	public ModelAndView newBedRoomtypes(@RequestParam Integer bed_bedId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bed_bedId", bed_bedId);
		mav.addObject("roomtype", new Roomtype());
		mav.addObject("newFlag", true);
		mav.setViewName("bed/roomtypes/editRoomtypes.jsp");

		return mav;
	}

	/**
	 * Create a new Bed entity
	 * 
	 */
	@RequestMapping("/newBed")
	public ModelAndView newBed() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bed", new Bed());
		mav.addObject("newFlag", true);
		mav.setViewName("bed/editBed.jsp");

		return mav;
	}

	/**
	 * Save an existing Bed entity
	 * 
	 */
	@RequestMapping("/saveBed")
	public String saveBed(@ModelAttribute Bed bed) {
		bedService.saveBed(bed);
		return "forward:/indexBed";
	}

	/**
	 * Show all Roomtype entities by Bed
	 * 
	 */
	@RequestMapping("/listBedRoomtypes")
	public ModelAndView listBedRoomtypes(@RequestParam Integer bedIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bed", bedDAO.findBedByPrimaryKey(bedIdKey));
		mav.setViewName("bed/roomtypes/listRoomtypes.jsp");

		return mav;
	}

	/**
	 * Select the child Roomtype entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBedRoomtypes")
	public ModelAndView confirmDeleteBedRoomtypes(@RequestParam Integer bed_bedId, @RequestParam Integer related_roomtypes_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes_roomTypeId));
		mav.addObject("bed_bedId", bed_bedId);
		mav.setViewName("bed/roomtypes/deleteRoomtypes.jsp");

		return mav;
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/selectBedRoomtypes")
	public ModelAndView selectBedRoomtypes(@RequestParam Integer bed_bedId, @RequestParam Integer roomtypes_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtypes_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bed_bedId", bed_bedId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("bed/roomtypes/viewRoomtypes.jsp");

		return mav;
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/deleteBedRoomtypes")
	public ModelAndView deleteBedRoomtypes(@RequestParam Integer bed_bedId, @RequestParam Integer related_roomtypes_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		Bed bed = bedService.deleteBedRoomtypes(bed_bedId, related_roomtypes_roomTypeId);

		mav.addObject("bed_bedId", bed_bedId);
		mav.addObject("bed", bed);
		mav.setViewName("bed/viewBed.jsp");

		return mav;
	}

	/**
	 * Select an existing Bed entity
	 * 
	 */
	@RequestMapping("/selectBed")
	public ModelAndView selectBed(@RequestParam Integer bedIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bed", bedDAO.findBedByPrimaryKey(bedIdKey));
		mav.setViewName("bed/viewBed.jsp");

		return mav;
	}

	/**
	 * Edit an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/editBedRoomtypes")
	public ModelAndView editBedRoomtypes(@RequestParam Integer bed_bedId, @RequestParam Integer roomtypes_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtypes_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bed_bedId", bed_bedId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("bed/roomtypes/editRoomtypes.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/bedController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	@RequestMapping("/deleteBed")
	public String deleteBed(@RequestParam Integer bedIdKey) {
		Bed bed = bedDAO.findBedByPrimaryKey(bedIdKey);
		bedService.deleteBed(bed);
		return "forward:/indexBed";
	}

	/**
	 * Entry point to show all Bed entities
	 * 
	 */
	public String indexBed() {
		return "redirect:/indexBed";
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/saveBedRoomtypes")
	public ModelAndView saveBedRoomtypes(@RequestParam Integer bed_bedId, @ModelAttribute Roomtype roomtypes) {
		Bed parent_bed = bedService.saveBedRoomtypes(bed_bedId, roomtypes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bed_bedId", bed_bedId);
		mav.addObject("bed", parent_bed);
		mav.setViewName("bed/viewBed.jsp");

		return mav;
	}

	/**
	 * Show all Bed entities
	 * 
	 */
	@RequestMapping("/indexBed")
	public ModelAndView listBeds() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("beds", bedService.loadBeds());

		mav.setViewName("bed/listBeds.jsp");

		return mav;
	}

	/**
	 * Edit an existing Bed entity
	 * 
	 */
	@RequestMapping("/editBed")
	public ModelAndView editBed(@RequestParam Integer bedIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bed", bedDAO.findBedByPrimaryKey(bedIdKey));
		mav.setViewName("bed/editBed.jsp");

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
}