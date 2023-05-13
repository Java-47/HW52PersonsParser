package telran.person.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Person {
	private int id;
	private String name;
	private LocalDate birthDate;
	private Address address;

	public Person(int id, String name, LocalDate birthDate, Address address) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}

	@Getter
	@NoArgsConstructor
	public static class Address {
		private String city;
		private String street;
		private int building;
		private int aprt;

		public Address(String city, String street, int building, int aprt) {
			this.city = city;
			this.street = street;
			this.building = building;
			this.aprt = aprt;
		}

		@Override
		public String toString() {
			return "{" + "city='" + city + '\'' + ", street='" + street + '\'' + ", building=" + building + ", aprt="
					+ aprt + '}';
		}
	}
}