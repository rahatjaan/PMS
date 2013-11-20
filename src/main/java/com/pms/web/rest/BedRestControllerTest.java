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
 * Unit test for the <code>BedRestController</code> controller.
 *
 * @see com.pms.web.rest.BedRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/PMS-security-context.xml",
		"file:./src/main/resources/PMS-service-context.xml",
		"file:./src/main/resources/PMS-dao-context.xml",
		"file:./src/main/resources/PMS-web-context.xml" })
public class BedRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Bedbed_bedIdroomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBedbed_bedIdroomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}/roomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bedbed_bedIdroomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostBedbed_bedIdroomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}/roomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bedbed_bedIdroomtypes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutBedbed_bedIdroomtypes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}/roomtypes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bedbed_bedIdroomtypesroomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteBedbed_bedIdroomtypesroomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}/roomtypes/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bedbed_bedIdroomtypesroomtype_roomTypeId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBedbed_bedIdroomtypesroomtype_roomTypeId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}/roomtypes/{roomtype_roomTypeId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bedbed_bedId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBedbed_bedId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bed()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostBed() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Bedbed_bedId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteBedbed_bedId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Bed/{bed_bedId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BedRestController controller = (BedRestController) context.getBean("BedRestController");

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