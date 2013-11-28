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
	 * JPQL Query - findRoomviewByRoomViewId
	 *
	 */
	public Roomview findRoomviewByRoomViewId(Integer roomViewId) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewId
	 *
	 */
	public Roomview findRoomviewByRoomViewId(Integer roomViewId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewCode
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCode(String roomViewCode) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewCode
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCode(String roomViewCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescription
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescription(String roomViewDescription) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescription
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescription(String roomViewDescription, int startResult, int maxRows) throws DataAccessException;

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
	 * JPQL Query - findRoomviewByRoomViewCodeContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCodeContaining(String roomViewCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewCodeContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewCodeContaining(String roomViewCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescriptionContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescriptionContaining(String roomViewDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByRoomViewDescriptionContaining
	 *
	 */
	public Set<Roomview> findRoomviewByRoomViewDescriptionContaining(String roomViewDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByPrimaryKey
	 *
	 */
	public Roomview findRoomviewByPrimaryKey(Integer roomViewId_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomviewByPrimaryKey
	 *
	 */
	public Roomview findRoomviewByPrimaryKey(Integer roomViewId_1, int startResult, int maxRows) throws DataAccessException;

}