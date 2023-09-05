package Day1;

public class Employee {
	 private String firstName;
	    private String lastName;

	    public Employee(String firstName, String lastName) {
	        if (firstName == null || firstName.isBlank()) {
	            throw new EmployeeNameNotValidException("First name cannot be empty");
	        }
	        if (lastName == null || lastName.isBlank()) {
	            throw new EmployeeNameNotValidException("Last name cannot be empty");
	        }

	        this.firstName = firstName;
	        this.lastName = lastName;
	        
	        
	    }

		public static void main(String[] args) {
			 try {
		            Employee employee = new Employee("", "Wick");
		            System.out.println(employee.firstName + " " + employee.lastName);
		            
		            // Creating an employee with a blank last name will throw an exception
		        } catch (EmployeeNameNotValidException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		}
}
