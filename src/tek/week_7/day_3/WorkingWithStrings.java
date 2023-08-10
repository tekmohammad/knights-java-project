package tek.week_7.day_3;

public class WorkingWithStrings {

	public static void main(String[] args) {
		
		// Create a String of str1 and assign a value;
		// for example: String str1 = "Hello";
		// Create another String of str2 and assign a value;
		// for example: String str2 = "World";
		
		// Compare the the value of these two variables.
		// == 
		//.equals();
		
		String str1 = "Hello";
		String str2 = "Hello";
		str1 = str1 + "World";
		String str3 = new String("Hello");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		System.out.println(10 == 10);
		
		// In java Strings are Immutable (Not-Changable).	
	}

}
