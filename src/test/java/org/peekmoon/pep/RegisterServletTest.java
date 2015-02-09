package org.peekmoon.pep;

import static org.mockito.Mockito.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;

public class RegisterServletTest {
    
    @Test
    public void doPost_addCallServiceRegisterUser() throws ServletException, IOException {
        RegisterServlet servlet = new RegisterServlet();
        UserService userService = mock(UserService.class);
        servlet.setUserService(userService);
        
        servlet.doPost(null, null);
        
        verify(userService).register();
        
    }
    
    

}
