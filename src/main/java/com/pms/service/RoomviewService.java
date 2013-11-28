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
	 */
	public Roomview findRoomviewByPrimaryKey(Integer roomViewId);

	/**
	 * Delete an existing Roomview entity
	 * 
	 */
	public void deleteRoomview(Roomview roomview);

	/**
	 * Save an existing Roomtype entity
	 * 
	 */
	public Roomview saveRoomviewRoomtypes(Integer roomViewId_1, Roomtype related_roomtypes);

	/**
	 * Load an existing Roomview entity
	 * 
	 */
	public Set<Roomview> loadRoomviews();

	/**
	 * Return a count of all Roomview entity
	 * 
	 */
	public Integer countRoomviews();

	/**
	 * Delete an existing Roomtype entity
	 * 
	 */
	public Roomview deleteRoomviewRoomtypes(Integer roomview_roomViewId, Integer related_roomtypes_roomTypeId);

	/**
	 * Save an existing Roomview entity
	 * 
	 */
	public void saveRoomview(Roomview roomview_1);

	/**
	 * Return all Roomview entity
	 * 
	 */
	public List<Roomview> findAllRoomviews(Integer startResult, Integer maxRows);
}