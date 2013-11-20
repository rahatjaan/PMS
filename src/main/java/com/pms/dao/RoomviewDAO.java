package com.pms.dao;

import com.pms.domain.Roomview;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Roomview entities.
 * 
 */
public interface RoomviewDAO extends JpaDao<Roomview> {

	/**
	 * JPQL Query - findRoomviewByRoomViewCodeContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCodeContaining(String roomViewCode) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewCodeContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCodeContaining(String roomViewCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescriptionContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescriptionContaining(String roomViewDescription) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescriptionContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescriptionContaining(String roomViewDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewCode
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCode(String roomViewCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewCode
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCode(String roomViewCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoomviews
	 *
	 */
	public Set<Roomview> findAllRoomviews() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoomviews
	 *
	 */
	public Set<Roomview> findAllRoomviews(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByPrimaryKey
	 *
	 */
	public Roomview findRoomviewByPrimaryKey(String roomViewId) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByPrimaryKey
	 *
	 */
	public Roomview findRoomviewByPrimaryKey(String roomViewId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescription
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescription(String roomViewDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescription
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescription(String roomViewDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewId
	 *
	 */
	public Roomview findRoomviewByRoomViewId(String roomViewId_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewId
	 *
	 */
	public Roomview findRoomviewByRoomViewId(String roomViewId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewIdContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewIdContaining(String roomViewId_2) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewIdContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewIdContaining(String roomViewId_2, int startResult, int maxRows) throws DataAccessException;

}