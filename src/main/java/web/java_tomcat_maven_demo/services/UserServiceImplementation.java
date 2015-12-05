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
			public String getAdminUser() {
				return "admin";
			}
			public String getSuperAdminUser() {
				return "superadmin";
			}
		};
	}
}
