package telran.person.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class PersonAdvancedList {
	private List<Person> persons;

	public PersonAdvancedList(List<Person> persons) {
		this.persons = persons;
	}
}
