package com.pms.web.rest;

import com.pms.dao.BedDAO;
import com.pms.dao.RoomtypeDAO;

import com.pms.domain.Bed;
import com.pms.domain.Roomtype;

import com.pms.service.BedService;

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
 * Spring Rest controller that handles CRUD requests for Bed entities
 * 
 */

@Controller("BedRestController")
public class BedRestController {

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
	 * Save an existing Bed entity
	 * 
	 */
	@RequestMapping(value = "/Bed", method = RequestMethod.PUT)
	@ResponseBody
	public Bed saveBed(@RequestBody Bed bed) {
		bedService.saveBed(bed);
		return bedDAO.findBedByPrimaryKey(bed.getBedId());
	}

	/**
	 * Show all Bed entities
	 * 
	 */
	@RequestMapping(value = "/Bed", method = RequestMethod.GET)
	@ResponseBody
	public List<Bed> listBeds() {
		return new java.util.ArrayList<Bed>(bedService.loadBeds());
	}

	/**
	 * Create a new Bed entity
	 * 
	 */
	@RequestMapping(value = "/Bed", method = RequestMethod.POST)
	@ResponseBody
	public Bed newBed(@RequestBody Bed bed) {
		bedService.saveBed(bed);
		return bedDAO.findBedByPrimaryKey(bed.getBedId());
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Bed/{bed_bedId}/roomtypes/{roomtype_roomTypeId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBedRoomtypes(@PathVariable String bed_bedId, @PathVariable String related_roomtypes_roomTypeId) {
		bedService.deleteBedRoomtypes(bed_bedId, related_roomtypes_roomTypeId);
	}

	/**
	 * Select an existing Bed entity
	 * 
	 */
	@RequestMapping(value = "/Bed/{bed_bedId}", method = RequestMethod.GET)
	@ResponseBody
	public Bed loadBed(@PathVariable String bed_bedId) {
		return bedDAO.findBedByPrimaryKey(bed_bedId);
	}

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	@RequestMapping(value = "/Bed/{bed_bedId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBed(@PathVariable String bed_bedId) {
		Bed bed = bedDAO.findBedByPrimaryKey(bed_bedId);
		bedService.deleteBed(bed);
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Bed/{bed_bedId}/roomtypes", method = RequestMethod.PUT)
	@ResponseBody
	public Roomtype saveBedRoomtypes(@PathVariable String bed_bedId, @RequestBody Roomtype roomtypes) {
		bedService.saveBedRoomtypes(bed_bedId, roomtypes);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtypes.getRoomTypeId());
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
	@RequestMapping(value = "/Bed/{bed_bedId}/roomtypes", method = RequestMethod.POST)
	@ResponseBody
	public Roomtype newBedRoomtypes(@PathVariable String bed_bedId, @RequestBody Roomtype roomtype) {
		bedService.saveBedRoomtypes(bed_bedId, roomtype);
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping(value = "/Bed/{bed_bedId}/roomtypes/{roomtype_roomTypeId}", method = RequestMethod.GET)
	@ResponseBody
	public Roomtype loadBedRoomtypes(@PathVariable String bed_bedId, @PathVariable String related_roomtypes_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes_roomTypeId, -1, -1);

		return roomtype;
	}

	/**
	 * Show all Roomtype entities by Bed
	 * 
	 */
	@RequestMapping(value = "/Bed/{bed_bedId}/roomtypes", method = RequestMethod.GET)
	@ResponseBody
	public List<Roomtype> getBedRoomtypes(@PathVariable String bed_bedId) {
		return new java.util.ArrayList<Roomtype>(bedDAO.findBedByPrimaryKey(bed_bedId).getRoomtypes());
	}
}