package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {
	public static Connection getConnection() throws SQLException{
		try {
	        // Registrar o driver JDBC
	        Class.forName("org.mariadb.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        throw new SQLException("Driver JDBC do MariaDB não encontrado.", e);
	    }

	    return DriverManager.getConnection("jdbc:mariadb://localhost/test", "root", "");
	}

}
