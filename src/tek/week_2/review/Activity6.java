package tek.week_2.review;

public class Activity6 {
	
	public static void main(String[] args) {
		String pagination = "  1100 – 1110 of 88322   ";
		//substring 8322
		//Approach 1
		int indexF = pagination.indexOf('f');	
		String totalCount = pagination.substring(indexF + 2);
		System.out.println(totalCount);
		
		//approach 2
		String trimmedPagination = pagination.trim();
		int indexSpace = trimmedPagination.lastIndexOf(' ');
		String recordCount = trimmedPagination.substring(indexSpace);
		System.out.println(recordCount.trim());
	}

}
