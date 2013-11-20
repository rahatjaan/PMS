package com.pms.dao;

import com.pms.domain.Bed;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Bed entities.
 * 
 */
public interface BedDAO extends JpaDao<Bed> {

	/**
	 * JPQL Query - findBedByBedTypeDescriptionContaining
	 *
	 */
	public Set<Bed> findBedByBedTypeDescriptionContaining(String bedTypeDescription) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeDescriptionContaining
	 *
	 */
	public Set<Bed> findBedByBedTypeDescriptionContaining(String bedTypeDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBeds
	 *
	 */
	public Set<Bed> findAllBeds() throws DataAccessException;

	/**
	 * JPQL Query - findAllBeds
	 *
	 */
	public Set<Bed> findAllBeds(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeCode
	 *
	 */
	public Set<Bed> findBedByBedTypeCode(String bedTypeCode) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeCode
	 *
	 */
	public Set<Bed> findBedByBedTypeCode(String bedTypeCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBedByPrimaryKey
	 *
	 */
	public Bed findBedByPrimaryKey(String bedId) throws DataAccessException;

	/**
	 * JPQL Query - findBedByPrimaryKey
	 *
	 */
	public Bed findBedByPrimaryKey(String bedId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedId
	 *
	 */
	public Bed findBedByBedId(String bedId_1) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedId
	 *
	 */
	public Bed findBedByBedId(String bedId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeDescription
	 *
	 */
	public Set<Bed> findBedByBedTypeDescription(String bedTypeDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeDescription
	 *
	 */
	public Set<Bed> findBedByBedTypeDescription(String bedTypeDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeCodeContaining
	 *
	 */
	public Set<Bed> findBedByBedTypeCodeContaining(String bedTypeCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedTypeCodeContaining
	 *
	 */
	public Set<Bed> findBedByBedTypeCodeContaining(String bedTypeCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedIdContaining
	 *
	 */
	public Set<Bed> findBedByBedIdContaining(String bedId_2) throws DataAccessException;

	/**
	 * JPQL Query - findBedByBedIdContaining
	 *
	 */
	public Set<Bed> findBedByBedIdContaining(String bedId_2, int startResult, int maxRows) throws DataAccessException;

}