package com.pms.service;

import com.pms.dao.BedDAO;
import com.pms.dao.RoomtypeDAO;

import com.pms.domain.Bed;
import com.pms.domain.Roomtype;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Bed entities
 * 
 */

@Service("BedService")
@Transactional
public class BedServiceImpl implements BedService {

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
	 * Instantiates a new BedServiceImpl.
	 *
	 */
	public BedServiceImpl() {
	}

	/**
	 * Load an existing Bed entity
	 * 
	 */
	@Transactional
	public Set<Bed> loadBeds() {
		return bedDAO.findAllBeds();
	}

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	@Transactional
	public void deleteBed(Bed bed) {
		bedDAO.remove(bed);
		bedDAO.flush();
	}

	/**
	 * Save an existing Bed entity
	 * 
	 */
	@Transactional
	public void saveBed(Bed bed) {
		Bed existingBed = bedDAO.findBedByPrimaryKey(bed.getBedId());

		if (existingBed != null) {
			if (existingBed != bed) {
				existingBed.setBedId(bed.getBedId());
				existingBed.setBedTypeCode(bed.getBedTypeCode());
				existingBed.setBedTypeDescription(bed.getBedTypeDescription());
			}
			bed = bedDAO.store(existingBed);
		} else {
			bed = bedDAO.store(bed);
		}
		bedDAO.flush();
	}

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Bed saveBedRoomtypes(String bedId, Roomtype related_roomtypes) {
		Bed bed = bedDAO.findBedByPrimaryKey(bedId, -1, -1);
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

		related_roomtypes.setBed(bed);
		bed.getRoomtypes().add(related_roomtypes);
		related_roomtypes = roomtypeDAO.store(related_roomtypes);
		roomtypeDAO.flush();

		bed = bedDAO.store(bed);
		bedDAO.flush();

		return bed;
	}

	/**
	 * Return a count of all Bed entity
	 * 
	 */
	@Transactional
	public Integer countBeds() {
		return ((Long) bedDAO.createQuerySingleResult("select count(o) from Bed o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Transactional
	public Bed deleteBedRoomtypes(String bed_bedId, String related_roomtypes_roomTypeId) {
		Roomtype related_roomtypes = roomtypeDAO.findRoomtypeByPrimaryKey(related_roomtypes_roomTypeId, -1, -1);

		Bed bed = bedDAO.findBedByPrimaryKey(bed_bedId, -1, -1);

		related_roomtypes.setBed(null);
		bed.getRoomtypes().remove(related_roomtypes);

		roomtypeDAO.remove(related_roomtypes);
		roomtypeDAO.flush();

		return bed;
	}

	/**
	 */
	@Transactional
	public Bed findBedByPrimaryKey(String bedId) {
		return bedDAO.findBedByPrimaryKey(bedId);
	}

	/**
	 * Return all Bed entity
	 * 
	 */
	@Transactional
	public List<Bed> findAllBeds(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Bed>(bedDAO.findAllBeds(startResult, maxRows));
	}
}
