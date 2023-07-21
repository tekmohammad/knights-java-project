package tek.week_4.day_2;

import java.util.Scanner;

public class Activity2 {
	
	// Print the even values from 0 to 20
	// Do not exclude 20 as well, including the 20.
	// number % 2 == 0
	
	public static void main(String[] args) {
		
		int start = 0;
		int end = 0;
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the start range of the number: ");
		start = userInput.nextInt();
		System.out.print("Please enter the end range of the number: ");
		end = userInput.nextInt();
		
		while (start <= end) {
			if (start % 2 == 0) {
				System.out.print("Even numbers: " + start + ", ");
			} else {
				System.out.print("Odd numbers" + start + ", ");
			}
			System.out.println();
			start++;
		}
//		
//		int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		int index = 0;
//		while (index < numbers.length) {
//			if (numbers[index] % 2 == 0) {
//				System.out.println("Even number: " + numbers[index]);
//			} else {
//				System.out.println("Odd: " + numbers[index]);
//			}
//			index++;
//		}
		
	}

}
