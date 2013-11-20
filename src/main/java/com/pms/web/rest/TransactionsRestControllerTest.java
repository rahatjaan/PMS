package com.pms.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>TransactionsRestController</code> controller.
 *
 * @see com.pms.web.rest.TransactionsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class TransactionsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Transactionstransactions_transactionIdreservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTransactionstransactions_transactionIdreservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}/reservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactionstransactions_transactionIdreservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostTransactionstransactions_transactionIdreservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}/reservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactionstransactions_transactionIdreservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutTransactionstransactions_transactionIdreservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}/reservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactionstransactions_transactionIdreservationreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteTransactionstransactions_transactionIdreservationreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}/reservation/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactionstransactions_transactionIdreservationreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTransactionstransactions_transactionIdreservationreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}/reservation/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactionstransactions_transactionId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTransactionstransactions_transactionId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Transactionstransactions_transactionId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteTransactionstransactions_transactionId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Transactions/{transactions_transactionId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsRestController controller = (TransactionsRestController) context.getBean("TransactionsRestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}