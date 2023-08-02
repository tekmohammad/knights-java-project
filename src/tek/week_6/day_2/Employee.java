package tek.week_6.day_2;

public class Employee {
		// Create a class call Employee
		// This class should have fields (variables) 
		// firstName, lastName, dateOfBirth -> DataType -> String
		public String firstName;
		public String lastName;
		public String dateOfBirth;

		// Create one method inside of this class that will initialize the values
		// of the feidls to their default values (Use empty string for String
		// Data Types).
		public Employee(String firstName, String lastName, String dateOfBirth) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
		}
		// Create another method that will print the following format
		// First Name = X
		// Last Name = Y
		// Date of Birth = Z
		
		public void printInfo() {
			System.out.println("First Name = " + firstName);
			System.out.println("Last Name = " + lastName);
			System.out.println("Date of Birth = " + dateOfBirth);
		}
		
		// X, Y and Z are actually the data that you're doing to pass.
}
