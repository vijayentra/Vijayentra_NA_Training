
// Java Program to Illustrate Getter and Setter
 
// Helper class
class GetSet {
 
    private String name;
 
//     Method 1 - Getter
    public String getName() 
    { 
    	return name; 
    }
 
//     Method 2 - Setter
    public void setName(String N)
    {
// 		This keyword refers to current instance itself
        this.name = N;
    }
}
 
// Main class
class GetterSetterMethod {
 
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
 
//    	Setting the name by calling setter method
        obj.setName("Geeks for Geeks");
      
//      Getting the name by calling getter method
        System.out.println(obj.getName());
    }
}