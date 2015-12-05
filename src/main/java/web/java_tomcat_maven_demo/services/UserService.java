package web.java_tomcat_maven_demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    final private UserServiceInterface service;

    @Autowired
    public UserService(UserServiceInterface service) {
        this.service = service;
    }

    public String getMessage1() {
    	return this.service.getMessage1();
    }
    
    public String getMessage2() {
    	return this.service.getMessage2();
    }
    
}