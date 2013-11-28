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
 * Unit test for the <code>RoomviewController</code> controller.
 *
 * @see com.pms.web.RoomviewController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMSSTUB-security-context.xml",
		"file:./src/main/resources/PMSSTUB-service-context.xml",
		"file:./src/main/resources/PMSSTUB-dao-context.xml",
		"file:./src/main/resources/PMSSTUB-web-context.xml" })
public class RoomviewControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoomviewRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoomviewRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoomviewRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoomview()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoomview() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoomview");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>roomviewControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetroomviewControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/roomviewController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoomviewController controller = (RoomviewController) context.getBean("RoomviewController");

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