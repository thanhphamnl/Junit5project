package Junit5Demo;
public class Person {

  String FirstName;
  String LastName;
	
	public Person(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	public  String getFirstName() {
		return FirstName;
	}
	
	public  String getLastName() {
		return LastName;
	}
	
}
