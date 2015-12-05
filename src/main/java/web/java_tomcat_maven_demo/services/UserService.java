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

    public void printMessage() {
    	System.out.println(this.service.getMessage());
    }
}