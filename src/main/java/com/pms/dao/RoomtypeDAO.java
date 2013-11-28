package com.pms.dao;

import com.pms.domain.Roomtype;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Roomtype entities.
 * 
 */
public interface RoomtypeDAO extends JpaDao<Roomtype> {

	/**
	 * JPQL Query - findRoomtypeByRoomTypeId
	 *
	 */
	public Roomtype findRoomtypeByRoomTypeId(Integer roomTypeId) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeId
	 *
	 */
	public Roomtype findRoomtypeByRoomTypeId(Integer roomTypeId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomDescription
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomDescription(String roomDescription) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomDescription
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomDescription(String roomDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeFieldContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeFieldContaining(String roomTypeField) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeFieldContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeFieldContaining(String roomTypeField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCode
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeCode(String roomTypeCode) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCode
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeCode(String roomTypeCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByIsReserved
	 *
	 */
	public Set<Roomtype> findRoomtypeByIsReserved(String isReserved) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByIsReserved
	 *
	 */
	public Set<Roomtype> findRoomtypeByIsReserved(String isReserved, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomLocationContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomLocationContaining(String roomLocation) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomLocationContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomLocationContaining(String roomLocation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCodeContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeCodeContaining(String roomTypeCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCodeContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeCodeContaining(String roomTypeCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByPrimaryKey
	 *
	 */
	public Roomtype findRoomtypeByPrimaryKey(Integer roomTypeId_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByPrimaryKey
	 *
	 */
	public Roomtype findRoomtypeByPrimaryKey(Integer roomTypeId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByIsReservedContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByIsReservedContaining(String isReserved_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByIsReservedContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByIsReservedContaining(String isReserved_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomLocation
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomLocation(String roomLocation_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomLocation
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomLocation(String roomLocation_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescription
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeDescription(String roomTypeDescription) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescription
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeDescription(String roomTypeDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeField
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeField(String roomTypeField_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeField
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeField(String roomTypeField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoomtypes
	 *
	 */
	public Set<Roomtype> findAllRoomtypes() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoomtypes
	 *
	 */
	public Set<Roomtype> findAllRoomtypes(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomDescriptionContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomDescriptionContaining(String roomDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomDescriptionContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomDescriptionContaining(String roomDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescriptionContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeDescriptionContaining(String roomTypeDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescriptionContaining
	 *
	 */
	public Set<Roomtype> findRoomtypeByRoomTypeDescriptionContaining(String roomTypeDescription_1, int startResult, int maxRows) throws DataAccessException;

}