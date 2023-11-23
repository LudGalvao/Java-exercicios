package Dao;

import JavaDB.FabricaDeConexoes;
import Modelo.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDao {
    private Connection con;
    public ContatoDao() throws SQLException {
        this.con = FabricaDeConexoes.getConnection();
    }

    public void adiciona(Contato contato) throws SQLException {
        String sql = "insert into contatos (nome, email, endereco) values (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, contato.getNome());
        stmt.setString(2, contato.getEmail());
        stmt.setString(3, contato.getEndereco());
        stmt.execute();
        stmt.close();
        con.close();
    }
}
