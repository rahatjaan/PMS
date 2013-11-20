package com.pms.service;

import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Roomview entities
 * 
 */
public interface RoomviewService {

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public Roomview deleteRoomviewRoomtypes(String roomview_roomViewId, String related_roomtypes_roomTypeId);

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public Roomview saveRoomviewRoomtypes(String roomViewId, Roomtype related_roomtypes);

	/**
	 */
	public Roomview findRoomviewByPrimaryKey(String roomViewId_1);

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	public void saveRoomview(Roomview roomview);

	/**
	 * Return a count of all Roomview entity
	 * 
	 */
	public Integer countRoomviews();

	/**
	 * Load an existing Roomview entity
	 * 
	 */
	public Set<Roomview> loadRoomviews();

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	public void deleteRoomview(Roomview roomview_1);

	/**
	 * Return all Roomview entity
	 * 
	 */
	public List<Roomview> findAllRoomviews(Integer startResult, Integer maxRows);
}