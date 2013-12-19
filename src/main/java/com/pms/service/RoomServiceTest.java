package com.pms.service;

import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;

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
public class RoomServiceTest {

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
	protected RoomService service;

	/**
	 * Instantiates a new RoomServiceTest.
	 *
	 */
	public RoomServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Reservation entity
	 * 
	 */
	@Test
	public void saveRoomReservations() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomReservations 
		Integer roomId = 0;
		Reservation related_reservations = new com.pms.domain.Reservation();
		Room response = null;
		response = service.saveRoomReservations(roomId, related_reservations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoomReservations
	}

	/**
	 * Operation Unit Test
	 * Save an existing Roomtype entity
	 * 
	 */
	@Test
	public void saveRoomRoomtype() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomRoomtype 
		Integer roomId_1 = 0;
		Roomtype related_roomtype = new com.pms.domain.Roomtype();
		Room response = null;
		response = service.saveRoomRoomtype(roomId_1, related_roomtype);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoomRoomtype
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Room entity
	 * 
	 */
	@Test
	public void deleteRoom() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoom 
		Room room = new com.pms.domain.Room();
		service.deleteRoom(room);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Room entity
	 * 
	 */
	@Test
	public void saveRoom() {
		// TODO: JUnit - Populate test inputs for operation: saveRoom 
		Room room_1 = new com.pms.domain.Room();
		service.saveRoom(room_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRoomByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRoomByPrimaryKey 
		Integer roomId_2 = 0;
		Room response = null;
		response = service.findRoomByPrimaryKey(roomId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findRoomByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Room entity
	 * 
	 */
	@Test
	public void loadRooms() {
		Set<Room> response = null;
		response = service.loadRooms();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRooms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Reservation entity
	 * 
	 */
	@Test
	public void deleteRoomReservations() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomReservations 
		Integer room_roomId = 0;
		Integer related_reservations_reservationId = 0;
		Room response = null;
		response = service.deleteRoomReservations(room_roomId, related_reservations_reservationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoomReservations
	}

	/**
	 * Operation Unit Test
	 * Return all Room entity
	 * 
	 */
	@Test
	public void findAllRooms() {
		// TODO: JUnit - Populate test inputs for operation: findAllRooms 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Room> response = null;
		response = service.findAllRooms(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRooms
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Room entity
	 * 
	 */
	@Test
	public void countRooms() {
		Integer response = null;
		response = service.countRooms();
		// TODO: JUnit - Add assertions to test outputs of operation: countRooms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Test
	public void deleteRoomRoomtype() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomRoomtype 
		Integer room_roomId_1 = 0;
		Integer related_roomtype_roomTypeId = 0;
		Room response = null;
		response = service.deleteRoomRoomtype(room_roomId_1, related_roomtype_roomTypeId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoomRoomtype
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
