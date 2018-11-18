import java.sql.Connection;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {

        Connection conn=DBConnection.getConnection();
        Statement stm=conn.createStatement();

       //There are insert delete and update command we can use any of them in this file.

        String insertCommand="insert into experiment (idexperiment, name,surname,salary) values ('1','Ali', 'Aslantas', '250000') ";
        //String deleteCommand="delete from experiment where idexperiment=1";
        //String updateCommand="update experiment set  name='Andrew' where idexperiment=1 ;

        int count=stm.executeUpdate(insertCommand);
        System.out.println(count+ ": Rows Inserted");
        DBConnection.close(stm);
        DBConnection.close(conn);





    }
}
