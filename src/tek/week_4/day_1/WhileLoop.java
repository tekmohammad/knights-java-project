package tek.week_4.day_1;

public class WhileLoop {
	
	public static void main(String[] args) {
		// Write a java program to store 10 numbers.
		// Print the values stored in the array using the 
		// while loop.
		// [10],[22],33,44,55,66,77,88,99,100]
		
		int[] numbers = {10,22,33,44,55,66,77,88,99,100};
		int index = 0;
		
		while (index < numbers.length) {
			// if this is not the last iteration, print the ", "
			if (index == numbers.length - 1) {
				System.out.print(numbers[index]);
			} else {
			// but if this is the last iteration, do not print ", "
				System.out.print( "["+numbers[index]+ "]" + ", ");
			}
			index++;
		}
		
		
		
//		// Increment;
//		int number  = 10;
//		System.out.println(number++); // 10
//		System.out.println(number++); // 11
//		System.out.println(number++); // 12
//		System.out.println("************************");
//		// Decrement;
//		System.out.println(number--);
//		System.out.println(number--);
//		System.out.println(number--);
//		System.out.println("************************");
//		// Pre-Increment;
//		System.out.println(++number);
//		System.out.println(++number);
//		System.out.println(++number);
//		System.out.println("************************");
//		// Pre-Decrement;
//		System.out.println(--number);
//		System.out.println(--number);
//		System.out.println(--number);
	}

}
