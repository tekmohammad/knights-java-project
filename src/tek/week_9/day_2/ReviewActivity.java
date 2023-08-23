package tek.week_9.day_2;
import java.util.ArrayList;

public class ReviewActivity {
	
	// Create an ArrayList of String -> colors.
	// Add some values to the arrayList
	// Print the values of the arrayList using it's object name.
	
	// remove a value from the arrayList using it's name.
	
	// print it's values using the enhanced loop.
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Black");
		
		System.out.println(colors);
		
		colors.remove("Black");
		
		for (String color : colors) {
			System.out.println(color);
		}
		
		System.out.println(colors);
	}
}
