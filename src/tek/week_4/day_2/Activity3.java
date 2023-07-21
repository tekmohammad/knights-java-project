package tek.week_4.day_2;

import java.util.Random;

public class Activity3 {
	
	// int[] numbers = {10,11,12,13,14,15,16,17,18,19,20};
	
	// Find the minimum number;
	// Find the maximum number;
	
	// Extra points
	
	// Find the sum of all of the numbers inside of the array.
	// Find the average of the entire array.
	
	// Use the random function to generate the numbers for you?
	
	public static void main(String[] args) {
//		int[] numbers = {65,11,12,13,15,55,16,17,98,19,20};
		Random random = new Random();
		int[] numbers = new int[10];
		
		int numberCount = 0;
		while (numberCount < numbers.length) {
			numbers[numberCount] = random.nextInt(50);
			numberCount++;
		}
		
		int index2 = 0;
		while (index2 < numbers.length) {
			System.out.print(numbers[index2] + " ");
			index2++;
		}
		
		int min = numbers[0];
		int max = numbers[0];
		int sum = 0;
		int count = numbers.length;
		double average = 0;
		int index = 0;
		
		while (index < count) {
			
			sum += numbers[index];
			
			if (numbers[index]< min) 
				min = numbers[index];
			 
			if (numbers[index] > max) 
				max = numbers[index];
			
			index++;
		}
		
		average = sum / count; 
		System.out.println();
		System.out.println("The minimum value is: " + min);
		System.out.println("The maximum value is: " + max);
		System.out.println("The sum of all values is: " + sum);
		System.out.println("The average of all values is: " + average);
		
	}

}
