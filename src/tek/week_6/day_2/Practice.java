package tek.week_6.day_2;

public class Practice {
	
	private int numberOne;
	private int numberTwo;
	private String firstName;
	private String lastName;
	
	public int getNumberOne() {
		return numberOne;
	}
	
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	
	public int getNumberTwo() {
		return numberTwo;
	}
	
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Practice(int numberOne, int numberTwo, String firstName, String lastName) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
