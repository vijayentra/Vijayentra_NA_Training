
public class EqualToDemo {
 
   static int a = 10, b=20;    
   int c;   
   // Constructor   
   EqualToDemo()   
   {   
       System.out.println("Addition of 10 and 20 : ");  
       c=a+b;  
       System.out.println("Answer : "+c);          
   }   
    
   // Driver code   
   public static void main(String args[])   
   {   
       System.out.println("1st object created...");  
       EqualToDemo obj1 = new EqualToDemo();    
       System.out.println("2nd object created...");  
       EqualToDemo obj2 = new EqualToDemo();    
       System.out.println("Objects are equal:" + obj1.equals(obj2));   
   }    
}  

// this method returns true if and only if x and y refer to the same object ( x == y has the value true )