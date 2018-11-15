import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {


       // String url = "jdbc:mysql://localhost:3306/demo?user=andrewali&password=abc";



       /* try (Connection conn = DriverManager.getConnection(url)) {

            System.out.println("Connection is Succesfull");
            Statement myStm=conn.createStatement();


            //delete and update is the same just we are going to changw query
            int rowsAffected=myStm.executeUpdate("insert into employees (last_name,first_name,email,department,salary) values('Aslantas','John','a@a.com','HR','3333')");
            ResultSet myRs=myStm.executeQuery("select * from employees");


            while(myRs.next()){
                System.out.println(myRs.getString("last_name"));

            }


        }

        catch (Exception exc)
        {

            exc.printStackTrace();
        }*/




       /* try {

            Properties props=new Properties();
           // props.load(new FileInputStream("demo.properties"));
            props.load(new FileInputStream("/Users/andrewaliscott/Desktop/JavaProg/DemoDatabase/src/demo.properties"));


            String theUser=props.getProperty("user");
            String thePassword=props.getProperty("password");
            String theDbUrl=props.getProperty("dbUrl");

            System.out.println("Connecting to the Database");
            System.out.println("Database URL"+theDbUrl);
            System.out.println("User: "+ theUser);

            Connection conn = DriverManager.getConnection(theDbUrl,theUser,thePassword);
            System.out.println("Connection Succesfull");

        }

        catch (Exception exc)
        {

            exc.printStackTrace();
        }


*/


      //Third Method to connect the database

        Connection conn=DBConnection.getConnection();
        System.out.println("Ready you are good to go");
        DBConnection.close(conn);







    }
}
