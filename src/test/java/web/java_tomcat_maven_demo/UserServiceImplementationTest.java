package web.java_tomcat_maven_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import web.java_tomcat_maven_demo.services.UserService;
import web.java_tomcat_maven_demo.services.UserServiceBeanWrapper;

public class UserServiceImplementationTest {
	@Test
	public void test() {
		ApplicationContext context = new AnnotationConfigApplicationContext( UserServiceBeanWrapper.class);
		UserService service = context.getBean(UserService.class);
		System.out.println( service.getAdminUser());
		System.out.println( service.getSuperAdminUser() );
	}
}


