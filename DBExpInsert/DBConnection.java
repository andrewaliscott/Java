import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {

    private static String jdbcUrl;
    private static boolean isInitialized;


    private static void initialize() {

        if (!isInitialized) {

            try {

                Properties props = new Properties();
                InputStream source = DBConnection.class.getResourceAsStream("demo.properties");
                props.load(source);
                source.close();

                jdbcUrl = props.getProperty("dbUrl");
                isInitialized = true;
            }

            catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }


    public static Connection getConnection() throws Exception {
        initialize();
        return DriverManager.getConnection(jdbcUrl);

    }

    public static void close(Statement stm)  throws Exception {

        if (stm != null)
            stm.close();

    }

    public static void close(Connection conn) throws Exception {

        if (conn != null)
            conn.close();

    }


}
