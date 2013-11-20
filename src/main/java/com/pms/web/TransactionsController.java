package com.pms.web;

import com.pms.dao.ReservationDAO;
import com.pms.dao.TransactionsDAO;

import com.pms.domain.Reservation;
import com.pms.domain.Transactions;

import com.pms.service.TransactionsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Transactions entities
 * 
 */

@Controller("TransactionsController")
public class TransactionsController {

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
	 * Create a new Reservation entity
	 * 
	 */
	@RequestMapping("/newTransactionsReservation")
	public ModelAndView newTransactionsReservation(@RequestParam String transactions_transactionId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("transactions_transactionId", transactions_transactionId);
		mav.addObject("reservation", new Reservation());
		mav.addObject("newFlag", true);
		mav.setViewName("transactions/reservation/editReservation.jsp");

		return mav;
	}

	/**
	 * Delete an existing Transactions entity
	 * 
	 */
	@RequestMapping("/deleteTransactions")
	public String deleteTransactions(@RequestParam String transactionIdKey) {
		Transactions transactions = transactionsDAO.findTransactionsByPrimaryKey(transactionIdKey);
		transactionsService.deleteTransactions(transactions);
		return "forward:/indexTransactions";
	}

	/**
	 * View an existing Reservation entity
	 * 
	 */
	@RequestMapping("/selectTransactionsReservation")
	public ModelAndView selectTransactionsReservation(@RequestParam String transactions_transactionId, @RequestParam String reservation_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservation_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("transactions_transactionId", transactions_transactionId);
		mav.addObject("reservation", reservation);
		mav.setViewName("transactions/reservation/viewReservation.jsp");

		return mav;
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
	 * Entry point to show all Transactions entities
	 * 
	 */
	public String indexTransactions() {
		return "redirect:/indexTransactions";
	}

	/**
	 * Create a new Transactions entity
	 * 
	 */
	@RequestMapping("/newTransactions")
	public ModelAndView newTransactions() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactions", new Transactions());
		mav.addObject("newFlag", true);
		mav.setViewName("transactions/editTransactions.jsp");

		return mav;
	}

	/**
	 * Select the Transactions entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTransactions")
	public ModelAndView confirmDeleteTransactions(@RequestParam String transactionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactions", transactionsDAO.findTransactionsByPrimaryKey(transactionIdKey));
		mav.setViewName("transactions/deleteTransactions.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/transactionsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Transactions entity
	 * 
	 */
	@RequestMapping("/selectTransactions")
	public ModelAndView selectTransactions(@RequestParam String transactionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactions", transactionsDAO.findTransactionsByPrimaryKey(transactionIdKey));
		mav.setViewName("transactions/viewTransactions.jsp");

		return mav;
	}

	/**
	 * Edit an existing Reservation entity
	 * 
	 */
	@RequestMapping("/editTransactionsReservation")
	public ModelAndView editTransactionsReservation(@RequestParam String transactions_transactionId, @RequestParam String reservation_reservationId) {
		Reservation reservation = reservationDAO.findReservationByPrimaryKey(reservation_reservationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("transactions_transactionId", transactions_transactionId);
		mav.addObject("reservation", reservation);
		mav.setViewName("transactions/reservation/editReservation.jsp");

		return mav;
	}

	/**
	 * Save an existing Transactions entity
	 * 
	 */
	@RequestMapping("/saveTransactions")
	public String saveTransactions(@ModelAttribute Transactions transactions) {
		transactionsService.saveTransactions(transactions);
		return "forward:/indexTransactions";
	}

	/**
	 * Delete an existing Reservation entity
	 * 
	 */
	@RequestMapping("/deleteTransactionsReservation")
	public ModelAndView deleteTransactionsReservation(@RequestParam String transactions_transactionId, @RequestParam String related_reservation_reservationId) {
		ModelAndView mav = new ModelAndView();

		Transactions transactions = transactionsService.deleteTransactionsReservation(transactions_transactionId, related_reservation_reservationId);

		mav.addObject("transactions_transactionId", transactions_transactionId);
		mav.addObject("transactions", transactions);
		mav.setViewName("transactions/viewTransactions.jsp");

		return mav;
	}

	/**
	 * Edit an existing Transactions entity
	 * 
	 */
	@RequestMapping("/editTransactions")
	public ModelAndView editTransactions(@RequestParam String transactionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactions", transactionsDAO.findTransactionsByPrimaryKey(transactionIdKey));
		mav.setViewName("transactions/editTransactions.jsp");

		return mav;
	}

	/**
	 * Save an existing Reservation entity
	 * 
	 */
	@RequestMapping("/saveTransactionsReservation")
	public ModelAndView saveTransactionsReservation(@RequestParam String transactions_transactionId, @ModelAttribute Reservation reservation) {
		Transactions parent_transactions = transactionsService.saveTransactionsReservation(transactions_transactionId, reservation);

		ModelAndView mav = new ModelAndView();
		mav.addObject("transactions_transactionId", transactions_transactionId);
		mav.addObject("transactions", parent_transactions);
		mav.setViewName("transactions/viewTransactions.jsp");

		return mav;
	}

	/**
	 * Show all Transactions entities
	 * 
	 */
	@RequestMapping("/indexTransactions")
	public ModelAndView listTransactionss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactionss", transactionsService.loadTransactionss());

		mav.setViewName("transactions/listTransactionss.jsp");

		return mav;
	}

	/**
	 * Select the child Reservation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTransactionsReservation")
	public ModelAndView confirmDeleteTransactionsReservation(@RequestParam String transactions_transactionId, @RequestParam String related_reservation_reservationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("reservation", reservationDAO.findReservationByPrimaryKey(related_reservation_reservationId));
		mav.addObject("transactions_transactionId", transactions_transactionId);
		mav.setViewName("transactions/reservation/deleteReservation.jsp");

		return mav;
	}

	/**
	 * Show all Reservation entities by Transactions
	 * 
	 */
	@RequestMapping("/listTransactionsReservation")
	public ModelAndView listTransactionsReservation(@RequestParam String transactionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("transactions", transactionsDAO.findTransactionsByPrimaryKey(transactionIdKey));
		mav.setViewName("transactions/reservation/listReservation.jsp");

		return mav;
	}
}