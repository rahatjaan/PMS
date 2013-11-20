package com.pms.service;

import com.pms.domain.Guest;
import com.pms.domain.Members;

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
public class MembersServiceTest {

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
	protected MembersService service;

	/**
	 * Instantiates a new MembersServiceTest.
	 *
	 */
	public MembersServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Members entity
	 * 
	 */
	@Test
	public void saveMembers() {
		// TODO: JUnit - Populate test inputs for operation: saveMembers 
		Members members = new com.pms.domain.Members();
		service.saveMembers(members);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Guest entity
	 * 
	 */
	@Test
	public void deleteMembersGuests() {
		// TODO: JUnit - Populate test inputs for operation: deleteMembersGuests 
		String members_memberId = null;
		String related_guests_guestId = null;
		Members response = null;
		response = service.deleteMembersGuests(members_memberId, related_guests_guestId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteMembersGuests
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findMembersByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findMembersByPrimaryKey 
		String memberId = null;
		Members response = null;
		response = service.findMembersByPrimaryKey(memberId);
		// TODO: JUnit - Add assertions to test outputs of operation: findMembersByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Members entity
	 * 
	 */
	@Test
	public void loadMemberss() {
		Set<Members> response = null;
		response = service.loadMemberss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadMemberss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Members entity
	 * 
	 */
	@Test
	public void deleteMembers() {
		// TODO: JUnit - Populate test inputs for operation: deleteMembers 
		Members members_1 = new com.pms.domain.Members();
		service.deleteMembers(members_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Guest entity
	 * 
	 */
	@Test
	public void saveMembersGuests() {
		// TODO: JUnit - Populate test inputs for operation: saveMembersGuests 
		String memberId_1 = null;
		Guest related_guests = new com.pms.domain.Guest();
		Members response = null;
		response = service.saveMembersGuests(memberId_1, related_guests);
		// TODO: JUnit - Add assertions to test outputs of operation: saveMembersGuests
	}

	/**
	 * Operation Unit Test
	 * Return all Members entity
	 * 
	 */
	@Test
	public void findAllMemberss() {
		// TODO: JUnit - Populate test inputs for operation: findAllMemberss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Members> response = null;
		response = service.findAllMemberss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllMemberss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Members entity
	 * 
	 */
	@Test
	public void countMemberss() {
		Integer response = null;
		response = service.countMemberss();
		// TODO: JUnit - Add assertions to test outputs of operation: countMemberss
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
