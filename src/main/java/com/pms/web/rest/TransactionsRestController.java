package com.pms.web.rest;

import com.pms.dao.ReservationDAO;
import com.pms.dao.TransactionsDAO;

import com.pms.domain.Reservation;
import com.pms.domain.Transactions;

import com.pms.service.TransactionsService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Transactions entities
 * 
 */

@Controller("TransactionsRestController")
public class TransactionsRestController {

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
	 * Service injected by Spring that provides CRUD operations for Transactions entities
	 * 
	 */
	@Autowired
	private TransactionsService transactionsService;

	/**
	 * Select an existing Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}", method = RequestMethod.GET)
	@ResponseBody
	public Transactions loadTransactions(@PathVariable String transactions_transactionId) {
		return transactionsDAO.findTransactionsByPrimaryKey(transactions_transactionId);
	}

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Transactions", method = RequestMethod.PUT)
	@ResponseBody
	public Transactions saveTransactions(@RequestBody Transactions transactions) {
		transactionsService.saveTransactions(transactions);
		return transactionsDAO.findTransactionsByPrimaryKey(transactions.getTransactionId());
	}

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTransactions(@PathVariable String transactions_transactionId) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(transactions_transactionId);
		transactionsService.deleteTransactions(transactions);
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}/reservation", method = RequestMethod.PUT)
	@ResponseBody
	public Reservation saveTransactionsReservation(@PathVariable String transactions_transactionId, @RequestBody Reservation reservation) {
		transactionsService.saveTransactionsReservation(transactions_transactionId, reservation);
		return reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}/reservation/{reservation_reservationId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTransactionsReservation(@PathVariable String transactions_transactionId, @PathVariable String related_reservation_reservationId) {
		transactionsService.deleteTransactionsReservation(transactions_transactionId, related_reservation_reservationId);
	}

	/**
	 * Show all Transactions entities
	 * 
	 */
	@RequestMapping(value = "/Transactions", method = RequestMethod.GET)
	@ResponseBody
	public List<Transactions> listTransactionss() {
		return new java.util.ArrayList<Transactions>(transactionsService.loadTransactionss());
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}/reservation/{reservation_reservationId}", method = RequestMethod.GET)
	@ResponseBody
	public Reservation loadTransactionsReservation(@PathVariable String transactions_transactionId, @PathVariable String related_reservation_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(related_reservation_reservationId, -1, -1);

		return reservation;
	}

	/**
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}/reservation", method = RequestMethod.POST)
	@ResponseBody
	public Reservation newTransactionsReservation(@PathVariable String transactions_transactionId, @RequestBody Reservation reservation) {
		transactionsService.saveTransactionsReservation(transactions_transactionId, reservation);
		return reservationDAO.findReservationByPrimaryKey(reservation.getReservationId());
	}

	/**
	 * Get Reservation entity by Transactions
	 * 
	 */
	@RequestMapping(value = "/Transactions/{transactions_transactionId}/reservation", method = RequestMethod.GET)
	@ResponseBody
	public Reservation getTransactionsReservation(@PathVariable String transactions_transactionId) {
		return transactionsDAO.findTransactionsByPrimaryKey(transactions_transactionId).getReservation();
	}

	/**
	 * Create a new Transactions entity
	 * 
	 */
	@RequestMapping(value = "/Transactions", method = RequestMethod.POST)
	@ResponseBody
	public Transactions newTransactions(@RequestBody Transactions transactions) {
		transactionsService.saveTransactions(transactions);
		return transactionsDAO.findTransactionsByPrimaryKey(transactions.getTransactionId());
	}
}