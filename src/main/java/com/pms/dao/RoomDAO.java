package com.pms.dao;

import com.pms.domain.Room;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Room entities.
 * 
 */
public interface RoomDAO extends JpaDao<Room> {

	/**
	 * JPQL Query - findRoomByRoomId
	 *
	 */
	public Room findRoomByRoomId(Integer roomId) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByRoomId
	 *
	 */
	public Room findRoomByRoomId(Integer roomId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsSmoking
	 *
	 */
	public Set<Room> findRoomByIsSmoking(String isSmoking) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsSmoking
	 *
	 */
	public Set<Room> findRoomByIsSmoking(String isSmoking, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRooms
	 *
	 */
	public Set<Room> findAllRooms() throws DataAccessException;

	/**
	 * JPQL Query - findAllRooms
	 *
	 */
	public Set<Room> findAllRooms(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsCompositeContaining
	 *
	 */
	public Set<Room> findRoomByIsCompositeContaining(String isComposite) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsCompositeContaining
	 *
	 */
	public Set<Room> findRoomByIsCompositeContaining(String isComposite, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByFloorNumber
	 *
	 */
	public Set<Room> findRoomByFloorNumber(String floorNumber) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByFloorNumber
	 *
	 */
	public Set<Room> findRoomByFloorNumber(String floorNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsSmokingContaining
	 *
	 */
	public Set<Room> findRoomByIsSmokingContaining(String isSmoking_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsSmokingContaining
	 *
	 */
	public Set<Room> findRoomByIsSmokingContaining(String isSmoking_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByRoomCategoryContaining
	 *
	 */
	public Set<Room> findRoomByRoomCategoryContaining(String roomCategory) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByRoomCategoryContaining
	 *
	 */
	public Set<Room> findRoomByRoomCategoryContaining(String roomCategory, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByRoomCategory
	 *
	 */
	public Set<Room> findRoomByRoomCategory(String roomCategory_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByRoomCategory
	 *
	 */
	public Set<Room> findRoomByRoomCategory(String roomCategory_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByPrimaryKey
	 *
	 */
	public Room findRoomByPrimaryKey(Integer roomId_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByPrimaryKey
	 *
	 */
	public Room findRoomByPrimaryKey(Integer roomId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsComposite
	 *
	 */
	public Set<Room> findRoomByIsComposite(String isComposite_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByIsComposite
	 *
	 */
	public Set<Room> findRoomByIsComposite(String isComposite_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByFloorNumberContaining
	 *
	 */
	public Set<Room> findRoomByFloorNumberContaining(String floorNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomByFloorNumberContaining
	 *
	 */
	public Set<Room> findRoomByFloorNumberContaining(String floorNumber_1, int startResult, int maxRows) throws DataAccessException;

}