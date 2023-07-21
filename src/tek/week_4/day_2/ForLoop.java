package tek.week_4.day_2;

public class ForLoop {
	
	public static void main(String[] args) {
		// Print the numbers from 1 to 10 using For loop
		for (int number = 0; number <= 10; number += 2) {
			System.out.print(number + " ");
		}
		System.out.println();
		for (int number = 1; number <= 10; number += 2) {
			System.out.print(number + " ");
		}
		System.out.println();
		for (int number = 9; number >= 1; number -= 2) {
			System.out.print(number + " ");
		}
		System.out.println();
		for (int number = 10; number >= 0; number -= 2) {
			System.out.print(number + " ");
		}
		
		
		
		System.out.println();
		System.out.println("**************************************");
		
		int[] numbers = {100,50,30,10,110};
		String[] names = {"Erin", "Bob", "Jake"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		// 1. Name
		// 2. Name
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.println( i+1 + ". " + names[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
