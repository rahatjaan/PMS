package com.pms.service;

import com.pms.domain.Roomtype;
import com.pms.domain.Roomview;

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
public class RoomviewServiceTest {

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
	protected RoomviewService service;

	/**
	 * Instantiates a new RoomviewServiceTest.
	 *
	 */
	public RoomviewServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRoomviewByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRoomviewByPrimaryKey 
		Integer roomViewId = 0;
		Roomview response = null;
		response = service.findRoomviewByPrimaryKey(roomViewId);
		// TODO: JUnit - Add assertions to test outputs of operation: findRoomviewByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Roomview entity
	 * 
	 */
	@Test
	public void deleteRoomview() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomview 
		Roomview roomview = new com.pms.domain.Roomview();
		service.deleteRoomview(roomview);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Roomtype entity
	 * 
	 */
	@Test
	public void saveRoomviewRoomtypes() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomviewRoomtypes 
		Integer roomViewId_1 = 0;
		Roomtype related_roomtypes = new com.pms.domain.Roomtype();
		Roomview response = null;
		response = service.saveRoomviewRoomtypes(roomViewId_1, related_roomtypes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoomviewRoomtypes
	}

	/**
	 * Operation Unit Test
	 * Load an existing Roomview entity
	 * 
	 */
	@Test
	public void loadRoomviews() {
		Set<Roomview> response = null;
		response = service.loadRoomviews();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRoomviews
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Roomview entity
	 * 
	 */
	@Test
	public void countRoomviews() {
		Integer response = null;
		response = service.countRoomviews();
		// TODO: JUnit - Add assertions to test outputs of operation: countRoomviews
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Test
	public void deleteRoomviewRoomtypes() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoomviewRoomtypes 
		Integer roomview_roomViewId = 0;
		Integer related_roomtypes_roomTypeId = 0;
		Roomview response = null;
		response = service.deleteRoomviewRoomtypes(roomview_roomViewId, related_roomtypes_roomTypeId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoomviewRoomtypes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Roomview entity
	 * 
	 */
	@Test
	public void saveRoomview() {
		// TODO: JUnit - Populate test inputs for operation: saveRoomview 
		Roomview roomview_1 = new com.pms.domain.Roomview();
		service.saveRoomview(roomview_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Roomview entity
	 * 
	 */
	@Test
	public void findAllRoomviews() {
		// TODO: JUnit - Populate test inputs for operation: findAllRoomviews 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Roomview> response = null;
		response = service.findAllRoomviews(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRoomviews
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
