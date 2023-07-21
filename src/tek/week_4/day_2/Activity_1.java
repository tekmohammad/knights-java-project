package tek.week_4.day_2;

public class Activity_1 {
	public static void main(String[] args) {
		int[] numbers = {50,20,5,30,8,90,100};
		int index = 2;
		while (index <= 4) {
			System.out.println("The number stored at index " + index + 
					" is = " +numbers[index]);
			index++;
		}
		
		String[] names = {"Bob", "John", "Eric"};
		int indexForNames = 0;
		while (indexForNames < names.length) {
			System.out.println("The name stored at index " + indexForNames + 
					" is = " + names[indexForNames]);
			indexForNames++;
		}
	}
}
