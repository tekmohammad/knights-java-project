package tek.week_9.day_2;

import java.util.*;

public class LinkedListActivity {

	// Create instance of the LinkedList
	// add some values to the LinkedList
	// Remove some values from the LinkedList
	// print the values from the LinkedList 
	
	public static void main(String[] args) {
		Example<Integer> numbers = new Example<>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		
		ArrayList<Integer> arrNumbers = new ArrayList<>();
		arrNumbers.add(10);
		arrNumbers.add(30);
		arrNumbers.add(40);
		
		System.out.println(arrNumbers);
		
	}
}	
