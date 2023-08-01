package tek.week_6.day_1;

public class ActivityOne {
	
	// In your main method, create the object of this class and then call
	// the second method to print the result of the calculation.
	
	public static void main(String[] args) {
		Math mathObj = new Math();
		mathObj.num1 = 10;
		mathObj.num2 = 50;S
		Math mathObj = new Math(40, 50);
		mathObj.printCalculation();
		
		
		Math mathObj2 = new Math();
		mathObj2.printCalculation();
	}
	
}
