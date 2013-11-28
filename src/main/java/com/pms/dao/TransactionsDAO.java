package com.pms.dao;

import com.pms.domain.Transactions;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Transactions entities.
 * 
 */
public interface TransactionsDAO extends JpaDao<Transactions> {

	/**
	 * JPQL Query - findTransactionsByReferenceNumberContaining
	 *
	 */
	public Set<Transactions> findTransactionsByReferenceNumberContaining(String referenceNumber) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByReferenceNumberContaining
	 *
	 */
	public Set<Transactions> findTransactionsByReferenceNumberContaining(String referenceNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByTransactionDate
	 *
	 */
	public Set<Transactions> findTransactionsByTransactionDate(java.util.Calendar transactionDate) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByTransactionDate
	 *
	 */
	public Set<Transactions> findTransactionsByTransactionDate(Calendar transactionDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByReferenceNumber
	 *
	 */
	public Set<Transactions> findTransactionsByReferenceNumber(String referenceNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByReferenceNumber
	 *
	 */
	public Set<Transactions> findTransactionsByReferenceNumber(String referenceNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByDescription
	 *
	 */
	public Set<Transactions> findTransactionsByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByDescription
	 *
	 */
	public Set<Transactions> findTransactionsByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByCharges
	 *
	 */
	public Set<Transactions> findTransactionsByCharges(Integer charges) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByCharges
	 *
	 */
	public Set<Transactions> findTransactionsByCharges(Integer charges, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByPrimaryKey
	 *
	 */
	public Transactions findTransactionsByPrimaryKey(Integer transactionId) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByPrimaryKey
	 *
	 */
	public Transactions findTransactionsByPrimaryKey(Integer transactionId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByTransactionId
	 *
	 */
	public Transactions findTransactionsByTransactionId(Integer transactionId_1) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByTransactionId
	 *
	 */
	public Transactions findTransactionsByTransactionId(Integer transactionId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByDescriptionContaining
	 *
	 */
	public Set<Transactions> findTransactionsByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findTransactionsByDescriptionContaining
	 *
	 */
	public Set<Transactions> findTransactionsByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTransactionss
	 *
	 */
	public Set<Transactions> findAllTransactionss() throws DataAccessException;

	/**
	 * JPQL Query - findAllTransactionss
	 *
	 */
	public Set<Transactions> findAllTransactionss(int startResult, int maxRows) throws DataAccessException;

}