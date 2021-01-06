package main;

public class Manager {
	public String username;
	private String password;
	public String firstName;
	public String lastName;
	public int age;
	public int salary;
	
	public Manager(String username, String password, String firstName, String lastName, int age, int salary) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	public boolean isValidPassword(String password) {
		return this.password.equals(password);
	}
	
	@Override
	public String toString() {
		return "Manager{" +
				"username='" + username + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
