package tek.week_2.review;

public class Activity5 {
	public static void main(String[] args) {
		
		String email = "shokriyan@gmail.com";
		//make sure it's a valid email that contains @ 
		//substring the email provider. 
		int atSignIndex = email.indexOf('@');
		System.out.println("Index of @ sign " + atSignIndex);
		
		String provider = email.substring(atSignIndex + 1);
		System.out.println(provider);
	}

}
