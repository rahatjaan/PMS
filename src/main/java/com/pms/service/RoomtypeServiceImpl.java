package com.pms.service;

import com.pms.dao.BedDAO;
import com.pms.dao.RoomDAO;
import com.pms.dao.RoomtypeDAO;
import com.pms.dao.RoomviewDAO;

import com.pms.domain.Bed;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Roomtype entities
 * 
 */

@Service("RoomtypeService")
@Transactional
public class RoomtypeServiceImpl implements RoomtypeService {

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
	 * Instantiates a new RoomtypeServiceImpl.
	 *
	 */
	public RoomtypeServiceImpl() {
	}

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	@Transactional
	public Roomtype saveRoomtypeRoomview(String roomTypeId, Roomview related_roomview) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeId, -1, -1);
		Roomview existingroomview = roomviewDAO.findRoomviewByPrimaryKey(related_roomview.getRoomViewId());

		// copy into the existing record to preserve existing relationships
		if (existingroomview != null) {
			existingroomview.setRoomViewId(related_roomview.getRoomViewId());
			existingroomview.setRoomViewCode(related_roomview.getRoomViewCode());
			existingroomview.setRoomViewDescription(related_roomview.getRoomViewDescription());
			related_roomview = existingroomview;
		} else {
			related_roomview = roomviewDAO.store(related_roomview);
			roomviewDAO.flush();
		}

		roomtype.setRoomview(related_roomview);
		related_roomview.getRoomtypes().add(roomtype);
		roomtype = roomtypeDAO.store(roomtype);
		roomtypeDAO.flush();

		related_roomview = roomviewDAO.store(related_roomview);
		roomviewDAO.flush();

		return roomtype;
	}

	/**
	 * Load an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Set<Roomtype> loadRoomtypes() {
		return roomtypeDAO.findAllRoomtypes();
	}

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	@Transactional
	public Roomtype deleteRoomtypeBed(String roomtype_roomTypeId, String related_bed_bedId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);
		Bed related_bed = bedDAO.findBedByPrimaryKey(related_bed_bedId, -1, -1);

		roomtype.setBed(null);
		related_bed.getRoomtypes().remove(roomtype);
		roomtype = roomtypeDAO.store(roomtype);
		roomtypeDAO.flush();

		related_bed = bedDAO.store(related_bed);
		bedDAO.flush();

		bedDAO.remove(related_bed);
		bedDAO.flush();

		return roomtype;
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@Transactional
	public void saveRoomtype(Roomtype roomtype) {
		Roomtype existingRoomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype.getRoomTypeId());

		if (existingRoomtype != null) {
			if (existingRoomtype != roomtype) {
				existingRoomtype.setRoomTypeId(roomtype.getRoomTypeId());
				existingRoomtype.setRoomTypeField(roomtype.getRoomTypeField());
				existingRoomtype.setRoomTypeCode(roomtype.getRoomTypeCode());
				existingRoomtype.setRoomTypeDescription(roomtype.getRoomTypeDescription());
				existingRoomtype.setRoomLocation(roomtype.getRoomLocation());
				existingRoomtype.setRoomDescription(roomtype.getRoomDescription());
				existingRoomtype.setIsReserved(roomtype.getIsReserved());
			}
			roomtype = roomtypeDAO.store(existingRoomtype);
		} else {
			roomtype = roomtypeDAO.store(roomtype);
		}
		roomtypeDAO.flush();
	}

	/**
	 * Save an existing Bed entity
	 * 
	 */
	@Transactional
	public Roomtype saveRoomtypeBed(String roomTypeId, Bed related_bed) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeId, -1, -1);
		Bed existingbed = bedDAO.findBedByPrimaryKey(related_bed.getBedId());

		// copy into the existing record to preserve existing relationships
		if (existingbed != null) {
			existingbed.setBedId(related_bed.getBedId());
			existingbed.setBedTypeCode(related_bed.getBedTypeCode());
			existingbed.setBedTypeDescription(related_bed.getBedTypeDescription());
			related_bed = existingbed;
		} else {
			related_bed = bedDAO.store(related_bed);
			bedDAO.flush();
		}

		roomtype.setBed(related_bed);
		related_bed.getRoomtypes().add(roomtype);
		roomtype = roomtypeDAO.store(roomtype);
		roomtypeDAO.flush();

		related_bed = bedDAO.store(related_bed);
		bedDAO.flush();

		return roomtype;
	}

	/**
	 * Return a count of all Roomtype entity
	 * 
	 */
	@Transactional
	public Integer countRoomtypes() {
		return ((Long) roomtypeDAO.createQuerySingleResult("select count(o) from Roomtype o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Room entity
	 * 
	 */
	@Transactional
	public Roomtype saveRoomtypeRooms(String roomTypeId, Room related_rooms) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeId, -1, -1);
		Room existingrooms = roomDAO.findRoomByPrimaryKey(related_rooms.getRoomId());

		// copy into the existing record to preserve existing relationships
		if (existingrooms != null) {
			existingrooms.setRoomId(related_rooms.getRoomId());
			existingrooms.setRoomCategory(related_rooms.getRoomCategory());
			existingrooms.setIsSmoking(related_rooms.getIsSmoking());
			existingrooms.setIsComposite(related_rooms.getIsComposite());
			existingrooms.setFloorNumber(related_rooms.getFloorNumber());
			related_rooms = existingrooms;
		} else {
			related_rooms = roomDAO.store(related_rooms);
			roomDAO.flush();
		}

		related_rooms.setRoomtype(roomtype);
		roomtype.getRooms().add(related_rooms);
		related_rooms = roomDAO.store(related_rooms);
		roomDAO.flush();

		roomtype = roomtypeDAO.store(roomtype);
		roomtypeDAO.flush();

		return roomtype;
	}

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	@Transactional
	public Roomtype deleteRoomtypeRoomview(String roomtype_roomTypeId, String related_roomview_roomViewId) {
		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);
		Roomview related_roomview = roomviewDAO.findRoomviewByPrimaryKey(related_roomview_roomViewId, -1, -1);

		roomtype.setRoomview(null);
		related_roomview.getRoomtypes().remove(roomtype);
		roomtype = roomtypeDAO.store(roomtype);
		roomtypeDAO.flush();

		related_roomview = roomviewDAO.store(related_roomview);
		roomviewDAO.flush();

		roomviewDAO.remove(related_roomview);
		roomviewDAO.flush();

		return roomtype;
	}

	/**
	 * Delete an existing Room entity
	 * 
	 */
	@Transactional
	public Roomtype deleteRoomtypeRooms(String roomtype_roomTypeId, String related_rooms_roomId) {
		Room related_rooms = roomDAO.findRoomByPrimaryKey(related_rooms_roomId, -1, -1);

		Roomtype roomtype = roomtypeDAO.findRoomtypeByPrimaryKey(roomtype_roomTypeId, -1, -1);

		related_rooms.setRoomtype(null);
		roomtype.getRooms().remove(related_rooms);

		roomDAO.remove(related_rooms);
		roomDAO.flush();

		return roomtype;
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Transactional
	public void deleteRoomtype(Roomtype roomtype) {
		roomtypeDAO.remove(roomtype);
		roomtypeDAO.flush();
	}

	/**
	 * Return all Roomtype entity
	 * 
	 */
	@Transactional
	public List<Roomtype> findAllRoomtypes(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Roomtype>(roomtypeDAO.findAllRoomtypes(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Roomtype findRoomtypeByPrimaryKey(String roomTypeId) {
		return roomtypeDAO.findRoomtypeByPrimaryKey(roomTypeId);
	}
}
