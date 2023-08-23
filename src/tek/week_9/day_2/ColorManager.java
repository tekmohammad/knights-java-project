package tek.week_9.day_2;

import java.util.ArrayList;

public class ColorManager {

	ArrayList<String> colors;
	
	public ColorManager() {
		colors = new ArrayList<>();
	}
	
	void addColor(String color) {
		colors.add(color);
	}
	
	void removeColor(String color) {
		colors.remove(color);
	}
	
	void printColors() {
		System.out.println("ArrayList values: ");
//		for (String color : colors) {
//			System.out.println(color);
//		}
		System.out.println(colors.get(0));
	}

}	
