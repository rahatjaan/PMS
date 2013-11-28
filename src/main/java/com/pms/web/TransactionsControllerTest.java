package com.pms.web;

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
 * Unit test for the <code>TransactionsController</code> controller.
 *
 * @see com.pms.web.TransactionsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class TransactionsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTransactionsReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTransactionsReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTransactionsReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTransactions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTransactions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTransactions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>transactionsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettransactionsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/transactionsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TransactionsController controller = (TransactionsController) context.getBean("TransactionsController");

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