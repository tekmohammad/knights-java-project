package tek.week_2.review;

public class Activity1 {
	
	//find area of rectangle with h = 4inch and w 6inch
	//in CM
	public static void main(String[] args) {
		//area = ( (h * 2.54) * (w * 2.54));
		double heightInInch = 4; 
		double widthInInch = 6; 
		double inchToCm = 2.54; 
		
		double heightInCm = heightInInch * inchToCm; 
		double widthInCm = widthInInch * inchToCm; 
		
		double areaInCm = heightInCm * widthInCm; 
		System.out.println("Result in CM " + areaInCm);
	}

}
