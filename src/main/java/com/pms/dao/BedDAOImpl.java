package com.pms.dao;

import com.pms.domain.Bed;

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
 * DAO to manage Bed entities.
 * 
 */
@Repository("BedDAO")
@Transactional
public class BedDAOImpl extends AbstractJpaDao<Bed> implements BedDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Bed.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BedDAOImpl
	 *
	 */
	public BedDAOImpl() {
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
	 * JPQL Query - findBedByBedTypeCodeContaining
	 *
	 */
	@Transactional
	public Set<Bed> findBedByBedTypeCodeContaining(String bedTypeCode) throws DataAccessException {

		return findBedByBedTypeCodeContaining(bedTypeCode, -1, -1);
	}

	/**
	 * JPQL Query - findBedByBedTypeCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bed> findBedByBedTypeCodeContaining(String bedTypeCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBedByBedTypeCodeContaining", startResult, maxRows, bedTypeCode);
		return new LinkedHashSet<Bed>(query.getResultList());
	}

	/**
	 * JPQL Query - findBedByPrimaryKey
	 *
	 */
	@Transactional
	public Bed findBedByPrimaryKey(Integer bedId) throws DataAccessException {

		return findBedByPrimaryKey(bedId, -1, -1);
	}

	/**
	 * JPQL Query - findBedByPrimaryKey
	 *
	 */

	@Transactional
	public Bed findBedByPrimaryKey(Integer bedId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBedByPrimaryKey", startResult, maxRows, bedId);
			return (com.pms.domain.Bed) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBedByBedTypeCode
	 *
	 */
	@Transactional
	public Set<Bed> findBedByBedTypeCode(String bedTypeCode) throws DataAccessException {

		return findBedByBedTypeCode(bedTypeCode, -1, -1);
	}

	/**
	 * JPQL Query - findBedByBedTypeCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bed> findBedByBedTypeCode(String bedTypeCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBedByBedTypeCode", startResult, maxRows, bedTypeCode);
		return new LinkedHashSet<Bed>(query.getResultList());
	}

	/**
	 * JPQL Query - findBedByBedTypeDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Bed> findBedByBedTypeDescriptionContaining(String bedTypeDescription) throws DataAccessException {

		return findBedByBedTypeDescriptionContaining(bedTypeDescription, -1, -1);
	}

	/**
	 * JPQL Query - findBedByBedTypeDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bed> findBedByBedTypeDescriptionContaining(String bedTypeDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBedByBedTypeDescriptionContaining", startResult, maxRows, bedTypeDescription);
		return new LinkedHashSet<Bed>(query.getResultList());
	}

	/**
	 * JPQL Query - findBedByBedId
	 *
	 */
	@Transactional
	public Bed findBedByBedId(Integer bedId) throws DataAccessException {

		return findBedByBedId(bedId, -1, -1);
	}

	/**
	 * JPQL Query - findBedByBedId
	 *
	 */

	@Transactional
	public Bed findBedByBedId(Integer bedId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBedByBedId", startResult, maxRows, bedId);
			return (com.pms.domain.Bed) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllBeds
	 *
	 */
	@Transactional
	public Set<Bed> findAllBeds() throws DataAccessException {

		return findAllBeds(-1, -1);
	}

	/**
	 * JPQL Query - findAllBeds
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bed> findAllBeds(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBeds", startResult, maxRows);
		return new LinkedHashSet<Bed>(query.getResultList());
	}

	/**
	 * JPQL Query - findBedByBedTypeDescription
	 *
	 */
	@Transactional
	public Set<Bed> findBedByBedTypeDescription(String bedTypeDescription) throws DataAccessException {

		return findBedByBedTypeDescription(bedTypeDescription, -1, -1);
	}

	/**
	 * JPQL Query - findBedByBedTypeDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bed> findBedByBedTypeDescription(String bedTypeDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBedByBedTypeDescription", startResult, maxRows, bedTypeDescription);
		return new LinkedHashSet<Bed>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Bed entity) {
		return true;
	}
}
