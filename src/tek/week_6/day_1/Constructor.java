package tek.week_6.day_1;

public class Constructor {
	
	//  a constructor is a block of code that is used to initialize an object. 
	// It is special because it is automatically called when an object is 
	//created. It has the same name as the class and doesn't have a 
	// return type, not even void.
	
	// Default constructor (no-arg constructor): If you don't define a 
	// constructor in your class, the Java compiler inserts a default 
	// constructor into your code on your behalf. This constructor will 
	//  not take any parameters.
	
	// Parameterized constructor: A constructor that has specific parameters 
	// is known as a parameterized constructor. 
	// If you define a parameterized constructor, you also need to 
	// define the default constructor if you plan to create objects
	// without parameters.
	
	/*
	 * // Default constructor public Car() { 
	 *  this.numberOne = 0;
	 *  this.firstName = ""; // good practice to asign to empty string!
	 *  this.result = false; 
	 * }
	 * 
	 * // Parameterized constructor
	 *  public Car(int numberOne, String firstName, boolean result) { 
	 *  
	 *  this.numberOne = numberOne;
	 *  this.firstName = firstName; 
	 *  this.result = result; 
	 *  
	 *  } 
	 */


	public int numberOne;
	public String firstName;
	public boolean result;
	
	public Constructor() {
		numberOne = 0;
		firstName = null;
		result = false;
	}
	
	public Constructor(int newNumberOne, String newFirstName, boolean newResult) {
		numberOne = newNumberOne;
		firstName = newFirstName;
		result = newResult;
	}
}
