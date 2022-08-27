package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {
	private static Connection connection = null;
	
	private MySQLConnection() {
	}
	
	private static Properties loadProperties() throws FileNotFoundException, IOException{
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties prop = new Properties();
			prop.load(fs);
			return prop;
		}
	}
	
	public static Connection getConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				return connection;
			}
			
			Properties prop = loadProperties();
			
			final String url = prop.getProperty("url");
			final String user = prop.getProperty("user");
			final String password = prop.getProperty("password");
			
			System.out.println("Conectando ao BD");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão realizada com sucesso");
			
			return connection;
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			//	System.out.println("Conexão fechada com sucesso!");
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
