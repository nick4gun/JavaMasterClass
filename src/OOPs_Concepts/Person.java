package OOPs_Concepts;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public String getLastNumber() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100)
			this.age = 0;
		else
			this.age = age;
	}

	public boolean isTeen() {
		return age > 12 && age < 20;
	}

	public String getFullName() {
		String emptyString = " ";
		String isNotEmpty = firstName + " " + lastName;
		if ((firstName.equals(emptyString)) && (lastName.equals(emptyString))) {
			return emptyString;
		}
		if (lastName.equals(emptyString)) {
			return firstName;
		}
		if (firstName.equals(emptyString)) {
			return lastName;
		}
		return isNotEmpty;

	}
}
