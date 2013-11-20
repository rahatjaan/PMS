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
 * Unit test for the <code>ReservationRestController</code> controller.
 *
 * @see com.pms.web.rest.ReservationRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class ReservationRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Reservationreservation_reservationIdguest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationIdguest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/guest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdguest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostReservationreservation_reservationIdguest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/guest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdguest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutReservationreservation_reservationIdguest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/guest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdguestguest_guestId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteReservationreservation_reservationIdguestguest_guestId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/guest/{guest_guestId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdguestguest_guestId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationIdguestguest_guestId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/guest/{guest_guestId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdroom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationIdroom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/room");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdroom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostReservationreservation_reservationIdroom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/room");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdroom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutReservationreservation_reservationIdroom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/room");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdroomroom_roomId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteReservationreservation_reservationIdroomroom_roomId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/room/{room_roomId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdroomroom_roomId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationIdroomroom_roomId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/room/{room_roomId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdtransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationIdtransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/transactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdtransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostReservationreservation_reservationIdtransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/transactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdtransactionses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutReservationreservation_reservationIdtransactionses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/transactionses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdtransactionsestransactions_transactionId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteReservationreservation_reservationIdtransactionsestransactions_transactionId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/transactionses/{transactions_transactionId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationIdtransactionsestransactions_transactionId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationIdtransactionsestransactions_transactionId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}/transactionses/{transactions_transactionId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetReservationreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostReservation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Reservationreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteReservationreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Reservation/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReservationRestController controller = (ReservationRestController) context.getBean("ReservationRestController");

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