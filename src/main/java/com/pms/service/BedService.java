package com.pms.service;

import com.pms.domain.Bed;
import com.pms.domain.Roomtype;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Bed entities
 * 
 */
public interface BedService {

	/**
	 * Return all Bed entity
	 * 
	 */
	public List<Bed> findAllBeds(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Bed entity
	 * 
	 */
	public void saveBed(Bed bed);

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public Bed deleteBedRoomtypes(Integer bed_bedId, Integer related_roomtypes_roomTypeId);

	/**
	 */
	public Bed findBedByPrimaryKey(Integer bedId);

	/**
	 * Load an existing Bed entity
	 * 
	 */
	public Set<Bed> loadBeds();

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	public void deleteBed(Bed bed_1);

	/**
	 * Return a count of all Bed entity
	 * 
	 */
	public Integer countBeds();

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public Bed saveBedRoomtypes(Integer bedId_1, Roomtype related_roomtypes);
}