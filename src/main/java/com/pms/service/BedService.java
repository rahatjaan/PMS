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
	 * Load an existing Bed entity
	 * 
	 */
	public Set<Bed> loadBeds();

	/**
	 * Delete an existing Bed entity
	 * 
	 */
	public void deleteBed(Bed bed);

	/**
	 * Save an existing Bed entity
	 * 
	 */
	public void saveBed(Bed bed_1);

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public Bed saveBedRoomtypes(String bedId, Roomtype related_roomtypes);

	/**
	 * Return a count of all Bed entity
	 * 
	 */
	public Integer countBeds();

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public Bed deleteBedRoomtypes(String bed_bedId, String related_roomtypes_roomTypeId);

	/**
	 */
	public Bed findBedByPrimaryKey(String bedId_1);

	/**
	 * Return all Bed entity
	 * 
	 */
	public List<Bed> findAllBeds(Integer startResult, Integer maxRows);
}