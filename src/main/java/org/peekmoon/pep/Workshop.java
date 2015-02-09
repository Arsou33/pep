package org.peekmoon.pep;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Workshop {
    
    private String title;
    private String description;
    
    public Workshop() {};
    

    public Workshop(ResultSet rs) throws SQLException {
        title = rs.getString("title");
        description = rs.getString("description");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

}
