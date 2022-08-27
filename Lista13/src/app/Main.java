package app;

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
