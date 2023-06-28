package tek.week_1.day_2;

public class HowJavaWorks {
	
	/*
	 * MultiLine commenting. 
	 * How Java Works. 
	 * 1) We have to write code using JDK
	 * JDK -> Java Development KIT
	 * JDK Contains Java Libraries (Classes and Objects)
	 * that helps write program in JAVA. 
	 * 
	 * JRE -> JAVA Runtime Environment 
	 * Container everything required to execute java application. 
	 * 
	 * JVM -> Java Virtual Machine 
	 * JVM execute java code, and translate to computer language
	 * 
	 * Compiler -> Java Compiler will compile java files to class files. 
	 * only class file is executable. 
	 * 
	 * java -> compile to class -> send to JVM -> JVM Translate 
	 * and send to processor. 
	 * 
	 * Java Execution Process. 
	 * 1) Always start from main method. 
	 * 2) Top to bottom -> left to right. line by line. 
	 */
	
	public static void main(String[] args) {
		//println is a method that prints Texts in Console output. 		
		int b = 10 + 20; 
		System.out.println(b);	
		System.out.println("Showing some result");
		System.out.print("This is printing is One line");
		System.out.print("A text in same line");
	}

}
