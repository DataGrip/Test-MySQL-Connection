import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://REPLACE_ME:3307/REPLACE_ME"; // Replace with host and database name
        String username = "REPLACE_ME"; // Replace with your username
        String password = "REPLACE_ME"; // Replace with your password

        System.out.println("Connecting database ...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
