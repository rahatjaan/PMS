package com.pms.dao;

import com.pms.domain.Roomtype;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Roomtype entities.
 * 
 */
@Repository("RoomtypeDAO")
@Transactional
public class RoomtypeDAOImpl extends AbstractJpaDao<Roomtype> implements
		RoomtypeDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Roomtype.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoomtypeDAOImpl
	 *
	 */
	public RoomtypeDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findRoomtypeByPrimaryKey
	 *
	 */
	@Transactional
	public Roomtype findRoomtypeByPrimaryKey(String roomTypeId) throws DataAccessException {

		return findRoomtypeByPrimaryKey(roomTypeId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByPrimaryKey
	 *
	 */

	@Transactional
	public Roomtype findRoomtypeByPrimaryKey(String roomTypeId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoomtypeByPrimaryKey", startResult, maxRows, roomTypeId);
			return (com.pms.domain.Roomtype) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllRoomtypes
	 *
	 */
	@Transactional
	public Set<Roomtype> findAllRoomtypes() throws DataAccessException {

		return findAllRoomtypes(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoomtypes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findAllRoomtypes(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoomtypes", startResult, maxRows);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomDescription
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomDescription(String roomDescription) throws DataAccessException {

		return findRoomtypeByRoomDescription(roomDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomDescription(String roomDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomDescription", startResult, maxRows, roomDescription);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeId
	 *
	 */
	@Transactional
	public Roomtype findRoomtypeByRoomTypeId(String roomTypeId) throws DataAccessException {

		return findRoomtypeByRoomTypeId(roomTypeId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeId
	 *
	 */

	@Transactional
	public Roomtype findRoomtypeByRoomTypeId(String roomTypeId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoomtypeByRoomTypeId", startResult, maxRows, roomTypeId);
			return (com.pms.domain.Roomtype) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoomtypeByIsReserved
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByIsReserved(String isReserved) throws DataAccessException {

		return findRoomtypeByIsReserved(isReserved, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByIsReserved
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByIsReserved(String isReserved, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByIsReserved", startResult, maxRows, isReserved);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeDescriptionContaining(String roomTypeDescription) throws DataAccessException {

		return findRoomtypeByRoomTypeDescriptionContaining(roomTypeDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeDescriptionContaining(String roomTypeDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeDescriptionContaining", startResult, maxRows, roomTypeDescription);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomDescriptionContaining(String roomDescription) throws DataAccessException {

		return findRoomtypeByRoomDescriptionContaining(roomDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomDescriptionContaining(String roomDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomDescriptionContaining", startResult, maxRows, roomDescription);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeField
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeField(String roomTypeField) throws DataAccessException {

		return findRoomtypeByRoomTypeField(roomTypeField, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeField(String roomTypeField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeField", startResult, maxRows, roomTypeField);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeIdContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeIdContaining(String roomTypeId) throws DataAccessException {

		return findRoomtypeByRoomTypeIdContaining(roomTypeId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeIdContaining(String roomTypeId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeIdContaining", startResult, maxRows, roomTypeId);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeFieldContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeFieldContaining(String roomTypeField) throws DataAccessException {

		return findRoomtypeByRoomTypeFieldContaining(roomTypeField, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeFieldContaining(String roomTypeField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeFieldContaining", startResult, maxRows, roomTypeField);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomLocation
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomLocation(String roomLocation) throws DataAccessException {

		return findRoomtypeByRoomLocation(roomLocation, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomLocation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomLocation(String roomLocation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomLocation", startResult, maxRows, roomLocation);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCodeContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeCodeContaining(String roomTypeCode) throws DataAccessException {

		return findRoomtypeByRoomTypeCodeContaining(roomTypeCode, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeCodeContaining(String roomTypeCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeCodeContaining", startResult, maxRows, roomTypeCode);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomLocationContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomLocationContaining(String roomLocation) throws DataAccessException {

		return findRoomtypeByRoomLocationContaining(roomLocation, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomLocationContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomLocationContaining(String roomLocation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomLocationContaining", startResult, maxRows, roomLocation);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescription
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeDescription(String roomTypeDescription) throws DataAccessException {

		return findRoomtypeByRoomTypeDescription(roomTypeDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeDescription(String roomTypeDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeDescription", startResult, maxRows, roomTypeDescription);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByIsReservedContaining
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByIsReservedContaining(String isReserved) throws DataAccessException {

		return findRoomtypeByIsReservedContaining(isReserved, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByIsReservedContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByIsReservedContaining(String isReserved, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByIsReservedContaining", startResult, maxRows, isReserved);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCode
	 *
	 */
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeCode(String roomTypeCode) throws DataAccessException {

		return findRoomtypeByRoomTypeCode(roomTypeCode, -1, -1);
	}

	/**
	 * JPQL Query - findRoomtypeByRoomTypeCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomtype> findRoomtypeByRoomTypeCode(String roomTypeCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomtypeByRoomTypeCode", startResult, maxRows, roomTypeCode);
		return new LinkedHashSet<Roomtype>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Roomtype entity) {
		return true;
	}
}
