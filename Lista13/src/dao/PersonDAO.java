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
	Person p = new Person();
	
	@Override
	public List<Person> listPeople() {
		connection = MySQLConnection.getConexao();
		List<Person> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM pessoa";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				p.setIdPerson(rs.getInt("id_person"));
				p.setNamePerson(rs.getString("name_person"));
				p.setBirthDate(rs.getDate("birth_date"));
				p.setSalary(rs.getBigDecimal("salary"));
			}
		}  catch(SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 
		
		return null;
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
