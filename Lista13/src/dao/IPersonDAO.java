package dao;

import java.util.List;
import model.Person;

public interface IPersonDAO {
	void add(Person p);
	void change(Person p);
	void delete(Integer id);
	List<Person> listPeople();	
	Person search_id(Integer id);
}
