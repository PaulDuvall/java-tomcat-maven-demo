package web.java_tomcat_maven_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import web.java_tomcat_maven_demo.services.UserService;
import web.java_tomcat_maven_demo.services.UserServiceImplementation;

public class UserServiceImplementationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext( UserServiceImplementation.class);
		UserService service = context.getBean(UserService.class);
		service.printMessage();
		

		// fail("Not yet implemented");
	}
}


