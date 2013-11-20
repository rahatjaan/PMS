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
 * Unit test for the <code>MembersRestController</code> controller.
 *
 * @see com.pms.web.rest.MembersRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class MembersRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Membersmembers_memberIdguests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetMembersmembers_memberIdguests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}/guests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Membersmembers_memberIdguests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostMembersmembers_memberIdguests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}/guests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Membersmembers_memberIdguests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutMembersmembers_memberIdguests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}/guests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Membersmembers_memberIdguestsguest_guestId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteMembersmembers_memberIdguestsguest_guestId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}/guests/{guest_guestId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Membersmembers_memberIdguestsguest_guestId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetMembersmembers_memberIdguestsguest_guestId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}/guests/{guest_guestId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Members()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Membersmembers_memberId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetMembersmembers_memberId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Members()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Members()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Membersmembers_memberId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteMembersmembers_memberId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Members/{members_memberId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MembersRestController controller = (MembersRestController) context.getBean("MembersRestController");

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