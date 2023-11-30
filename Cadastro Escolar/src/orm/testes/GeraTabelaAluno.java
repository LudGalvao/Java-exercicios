package orm.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelaAluno {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunosinfo");
        factory.close();
    }

}