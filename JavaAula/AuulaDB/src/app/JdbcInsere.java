package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JavaDB.FabricaDeConexoes;
public class JdbcInsere {
    public static void main(String[] args) {
        try {
            Connection con = FabricaDeConexoes.getConnection();
            String sql = "insert into contatos (nome, email, endereco) values (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "Gabriel");
            stmt.setString(2, "Gabriel@gmail.com");
            stmt.setString(3, "Rua Numero n°0");
            stmt.execute();
            stmt.close();
            System.out.println("Gravação feita com sucesso!");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}