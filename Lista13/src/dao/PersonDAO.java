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
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	@Override
	public List<Person> listPeople() {
		connection = MySQLConnection.getConnection();
		
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
				stmt.close(); 
				rs.close(); 
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
		}
		
		return list;
	}
	
	@Override
	public void add(Person p) {
		connection = MySQLConnection.getConnection();
		try { 
			String sql = "INSERT INTO pessoa (nome_pessoa, data_nascimento, salario)" + 
					"VALUES (?, ?, ?);";
			stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, p.getNamePerson());
			stmt.setDate(2, p.getBirthDate());
			stmt.setBigDecimal(3, p.getSalary());
			
			stmt.execute();			
		} catch(SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MySQLConnection.closeConnection();
			try { 
				stmt.close(); 
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
		}
	}

	@Override
	public void change(Person p) {
		connection = MySQLConnection.getConnection();
		try {
			String sql = "UPDATE pessoa " + 
							"SET nome_pessoa = ?, " +
							"data_nascimento = ?, " +
							"salario = ? " +
							"WHERE id_pessoa = ?;";
			
			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, p.getNamePerson());
			stmt.setDate(2, p.getBirthDate());
			stmt.setBigDecimal(3, p.getSalary());
			
			stmt.setInt(4, p.getIdPerson());
			
			stmt.execute();
		} catch (SQLException e) {
			
		} finally {
			MySQLConnection.closeConnection();
			try { 
				stmt.close(); 
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
		}
	}

	@Override
	public void delete(Integer id) {
	}


	@Override
	public Person search_id(Integer id) {
		return null;
	}

}
