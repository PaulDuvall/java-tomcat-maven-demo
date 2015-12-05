package web.java_tomcat_maven_demo.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UserServiceImplementation {
	@Bean
	UserServiceInterface mockMessageService() {
		return new UserServiceInterface() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}
}
