package JavaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args){
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mariadb://localhost/test","root","");
            System.out.println("Conectado ao banco de dados acima");
            con.close();
        }  catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
