package tek.week_1.day_2;

public class DataTypes {

	// Variables. are the properties that hold values of a specific type.
	/*
	 * Data type define the type of value for each variable. 1) primitive data
	 * types. (defined and reserve types for variable). natural numbers. (negative
	 * and positive. 10 , 20 , 21, - byte -> 1 byte of memory (-127 to 127) - short
	 * -> 2 byte (-32300 to 32000) - int -> 4 byte - long -> 8 byte floating numbers
	 * (negative and positive ) 10.23 , 43.21 - float -> 4 byte - double -> 8 byte -
	 * up to 16 decimal point Only true / false - boolean -> 1 bite of memory a
	 * single character 'a' 'A' - char - 2 byte
	 * 
	 * More info in this link ->
	 * https://mytekschool.sharepoint.com/sites/SDETWiki/SitePages/Java-Data-Types.aspx
	 * 
	 * 2) non-primitive data type.
	 */
	public static void main(String[] args) {
		byte smallNumber = 32;
		short age = 36;

		int distanceToCali = 3200;

		// by default java will assume all numbers are int
		// unless you define with letter 'L'
		long maxAmount = 3_139_999_999L;
		// by default all floating/decimal number deal as double
		// unless you define it with letter 'F'
		float applePrice = 0.99F;
		double price = 19.23;
		
		//Boolean only accept true | false
		boolean isJavaBoring = false;
		
		boolean isJavaHard = false;
		
		boolean isJavaFun = true;
		
		char letterA = 'a';
		char gender = 'F';
		
		char grade = 'A';
		char specialChar = '^';

	}

}
