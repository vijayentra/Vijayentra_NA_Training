package Day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {
		    private int employeeId;
		    private String name;

		    public Emp(int employeeId, String name) {
		        this.employeeId = employeeId;
		        this.name = name;
		    }

		    public int getEmployeeId() {
		        return employeeId;
		    }

		    public String getName() {
		        return name;
		    }

		    public void setEmployeeId(int employeeId) {
		        this.employeeId = employeeId;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    @Override
		    public String toString() {
		        return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
		    }

		 public static void main(String[] args) {
		        // Create a list of employees
		        List<Emp> employees = new ArrayList<>();
		        employees.add(new Emp(102, "vijay"));
		        employees.add(new Emp(101, "arun"));
		        employees.add(new Emp(101, "shiv"));

		        // Convert the list to a map with employeeId as the key and employee object as the value
		        Map<Integer, List<String>> employeeMap = employees.stream()
		                .collect(Collectors.groupingBy(Emp::getEmployeeId,
		                        Collectors.mapping(Emp::getName, Collectors.toList())));

		        // Print the resulting map
		        employeeMap.forEach((name, employee) -> System.out.println("Employee name: " + name + ", Employee: " + employee));
		    }
}

