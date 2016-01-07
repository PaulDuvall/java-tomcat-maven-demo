package web.jtmd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    final private UserServiceInterface service;

    @Autowired
    public UserService(UserServiceInterface service) {
        this.service = service;
    }

    public String getAdminUser() {
    	return this.service.getAdminUser();
    }
    
    public String getSuperAdminUser() {
    	return this.service.getSuperAdminUser();
    }
    
}