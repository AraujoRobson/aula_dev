package model;

import java.math.BigDecimal;
import java.sql.Date;

public class Person {
	private Integer idPerson;
	private String namePerson;
	private Date birthDate;
	private BigDecimal salary;
	
	public Person(Integer idPerson, String namePerson, Date birthDate, BigDecimal salary) {
		super();
		this.idPerson = idPerson;
		this.namePerson = namePerson;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public Integer getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}
	
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
