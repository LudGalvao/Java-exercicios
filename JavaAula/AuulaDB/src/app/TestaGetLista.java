package app;

import Dao.ContatoDao;
import Modelo.Contato;

import java.sql.SQLException;
import java.util.List;

public class TestaGetLista {
    public static void main(String[] args) {
        try {
            ContatoDao cdao = new ContatoDao();
            List<Contato> contatos = cdao.getLista();

            System.out.println(contatos);

            for (Contato contato : contatos) {
                System.out.println("nome: "+contato.getNome());
                System.out.println("E-mail: "+contato.getEmail());
                System.out.println("Endereço: "+contato.getEndereco());
            }
        } catch (SQLException e ) {
            e.printStackTrace();
        }
    }
}
