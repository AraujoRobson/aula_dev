package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import db.MySQLConnection;
import model.Person;

public class PersonDAO implements IPersonDAO {
	private Connection connection;
	
	
	@Override
	public List<Person> listPeople() {
		connection = MySQLConnection.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Person> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM pessoa";
			stmt = this.connection.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				Person p = new Person();
				p.setIdPerson(rs.getInt("id_pessoa"));
				p.setNamePerson(rs.getString("nome_pessoa"));
				p.setBirthDate(rs.getDate("data_nascimento"));
				p.setSalary(rs.getBigDecimal("salario"));

				list.add(p);
			}
		}  catch(SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MySQLConnection.closeConnection();
			try { 
				stmt.close(); rs.close(); 
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
			 
		}
		
		return list;
	}
	
	@Override
	public void add(Person p) {
	
	}

	@Override
	public void change(Person p) {
	}

	@Override
	public void delete(Integer id) {
	}


	@Override
	public Person search_id(Integer id) {
		return null;
	}

}
