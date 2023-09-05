import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		String str1, str2 = "";
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		if (str1.equals(str2)) {
			System.out.println("palindrome");
		} else
			System.out.println("not a palindrome");
	}

}
