package tek.week_4.day_1;

public class Array {
	
	public static void main(String[] args) {
		
		String firstName = "Bob";
		String middleName = "John";
		String lastName = "Eric"; 
		
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);
		
		System.out.println("**********************");
		
		String[] fullNames = new String[3];
		fullNames[0] = "Bob";
		fullNames[1] = "John";
		fullNames[2] ="Eric";
		
		System.out.println(fullNames[0]);
		System.out.println(fullNames[1]);
		System.out.println(fullNames[2]);
		
		System.out.println("**********************");
		
		String[] names = {"Bob", "John", "Eric"};
		System.out.println(names[0] + "\n" + names[1] + "\n"+ names[2]);
		
		System.out.println("**********************");
		
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers[4]);
		System.out.println(numbers[3]);
		
		System.out.println("**********************");
			
		
	}

}
