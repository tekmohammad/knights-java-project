package tek.week_4.day_3;

public class WorkingWithStrings {
	public static void main(String[] args) {
		// H
		// e
		// l
		// l
		// o
		// 
		// W
		// o
		// r
		// l
		// d
		// tocharArray();
		
//	System.out.println(message.length()); // length(): will return
											// of your String
	String message = "Hello World";
	char[] characters = message.toCharArray();
	int count = 0;
	char searchCharacter= 'l';
	
		for (char character : characters) {
			if (character == searchCharacter)
				count++;
			System.out.println(character);
		}
		
		System.out.println("We have total of " + count + " characters.");
			
	}
}
