package org.peekmoon.pep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/workshops")
public class WorkshopApi {
    
    private static Logger log = LoggerFactory.getLogger(WorkshopApi.class);
    
    @GET
    public List<Workshop> findAll() throws SQLException, ClassNotFoundException {
        log.info("Retrieving all workshop list");
        List<Workshop> workshops = new ArrayList<>();
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "pep_dev", "pep_dev");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select title, description from workshop");
        
        while (rs.next()) {
            workshops.add(new Workshop(rs));
        }
        
        return workshops;
    }
    

}
