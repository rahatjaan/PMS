package com.pms.dao;

import com.pms.domain.Members;

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
 * DAO to manage Members entities.
 * 
 */
@Repository("MembersDAO")
@Transactional
public class MembersDAOImpl extends AbstractJpaDao<Members> implements
		MembersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Members.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new MembersDAOImpl
	 *
	 */
	public MembersDAOImpl() {
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
	 * JPQL Query - findMembersByMemberIdContaining
	 *
	 */
	@Transactional
	public Set<Members> findMembersByMemberIdContaining(String memberId) throws DataAccessException {

		return findMembersByMemberIdContaining(memberId, -1, -1);
	}

	/**
	 * JPQL Query - findMembersByMemberIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Members> findMembersByMemberIdContaining(String memberId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMembersByMemberIdContaining", startResult, maxRows, memberId);
		return new LinkedHashSet<Members>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllMemberss
	 *
	 */
	@Transactional
	public Set<Members> findAllMemberss() throws DataAccessException {

		return findAllMemberss(-1, -1);
	}

	/**
	 * JPQL Query - findAllMemberss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Members> findAllMemberss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllMemberss", startResult, maxRows);
		return new LinkedHashSet<Members>(query.getResultList());
	}

	/**
	 * JPQL Query - findMembersByPrimaryKey
	 *
	 */
	@Transactional
	public Members findMembersByPrimaryKey(String memberId) throws DataAccessException {

		return findMembersByPrimaryKey(memberId, -1, -1);
	}

	/**
	 * JPQL Query - findMembersByPrimaryKey
	 *
	 */

	@Transactional
	public Members findMembersByPrimaryKey(String memberId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMembersByPrimaryKey", startResult, maxRows, memberId);
			return (com.pms.domain.Members) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findMembersByMembershipType
	 *
	 */
	@Transactional
	public Set<Members> findMembersByMembershipType(String membershipType) throws DataAccessException {

		return findMembersByMembershipType(membershipType, -1, -1);
	}

	/**
	 * JPQL Query - findMembersByMembershipType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Members> findMembersByMembershipType(String membershipType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMembersByMembershipType", startResult, maxRows, membershipType);
		return new LinkedHashSet<Members>(query.getResultList());
	}

	/**
	 * JPQL Query - findMembersByMemberId
	 *
	 */
	@Transactional
	public Members findMembersByMemberId(String memberId) throws DataAccessException {

		return findMembersByMemberId(memberId, -1, -1);
	}

	/**
	 * JPQL Query - findMembersByMemberId
	 *
	 */

	@Transactional
	public Members findMembersByMemberId(String memberId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMembersByMemberId", startResult, maxRows, memberId);
			return (com.pms.domain.Members) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findMembersByMembershipTypeContaining
	 *
	 */
	@Transactional
	public Set<Members> findMembersByMembershipTypeContaining(String membershipType) throws DataAccessException {

		return findMembersByMembershipTypeContaining(membershipType, -1, -1);
	}

	/**
	 * JPQL Query - findMembersByMembershipTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Members> findMembersByMembershipTypeContaining(String membershipType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMembersByMembershipTypeContaining", startResult, maxRows, membershipType);
		return new LinkedHashSet<Members>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Members entity) {
		return true;
	}
}
