package java8.data;

public class Person {

	private String firstname;
	private String lastname;
	private Integer age;
	private String password;

	public Person() {
	}

	public Person(String firstname, String lastname, Integer age, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
