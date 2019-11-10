import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Abhishek Jain
 */
public class PostgresConnection{
    private final String url = "jdbc:postgresql://localhost:5432/AbhishekTest";
    private final String user = "postgres";
    private final String password = "postgres";

    public Connection getPostgresDBConnection()
    {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        finally {
            return connection;
        }
    }
}
