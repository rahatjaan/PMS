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
 * Unit test for the <code>RoomviewRestController</code> controller.
 *
 * @see com.pms.web.rest.RoomviewRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class RoomviewRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Roomviewroomview_roomViewIdroomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomviewroomview_roomViewIdroomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}/roomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomviewroomview_roomViewIdroomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomviewroomview_roomViewIdroomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}/roomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomviewroomview_roomViewIdroomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomviewroomview_roomViewIdroomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}/roomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomviewroomview_roomViewIdroomtypesroomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomviewroomview_roomViewIdroomtypesroomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}/roomtypes/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomviewroomview_roomViewIdroomtypesroomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomviewroomview_roomViewIdroomtypesroomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}/roomtypes/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomviewroomview_roomViewId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoomviewroomview_roomViewId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Roomviewroomview_roomViewId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoomviewroomview_roomViewId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Roomview/{roomview_roomViewId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewRestController controller = (RoomviewRestController) context.getBean("RoomviewRestController");

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