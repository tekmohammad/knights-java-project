package tek.week_4.day_1;

public class Practice {
	public static void main(String[] args) {
		
		String grade = "";
		int score = 90;
		
		if ( score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println("You are at grade: " + grade);
	}
}
