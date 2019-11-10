import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Abhishek Jain
 */
public class EntryPoint {
    public static void main(String[] args) throws SQLException {
        System.out.println("#### Postgres DB connection Java implementation ####");
        PostgresConnection postgresConnection = new PostgresConnection();
        Connection connection = postgresConnection.getPostgresDBConnection();
        if(connection != null)
            System.out.println("Opened database successfully");
        connection.close();
    }
}
