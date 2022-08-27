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

}
