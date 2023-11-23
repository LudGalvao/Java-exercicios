package app;

import Dao.ContatoDao;
import Modelo.Contato;

import java.sql.SQLException;

public class TestaDaoInsere {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Maria");
        contato.setEmail("maria@gmail.com");
        contato.setEndereco("Av. Brasil, 1000");


        try {
            ContatoDao dao = new ContatoDao();
            dao.adiciona(contato);
            System.out.println("Gravação foi feita no Banco de dado");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
