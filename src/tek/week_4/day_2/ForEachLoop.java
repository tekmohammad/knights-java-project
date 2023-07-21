package tek.week_4.day_2;
public class ForEachLoop {
	
	public static void main(String[] args) {
		String[] countries = { "United States", "Spain", "London", "India"};
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int index = 0;
		while (index < countries.length) {
			System.out.print(countries[index] + " ");
			index++;
		}
		
		System.out.println();
		
		System.out.println("*************************************");
		
		for (String names : countries) {
			System.out.print(names + " ");
		}
		
		System.out.println();
		
		System.out.println("*************************************");
		
		for (int nums : numbers) {
			System.out.print(nums + " ");
		}
	}

}
