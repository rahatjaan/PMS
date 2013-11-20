package com.pms.dao;

import com.pms.domain.Room;

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
 * DAO to manage Room entities.
 * 
 */
@Repository("RoomDAO")
@Transactional
public class RoomDAOImpl extends AbstractJpaDao<Room> implements RoomDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Room.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoomDAOImpl
	 *
	 */
	public RoomDAOImpl() {
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
	 * JPQL Query - findRoomByPrimaryKey
	 *
	 */
	@Transactional
	public Room findRoomByPrimaryKey(String roomId) throws DataAccessException {

		return findRoomByPrimaryKey(roomId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByPrimaryKey
	 *
	 */

	@Transactional
	public Room findRoomByPrimaryKey(String roomId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoomByPrimaryKey", startResult, maxRows, roomId);
			return (com.pms.domain.Room) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoomByRoomId
	 *
	 */
	@Transactional
	public Room findRoomByRoomId(String roomId) throws DataAccessException {

		return findRoomByRoomId(roomId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByRoomId
	 *
	 */

	@Transactional
	public Room findRoomByRoomId(String roomId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoomByRoomId", startResult, maxRows, roomId);
			return (com.pms.domain.Room) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoomByRoomCategoryContaining
	 *
	 */
	@Transactional
	public Set<Room> findRoomByRoomCategoryContaining(String roomCategory) throws DataAccessException {

		return findRoomByRoomCategoryContaining(roomCategory, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByRoomCategoryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByRoomCategoryContaining(String roomCategory, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByRoomCategoryContaining", startResult, maxRows, roomCategory);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByFloorNumberContaining
	 *
	 */
	@Transactional
	public Set<Room> findRoomByFloorNumberContaining(String floorNumber) throws DataAccessException {

		return findRoomByFloorNumberContaining(floorNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByFloorNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByFloorNumberContaining(String floorNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByFloorNumberContaining", startResult, maxRows, floorNumber);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByIsComposite
	 *
	 */
	@Transactional
	public Set<Room> findRoomByIsComposite(String isComposite) throws DataAccessException {

		return findRoomByIsComposite(isComposite, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByIsComposite
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByIsComposite(String isComposite, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByIsComposite", startResult, maxRows, isComposite);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByFloorNumber
	 *
	 */
	@Transactional
	public Set<Room> findRoomByFloorNumber(String floorNumber) throws DataAccessException {

		return findRoomByFloorNumber(floorNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByFloorNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByFloorNumber(String floorNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByFloorNumber", startResult, maxRows, floorNumber);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByIsSmoking
	 *
	 */
	@Transactional
	public Set<Room> findRoomByIsSmoking(String isSmoking) throws DataAccessException {

		return findRoomByIsSmoking(isSmoking, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByIsSmoking
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByIsSmoking(String isSmoking, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByIsSmoking", startResult, maxRows, isSmoking);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRooms
	 *
	 */
	@Transactional
	public Set<Room> findAllRooms() throws DataAccessException {

		return findAllRooms(-1, -1);
	}

	/**
	 * JPQL Query - findAllRooms
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findAllRooms(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRooms", startResult, maxRows);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByIsCompositeContaining
	 *
	 */
	@Transactional
	public Set<Room> findRoomByIsCompositeContaining(String isComposite) throws DataAccessException {

		return findRoomByIsCompositeContaining(isComposite, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByIsCompositeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByIsCompositeContaining(String isComposite, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByIsCompositeContaining", startResult, maxRows, isComposite);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByIsSmokingContaining
	 *
	 */
	@Transactional
	public Set<Room> findRoomByIsSmokingContaining(String isSmoking) throws DataAccessException {

		return findRoomByIsSmokingContaining(isSmoking, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByIsSmokingContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByIsSmokingContaining(String isSmoking, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByIsSmokingContaining", startResult, maxRows, isSmoking);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByRoomCategory
	 *
	 */
	@Transactional
	public Set<Room> findRoomByRoomCategory(String roomCategory) throws DataAccessException {

		return findRoomByRoomCategory(roomCategory, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByRoomCategory
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByRoomCategory(String roomCategory, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByRoomCategory", startResult, maxRows, roomCategory);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomByRoomIdContaining
	 *
	 */
	@Transactional
	public Set<Room> findRoomByRoomIdContaining(String roomId) throws DataAccessException {

		return findRoomByRoomIdContaining(roomId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomByRoomIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Room> findRoomByRoomIdContaining(String roomId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomByRoomIdContaining", startResult, maxRows, roomId);
		return new LinkedHashSet<Room>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Room entity) {
		return true;
	}
}
