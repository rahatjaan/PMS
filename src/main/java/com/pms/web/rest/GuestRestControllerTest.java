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
 * Unit test for the <code>GuestRestController</code> controller.
 *
 * @see com.pms.web.rest.GuestRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class GuestRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Guestguest_guestIdmembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGuestguest_guestIdmembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/members");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdmembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostGuestguest_guestIdmembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/members");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdmembers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutGuestguest_guestIdmembers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/members");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdmembersmembers_memberId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteGuestguest_guestIdmembersmembers_memberId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/members/{members_memberId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdmembersmembers_memberId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGuestguest_guestIdmembersmembers_memberId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/members/{members_memberId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdreservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGuestguest_guestIdreservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/reservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdreservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostGuestguest_guestIdreservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/reservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdreservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutGuestguest_guestIdreservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/reservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdreservationsreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteGuestguest_guestIdreservationsreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/reservations/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestIdreservationsreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGuestguest_guestIdreservationsreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}/reservations/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGuestguest_guestId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostGuest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Guestguest_guestId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteGuestguest_guestId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Guest/{guest_guestId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GuestRestController controller = (GuestRestController) context.getBean("GuestRestController");

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