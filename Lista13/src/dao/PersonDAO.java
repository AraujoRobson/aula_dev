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
	private String sql = null;
	private Connection connection;
	PreparedStatement stmt = null;
	ResultSet rs = null;
		
	@Override
	public List<Person> listPeople() {
		connection = MySQLConnection.getConnection();
		
		List<Person> list = new ArrayList<>();
		
		try {
			sql = "SELECT * FROM pessoa";
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
			sql = "INSERT INTO pessoa (nome_pessoa, data_nascimento, salario)" + 
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
			sql = "UPDATE pessoa " + 
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
	public void delete(Integer id) {
		connection = MySQLConnection.getConnection();
		try { 
			sql = "DELETE FROM pessoa "+
					"WHERE id_pessoa = ?;";
			stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage()); 
		}finally {
			MySQLConnection.closeConnection();
			try { 
				stmt.close(); 
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
		}
	}


	@Override
	public Person search_id(Integer id) {
		connection = MySQLConnection.getConnection();
		Person p = null;
		try {
			sql = "SELECT * FROM pessoa WHERE id_pessoa = ?;";
			stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				p = new Person();
				p.setIdPerson(rs.getInt("id_pessoa"));
				p.setNamePerson(rs.getString("nome_pessoa"));
				p.setBirthDate(rs.getDate("data_nascimento"));
				p.setSalary(rs.getBigDecimal("salario"));
			}
		} catch (SQLException e) {
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
		return p;
	}

}
