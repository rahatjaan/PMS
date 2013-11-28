package com.pms.service;

import com.pms.domain.Reservation;
import com.pms.domain.Transactions;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Transactions entities
 * 
 */
public interface TransactionsService {

	/**
	 * Return a count of all Transactions entity
	 * 
	 */
	public Integer countTransactionss();

	/**
	 */
	public Transactions findTransactionsByPrimaryKey(Integer transactionId);

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	public void deleteTransactions(Transactions transactions);

	/**
	 * Load an existing Transactions entity
	 * 
	 */
	public Set<Transactions> loadTransactionss();

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public Transactions saveTransactionsReservation(Integer transactionId_1, Reservation related_reservation);

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public Transactions deleteTransactionsReservation(Integer transactions_transactionId, Integer related_reservation_reservationId);

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	public void saveTransactions(Transactions transactions_1);

	/**
	 * Return all Transactions entity
	 * 
	 */
	public List<Transactions> findAllTransactionss(Integer startResult, Integer maxRows);
}