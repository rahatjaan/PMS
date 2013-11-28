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
 * Unit test for the <code>RoomController</code> controller.
 *
 * @see com.pms.web.RoomController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class RoomControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoomRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoomRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoomRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoomReservations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoomReservations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoomReservations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoom()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoom() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoom");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>roomControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetroomControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/roomController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomController controller = (RoomController) context.getBean("RoomController");

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