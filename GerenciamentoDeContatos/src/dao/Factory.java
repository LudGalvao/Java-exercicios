package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {
    public static Connection criarConnnection() throws SQLException{
        String url = "jdbc:mariadb://localhost:3306/contatos?unix_socket=/var/run/mysqld/mysqld.sock";
        String user = "root";
        String passwword = "";
        return DriverManager.getConnection(url, user, passwword);
    }
}
