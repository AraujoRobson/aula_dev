package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import dao.PersonDAO;
import model.Person;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
		
		PersonDAO dao = new PersonDAO();
		
		Person person1 = new Person(null, "Robson Araujo", 
				Date.valueOf("1995-10-02"), 
				new BigDecimal("5500.00"));
		person1.setIdPerson(4);

		//dao.add(person1);
		//dao.change(person1);
		//dao.delete(1);
		
		person1 = dao.search_id(4);
		if (person1 != null) {
			System.out.println("ID.............: " + person1.getIdPerson() + 
								"\nNome...........: " + person1.getNamePerson() + 
								"\nData nascimento: " + fd.format(person1.getBirthDate()) + 
								"\nSalario........: " + fm.format(person1.getSalary()) + "\n");
		}
		
		List<Person> list = dao.listPeople();
		System.out.println("Lista");
		System.out.println("-------");
		
		for(Person person : list) {
			System.out.println("ID.............: " + person.getIdPerson() + 
								"\nNome...........: " + person.getNamePerson() + 
								"\nData nascimento: " + fd.format(person.getBirthDate()) + 
								"\nSalario........: " + fm.format(person.getSalary()) + "\n");
		}
	}

}
