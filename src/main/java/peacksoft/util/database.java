package peacksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String login = "postgres";
    private static final String password = "stulchik";

    public static Connection connection(){

        Connection connect = null;
        try {
            connect = DriverManager.getConnection(url,login,password);
            System.out.println("Connected to the PostgresSqk successfully");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connect;

    }
}
