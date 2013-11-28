package com.pms.dao;

import com.pms.domain.Transactions;

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
 * DAO to manage Transactions entities.
 * 
 */
@Repository("TransactionsDAO")
@Transactional
public class TransactionsDAOImpl extends AbstractJpaDao<Transactions> implements
		TransactionsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Transactions.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TransactionsDAOImpl
	 *
	 */
	public TransactionsDAOImpl() {
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
	 * JPQL Query - findTransactionsByReferenceNumberContaining
	 *
	 */
	@Transactional
	public Set<Transactions> findTransactionsByReferenceNumberContaining(String referenceNumber) throws DataAccessException {

		return findTransactionsByReferenceNumberContaining(referenceNumber, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByReferenceNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findTransactionsByReferenceNumberContaining(String referenceNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTransactionsByReferenceNumberContaining", startResult, maxRows, referenceNumber);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findTransactionsByTransactionDate
	 *
	 */
	@Transactional
	public Set<Transactions> findTransactionsByTransactionDate(java.util.Calendar transactionDate) throws DataAccessException {

		return findTransactionsByTransactionDate(transactionDate, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByTransactionDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findTransactionsByTransactionDate(java.util.Calendar transactionDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTransactionsByTransactionDate", startResult, maxRows, transactionDate);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findTransactionsByReferenceNumber
	 *
	 */
	@Transactional
	public Set<Transactions> findTransactionsByReferenceNumber(String referenceNumber) throws DataAccessException {

		return findTransactionsByReferenceNumber(referenceNumber, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByReferenceNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findTransactionsByReferenceNumber(String referenceNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTransactionsByReferenceNumber", startResult, maxRows, referenceNumber);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findTransactionsByDescription
	 *
	 */
	@Transactional
	public Set<Transactions> findTransactionsByDescription(String description) throws DataAccessException {

		return findTransactionsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findTransactionsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTransactionsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findTransactionsByCharges
	 *
	 */
	@Transactional
	public Set<Transactions> findTransactionsByCharges(Integer charges) throws DataAccessException {

		return findTransactionsByCharges(charges, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByCharges
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findTransactionsByCharges(Integer charges, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTransactionsByCharges", startResult, maxRows, charges);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findTransactionsByPrimaryKey
	 *
	 */
	@Transactional
	public Transactions findTransactionsByPrimaryKey(Integer transactionId) throws DataAccessException {

		return findTransactionsByPrimaryKey(transactionId, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByPrimaryKey
	 *
	 */

	@Transactional
	public Transactions findTransactionsByPrimaryKey(Integer transactionId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTransactionsByPrimaryKey", startResult, maxRows, transactionId);
			return (com.pms.domain.Transactions) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTransactionsByTransactionId
	 *
	 */
	@Transactional
	public Transactions findTransactionsByTransactionId(Integer transactionId) throws DataAccessException {

		return findTransactionsByTransactionId(transactionId, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByTransactionId
	 *
	 */

	@Transactional
	public Transactions findTransactionsByTransactionId(Integer transactionId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTransactionsByTransactionId", startResult, maxRows, transactionId);
			return (com.pms.domain.Transactions) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTransactionsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Transactions> findTransactionsByDescriptionContaining(String description) throws DataAccessException {

		return findTransactionsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findTransactionsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findTransactionsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTransactionsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTransactionss
	 *
	 */
	@Transactional
	public Set<Transactions> findAllTransactionss() throws DataAccessException {

		return findAllTransactionss(-1, -1);
	}

	/**
	 * JPQL Query - findAllTransactionss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Transactions> findAllTransactionss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTransactionss", startResult, maxRows);
		return new LinkedHashSet<Transactions>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Transactions entity) {
		return true;
	}
}
