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
	 */
	public Transactions findTransactionsByPrimaryKey(String transactionId);

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	public Transactions saveTransactionsReservation(String transactionId_1, Reservation related_reservation);

	/**
	 * Return all Transactions entity
	 * 
	 */
	public List<Transactions> findAllTransactionss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Transactions entity
	 * 
	 */
	public Integer countTransactionss();

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	public Transactions deleteTransactionsReservation(String transactions_transactionId, String related_reservation_reservationId);

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	public void saveTransactions(Transactions transactions_1);
}