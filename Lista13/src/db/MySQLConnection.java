package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	private static Connection connection = null;
	
	private MySQLConnection() {
		
	}
	
	public static Connection getConnection() {
		try {
			final String url = "jdbc:mysql://localhost/unoesc_trabalho_crud";
			final String user = "root";
			final String password = "root";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão realizada com sucesso");
			
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				System.out.println("Conexão fechada com sucesso!");
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
