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
 * Unit test for the <code>BedController</code> controller.
 *
 * @see com.pms.web.BedController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class BedControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listBedRoomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistBedRoomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listBedRoomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>bedControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbedControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/bedController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedController controller = (BedController) context.getBean("BedController");

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