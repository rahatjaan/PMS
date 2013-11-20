package com.pms.service;

import com.pms.dao.ReservationDAO;
import com.pms.dao.TransactionsDAO;

import com.pms.domain.Reservation;
import com.pms.domain.Transactions;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Transactions entities
 * 
 */

@Service("TransactionsService")
@Transactional
public class TransactionsServiceImpl implements TransactionsService {

	/**
	 * DAO injected by Spring that manages Reservation entities
	 * 
	 */
	@Autowired
	private ReservationDAO reservationDAO;

	/**
	 * DAO injected by Spring that manages Transactions entities
	 * 
	 */
	@Autowired
	private TransactionsDAO transactionsDAO;

	/**
	 * Instantiates a new TransactionsServiceImpl.
	 *
	 */
	public TransactionsServiceImpl() {
	}

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	@Transactional
	public void deleteTransactions(Transactions transactions) {
		transactionsDAO.remove(transactions);
		transactionsDAO.flush();
	}

	/**
	 * Load an existing Transactions entity
	 * 
	 */
	@Transactional
	public Set<Transactions> loadTransactionss() {
		return transactionsDAO.findAllTransactionss();
	}

	/**
	 */
	@Transactional
	public Transactions findTransactionsByPrimaryKey(String transactionId) {
		return transactionsDAO.findTransactionsByPrimaryKey(transactionId);
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@Transactional
	public Transactions saveTransactionsReservation(String transactionId, Reservation related_reservation) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(transactionId, -1, -1);
		Reservation existingreservation = reservationDAO.findReservationByPrimaryKey(related_reservation.getReservationId());

		// copy into the existing record to preserve existing relationships
		if (existingreservation != null) {
			existingreservation.setReservationId(related_reservation.getReservationId());
			existingreservation.setArrivalDate(related_reservation.getArrivalDate());
			existingreservation.setNumberOfDays(related_reservation.getNumberOfDays());
			existingreservation.setDepartureDate(related_reservation.getDepartureDate());
			existingreservation.setCardType(related_reservation.getCardType());
			existingreservation.setCardNumber(related_reservation.getCardNumber());
			existingreservation.setCvvNumber(related_reservation.getCvvNumber());
			existingreservation.setFolioNumber(related_reservation.getFolioNumber());
			existingreservation.setCurrencyCode(related_reservation.getCurrencyCode());
			existingreservation.setCardExpiryDate(related_reservation.getCardExpiryDate());
			existingreservation.setNumberOfChildren(related_reservation.getNumberOfChildren());
			existingreservation.setNumberOfAdults(related_reservation.getNumberOfAdults());
			existingreservation.setIsCheckedOut(related_reservation.getIsCheckedOut());
			related_reservation = existingreservation;
		} else {
			related_reservation = reservationDAO.store(related_reservation);
			reservationDAO.flush();
		}

		transactions.setReservation(related_reservation);
		related_reservation.getTransactionses().add(transactions);
		transactions = transactionsDAO.store(transactions);
		transactionsDAO.flush();

		related_reservation = reservationDAO.store(related_reservation);
		reservationDAO.flush();

		return transactions;
	}

	/**
	 * Return all Transactions entity
	 * 
	 */
	@Transactional
	public List<Transactions> findAllTransactionss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Transactions>(transactionsDAO.findAllTransactionss(startResult, maxRows));
	}

	/**
	 * Return a count of all Transactions entity
	 * 
	 */
	@Transactional
	public Integer countTransactionss() {
		return ((Long) transactionsDAO.createQuerySingleResult("select count(o) from Transactions o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@Transactional
	public Transactions deleteTransactionsReservation(String transactions_transactionId, String related_reservation_reservationId) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(transactions_transactionId, -1, -1);
		Reservation related_reservation = reservationDAO.findReservationByPrimaryKey(related_reservation_reservationId, -1, -1);

		transactions.setReservation(null);
		related_reservation.getTransactionses().remove(transactions);
		transactions = transactionsDAO.store(transactions);
		transactionsDAO.flush();

		related_reservation = reservationDAO.store(related_reservation);
		reservationDAO.flush();

		reservationDAO.remove(related_reservation);
		reservationDAO.flush();

		return transactions;
	}

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	@Transactional
	public void saveTransactions(Transactions transactions) {
		Transactions existingTransactions = transactionsDAO.findTransactionsByPrimaryKey(transactions.getTransactionId());

		if (existingTransactions != null) {
			if (existingTransactions != transactions) {
				existingTransactions.setTransactionId(transactions.getTransactionId());
				existingTransactions.setTransactionDate(transactions.getTransactionDate());
				existingTransactions.setReferenceNumber(transactions.getReferenceNumber());
				existingTransactions.setCharges(transactions.getCharges());
				existingTransactions.setDescription(transactions.getDescription());
			}
			transactions = transactionsDAO.store(existingTransactions);
		} else {
			transactions = transactionsDAO.store(transactions);
		}
		transactionsDAO.flush();
	}
}
