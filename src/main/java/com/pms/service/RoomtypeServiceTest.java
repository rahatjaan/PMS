package com.pms.service;

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

import com.pms.domain.Bed;
import com.pms.domain.Room;
import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

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
public class RoomtypeServiceTest {

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
	protected RoomtypeService service;

	/**
	 * Instantiates a new RoomtypeServiceTest.
	 *
	 */
	public RoomtypeServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Roomview entity
	 * 
	 */
	@Test
	public void saveRoomtypeRoomview() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomtypeRoomview 
		Integer roomTypeId = 0;
		Roomview related_roomview = new com.pms.domain.Roomview();
		Roomtype response = null;
		response = service.saveRoomtypeRoomview(roomTypeId, related_roomview);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoomtypeRoomview
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Test
	public void deleteRoomtype() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomtype 
		Roomtype roomtype = new com.pms.domain.Roomtype();
		service.deleteRoomtype(roomtype);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRoomtypeByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRoomtypeByPrimaryKey 
		Integer roomTypeId_1 = 0;
		Roomtype response = null;
		response = service.findRoomtypeByPrimaryKey(roomTypeId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRoomtypeByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Roomtype entity
	 * 
	 */
	@Test
	public void findAllRoomtypes() {
		// TODO: JUnit - Populate test inputs for operation: findAllRoomtypes 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Roomtype> response = null;
		response = service.findAllRoomtypes(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRoomtypes
	}

	/**
	 * Operation Unit Test
	 * Load an existing Roomtype entity
	 * 
	 */
	@Test
	public void loadRoomtypes() {
		Set<Roomtype> response = null;
		response = service.loadRoomtypes();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRoomtypes
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Roomtype entity
	 * 
	 */
	@Test
	public void countRoomtypes() {
		Integer response = null;
		response = service.countRoomtypes();
		// TODO: JUnit - Add assertions to test outputs of operation: countRoomtypes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Roomtype entity
	 * 
	 */
	@Test
	public void saveRoomtype() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomtype 
		Roomtype roomtype_1 = new com.pms.domain.Roomtype();
		service.saveRoomtype(roomtype_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Room entity
	 * 
	 */
	@Test
	public void saveRoomtypeRooms() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomtypeRooms 
		Integer roomTypeId_2 = 0;
		Room related_rooms = new com.pms.domain.Room();
		Roomtype response = null;
		response = service.saveRoomtypeRooms(roomTypeId_2, related_rooms);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoomtypeRooms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Bed entity
	 * 
	 */
	@Test
	public void deleteRoomtypeBed() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomtypeBed 
		Integer roomtype_roomTypeId = 0;
		Integer related_bed_bedId = 0;
		Roomtype response = null;
		response = service.deleteRoomtypeBed(roomtype_roomTypeId, related_bed_bedId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoomtypeBed
	}

	/**
	 * Operation Unit Test
	 * Save an existing Bed entity
	 * 
	 */
	@Test
	public void saveRoomtypeBed() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomtypeBed 
		Integer roomTypeId_3 = 0;
		Bed related_bed = new com.pms.domain.Bed();
		Roomtype response = null;
		response = service.saveRoomtypeBed(roomTypeId_3, related_bed);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoomtypeBed
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Roomview entity
	 * 
	 */
	@Test
	public void deleteRoomtypeRoomview() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomtypeRoomview 
		Integer roomtype_roomTypeId_1 = 0;
		Integer related_roomview_roomViewId = 0;
		Roomtype response = null;
		response = service.deleteRoomtypeRoomview(roomtype_roomTypeId_1, related_roomview_roomViewId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoomtypeRoomview
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Room entity
	 * 
	 */
	@Test
	public void deleteRoomtypeRooms() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomtypeRooms 
		Integer roomtype_roomTypeId_2 = 0;
		Integer related_rooms_roomId = 0;
		Roomtype response = null;
		response = service.deleteRoomtypeRooms(roomtype_roomTypeId_2, related_rooms_roomId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoomtypeRooms
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
