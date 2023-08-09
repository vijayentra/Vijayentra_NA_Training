/*Test your application by invoking the service methods from the UserInterface class. 
You are free to write your own code in the main method to invoke the business methods 
to check its correctness. UserInterface class is not taken for evaluation. 
*/

package com.client;
import com.service.FacultyService;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		FacultyService cs = new FacultyService();
		
		Scanner sc=new Scanner(System.in);
		// The below code gets the details of candidates
		// Give input in the format as specified in the problem statement
		System.out.println("Enter the number of faculties");
		int num=sc.nextInt();
		String s[]=new String[num];
		System.out.println("Enter the faculty details");
		sc.nextLine();
		for(int i=0;i<num;i++)
		{
			s[i]=sc.nextLine();
		}
		boolean recordsInserted = cs.addFacultyList(s);
			if (recordsInserted) {
				System.out.println("Read valid faculty records and updated it to the database");
				System.out.println("Enter the department");
				
				String c=sc.nextLine();
				
					int count=cs.retrieveFacultyCount(c);
					
					
					if(count==0){
						System.out.println("No faculties were found in the given department");
					}
					else{
						
							System.out.println("Count of faculties in "+c+" department is "+count);
						 	  	  		    	  	      	      	 	
						
					}
			
			}
			else
				System.out.println("Failed to insert records");

	}
}
