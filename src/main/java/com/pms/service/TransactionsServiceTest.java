package com.pms.service;

import com.pms.domain.Reservation;
import com.pms.domain.Transactions;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
@Transactional
public class TransactionsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected TransactionsService service;

	/**
	 * Instantiates a new TransactionsServiceTest.
	 *
	 */
	public TransactionsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Transactions entity
	 * 
	 */
	@Test
	public void countTransactionss() {
		Integer response = null;
		response = service.countTransactionss();
		// TODO: JUnit - Add assertions to test outputs of operation: countTransactionss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTransactionsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTransactionsByPrimaryKey 
		Integer transactionId = 0;
		Transactions response = null;
		response = service.findTransactionsByPrimaryKey(transactionId);
		// TODO: JUnit - Add assertions to test outputs of operation: findTransactionsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Transactions entity
	 * 
	 */
	@Test
	public void deleteTransactions() {
		// TODO: JUnit - Populate test inputs for operation: deleteTransactions 
		Transactions transactions = new com.pms.domain.Transactions();
		service.deleteTransactions(transactions);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Transactions entity
	 * 
	 */
	@Test
	public void loadTransactionss() {
		Set<Transactions> response = null;
		response = service.loadTransactionss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTransactionss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Reservation entity
	 * 
	 */
	@Test
	public void saveTransactionsReservation() {
		// TODO: JUnit - Populate test inputs for operation: saveTransactionsReservation 
		Integer transactionId_1 = 0;
		Reservation related_reservation = new com.pms.domain.Reservation();
		Transactions response = null;
		response = service.saveTransactionsReservation(transactionId_1, related_reservation);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTransactionsReservation
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Reservation entity
	 * 
	 */
	@Test
	public void deleteTransactionsReservation() {
		// TODO: JUnit - Populate test inputs for operation: deleteTransactionsReservation 
		Integer transactions_transactionId = 0;
		Integer related_reservation_reservationId = 0;
		Transactions response = null;
		response = service.deleteTransactionsReservation(transactions_transactionId, related_reservation_reservationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTransactionsReservation
	}

	/**
	 * Operation Unit Test
	 * Save an existing Transactions entity
	 * 
	 */
	@Test
	public void saveTransactions() {
		// TODO: JUnit - Populate test inputs for operation: saveTransactions 
		Transactions transactions_1 = new com.pms.domain.Transactions();
		service.saveTransactions(transactions_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Transactions entity
	 * 
	 */
	@Test
	public void findAllTransactionss() {
		// TODO: JUnit - Populate test inputs for operation: findAllTransactionss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Transactions> response = null;
		response = service.findAllTransactionss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTransactionss
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
