package org.openmrs.module.ordertemplates.web;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.Drug;
import org.openmrs.api.context.Context;
import org.openmrs.module.webservices.rest.web.api.RestService;
import org.openmrs.web.test.BaseModuleWebContextSensitiveTest;

public class ReproduceMeTest extends BaseModuleWebContextSensitiveTest {
	
	@Before
	public void setUp() throws Exception {
		Context.getService(RestService.class).getResourceBySupportedClass(Drug.class);
		
	}
	
	@Test
	public void testListByType() throws Exception {
		System.out.println("------------------- Running ---------------");
	}
}
