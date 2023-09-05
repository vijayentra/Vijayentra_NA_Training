package Day1;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		 List<String> companies = new ArrayList<>();
	        companies.add("ACS");
	        companies.add("EPAM");
	        companies.add("ERR");
	        companies.add("TCS");

	        // Reverse the list
	        for (int i = 0; i < companies.size(); i++) {
//	            String original = companies.get(i);
	            String reversed = reverseString(companies.get(i));
	            companies.set(i, reversed);
	        }

	        // Print the reversed list
	        System.out.println(companies);
	}
	        private static String reverseString(String input) {
	            StringBuilder reversed = new StringBuilder();
	            for (int i = input.length() - 1; i >= 0; i--) {
	                reversed.append(input.charAt(i));
	            }
	            return reversed.toString();
	}

}
