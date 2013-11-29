package com.pms.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pms.dao.ReservationDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;
import com.pms.service.RoomService;

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
	 * Delete an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/deleteRoomRoomtype")
	public ModelAndView deleteRoomRoomtype(@RequestParam Integer room_roomId, @RequestParam Integer related_roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		Room room = roomService.deleteRoomRoomtype(room_roomId, related_roomtype_roomTypeId);

		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/saveRoomRoomtype")
	public ModelAndView saveRoomRoomtype(@RequestParam Integer room_roomId, @ModelAttribute Roomtype roomtype) {
		Room parent_room = roomService.saveRoomRoomtype(room_roomId, roomtype);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", parent_room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Edit an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/editRoomRoomtype")
	public ModelAndView editRoomRoomtype(@RequestParam Integer room_roomId, @RequestParam Integer roomtype_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("room/roomtype/editRoomtype.jsp");

		return mav;
	}

	/**
	 * Edit an existing Room entity
	 * 
	 */
	@RequestMapping("/editRoom")
	public ModelAndView editRoom(@RequestParam Integer roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/editRoom.jsp");

		return mav;
	}

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping("/selectRoomReservations")
	public ModelAndView selectRoomReservations(@RequestParam Integer room_roomId, @RequestParam Integer reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservations_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("reservation", reservation);
		mav.setViewName("room/reservations/viewReservations.jsp");

		return mav;
	}

	/**
	 * Select an existing Room entity
	 * 
	 */
	@RequestMapping("/selectRoom")
	public ModelAndView selectRoom(@RequestParam Integer roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/viewRoom.jsp");

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
	 * Select the child Reservation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomReservations")
	public ModelAndView confirmDeleteRoomReservations(@RequestParam Integer room_roomId, @RequestParam Integer related_reservations_reservationId) {
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
	 * Create a new Room entity
	 * 
	 */
	@RequestMapping("/newRoom")
	public ModelAndView newRoom() {
		ModelAndView mav = new ModelAndView();
		Map<Integer,String> roomTypeList = new LinkedHashMap<Integer,String>();
		Set<Roomtype> roomTypeSet = roomtypeDAO.findAllRoomtypes();
		for(Roomtype rT : roomTypeSet){
			roomTypeList.put(rT.getRoomTypeId(), rT.getRoomTypeCode());
	    }
		mav.addObject("room", new Room());
		mav.addObject("roomTypeList", roomTypeList);
		mav.addObject("newFlag", true);
		mav.setViewName("room/editRoom.jsp");

		return mav;
	}

	/**
	 * Edit an existing Reservation entity
	 * 
	 */
	@RequestMapping("/editRoomReservations")
	public ModelAndView editRoomReservations(@RequestParam Integer room_roomId, @RequestParam Integer reservations_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservations_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("reservation", reservation);
		mav.setViewName("room/reservations/editReservations.jsp");

		return mav;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping("/saveRoomReservations")
	public ModelAndView saveRoomReservations(@RequestParam Integer room_roomId, @ModelAttribute Reservation reservations) {
		Room parent_room = roomService.saveRoomReservations(room_roomId, reservations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", parent_room);
		mav.setViewName("room/viewRoom.jsp");

		return mav;
	}

	/**
	 * Show all Reservation entities by Room
	 * 
	 */
	@RequestMapping("/listRoomReservations")
	public ModelAndView listRoomReservations(@RequestParam Integer roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/reservations/listReservations.jsp");

		return mav;
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping("/deleteRoomReservations")
	public ModelAndView deleteRoomReservations(@RequestParam Integer room_roomId, @RequestParam Integer related_reservations_reservationId) {
		ModelAndView mav = new ModelAndView();

		Room room = roomService.deleteRoomReservations(room_roomId, related_reservations_reservationId);

		mav.addObject("room_roomId", room_roomId);
		mav.addObject("room", room);
		mav.setViewName("room/viewRoom.jsp");

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
	 * Select the child Roomtype entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoomRoomtype")
	public ModelAndView confirmDeleteRoomRoomtype(@RequestParam Integer room_roomId, @RequestParam Integer related_roomtype_roomTypeId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roomtype", roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtype_roomTypeId));
		mav.addObject("room_roomId", room_roomId);
		mav.setViewName("room/roomtype/deleteRoomtype.jsp");

		return mav;
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@RequestMapping("/saveRoom")
	public String saveRoom(@ModelAttribute Room room,@RequestParam(value = "file1") MultipartFile file1,@RequestParam(value = "file2") MultipartFile file2,@RequestParam(value = "file3") MultipartFile file3,@RequestParam(value = "file4") MultipartFile file4) {
				System.out.println(file1.getOriginalFilename());
				System.out.println(file2.getOriginalFilename());
				System.out.println(file3.getOriginalFilename());
				System.out.println(file4.getOriginalFilename());
				System.out.println(System.getProperty("user.dir"));
				InputStream inputStream = null;
				OutputStream outputStream = null;
				String path = System.getProperty("user.dir");
				  
				  
				try {  
					   inputStream = file1.getInputStream();  
					  
					   File newFile = new File("C:\\Program Files (x86)\\apache-tomcat-6.0.37\\webapps\\pms\\roomimages\\"+file1.getOriginalFilename());  
					   if (!newFile.exists()) {  
					    newFile.createNewFile();  
					   }  
					   outputStream = new FileOutputStream(newFile);  
					   int read = 0;  
					   byte[] bytes = new byte[1024];  
					  
					   while ((read = inputStream.read(bytes)) != -1) {  
					    outputStream.write(bytes, 0, read);  
					   }  
					   room.setImage1(newFile.getAbsolutePath());
					   outputStream.close();
					   inputStream.close();
					  } catch (IOException e) {  
					   // TODO Auto-generated catch block  
					   //e.printStackTrace();  
					  }
				
				try {  
					   inputStream = file2.getInputStream();  
					  
					   File newFile = new File("C:\\Program Files (x86)\\apache-tomcat-6.0.37\\webapps\\pms\\roomimages\\"+file2.getOriginalFilename());  
					   if (!newFile.exists()) {  
					    newFile.createNewFile();  
					   }  
					   outputStream = new FileOutputStream(newFile);  
					   int read = 0;  
					   byte[] bytes = new byte[1024];  
					  
					   while ((read = inputStream.read(bytes)) != -1) {  
					    outputStream.write(bytes, 0, read);  
					   }  
					   outputStream.close();
					   inputStream.close();
					   room.setImage2(newFile.getAbsolutePath());
					  } catch (IOException e) {  
					   // TODO Auto-generated catch block  
					   //e.printStackTrace();  
					  }
				
				try {  
					   inputStream = file3.getInputStream();  
					  
					   File newFile = new File("C:\\Program Files (x86)\\apache-tomcat-6.0.37\\webapps\\pms\\roomimages\\"+file3.getOriginalFilename());  
					   if (!newFile.exists()) {  
					    newFile.createNewFile();  
					   }  
					   outputStream = new FileOutputStream(newFile);  
					   int read = 0;  
					   byte[] bytes = new byte[1024];  
					  
					   while ((read = inputStream.read(bytes)) != -1) {  
					    outputStream.write(bytes, 0, read);  
					   }  
					   outputStream.close();
					   inputStream.close();
					   room.setImage3(newFile.getAbsolutePath());
					  } catch (IOException e) {  
					   // TODO Auto-generated catch block  
					   //e.printStackTrace();  
					  }
				
				try {  
					   inputStream = file4.getInputStream();  
					  
					   File newFile = new File("C:\\Program Files (x86)\\apache-tomcat-6.0.37\\webapps\\pms\\roomimages\\"+file4.getOriginalFilename());  
					   if (!newFile.exists()) {  
					    newFile.createNewFile();  
					   }  
					   outputStream = new FileOutputStream(newFile);  
					   int read = 0;  
					   byte[] bytes = new byte[1024];  
					  
					   while ((read = inputStream.read(bytes)) != -1) {  
					    outputStream.write(bytes, 0, read);  
					   }  
					   outputStream.close();
					   inputStream.close();
					   room.setImage4(newFile.getAbsolutePath());
					  } catch (IOException e) {  
					   // TODO Auto-generated catch block  
					   //e.printStackTrace();  
					  }
		
		/*Blob blob = null;
		try {
			if(null != file1){
				blob = Hibernate.createBlob(file1.getInputStream());
				room.setImage1(blob);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        document.setFilename(file.getOriginalFilename());
        document.setContent(blob);
        document.setContentType(file.getContentType());
		roomService.saveRoom(room);*/
		roomService.saveRoom(room);
		return "forward:/indexRoom";
	}
	
	/*@RequestMapping("/fileUploadForm")
	public String saveRoomWithFiles(@ModelAttribute("uploadedFile") UploadedFile uploadedFile) {
		MultipartFile file = uploadedFile.getFile();
		InputStream inputStream = null;  
		OutputStream outputStream = null;
		String fileName = file.getOriginalFilename();
		try {  
			   inputStream = file.getInputStream();  
			  
			   File newFile = new File("C:/" + fileName);  
			   if (!newFile.exists()) {  
			    newFile.createNewFile();  
			   }  
			   outputStream = new FileOutputStream(newFile);  
			   int read = 0;  
			   byte[] bytes = new byte[1024];  
			  
			   while ((read = inputStream.read(bytes)) != -1) {  
			    outputStream.write(bytes, 0, read);  
			   }  
			 } catch (IOException e) {  
			   // TODO Auto-generated catch block  
			   e.printStackTrace();  
			 }
		//roomService.saveRoom(room);
		return "forward:/indexRoom";
	}*/

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping("/newRoomReservations")
	public ModelAndView newRoomReservations(@RequestParam Integer room_roomId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("reservation", new Reservation());
		mav.addObject("newFlag", true);
		mav.setViewName("room/reservations/editReservations.jsp");

		return mav;
	}

	/**
	 * Create a new Roomtype entity
	 * 
	 */
	@RequestMapping("/newRoomRoomtype")
	public ModelAndView newRoomRoomtype(@RequestParam Integer room_roomId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("roomtype", new Roomtype());
		mav.addObject("newFlag", true);
		mav.setViewName("room/roomtype/editRoomtype.jsp");

		return mav;
	}

	/**
	 * View an existing Roomtype entity
	 * 
	 */
	@RequestMapping("/selectRoomRoomtype")
	public ModelAndView selectRoomRoomtype(@RequestParam Integer room_roomId, @RequestParam Integer roomtype_roomTypeId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("room_roomId", room_roomId);
		mav.addObject("roomtype", roomtype);
		mav.setViewName("room/roomtype/viewRoomtype.jsp");

		return mav;
	}

	/**
	 * Show all Roomtype entities by Room
	 * 
	 */
	@RequestMapping("/listRoomRoomtype")
	public ModelAndView listRoomRoomtype(@RequestParam Integer roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/roomtype/listRoomtype.jsp");

		return mav;
	}

	/**
	 * Select the Room entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoom")
	public ModelAndView confirmDeleteRoom(@RequestParam Integer roomIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("room", roomDAO.findRoomByPrimaryKey(roomIdKey));
		mav.setViewName("room/deleteRoom.jsp");

		return mav;
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@RequestMapping("/deleteRoom")
	public String deleteRoom(@RequestParam Integer roomIdKey) {
		Room room = roomDAO.findRoomByPrimaryKey(roomIdKey);
		roomService.deleteRoom(room);
		return "forward:/indexRoom";
	}

	/**
	 */
	@RequestMapping("/roomController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}