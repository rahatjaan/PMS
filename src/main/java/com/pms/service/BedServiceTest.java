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
import com.pms.domain.Roomtype;

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
public class BedServiceTest {

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
	protected BedService service;

	/**
	 * Instantiates a new BedServiceTest.
	 *
	 */
	public BedServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Bed entity
	 * 
	 */
	@Test
	public void findAllBeds() {
		// TODO: JUnit - Populate test inputs for operation: findAllBeds 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Bed> response = null;
		response = service.findAllBeds(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllBeds
	}

	/**
	 * Operation Unit Test
	 * Save an existing Bed entity
	 * 
	 */
	@Test
	public void saveBed() {
		// TODO: JUnit - Populate test inputs for operation: saveBed 
		Bed bed = new com.pms.domain.Bed();
		service.saveBed(bed);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Roomtype entity
	 * 
	 */
	@Test
	public void deleteBedRoomtypes() {
		// TODO: JUnit - Populate test inputs for operation: deleteBedRoomtypes 
		Integer bed_bedId = 0;
		Integer related_roomtypes_roomTypeId = 0;
		Bed response = null;
		response = service.deleteBedRoomtypes(bed_bedId, related_roomtypes_roomTypeId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteBedRoomtypes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findBedByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBedByPrimaryKey 
		Integer bedId = 0;
		Bed response = null;
		response = service.findBedByPrimaryKey(bedId);
		// TODO: JUnit - Add assertions to test outputs of operation: findBedByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Bed entity
	 * 
	 */
	@Test
	public void loadBeds() {
		Set<Bed> response = null;
		response = service.loadBeds();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBeds
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Bed entity
	 * 
	 */
	@Test
	public void deleteBed() {
		// TODO: JUnit - Populate test inputs for operation: deleteBed 
		Bed bed_1 = new com.pms.domain.Bed();
		service.deleteBed(bed_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Bed entity
	 * 
	 */
	@Test
	public void countBeds() {
		Integer response = null;
		response = service.countBeds();
		// TODO: JUnit - Add assertions to test outputs of operation: countBeds
	}

	/**
	 * Operation Unit Test
	 * Save an existing Roomtype entity
	 * 
	 */
	@Test
	public void saveBedRoomtypes() {
		// TODO: JUnit - Populate test inputs for operation: saveBedRoomtypes 
		Integer bedId_1 = 0;
		Roomtype related_roomtypes = new com.pms.domain.Roomtype();
		Bed response = null;
		response = service.saveBedRoomtypes(bedId_1, related_roomtypes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveBedRoomtypes
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
