package tek.week_3.day_2;

public class StringEquality {
	
	public static void main(String[] args) {
		
		String city1 = "Alexandria";
		
		String city2 = new String("Alexandria"); 
		
		//This is not recommended to check String equality. 
		//this equality check is checking String objects. 
		boolean isEqual = city1 == city2; 
		
		//equal() is recommended to check the equality of String value.
		boolean usingEqualMethod = city1.equals(city2);
		
		System.out.println(isEqual);
		System.out.println(usingEqualMethod);
		
		String nullString = null; // String is null not instantiated   
		String text = ""; //This is an empty String
		
		//checking if String is an empty String; 
		boolean isTextEmpty = text.isEmpty(); 
		System.out.println(isTextEmpty);
		
		String value = "    "; // this is a Blank String. 
		//Only in Java version 11 or Higher
		boolean isValueBlank = value.isBlank(); 
		System.out.println(isValueBlank);
	}

}
