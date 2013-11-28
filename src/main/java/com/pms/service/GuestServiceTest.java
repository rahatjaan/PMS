package com.pms.service;

import com.pms.domain.Guest;
import com.pms.domain.Members;
import com.pms.domain.Reservation;

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
public class GuestServiceTest {

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
	protected GuestService service;

	/**
	 * Instantiates a new GuestServiceTest.
	 *
	 */
	public GuestServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Reservation entity
	 * 
	 */
	@Test
	public void deleteGuestReservations() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestReservations 
		Integer guest_guestId = 0;
		Integer related_reservations_reservationId = 0;
		Guest response = null;
		response = service.deleteGuestReservations(guest_guestId, related_reservations_reservationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGuestReservations
	}

	/**
	 * Operation Unit Test
	 * Save an existing Guest entity
	 * 
	 */
	@Test
	public void saveGuest() {
		// TODO: JUnit - Populate test inputs for operation: saveGuest 
		Guest guest = new com.pms.domain.Guest();
		service.saveGuest(guest);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Guest entity
	 * 
	 */
	@Test
	public void deleteGuest() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuest 
		Guest guest_1 = new com.pms.domain.Guest();
		service.deleteGuest(guest_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Guest entity
	 * 
	 */
	@Test
	public void findAllGuests() {
		// TODO: JUnit - Populate test inputs for operation: findAllGuests 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Guest> response = null;
		response = service.findAllGuests(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGuests
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGuestByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGuestByPrimaryKey 
		Integer guestId = 0;
		Guest response = null;
		response = service.findGuestByPrimaryKey(guestId);
		// TODO: JUnit - Add assertions to test outputs of operation: findGuestByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Members entity
	 * 
	 */
	@Test
	public void deleteGuestMembers() {
		// TODO: JUnit - Populate test inputs for operation: deleteGuestMembers 
		Integer guest_guestId_1 = 0;
		String related_members_memberId = null;
		Guest response = null;
		response = service.deleteGuestMembers(guest_guestId_1, related_members_memberId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGuestMembers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Members entity
	 * 
	 */
	@Test
	public void saveGuestMembers() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestMembers 
		Integer guestId_1 = 0;
		Members related_members = new com.pms.domain.Members();
		Guest response = null;
		response = service.saveGuestMembers(guestId_1, related_members);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGuestMembers
	}

	/**
	 * Operation Unit Test
	 * Load an existing Guest entity
	 * 
	 */
	@Test
	public void loadGuests() {
		Set<Guest> response = null;
		response = service.loadGuests();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGuests
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Guest entity
	 * 
	 */
	@Test
	public void countGuests() {
		Integer response = null;
		response = service.countGuests();
		// TODO: JUnit - Add assertions to test outputs of operation: countGuests
	}

	/**
	 * Operation Unit Test
	 * Save an existing Reservation entity
	 * 
	 */
	@Test
	public void saveGuestReservations() {
		// TODO: JUnit - Populate test inputs for operation: saveGuestReservations 
		Integer guestId_2 = 0;
		Reservation related_reservations = new com.pms.domain.Reservation();
		Guest response = null;
		response = service.saveGuestReservations(guestId_2, related_reservations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGuestReservations
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
