package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2DBConnection {

    private static final String USER = "test";
    private static final String PASSWORD = "test11";

    private static Connection db;

    static {
        try {
            db = DriverManager.getConnection("jdbc:h2:~/test:", USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return db;
    }
}
