package com.pms.service;

import com.pms.domain.Guest;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
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
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
@Transactional
public class ReservationServiceTest {

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
	protected ReservationService service;

	/**
	 * Instantiates a new ReservationServiceTest.
	 *
	 */
	public ReservationServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Transactions entity
	 * 
	 */
	@Test
	public void deleteReservationTransactionses() {
		// TODO: JUnit - Populate test inputs for operation: deleteReservationTransactionses 
		String reservation_reservationId = null;
		String related_transactionses_transactionId = null;
		Reservation response = null;
		response = service.deleteReservationTransactionses(reservation_reservationId, related_transactionses_transactionId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReservationTransactionses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Transactions entity
	 * 
	 */
	@Test
	public void saveReservationTransactionses() {
		// TODO: JUnit - Populate test inputs for operation: saveReservationTransactionses 
		String reservationId = null;
		Transactions related_transactionses = new com.pms.domain.Transactions();
		Reservation response = null;
		response = service.saveReservationTransactionses(reservationId, related_transactionses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReservationTransactionses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Reservation entity
	 * 
	 */
	@Test
	public void countReservations() {
		Integer response = null;
		response = service.countReservations();
		// TODO: JUnit - Add assertions to test outputs of operation: countReservations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Room entity
	 * 
	 */
	@Test
	public void deleteReservationRoom() {
		// TODO: JUnit - Populate test inputs for operation: deleteReservationRoom 
		String reservation_reservationId_1 = null;
		String related_room_roomId = null;
		Reservation response = null;
		response = service.deleteReservationRoom(reservation_reservationId_1, related_room_roomId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReservationRoom
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Guest entity
	 * 
	 */
	@Test
	public void deleteReservationGuest() {
		// TODO: JUnit - Populate test inputs for operation: deleteReservationGuest 
		String reservation_reservationId_2 = null;
		String related_guest_guestId = null;
		Reservation response = null;
		response = service.deleteReservationGuest(reservation_reservationId_2, related_guest_guestId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReservationGuest
	}

	/**
	 * Operation Unit Test
	 * Load an existing Reservation entity
	 * 
	 */
	@Test
	public void loadReservations() {
		Set<Reservation> response = null;
		response = service.loadReservations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadReservations
	}

	/**
	 * Operation Unit Test
	 * Return all Reservation entity
	 * 
	 */
	@Test
	public void findAllReservations() {
		// TODO: JUnit - Populate test inputs for operation: findAllReservations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Reservation> response = null;
		response = service.findAllReservations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllReservations
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findReservationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findReservationByPrimaryKey 
		String reservationId_1 = null;
		Reservation response = null;
		response = service.findReservationByPrimaryKey(reservationId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findReservationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Reservation entity
	 * 
	 */
	@Test
	public void deleteReservation() {
		// TODO: JUnit - Populate test inputs for operation: deleteReservation 
		Reservation reservation = new com.pms.domain.Reservation();
		service.deleteReservation(reservation);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Room entity
	 * 
	 */
	@Test
	public void saveReservationRoom() {
		// TODO: JUnit - Populate test inputs for operation: saveReservationRoom 
		String reservationId_2 = null;
		Room related_room = new com.pms.domain.Room();
		Reservation response = null;
		response = service.saveReservationRoom(reservationId_2, related_room);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReservationRoom
	}

	/**
	 * Operation Unit Test
	 * Save an existing Reservation entity
	 * 
	 */
	@Test
	public void saveReservation() {
		// TODO: JUnit - Populate test inputs for operation: saveReservation 
		Reservation reservation_1 = new com.pms.domain.Reservation();
		service.saveReservation(reservation_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Guest entity
	 * 
	 */
	@Test
	public void saveReservationGuest() {
		// TODO: JUnit - Populate test inputs for operation: saveReservationGuest 
		String reservationId_3 = null;
		Guest related_guest = new com.pms.domain.Guest();
		Reservation response = null;
		response = service.saveReservationGuest(reservationId_3, related_guest);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReservationGuest
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
