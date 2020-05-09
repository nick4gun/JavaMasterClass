package OOPs_Concepts;

public class Person_Main {

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName(" "); // First name is empty string
		person.setLastName(" "); // last name is empty string
		person.setAge(10);

		System.out.println("FullName = " + person.getFullName());
		System.out.println("Teen = " + person.isTeen());

		person.setFirstName("Nikhil"); // First name is set to Nikhil
		person.setAge(18);

		System.out.println("FullName = " + person.getFullName());
		System.out.println("Teen = " + person.isTeen());
		person.setLastName("Gudelli"); // LastName is set to Gudelli
		System.out.println("FullName = " + person.getFullName());

	}

}
