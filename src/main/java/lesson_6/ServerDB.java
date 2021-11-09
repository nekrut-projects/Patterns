package lesson_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerDB {
    private Connection connection;

    public Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:test_db.db");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
