package Day1;
import java.util.*;
public class day_17_7 {

	public static void main(String[] args) {
		//9th table
//		int n;
//		System.out.print("Enter the number to print the table : ");
//		Scanner sc = new Scanner(System.in);
//		n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			System.out.print(i*9 + " ");
//		}
		
		//2nd largest number
//		int a[] = {2,3,5,6,3,3,3,2,3,5,0};
//		int temp=0;
//		for(int x:a) {
//			System.out.print(x);
//		}
//		System.out.println();
//		for(int i=0;i<a.length-1;i++) {
//			for(int j =i+1;j<a.length;j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		for(int y:a) {
//			System.out.print(y);
//		}
//		System.out.println();
//		}
//		
//		System.out.println("Second largest number : " + a[1]);
		
		//occurrence of each letter
//		String str ="Capgemini";
//	        int[] charCount = new int[256]; // Assuming ASCII character set
//
//	        // Count the occurrence of each character
//	        for (char c : str.toCharArray()) {
//	            // Ignore non-alphabetic characters
//	            if (Character.isLetter(c)) {
//	                charCount[c]++;
//	            }
//	        }
//
//	        // Print the occurrence of each character
//	        for (int i = 0; i < charCount.length; i++) {
//	            if (charCount[i] > 0) {
//	                System.out.println("Character '" + (char) i + "' occurs " + charCount[i] + " time(s).");
//	            }
//	        }
		
		//find missing number in the array
		int arr[] = {3,3,20};
		int max=arr[0],count=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int j=1;j<=max;j++) {
			count=0;
			for(int i=0;i<arr.length;i++) {
				if(j==arr[i])
					count++;
			}
			if(count==0)
				System.out.println(j);
		}
			
		}
		
	}
