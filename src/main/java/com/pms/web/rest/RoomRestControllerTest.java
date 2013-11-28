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
 * Unit test for the <code>RoomRestController</code> controller.
 *
 * @see com.pms.web.rest.RoomRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class RoomRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Roomroom_roomIdroomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomroom_roomIdroomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/roomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdroomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomroom_roomIdroomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/roomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdroomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomroom_roomIdroomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/roomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdroomtyperoomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomroom_roomIdroomtyperoomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/roomtype/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdroomtyperoomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomroom_roomIdroomtyperoomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/roomtype/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdreservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomroom_roomIdreservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/reservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdreservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomroom_roomIdreservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/reservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdreservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomroom_roomIdreservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/reservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdreservationsreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomroom_roomIdreservationsreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/reservations/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomIdreservationsreservation_reservationId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomroom_roomIdreservationsreservation_reservationId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}/reservations/{reservation_reservationId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Room()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomroom_roomId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Room()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Room()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomroom_roomId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomroom_roomId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Room/{room_roomId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomRestController controller = (RoomRestController) context.getBean("RoomRestController");

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