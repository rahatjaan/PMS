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
 * Unit test for the <code>GuestController</code> controller.
 *
 * @see com.pms.web.GuestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class GuestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGuestMembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGuestMembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGuestMembers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGuestReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGuestReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGuestReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGuest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGuest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>guestControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetguestControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/guestController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestController controller = (GuestController) context.getBean("GuestController");

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