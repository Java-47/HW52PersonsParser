package telran.person.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import telran.person.dto.Person;
import telran.person.dto.PersonAdvancedList;

public class PersonRestoreObjectAppl {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
		Person person = mapper.readValue(new File("person.json"), Person.class);
		System.out.println(person);

		System.out.println("---ADVANCE----");

		List<Person> persons = mapper.readValue(new File("persons_for_advanced.json"), new TypeReference<>() {
		});
		PersonAdvancedList personAdvanced = new PersonAdvancedList(persons);
		System.out.println(personAdvanced);

	}

}
