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
 * Unit test for the <code>ReservationController</code> controller.
 *
 * @see com.pms.web.ReservationController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class ReservationControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReservationGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReservationGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReservationGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReservationRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReservationRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReservationRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReservationTransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReservationTransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReservationTransactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>reservationControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetreservationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/reservationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationController controller = (ReservationController) context.getBean("ReservationController");

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