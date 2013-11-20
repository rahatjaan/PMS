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
 * Unit test for the <code>MembersController</code> controller.
 *
 * @see com.pms.web.MembersController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class MembersControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listMembersGuests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistMembersGuests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listMembersGuests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>membersControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetmembersControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/membersController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersController controller = (MembersController) context.getBean("MembersController");

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