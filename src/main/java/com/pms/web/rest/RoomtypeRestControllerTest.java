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
 * Unit test for the <code>RoomtypeRestController</code> controller.
 *
 * @see com.pms.web.rest.RoomtypeRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class RoomtypeRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeIdroomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/roomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomtyperoomtype_roomTypeIdroomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/roomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomtyperoomtype_roomTypeIdroomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/roomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomviewroomview_roomViewId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomtyperoomtype_roomTypeIdroomviewroomview_roomViewId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/roomview/{roomview_roomViewId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomviewroomview_roomViewId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeIdroomviewroomview_roomViewId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/roomview/{roomview_roomViewId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdbed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeIdbed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/bed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdbed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomtyperoomtype_roomTypeIdbed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/bed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdbed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomtyperoomtype_roomTypeIdbed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/bed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdbedbed_bedId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomtyperoomtype_roomTypeIdbedbed_bedId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/bed/{bed_bedId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdbedbed_bedId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeIdbedbed_bedId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/bed/{bed_bedId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdrooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeIdrooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/rooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdrooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomtyperoomtype_roomTypeIdrooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/rooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdrooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomtyperoomtype_roomTypeIdrooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/rooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomsroom_roomId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomtyperoomtype_roomTypeIdroomsroom_roomId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/rooms/{room_roomId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeIdroomsroom_roomId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeIdroomsroom_roomId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}/rooms/{room_roomId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomtyperoomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomtyperoomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomtyperoomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomtype/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeRestController controller = (RoomtypeRestController) context.getBean("RoomtypeRestController");

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