import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Abhishek Jain
 */
public class EntryPoint {
    public static void main(String[] args) throws SQLException {
        System.out.println("#### Postgres DB connection Java implementation ####");

        //creating PostgresConnection class object to get postgres db connection.
        PostgresConnection postgresConnection = new PostgresConnection();

        //calling getPostgresDBConnection() method to get connection
        Connection connection = postgresConnection.getPostgresDBConnection();

        //checking if connection is successful or not, and if success, closing also.
        if(connection != null) {
            System.out.println("Opened database successfully");
            connection.close();
        }
    }
}
