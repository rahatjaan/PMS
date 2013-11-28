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
 * Unit test for the <code>RoomtypeController</code> controller.
 *
 * @see com.pms.web.RoomtypeController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class RoomtypeControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoomtypeRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoomtypeRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoomtypeRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoomtypeBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoomtypeBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoomtypeBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoomtypeRooms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoomtypeRooms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoomtypeRooms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomtype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomtype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomtype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>roomtypeControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetroomtypeControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/roomtypeController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomtypeController controller = (RoomtypeController) context.getBean("RoomtypeController");

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