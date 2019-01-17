package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbHandler {
    public static Connection getDbConnect() throws SQLException{
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:/Users/danamir/IdeaProjects/odd-perekrestok-java/src/db/perekrestok.sqlite");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
        }
        return connection;
    }
}


