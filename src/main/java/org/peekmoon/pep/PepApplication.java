package org.peekmoon.pep;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/api")
public class PepApplication extends ResourceConfig {
    
    public PepApplication() {
        packages("org.peekmoon.pep");
    }

  
}
