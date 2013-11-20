package com.pms.service;

import com.pms.dao.RoomtypeDAO;
import com.pms.dao.RoomviewDAO;

import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Roomview entities
 * 
 */

@Service("RoomviewService")
@Transactional
public class RoomviewServiceImpl implements RoomviewService {

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
	 * Instantiates a new RoomviewServiceImpl.
	 *
	 */
	public RoomviewServiceImpl() {
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Roomview deleteRoomviewRoomtypes(String roomview_roomViewId, String related_roomtypes_roomTypeId) {
		Roomtype related_roomtypes = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes_roomTypeId, -1, -1);

		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(roomview_roomViewId, -1, -1);

		related_roomtypes.setRoomview(null);
		roomview.getRoomtypes().remove(related_roomtypes);

		roomtypeDAO.remove(related_roomtypes);
		roomtypeDAO.flush();

		return roomview;
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Roomview saveRoomviewRoomtypes(String roomViewId, Roomtype related_roomtypes) {
		Roomview roomview = roomviewDAO.findRoomviewByPrimaryKey(roomViewId, -1, -1);
		Roomtype existingroomtypes = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes.getRoomTypeId());

		// copy into the existing record to preserve existing relationships
		if (existingroomtypes != null) {
			existingroomtypes.setRoomTypeId(related_roomtypes.getRoomTypeId());
			existingroomtypes.setRoomTypeField(related_roomtypes.getRoomTypeField());
			existingroomtypes.setRoomTypeCode(related_roomtypes.getRoomTypeCode());
			existingroomtypes.setRoomTypeDescription(related_roomtypes.getRoomTypeDescription());
			existingroomtypes.setRoomLocation(related_roomtypes.getRoomLocation());
			existingroomtypes.setRoomDescription(related_roomtypes.getRoomDescription());
			existingroomtypes.setIsReserved(related_roomtypes.getIsReserved());
			related_roomtypes = existingroomtypes;
		} else {
			related_roomtypes = roomtypeDAO.store(related_roomtypes);
			roomtypeDAO.flush();
		}

		related_roomtypes.setRoomview(roomview);
		roomview.getRoomtypes().add(related_roomtypes);
		related_roomtypes = roomtypeDAO.store(related_roomtypes);
		roomtypeDAO.flush();

		roomview = roomviewDAO.store(roomview);
		roomviewDAO.flush();

		return roomview;
	}

	/**
	 */
	@Transactional
	public Roomview findRoomviewByPrimaryKey(String roomViewId) {
		return roomviewDAO.findRoomviewByPrimaryKey(roomViewId);
	}

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	@Transactional
	public void saveRoomview(Roomview roomview) {
		Roomview existingRoomview = roomviewDAO.findRoomviewByPrimaryKey(roomview.getRoomViewId());

		if (existingRoomview != null) {
			if (existingRoomview != roomview) {
				existingRoomview.setRoomViewId(roomview.getRoomViewId());
				existingRoomview.setRoomViewCode(roomview.getRoomViewCode());
				existingRoomview.setRoomViewDescription(roomview.getRoomViewDescription());
			}
			roomview = roomviewDAO.store(existingRoomview);
		} else {
			roomview = roomviewDAO.store(roomview);
		}
		roomviewDAO.flush();
	}

	/**
	 * Return a count of all Roomview entity
	 * 
	 */
	@Transactional
	public Integer countRoomviews() {
		return ((Long) roomviewDAO.createQuerySingleResult("select count(o) from Roomview o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Roomview entity
	 * 
	 */
	@Transactional
	public Set<Roomview> loadRoomviews() {
		return roomviewDAO.findAllRoomviews();
	}

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	@Transactional
	public void deleteRoomview(Roomview roomview) {
		roomviewDAO.remove(roomview);
		roomviewDAO.flush();
	}

	/**
	 * Return all Roomview entity
	 * 
	 */
	@Transactional
	public List<Roomview> findAllRoomviews(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Roomview>(roomviewDAO.findAllRoomviews(startResult, maxRows));
	}
}
