package org.peekmoon.pep;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/user")
public class RegisterApi {
    
    private static Logger log = LoggerFactory.getLogger(RegisterApi.class);
   
    @POST
    public Response put(User user) {
        log.info("Registering user " + user.getFirstname());
        return Response.ok().build();
    }
    
    

}
