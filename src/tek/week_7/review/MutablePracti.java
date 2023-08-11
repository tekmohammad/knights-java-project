package tek.week_7.review;

public class MutablePracti {
	
	public static void main(String[] args) {
		// Mutable means chanagle -> Previous value can be replaced with
		// new value. 
		
		// Mutable -> StringBuffer & StringBuilder
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
//		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 4, "Smith"));
		
	}
}
