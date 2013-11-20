package com.pms.dao;

import com.pms.domain.Roomview;

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
 * DAO to manage Roomview entities.
 * 
 */
@Repository("RoomviewDAO")
@Transactional
public class RoomviewDAOImpl extends AbstractJpaDao<Roomview> implements
		RoomviewDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Roomview.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoomviewDAOImpl
	 *
	 */
	public RoomviewDAOImpl() {
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
	 * JPQL Query - findRoomviewByRoomViewCodeContaining
	 *
	 */
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewCodeContaining(String roomViewCode) throws DataAccessException {

		return findRoomviewByRoomViewCodeContaining(roomViewCode, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewCodeContaining(String roomViewCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomviewByRoomViewCodeContaining", startResult, maxRows, roomViewCode);
		return new LinkedHashSet<Roomview>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewDescriptionContaining(String roomViewDescription) throws DataAccessException {

		return findRoomviewByRoomViewDescriptionContaining(roomViewDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewDescriptionContaining(String roomViewDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomviewByRoomViewDescriptionContaining", startResult, maxRows, roomViewDescription);
		return new LinkedHashSet<Roomview>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewCode
	 *
	 */
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewCode(String roomViewCode) throws DataAccessException {

		return findRoomviewByRoomViewCode(roomViewCode, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewCode(String roomViewCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomviewByRoomViewCode", startResult, maxRows, roomViewCode);
		return new LinkedHashSet<Roomview>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRoomviews
	 *
	 */
	@Transactional
	public Set<Roomview> findAllRoomviews() throws DataAccessException {

		return findAllRoomviews(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoomviews
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomview> findAllRoomviews(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoomviews", startResult, maxRows);
		return new LinkedHashSet<Roomview>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomviewByPrimaryKey
	 *
	 */
	@Transactional
	public Roomview findRoomviewByPrimaryKey(String roomViewId) throws DataAccessException {

		return findRoomviewByPrimaryKey(roomViewId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByPrimaryKey
	 *
	 */

	@Transactional
	public Roomview findRoomviewByPrimaryKey(String roomViewId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoomviewByPrimaryKey", startResult, maxRows, roomViewId);
			return (com.pms.domain.Roomview) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewDescription
	 *
	 */
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewDescription(String roomViewDescription) throws DataAccessException {

		return findRoomviewByRoomViewDescription(roomViewDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewDescription(String roomViewDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomviewByRoomViewDescription", startResult, maxRows, roomViewDescription);
		return new LinkedHashSet<Roomview>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewId
	 *
	 */
	@Transactional
	public Roomview findRoomviewByRoomViewId(String roomViewId) throws DataAccessException {

		return findRoomviewByRoomViewId(roomViewId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewId
	 *
	 */

	@Transactional
	public Roomview findRoomviewByRoomViewId(String roomViewId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoomviewByRoomViewId", startResult, maxRows, roomViewId);
			return (com.pms.domain.Roomview) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewIdContaining
	 *
	 */
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewIdContaining(String roomViewId) throws DataAccessException {

		return findRoomviewByRoomViewIdContaining(roomViewId, -1, -1);
	}

	/**
	 * JPQL Query - findRoomviewByRoomViewIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roomview> findRoomviewByRoomViewIdContaining(String roomViewId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoomviewByRoomViewIdContaining", startResult, maxRows, roomViewId);
		return new LinkedHashSet<Roomview>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Roomview entity) {
		return true;
	}
}
