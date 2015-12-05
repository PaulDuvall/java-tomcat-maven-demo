package web.java_tomcat_maven_demo.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UserServiceImplementation {
	@Bean
	UserServiceInterface messageService() {
		return new UserServiceInterface() {
			public String getMessage1() {
				return "Message Call 1";
			}
			public String getMessage2() {
				return "Message Call 2";
			}
		};
	}
}
