package app;

import java.sql.Connection;
import db.MySQLConnection;

public class Principal {

	public static void main(String[] args) {
		Connection connection = MySQLConnection.getConexao();
		MySQLConnection.closeConnection();
	}

}
