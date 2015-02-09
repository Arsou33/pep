package org.peekmoon.pep;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    
    private UserService userService;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.register();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
