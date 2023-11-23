package JavaDB;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaFabricaDeConexoes {
    public static void main(String[] args) {
        try {
            Connection con = FabricaDeConexoes.getConnection();
            System.out.println("Conectado ao banco de dados");
            con.close();
        } catch (SQLException e) {
            // TODO: handle exception
        }
    }
}
